package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C30591Hz;
import X.C42359Gjr;
import X.C45804HyK;
import X.C65300Pk0;
import X.C73969T1h;
import X.DialogC25756A8y;
import X.T16;
import Y.AfS56S0200000_7;
import Y.AfS59S0100000_7;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidSurveyAPI;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SearchAidFeedbackAction implements IRouteAction {
    public static final int $stable = 0;

    public static void com_ss_android_ugc_aweme_compliance_business_search_feedback_SearchAidFeedbackAction_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "6782012416611385002")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        int i;
        ActivityC45651qj LJJIFFI;
        String searchId = C30591Hz.LJIILIIL(str, "search_session_id");
        try {
            String LJIILIIL = C30591Hz.LJIILIIL(str, "page_type");
            o.LJIIIIZZ(LJIILIIL, "getQueryParameter(url, \"page_type\")");
            i = CastIntegerProtector.parseInt(LJIILIIL);
        } catch (Exception unused) {
            i = 0;
        }
        String LJIILIIL2 = C30591Hz.LJIILIIL(str, "channel");
        String LJIILIIL3 = C30591Hz.LJIILIIL(str, "search_aid_issue_name");
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(LJJIFFI);
            dialogC25756A8y.LIZIZ(R.string.h30);
            com_ss_android_ugc_aweme_compliance_business_search_feedback_SearchAidFeedbackAction_com_bytedance_tux_status_loading_TuxLoadingDialogHUD_show(dialogC25756A8y);
            o.LJIIIIZZ(searchId, "searchId");
            C42359Gjr c42359Gjr = new C42359Gjr(dialogC25756A8y, LJJIFFI, searchId, LJIILIIL2, LJIILIIL3, i);
            AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(dialogC25756A8y, LJJIFFI, 17);
            ((SearchAidSurveyAPI.API) SearchAidSurveyAPI.LIZ.getValue()).getSearchAidSurveyInfo(searchId, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0200000_7(c42359Gjr, aqS154S0200000_7, 4), new AfS59S0100000_7(aqS154S0200000_7, 23));
        }
        return Boolean.TRUE;
    }
}
