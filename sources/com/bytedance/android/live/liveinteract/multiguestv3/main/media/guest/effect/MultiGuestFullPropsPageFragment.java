package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.ActivityC45651qj;
import X.BU9;
import X.C03880Dg;
import X.C0WF;
import X.C10A;
import X.C11060c2;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C51029K0z;
import X.C65300Pk0;
import X.C75213TfV;
import X.C75218Tfa;
import X.C75422Tis;
import X.C76800UCe;
import X.C90903hW;
import X.CN1;
import X.InterfaceC21020s6;
import X.InterfaceC24140x8;
import X.InterfaceC65784Pro;
import X.InterfaceC75217TfZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.MultiGuestStickerFullPanelHiddenStateChangedEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestFullPropsPageFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJLJ = 0;
    public FrameLayout LJLIL;
    public C75422Tis LJLILLLLZI;
    public AbsMultiGuestEffectViewModel LJLJI;
    public int LJLJJI;
    public InterfaceC24140x8 LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-7713869677247928476");
        if (c03880Dg.LIZJ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/media/guest/effect/MultiGuestFullPropsPageFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/media/guest/effect/MultiGuestFullPropsPageFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.qv0(MultiGuestStickerFullPanelHiddenStateChangedEvent.class, Boolean.valueOf(z));
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/media/guest/effect/MultiGuestFullPropsPageFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IFilterManager iFilterManager;
        InterfaceC75217TfZ interfaceC75217TfZ;
        InterfaceC21020s6 liveStream;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aws, viewGroup, false);
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LJLJI;
        C29S c29s = null;
        if (absMultiGuestEffectViewModel != null) {
            IEffectService iEffectService = (IEffectService) CN1.LIZ(IEffectService.class);
            FrameLayout frameLayout = this.LJLIL;
            int i = this.LJLJJI;
            InterfaceC24140x8 interfaceC24140x8 = absMultiGuestEffectViewModel.LJLJJI;
            if (interfaceC24140x8 != null && (liveStream = interfaceC24140x8.getLiveStream()) != null) {
                iFilterManager = liveStream.getVideoFilterMgr();
            } else {
                iFilterManager = null;
            }
            C0WF gv0 = absMultiGuestEffectViewModel.gv0();
            boolean z = this.LJLJJLL;
            InterfaceC24140x8 interfaceC24140x82 = this.LJLJJL;
            if (interfaceC24140x82 != null) {
                interfaceC75217TfZ = interfaceC24140x82.getEffectWrapperProxy();
            } else {
                interfaceC75217TfZ = null;
            }
            C75213TfV c75213TfV = new C75213TfV(interfaceC75217TfZ);
            o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) LLLLIILL;
            InterfaceC65784Pro interfaceC65784Pro = BU9.LJ;
            if (interfaceC65784Pro == null) {
                interfaceC65784Pro = C75218Tfa.LJLIL;
            }
            iEffectService.getMultiGuestFullStickerListView(this, frameLayout, i, iFilterManager, gv0, new C11060c2(z, c75213TfV, viewGroup2, interfaceC65784Pro, new AqS160S0200000_13(this, absMultiGuestEffectViewModel, 7)));
        }
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
