package X;

import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSI implements InterfaceC57784Mm4 {
    public final FeedbackOptionValue LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KSI) && o.LJ(this.LJLIL, ((KSI) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        FeedbackOptionValue feedbackOptionValue = this.LJLIL;
        if (feedbackOptionValue == null) {
            return 0;
        }
        return feedbackOptionValue.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HashtagFeedbackItem(feedbackItemValue=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public KSI(FeedbackOptionValue feedbackOptionValue) {
        this.LJLIL = feedbackOptionValue;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
