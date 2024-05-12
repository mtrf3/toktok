package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC87478YUw;
import X.C67325QbZ;
import X.C67326Qba;
import X.C67329Qbd;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public final PublicKeyCredentialType zzb;
    public final byte[] zzc;
    public final List zzd;
    public static final AbstractC87478YUw zza = AbstractC87478YUw.zzi(C67326Qba.LIZ, C67326Qba.LIZIZ);
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new C67325QbZ();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !Arrays.equals(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        List list = this.zzd;
        if (list == null) {
            if (publicKeyCredentialDescriptor.zzd == null) {
                return true;
            }
        } else {
            List list2 = publicKeyCredentialDescriptor.zzd;
            if (list2 != null && list.containsAll(list2) && publicKeyCredentialDescriptor.zzd.containsAll(this.zzd)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb.toString(), false);
        C79057V0z.LJJLIIIJ(parcel, 3, this.zzc, false);
        C79057V0z.LJLIIL(parcel, 4, this.zzd, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List<Transport> list) {
        QH7.LJIIIIZZ(str);
        try {
            this.zzb = PublicKeyCredentialType.fromString(str);
            QH7.LJIIIIZZ(bArr);
            this.zzc = bArr;
            this.zzd = list;
        } catch (C67329Qbd e) {
            throw new IllegalArgumentException(e);
        }
    }
}
