package com.ss.android.ugc.aweme.im.sdk.dmfilter;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C31B;
import X.C31J;
import X.C3C5;
import X.C62814Ol0;
import X.C76800UCe;
import X.C772831o;
import X.C85323Wm;
import X.C90903hW;
import X.NHW;
import X.OSZ;
import X.SQJ;
import X.SQL;
import X.SY4;
import X.XKQ;
import X.XKX;
import Y.ACListenerS32S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DmFilterAddKeywordsBottomSheet extends BaseFragment {
    public static DmFilterAddKeywordsBottomSheet LJLJLJ;
    public final C31J LJLIL;
    public TuxSheet LJLILLLLZI;
    public DmFilterKeywordsViewModel LJLJI;
    public NHW LJLJJI;
    public SY4 LJLJJL;
    public XKQ LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        LJLJLJ = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        XKQ xkq = this.LJLJJLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLJJLL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SQJ(this, null), 3);
    }

    public DmFilterAddKeywordsBottomSheet(C31J c31j) {
        this.LJLIL = c31j;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C31J enterMethod = this.LJLIL;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("show_dm_filtered_keyword_banner", C62814Ol0.LJFF(new OSZ("enter_method", C31B.LIZIZ(enterMethod))));
        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.f0h), new ACListenerS32S0100000_12(this, 63));
        View findViewById = view.findViewById(R.id.cqa);
        NHW nhw = (NHW) findViewById;
        nhw.setAddTagAction(new AqS143S0200000_12(this, nhw, 45));
        nhw.setDeleteTagAction(new AqS178S0100000_12(this, 210));
        nhw.setOnTouchListener(SQL.LJLIL);
        o.LJIIIIZZ(findViewById, "view.findViewById<Editab…e\n            }\n        }");
        this.LJLJJI = (NHW) findViewById;
        View findViewById2 = view.findViewById(R.id.jam);
        C16880lQ.LJJIZ((SY4) findViewById2, new ACListenerS32S0100000_12(this, 64));
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxBut…)\n            }\n        }");
        this.LJLJJL = (SY4) findViewById2;
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        this.LJLJI = (DmFilterKeywordsViewModel) new ViewModelProvider(this).get(DmFilterKeywordsViewModel.class);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b1s, viewGroup, false);
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
