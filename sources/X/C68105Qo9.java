package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: X.Qo9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68105Qo9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        zzau zzauVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            j = C67315QbP.LJJ(parcel, readInt);
                        }
                    } else {
                        str2 = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    zzauVar = (zzau) C67315QbP.LJI(parcel, readInt, zzau.CREATOR);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzaw(str, zzauVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaw[i];
    }

    public static void LIZ(zzaw zzawVar, Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, zzawVar.zza, false);
        C79057V0z.LJJZZI(parcel, 3, zzawVar.zzb, i, false);
        C79057V0z.LJJZZIII(parcel, 4, zzawVar.zzc, false);
        C79057V0z.LJJLJLI(parcel, 5, zzawVar.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
