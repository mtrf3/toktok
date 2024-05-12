package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.RemoteMessage;

/* renamed from: X.QbA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67300QbA implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final RemoteMessage createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                bundle = C67315QbP.LIZIZ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
