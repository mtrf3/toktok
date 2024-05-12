package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;

/* renamed from: X.ZYs, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90126ZYs implements Parcelable.Creator<CastMediaOptions> {
    @Override // android.os.Parcelable.Creator
    public final CastMediaOptions createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        NotificationOptions notificationOptions = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    iBinder = C67315QbP.LJIJJ(parcel, readInt);
                    break;
                case 5:
                    notificationOptions = (NotificationOptions) C67315QbP.LJI(parcel, readInt, NotificationOptions.CREATOR);
                    break;
                case 6:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 7:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CastMediaOptions(str, str2, iBinder, notificationOptions, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastMediaOptions[] newArray(int i) {
        return new CastMediaOptions[i];
    }
}
