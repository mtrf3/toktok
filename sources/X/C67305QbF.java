package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;

/* renamed from: X.QbF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67305QbF implements Parcelable.Creator<SafeParcelResponse> {
    @Override // android.os.Parcelable.Creator
    public final SafeParcelResponse createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        zanVar = (zan) C67315QbP.LJI(parcel, readInt, zan.CREATOR);
                    }
                } else {
                    int LJJIFFI = C67315QbP.LJJIFFI(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (LJJIFFI == 0) {
                        parcel2 = null;
                    } else {
                        parcel2 = Parcel.obtain();
                        parcel2.appendFrom(parcel, dataPosition, LJJIFFI);
                        parcel.setDataPosition(dataPosition + LJJIFFI);
                    }
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new SafeParcelResponse(i, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeParcelResponse[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
