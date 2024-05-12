package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* renamed from: X.Qju, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67842Qju implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C67315QbP.LJI(parcel, readInt, ConnectionTelemetryConfiguration.CREATOR);
                        }
                    } else {
                        i = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    featureArr = (Feature[]) C67315QbP.LJIIJ(parcel, readInt, Feature.CREATOR);
                }
            } else {
                bundle = C67315QbP.LIZIZ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
