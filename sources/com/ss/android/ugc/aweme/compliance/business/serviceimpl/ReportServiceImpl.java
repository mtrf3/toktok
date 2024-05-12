package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AV1;
import X.C25574A1y;
import X.C43163Gwp;
import X.C57427MgJ;
import X.C75792yF;
import X.FMX;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ReportServiceImpl implements IReportService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final String LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return "forward";
        }
        if (aweme.isImage()) {
            return "image";
        }
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LJI(Map<String, String> map) {
        FMX.LJIIL("tip_off", map);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final String LJIIIIZZ(String str) {
        if (TextUtils.equals(str, "long_press_mask_layer")) {
            return "long_press";
        }
        return "click_share_button";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LIZIZ(Activity activity, Uri.Builder builder) {
        LJFF(activity, builder, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LIZJ(Activity activity, Uri.Builder builder) {
        boolean z;
        String str;
        if (builder != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        C25574A1y.LIZLLL("report_url_null_check_rad", null, z);
        if (builder == null || activity == null) {
            return;
        }
        C57427MgJ.LIZ(C57427MgJ.LIZ, builder);
        Uri build = builder.build();
        Bundle bundle = new Bundle();
        bundle.putString("url", String.valueOf(build));
        bundle.putBoolean("show_load_dialog", false);
        bundle.putBoolean("hide_nav_bar", true);
        String string = activity.getResources().getString(R.color.ar);
        o.LJIIIIZZ(string, "activity.resources\n     …String(R.color.BGPrimary)");
        bundle.putString("status_bar_color", ujb.o.LJJJJZ(string, "#", "", false));
        bundle.putLong("enter_time", System.currentTimeMillis());
        if (build != null) {
            str = UriProtector.getQueryParameter(build, "object_id");
            str2 = UriProtector.getQueryParameter(build, "enter_from");
        } else {
            str = null;
        }
        C43163Gwp.LIZ(activity, bundle, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LJ(Activity activity, Aweme aweme) {
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        EcommerceInfo ecommerceInfo;
        o.LJIIIZ(aweme, "aweme");
        if (activity == null) {
            return;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", aweme.getAid()).appendQueryParameter("owner_id", aweme.getAuthorUid());
        boolean z = true;
        if (aweme.getAwemeType() == 13) {
            str = "forward";
        } else if (aweme.getAwemeType() == 2) {
            str = "image";
        } else {
            if (aweme.getAwemeType() != 0 && aweme.getAwemeType() != 51 && aweme.getAwemeType() != 52 && aweme.getAwemeType() != 54 && aweme.getAwemeType() != 53 && aweme.getAwemeType() != 55 && aweme.getAwemeType() != 56 && aweme.getAwemeType() != 34) {
                if (aweme.getAwemeType() == 150) {
                    str = "photo_mode";
                } else {
                    if (aweme.getAwemeRawAd() != null) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        o.LJI(awemeRawAd2);
                        if (awemeRawAd2.getSystemOrigin() == 1) {
                            str = "douplus";
                        }
                    }
                    if (aweme.isAd()) {
                        str = "ad";
                    }
                }
            }
            str = "video";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("report_type", str).appendQueryParameter("locale", SettingServiceImpl.LIZ().getAppLanguage());
        try {
            m mVar = new m();
            mVar.LJJIIZ("unique_id", AV1.LIZLLL(aweme.getAuthor()));
            appendQueryParameter2.appendQueryParameter("extra", C75792yF.LIZJ(mVar));
            m mVar2 = new m();
            if (!ECommerceAnchorService.LJJJJI().LJJJ(aweme) && ((awemeRawAd = aweme.getAwemeRawAd()) == null || (ecommerceInfo = awemeRawAd.getEcommerceInfo()) == null || !o.LJ(ecommerceInfo.isEcom(), Boolean.TRUE))) {
                z = false;
            }
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            mVar2.LJJIIZ("is_ecom", str2);
            appendQueryParameter2.appendQueryParameter("extra_log_params", mVar2.toString());
        } catch (Exception unused) {
        }
        C57427MgJ.LIZIZ(activity, appendQueryParameter2, null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LJFF(Activity activity, Uri.Builder builder, Bundle bundle) {
        if (activity == null) {
            return;
        }
        C57427MgJ.LIZIZ(activity, builder, bundle);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LIZ(String str, String str2, String str3, String str4, String str5, String str6) {
        C57427MgJ.LIZJ(str, str2, str3, str4, str5, str6, null, null, null, "", null, "", 0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
    public final void LJII(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, String str8, String str9, Context context, String str10, int i) {
        C57427MgJ.LIZJ(str, str2, str3, str4, str5, str6, aweme, str7, str8, str9, context, str10, i);
    }
}
