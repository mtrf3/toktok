package com.ss.android.ugc.aweme.landpage.survey;

import X.C47261Igj;
import X.C58096Mr6;
import X.C58857N8b;
import X.C76800UCe;
import X.EnumC46492IMm;
import X.InterfaceC65784Pro;
import X.NFZ;
import X.OSZ;
import X.X1D;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import java.util.Iterator;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdLandPageSurveyServiceImpl implements IAdLandPageSurveyService {
    public static IAdLandPageSurveyService LJI() {
        Object LIZ = C58096Mr6.LIZ(IAdLandPageSurveyService.class, false);
        if (LIZ != null) {
            return (IAdLandPageSurveyService) LIZ;
        }
        if (C58096Mr6.U1 == null) {
            synchronized (IAdLandPageSurveyService.class) {
                if (C58096Mr6.U1 == null) {
                    C58096Mr6.U1 = new AdLandPageSurveyServiceImpl();
                }
            }
        }
        return C58096Mr6.U1;
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LIZIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = NFZ.LJII;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        NFZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LIZ() {
        NFZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LIZJ(boolean z) {
        NFZ.LJI = z;
        if (!z) {
            NFZ.LJFF = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final boolean LIZLLL(Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        if (NFZ.LJI) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - NFZ.LJFF;
        NFZ.LJII = interfaceC65784Pro;
        LandingPageSurveyModel landingPageSurveyModel = NFZ.LIZ;
        if (landingPageSurveyModel == null || !landingPageSurveyModel.getEnableLandingPageSurvey() || landingPageSurveyModel.getSchemaUrl().length() == 0 || j <= landingPageSurveyModel.getPageDwellTime() || currentTimeMillis - Keva.getRepo("ad_land_survey_repo").getLong("ad_land_last_show_time", 0L) <= landingPageSurveyModel.getShowSurveyTimeInterval()) {
            return false;
        }
        NFZ.LIZIZ(activity, landingPageSurveyModel.getSchemaUrl(), null, EnumC46492IMm.THIRD_PARTY);
        Keva.getRepo("ad_land_survey_repo").storeLong("ad_land_last_show_time", currentTimeMillis);
        NFZ.LIZ = null;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final OSZ LJFF(Activity activity, AqS160S0100000_10 aqS160S0100000_10) {
        if (activity == null) {
            return new OSZ(Boolean.FALSE, new C58857N8b("activity is null"));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - NFZ.LJFF;
        NFZ.LJII = aqS160S0100000_10;
        LandingPageSurveyModel landingPageSurveyModel = NFZ.LIZ;
        if (landingPageSurveyModel != null) {
            if (!landingPageSurveyModel.getEnableLandingPageSurvey() || landingPageSurveyModel.getSchemaUrl().length() == 0) {
                Boolean bool = Boolean.FALSE;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("enableLandingPageSurvey or schemaUrl error enableLandingPageSurvey = ");
                LIZ.append(landingPageSurveyModel.getEnableLandingPageSurvey());
                LIZ.append("  schemaUrl = ");
                LIZ.append(landingPageSurveyModel.getSchemaUrl());
                return new OSZ(bool, new C58857N8b(X1D.LIZIZ(LIZ)));
            }
            if (j > landingPageSurveyModel.getPageDwellTime()) {
                if (currentTimeMillis - Keva.getRepo("ad_land_survey_repo").getLong("ad_land_last_show_time", 0L) > landingPageSurveyModel.getShowSurveyTimeInterval()) {
                    NFZ.LIZIZ(activity, landingPageSurveyModel.getSchemaUrl(), aqS160S0100000_10, EnumC46492IMm.IN_APP);
                    Keva.getRepo("ad_land_survey_repo").storeLong("ad_land_last_show_time", currentTimeMillis);
                    NFZ.LIZ = null;
                    return new OSZ(Boolean.TRUE, null);
                }
                return new OSZ(Boolean.FALSE, new C58857N8b("showSurveyTimeInterval not enough"));
            }
            return new OSZ(Boolean.FALSE, new C58857N8b("stay time not enough"));
        }
        Boolean bool2 = Boolean.FALSE;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("landingPageSurvey error ");
        LIZ2.append(NFZ.LIZ);
        return new OSZ(bool2, new C58857N8b(X1D.LIZIZ(LIZ2)));
    }

    @Override // com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService
    public final void LJ(String str, String str2, String str3, String str4, String str5, String schemaUrl, boolean z, long j, long j2) {
        o.LJIIIZ(schemaUrl, "schemaUrl");
        if (str != null) {
            Iterator it = C47261Igj.LJII("feedad", "topview").iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next(), str)) {
                    NFZ.LIZIZ = str2;
                    NFZ.LIZJ = str3;
                    NFZ.LIZLLL = str4;
                    NFZ.LJ = str5;
                    NFZ.LIZ = new LandingPageSurveyModel(z, j, j2, schemaUrl);
                    System.currentTimeMillis();
                    return;
                }
            }
        }
        NFZ.LIZ();
    }
}
