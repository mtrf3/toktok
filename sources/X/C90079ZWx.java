package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.SessionState;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZWx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90079ZWx implements Parcelable.Creator<SessionState> {
    @Override // android.os.Parcelable.Creator
    public final SessionState createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        JSONObject jSONObject = null;
        String str = null;
        MediaLoadRequestData mediaLoadRequestData = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                mediaLoadRequestData = (MediaLoadRequestData) C67315QbP.LJI(parcel, readInt, MediaLoadRequestData.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return new SessionState(mediaLoadRequestData, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SessionState[] newArray(int i) {
        return new SessionState[i];
    }
}
