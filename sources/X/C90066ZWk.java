package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZWk, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90066ZWk implements Parcelable.Creator<MediaLoadRequestData> {
    @Override // android.os.Parcelable.Creator
    public final MediaLoadRequestData createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        JSONObject jSONObject = null;
        MediaInfo mediaInfo = null;
        MediaQueueData mediaQueueData = null;
        Boolean bool = null;
        long[] jArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        String str5 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) C67315QbP.LJI(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    mediaQueueData = (MediaQueueData) C67315QbP.LJI(parcel, readInt, MediaQueueData.CREATOR);
                    break;
                case 4:
                    bool = C67315QbP.LJIILJJIL(parcel, readInt);
                    break;
                case 5:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 6:
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case 7:
                    jArr = C67315QbP.LJFF(parcel, readInt);
                    break;
                case '\b':
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\n':
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\f':
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        if (str5 != null) {
            try {
                jSONObject = new JSONObject(str5);
            } catch (JSONException unused) {
            }
        }
        return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d, jArr, jSONObject, str, str2, str3, str4, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaLoadRequestData[] newArray(int i) {
        return new MediaLoadRequestData[i];
    }
}
