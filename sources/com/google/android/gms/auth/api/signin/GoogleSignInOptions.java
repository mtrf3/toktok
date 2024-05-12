package com.google.android.gms.auth.api.signin;

import X.C67699Qhb;
import X.C67700Qhc;
import X.C67701Qhd;
import X.C67703Qhf;
import X.C79057V0z;
import X.InterfaceC67808QjM;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements InterfaceC67808QjM, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope zaa;
    public static final Scope zab;
    public static final Scope zac;
    public static final Scope zad;
    public static final Scope zae;
    public static Comparator<Scope> zag;
    public final int LJLIL;
    public final ArrayList<Scope> zah;
    public Account zai;
    public boolean zaj;
    public final boolean zak;
    public final boolean zal;
    public String zam;
    public String zan;
    public ArrayList<GoogleSignInOptionsExtensionParcelable> zao;
    public String zap;
    public Map<Integer, GoogleSignInOptionsExtensionParcelable> zaq;

    public GoogleSignInOptions() {
        throw null;
    }

    static {
        Scope scope = new Scope(1, "profile");
        zaa = scope;
        zab = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        zac = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        zad = scope3;
        zae = new Scope(1, "https://www.googleapis.com/auth/games");
        C67700Qhc c67700Qhc = new C67700Qhc();
        ((HashSet) c67700Qhc.LIZ).add(scope2);
        ((HashSet) c67700Qhc.LIZ).add(scope);
        DEFAULT_SIGN_IN = c67700Qhc.LIZ();
        C67700Qhc c67700Qhc2 = new C67700Qhc();
        ((HashSet) c67700Qhc2.LIZ).add(scope3);
        c67700Qhc2.LIZ.addAll(Arrays.asList(new Scope[0]));
        DEFAULT_GAMES_SIGN_IN = c67700Qhc2.LIZ();
        CREATOR = new C67701Qhd();
        zag = new C67703Qhf();
    }

    public final ArrayList<Scope> LJJJJL() {
        return new ArrayList<>(this.zah);
    }

    public final String LJJJLIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zah, zag);
            Iterator<Scope> it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().zzb);
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) ListProtector.get(arrayList2, i)).zzb);
        }
        Collections.sort(arrayList);
        C67699Qhb c67699Qhb = new C67699Qhb();
        c67699Qhb.LIZ(arrayList);
        c67699Qhb.LIZ(this.zai);
        c67699Qhb.LIZ(this.zam);
        c67699Qhb.LIZ = (((((c67699Qhb.LIZ * 31) + (this.zal ? 1 : 0)) * 31) + (this.zaj ? 1 : 0)) * 31) + (this.zak ? 1 : 0);
        c67699Qhb.LIZ(this.zap);
        return c67699Qhb.LIZ;
    }

    public static GoogleSignInOptions LJJJJZ(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, JSONArrayProtectorUtils.getString(jSONArray, i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "idTokenRequested");
        boolean z2 = JSONObjectProtectorUtils.getBoolean(jSONObject, "serverAuthRequested");
        boolean z3 = JSONObjectProtectorUtils.getBoolean(jSONObject, "forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, str3, str4, new HashMap(), null);
    }

    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> LJJLIIIIJ(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.zab), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r4.zai == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.zam) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r3.zao     // Catch: java.lang.ClassCastException -> L7f
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r0 > 0) goto L7f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r0 = r4.zao     // Catch: java.lang.ClassCastException -> L7f
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r0 <= 0) goto L17
            goto L7f
        L17:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r0 = r3.zah     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r0 = r4.LJJJJL()     // Catch: java.lang.ClassCastException -> L7f
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7f
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zah     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r0 = r4.LJJJJL()     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r1.containsAll(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 != 0) goto L34
            goto L7f
        L34:
            android.accounts.Account r1 = r3.zai     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L72
            android.accounts.Account r0 = r4.zai     // Catch: java.lang.ClassCastException -> L7f
            if (r0 != 0) goto L7f
        L3c:
            java.lang.String r0 = r3.zam     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 == 0) goto L67
            java.lang.String r0 = r4.zam     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 == 0) goto L7f
        L4c:
            boolean r1 = r3.zal     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r4.zal     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7f
            boolean r1 = r3.zaj     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r4.zaj     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7f
            boolean r1 = r3.zak     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r4.zak     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r0) goto L7f
            java.lang.String r1 = r3.zap     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r0 = r4.zap     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.ClassCastException -> L7f
            goto L7b
        L67:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r0 = r4.zam     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 != 0) goto L4c
            goto L7f
        L72:
            android.accounts.Account r0 = r4.zai     // Catch: java.lang.ClassCastException -> L7f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7f
            if (r0 == 0) goto L7f
            goto L3c
        L7b:
            if (r0 == 0) goto L7f
            r0 = 1
            return r0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJLIIL(parcel, 2, LJJJJL(), false);
        C79057V0z.LJJZZI(parcel, 3, this.zai, i, false);
        C79057V0z.LJJJZ(parcel, 4, this.zaj);
        C79057V0z.LJJJZ(parcel, 5, this.zak);
        C79057V0z.LJJJZ(parcel, 6, this.zal);
        C79057V0z.LJJZZIII(parcel, 7, this.zam, false);
        C79057V0z.LJJZZIII(parcel, 8, this.zan, false);
        C79057V0z.LJLIIL(parcel, 9, this.zao, false);
        C79057V0z.LJJZZIII(parcel, 10, this.zap, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.LJLIL = i;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z;
        this.zak = z2;
        this.zal = z3;
        this.zam = str;
        this.zan = str2;
        this.zao = new ArrayList<>(map.values());
        this.zaq = map;
        this.zap = str3;
    }
}
