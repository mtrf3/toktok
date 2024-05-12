package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.JpU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50352JpU implements InterfaceC49871Jhj, InterfaceC49025JLx {
    public final FeelgoodSurveyModel LJLIL;
    public final CustomText LJLILLLLZI;
    public final Aweme LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;

    public C50352JpU() {
        this(null, null, null, false, 0, 0L, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50352JpU)) {
            return false;
        }
        C50352JpU c50352JpU = (C50352JpU) obj;
        return o.LJ(this.LJLIL, c50352JpU.LJLIL) && o.LJ(this.LJLILLLLZI, c50352JpU.LJLILLLLZI) && o.LJ(this.LJLJI, c50352JpU.LJLJI) && this.LJLJJI == c50352JpU.LJLJJI && this.LJLJJL == c50352JpU.LJLJJL && this.LJLJJLL == c50352JpU.LJLJJLL && this.LJLJL == c50352JpU.LJLJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        FeelgoodSurveyModel feelgoodSurveyModel = this.LJLIL;
        int i = 0;
        if (feelgoodSurveyModel == null) {
            hashCode = 0;
        } else {
            hashCode = feelgoodSurveyModel.hashCode();
        }
        int i2 = hashCode * 31;
        CustomText customText = this.LJLILLLLZI;
        if (customText == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = customText.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Aweme aweme = this.LJLJI;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LJLJJI;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return JBR.LIZJ(this.LJLJJLL, (((i4 + i5) * 31) + this.LJLJJL) * 31, 31) + this.LJLJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchSatisfactionSurveyData(feelgoodSurveyModel=");
        LIZ.append(this.LJLIL);
        LIZ.append(", customText=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", curAweme=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isLeftArrow=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", rank=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", showTime=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", hasChooseRate=");
        return b0.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    @Override // X.InterfaceC49871Jhj
    public final int LIZ() {
        return this.LJLJLJ;
    }

    public C50352JpU(FeelgoodSurveyModel feelgoodSurveyModel, CustomText customText, Aweme aweme, boolean z, int i, long j, int i2) {
        feelgoodSurveyModel = (i2 & 1) != 0 ? null : feelgoodSurveyModel;
        customText = (i2 & 2) != 0 ? null : customText;
        aweme = (i2 & 4) != 0 ? null : aweme;
        z = (i2 & 8) != 0 ? false : z;
        i = (i2 & 16) != 0 ? -1 : i;
        j = (i2 & 32) != 0 ? -1L : j;
        this.LJLIL = feelgoodSurveyModel;
        this.LJLILLLLZI = customText;
        this.LJLJI = aweme;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = j;
        this.LJLJL = 0;
        int i3 = JPA.LIZ;
        JPA.LIZ = i3 + 1;
        this.LJLJLJ = i3;
    }
}
