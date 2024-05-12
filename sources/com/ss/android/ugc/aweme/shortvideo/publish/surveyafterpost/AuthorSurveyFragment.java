package com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost;

import X.AI8;
import X.AKC;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25991AHz;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C47261Igj;
import X.C60903NvH;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.GHO;
import X.GHP;
import X.SY4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS37S0301000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AuthorSurveyFragment extends Fragment {
    public static final /* synthetic */ int LJLJJL = 0;
    public SY4 LJLILLLLZI;
    public Integer LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(GHO.LJLIL);

    public final DistributeAuthorSurveyInfoModel vl() {
        return (DistributeAuthorSurveyInfoModel) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List<String> list;
        String str2;
        String str3;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.l_2);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.title_bar)");
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL = false;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 605));
        c235119Kp.LIZIZ(LIZJ);
        ((C252709vu) findViewById).setNavActions(c235119Kp);
        if (GHP.LIZ()) {
            str = vl().mostWantedSetSheetTitle;
        } else {
            str = vl().mostDisappointedSetSheetTitle;
        }
        ((TextView) view.findViewById(R.id.kvt)).setText(str);
        SY4 sy4 = (SY4) view.findViewById(R.id.kpl);
        sy4.setText(vl().submitTitle);
        C16880lQ.LJIIJ(new Au2S16S0100000_7(this, 11, 42, 42), sy4);
        this.LJLILLLLZI = sy4;
        View findViewById2 = view.findViewById(R.id.kvh);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.survey_options_container)");
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        if (GHP.LIZ()) {
            list = vl().mostWantedSetSheetOptionList;
        } else {
            list = vl().mostDisappointedSetSheetOptionList;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        int i = 0;
        for (CharSequence charSequence : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Context requireContext = requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                AI8 ai8 = new AI8(requireContext, null, 6);
                ai8.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                ai8.setInset(AKC.PADDING_32);
                ai8.setTitle((String) charSequence);
                Context requireContext2 = requireContext();
                o.LJIIIIZZ(requireContext2, "requireContext()");
                C25991AHz c25991AHz = new C25991AHz(requireContext2);
                c25991AHz.LJIILIIL(false);
                c25991AHz.LJIILJJIL(new AqS37S0301000_7(c25991AHz, linearLayout, i, this, 2));
                ai8.setAccessory(c25991AHz);
                arrayList.add(ai8);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
        C188727au c188727au = new C188727au();
        Bundle arguments = getArguments();
        String str4 = "";
        if (arguments == null || (str2 = arguments.getString("enterFrom")) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("author_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("groupId")) != null) {
            str4 = string;
        }
        c188727au.LJIIIZ("group_id", str4);
        if (GHP.LIZ()) {
            str3 = "most_wanted_set";
        } else {
            str3 = "most_disappointed_set";
        }
        c188727au.LJIIIZ("survey_type", str3);
        c188727au.LIZLLL(AVExternalServiceImpl.LIZ().publishService().getSurveyAfterPostService().isCurrentTheLastTimeSurveyBannerShown() ? 1 : 0, "if_hit_quit");
        FMX.LJIIL("author_survey_show", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axf, viewGroup, false);
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
