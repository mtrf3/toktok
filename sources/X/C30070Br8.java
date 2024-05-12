package X;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.room.GlobalMultiLiveSettingChangeEvent;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Br8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30070Br8 implements InterfaceC32212Cka {
    public final /* synthetic */ InterfaceC30069Br7 LIZ;
    public final /* synthetic */ VideoBroadcastInteractionFragment LIZIZ;

    @Override // X.InterfaceC32212Cka
    public final void LIZ(LiveWidget liveWidget) {
        LayeredWidgetManager layeredWidgetManager = this.LIZIZ.LJZI;
        if (layeredWidgetManager != null) {
            layeredWidgetManager.unload(liveWidget);
        } else {
            o.LJIJI("mWidgetManager");
            throw null;
        }
    }

    public C30070Br8(InterfaceC30069Br7 interfaceC30069Br7, VideoBroadcastInteractionFragment videoBroadcastInteractionFragment) {
        this.LIZ = interfaceC30069Br7;
        this.LIZIZ = videoBroadcastInteractionFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.Tjv] */
    @Override // X.InterfaceC32212Cka
    public final InterfaceC75487Tjv LIZIZ(int i, boolean z) {
        Widget LIZIZ;
        IInteractService iInteractService;
        boolean z2 = true;
        Boolean bool = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    return null;
                                }
                                InterfaceC30069Br7 interfaceC30069Br7 = this.LIZ;
                                FrameLayout interact_anchor_container = (FrameLayout) this.LIZIZ._$_findCachedViewById(R.id.epk);
                                o.LJIIIIZZ(interact_anchor_container, "interact_anchor_container");
                                LIZIZ = interfaceC30069Br7.LJII(interact_anchor_container);
                                LayeredWidgetManager layeredWidgetManager = this.LIZIZ.LJZI;
                                if (layeredWidgetManager != null) {
                                    o.LJII(LIZIZ, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveWidget");
                                    layeredWidgetManager.load(R.id.h3c, LIZIZ, false);
                                } else {
                                    o.LJIJI("mWidgetManager");
                                    throw null;
                                }
                            } else {
                                InterfaceC30069Br7 interfaceC30069Br72 = this.LIZ;
                                FrameLayout multi_guest_interact_anchor_container = (FrameLayout) this.LIZIZ._$_findCachedViewById(R.id.gp6);
                                o.LJIIIIZZ(multi_guest_interact_anchor_container, "multi_guest_interact_anchor_container");
                                LIZIZ = interfaceC30069Br72.LIZJ(multi_guest_interact_anchor_container);
                                LayeredWidgetManager layeredWidgetManager2 = this.LIZIZ.LJZI;
                                if (layeredWidgetManager2 != null) {
                                    o.LJII(LIZIZ, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveWidget");
                                    layeredWidgetManager2.load(R.id.h3c, LIZIZ, false);
                                } else {
                                    o.LJIJI("mWidgetManager");
                                    throw null;
                                }
                            }
                        } else {
                            InterfaceC30069Br7 interfaceC30069Br73 = this.LIZ;
                            this.LIZIZ._$_findCachedViewById(R.id.epk);
                            LIZIZ = interfaceC30069Br73.LIZ(z);
                            LayeredWidgetManager layeredWidgetManager3 = this.LIZIZ.LJZI;
                            if (layeredWidgetManager3 != null) {
                                o.LJII(LIZIZ, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveWidget");
                                layeredWidgetManager3.load(R.id.hql, LIZIZ, false);
                            } else {
                                o.LJIJI("mWidgetManager");
                                throw null;
                            }
                        }
                    } else {
                        LIZIZ = this.LIZ.LJIIJ();
                        LayeredWidgetManager layeredWidgetManager4 = this.LIZIZ.LJZI;
                        if (layeredWidgetManager4 != null) {
                            o.LJII(LIZIZ, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveWidget");
                            layeredWidgetManager4.load(R.id.a1r, LIZIZ, false);
                        } else {
                            o.LJIJI("mWidgetManager");
                            throw null;
                        }
                    }
                } else {
                    InterfaceC30069Br7 interfaceC30069Br74 = this.LIZ;
                    this.LIZIZ._$_findCachedViewById(R.id.epk);
                    interfaceC30069Br74.LJ();
                    if (this.LIZIZ.LJZI != null) {
                        o.LJII(null, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveWidget");
                        throw null;
                    }
                    o.LJIJI("mWidgetManager");
                    throw null;
                }
            } else {
                InterfaceC30069Br7 interfaceC30069Br75 = this.LIZ;
                FrameLayout interact_anchor_container2 = (FrameLayout) this.LIZIZ._$_findCachedViewById(R.id.epk);
                o.LJIIIIZZ(interact_anchor_container2, "interact_anchor_container");
                LIZIZ = interfaceC30069Br75.LJIIIIZZ(interact_anchor_container2);
                LayeredWidgetManager layeredWidgetManager5 = this.LIZIZ.LJZI;
                if (layeredWidgetManager5 != null) {
                    o.LJII(LIZIZ, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveWidget");
                    layeredWidgetManager5.load(R.id.h3c, LIZIZ, false);
                } else {
                    o.LJIJI("mWidgetManager");
                    throw null;
                }
            }
        } else {
            InterfaceC30069Br7 interfaceC30069Br76 = this.LIZ;
            FrameLayout multi_guest_interact_anchor_container2 = (FrameLayout) this.LIZIZ._$_findCachedViewById(R.id.gp6);
            o.LJIIIIZZ(multi_guest_interact_anchor_container2, "multi_guest_interact_anchor_container");
            LIZIZ = interfaceC30069Br76.LIZIZ(multi_guest_interact_anchor_container2);
            VideoBroadcastInteractionFragment videoBroadcastInteractionFragment = this.LIZIZ;
            LayeredWidgetManager layeredWidgetManager6 = videoBroadcastInteractionFragment.LJZI;
            if (layeredWidgetManager6 != null) {
                o.LJII(LIZIZ, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveWidget");
                layeredWidgetManager6.load(R.id.h3c, LIZIZ, false);
                Bundle arguments = videoBroadcastInteractionFragment.getArguments();
                if (arguments != null) {
                    bool = Boolean.valueOf(arguments.getBoolean("is_one_tap_go_live", false));
                }
                if (o.LJ(bool, Boolean.TRUE) || ((iInteractService = (IInteractService) CN1.LIZ(IInteractService.class)) != null && iInteractService.LLLLZLLIL())) {
                    if (C74838TYs.LJ().LJJI != null) {
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C74838TYs.LJ().LJJI;
                        IInteractService iInteractService2 = (IInteractService) CN1.LIZ(IInteractService.class);
                        if (iInteractService2 == null || !iInteractService2.LLLLZLLIL()) {
                            z2 = false;
                        }
                        dataChannelGlobal.sv0(GlobalMultiLiveSettingChangeEvent.class, new OSZ(multiLiveAnchorPanelSettings, Boolean.valueOf(z2)));
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("try to switch layout with ");
                    LIZ.append(C74838TYs.LJ().LJJI);
                    C0NB.LJIIIZ("MultiLiveAuto", X1D.LIZIZ(LIZ));
                }
            } else {
                o.LJIJI("mWidgetManager");
                throw null;
            }
        }
        return LIZIZ;
    }
}
