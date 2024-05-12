package X;

import Y.ARunnableS4S1300000_6;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.bytedance.pia.core.setting.Settings;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Elg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37376Elg {
    public static Keva LIZ;
    public static Keva LIZIZ;
    public static long LIZLLL;
    public static final Gson LIZJ = GsonUtils.LIZIZ();
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public static final Keva LIZIZ(android.net.Uri uri) {
        String LIZJ2;
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || uri == null || (LIZJ2 = C85693Xx.LIZJ(uri, null)) == null || LIZJ2.length() == 0) {
            return null;
        }
        return LIZJ(LIZJ2);
    }

    public static final Keva LIZJ(String url) {
        o.LJIIJ(url, "url");
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || !LJ.get()) {
            return null;
        }
        Keva keva = LIZ;
        if (keva != null) {
            if (keva.contains(url)) {
                Keva keva2 = LIZ;
                if (keva2 != null) {
                    String uuid = keva2.getString(url, "");
                    o.LJFF(uuid, "uuid");
                    if (uuid.length() > 0) {
                        return Keva.getRepo(uuid);
                    }
                } else {
                    o.LJIJI("indexRepo");
                    throw null;
                }
            }
            return null;
        }
        o.LJIJI("indexRepo");
        throw null;
    }

    public static final IPiaCacheProvider.CacheConfig LJI(m mVar) {
        Object LIZ2;
        if (mVar != null) {
            try {
                LIZ2 = (IPiaCacheProvider.CacheConfig) GsonUtils.LIZIZ().LJI(mVar.LJJIJIL("cache").toString(), IPiaCacheProvider.CacheConfig.class);
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            IPiaCacheProvider.CacheConfig cacheConfig = (IPiaCacheProvider.CacheConfig) LIZ2;
            if (cacheConfig == null || TextUtils.isEmpty(cacheConfig.version)) {
                return null;
            }
            return cacheConfig;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r5 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C37377Elh LJII(android.net.Uri r8) {
        /*
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            X.EmH r0 = com.bytedance.pia.core.setting.Settings.LJIIIZ
            com.bytedance.pia.core.setting.Settings r0 = X.C37413EmH.LIZ(r0)
            boolean r0 = r0.isCacheEnabled
            r2 = 0
            if (r0 != 0) goto L11
            return r2
        L11:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C37376Elg.LJ
            boolean r0 = r0.get()
            if (r0 != 0) goto L1a
            return r2
        L1a:
            long r5 = X.C37376Elg.LIZLLL
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L31
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = X.C37376Elg.LIZLLL
            long r5 = r5 - r0
            r0 = 60000(0xea60, float:8.4078E-41)
            long r3 = (long) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L3c
        L31:
            android.os.Handler r4 = X.C37613EpV.LIZ()
            X.Elf r3 = X.RunnableC37375Elf.LJLIL
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.postDelayed(r3, r0)
        L3c:
            java.lang.String r7 = X.C85693Xx.LIZJ(r8, r2)
            if (r7 == 0) goto Le3
            com.bytedance.keva.Keva r6 = LIZJ(r7)
            r3 = 6
            r4 = 41
            if (r6 == 0) goto Lcd
            com.bytedance.keva.Keva r5 = X.C37376Elg.LIZ
            if (r5 == 0) goto Lc7
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r7)
            java.lang.String r0 = "_extraVary"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String[] r0 = r5.getStringArray(r0, r2)
            if (r0 == 0) goto L71
            java.util.List r1 = X.ORY.LJJZZIII(r0)
            if (r1 == 0) goto L71
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb3
        L71:
            r1 = r7
        L72:
            X.Elh r5 = LJIIJ(r6, r1)
            if (r5 == 0) goto L7e
            boolean r0 = X.C78963Uyt.LJJIJIL(r5)
            if (r0 != 0) goto L8c
        L7e:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r7)
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
            X.Elh r5 = LJIIJ(r6, r7)
        L8a:
            if (r5 == 0) goto Lcd
        L8c:
            boolean r0 = X.C78963Uyt.LJJIJIL(r5)
            if (r0 == 0) goto Lcd
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[PIACacheManager][Query] Find Matched PIA Cache. (URL = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", CacheConfig = "
            r1.append(r0)
            com.bytedance.pia.core.cache.IPiaCacheProvider$CacheConfig r0 = r5.LIZJ
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C37238EjS.LJI(r3, r0, r2)
            return r5
        Lb3:
            java.lang.String r1 = X.C85693Xx.LIZJ(r8, r1)
            if (r1 == 0) goto L71
            int r0 = r1.length()
            if (r0 != 0) goto Lc0
            goto L71
        Lc0:
            boolean r0 = LJFF(r6, r1)
            if (r0 == 0) goto L71
            goto L72
        Lc7:
            java.lang.String r0 = "indexRepo"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        Lcd:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[PIACacheManager][Query] Find No Matched PIA Cache. (URL = "
            r1.append(r0)
            r1.append(r8)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C37238EjS.LJI(r3, r0, r2)
        Le3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37376Elg.LJII(android.net.Uri):X.Elh");
    }

    public static final String LJIIIIZZ(String normalizeUrl) {
        o.LJIIJ(normalizeUrl, "normalizeUrl");
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || !LJ.get()) {
            return null;
        }
        Keva keva = LIZIZ;
        if (keva != null) {
            if (!keva.contains(normalizeUrl)) {
                return null;
            }
            Keva keva2 = LIZIZ;
            if (keva2 != null) {
                String string = keva2.getString(normalizeUrl, "");
                if (string == null || string.length() == 0) {
                    return null;
                }
                return string;
            }
            o.LJIJI("contentRepo");
            throw null;
        }
        o.LJIJI("contentRepo");
        throw null;
    }

    public static void LJIIJJI(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[PIACacheManager] Remove ALL Cache. (URL: ");
        LIZ2.append(str);
        LIZ2.append(')');
        C37238EjS.LJI(6, X1D.LIZIZ(LIZ2), null);
        Keva LIZJ2 = LIZJ(str);
        if (LIZJ2 != null) {
            java.util.Map<String, ?> all = LIZJ2.getAll();
            if (all != null) {
                Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                while (it.hasNext()) {
                    LIZ(LIZJ2, it.next().getKey());
                }
                LIZJ2.clear();
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
            }
        }
        LJIIL(str);
    }

    public static void LJIIL(String str) {
        Keva keva = LIZ;
        if (keva != null) {
            keva.erase(str);
            Keva keva2 = LIZ;
            if (keva2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append("_extraVary");
                keva2.erase(X1D.LIZIZ(LIZ2));
                return;
            }
            o.LJIJI("indexRepo");
            throw null;
        }
        o.LJIJI("indexRepo");
        throw null;
    }

    public static final boolean LIZ(Keva keva, String normalizeUrl) {
        o.LJIIJ(normalizeUrl, "normalizeUrl");
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || !LJ.get() || !LJFF(keva, normalizeUrl)) {
            return false;
        }
        keva.erase(normalizeUrl);
        Keva keva2 = LIZIZ;
        if (keva2 != null) {
            keva2.erase(normalizeUrl);
            Keva keva3 = LIZIZ;
            if (keva3 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(normalizeUrl);
                LIZ2.append("_headers");
                keva3.erase(X1D.LIZIZ(LIZ2));
                return true;
            }
            o.LJIJI("contentRepo");
            throw null;
        }
        o.LJIJI("contentRepo");
        throw null;
    }

    public static void LIZLLL(String str, List list) {
        Keva keva = LIZ;
        if (keva != null) {
            keva.storeString(str, UUID.randomUUID().toString());
            if (list != null) {
                Keva keva2 = LIZ;
                if (keva2 != null) {
                    String LJFF = i0.LJFF(str, "_extraVary");
                    Object[] array = list.toArray(new String[0]);
                    if (array != null) {
                        keva2.storeStringArray(LJFF, (String[]) array);
                        return;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
                }
                o.LJIJI("indexRepo");
                throw null;
            }
            return;
        }
        o.LJIJI("indexRepo");
        throw null;
    }

    public static boolean LJFF(Keva keva, String str) {
        if (keva.contains(str)) {
            Keva keva2 = LIZIZ;
            if (keva2 != null) {
                if (keva2.contains(str)) {
                    return true;
                }
                return false;
            }
            o.LJIJI("contentRepo");
            throw null;
        }
        return false;
    }

    public static final IPiaCacheProvider.CacheConfig LJIIIZ(Keva keva, String normalizeUrl) {
        IPiaCacheProvider.CacheConfig cacheConfig;
        String string;
        Object LIZ2;
        o.LJIIJ(normalizeUrl, "normalizeUrl");
        IPiaCacheProvider.CacheConfig cacheConfig2 = null;
        Object obj = null;
        C76800UCe c76800UCe = null;
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || !LJ.get()) {
            return null;
        }
        Keva keva2 = LIZIZ;
        if (keva2 != null) {
            if (!keva2.contains(normalizeUrl)) {
                return null;
            }
            if (keva != null) {
                if (!keva.contains(normalizeUrl) || (string = keva.getString(normalizeUrl, "")) == null || string.length() == 0) {
                    return null;
                }
                try {
                    LIZ2 = (IPiaCacheProvider.CacheConfig) LIZJ.LJI(string, IPiaCacheProvider.CacheConfig.class);
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (!C3C5.m12isFailureimpl(LIZ2)) {
                    obj = LIZ2;
                }
                return (IPiaCacheProvider.CacheConfig) obj;
            }
            Keva keva3 = LIZIZ;
            if (keva3 != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(normalizeUrl);
                LIZ3.append("_headers");
                String string2 = keva3.getString(X1D.LIZIZ(LIZ3), "");
                try {
                    GsonUtils.LIZIZ.getClass();
                    j LIZ4 = com.google.gson.o.LIZ(string2);
                    if (!(LIZ4 instanceof m)) {
                        LIZ4 = null;
                    }
                    m mVar = (m) LIZ4;
                    if (mVar != null) {
                        cacheConfig = (IPiaCacheProvider.CacheConfig) LIZJ.LIZJ(mVar, IPiaCacheProvider.CacheConfig.class);
                        try {
                            c76800UCe = C76800UCe.LIZ;
                        } catch (Throwable th2) {
                            th = th2;
                            cacheConfig2 = cacheConfig;
                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                            return cacheConfig2;
                        }
                    } else {
                        cacheConfig = null;
                    }
                    C3C5.m7constructorimpl(c76800UCe);
                    return cacheConfig;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                o.LJIJI("contentRepo");
                throw null;
            }
        } else {
            o.LJIJI("contentRepo");
            throw null;
        }
    }

    public static final C37377Elh LJIIJ(Keva keva, String normalizeUrl) {
        IPiaCacheProvider.CacheConfig LJIIIZ;
        String LJIIIIZZ;
        o.LJIIJ(normalizeUrl, "normalizeUrl");
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || !LJ.get() || !LJFF(keva, normalizeUrl) || (LJIIIZ = LJIIIZ(keva, normalizeUrl)) == null || (LJIIIIZZ = LJIIIIZZ(normalizeUrl)) == null) {
            return null;
        }
        return new C37377Elh(normalizeUrl, LJIIIIZZ, LJIIIZ);
    }

    public static void LJ(android.net.Uri uri, IPiaCacheProvider iPiaCacheProvider, boolean z) {
        Keva LIZIZ2;
        if (iPiaCacheProvider != null && (LIZIZ2 = LIZIZ(uri)) != null && LJFF(LIZIZ2, iPiaCacheProvider.LIZ())) {
            iPiaCacheProvider.LIZIZ().marked = Boolean.valueOf(z);
            LJIILJJIL(iPiaCacheProvider.LIZ(), iPiaCacheProvider.LIZIZ().LIZ(), iPiaCacheProvider.LIZJ(), LIZIZ2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[PIACacheManager] Finish Cache Mark. (URL: ");
            LIZ2.append(iPiaCacheProvider.LIZ());
            LIZ2.append(", CacheConfig: ");
            LIZ2.append(iPiaCacheProvider.LIZIZ());
            LIZ2.append(')');
            C37238EjS.LJI(6, X1D.LIZIZ(LIZ2), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r2.isEmpty() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        if (kotlin.jvm.internal.o.LJ(X.ORZ.LLIL(r12), X.ORZ.LLIL(r2)) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIILIIL(android.net.Uri r9, java.lang.String r10, com.google.gson.m r11, java.util.List<java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37376Elg.LJIILIIL(android.net.Uri, java.lang.String, com.google.gson.m, java.util.List):boolean");
    }

    public static void LJIILJJIL(String str, m mVar, String str2, Keva keva) {
        Keva keva2 = LIZIZ;
        if (keva2 != null) {
            synchronized (keva2) {
                keva.storeString(str, mVar.toString());
                Keva keva3 = LIZIZ;
                if (keva3 != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append("_headers");
                    keva3.storeString(X1D.LIZIZ(LIZ2), mVar.toString());
                    Keva keva4 = LIZIZ;
                    if (keva4 != null) {
                        keva4.storeString(str, str2);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("[PIACacheManager] Save Cache Success. (URL = ");
                        LIZ3.append(str);
                        LIZ3.append(", CacheConfig: ");
                        LIZ3.append(mVar);
                        LIZ3.append(')');
                        C37238EjS.LJI(6, X1D.LIZIZ(LIZ3), null);
                    } else {
                        o.LJIJI("contentRepo");
                        throw null;
                    }
                } else {
                    o.LJIJI("contentRepo");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("contentRepo");
        throw null;
    }

    public static final void LJIILL(android.net.Uri uri, IPiaCacheProvider iPiaCacheProvider, m mVar, String str) {
        o.LJIIJ(uri, "uri");
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || !LJ.get()) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[PIACacheManager] Begin to Validate Cache. (URL: ");
        LIZ2.append(uri);
        LIZ2.append(')');
        C37238EjS.LJI(6, X1D.LIZIZ(LIZ2), null);
        C37613EpV.LIZJ(new ARunnableS4S1300000_6(uri, iPiaCacheProvider, mVar, str, 5));
    }
}
