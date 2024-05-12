package com.ss.android.ugc.aweme.setting.ui.beta;

import X.AGJ;
import X.ActivityC45651qj;
import X.AnonymousClass898;
import X.C16880lQ;
import X.C188727au;
import X.C1A7;
import X.C223338pd;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25727A7v;
import X.C72062SPy;
import X.C79045V0n;
import X.C79061V1d;
import X.FMX;
import X.InterfaceC61213O0r;
import X.InterfaceC789838c;
import X.KL2;
import X.O0X;
import X.OJD;
import X.SY4;
import X.T28;
import X.ViewOnFocusChangeListenerC25787AAd;
import Y.ACListenerS7S0500000_4;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.setting.api.BetaAppApi;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class BetaEmailRegisterPage extends BasePage {
    public final BetaAppApi LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final OJD LJLJI = new OJD("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.ck2;
    }

    public BetaEmailRegisterPage() {
        Object obj;
        String str = Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(BetaAppApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        this.LJLJJI = (BetaAppApi) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        String str;
        ICompliancePolicyService LJII;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.iu4);
        C223338pd c223338pd = (C223338pd) view.findViewById(R.id.g7r);
        TextView textView = (TextView) view.findViewById(R.id.l8x);
        textView.setMovementMethod(AnonymousClass898.LIZ);
        C72062SPy c72062SPy = new C72062SPy();
        String string = getString(R.string.c6o);
        o.LJIIIIZZ(string, "getString(R.string.beta_…id_whitelist_placeholder)");
        c72062SPy.LIZIZ = string;
        c72062SPy.LIZ = false;
        c72062SPy.LIZIZ(62);
        c72062SPy.LJ(1);
        c72062SPy.LJFF = new AqS154S0100000_4(this, 815);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        CharSequence LIZ = c72062SPy.LIZ(requireActivity);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            charSequence = C1A7.LJIJ(mo49getActivity, R.string.c6h, LIZ);
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 814));
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZJ(0);
        c252709vu.setNavActions(c235119Kp);
        SY4 sy4 = (SY4) view.findViewById(R.id.kpi);
        EditText editText = (EditText) view.findViewById(R.id.czo);
        View findViewById = view.findViewById(R.id.ngt);
        GradientDrawable LIZIZ = T28.LIZIZ(0);
        LIZIZ.setCornerRadius(KL2.LIZJ(requireActivity(), 4.0f));
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        Integer LJI = C79045V0n.LJI(R.attr.e7, requireActivity2);
        if (LJI != null) {
            LIZIZ.setStroke(1, LJI.intValue());
        }
        ActivityC45651qj requireActivity3 = requireActivity();
        o.LJIIIIZZ(requireActivity3, "requireActivity()");
        Integer LJI2 = C79045V0n.LJI(R.attr.cf, requireActivity3);
        if (LJI2 != null) {
            LIZIZ.setColor(LJI2.intValue());
        }
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC25787AAd(this, editText, findViewById, LIZIZ));
        sy4.getClass();
        C16880lQ.LJJIZ(sy4, new ACListenerS7S0500000_4(this, editText, findViewById, LIZIZ, c223338pd, 1));
        C188727au c188727au = new C188727au();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(BetaAppExperiment.LJII ? 1 : 0, "has_join_beta");
        FMX.LJIIL("enter_tiktok_beta_gp_email_page", c188727au.LIZ);
        if (!C25727A7v.LIZ() || (LJII = a.LJII()) == null) {
            return;
        }
        LJII.LIZ(new O0X(false, AGJ.SETTINGS_BETA_EMAIL_REGISTER_PAGE.getValue(), true, true, "privacy-policy"));
    }
}
