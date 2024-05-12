package com.google.android.gms.fido.fido2.api.common;

import X.C79004UzY;
import X.C79057V0z;
import X.QH7;
import X.R14;
import X.R15;
import X.R16;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public final TokenBindingStatus zza;
    public final String zzb;
    public static final Parcelable.Creator<TokenBinding> CREATOR = new R14();
    public static final TokenBinding SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    /* loaded from: classes12.dex */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new R15();
        public final String zzb;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.zzb;
        }

        public static TokenBindingStatus fromString(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new R16(str);
        }

        public static TokenBindingStatus valueOf(String str) {
            return (TokenBindingStatus) V0N.LJJJ(TokenBindingStatus.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }

        TokenBindingStatus(String str) {
            this.zzb = str;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        if (!C79004UzY.LJJL(this.zza, tokenBinding.zza) || !C79004UzY.LJJL(this.zzb, tokenBinding.zzb)) {
            return false;
        }
        return true;
    }

    public TokenBinding(String str, String str2) {
        QH7.LJIIIIZZ(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (R16 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza.toString(), false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
