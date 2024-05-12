package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.ArrayList;

/* renamed from: X.ZYt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90127ZYt implements Parcelable.Creator<NotificationOptions> {
    @Override // android.os.Parcelable.Creator
    public final NotificationOptions createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 3:
                    iArr = C67315QbP.LIZLLL(parcel, readInt);
                    break;
                case 4:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 5:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 7:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\b':
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\t':
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\n':
                    i5 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i6 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\f':
                    i7 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    i8 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 14:
                    i9 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 15:
                    i10 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    i11 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 17:
                    i12 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 18:
                    i13 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 19:
                    i14 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 20:
                    i15 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 21:
                    i16 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 22:
                    i17 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 23:
                    i18 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 24:
                    i19 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 25:
                    i20 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 26:
                    i21 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 27:
                    i22 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 28:
                    i23 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 29:
                    i24 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 30:
                    i25 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 31:
                    i26 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case ' ':
                    i27 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '!':
                    iBinder = C67315QbP.LJIJJ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new NotificationOptions(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ NotificationOptions[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
