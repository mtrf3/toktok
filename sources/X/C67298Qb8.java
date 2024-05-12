package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;

/* renamed from: X.Qb8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67298Qb8 implements Parcelable.Creator<CloudMessage> {
    @Override // android.os.Parcelable.Creator
    public final CloudMessage createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                intent = (Intent) C67315QbP.LJI(parcel, readInt, Intent.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessage[] newArray(int i) {
        return new CloudMessage[i];
    }
}
