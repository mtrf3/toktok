package com.ss.android.ugc.aweme.qna.fragment;

import X.AR6;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C118974lh;
import X.C119074lr;
import X.C119124lw;
import X.C119144ly;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26224AQy;
import X.C29S;
import X.C33381Ss;
import X.C3C5;
import X.C41241GGn;
import X.C61712OJw;
import X.C61713OJx;
import X.C65429Pm5;
import X.C71799SFv;
import X.C76800UCe;
import X.C81066Vri;
import X.C90903hW;
import X.C9KF;
import X.CK3;
import X.EnumC118964lg;
import X.FMX;
import X.HG3;
import X.InterfaceC61213O0r;
import X.InterfaceC81070Vrm;
import X.JBR;
import X.OJD;
import X.RBX;
import Y.AObserverS69S0100000_1;
import Y.AObserverS82S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskWithCategoriesFragment;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class QnaAskWithCategoriesFragment extends QnaAskQuestionFragment {
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C118974lh LJLJLLL = new InterfaceC81070Vrm() { // from class: X.4lh
        @Override // X.InterfaceC81070Vrm
        public final void LIZIZ() {
            QnaAskWithCategoriesFragment.this.Al().gv0(null);
        }

        @Override // X.InterfaceC81070Vrm
        public final void LIZ(String str) {
            QnaCreationViewModel Al = QnaAskWithCategoriesFragment.this.Al();
            Al.getClass();
            String str2 = Al.LJLL.get(str);
            if (str2 != null) {
                Al.LJLLI.add(str2);
            }
        }

        @Override // X.InterfaceC81070Vrm
        public final void LIZJ(String str) {
            QnaAskWithCategoriesFragment.this.Al().gv0(str);
        }
    };

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment
    public final String Dl() {
        String str = Al().LJLJI;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment
    public final void Gl() {
        super.Gl();
        C71799SFv answer_tab_avatar_iv = (C71799SFv) _$_findCachedViewById(R.id.a67);
        o.LJIIIIZZ(answer_tab_avatar_iv, "answer_tab_avatar_iv");
        String avatarUrl = ((RBX) HG3.LJIILL()).getAvatarUrl();
        o.LJIIIIZZ(avatarUrl, "userService().avatarUrl");
        C71799SFv.LJIIJ(answer_tab_avatar_iv, avatarUrl, null, false, null, 126);
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment
    public final void Kl() {
        super.Kl();
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.c9, requireActivity);
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LJ(R.attr.c9);
        LIZIZ.LIZJ();
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.a8z);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 696));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getString(R.string.pnj);
        o.LJIIIIZZ(string, "getString(R.string.qa_text_halfscreen_title)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_question_mark_circle_ltr;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS151S0100000_1(this, 697));
        c235119Kp.LIZIZ(LIZJ2);
        c235119Kp.LIZLLL = false;
        c235119Kp.LIZJ(LJIIIIZZ);
        c252709vu.setNavActions(c235119Kp);
    }

    public final void Pl(String str) {
        Context context = getContext();
        if (context != null) {
            C26224AQy c26224AQy = new C26224AQy();
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.b9x;
            c26224AQy.LIZ = c33381Ss.LIZ(context);
            String string = context.getString(R.string.pm9);
            o.LJIIIIZZ(string, "it.getString(R.string.qa_ask_topic_drawer_header)");
            c26224AQy.LJ = string;
            c26224AQy.LIZLLL = 1;
            String string2 = context.getString(R.string.pma);
            o.LJIIIIZZ(string2, "it.getString(R.string.qa_ask_topic_drawer_post)");
            String string3 = context.getString(R.string.pm_);
            o.LJIIIIZZ(string3, "it.getString(R.string.qa_ask_topic_drawer_invite)");
            String string4 = context.getString(R.string.pmb);
            o.LJIIIIZZ(string4, "it.getString(R.string.qa_ask_topic_drawer_tag)");
            c26224AQy.LIZLLL(new AR6(R.raw.icon_globe, null, string2), new AR6(R.raw.icon_person_plus, null, string3), new AR6(R.raw.icon_bubble_left_right, null, string4));
            c26224AQy.LJIILIIL = true;
            String string5 = context.getString(R.string.pm8);
            C119074lr c119074lr = C119074lr.LJLIL;
            c26224AQy.LJII = string5;
            c26224AQy.LJIIIZ = c119074lr;
            TuxSheet tuxSheet = c26224AQy.LIZ().LIZ;
            FragmentManager requireFragmentManager = requireFragmentManager();
            o.LJIIIIZZ(requireFragmentManager, "requireFragmentManager()");
            tuxSheet.show(requireFragmentManager, "bottom_sheet_intro");
            QnaCreationViewModel Al = Al();
            Al.getClass();
            C65429Pm5.LJ("qna_bottom_sheet_intro_has_been_shown|", ((RBX) HG3.LJIILL()).getCurUserId(), C119124lw.LIZ, true);
            FMX.LJIIL("qa_discovery_page_show", JBR.LJIIIIZZ("enter_from", Al.getEnterFrom(), "enter_method", str).LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41241GGn.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment
    public final void vl(String currentText) {
        EnumC118964lg enumC118964lg;
        o.LJIIIZ(currentText, "currentText");
        super.vl(currentText);
        QnaCreationViewModel Al = Al();
        Al.getClass();
        Al.LJLJJLL = currentText;
        Al.hv0();
        if (!Al.iv0()) {
            return;
        }
        if (Al.LJLJJLL.length() == 0 || !((OJD) QnaCreationViewModel.LL.getValue()).containsMatchIn(Al.LJLJJLL)) {
            enumC118964lg = EnumC118964lg.QA_ASK_TOPIC_STATIC_HINT_VISIBILITY;
        } else if (!((OJD) QnaCreationViewModel.LJZI.getValue()).matches(Al.LJLJJLL)) {
            enumC118964lg = EnumC118964lg.QA_ASK_TOPIC_START_HINT;
        } else if (!((OJD) QnaCreationViewModel.LJZL.getValue()).matches(Al.LJLJJLL)) {
            enumC118964lg = EnumC118964lg.QA_ASK_TOPIC_END_HINT;
        } else {
            enumC118964lg = EnumC118964lg.QA_ASK_TOPIC_STATIC_HINT_DISCOVER;
        }
        if (enumC118964lg == Al.LJLLILLLL.getValue()) {
            return;
        }
        Al.LJLLILLLL.setValue(enumC118964lg);
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        QnaCreationViewModel Al = Al();
        String enterFrom = xl().getEnterFrom();
        String str = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        Al.getClass();
        Al.LJLJJI = enterFrom;
        QnaCreationViewModel Al2 = Al();
        String enterMethod = xl().getEnterMethod();
        if (enterMethod != null) {
            str = enterMethod;
        }
        Al2.getClass();
        Al2.LJLJJL = str;
        Gl();
        Al().LJLJLLL.observe(getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 11));
        Al().LJLLJ.observe(getViewLifecycleOwner(), new AObserverS82S0100000_14(this, 1));
        QnaCreationViewModel Al3 = Al();
        Al3.getClass();
        FMX.LJIIL("qa_category_banner_show", CK3.LIZ("enter_from", Al3.getEnterFrom()).LIZ);
        Al().getClass();
        if (((Boolean) C119144ly.LIZ.getValue()).booleanValue() && !m0.LIZLLL("qna_bottom_sheet_intro_has_been_shown|", ((RBX) HG3.LJIILL()).getCurUserId(), C119124lw.LIZ, false)) {
            Pl("auto");
        }
        ((C81066Vri) _$_findCachedViewById(R.id.e74)).setPickerCallback(this.LJLJLLL);
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c_5, viewGroup, false);
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
