package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* renamed from: X.ZWw, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90078ZWw implements Parcelable.Creator<ApplicationMetadata> {
    @Override // android.os.Parcelable.Creator
    public final ApplicationMetadata createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        android.net.Uri uri = null;
        String str4 = null;
        String str5 = null;
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
                    C67315QbP.LJIIJJI(parcel, readInt, WebImage.CREATOR);
                    break;
                case 5:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 6:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    uri = (android.net.Uri) C67315QbP.LJI(parcel, readInt, android.net.Uri.CREATOR);
                    break;
                case '\b':
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new ApplicationMetadata(str, str2, arrayList, str3, uri, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ApplicationMetadata[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
