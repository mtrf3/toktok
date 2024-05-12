package com.google.android.gms.fido.fido2.api.common;

import X.C58634Mzm;
import X.C64363PNv;
import X.C67631QgV;
import X.C68850R0k;
import X.C68852R0m;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new C67631QgV();
    public final Attachment zza;
    public final Boolean zzb;
    public final zzay zzc;
    public final ResidentKeyRequirement zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!C64363PNv.LIZ(this.zza, authenticatorSelectionCriteria.zza) || !C64363PNv.LIZ(this.zzb, authenticatorSelectionCriteria.zzb) || !C64363PNv.LIZ(this.zzc, authenticatorSelectionCriteria.zzc) || !C64363PNv.LIZ(this.zzd, authenticatorSelectionCriteria.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String attachment;
        String zzayVar;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        Attachment attachment2 = this.zza;
        String str = null;
        if (attachment2 == null) {
            attachment = null;
        } else {
            attachment = attachment2.toString();
        }
        C79057V0z.LJJZZIII(parcel, 2, attachment, false);
        C79057V0z.LJJL(parcel, 3, this.zzb);
        zzay zzayVar2 = this.zzc;
        if (zzayVar2 == null) {
            zzayVar = null;
        } else {
            zzayVar = zzayVar2.toString();
        }
        C79057V0z.LJJZZIII(parcel, 4, zzayVar, false);
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement != null) {
            str = residentKeyRequirement.toString();
        }
        C79057V0z.LJJZZIII(parcel, 5, str, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment fromString;
        zzay zza;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = Attachment.fromString(str);
            } catch (C58634Mzm | C68850R0k | C68852R0m e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        if (str2 == null) {
            zza = null;
        } else {
            zza = zzay.zza(str2);
        }
        this.zzc = zza;
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.fromString(str3);
        }
        this.zzd = residentKeyRequirement;
    }
}
