package com.google.android.gms.fido.u2f.api.common;

import X.C64363PNv;
import X.C67335Qbj;
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
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new C67335Qbj();
    public final Integer zza;
    public final Double zzb;
    public final Uri zzc;
    public final List zzd;
    public final List zze;
    public final ChannelIdValue zzf;
    public final String zzg;
    public Set zzh;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg});
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (C64363PNv.LIZ(this.zza, registerRequestParams.zza) && C64363PNv.LIZ(this.zzb, registerRequestParams.zzb) && C64363PNv.LIZ(this.zzc, registerRequestParams.zzc) && C64363PNv.LIZ(this.zzd, registerRequestParams.zzd) && ((list = this.zze) != null ? !((list2 = registerRequestParams.zze) == null || !list.containsAll(list2) || !registerRequestParams.zze.containsAll(this.zze)) : registerRequestParams.zze == null) && C64363PNv.LIZ(this.zzf, registerRequestParams.zzf) && C64363PNv.LIZ(this.zzg, registerRequestParams.zzg)) {
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
        C79057V0z.LJLIIL(parcel, 5, this.zzd, false);
        C79057V0z.LJLIIL(parcel, 6, this.zze, false);
        C79057V0z.LJJZZI(parcel, 7, this.zzf, i, false);
        C79057V0z.LJJZZIII(parcel, 8, this.zzg, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        QH7.LIZ("empty list of register requests is provided", z);
        this.zzd = list;
        this.zze = list2;
        this.zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            if (uri != null || registerRequest.zzd != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            QH7.LIZ("register request has null appId and no request appId is provided", z3);
            String str2 = registerRequest.zzd;
            if (str2 != null) {
                hashSet.add(UriProtector.parse(str2));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            if (uri != null || registeredKey.zzc != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            QH7.LIZ("registered key has null appId and no request appId is provided", z2);
            String str3 = registeredKey.zzc;
            if (str3 != null) {
                hashSet.add(UriProtector.parse(str3));
            }
        }
        this.zzh = hashSet;
        QH7.LIZ("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.zzg = str;
    }
}
