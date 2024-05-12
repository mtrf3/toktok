package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;

/* renamed from: X.Qbj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67335Qbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        Integer num = null;
        Double d = null;
        android.net.Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ChannelIdValue channelIdValue = null;
        String str = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    num = C67315QbP.LJIL(parcel, readInt);
                    break;
                case 3:
                    d = C67315QbP.LJIIZILJ(parcel, readInt);
                    break;
                case 4:
                    uri = (android.net.Uri) C67315QbP.LJI(parcel, readInt, android.net.Uri.CREATOR);
                    break;
                case 5:
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, RegisterRequest.CREATOR);
                    break;
                case 6:
                    arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) C67315QbP.LJI(parcel, readInt, ChannelIdValue.CREATOR);
                    break;
                case '\b':
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new RegisterRequestParams(num, d, uri, arrayList, arrayList2, channelIdValue, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequestParams[i];
    }
}
