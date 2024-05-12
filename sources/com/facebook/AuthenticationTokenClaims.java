package com.facebook;

import X.C39086FVq;
import X.C53369Kx3;
import X.C66373Q3d;
import X.C79062V1e;
import X.JBR;
import X.PVC;
import X.Q4J;
import X.Q4S;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class AuthenticationTokenClaims implements Parcelable {
    public final String aud;
    public final String email;
    public final long exp;
    public final String familyName;
    public final String givenName;
    public final long iat;
    public final String iss;
    public final String jti;
    public final String middleName;
    public final String name;
    public final String nonce;
    public final String picture;
    public final String sub;
    public final Map<String, Integer> userAgeRange;
    public final String userBirthday;
    public final Set<String> userFriends;
    public final String userGender;
    public final Map<String, String> userHometown;
    public final String userLink;
    public final Map<String, String> userLocation;
    public static final Q4S Companion = new Q4S();
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new IDCreatorS54S0000000_11(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.jti);
        jSONObject.put("iss", this.iss);
        jSONObject.put("aud", this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put("exp", this.exp);
        jSONObject.put("iat", this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put("user_age_range", new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put("user_hometown", new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put("user_location", new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int LJ = C79062V1e.LJ(this.sub, JBR.LIZJ(this.iat, JBR.LIZJ(this.exp, C79062V1e.LJ(this.nonce, C79062V1e.LJ(this.aud, C79062V1e.LJ(this.iss, C79062V1e.LJ(this.jti, 527, 31), 31), 31), 31), 31), 31), 31);
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.givenName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.middleName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.familyName;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.email;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.picture;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Set<String> set = this.userFriends;
        if (set == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = set.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str7 = this.userBirthday;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Map<String, Integer> map = this.userAgeRange;
        if (map == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = map.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Map<String, String> map2 = this.userHometown;
        if (map2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Map<String, String> map3 = this.userLocation;
        if (map3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map3.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str8 = this.userGender;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        String str9 = this.userLink;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return i13 + i;
    }

    public final String toString() {
        String jSONObject = LIZ().toString();
        o.LJIIIIZZ(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Set<String> set;
        Map<String, Integer> map;
        Map<String, String> map2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Q4J.LJFF(readString, "jti");
        this.jti = readString;
        String readString2 = parcel.readString();
        Q4J.LJFF(readString2, "iss");
        this.iss = readString2;
        String readString3 = parcel.readString();
        Q4J.LJFF(readString3, "aud");
        this.aud = readString3;
        String readString4 = parcel.readString();
        Q4J.LJFF(readString4, "nonce");
        this.nonce = readString4;
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        String readString5 = parcel.readString();
        Q4J.LJFF(readString5, "sub");
        this.sub = readString5;
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map<String, String> map3 = null;
        if (createStringArrayList != null) {
            set = Collections.unmodifiableSet(new HashSet(createStringArrayList));
        } else {
            set = null;
        }
        this.userFriends = set;
        this.userBirthday = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(C53369Kx3.class.getClassLoader());
        if ((readHashMap instanceof HashMap) && readHashMap != null) {
            map = Collections.unmodifiableMap(readHashMap);
        } else {
            map = null;
        }
        this.userAgeRange = map;
        HashMap readHashMap2 = parcel.readHashMap(C39086FVq.class.getClassLoader());
        if ((readHashMap2 instanceof HashMap) && readHashMap2 != null) {
            map2 = Collections.unmodifiableMap(readHashMap2);
        } else {
            map2 = null;
        }
        this.userHometown = map2;
        HashMap readHashMap3 = parcel.readHashMap(C39086FVq.class.getClassLoader());
        if ((readHashMap3 instanceof HashMap) && readHashMap3 != null) {
            map3 = Collections.unmodifiableMap(readHashMap3);
        }
        this.userLocation = map3;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        if (o.LJ(this.jti, authenticationTokenClaims.jti) && o.LJ(this.iss, authenticationTokenClaims.iss) && o.LJ(this.aud, authenticationTokenClaims.aud) && o.LJ(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && o.LJ(this.sub, authenticationTokenClaims.sub) && o.LJ(this.name, authenticationTokenClaims.name) && o.LJ(this.givenName, authenticationTokenClaims.givenName) && o.LJ(this.middleName, authenticationTokenClaims.middleName) && o.LJ(this.familyName, authenticationTokenClaims.familyName) && o.LJ(this.email, authenticationTokenClaims.email) && o.LJ(this.picture, authenticationTokenClaims.picture) && o.LJ(this.userFriends, authenticationTokenClaims.userFriends) && o.LJ(this.userBirthday, authenticationTokenClaims.userBirthday) && o.LJ(this.userAgeRange, authenticationTokenClaims.userAgeRange) && o.LJ(this.userHometown, authenticationTokenClaims.userHometown) && o.LJ(this.userLocation, authenticationTokenClaims.userLocation) && o.LJ(this.userGender, authenticationTokenClaims.userGender) && o.LJ(this.userLink, authenticationTokenClaims.userLink)) {
            return true;
        }
        return false;
    }

    public AuthenticationTokenClaims(String encodedClaims, String expectedNonce) {
        boolean z;
        Set<String> unmodifiableSet;
        Map<String, Integer> unmodifiableMap;
        Map<String, String> unmodifiableMap2;
        o.LJIIIZ(encodedClaims, "encodedClaims");
        o.LJIIIZ(expectedNonce, "expectedNonce");
        Q4J.LIZLLL(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        o.LJIIIIZZ(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, PVC.LIZ));
        String jti = jSONObject.optString("jti");
        o.LJIIIIZZ(jti, "jti");
        if (jti.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                String iss = jSONObject.optString("iss");
                o.LJIIIIZZ(iss, "iss");
                if (iss.length() != 0) {
                    if (!o.LJ(new URL(iss).getHost(), "facebook.com")) {
                        if (!o.LJ(new URL(iss).getHost(), "www.facebook.com")) {
                        }
                    }
                    String aud = jSONObject.optString("aud");
                    o.LJIIIIZZ(aud, "aud");
                    if (aud.length() != 0 && o.LJ(aud, u.LIZLLL())) {
                        long j = 1000;
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * j))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * j) + 600000))) {
                                String sub = jSONObject.optString("sub");
                                o.LJIIIIZZ(sub, "sub");
                                if (sub.length() != 0) {
                                    String nonce = jSONObject.optString("nonce");
                                    o.LJIIIIZZ(nonce, "nonce");
                                    if (nonce.length() != 0 && o.LJ(nonce, expectedNonce)) {
                                        String string = jSONObject.getString("jti");
                                        o.LJIIIIZZ(string, "jsonObj.getString(JSON_KEY_JIT)");
                                        this.jti = string;
                                        String string2 = jSONObject.getString("iss");
                                        o.LJIIIIZZ(string2, "jsonObj.getString(JSON_KEY_ISS)");
                                        this.iss = string2;
                                        String string3 = jSONObject.getString("aud");
                                        o.LJIIIIZZ(string3, "jsonObj.getString(JSON_KEY_AUD)");
                                        this.aud = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        o.LJIIIIZZ(string4, "jsonObj.getString(JSON_KEY_NONCE)");
                                        this.nonce = string4;
                                        this.exp = jSONObject.getLong("exp");
                                        this.iat = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        o.LJIIIIZZ(string5, "jsonObj.getString(JSON_KEY_SUB)");
                                        this.sub = string5;
                                        Companion.getClass();
                                        this.name = Q4S.LIZ("name", jSONObject);
                                        this.givenName = Q4S.LIZ("given_name", jSONObject);
                                        this.middleName = Q4S.LIZ("middle_name", jSONObject);
                                        this.familyName = Q4S.LIZ("family_name", jSONObject);
                                        this.email = Q4S.LIZ("email", jSONObject);
                                        this.picture = Q4S.LIZ("picture", jSONObject);
                                        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
                                        if (optJSONArray == null) {
                                            unmodifiableSet = null;
                                        } else {
                                            unmodifiableSet = Collections.unmodifiableSet(C66373Q3d.LJIL(optJSONArray));
                                        }
                                        this.userFriends = unmodifiableSet;
                                        this.userBirthday = Q4S.LIZ("user_birthday", jSONObject);
                                        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
                                        if (optJSONObject == null) {
                                            unmodifiableMap = null;
                                        } else {
                                            unmodifiableMap = Collections.unmodifiableMap(C66373Q3d.LJII(optJSONObject));
                                        }
                                        this.userAgeRange = unmodifiableMap;
                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        if (optJSONObject2 == null) {
                                            unmodifiableMap2 = null;
                                        } else {
                                            unmodifiableMap2 = Collections.unmodifiableMap(C66373Q3d.LJIIIIZZ(optJSONObject2));
                                        }
                                        this.userHometown = unmodifiableMap2;
                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.userLocation = optJSONObject3 != null ? Collections.unmodifiableMap(C66373Q3d.LJIIIIZZ(optJSONObject3)) : null;
                                        this.userGender = Q4S.LIZ("user_gender", jSONObject);
                                        this.userLink = Q4S.LIZ("user_link", jSONObject);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        "Invalid claims".toString();
        throw new IllegalArgumentException("Invalid claims");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.jti);
        dest.writeString(this.iss);
        dest.writeString(this.aud);
        dest.writeString(this.nonce);
        dest.writeLong(this.exp);
        dest.writeLong(this.iat);
        dest.writeString(this.sub);
        dest.writeString(this.name);
        dest.writeString(this.givenName);
        dest.writeString(this.middleName);
        dest.writeString(this.familyName);
        dest.writeString(this.email);
        dest.writeString(this.picture);
        if (this.userFriends == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.userFriends));
        }
        dest.writeString(this.userBirthday);
        dest.writeMap(this.userAgeRange);
        dest.writeMap(this.userHometown);
        dest.writeMap(this.userLocation);
        dest.writeString(this.userGender);
        dest.writeString(this.userLink);
    }
}
