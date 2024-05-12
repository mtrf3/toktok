package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.content.SharedPreferences;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class OJZ implements OCH {
    public static final java.util.Map<String, String> LIZJ;
    public static String LIZLLL;
    public final SharedPreferences LIZ;
    public final java.util.Map<java.net.URI, java.util.Set<C61690OJa>> LIZIZ = new LinkedHashMap();

    public final synchronized void LJ() {
        java.util.Map<java.net.URI, java.util.Set<C61690OJa>> map;
        java.util.Map<java.net.URI, java.util.Set<C61690OJa>> map2 = this.LIZIZ;
        if (map2 != null && !map2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                if (entry != null) {
                    java.net.URI uri = (java.net.URI) entry.getKey();
                    if (uri.getScheme() != null && uri.getScheme().equals("https")) {
                        linkedHashMap.put((java.net.URI) entry.getKey(), (java.util.Set) entry.getValue());
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (entry2 != null) {
                    java.net.URI uri2 = (java.net.URI) entry2.getKey();
                    java.util.Set<C61690OJa> set = (java.util.Set) entry2.getValue();
                    try {
                        java.net.URI uri3 = new java.net.URI(uri2.toString().replace("https:", "http:"));
                        java.util.Set<C61690OJa> set2 = (java.util.Set) ((LinkedHashMap) this.LIZIZ).get(uri3);
                        if (set2 == null || set2.isEmpty()) {
                            this.LIZIZ.remove(uri2);
                            this.LIZIZ.put(uri3, set);
                        } else {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (C61690OJa c61690OJa : set2) {
                                boolean z = false;
                                for (C61690OJa c61690OJa2 : set) {
                                    if (c61690OJa != null && c61690OJa2 != null && c61690OJa.getHttpCookie().equals(c61690OJa2.getHttpCookie()) && c61690OJa2.getWhenCreated().longValue() >= c61690OJa.getWhenCreated().longValue()) {
                                        linkedHashSet.add(c61690OJa2);
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    linkedHashSet.add(c61690OJa);
                                }
                            }
                            for (C61690OJa c61690OJa3 : set) {
                                if (!linkedHashSet.contains(c61690OJa3)) {
                                    linkedHashSet.add(c61690OJa3);
                                }
                            }
                            this.LIZIZ.remove(uri2);
                            this.LIZIZ.put(uri3, linkedHashSet);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            try {
                map = this.LIZIZ;
            } catch (Throwable unused2) {
            }
            if (map != null && !map.isEmpty()) {
                SharedPreferences.Editor edit = this.LIZ.edit();
                edit.clear();
                for (Map.Entry entry3 : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                    java.net.URI uri4 = (java.net.URI) entry3.getKey();
                    for (C61690OJa c61690OJa4 : (java.util.Set) entry3.getValue()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(uri4.toString());
                        LIZ.append("|");
                        LIZ.append(c61690OJa4.getHttpCookie().LJLJJLL);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        String encode = c61690OJa4.encode();
                        if (c61690OJa4.getHttpCookie().LJLJJL > 0) {
                            edit.putString(LIZIZ, encode);
                        } else {
                            LIZJ.put(LIZIZ, encode);
                        }
                    }
                }
                WX6.LIZ(edit);
            }
        }
    }

    static {
        C16880lQ.LJLLJ(OJZ.class);
        LIZJ = new LinkedHashMap();
    }

    public OJZ(Context context) {
        String str = LIZLLL;
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 4, str == null ? "cookieStore" : str);
        this.LIZ = LIZIZ;
        LIZJ(LIZIZ.getAll(), true);
        LIZJ(LIZJ, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C61691OJb> LIZIZ(java.net.URI r11) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OJZ.LIZIZ(java.net.URI):java.util.List");
    }

    @Override // X.OCH
    public final synchronized List<C61691OJb> get(java.net.URI uri) {
        return LIZIZ(uri);
    }

    @Override // X.OCH
    public final synchronized void LIZ(C61691OJb c61691OJb, java.net.URI uri) {
        String str = c61691OJb.LJLJJI;
        if (str != null) {
            if (str.charAt(0) == '.') {
                str = str.substring(1);
            }
            try {
                String str2 = c61691OJb.LJLJL;
                if (str2 == null) {
                    str2 = "/";
                }
                uri = new java.net.URI("http", str, str2, null);
            } catch (URISyntaxException unused) {
            }
        }
        java.util.Set<C61690OJa> set = (java.util.Set) ((LinkedHashMap) this.LIZIZ).get(uri);
        C61690OJa c61690OJa = new C61690OJa(c61691OJb);
        if (set != null) {
            set.remove(c61690OJa);
        } else {
            set = new HashSet<>();
            this.LIZIZ.put(uri, set);
        }
        set.add(c61690OJa);
        LIZLLL(uri, c61690OJa);
    }

    public final synchronized void LIZJ(java.util.Map<String, ?> map, boolean z) {
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (Map.Entry<String, ?> entry : map.entrySet()) {
                        try {
                            java.net.URI uri = new java.net.URI(entry.getKey().split("\\|", 2)[0]);
                            C61690OJa decode = C61690OJa.decode((String) entry.getValue());
                            java.util.Set<C61690OJa> set = this.LIZIZ.get(uri);
                            if (set == null) {
                                set = new HashSet<>();
                                this.LIZIZ.put(uri, set);
                            }
                            if (decode != null) {
                                set.add(decode);
                            }
                        } catch (URISyntaxException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    if (z) {
                        RunnableC39007FSp.LIZIZ(new ARunnableS46S0100000_10(this, 233));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void LIZLLL(java.net.URI uri, C61690OJa c61690OJa) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(uri.toString());
        LIZ.append("|");
        LIZ.append(c61690OJa.getHttpCookie().LJLJJLL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        String encode = c61690OJa.encode();
        if (c61690OJa.getHttpCookie().LJLJJL > 0) {
            SharedPreferences.Editor edit = this.LIZ.edit();
            edit.putString(LIZIZ, encode);
            edit.apply();
            return;
        }
        LIZJ.put(LIZIZ, encode);
    }
}
