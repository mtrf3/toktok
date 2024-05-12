package X;

import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import kotlin.jvm.internal.o;

/* renamed from: X.7Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186177Sj extends F9E implements InterfaceC57784Mm4 {
    public final TopicReview LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C186177Sj) {
            return o.LJ(this.LJLIL.getReviewId(), ((C186177Sj) interfaceC57784Mm4).LJLIL.getReviewId());
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        int i;
        if (!(interfaceC57784Mm4 instanceof C186177Sj)) {
            return null;
        }
        if (this.LJLILLLLZI != ((C186177Sj) interfaceC57784Mm4).LJLILLLLZI) {
            i = 1;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public C186177Sj(TopicReview review, boolean z) {
        o.LJIIIZ(review, "review");
        this.LJLIL = review;
        this.LJLILLLLZI = z;
    }
}
