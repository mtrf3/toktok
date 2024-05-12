package com.google.android.gms.fido.fido2.api.common;

import X.C67338Qbm;
import X.C67339Qbn;
import X.EnumC67340Qbo;
import X.EnumC67341Qbp;
import X.InterfaceC67342Qbq;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new C67338Qbm();
    public final InterfaceC67342Qbq zza;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final int LIZIZ() {
        return this.zza.getAlgoValue();
    }

    public COSEAlgorithmIdentifier(InterfaceC67342Qbq interfaceC67342Qbq) {
        QH7.LJIIIIZZ(interfaceC67342Qbq);
        this.zza = interfaceC67342Qbq;
    }

    public static COSEAlgorithmIdentifier LIZ(int i) {
        InterfaceC67342Qbq interfaceC67342Qbq;
        if (i == EnumC67340Qbo.LEGACY_RS1.getAlgoValue()) {
            interfaceC67342Qbq = EnumC67340Qbo.RS1;
        } else {
            InterfaceC67342Qbq[] values = EnumC67340Qbo.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    interfaceC67342Qbq = values[i2];
                    if (interfaceC67342Qbq.getAlgoValue() == i) {
                        break;
                    }
                    i2++;
                } else {
                    InterfaceC67342Qbq[] values2 = EnumC67341Qbp.values();
                    int length2 = values2.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        interfaceC67342Qbq = values2[i3];
                        if (interfaceC67342Qbq.getAlgoValue() != i) {
                        }
                    }
                    throw new C67339Qbn(i);
                }
            }
        }
        return new COSEAlgorithmIdentifier(interfaceC67342Qbq);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof COSEAlgorithmIdentifier) || this.zza.getAlgoValue() != ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue()) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
