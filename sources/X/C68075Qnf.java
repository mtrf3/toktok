package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;

/* renamed from: X.Qnf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68075Qnf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        zzlo zzloVar = null;
        String str3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
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
                    zzloVar = (zzlo) C67315QbP.LJI(parcel, readInt, zzlo.CREATOR);
                    break;
                case 5:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 6:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 7:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    zzawVar = (zzaw) C67315QbP.LJI(parcel, readInt, zzaw.CREATOR);
                    break;
                case '\t':
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\n':
                    zzawVar2 = (zzaw) C67315QbP.LJI(parcel, readInt, zzaw.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    j3 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case '\f':
                    zzawVar3 = (zzaw) C67315QbP.LJI(parcel, readInt, zzaw.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzac(str, str2, zzloVar, j, z, str3, zzawVar, j2, zzawVar2, j3, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
