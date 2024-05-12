package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Ros, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70698Ros extends AbstractC03160Am<AbstractC70686Rog> {
    public boolean LIZ = true;

    @Override // X.AbstractC03160Am
    public final boolean LIZ(AbstractC70686Rog abstractC70686Rog, AbstractC70686Rog abstractC70686Rog2) {
        AbstractC70686Rog abstractC70686Rog3 = abstractC70686Rog2;
        if (this.LIZ) {
            if (abstractC70686Rog instanceof C70677RoX) {
                if (!(abstractC70686Rog3 instanceof C70677RoX)) {
                    abstractC70686Rog3 = null;
                }
                if (o.LJ(abstractC70686Rog3, abstractC70686Rog)) {
                    return true;
                }
            } else {
                throw new C162476Zf();
            }
        }
        return false;
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(AbstractC70686Rog abstractC70686Rog, AbstractC70686Rog abstractC70686Rog2) {
        String str;
        C70677RoX c70677RoX;
        ReviewItemStruct reviewItemStruct;
        ReviewItemStruct.MainReview mainReview;
        AbstractC70686Rog abstractC70686Rog3 = abstractC70686Rog;
        AbstractC70686Rog abstractC70686Rog4 = abstractC70686Rog2;
        if (this.LIZ) {
            if (abstractC70686Rog3 instanceof C70677RoX) {
                String str2 = null;
                if ((abstractC70686Rog4 instanceof C70677RoX) && (c70677RoX = (C70677RoX) abstractC70686Rog4) != null && (reviewItemStruct = c70677RoX.LIZ) != null && (mainReview = reviewItemStruct.review) != null) {
                    str = mainReview.reviewId;
                } else {
                    str = null;
                }
                ReviewItemStruct.MainReview mainReview2 = ((C70677RoX) abstractC70686Rog3).LIZ.review;
                if (mainReview2 != null) {
                    str2 = mainReview2.reviewId;
                }
                if (o.LJ(str, str2)) {
                    return true;
                }
            } else {
                throw new C162476Zf();
            }
        }
        return false;
    }

    @Override // X.AbstractC03160Am
    public final Object LIZJ(AbstractC70686Rog abstractC70686Rog, AbstractC70686Rog abstractC70686Rog2) {
        return abstractC70686Rog2;
    }
}
