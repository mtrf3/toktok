package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import kotlin.jvm.internal.o;

/* renamed from: X.8uU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226348uU extends AbstractC226378uX {
    public final AddYoursRecommendation LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C226348uU) && o.LJ(this.LJ, ((C226348uU) obj).LJ);
    }

    public final int hashCode() {
        AddYoursRecommendation addYoursRecommendation = this.LJ;
        if (addYoursRecommendation == null) {
            return 0;
        }
        return addYoursRecommendation.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursEntranceWithRcmdTopic(rcmdTopic=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C226348uU(com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L1a
            java.lang.Long r3 = r5.getTopicId()
            java.lang.String r2 = r5.getTopicText()
            java.lang.Long r0 = r5.getTopicId()
        Lf:
            boolean r1 = X.C30591Hz.LJIJJLI(r0)
            r0 = 0
            r4.<init>(r3, r2, r0, r1)
            r4.LJ = r5
            return
        L1a:
            r3 = r0
            r2 = r0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226348uU.<init>(com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation):void");
    }
}
