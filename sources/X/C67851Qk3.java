package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.Qk3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67851Qk3 implements Parcelable.Creator<RootTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final RootTelemetryConfiguration createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                i3 = C67315QbP.LJIJJLI(parcel, readInt);
                            }
                        } else {
                            i2 = C67315QbP.LJIJJLI(parcel, readInt);
                        }
                    } else {
                        z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    }
                } else {
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new RootTelemetryConfiguration(i, i2, i3, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RootTelemetryConfiguration[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
