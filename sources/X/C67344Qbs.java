package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import java.util.ArrayList;

/* renamed from: X.Qbs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67344Qbs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    pendingIntent = (PendingIntent) C67315QbP.LJI(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 5:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveAccountLinkingTokenRequest[i];
    }
}
