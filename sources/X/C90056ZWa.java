package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.VastAdsRequest;

/* renamed from: X.ZWa, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90056ZWa implements Parcelable.Creator<AdBreakClipInfo> {
    @Override // android.os.Parcelable.Creator
    public final AdBreakClipInfo createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        VastAdsRequest vastAdsRequest = null;
        long j = 0;
        long j2 = 0;
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
                    j = C67315QbP.LJJ(parcel, readInt);
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
                    str6 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    str7 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\n':
                    str8 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\f':
                    str9 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    vastAdsRequest = (VastAdsRequest) C67315QbP.LJI(parcel, readInt, VastAdsRequest.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new AdBreakClipInfo(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, vastAdsRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdBreakClipInfo[] newArray(int i) {
        return new AdBreakClipInfo[i];
    }
}
