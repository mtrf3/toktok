package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor;

import X.BPM;
import X.C213178Yf;
import X.C29044Baa;
import X.C29108Bbc;
import X.C29494Bhq;
import X.C30868C9o;
import X.C31012CFc;
import X.C56412MCa;
import X.C59994Ngc;
import X.C73969T1h;
import X.C74716TUa;
import X.C74979Tbj;
import X.C74987Tbr;
import X.C75165Tej;
import X.C75236Tfs;
import X.C75237Tft;
import X.C75283Tgd;
import X.C75284Tge;
import X.C75286Tgg;
import X.C75559Tl5;
import X.C76800UCe;
import X.C78886Uxe;
import X.C86793Y4n;
import X.C8E;
import X.CN1;
import X.EnumC74778TWk;
import X.EnumC74991Tbv;
import X.InterfaceC65784Pro;
import X.InterfaceC74695TTf;
import X.InterfaceC75441TjB;
import X.InterfaceC88472Yns;
import X.T16;
import X.TBW;
import X.TRJ;
import X.TRK;
import X.TTL;
import X.U8H;
import X.UC0;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import Y.AfS2S0300100_13;
import Y.AfS8S0100100_13;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class MultiGuestSharedBgAnchorViewModel extends AssemViewModel<C75236Tfs> {
    public static final /* synthetic */ int LJLL = 0;
    public DataChannel LJLIL;
    public LiveEffect LJLILLLLZI;
    public C75286Tgg LJLJI;
    public final TRJ LJLJJI = new TRJ(this);
    public final C75165Tej LJLJJL = new C75165Tej(this);
    public final C75284Tge LJLJJLL = new C75284Tge(this);
    public final ACListenerS33S0100000_13 LJLJL = new ACListenerS33S0100000_13(this, 40);
    public final C75237Tft LJLJLJ = new C75237Tft(this);
    public LiveDialogFragment LJLJLLL;

    public static boolean hv0() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        Integer valueOf;
        MultiGuestDataHolder LIZ = TRK.LIZ();
        if (LIZ == null || (multiLiveAnchorPanelSettings = LIZ.LJIIJ) == null || (valueOf = Integer.valueOf(multiLiveAnchorPanelSettings.layoutType)) == null || valueOf.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C75236Tfs defaultState() {
        boolean z;
        boolean hv0 = hv0();
        if (C75283Tgd.LIZJ(true) && hv0) {
            z = true;
        } else {
            z = false;
        }
        return new C75236Tfs(z, null, "", C75283Tgd.LIZLLL(), null, false);
    }

    public static void mv0(EnumC74991Tbv enumC74991Tbv) {
        U8H LJJZZI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.LJJLIIIJJI(enumC74991Tbv.getBusinessType(), false);
        }
        if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
            C74979Tbj c74979Tbj = C74979Tbj.LIZ;
            C74979Tbj.LJIIL = "share_background";
            C74979Tbj.LJIILIIL = "share_background";
            c74979Tbj.LJFF(enumC74991Tbv, false);
        }
    }

    public final boolean gv0(boolean z) {
        boolean z2;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
            z2 = LLIIJLIL.LJIILIIL();
        } else {
            z2 = false;
        }
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isSharedBgEnable rtcEngineOn=");
        LIZ.append(z2);
        LIZ.append(" layoutType=");
        LIZ.append(LIZJ);
        C74987Tbr.LIZ("anchor_shared_bg", X1D.LIZIZ(LIZ));
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("ZOOM_SERVICE");
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService");
        ZoomService zoomService = (ZoomService) obj;
        if (LIZJ == EnumC74778TWk.GRID) {
            if (!z || !z2) {
                return false;
            }
            if (!zoomService.LIZJ() && LJJJJZI <= 0) {
                return false;
            }
            return true;
        }
        if (!z || !z2 || !C75283Tgd.LJ()) {
            return false;
        }
        return true;
    }

    public final void kv0(Context context, DataChannel dataChannel) {
        MultiGuestDataHolder LIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        EnumC74991Tbv LJJ;
        FragmentManager fragmentManager;
        C74987Tbr.LIZJ("anchor_shared_bg", "showSelectSharedBgDialog");
        LiveDialogFragment liveDialogFragment = this.LJLJLLL;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
        this.LJLJLLL = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveBgDialogFragment(context, dataChannel, "multi", this.LJLJJLL, null, this.LJLJL, this.LJLJLJ, getState().LJLJJI);
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            C74987Tbr.LIZJ("anchor_shared_bg", "show select dialog");
            LiveDialogFragment liveDialogFragment2 = this.LJLJLLL;
            if (liveDialogFragment2 != null) {
                liveDialogFragment2.show(fragmentManager, "link_select_shared_bg_dialog");
            }
        }
        boolean z = !TextUtils.isEmpty(getState().LJLJJI);
        if (!C75283Tgd.LJ() && z && (LIZ = TRK.LIZ()) != null && (multiLiveAnchorPanelSettings = LIZ.LJIIJ) != null && (LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings)) != null) {
            C74987Tbr.LIZJ("anchor_shared_bg", "show select dialog, auto switch to grid layout");
            mv0(LJJ);
        }
        if (!gv0(z) && z) {
            C74987Tbr.LIZJ("anchor_shared_bg", "show select dialog, show current invalid toast");
            lv0(R.string.n89, "pm_mt_multiWallpaper_liveScreen_finishedState_toast");
        }
    }

    public final void lv0(int i, String str) {
        BPM bpm = new BPM();
        bpm.LIZJ = i;
        bpm.LIZLLL = true;
        bpm.LJFF = this.LJLIL;
        bpm.LIZIZ = str;
        C30868C9o.LJII(bpm);
    }

    public final void iv0(LiveEffect liveEffect, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        String str;
        Long valueOf;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applySelectedSharedBg stickerId=");
        String str2 = null;
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI = liveEffect;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null || (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) != null) {
            valueOf = Long.valueOf(room.getId());
        } else {
            valueOf = null;
        }
        long LJJJLIIL = C78886Uxe.LJJJLIIL(C8E.LJ());
        if (valueOf == null) {
            return;
        }
        long LIZIZ = C31012CFc.LIZIZ();
        MultiLiveApi multiLiveApi = (MultiLiveApi) TTL.LIZ(MultiLiveApi.class, "get().getService(MultiLiveApi::class.java)");
        long longValue = valueOf.longValue();
        if (liveEffect != null) {
            str2 = liveEffect.getResourceId();
        }
        String LIZ2 = C75283Tgd.LIZ(str2);
        MultiGuestDataHolder LIZ3 = TRK.LIZ();
        if (LIZ3 != null && (multiLiveAnchorPanelSettings = LIZ3.LJIIJ) != null) {
            i = multiLiveAnchorPanelSettings.applierSortSetting;
        } else {
            i = 0;
        }
        C74716TUa.LIZIZ(multiLiveApi, longValue, LJJJLIIL, -1L, -1, -1, -1, -1, null, LIZ2, 1, i, 0L, 2048).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS2S0300100_13(LIZIZ, liveEffect, this, interfaceC65784Pro, 2), new AfS8S0100100_13(LIZIZ, interfaceC65784Pro2, 4));
    }

    public final <A> void jv0(TBW<C75236Tfs, ? extends A> prop1, C56412MCa<C213178Yf<A>> c56412MCa, LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super A, C76800UCe> interfaceC88472Yns) {
        C56412MCa<C213178Yf<A>> c56412MCa2 = c56412MCa;
        o.LJIIIZ(prop1, "prop1");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select state Subscribe [");
        LIZ.append(prop1);
        LIZ.append("] ");
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "StateSubscriber");
        if (c56412MCa2 == null) {
            c56412MCa2 = new C56412MCa<>();
            c56412MCa2.LIZIZ(true);
        }
        AssemViewModel.selectSubscribe$default(this, prop1, c56412MCa2, lifecycleOwner, null, interfaceC88472Yns, 8, null);
    }
}
