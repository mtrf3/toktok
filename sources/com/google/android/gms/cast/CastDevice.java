package com.google.android.gms.cast;

import X.C16880lQ;
import X.C79057V0z;
import X.C90468Zey;
import X.ZX3;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes29.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new ZX3();
    public final String LJLIL;
    public String zzb;
    public InetAddress zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public int zzg;
    public List<WebImage> zzh;
    public int zzi;
    public int zzj;
    public String zzk;
    public final String zzl;
    public int zzm;
    public final String zzn;
    public byte[] zzo;
    public final String zzp;
    public final boolean zzq;

    public final boolean LJJJJZ(int i) {
        return (this.zzi & i) == i;
    }

    public final String toString() {
        return C16880lQ.LLLZ("\"%s\" (%s)", new Object[]{this.zzd, this.zzb});
    }

    public final int hashCode() {
        String str = this.zzb;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static CastDevice LJJJJL(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.zzb;
        if (str == null) {
            if (castDevice.zzb == null) {
                return true;
            }
            return false;
        }
        if (C90468Zey.LJFF(str, castDevice.zzb) && C90468Zey.LJFF(this.zzc, castDevice.zzc) && C90468Zey.LJFF(this.zze, castDevice.zze) && C90468Zey.LJFF(this.zzd, castDevice.zzd) && C90468Zey.LJFF(this.zzf, castDevice.zzf) && this.zzg == castDevice.zzg && C90468Zey.LJFF(this.zzh, castDevice.zzh) && this.zzi == castDevice.zzi && this.zzj == castDevice.zzj && C90468Zey.LJFF(this.zzk, castDevice.zzk) && C90468Zey.LJFF(Integer.valueOf(this.zzm), Integer.valueOf(castDevice.zzm)) && C90468Zey.LJFF(this.zzn, castDevice.zzn) && C90468Zey.LJFF(this.zzl, castDevice.zzl) && C90468Zey.LJFF(this.zzf, castDevice.zzf) && this.zzg == castDevice.zzg && ((((bArr = this.zzo) == null && castDevice.zzo == null) || Arrays.equals(bArr, castDevice.zzo)) && C90468Zey.LJFF(this.zzp, castDevice.zzp) && this.zzq == castDevice.zzq)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 3, this.LJLIL, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzd, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zze, false);
        C79057V0z.LJJZZIII(parcel, 6, this.zzf, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 7, this.zzg);
        C79057V0z.LJLIIL(parcel, 8, Collections.unmodifiableList(this.zzh), false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 9, this.zzi);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 10, this.zzj);
        C79057V0z.LJJZZIII(parcel, 11, this.zzk, false);
        C79057V0z.LJJZZIII(parcel, 12, this.zzl, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 13, this.zzm);
        C79057V0z.LJJZZIII(parcel, 14, this.zzn, false);
        C79057V0z.LJJLIIIJ(parcel, 15, this.zzo, false);
        C79057V0z.LJJZZIII(parcel, 16, this.zzp, false);
        C79057V0z.LJJJZ(parcel, 17, this.zzq);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List<WebImage> list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z) {
        this.zzb = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.LJLIL = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.zzc = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                new StringBuilder(String.valueOf(this.LJLIL).length() + 48 + String.valueOf(e.getMessage()).length());
            }
        }
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = str5 == null ? "" : str5;
        this.zzg = i;
        this.zzh = list == null ? new ArrayList<>() : list;
        this.zzi = i2;
        this.zzj = i3;
        this.zzk = str6 != null ? str6 : "";
        this.zzl = str7;
        this.zzm = i4;
        this.zzn = str8;
        this.zzo = bArr;
        this.zzp = str9;
        this.zzq = z;
    }
}
