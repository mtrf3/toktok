package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import java.util.HashSet;

/* renamed from: X.QbR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67317QbR implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = C67315QbP.LIZJ(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C67315QbP.LJI(parcel, readInt, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) C67315QbP.LJI(parcel, readInt, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == LJJIII) {
            return new zzw(hashSet, i, str, i2, bArr, pendingIntent, deviceMetaData);
        }
        throw new C67308QbI(C64.LIZIZ("Overread allowed size end=", LJJIII), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzw[i];
    }
}
