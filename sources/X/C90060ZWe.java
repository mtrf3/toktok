package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZWe, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90060ZWe implements Parcelable.Creator<MediaError> {
    @Override // android.os.Parcelable.Creator
    public final MediaError createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        JSONObject jSONObject = null;
        Integer num = null;
        String str = null;
        long j = 0;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                str2 = C67315QbP.LJII(parcel, readInt);
                            }
                        } else {
                            str = C67315QbP.LJII(parcel, readInt);
                        }
                    } else {
                        num = C67315QbP.LJIL(parcel, readInt);
                    }
                } else {
                    j = C67315QbP.LJJ(parcel, readInt);
                }
            } else {
                str3 = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        if (str2 != null) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
            }
        }
        return new MediaError(str3, j, num, str, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaError[] newArray(int i) {
        return new MediaError[i];
    }
}
