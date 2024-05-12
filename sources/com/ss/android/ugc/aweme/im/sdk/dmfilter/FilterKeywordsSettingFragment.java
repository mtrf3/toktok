package com.ss.android.ugc.aweme.im.sdk.dmfilter;

import X.ARV;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C252709vu;
import X.C29S;
import X.C31J;
import X.C3C5;
import X.C41239GGl;
import X.C53332KwS;
import X.C61712OJw;
import X.C61713OJx;
import X.C62814Ol0;
import X.C76800UCe;
import X.C772831o;
import X.C79045V0n;
import X.C85323Wm;
import X.C90903hW;
import X.C98503tm;
import X.C9KF;
import X.EF7;
import X.InterfaceC61213O0r;
import X.NHW;
import X.OSZ;
import X.SQF;
import X.SQG;
import X.SQH;
import X.SQI;
import X.XKQ;
import X.XKX;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public final class FilterKeywordsSettingFragment extends BaseFragment {
    public DmFilterKeywordsSettingViewModel LJLIL;
    public NHW LJLILLLLZI;
    public ARV LJLJI;
    public boolean LJLJJI;
    public XKQ LJLJJL;
    public XKQ LJLJJLL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C31J LJLJL = C31J.SETTING_PAGE;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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
        DmFilterKeywordsSettingViewModel dmFilterKeywordsSettingViewModel = this.LJLIL;
        if (dmFilterKeywordsSettingViewModel != null) {
            if (DmFilterKeywordsSettingViewModel.kv0() != dmFilterKeywordsSettingViewModel.LJLJJL) {
                C98503tm.LIZ.LJIIIZ();
            }
            DmFilterKeywordsSettingViewModel dmFilterKeywordsSettingViewModel2 = this.LJLIL;
            if (dmFilterKeywordsSettingViewModel2 != null) {
                dmFilterKeywordsSettingViewModel2.jv0(this.LJLJL);
                super.onDetach();
                return;
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        XKQ xkq = this.LJLJJL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        XKQ xkq2 = this.LJLJJLL;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLJJL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SQH(this, null), 3);
        this.LJLJJLL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SQG(this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        Intent intent;
        Bundle LLJJIJI;
        Intent intent2;
        super.onCreate(bundle);
        fragmentConfiguration(C41239GGl.LJLIL);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent2 = mo49getActivity.getIntent()) != null) {
            intent2.putExtra("activity_translation_type", 0);
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 == null || (intent = mo49getActivity2.getIntent()) == null || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null || (obj = C16880lQ.LLJJIII(LLJJIJI, "is_disabled")) == null) {
            obj = Boolean.FALSE;
        }
        this.LJLJJI = ((Boolean) obj).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            int intValue = LJI.intValue();
            view.setBackgroundColor(intValue);
            C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
            LIZIZ.LJFF(intValue);
            LIZIZ.LIZJ();
        }
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 621));
        c252709vu.LIZJ(LIZJ);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.eu0);
        o.LJIIIIZZ(string, "getString(R.string.dm_settings_filteredkw_header)");
        c9kf.LIZJ = string;
        c252709vu.LJIILLIIL(c9kf);
        c252709vu.LJIILJJIL(false);
        c252709vu.setNavBackground(0);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.m4a);
        if (tuxTextView != null) {
            if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxTextView.setVisibility(i2);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS32S0100000_12(this, 65));
        }
        View findViewById = view.findViewById(R.id.l0s);
        NHW nhw = (NHW) findViewById;
        if (this.LJLJJI) {
            nhw.LJJLL();
        } else {
            nhw.setDeleteTagAction(new AqS178S0100000_12(this, 211));
            nhw.setAddTagAction(new AqS143S0200000_12(this, nhw, 46));
        }
        nhw.setOnTouchListener(SQI.LJLIL);
        o.LJIIIIZZ(findViewById, "view.findViewById<Editab…e\n            }\n        }");
        this.LJLILLLLZI = (NHW) findViewById;
        View findViewById2 = view.findViewById(R.id.kxf);
        ARV arv = (ARV) findViewById2;
        arv.setOnCheckedChangeListener(new SQF(arv, this));
        if (C53332KwS.LIZ()) {
            arv.setEnabled(!this.LJLJJI);
        }
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxSwi…d\n            }\n        }");
        this.LJLJI = (ARV) findViewById2;
        View findViewById3 = view.findViewById(R.id.m6p);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById3;
        boolean LIZ = C53332KwS.LIZ();
        int i3 = R.attr.gp;
        if (LIZ && this.LJLJJI) {
            i = R.attr.gp;
        } else {
            i = R.attr.go;
        }
        tuxTextView2.setTextColorRes(i);
        o.LJIIIIZZ(findViewById3, "view.findViewById<TuxTex…tr.TextPrimary)\n        }");
        View findViewById4 = view.findViewById(R.id.m6q);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById4;
        if (!C53332KwS.LIZ() || !this.LJLJJI) {
            i3 = R.attr.gx;
        }
        tuxTextView3.setTextColorRes(i3);
        o.LJIIIIZZ(findViewById4, "view.findViewById<TuxTex…extTertiaryAlt)\n        }");
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("enter_filtered_keywords_setting", C62814Ol0.LJFF(new OSZ("enter_from", "privacy_and_safety_settings")));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        this.LJLIL = (DmFilterKeywordsSettingViewModel) new ViewModelProvider(this).get(DmFilterKeywordsSettingViewModel.class);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b78, viewGroup, false);
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
