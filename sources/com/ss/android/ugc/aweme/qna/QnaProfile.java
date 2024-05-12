package com.ss.android.ugc.aweme.qna;

import X.ActivityC45651qj;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C29S;
import X.C3C5;
import X.C41175GDz;
import X.C5H3;
import X.C72753Sgv;
import X.C72754Sgw;
import X.C72755Sgx;
import X.C72756Sgy;
import X.C72757Sgz;
import X.C72760Sh2;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.FMX;
import X.HG3;
import X.InterfaceC18010nF;
import X.InterfaceC61213O0r;
import X.InterfaceC72761Sh3;
import X.MIL;
import X.RBX;
import X.T7F;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public final class QnaProfile extends BaseFragment implements InterfaceC18010nF {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b3772";
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public QnaProfile() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArgNotNull(this, C72754Sgw.LJLIL, "enter_from", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArgNotNull(this, C72755Sgx.LJLIL, "enter_method", String.class);
        this.LJLJI = routeArgExtension.optionalArgNotNull(this, C72753Sgv.LJLIL, "to_user_id", String.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, C72756Sgy.LJLIL, "qa_profile_mode", MIL.class);
        this.LJLJJL = routeArgExtension.optionalArgNotNull(this, C72757Sgz.LJLIL, "question_ids", long[].class);
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C12460eI.LJIIIIZZ(this, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(C72760Sh2.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41175GDz.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJJI.getValue() == MIL.FYP_BANNER) {
            InterfaceC72761Sh3.LIZ.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            c188727au.LJIIIZ("enter_method", "click_banner");
            FMX.LJIIL("enter_qa_trending_page", c188727au.LIZ);
        } else {
            String str = (String) this.LJLJI.getValue();
            o.LJIIIZ(str, "<this>");
            if (TextUtils.equals(str, ((RBX) HG3.LJIILL()).getCurUserId())) {
                T7F t7f = InterfaceC72761Sh3.LIZ;
                String str2 = (String) this.LJLILLLLZI.getValue();
                String str3 = (String) this.LJLIL.getValue();
                t7f.getClass();
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", str3);
                c188727au2.LJIIIZ("enter_method", str2);
                FMX.LJIIL("enter_qa_personal_profile", c188727au2.LIZ);
            } else {
                T7F t7f2 = InterfaceC72761Sh3.LIZ;
                String str4 = (String) this.LJLJI.getValue();
                String str5 = (String) this.LJLIL.getValue();
                t7f2.getClass();
                C188727au c188727au3 = new C188727au();
                c188727au3.LJIIIZ("enter_method", "click_qa_entrance");
                c188727au3.LJIIIZ("enter_from", str5);
                c188727au3.LJIIIZ("to_user_id", str4);
                FMX.LJIIL("enter_qa_others_profile", c188727au3.LIZ);
            }
        }
        C8VV.LIZ(this, false, new AqS143S0200000_12(this, view, 60));
        requireActivity().getWindow().setSoftInputMode(48);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c_8, viewGroup, false);
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
