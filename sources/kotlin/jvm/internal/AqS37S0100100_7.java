package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C140295ez;
import X.C43482H4s;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;

/* loaded from: classes8.dex */
public class AqS37S0100100_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1();
            case 2:
                return invoke$2();
            case 3:
                return invoke$3();
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public final Boolean invoke$0() {
        boolean z;
        if (this.j1 > ((DistributeAuthorSurveyInfoModel) this.l0).surveyDistributionTimeStart * 60 * 1000) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Boolean invoke$1() {
        boolean z;
        if (this.j1 < ((DistributeAuthorSurveyInfoModel) this.l0).surveyDistributionTimeEnd * 60 * 1000) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Boolean invoke$2() {
        boolean z;
        if (this.j1 > ((DistributeAuthorSurveyInfoModel) this.l0).surveyDistributionTimeStart * 60 * 1000) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Boolean invoke$3() {
        boolean z;
        if (this.j1 < ((DistributeAuthorSurveyInfoModel) this.l0).surveyDistributionTimeEnd * 60 * 1000) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AqS37S0100100_7 aqS37S0100100_7) {
        C140295ez c140295ez = new C140295ez();
        c140295ez.LIZ.put("publish_content_storage_size", String.valueOf((aqS37S0100100_7.j1 - ((C43482H4s) aqS37S0100100_7.l0).LJIILIIL) / 1024));
        return c140295ez;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0100100_7(long j, C43482H4s c43482H4s, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = c43482H4s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0100100_7(long j, DistributeAuthorSurveyInfoModel distributeAuthorSurveyInfoModel, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = distributeAuthorSurveyInfoModel;
    }
}
