package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import java.util.ArrayList;

/* renamed from: X.ZWt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90075ZWt implements Parcelable.Creator<MediaStatus> {
    @Override // android.os.Parcelable.Creator
    public final MediaStatus createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) C67315QbP.LJI(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 4:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case 6:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 7:
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\b':
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\t':
                    j3 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\n':
                    d2 = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\f':
                    jArr = C67315QbP.LJFF(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 14:
                    i5 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 15:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    i6 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 17:
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) C67315QbP.LJI(parcel, readInt, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) C67315QbP.LJI(parcel, readInt, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) C67315QbP.LJI(parcel, readInt, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) C67315QbP.LJI(parcel, readInt, MediaQueueData.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaStatus[] newArray(int i) {
        return new MediaStatus[i];
    }
}
