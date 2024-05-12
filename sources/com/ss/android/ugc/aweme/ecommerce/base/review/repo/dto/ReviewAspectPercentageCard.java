package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C1NE;
import X.C26872Age;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReviewAspectPercentageCard implements Parcelable {
    public static final Parcelable.Creator<ReviewAspectPercentageCard> CREATOR = new C26872Age();

    @InterfaceC65349Pkn("question")
    public final String question;

    @InterfaceC65349Pkn("review_aspect_score_items")
    public final List<ReviewAspectPercentageItem> reviewAspectScoreItems;

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewAspectPercentageCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewAspectPercentageCard)) {
            return false;
        }
        ReviewAspectPercentageCard reviewAspectPercentageCard = (ReviewAspectPercentageCard) obj;
        return o.LJ(this.question, reviewAspectPercentageCard.question) && o.LJ(this.reviewAspectScoreItems, reviewAspectPercentageCard.reviewAspectScoreItems);
    }

    public final int hashCode() {
        String str = this.question;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReviewAspectPercentageItem> list = this.reviewAspectScoreItems;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewAspectPercentageCard(question=");
        LIZ.append(this.question);
        LIZ.append(", reviewAspectScoreItems=");
        return C1NE.LIZIZ(LIZ, this.reviewAspectScoreItems, ')', LIZ);
    }

    public ReviewAspectPercentageCard(String str, List<ReviewAspectPercentageItem> list) {
        this.question = str;
        this.reviewAspectScoreItems = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.question);
        List<ReviewAspectPercentageItem> list = this.reviewAspectScoreItems;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((ReviewAspectPercentageItem) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ ReviewAspectPercentageCard(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
