package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.Qjt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67841Qjt implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final ConnectionTelemetryConfiguration createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) C67315QbP.LJI(parcel, readInt, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 3:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 4:
                    iArr = C67315QbP.LIZLLL(parcel, readInt);
                    break;
                case 5:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C67315QbP.LIZLLL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionTelemetryConfiguration[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
