package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Xqb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86093Xqb {
    public final PNSFeedbackModel LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86093Xqb)) {
            return false;
        }
        C86093Xqb c86093Xqb = (C86093Xqb) obj;
        return o.LJ(this.LIZ, c86093Xqb.LIZ) && o.LJ(this.LIZIZ, c86093Xqb.LIZIZ);
    }

    public final int hashCode() {
        PNSFeedbackModel pNSFeedbackModel = this.LIZ;
        return this.LIZIZ.hashCode() + ((pNSFeedbackModel == null ? 0 : pNSFeedbackModel.hashCode()) * 31);
    }

    public C86093Xqb() {
        this(null, C86103Xql.LJLIL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSFeedbackModelViewState(feedbackModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", action=");
        return C06540Nm.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C86093Xqb(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
        this.LIZ = pNSFeedbackModel;
        this.LIZIZ = action;
    }
}
