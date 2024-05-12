package com.ss.android.ugc.aweme.commercialize.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LandingPageSurveyModel extends F9E implements Serializable {

    @InterfaceC65349Pkn("enable_landing_page_survey")
    public boolean enableLandingPageSurvey;

    @InterfaceC65349Pkn("page_dwell_time")
    public long pageDwellTime;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    @InterfaceC65349Pkn("show_survey_time_interval")
    public long showSurveyTimeInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LandingPageSurveyModel() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 15
            r0 = r9
            r4 = r2
            r8 = r6
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel.<init>():void");
    }

    public static /* synthetic */ LandingPageSurveyModel copy$default(LandingPageSurveyModel landingPageSurveyModel, boolean z, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = landingPageSurveyModel.enableLandingPageSurvey;
        }
        if ((i & 2) != 0) {
            j = landingPageSurveyModel.showSurveyTimeInterval;
        }
        if ((i & 4) != 0) {
            j2 = landingPageSurveyModel.pageDwellTime;
        }
        if ((i & 8) != 0) {
            str = landingPageSurveyModel.schemaUrl;
        }
        return landingPageSurveyModel.copy(z, j, j2, str);
    }

    public final LandingPageSurveyModel copy(boolean z, long j, long j2, String schemaUrl) {
        o.LJIIIZ(schemaUrl, "schemaUrl");
        return new LandingPageSurveyModel(z, j, j2, schemaUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableLandingPageSurvey), Long.valueOf(this.showSurveyTimeInterval), Long.valueOf(this.pageDwellTime), this.schemaUrl};
    }

    public final boolean getEnableLandingPageSurvey() {
        return this.enableLandingPageSurvey;
    }

    public final long getPageDwellTime() {
        return this.pageDwellTime;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final long getShowSurveyTimeInterval() {
        return this.showSurveyTimeInterval;
    }

    public final void setEnableLandingPageSurvey(boolean z) {
        this.enableLandingPageSurvey = z;
    }

    public final void setPageDwellTime(long j) {
        this.pageDwellTime = j;
    }

    public final void setSchemaUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.schemaUrl = str;
    }

    public final void setShowSurveyTimeInterval(long j) {
        this.showSurveyTimeInterval = j;
    }

    public LandingPageSurveyModel(boolean z, long j, long j2, String schemaUrl) {
        o.LJIIIZ(schemaUrl, "schemaUrl");
        this.enableLandingPageSurvey = z;
        this.showSurveyTimeInterval = j;
        this.pageDwellTime = j2;
        this.schemaUrl = schemaUrl;
    }

    public /* synthetic */ LandingPageSurveyModel(boolean z, long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? "" : str);
    }
}
