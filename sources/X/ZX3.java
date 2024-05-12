package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public final class ZX3 implements Parcelable.Creator<CastDevice> {
    @Override // android.os.Parcelable.Creator
    public final CastDevice createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        boolean z = false;
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
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\b':
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, WebImage.CREATOR);
                    break;
                case '\t':
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\n':
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    str6 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\f':
                    str7 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 14:
                    str8 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 15:
                    bArr = C67315QbP.LIZJ(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    str9 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 17:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i3, str6, str7, i4, str8, bArr, str9, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }
}
