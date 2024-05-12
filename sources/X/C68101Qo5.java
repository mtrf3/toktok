package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzlo;

/* renamed from: X.Qo5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68101Qo5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 4:
                    l = C67315QbP.LJJI(parcel, readInt);
                    break;
                case 5:
                    f = C67315QbP.LJIJI(parcel, readInt);
                    break;
                case 6:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    d = C67315QbP.LJIIZILJ(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzlo(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlo[i];
    }

    public static void LIZ(zzlo zzloVar, Parcel parcel) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, zzloVar.zza);
        C79057V0z.LJJZZIII(parcel, 2, zzloVar.zzb, false);
        C79057V0z.LJJLJLI(parcel, 3, zzloVar.zzc);
        C79057V0z.LJJZ(parcel, 4, zzloVar.zzd);
        C79057V0z.LJJZZIII(parcel, 6, zzloVar.zze, false);
        C79057V0z.LJJZZIII(parcel, 7, zzloVar.zzf, false);
        C79057V0z.LJJLIIIJJI(parcel, 8, zzloVar.zzg);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
