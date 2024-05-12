package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: X.Qn6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68040Qn6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 2:
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 3:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 4:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    bundle = C67315QbP.LIZIZ(parcel, readInt);
                    break;
                case '\b':
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
