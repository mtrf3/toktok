package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.ActivityC45651qj;
import X.BU9;
import X.C0WF;
import X.C10A;
import X.C11070c3;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C51029K0z;
import X.C75213TfV;
import X.C75219Tfb;
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
import com.bytedance.android.live.effect.api.MultiGuestClickMoreStickerEvent;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestNewPropsPageFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJLLL = 0;
    public AbsMultiGuestEffectViewModel LJLIL;
    public FrameLayout LJLILLLLZI;
    public int LJLJI;
    public LiveEffect LJLJJI;
    public InterfaceC24140x8 LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC65784Pro<C76800UCe> LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, MultiGuestClickMoreStickerEvent.class, new AqS179S0100000_13(this, 159));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IFilterManager iFilterManager;
        InterfaceC75217TfZ interfaceC75217TfZ;
        ViewGroup viewGroup2;
        InterfaceC21020s6 liveStream;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awt, viewGroup, false);
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LJLIL;
        C29S c29s = null;
        if (absMultiGuestEffectViewModel != null) {
            IEffectService iEffectService = (IEffectService) CN1.LIZ(IEffectService.class);
            FrameLayout frameLayout = this.LJLILLLLZI;
            int i = this.LJLJI;
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
            LiveEffect liveEffect = this.LJLJJI;
            InterfaceC65784Pro interfaceC65784Pro = BU9.LJ;
            if (interfaceC65784Pro == null) {
                interfaceC65784Pro = C75219Tfb.LJLIL;
            }
            View multiGuestStickerListView = iEffectService.getMultiGuestStickerListView(this, frameLayout, i, iFilterManager, gv0, new C11070c3(z, c75213TfV, liveEffect, interfaceC65784Pro, new AqS163S0100000_13(this, 90)));
            if (multiGuestStickerListView != null) {
                if (LLLLIILL instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) LLLLIILL;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    viewGroup2.addView(multiGuestStickerListView, layoutParams);
                }
            }
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
