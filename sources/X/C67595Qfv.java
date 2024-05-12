package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* renamed from: X.Qfv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67595Qfv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = "";
        String str2 = null;
        String str3 = "";
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    str6 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 7:
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\b':
                    str7 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\n':
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    j6 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\f':
                    str8 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    j3 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 14:
                    j4 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 15:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 17:
                case 20:
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
                case 18:
                    z4 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 19:
                    str9 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 21:
                    bool = C67315QbP.LJIILJJIL(parcel, readInt);
                    break;
                case 22:
                    j5 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 23:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 24:
                    str10 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 25:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 26:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 27:
                    str11 = C67315QbP.LJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzq(str2, str4, str5, str6, j, j2, str7, z, z2, j6, str8, j3, j4, i, z3, z4, str9, bool, j5, arrayList, str10, str, str3, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
