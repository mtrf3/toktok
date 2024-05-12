package com.bytedance.android.livesdk.game;

import X.AbstractC019505v;
import X.ActivityC45651qj;
import X.BHV;
import X.BI4;
import X.BI5;
import X.BI8;
import X.BZI;
import X.C0K5;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C259710f;
import X.C28787BRn;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C51029K0z;
import X.C62822Ol8;
import X.C73411SrX;
import X.C76800UCe;
import X.C87277YNd;
import X.C90903hW;
import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.IDqS430S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameCategoryListFragment extends BaseFragment {
    public BI8 LJLIL;
    public C73411SrX LJLILLLLZI;
    public GameTag LJLJI;
    public LiveMode LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(BI5.LJLIL);
    public String LJLJL = "";
    public final IDqS430S0100000_5 LJLJLLL = new IDqS430S0100000_5(this, 0);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    public final void vl() {
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.czv);
        boolean z = false;
        if (textView != null) {
            textView.setEnabled(false);
        }
        C0K5 c0k5 = (C0K5) _$_findCachedViewById(R.id.dqa);
        if (c0k5 != null) {
            c0k5.LJFF();
        }
        getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (!z) {
            C0K5 c0k52 = (C0K5) _$_findCachedViewById(R.id.dqa);
            if (c0k52 != null) {
                c0k52.LJI();
                return;
            }
            return;
        }
        this.LJLILLLLZI = BHV.LIZ(C51029K0z.LJIILIIL(this), this, new AqS171S0100000_5(this, 381), new AqS155S0100000_5(this, 210));
    }

    public final String wl() {
        return (String) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BZI LIZ = C28787BRn.LIZ("livesdk_livetake_topic_two_show");
        LIZ.LJIJJ(wl(), "anchor_id");
        LiveMode liveMode = this.LJLJJL;
        if (liveMode != null) {
            LIZ.LJIJJ(liveMode.logStreamingType, "live_type");
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LIZ.LJIILLIIL(LJIILIIL);
        }
        LIZ.LJJIIJZLJL();
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
        FragmentManager fragmentManager;
        List<Fragment> LJJJJLI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 152), view);
        AbstractC019505v abstractC019505v = (AbstractC019505v) view.findViewById(R.id.agw);
        if (abstractC019505v != null) {
            abstractC019505v.setReferencedIds(new int[]{R.id.e11, R.id.e10});
        }
        AbstractC019505v abstractC019505v2 = (AbstractC019505v) view.findViewById(R.id.ah3);
        if (abstractC019505v2 != null) {
            abstractC019505v2.setReferencedIds(new int[]{R.id.g5w, R.id.g3d});
        }
        View findViewById = view.findViewById(R.id.eys);
        if (findViewById != null && (fragmentManager = getFragmentManager()) != null && (LJJJJLI = fragmentManager.LJJJJLI()) != null && Integer.valueOf(LJJJJLI.size()).intValue() > 1) {
            C87277YNd.LJJIJ(findViewById);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 153), findViewById);
        }
        C0K5 c0k5 = (C0K5) _$_findCachedViewById(R.id.dqa);
        if (c0k5 != null) {
            c0k5.setOfflineClickListener(new BI4(this));
        }
        vl();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xl(int r25, java.util.List<com.bytedance.android.livesdk.model.GameTag> r26) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.GameCategoryListFragment.xl(int, java.util.List):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3u, viewGroup, false);
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
