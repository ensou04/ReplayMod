package com.replaymod.gui.versions.forge;

//#if FABRIC<1
//$$ import com.mojang.blaze3d.matrix.MatrixStack;
//$$ import de.johni0702.minecraft.gui.utils.EventRegistrations;
//$$ import de.johni0702.minecraft.gui.versions.callbacks.*;
//$$ import net.minecraft.client.gui.screen.Screen;
//$$ import net.minecraft.client.gui.widget.Widget;
//$$ import net.minecraftforge.client.event.GuiOpenEvent;
//$$ import net.minecraftforge.client.event.GuiScreenEvent;
//$$ import net.minecraftforge.client.event.RenderGameOverlayEvent;
//$$ import net.minecraftforge.event.TickEvent;
//$$ import net.minecraftforge.eventbus.api.EventPriority;
//$$ import net.minecraftforge.eventbus.api.SubscribeEvent;
//$$
//$$ import java.util.List;
//$$
//$$ public class EventsAdapter extends EventRegistrations {
//$$     public static Screen getScreen(GuiScreenEvent event) {
//$$         //#if MC>=10904
//$$         return event.getGui();
//$$         //#else
//$$         //$$ return event.gui;
//$$         //#endif
//$$     }
//$$
//$$     public static List<Widget> getButtonList(GuiScreenEvent.InitGuiEvent event) {
//$$         //#if MC>=10904
//$$         return event.getWidgetList();
//$$         //#else
//$$         //$$ return event.buttonList;
//$$         //#endif
//$$     }
//$$
//$$     @SubscribeEvent
//$$     public void preGuiInit(GuiScreenEvent.InitGuiEvent.Pre event) {
//$$         System.out.println("[Event] preGuiInit");
//$$         InitScreenCallback.Pre.EVENT.invoker().preInitScreen(getScreen(event));
//$$     }
//$$
//$$     @SubscribeEvent
//$$     public void onGuiInit(GuiScreenEvent.InitGuiEvent.Post event) {
//$$         System.out.println("[Event] onGuiInit");
//$$         InitScreenCallback.EVENT.invoker().initScreen(getScreen(event), getButtonList(event));
//$$     }
//$$
//$$     @SubscribeEvent(priority = EventPriority.LOWEST)
//$$     public void onGuiClosed(GuiOpenEvent event) {
//$$         System.out.println("[Event] onGuiClosed");
//$$         OpenGuiScreenCallback.EVENT.invoker().openGuiScreen(
//$$                 //#if MC>=10904
//$$                 event.getGui()
//$$                 //#else
//$$                 //$$ event.gui
//$$                 //#endif
//$$         );
//$$     }
//$$
//$$     public static float getPartialTicks(RenderGameOverlayEvent event) {
//$$         //#if MC>=10904
//$$         return event.getPartialTicks();
//$$         //#else
//$$         //$$ return event.partialTicks;
//$$         //#endif
//$$     }
//$$
//$$     public static float getPartialTicks(GuiScreenEvent.DrawScreenEvent.Post event) {
//$$         //#if MC>=10904
//$$         return event.getRenderPartialTicks();
//$$         //#else
//$$         //$$ return event.renderPartialTicks;
//$$         //#endif
//$$     }
//$$
//$$     @SubscribeEvent
//$$     public void onGuiRender(GuiScreenEvent.DrawScreenEvent.Post event) {
//$$         PostRenderScreenCallback.EVENT.invoker().postRenderScreen(new MatrixStack(), getPartialTicks(event));
//$$     }
//$$
//$$     // Even when event was cancelled cause Lunatrius' InGame-Info-XML mod cancels it and we don't actually care about
//$$     // the event (i.e. the overlay text), just about when it's called.
//$$     @SubscribeEvent(receiveCanceled = true)
//$$     public void renderOverlay(RenderGameOverlayEvent.Text event) {
//$$         RenderHudCallback.EVENT.invoker().renderHud(new MatrixStack(), getPartialTicks(event));
//$$     }
//$$
//$$     @SubscribeEvent
//$$     public void tickOverlay(TickEvent.ClientTickEvent event) {
//$$         if (event.phase == TickEvent.Phase.START) {
//$$             PreTickCallback.EVENT.invoker().preTick();
//$$         }
//$$     }
//$$ }
//#endif