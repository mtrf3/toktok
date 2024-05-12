package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* renamed from: X.QbV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67321QbV implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final WakeLockEvent createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
                case 4:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 6:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case '\b':
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\n':
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\f':
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 14:
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 15:
                    f = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    j3 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 17:
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 18:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
