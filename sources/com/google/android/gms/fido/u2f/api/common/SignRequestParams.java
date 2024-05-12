package com.google.android.gms.fido.u2f.api.common;

import X.C64363PNv;
import X.C67336Qbk;
import X.C79057V0z;
import X.QH7;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes12.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new C67336Qbk();
    public final Integer zza;
    public final Double zzb;
    public final Uri zzc;
    public final byte[] zzd;
    public final List zze;
    public final ChannelIdValue zzf;
    public final String zzg;
    public final Set zzh;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zzb, this.zze, this.zzf, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (C64363PNv.LIZ(this.zza, signRequestParams.zza) && C64363PNv.LIZ(this.zzb, signRequestParams.zzb) && C64363PNv.LIZ(this.zzc, signRequestParams.zzc) && Arrays.equals(this.zzd, signRequestParams.zzd) && this.zze.containsAll(signRequestParams.zze) && signRequestParams.zze.containsAll(this.zze) && C64363PNv.LIZ(this.zzf, signRequestParams.zzf) && C64363PNv.LIZ(this.zzg, signRequestParams.zzg)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJ(parcel, 2, this.zza);
        C79057V0z.LJJLIIIJJI(parcel, 3, this.zzb);
        C79057V0z.LJJZZI(parcel, 4, this.zzc, i, false);
        C79057V0z.LJJLIIIJ(parcel, 5, this.zzd, false);
        C79057V0z.LJLIIL(parcel, 6, this.zze, false);
        C79057V0z.LJJZZI(parcel, 7, this.zzf, i, false);
        C79057V0z.LJJZZIII(parcel, 8, this.zzg, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        this.zzd = bArr;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        QH7.LIZ("registeredKeys must not be null or empty", z);
        this.zze = list;
        this.zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            if (registeredKey.zzc != null || uri != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            QH7.LIZ("registered key has null appId and no request appId is provided", z2);
            String str2 = registeredKey.zzc;
            if (str2 != null) {
                hashSet.add(UriProtector.parse(str2));
            }
        }
        this.zzh = hashSet;
        QH7.LIZ("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.zzg = str;
    }
}
