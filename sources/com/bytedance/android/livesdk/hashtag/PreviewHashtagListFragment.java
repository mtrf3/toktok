package com.bytedance.android.livesdk.hashtag;

import X.ActivityC45651qj;
import X.BHV;
import X.BI0;
import X.BZI;
import X.C0K5;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C259710f;
import X.C28538BHy;
import X.C28539BHz;
import X.C28787BRn;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C51029K0z;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewHashtagListFragment extends BaseFragment {
    public Hashtag LJLIL;
    public Hashtag LJLILLLLZI;
    public LiveMode LJLJJI;
    public String LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(BI0.LJLIL);
    public final AqS171S0100000_5 LJLJJLL = new AqS171S0100000_5(this, 388);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final void onVisible() {
        super.onVisible();
        BZI LIZ = C28787BRn.LIZ("livesdk_livetake_topic_one_show");
        LIZ.LJIJJ(this.LJLJI.getValue(), "anchor_id");
        String str = this.LJLJJL;
        if (str != null) {
            LIZ.LJIJJ(str, "enter_from");
        }
        LiveMode liveMode = this.LJLJJI;
        if (liveMode != null) {
            LIZ.LJIJJ(liveMode.logStreamingType, "live_type");
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LIZ.LJIILLIIL(LJIILIIL);
        }
        LIZ.LJJIIJZLJL();
    }

    public final void vl() {
        C0K5 c0k5 = (C0K5) _$_findCachedViewById(R.id.e31);
        if (c0k5 != null) {
            c0k5.LJFF();
        }
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            BHV.LIZ(C51029K0z.LJIILIIL(this), this, new AqS171S0100000_5(this, 387), new AqS155S0100000_5(this, 215));
            return;
        }
        C0K5 c0k52 = (C0K5) _$_findCachedViewById(R.id.e31);
        if (c0k52 != null) {
            c0k52.LJI();
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final int getThemeOverlay(Context context) {
        return C259710f.LIZ.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        vl();
        C0K5 c0k5 = (C0K5) _$_findCachedViewById(R.id.e31);
        if (c0k5 != null) {
            c0k5.setErrorClickListener(new C28538BHy(this));
        }
        C0K5 c0k52 = (C0K5) _$_findCachedViewById(R.id.e31);
        if (c0k52 != null) {
            c0k52.setOfflineClickListener(new C28539BHz(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d4a, viewGroup, false);
        C29S c29s = null;
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
