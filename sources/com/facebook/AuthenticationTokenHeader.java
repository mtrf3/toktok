package com.facebook;

import X.C79062V1e;
import X.PVC;
import X.Q4J;
import X.Q4T;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    public final String alg;
    public final String kid;
    public final String typ;
    public static final Q4T Companion = new Q4T();
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new IDCreatorS54S0000000_11(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.kid.hashCode() + C79062V1e.LJ(this.typ, C79062V1e.LJ(this.alg, 527, 31), 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put("typ", this.typ);
        jSONObject.put("kid", this.kid);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    public AuthenticationTokenHeader(String encodedHeaderString) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(encodedHeaderString, "encodedHeaderString");
        Q4J.LIZLLL(encodedHeaderString, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        o.LJIIIIZZ(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, PVC.LIZ));
            String alg = jSONObject.optString("alg");
            o.LJIIIIZZ(alg, "alg");
            if (alg.length() > 0 && o.LJ(alg, "RS256")) {
                z = true;
            } else {
                z = false;
            }
            String optString = jSONObject.optString("kid");
            o.LJIIIIZZ(optString, "jsonObj.optString(\"kid\")");
            if (optString.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String optString2 = jSONObject.optString("typ");
            o.LJIIIIZZ(optString2, "jsonObj.optString(\"typ\")");
            if (optString2.length() <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z && z2 && z3) {
                byte[] decodedBytes2 = Base64.decode(encodedHeaderString, 0);
                o.LJIIIIZZ(decodedBytes2, "decodedBytes");
                JSONObject jSONObject2 = new JSONObject(new String(decodedBytes2, PVC.LIZ));
                String string = jSONObject2.getString("alg");
                o.LJIIIIZZ(string, "jsonObj.getString(\"alg\")");
                this.alg = string;
                String string2 = jSONObject2.getString("typ");
                o.LJIIIIZZ(string2, "jsonObj.getString(\"typ\")");
                this.typ = string2;
                String string3 = jSONObject2.getString("kid");
                o.LJIIIIZZ(string3, "jsonObj.getString(\"kid\")");
                this.kid = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        "Invalid Header".toString();
        throw new IllegalArgumentException("Invalid Header");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        if (o.LJ(this.alg, authenticationTokenHeader.alg) && o.LJ(this.typ, authenticationTokenHeader.typ) && o.LJ(this.kid, authenticationTokenHeader.kid)) {
            return true;
        }
        return false;
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Q4J.LJFF(readString, "alg");
        this.alg = readString;
        String readString2 = parcel.readString();
        Q4J.LJFF(readString2, "typ");
        this.typ = readString2;
        String readString3 = parcel.readString();
        Q4J.LJFF(readString3, "kid");
        this.kid = readString3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.alg);
        dest.writeString(this.typ);
        dest.writeString(this.kid);
    }
}
