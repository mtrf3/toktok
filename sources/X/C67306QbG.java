package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: X.QbG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67306QbG implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 3:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 4:
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 6:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\b':
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    zaaVar = (zaa) C67315QbP.LJI(parcel, readInt, zaa.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
