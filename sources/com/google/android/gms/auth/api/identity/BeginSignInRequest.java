package com.google.android.gms.auth.api.identity;

import X.C64363PNv;
import X.C67672QhA;
import X.C68862R0w;
import X.C68863R0x;
import X.C68864R0y;
import X.C68865R0z;
import X.C79057V0z;
import X.QH7;
import X.R10;
import X.R11;
import X.R12;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C68863R0x();
    public final PasswordRequestOptions zba;
    public final GoogleIdTokenRequestOptions zbb;
    public final String zbc;
    public final boolean zbd;
    public final int zbe;
    public final PasskeysRequestOptions zbf;
    public final PasskeyJsonRequestOptions zbg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbf, this.zbg, this.zbc, Boolean.valueOf(this.zbd)});
    }

    /* loaded from: classes12.dex */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C67672QhA();
        public final boolean zba;
        public final String zbb;
        public final String zbc;
        public final boolean zbd;
        public final String zbe;
        public final List zbf;
        public final boolean zbg;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf, Boolean.valueOf(this.zbg)});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.zba != googleIdTokenRequestOptions.zba || !C64363PNv.LIZ(this.zbb, googleIdTokenRequestOptions.zbb) || !C64363PNv.LIZ(this.zbc, googleIdTokenRequestOptions.zbc) || this.zbd != googleIdTokenRequestOptions.zbd || !C64363PNv.LIZ(this.zbe, googleIdTokenRequestOptions.zbe) || !C64363PNv.LIZ(this.zbf, googleIdTokenRequestOptions.zbf) || this.zbg != googleIdTokenRequestOptions.zbg) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int LJLIL = C79057V0z.LJLIL(parcel, 20293);
            C79057V0z.LJJJZ(parcel, 1, this.zba);
            C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
            C79057V0z.LJJZZIII(parcel, 3, this.zbc, false);
            C79057V0z.LJJJZ(parcel, 4, this.zbd);
            C79057V0z.LJJZZIII(parcel, 5, this.zbe, false);
            C79057V0z.LJLI(parcel, 6, this.zbf);
            C79057V0z.LJJJZ(parcel, 7, this.zbg);
            C79057V0z.LJLILLLLZI(parcel, LJLIL);
        }

        public GoogleIdTokenRequestOptions(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
            boolean z4;
            ArrayList arrayList;
            if (!z2 || !z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            QH7.LIZ("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.zba = z;
            if (z) {
                QH7.LJIIIZ(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z2;
            if (list == null || list.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z3;
        }
    }

    /* loaded from: classes12.dex */
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new C68865R0z();
        public final boolean zba;
        public final String zbb;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbb});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            if (this.zba == passkeyJsonRequestOptions.zba && C64363PNv.LIZ(this.zbb, passkeyJsonRequestOptions.zbb)) {
                return true;
            }
            return false;
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                QH7.LJIIIIZZ(str);
            }
            this.zba = z;
            this.zbb = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int LJLIL = C79057V0z.LJLIL(parcel, 20293);
            C79057V0z.LJJJZ(parcel, 1, this.zba);
            C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
            C79057V0z.LJLILLLLZI(parcel, LJLIL);
        }
    }

    /* loaded from: classes12.dex */
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new C68862R0w();
        public final boolean zba;
        public final byte[] zbb;
        public final String zbc;

        public final int hashCode() {
            return Arrays.hashCode(this.zbb) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba), this.zbc}) * 31);
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            if (this.zba == passkeysRequestOptions.zba && Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && ((str = this.zbc) == (str2 = passkeysRequestOptions.zbc) || (str != null && str.equals(str2)))) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int LJLIL = C79057V0z.LJLIL(parcel, 20293);
            C79057V0z.LJJJZ(parcel, 1, this.zba);
            C79057V0z.LJJLIIIJ(parcel, 2, this.zbb, false);
            C79057V0z.LJJZZIII(parcel, 3, this.zbc, false);
            C79057V0z.LJLILLLLZI(parcel, LJLIL);
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                QH7.LJIIIIZZ(bArr);
                QH7.LJIIIIZZ(str);
            }
            this.zba = z;
            this.zbb = bArr;
            this.zbc = str;
        }
    }

    /* loaded from: classes12.dex */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new R10();
        public final boolean zba;

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zba)});
        }

        public PasswordRequestOptions(boolean z) {
            this.zba = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.zba != ((PasswordRequestOptions) obj).zba) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int LJLIL = C79057V0z.LJLIL(parcel, 20293);
            C79057V0z.LJJJZ(parcel, 1, this.zba);
            C79057V0z.LJLILLLLZI(parcel, LJLIL);
        }
    }

    public static C68864R0y LJJJJL(BeginSignInRequest beginSignInRequest) {
        C68864R0y c68864R0y = new C68864R0y();
        GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.zbb;
        QH7.LJIIIIZZ(googleIdTokenRequestOptions);
        c68864R0y.LIZIZ = googleIdTokenRequestOptions;
        PasswordRequestOptions passwordRequestOptions = beginSignInRequest.zba;
        QH7.LJIIIIZZ(passwordRequestOptions);
        c68864R0y.LIZ = passwordRequestOptions;
        PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.zbf;
        QH7.LJIIIIZZ(passkeysRequestOptions);
        c68864R0y.LIZJ = passkeysRequestOptions;
        PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.zbg;
        QH7.LJIIIIZZ(passkeyJsonRequestOptions);
        c68864R0y.LIZLLL = passkeyJsonRequestOptions;
        c68864R0y.LJFF = beginSignInRequest.zbd;
        c68864R0y.LJI = beginSignInRequest.zbe;
        String str = beginSignInRequest.zbc;
        if (str != null) {
            c68864R0y.LJ = str;
        }
        return c68864R0y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!C64363PNv.LIZ(this.zba, beginSignInRequest.zba) || !C64363PNv.LIZ(this.zbb, beginSignInRequest.zbb) || !C64363PNv.LIZ(this.zbf, beginSignInRequest.zbf) || !C64363PNv.LIZ(this.zbg, beginSignInRequest.zbg) || !C64363PNv.LIZ(this.zbc, beginSignInRequest.zbc) || this.zbd != beginSignInRequest.zbd || this.zbe != beginSignInRequest.zbe) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zba, i, false);
        C79057V0z.LJJZZI(parcel, 2, this.zbb, i, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zbc, false);
        C79057V0z.LJJJZ(parcel, 4, this.zbd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zbe);
        C79057V0z.LJJZZI(parcel, 6, this.zbf, i, false);
        C79057V0z.LJJZZI(parcel, 7, this.zbg, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
        QH7.LJIIIIZZ(passwordRequestOptions);
        this.zba = passwordRequestOptions;
        QH7.LJIIIIZZ(googleIdTokenRequestOptions);
        this.zbb = googleIdTokenRequestOptions;
        this.zbc = str;
        this.zbd = z;
        this.zbe = i;
        if (passkeysRequestOptions == null) {
            R11 r11 = new R11();
            r11.LIZ = false;
            boolean z2 = r11.LIZ;
            passkeysRequestOptions = new PasskeysRequestOptions(r11.LIZJ, r11.LIZIZ, z2);
        }
        this.zbf = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            R12 r12 = new R12();
            r12.LIZ = false;
            passkeyJsonRequestOptions = new PasskeyJsonRequestOptions(r12.LIZ, r12.LIZIZ);
        }
        this.zbg = passkeyJsonRequestOptions;
    }
}
