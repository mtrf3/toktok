package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GKg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41338GKg implements Parcelable.Creator<PostPageModel> {
    @Override // android.os.Parcelable.Creator
    public final PostPageModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(AVTextExtraStruct.CREATOR, parcel, arrayList, i, 1);
        }
        int readInt2 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt2);
        int i2 = 0;
        while (i2 != readInt2) {
            i2 = C279117r.LIZIZ(AVTextExtraStruct.CREATOR, parcel, arrayList2, i2, 1);
        }
        CaptionModel createFromParcel = CaptionModel.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long readLong = parcel.readLong();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        String readString3 = parcel.readString();
        int readInt5 = parcel.readInt();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new PostPageModel(readString, arrayList, arrayList2, createFromParcel, z, readInt3, readInt4, z2, readLong, readString2, z3, readString3, readInt5, readString4, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final PostPageModel[] newArray(int i) {
        return new PostPageModel[i];
    }
}
