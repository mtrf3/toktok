package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.TextTrackStyle;

/* renamed from: X.ZWy, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90080ZWy implements Parcelable.Creator<TextTrackStyle> {
    @Override // android.os.Parcelable.Creator
    public final TextTrackStyle createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    f = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 3:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 4:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 6:
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 7:
                    i5 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\b':
                    i6 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\t':
                    i7 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\n':
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i8 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\f':
                    i9 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new TextTrackStyle(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TextTrackStyle[] newArray(int i) {
        return new TextTrackStyle[i];
    }
}
