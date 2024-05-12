package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.wallet.zza;

/* renamed from: X.QyA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68726QyA implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
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
        String str10 = null;
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
                    str6 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    str7 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    str8 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\n':
                    str9 = C67315QbP.LJII(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\f':
                    str10 = C67315QbP.LJII(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zza(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
