package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;

/* renamed from: X.ZWo, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90070ZWo implements Parcelable.Creator<AdBreakStatus> {
    @Override // android.os.Parcelable.Creator
    public final AdBreakStatus createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                j3 = C67315QbP.LJJ(parcel, readInt);
                            }
                        } else {
                            str2 = C67315QbP.LJII(parcel, readInt);
                        }
                    } else {
                        str = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    j2 = C67315QbP.LJJ(parcel, readInt);
                }
            } else {
                j = C67315QbP.LJJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new AdBreakStatus(j, j2, j3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdBreakStatus[] newArray(int i) {
        return new AdBreakStatus[i];
    }
}
