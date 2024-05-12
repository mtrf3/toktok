package com.google.android.gms.auth.api.signin;

import X.C67684QhM;
import X.C67688QhQ;
import X.C79057V0z;
import X.C79062V1e;
import X.InterfaceC67689QhR;
import X.QH7;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C67684QhM();
    public static InterfaceC67689QhR zaa = C67688QhQ.LIZ;
    public final int LJLIL;
    public final List<Scope> LJLILLLLZI;
    public String zad;
    public String zae;
    public String zaf;
    public String zag;
    public Uri zah;
    public String zai;
    public long zaj;
    public String zak;
    public String zal;
    public String zam;
    public Set<Scope> zan = new HashSet();

    public final Set<Scope> LJJJJL() {
        HashSet hashSet = new HashSet(this.LJLILLLLZI);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    public final String LJJJJZI() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.zad;
            if (str != null) {
                jSONObject.put("id", str);
            }
            String str2 = this.zae;
            if (str2 != null) {
                jSONObject.put("tokenId", str2);
            }
            String str3 = this.zaf;
            if (str3 != null) {
                jSONObject.put("email", str3);
            }
            String str4 = this.zag;
            if (str4 != null) {
                jSONObject.put("displayName", str4);
            }
            String str5 = this.zal;
            if (str5 != null) {
                jSONObject.put("givenName", str5);
            }
            String str6 = this.zam;
            if (str6 != null) {
                jSONObject.put("familyName", str6);
            }
            Uri uri = this.zah;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str7 = this.zai;
            if (str7 != null) {
                jSONObject.put("serverAuthCode", str7);
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.LJLILLLLZI;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: X.QhP
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Scope) obj).zzb.compareTo(((Scope) obj2).zzb);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.zzb);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return LJJJJL().hashCode() + C79062V1e.LJ(this.zak, 527, 31);
    }

    public static GoogleSignInAccount LJJJJZ(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str7 = null;
        if (isEmpty) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = UriProtector.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject, "expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, JSONArrayProtectorUtils.getString(jSONArray, i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str7 = jSONObject.optString("familyName");
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = JSONObjectProtectorUtils.getString(jSONObject, "obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        QH7.LJI(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, longValue, string, new ArrayList(hashSet), str5, str7);
        if (jSONObject.has("serverAuthCode")) {
            str6 = jSONObject.optString("serverAuthCode");
        } else {
            str6 = null;
        }
        googleSignInAccount.zai = str6;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.zak.equals(this.zak) || !googleSignInAccount.LJJJJL().equals(LJJJJL())) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.zad, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zae, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zaf, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zag, false);
        C79057V0z.LJJZZI(parcel, 6, this.zah, i, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zai, false);
        C79057V0z.LJJLJLI(parcel, 8, this.zaj);
        C79057V0z.LJJZZIII(parcel, 9, this.zak, false);
        C79057V0z.LJLIIL(parcel, 10, this.LJLILLLLZI, false);
        C79057V0z.LJJZZIII(parcel, 11, this.zal, false);
        C79057V0z.LJJZZIII(parcel, 12, this.zam, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.LJLIL = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.LJLILLLLZI = list;
        this.zal = str7;
        this.zam = str8;
    }
}
