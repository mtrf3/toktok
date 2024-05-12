package com.google.android.gms.fido.fido2.api.common;

import X.C16880lQ;
import X.C67329Qbd;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialType implements Parcelable {
    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR;
    public static final PublicKeyCredentialType PUBLIC_KEY;
    public static final /* synthetic */ PublicKeyCredentialType[] zza;
    public final String zzb = "public-key";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    static {
        PublicKeyCredentialType publicKeyCredentialType = new PublicKeyCredentialType();
        PUBLIC_KEY = publicKeyCredentialType;
        zza = new PublicKeyCredentialType[]{publicKeyCredentialType};
        CREATOR = new Parcelable.Creator() { // from class: X.Qbe
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                try {
                    return PublicKeyCredentialType.fromString(parcel.readString());
                } catch (C67329Qbd e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new PublicKeyCredentialType[i];
            }
        };
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) zza.clone();
    }

    public static PublicKeyCredentialType fromString(String str) {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            if (str.equals(publicKeyCredentialType.zzb)) {
                return publicKeyCredentialType;
            }
        }
        throw new C67329Qbd(C16880lQ.LLLZ("PublicKeyCredentialType %s not supported", new Object[]{str}));
    }

    public static PublicKeyCredentialType valueOf(String str) {
        return (PublicKeyCredentialType) V0N.LJJJ(PublicKeyCredentialType.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
