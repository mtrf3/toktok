package com.facebook;

import X.C64079PCx;
import X.C79062V1e;
import X.Q4J;
import X.Q5T;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class AuthenticationToken implements Parcelable {
    public final AuthenticationTokenClaims claims;
    public final String expectedNonce;
    public final AuthenticationTokenHeader header;
    public final String signature;
    public final String token;
    public static final Q5T Companion = new Q5T();
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new IDCreatorS54S0000000_11(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.token);
        jSONObject.put("expected_nonce", this.expectedNonce);
        AuthenticationTokenHeader authenticationTokenHeader = this.header;
        authenticationTokenHeader.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", authenticationTokenHeader.alg);
        jSONObject2.put("typ", authenticationTokenHeader.typ);
        jSONObject2.put("kid", authenticationTokenHeader.kid);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.claims.LIZ());
        jSONObject.put("signature", this.signature);
        return jSONObject;
    }

    public final int hashCode() {
        return this.signature.hashCode() + ((this.claims.hashCode() + ((this.header.hashCode() + C79062V1e.LJ(this.expectedNonce, C79062V1e.LJ(this.token, 527, 31), 31)) * 31)) * 31);
    }

    public AuthenticationToken(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Q4J.LJFF(readString, "token");
        this.token = readString;
        String readString2 = parcel.readString();
        Q4J.LJFF(readString2, "expectedNonce");
        this.expectedNonce = readString2;
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.header = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) readParcelable2;
                String readString3 = parcel.readString();
                Q4J.LJFF(readString3, "signature");
                this.signature = readString3;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        if (o.LJ(this.token, authenticationToken.token) && o.LJ(this.expectedNonce, authenticationToken.expectedNonce) && o.LJ(this.header, authenticationToken.header) && o.LJ(this.claims, authenticationToken.claims) && o.LJ(this.signature, authenticationToken.signature)) {
            return true;
        }
        return false;
    }

    public AuthenticationToken(String str, String expectedNonce) {
        String LIZJ;
        o.LJIIIZ(expectedNonce, "expectedNonce");
        Q4J.LIZLLL(str, "token");
        Q4J.LIZLLL(expectedNonce, "expectedNonce");
        boolean z = false;
        List LJLJJL = s.LJLJJL(str, new String[]{"."}, 0, 6);
        if (LJLJJL.size() == 3) {
            String str2 = (String) LJLJJL.get(0);
            String str3 = (String) LJLJJL.get(1);
            String str4 = (String) LJLJJL.get(2);
            this.token = str;
            this.expectedNonce = expectedNonce;
            AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str2);
            this.header = authenticationTokenHeader;
            this.claims = new AuthenticationTokenClaims(str3, expectedNonce);
            try {
                LIZJ = C64079PCx.LIZJ(authenticationTokenHeader.kid);
            } catch (IOException | InvalidKeySpecException unused) {
            }
            if (LIZJ != null) {
                PublicKey LIZIZ = C64079PCx.LIZIZ(LIZJ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append('.');
                LIZ.append(str3);
                z = C64079PCx.LIZLLL(LIZIZ, X1D.LIZIZ(LIZ), str4);
                if (z) {
                    this.signature = str4;
                    return;
                }
                "Invalid Signature".toString();
                throw new IllegalArgumentException("Invalid Signature");
            }
            "Invalid Signature".toString();
            throw new IllegalArgumentException("Invalid Signature");
        }
        "Invalid IdToken string".toString();
        throw new IllegalArgumentException("Invalid IdToken string");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.expectedNonce);
        dest.writeParcelable(this.header, i);
        dest.writeParcelable(this.claims, i);
        dest.writeString(this.signature);
    }
}
