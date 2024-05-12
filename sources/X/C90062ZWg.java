package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import java.util.ArrayList;

/* renamed from: X.ZWg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90062ZWg implements Parcelable.Creator<MediaInfo> {
    @Override // android.os.Parcelable.Creator
    public final MediaInfo createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        MediaMetadata mediaMetadata = null;
        ArrayList arrayList = null;
        TextTrackStyle textTrackStyle = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        VastAdsRequest vastAdsRequest = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 4:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) C67315QbP.LJI(parcel, readInt, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 7:
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, MediaTrack.CREATOR);
                    break;
                case '\b':
                    textTrackStyle = (TextTrackStyle) C67315QbP.LJI(parcel, readInt, TextTrackStyle.CREATOR);
                    break;
                case '\t':
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\n':
                    arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, AdBreakInfo.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    arrayList3 = C67315QbP.LJIIJJI(parcel, readInt, AdBreakClipInfo.CREATOR);
                    break;
                case '\f':
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    vastAdsRequest = (VastAdsRequest) C67315QbP.LJI(parcel, readInt, VastAdsRequest.CREATOR);
                    break;
                case 14:
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 15:
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    str6 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 17:
                    str7 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 18:
                    str8 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MediaInfo(str, i, str2, mediaMetadata, j, arrayList, textTrackStyle, str3, arrayList2, arrayList3, str4, vastAdsRequest, j2, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo[] newArray(int i) {
        return new MediaInfo[i];
    }
}
