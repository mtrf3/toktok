package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.Pmo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65474Pmo {
    public static final java.util.Set<String> LJIIIZ = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope")));
    public final C66540Q9o LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final android.net.Uri LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public final java.util.Map<String, String> LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("grant_type", this.LIZJ);
        android.net.Uri uri = this.LIZLLL;
        if (uri != null) {
            hashMap.put("redirect_uri", uri.toString());
        }
        String str = this.LJ;
        if (str != null) {
            str.toString();
            hashMap.put("code", str);
        }
        String str2 = this.LJI;
        if (str2 != null) {
            str2.toString();
            hashMap.put("refresh_token", str2);
        }
        String str3 = this.LJII;
        if (str3 != null) {
            str3.toString();
            hashMap.put("code_verifier", str3);
        }
        String str4 = this.LJFF;
        if (str4 != null) {
            str4.toString();
            hashMap.put("scope", str4);
        }
        for (Map.Entry<String, String> entry : this.LJIIIIZZ.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public C65474Pmo(C66540Q9o c66540Q9o, String str, String str2, android.net.Uri uri, String str3, String str4, String str5, String str6, java.util.Map map) {
        this.LIZ = c66540Q9o;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = uri;
        this.LJFF = str3;
        this.LJ = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = map;
    }
}
