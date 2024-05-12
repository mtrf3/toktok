package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZWv, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90077ZWv implements Parcelable.Creator<MediaTrack> {
    @Override // android.os.Parcelable.Creator
    public final MediaTrack createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        JSONObject jSONObject = null;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 3:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 4:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\t':
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case '\n':
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return new MediaTrack(j, i, str2, str3, str4, str5, i2, arrayList, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack[] newArray(int i) {
        return new MediaTrack[i];
    }
}
