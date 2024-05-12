package com.google.android.gms.fido.fido2.api.common;

import X.C67329Qbd;
import X.C67337Qbl;
import X.C67339Qbn;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new C67337Qbl();
    public final PublicKeyCredentialType zza;
    public final COSEAlgorithmIdentifier zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        if (!this.zza.equals(publicKeyCredentialParameters.zza) || !this.zzb.equals(publicKeyCredentialParameters.zzb)) {
            return false;
        }
        return true;
    }

    public PublicKeyCredentialParameters(String str, int i) {
        QH7.LJIIIIZZ(str);
        try {
            this.zza = PublicKeyCredentialType.fromString(str);
            QH7.LJIIIIZZ(Integer.valueOf(i));
            try {
                this.zzb = COSEAlgorithmIdentifier.LIZ(i);
            } catch (C67339Qbn e) {
                throw new IllegalArgumentException(e);
            }
        } catch (C67329Qbd e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza.toString(), false);
        C79057V0z.LJJLJ(parcel, 3, Integer.valueOf(this.zzb.LIZIZ()));
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
