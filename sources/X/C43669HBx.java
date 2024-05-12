package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.HBx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43669HBx implements Parcelable.Creator<NowsExtra> {
    @Override // android.os.Parcelable.Creator
    public final NowsExtra createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        int readInt4 = parcel.readInt();
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new NowsExtra(readString, readString2, readString3, readInt, readInt2, readInt3, z, readString4, readString5, readString6, readString7, readString8, z2, readString9, readString10, readString11, readString12, readInt4, readString13, readString14, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final NowsExtra[] newArray(int i) {
        return new NowsExtra[i];
    }
}
