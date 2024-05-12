package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;

/* renamed from: X.ZWs, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90074ZWs implements Parcelable.Creator<MediaQueueItem> {
    @Override // android.os.Parcelable.Creator
    public final MediaQueueItem createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) C67315QbP.LJI(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 4:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 5:
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case 6:
                    d2 = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case 7:
                    d3 = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case '\b':
                    jArr = C67315QbP.LJFF(parcel, readInt);
                    break;
                case '\t':
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MediaQueueItem(mediaInfo, i, z, d, d2, d3, jArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaQueueItem[] newArray(int i) {
        return new MediaQueueItem[i];
    }
}
