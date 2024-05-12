package X;

import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.ClickInsertStickerEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicSwitchSetting;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAnchorEnableSettingNew;
import com.bytedance.android.livesdk.livesetting.effect.LiveCohostSameEffectDisplayInbetweenOffset;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BxW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30466BxW implements InterfaceViewOnClickListenerC30227Btf {
    public final Context LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final ArrayList<EnumC30204BtI> LJLJJI;
    public ViewOnLayoutChangeListenerC30474Bxe LJLJJL;
    public DataChannel LJLJJLL;
    public View LJLJL;
    public LiveIconView LJLJLJ;
    public C2A8 LJLJLLL;
    public C1Q4 LJLL;
    public ImageView LJLLI;
    public View LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public boolean LJLLL;
    public final C62822Ol8 LJLLLL;
    public C29888BoC LJLLLLLL;
    public String LJLZ;
    public int LJZ;
    public int LJZI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final Handler LIZIZ() {
        return (Handler) this.LJLLLL.getValue();
    }

    public final InterfaceC31961Ng LIZJ() {
        return (InterfaceC31961Ng) this.LJLLJ.getValue();
    }

    public final boolean LJFF() {
        PaidEvent paidEvent;
        if (!LiveBgMusicSwitchSetting.INSTANCE.getValue()) {
            return false;
        }
        DataChannel dataChannel = this.LJLJJLL;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room != null && (paidEvent = room.paidEvent) != null && paidEvent.paidType == 1) {
                return false;
            }
            DataChannel dataChannel2 = this.LJLJJLL;
            if (dataChannel2 != null) {
                if (!C29306Beo.LJIILLIIL((Boolean) dataChannel2.kv0(ECLiveStatusChangeChannel.class))) {
                    return false;
                }
                DataChannel dataChannel3 = this.LJLJJLL;
                if (dataChannel3 != null) {
                    Room room2 = (Room) dataChannel3.kv0(RoomChannel.class);
                    if (room2 != null && room2.liveSubOnly == 1) {
                        return false;
                    }
                    DataChannel dataChannel4 = this.LJLJJLL;
                    if (dataChannel4 != null) {
                        if (C29306Beo.LJJII(dataChannel4)) {
                            return false;
                        }
                        return true;
                    }
                    o.LJIJI("dataChannel");
                    throw null;
                }
                o.LJIJI("dataChannel");
                throw null;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r0 = com.zhiliaoapp.musically.R.drawable.cnj;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r6 = this;
            boolean r0 = com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment.hasText()
            r4 = 0
            r3 = 0
            if (r0 != 0) goto L20
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = r6.LJLJLJ
            if (r5 != 0) goto L8c
        Lc:
            X.BoC r1 = r6.LJLLLLLL
            if (r1 == 0) goto L20
            boolean r0 = X.C15380j0.LJIILLIIL()
            if (r0 == 0) goto L80
            boolean r0 = com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment.hasText()
            if (r0 == 0) goto L88
        L1c:
            r0 = 0
        L1d:
            r1.setBackgroundResource(r0)
        L20:
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = r6.LJLJLJ
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L35
            android.view.ViewPropertyAnimator r0 = r1.animate()
            if (r0 == 0) goto L2f
            r0.cancel()
        L2f:
            r1.setScaleX(r2)
            r1.setScaleX(r2)
        L35:
            X.UHR.LIZ = r4
            com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerSupportForDifferentScenesSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerSupportForDifferentScenesSetting.INSTANCE
            boolean r0 = r0.isV2()
            if (r0 == 0) goto L52
            X.2A8 r0 = r6.LJLJLLL
            X.C29306Beo.LJJLJLI(r0)
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = r6.LJLJLJ
            if (r1 == 0) goto L52
            r0 = 0
            r1.setTranslationY(r0)
            r1.setScaleX(r2)
            r1.setScaleY(r2)
        L52:
            android.view.View r0 = r6.LJLLILLLL
            X.C29306Beo.LJI(r0)
            android.widget.ImageView r0 = r6.LJLLI
            if (r0 == 0) goto L5e
            r0.setImageDrawable(r3)
        L5e:
            X.1Q4 r0 = r6.LJLL
            if (r0 == 0) goto L74
            r6.LJLLL = r4
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r6.LJLJLJ
            if (r0 == 0) goto L6b
            r0.setImageBitmap(r3)
        L6b:
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = r6.LJLJLJ
            if (r1 == 0) goto L74
            X.1Q4 r0 = r6.LJLL
            r1.setIcon(r0)
        L74:
            android.os.Handler r0 = r6.LIZIZ()
            r0.removeCallbacksAndMessages(r3)
            r0 = 1
            r6.LIZLLL(r0)
            return
        L80:
            com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting r0 = com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting.INSTANCE
            boolean r0 = r0.shouldAddIconBackground()
            if (r0 == 0) goto L1c
        L88:
            r0 = 2131234925(0x7f08106d, float:1.808603E38)
            goto L1d
        L8c:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            if (r2 == 0) goto Laf
            int r0 = r6.LJZ
            r1 = 1103101952(0x41c00000, float:24.0)
            if (r0 <= 0) goto Laa
        L98:
            r2.width = r0
            int r0 = r6.LJZI
            if (r0 <= 0) goto La5
        L9e:
            r2.height = r0
        La0:
            r5.setLayoutParams(r2)
            goto Lc
        La5:
            int r0 = X.C15380j0.LIZ(r1)
            goto L9e
        Laa:
            int r0 = X.C15380j0.LIZ(r1)
            goto L98
        Laf:
            r2 = r3
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30466BxW.LJ():void");
    }

    public final void LIZ(InterfaceC30237Btp interfaceC30237Btp) {
        if (LiveEffectDowngradeSetting.INSTANCE.remove() || HideEffectEntrySetting.INSTANCE.shouldHide()) {
            return;
        }
        DataChannel dataChannel = this.LJLJJLL;
        if (dataChannel != null) {
            dataChannel.ov0(this.LJLILLLLZI, NewInsertStickerEvent.class, new AqS136S0200000_5(this, interfaceC30237Btp, 44));
        } else {
            o.LJIJI("dataChannel");
            throw null;
        }
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            EnumC30410Bwc enumC30410Bwc = EnumC30410Bwc.LIVE_BROADCAST_EHANCE;
            o.LJIIIZ(enumC30410Bwc, "<this>");
            DataChannel LIZJ = C30446BxC.LIZJ(C30446BxC.LIZ);
            if (LIZJ != null) {
                LIZJ.qv0(RedDotStatusChangeEvent.class, new C30450BxG(enumC30410Bwc, C30444BxA.LJFF(enumC30410Bwc)));
                return;
            }
            return;
        }
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.EFFECT;
        DataChannel dataChannel = this.LJLJJLL;
        if (dataChannel != null) {
            enumC30204BtI.setRedDotVisible(dataChannel, false);
        } else {
            o.LJIJI("dataChannel");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LiveEffect liveEffect;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        C30496By0 c30496By0;
        C30496By0 c30496By02;
        C0WZ kZ;
        EnumC08760Wa enumC08760Wa;
        if (C29306Beo.LJJIIJ(this.LJLJL)) {
            C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_EHANCE);
        }
        boolean z = false;
        Boolean bool4 = null;
        if (this.LJLLL) {
            InterfaceC31961Ng LIZJ = LIZJ();
            if (LIZJ != null && (kZ = LIZJ.kZ()) != null) {
                liveEffect = kZ.LIZ;
                if (liveEffect != null) {
                    if (kZ != null) {
                        enumC08760Wa = kZ.LJ;
                    } else {
                        enumC08760Wa = null;
                    }
                    if (enumC08760Wa == EnumC08760Wa.CO_HOST_SAME) {
                        z = true;
                    }
                    liveEffect.isFromOtherUser = z;
                }
            } else {
                liveEffect = null;
            }
            if (UHR.LIZ) {
                return;
            }
            DataChannel dataChannel = this.LJLJJLL;
            if (dataChannel != null) {
                if (liveEffect != null) {
                    bool = Boolean.valueOf(liveEffect.isFromOtherUser);
                } else {
                    bool = null;
                }
                dataChannel.qv0(ClickInsertStickerEvent.class, Boolean.valueOf(C29306Beo.LJIILLIIL(bool)));
                LJ();
                LIZIZ().removeCallbacksAndMessages(null);
                LIZIZ().postDelayed(new ARunnableS41S0100000_5(this, 280), LiveCohostSameEffectDisplayInbetweenOffset.INSTANCE.getValue() * 1000);
                BZI LIZ = C28787BRn.LIZ("pm_live_sticker_click");
                DataChannel dataChannel2 = this.LJLJJLL;
                if (dataChannel2 != null) {
                    LIZ.LJIILLIIL(dataChannel2);
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    LIZ.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
                    LIZ.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
                    LIZ.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
                    LIZ.LJIJJ(1, "is_special_icon");
                    LIZ.LJIJJ(1, "is_animation");
                    InterfaceC31961Ng LIZJ2 = LIZJ();
                    if (LIZJ2 != null) {
                        bool2 = Boolean.valueOf(LIZJ2.Nq0());
                    } else {
                        bool2 = null;
                    }
                    LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(bool2) ? 1 : 0), "is_same_effect_scene");
                    if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                        LIZ.LJIJJ(Long.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()), "pk_id");
                    }
                    if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
                        LIZ.LJIJJ(Long.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).LJJLI()), "channel_id");
                    }
                    LIZ.LJIJJ(this.LJLZ, WM7.SCENE_SERVICE);
                    if (liveEffect != null && (c30496By02 = liveEffect.logParams) != null) {
                        bool3 = Boolean.valueOf(c30496By02.LIZLLL);
                    } else {
                        bool3 = null;
                    }
                    LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(bool3) ? 1 : 0), "is_rec_pin");
                    LIZ.LJJIIJZLJL();
                    BZI LIZ2 = C28787BRn.LIZ("live_take_decoration_click");
                    DataChannel dataChannel3 = this.LJLJJLL;
                    if (dataChannel3 != null) {
                        LIZ2.LJIILLIIL(dataChannel3);
                        LIZ2.LJIJJ(this.LJLZ, WM7.SCENE_SERVICE);
                        LIZ2.LJIJJ(1, "is_special_icon");
                        LIZ2.LJIJJ(1, "is_animation");
                        if (liveEffect != null && (c30496By0 = liveEffect.logParams) != null) {
                            bool4 = Boolean.valueOf(c30496By0.LIZLLL);
                        }
                        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(bool4) ? 1 : 0), "is_rec_pin");
                        LIZ2.LJJIIJZLJL();
                        return;
                    }
                    o.LJIJI("dataChannel");
                    throw null;
                }
                o.LJIJI("dataChannel");
                throw null;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        if (!this.LJLJJI.isEmpty()) {
            if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
                int i = 0;
                do {
                    C20780ri.LIZLLL(R.layout.ddb, this.LJLIL);
                    i++;
                } while (i < 7);
            }
            Context context = this.LJLIL;
            ArrayList<EnumC30204BtI> arrayList = this.LJLJJI;
            DataChannel dataChannel4 = this.LJLJJLL;
            if (dataChannel4 != null) {
                ViewOnLayoutChangeListenerC30474Bxe viewOnLayoutChangeListenerC30474Bxe = new ViewOnLayoutChangeListenerC30474Bxe(context, dataChannel4, arrayList);
                this.LJLJJL = viewOnLayoutChangeListenerC30474Bxe;
                if (C4XM.LIZ()) {
                    C56308M8a.LIZ();
                }
                C46318IFu.LIZ.getClass();
                if (C46318IFu.LIZ()) {
                    try {
                        C56308M8a.LIZIZ();
                        Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(viewOnLayoutChangeListenerC30474Bxe));
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        int i2 = attributes.flags;
                        boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                        C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                        attributes.flags &= -16777217;
                        viewOnLayoutChangeListenerC30474Bxe.showAtLocation(view, 80, 0, 0);
                        C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                        attributes.flags = i2;
                    } catch (Throwable unused) {
                        viewOnLayoutChangeListenerC30474Bxe.showAtLocation(view, 80, 0, 0);
                    }
                } else {
                    viewOnLayoutChangeListenerC30474Bxe.showAtLocation(view, 80, 0, 0);
                }
                viewOnLayoutChangeListenerC30474Bxe.LJLILLLLZI.addOnLayoutChangeListener(viewOnLayoutChangeListenerC30474Bxe);
                if (StickerAnchorEnableSettingNew.INSTANCE.getValue() == 3) {
                    InterfaceC30442Bx8.LLJLLL.LIZ(Boolean.FALSE);
                }
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        BZI LIZ3 = C28787BRn.LIZ("live_take_decoration_click");
        DataChannel dataChannel5 = this.LJLJJLL;
        if (dataChannel5 != null) {
            LIZ3.LJIILLIIL(dataChannel5);
            LIZ3.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), WM7.SCENE_SERVICE);
            LIZ3.LJIJJ(0, "is_special_icon");
            LIZ3.LJIJJ(0, "is_animation");
            LIZ3.LJJIIJZLJL();
            return;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public C30466BxW(Context context, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = context;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = C221108m2.LIZIZ(C30482Bxm.LJLIL);
        this.LJLJJI = new ArrayList<>();
        this.LJLLJ = C221108m2.LIZIZ(C30315Bv5.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C30481Bxl.INSTANCE);
    }

    public static void LJI(InterfaceC30237Btp interfaceC30237Btp, boolean z) {
        C1YG c1yg = new C1YG(interfaceC30237Btp.LJFF());
        c1yg.LIZ(R.string.ou8);
        c1yg.LIZLLL = 48;
        c1yg.LJI = 5000L;
        c1yg.LJII = true;
        c1yg.LJIIL = new C30462BxS(z);
        C30326BvG.LIZJ(new ARunnableS41S0100000_5(new C1YH(c1yg), 278), null, 1000L);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        ViewOnLayoutChangeListenerC30474Bxe viewOnLayoutChangeListenerC30474Bxe = this.LJLJJL;
        if (viewOnLayoutChangeListenerC30474Bxe != null) {
            viewOnLayoutChangeListenerC30474Bxe.dismiss();
        }
        dataChannel.jv0(this);
        LIZIZ().removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
    
        if (X.C29137Bc5.LIZ((com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r6.kv0(X.BCX.class)) == false) goto L38;
     */
    @Override // X.InterfaceViewOnClickListenerC30227Btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(X.InterfaceC30237Btp r10, com.bytedance.ies.sdk.datachannel.DataChannel r11) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30466BxW.i(X.Btp, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
