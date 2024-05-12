package com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C1DG;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.GCI;
import X.GH4;
import X.GH5;
import X.InterfaceC36571c5;
import X.InterfaceC65784Pro;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PaPromptProcessFragment extends BaseFragment implements GH5 {
    public static final /* synthetic */ int LJLJJLL = 0;
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 94));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 95));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 93));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // X.GH5
    public final boolean onBackPressed() {
        InterfaceC36571c5 LJJJI = getChildFragmentManager().LJJJI(R.id.j71);
        o.LJII(LJJJI, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.IPaPromptProcessFragment");
        if (((GH4) LJJJI).onBackPressed()) {
            return true;
        }
        getChildFragmentManager().LJJLIIIJJI();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (X.C26338AVi.LIZJ(r0) == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl() {
        /*
            r9 = this;
            androidx.fragment.app.FragmentManager r0 = r9.getChildFragmentManager()
            r8 = 2131374996(0x7f0a3394, float:1.8370127E38)
            androidx.fragment.app.Fragment r0 = r0.LJJJI(r8)
            r2 = 0
            if (r0 == 0) goto Lc2
            java.lang.String r0 = r0.getTag()
        L12:
            java.lang.String r7 = "pa_prompt_privacy_settings"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 != 0) goto L29
            X.Ol8 r0 = r9.LJLJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 < r0) goto L31
        L29:
            X.Pro<X.UCe> r0 = r9.LJLIL
            if (r0 == 0) goto L30
            r0.invoke()
        L30:
            return
        L31:
            androidx.fragment.app.FragmentManager r0 = r9.getChildFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.LJJJI(r8)
            if (r0 == 0) goto L3f
            java.lang.String r2 = r0.getTag()
        L3f:
            java.lang.String r0 = "pa_prompt"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L30
            androidx.fragment.app.FragmentManager r0 = r9.getChildFragmentManager()
            androidx.fragment.app.Fragment r6 = r0.LJJJIL(r7)
            if (r6 != 0) goto L8b
            X.Ol8 r0 = r9.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            X.Ol8 r0 = r9.LJLJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.Ol8 r0 = r9.LJLJJI
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "enterPos"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.PaPromptPrivacySettingsFragment r6 = new com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.PaPromptPrivacySettingsFragment
            r6.<init>()
            java.lang.String r1 = "private_account_prompt"
            java.lang.String r0 = "private_account_prompt_type"
            android.os.Bundle r1 = X.C1DG.LIZLLL(r1, r4, r0, r3)
            java.lang.String r0 = "enter_position"
            r1.putString(r0, r2)
            r6.setArguments(r1)
        L8b:
            androidx.fragment.app.FragmentManager r0 = r9.getChildFragmentManager()
            X.1B3 r5 = X.C1B6.LIZ(r0, r0)
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto Lc0
            boolean r0 = X.C26338AVi.LIZJ(r0)
            r4 = 1
            if (r0 != r4) goto Lc0
        La0:
            r3 = 2130772218(0x7f0100fa, float:1.7147548E38)
            r2 = 2130772209(0x7f0100f1, float:1.714753E38)
            r1 = 2130772216(0x7f0100f8, float:1.7147544E38)
            r0 = 2130772211(0x7f0100f3, float:1.7147534E38)
            if (r4 == 0) goto Lbc
            r5.LJIIJJI(r2, r3, r0, r1)
        Lb1:
            r5.LJIIJ(r6, r7, r8)
            r5.LJ(r7)
            r5.LJI()
            goto L30
        Lbc:
            r5.LJIIJJI(r0, r1, r2, r3)
            goto Lb1
        Lc0:
            r4 = 0
            goto La0
        Lc2:
            r0 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui.PaPromptProcessFragment.vl():void");
    }

    @Override // X.GH5
    public final void N8(AqS161S0100000_11 aqS161S0100000_11) {
        this.LJLIL = aqS161S0100000_11;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GCI.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Fragment LJJJIL = getChildFragmentManager().LJJJIL("pa_prompt");
        if (LJJJIL == null) {
            int intValue = ((Number) this.LJLILLLLZI.getValue()).intValue();
            int intValue2 = ((Number) this.LJLJI.getValue()).intValue();
            String enterPos = (String) this.LJLJJI.getValue();
            o.LJIIIIZZ(enterPos, "enterPos");
            LJJJIL = new PaPromptFragment();
            Bundle LIZLLL = C1DG.LIZLLL("private_account_prompt", intValue, "private_account_prompt_type", intValue2);
            LIZLLL.putString("enter_position", enterPos);
            LJJJIL.setArguments(LIZLLL);
        }
        if (LJJJIL.isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIL(LJJJIL);
            c1b3.LJI();
            return;
        }
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager2, childFragmentManager2);
        LIZ.LJIIIIZZ(R.id.j71, 1, LJJJIL, "pa_prompt");
        LIZ.LJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ah0, viewGroup, false);
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
