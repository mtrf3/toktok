package com.google.android.gms.cast.framework.media;

import X.C79057V0z;
import X.C90127ZYt;
import X.C90641Zhl;
import X.ZZ2;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes29.dex */
public class NotificationOptions extends AbstractSafeParcelable {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final ZZ2 zzH;
    public final List<String> zzc;
    public final int[] zzd;
    public final long zze;
    public final String zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final int zzl;
    public final int zzm;
    public final int zzn;
    public final int zzo;
    public final int zzp;
    public final int zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final int zzz;
    public static final List<String> zza = Arrays.asList("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING");
    public static final int[] zzb = {0, 1};
    public static final Parcelable.Creator<NotificationOptions> CREATOR = new C90127ZYt();

    public final int[] LJJJJL() {
        int[] iArr = this.zzd;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLI(parcel, 2, this.zzc);
        C79057V0z.LJJLIIJ(parcel, 3, LJJJJL());
        C79057V0z.LJJLJLI(parcel, 4, this.zze);
        C79057V0z.LJJZZIII(parcel, 5, this.zzf, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zzg);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 7, this.zzh);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 8, this.zzi);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 9, this.zzj);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 10, this.zzk);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 11, this.zzl);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 12, this.zzm);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 13, this.zzn);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 14, this.zzo);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 15, this.zzp);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 16, this.zzq);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 17, this.zzr);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 18, this.zzs);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 19, this.zzt);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 20, this.zzu);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 21, this.zzv);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 22, this.zzw);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 23, this.zzx);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 24, this.zzy);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 25, this.zzz);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 26, this.zzA);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 27, this.zzB);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 28, this.zzC);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 29, this.zzD);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 30, this.zzE);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 31, this.zzF);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 32, this.zzG);
        ZZ2 zz2 = this.zzH;
        if (zz2 == null) {
            asBinder = null;
        } else {
            asBinder = zz2.asBinder();
        }
        C79057V0z.LJJLIIIJLJLI(parcel, 33, asBinder);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public NotificationOptions(List<String> list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        ZZ2 c90641Zhl;
        this.zzc = new ArrayList(list);
        this.zzd = Arrays.copyOf(iArr, iArr.length);
        this.zze = j;
        this.zzf = str;
        this.zzg = i;
        this.zzh = i2;
        this.zzi = i3;
        this.zzj = i4;
        this.zzk = i5;
        this.zzl = i6;
        this.zzm = i7;
        this.zzn = i8;
        this.zzo = i9;
        this.zzp = i10;
        this.zzq = i11;
        this.zzr = i12;
        this.zzs = i13;
        this.zzt = i14;
        this.zzu = i15;
        this.zzv = i16;
        this.zzw = i17;
        this.zzx = i18;
        this.zzy = i19;
        this.zzz = i20;
        this.zzA = i21;
        this.zzB = i22;
        this.zzC = i23;
        this.zzD = i24;
        this.zzE = i25;
        this.zzF = i26;
        this.zzG = i27;
        if (iBinder == null) {
            this.zzH = null;
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        if (queryLocalInterface instanceof ZZ2) {
            c90641Zhl = (ZZ2) queryLocalInterface;
        } else {
            c90641Zhl = new C90641Zhl(iBinder);
        }
        this.zzH = c90641Zhl;
    }
}
