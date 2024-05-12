package X;

import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class O4B extends C61311O4l {
    public volatile boolean LIZIZ;
    public volatile File LIZJ;
    public String LIZLLL;
    public long LJ;
    public WeakReference<O4O> LJFF;
    public WeakReference<java.util.Map<String, String>> LJI;
    public final String LJII;

    public final void LIZLLL() {
        this.LIZIZ = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invalidate cache ");
        String str = this.LIZLLL;
        if (str != null) {
            LIZ.append(str);
            C39930Flm.LJI("ResponseCache", X1D.LIZIZ(LIZ), false, 4);
            String str2 = this.LIZLLL;
            if (str2 != null) {
                O4W.LIZ(str2);
                return;
            } else {
                o.LJIJI("cacheKey");
                throw null;
            }
        }
        o.LJIJI("cacheKey");
        throw null;
    }

    public final boolean LIZ() {
        if (!this.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            String str = this.LIZLLL;
            if (str != null) {
                LIZ.append(str);
                LIZ.append(" is not valid");
                C39930Flm.LJ("ResponseCache", X1D.LIZIZ(LIZ), 4);
            } else {
                o.LJIJI("cacheKey");
                throw null;
            }
        }
        return this.LIZIZ;
    }

    public final String LIZIZ() {
        String str = this.LIZLLL;
        if (str != null) {
            return str;
        }
        o.LJIJI("cacheKey");
        throw null;
    }

    public final O4B LIZJ() {
        C61311O4l c61311O4l = this.LIZ.get();
        if (!(c61311O4l instanceof O4B)) {
            c61311O4l = null;
        }
        return (O4B) c61311O4l;
    }

    public final boolean LJ() {
        if (this.LIZIZ && System.currentTimeMillis() > this.LJ) {
            return true;
        }
        return false;
    }

    public final O4O LJFF() {
        O4O o4o;
        O4O o4o2 = null;
        if (!LIZ()) {
            return null;
        }
        WeakReference<O4O> weakReference = this.LJFF;
        if (weakReference != null && (o4o = weakReference.get()) != null) {
            o4o2 = o4o;
        } else {
            File file = this.LIZJ;
            if (file != null && file.isFile()) {
                o4o2 = new O4O(file);
            }
            return o4o2;
        }
        this.LJFF = new WeakReference<>(o4o2);
        return o4o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJI() {
        /*
            r3 = this;
            boolean r0 = r3.LIZ()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.ref.WeakReference<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.LJI
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L1d
            r1 = r0
        L15:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r3.LJI = r0
        L1c:
            return r1
        L1d:
            java.lang.String r2 = r3.LIZLLL
            if (r2 == 0) goto L3e
            com.bytedance.keva.Keva r0 = X.O4W.LIZ
            java.lang.String r2 = r0.getStringJustDisk(r2, r1)
            if (r2 == 0) goto L1c
            com.google.gson.Gson r1 = X.O4C.LIZIZ
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r0 = r0.getClass()
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L1c
            goto L15
        L3e:
            java.lang.String r0 = "cacheKey"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O4B.LJI():java.util.Map");
    }

    public O4B(String str) {
        this.LJII = str;
        this.LIZIZ = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O4B(String url, String cacheFilename) {
        this(url);
        o.LJIIJ(url, "url");
        o.LJIIJ(cacheFilename, "cacheFilename");
        List LJLJJI = s.LJLJJI(s.LJLLLL(cacheFilename, '.'), new char[]{'-'}, false, 6);
        if (LJLJJI.size() == 3) {
            Integer LJJIL = C38350F3i.LJJIL((String) ListProtector.get(LJLJJI, 1));
            if (LJJIL != null) {
                LJJIL.intValue();
                Long LJJIZ = C38350F3i.LJJIZ((String) ListProtector.get(LJLJJI, 2));
                if (LJJIZ != null) {
                    this.LJ = LJJIZ.longValue();
                    CDNFetcher.Companion.getClass();
                    File file = new File(O4E.LIZ(), cacheFilename);
                    if (file.exists() && file.isFile()) {
                        android.net.Uri parse = UriProtector.parse(url);
                        o.LJFF(parse, "Uri.parse(url)");
                        String LIZLLL = O4C.LIZLLL(parse);
                        if (!s.LJJJLZIJ(cacheFilename, LIZLLL, false)) {
                            String LJFF = i0.LJFF(cacheFilename, LIZLLL);
                            File file2 = new File(file.getParent(), LJFF);
                            if (file.renameTo(file2)) {
                                String stringJustDisk = O4W.LIZ.getStringJustDisk(cacheFilename, null);
                                if (stringJustDisk != null) {
                                    O4W.LIZIZ(LJFF, stringJustDisk);
                                    O4W.LIZ(cacheFilename);
                                    cacheFilename = LJFF;
                                    file = file2;
                                } else {
                                    throw new IOException("no repo info found");
                                }
                            } else {
                                throw new IOException("rename failed");
                            }
                        }
                        this.LIZLLL = cacheFilename;
                        this.LIZJ = file;
                        return;
                    }
                    throw new IllegalArgumentException("cache not exists or not a file");
                }
                throw new IllegalArgumentException("file name not valid");
            }
            throw new IllegalArgumentException("file name not valid");
        }
        throw new IllegalArgumentException("file name not valid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O4B(O44 httpResponse, O4O forestBuffer, C61295O3v response) {
        this(httpResponse.LIZLLL.LIZIZ);
        o.LJIIJ(httpResponse, "httpResponse");
        o.LJIIJ(forestBuffer, "forestBuffer");
        o.LJIIJ(response, "response");
        if (forestBuffer.LJIILL()) {
            java.util.Map<String, String> map = httpResponse.LIZLLL.LIZJ;
            LJII(map == null ? C113554cx.LJJJLIIL() : map, httpResponse.LIZJ, forestBuffer, response);
            return;
        }
        throw new IllegalArgumentException("forest buffer not support cache");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0090, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v24, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.util.Map<java.lang.String, java.lang.String> r20, java.util.Map<java.lang.String, java.lang.String> r21, X.O4O r22, X.C61295O3v r23) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O4B.LJII(java.util.Map, java.util.Map, X.O4O, X.O3v):void");
    }
}
