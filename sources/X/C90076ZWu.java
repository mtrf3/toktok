package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakInfo;

/* renamed from: X.ZWu, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90076ZWu implements Parcelable.Creator<AdBreakInfo> {
    @Override // android.os.Parcelable.Creator
    public final AdBreakInfo createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        String[] strArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 3:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 5:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 6:
                    strArr = C67315QbP.LJIIIIZZ(parcel, readInt);
                    break;
                case 7:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\b':
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new AdBreakInfo(j, str, j2, z, strArr, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdBreakInfo[] newArray(int i) {
        return new AdBreakInfo[i];
    }
}
