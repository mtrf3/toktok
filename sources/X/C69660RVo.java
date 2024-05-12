package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTags;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RVo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69660RVo implements Parcelable.Creator<ReviewItemStruct> {
    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct createFromParcel(Parcel parcel) {
        ReviewItemStruct.MainReview createFromParcel;
        Integer valueOf;
        boolean z;
        Boolean valueOf2;
        boolean z2;
        Boolean valueOf3;
        ReviewItemStruct.User createFromParcel2;
        ArrayList arrayList;
        boolean z3;
        Boolean valueOf4;
        boolean z4;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ReviewItemStruct.MainReview.CREATOR.createFromParcel(parcel);
        }
        ReviewItemStruct.MainReview mainReview = createFromParcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf2 = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf3 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ReviewItemStruct.User.CREATOR.createFromParcel(parcel);
        }
        ReviewItemStruct.User user = createFromParcel2;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ReviewTags.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf4 = Boolean.valueOf(z3);
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new ReviewItemStruct(mainReview, readString, readString2, valueOf, valueOf2, valueOf3, user, arrayList, valueOf4, num, readString3, readString4, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct[] newArray(int i) {
        return new ReviewItemStruct[i];
    }
}
