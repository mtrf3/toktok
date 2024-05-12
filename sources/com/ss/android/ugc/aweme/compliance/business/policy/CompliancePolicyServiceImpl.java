package com.ss.android.ugc.aweme.compliance.business.policy;

import X.AGJ;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C221108m2;
import X.C40343FsR;
import X.C62822Ol8;
import X.C62913Omb;
import X.EF7;
import X.FMX;
import X.O0U;
import X.O0V;
import X.O0W;
import X.O0X;
import X.O0Y;
import X.O0Z;
import X.OKG;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyInfo;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CompliancePolicyServiceImpl implements ICompliancePolicyService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(O0Y.LJLIL);

    public static String LIZJ(String str) {
        String LJIILL = AccountService.LJIJ().LJIILL();
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        String LLLZ = C16880lQ.LLLZ("https://www.tiktok.com/legal/%s", Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Uri.Builder buildUpon = UriProtector.parse(LLLZ).buildUpon();
        buildUpon.appendQueryParameter("region", LJIILL);
        buildUpon.appendQueryParameter("lang", appLanguage);
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "parse(POLICY_LEGAL_URL.f…     }.build().toString()");
        return uri;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    public final void LIZ(O0X o0x) {
        String value = O0W.POLICY_ENTRANCE_SHOW.getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(O0V.BIZ_CASE_ID.getValue(), o0x.LJLIL);
        c188727au.LJIIIZ(O0V.POLICY_KEY.getValue(), o0x.LJLILLLLZI);
        FMX.LJIIL(value, c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
    public final void LIZIZ(O0X o0x, O0Z o0z) {
        boolean z;
        List<PolicyInfo> policyInfoList;
        String policyUrl;
        String privacyPolicyUrl;
        this.LIZ.getValue().getClass();
        String value = O0W.REQUEST_POLICY_SERVICE.getValue();
        C188727au c188727au = new C188727au();
        O0V o0v = O0V.BIZ_CASE_ID;
        c188727au.LJIIIZ(o0v.getValue(), o0x.LJLIL);
        O0V o0v2 = O0V.POLICY_KEY;
        c188727au.LJIIIZ(o0v2.getValue(), o0x.LJLILLLLZI);
        c188727au.LJIIIZ(O0V.REQUEST_TYPE.getValue(), "show_policy_document");
        FMX.LJIIL(value, c188727au.LIZ);
        String value2 = O0W.POLICY_ENTRANCE_CLICK.getValue();
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ(o0v.getValue(), o0x.LJLIL);
        c188727au2.LJIIIZ(o0v2.getValue(), o0x.LJLILLLLZI);
        FMX.LJIIL(value2, c188727au2.LIZ);
        if (C19N.LJ("enforce_about_privacy_policy", false) && o.LJ(o0x.LJLILLLLZI, "privacy-policy") && (o.LJ(o0x.LJLIL, AGJ.SETTINGS_PRIVACY_PAGE.getValue()) || o.LJ(o0x.LJLIL, AGJ.SETTINGS_BETA_EMAIL_REGISTER_PAGE.getValue()))) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
            if (LIZ != null && (privacyPolicyUrl = LIZ.getPrivacyPolicyUrl()) != null) {
                str = privacyPolicyUrl;
            }
            if (str.length() == 0) {
                str = LIZJ(o0x.LJLILLLLZI);
            }
        } else {
            String str2 = o0x.LJLILLLLZI;
            ComplianceSetting LIZ2 = C62913Omb.LIZIZ.LIZ();
            PolicyInfo policyInfo = null;
            if (LIZ2 != null && (policyInfoList = LIZ2.getPolicyInfoList()) != null) {
                Iterator<PolicyInfo> it = policyInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PolicyInfo next = it.next();
                    if (TextUtils.equals(str2, next.getPolicyKey())) {
                        policyInfo = next;
                        break;
                    }
                }
                PolicyInfo policyInfo2 = policyInfo;
                if (policyInfo2 != null && (policyUrl = policyInfo2.getPolicyUrl()) != null) {
                    String LJIILL = AccountService.LJIJ().LJIILL();
                    String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
                    Uri.Builder buildUpon = UriProtector.parse(policyUrl).buildUpon();
                    buildUpon.appendQueryParameter("region", LJIILL);
                    buildUpon.appendQueryParameter("lang", appLanguage);
                    str = buildUpon.build().toString();
                    o.LJIIIIZZ(str, "parse(policyUrl).buildUp…     }.build().toString()");
                }
            }
            if (str.length() == 0) {
                str = LIZJ(o0x.LJLILLLLZI);
            }
        }
        this.LIZ.getValue().getClass();
        String value3 = O0W.POLICY_URL_RETRIEVE_RESULT.getValue();
        C188727au c188727au3 = new C188727au();
        c188727au3.LJIIIZ(O0V.BIZ_CASE_ID.getValue(), o0x.LJLIL);
        c188727au3.LJIIIZ(O0V.POLICY_KEY.getValue(), o0x.LJLILLLLZI);
        c188727au3.LJIIIZ(O0V.POLICY_URL.getValue(), str);
        FMX.LJIIL(value3, c188727au3.LIZ);
        Context LIZIZ2 = EF7.LIZIZ();
        Uri.Builder buildUpon2 = UriProtector.parse("aweme://webview").buildUpon();
        buildUpon2.appendQueryParameter("url", str);
        buildUpon2.appendQueryParameter("use_spark", "1");
        SparkContext sparkContext = new SparkContext();
        String uri = buildUpon2.build().toString();
        o.LJIIIIZZ(uri, "schema.build().toString()");
        sparkContext.LJJIJLIJ(uri);
        sparkContext.LJJIIJZLJL("use_webview_title", o0x.LJLJJI);
        sparkContext.LJJIIJZLJL("hide_status_bar", !o0x.LJLJI);
        sparkContext.LJJIIJZLJL("show_separate_line", o0x.LJLJJL);
        sparkContext.LJJIJIIJI(new O0U(o0z, this, o0x, str));
        OKG.LIZLLL(C40343FsR.LJIILJJIL, LIZIZ2, sparkContext);
    }
}
