package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.O3w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61296O3w {
    public volatile O4F LIZ;
    public volatile boolean LIZIZ;
    public volatile String LIZJ;
    public C61286O3m LIZLLL;
    public AbstractC40713FyP LJ;
    public O4I<O4B> LJFF;
    public volatile boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public Object LJIIJJI;
    public final C61295O3v LJIIL;
    public final InterfaceC61309O4j LJIILIIL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJIILJJIL;

    public final void LIZ() {
        AbstractC40713FyP abstractC40713FyP;
        if (!this.LJI && !this.LJIIIIZZ && !this.LJII && (abstractC40713FyP = this.LJ) != null) {
            C61298O3y.LIZIZ.remove(abstractC40713FyP.toString());
        }
        this.LJ = null;
    }

    public final void LIZLLL() {
        this.LIZ = O4F.SUCCESS;
        this.LJIIL.LJZL = true;
        LIZ();
        this.LJIIL.W(null, "cdn_finish");
        this.LJIIL.W(null, "cdn_total_finish");
        this.LJIIJJI = null;
        this.LJIILJJIL.invoke(Boolean.TRUE);
    }

    public final void LIZIZ(O4H o4h) {
        if (!this.LJIIL.LJLILLLLZI) {
            C61286O3m c61286O3m = this.LIZLLL;
            c61286O3m.getClass();
            if (c61286O3m.LJIIJ) {
                if (c61286O3m.LJI == 1) {
                    c61286O3m.LJI = 2;
                    OSZ<String, ? extends android.net.Uri> osz = c61286O3m.LJIIIIZZ;
                    if (osz != null) {
                        c61286O3m.LIZIZ(o4h);
                        c61286O3m.LIZJ(osz.getSecond(), osz.getFirst());
                        c61286O3m.LIZ().add(c61286O3m.LIZLLL);
                    } else {
                        c61286O3m.LIZIZ(o4h);
                        c61286O3m.LIZJ(c61286O3m.LIZ.getUri(), c61286O3m.LIZ.getUrl());
                        c61286O3m.LIZ().add(c61286O3m.LIZLLL);
                    }
                } else {
                    OSZ<String, android.net.Uri> LIZLLL = c61286O3m.LIZLLL(true);
                    if (LIZLLL != null) {
                        c61286O3m.LIZIZ(o4h);
                        c61286O3m.LJIIIIZZ = null;
                        c61286O3m.LIZJ(LIZLLL.getSecond(), LIZLLL.getFirst());
                        c61286O3m.LIZ().add(c61286O3m.LIZLLL);
                    } else {
                        if (c61286O3m.LJII == 1) {
                            c61286O3m.LJII = 2;
                        }
                        c61286O3m.LJIIIIZZ = null;
                        if ((!o.LJ(c61286O3m.LIZLLL, c61286O3m.LIZ.getUrl())) && c61286O3m.LIZIZ == 0) {
                            c61286O3m.LIZJ(c61286O3m.LIZ.getUri(), c61286O3m.LIZ.getUrl());
                            c61286O3m.LIZ().add(c61286O3m.LIZLLL);
                        } else {
                            List<String> fallbackDomains = c61286O3m.LIZ.getFallbackDomains();
                            if (c61286O3m.LIZIZ >= fallbackDomains.size()) {
                                c61286O3m.LJIIJ = false;
                            } else {
                                String str = (String) ListProtector.get(fallbackDomains, c61286O3m.LIZIZ);
                                c61286O3m.LIZIZ++;
                                int loadRetryTimes = c61286O3m.LIZ.getLoadRetryTimes() + 1;
                                if (loadRetryTimes < 1) {
                                    loadRetryTimes = 1;
                                }
                                c61286O3m.LJFF = loadRetryTimes;
                                android.net.Uri build = c61286O3m.LJ.buildUpon().authority(str).build();
                                o.LJFF(build, "currentUri.buildUpon().a…hority(authority).build()");
                                c61286O3m.LJ = build;
                                String uri = build.toString();
                                o.LJFF(uri, "currentUri.toString()");
                                c61286O3m.LIZLLL = uri;
                                c61286O3m.LIZ().add(c61286O3m.LIZLLL);
                            }
                        }
                    }
                }
                this.LJIILIIL.LIZ(this.LJIIL.LJZI.getForest().getApplication(), this);
                return;
            }
        }
        C61287O3n c61287O3n = this.LJIIL.LL;
        String valueOf = String.valueOf(o4h.getMessage());
        c61287O3n.getClass();
        c61287O3n.LJIIJ = valueOf;
        this.LIZ = O4F.FAILURE;
        this.LJIIJJI = null;
        C61295O3v c61295O3v = this.LJIIL;
        c61295O3v.LJZL = false;
        c61295O3v.W(null, "cdn_finish");
        this.LJIIL.W(null, "cdn_total_finish");
        if (this.LIZ != O4F.CANCEL) {
            LIZ();
            C61287O3n c61287O3n2 = this.LJIIL.LL;
            String message = o4h.getMessage();
            if (message == null) {
                message = "download failed";
            }
            c61287O3n2.LIZ(3, message);
        }
        this.LJIILJJIL.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r8 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r7, X.C61296O3w r8) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61296O3w.LIZJ(java.lang.String, X.O3w):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61296O3w(X.C61295O3v r6, X.InterfaceC61309O4j r7, kotlin.jvm.internal.AqS141S0200000_10 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIJ(r6, r0)
            java.lang.String r0 = "netDepender"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            r5.<init>()
            r5.LJIIL = r6
            r5.LJIILIIL = r7
            r5.LJIILJJIL = r8
            X.O4F r0 = X.O4F.PENDING
            r5.LIZ = r0
            X.O3m r0 = new X.O3m
            r0.<init>(r5)
            r5.LIZLLL = r0
            com.bytedance.forest.model.Request r1 = r6.LJZI
            boolean r0 = r1.getOnlyLocal()
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L34
            boolean r0 = X.C61325O4z.LIZIZ()
            if (r0 == 0) goto L7a
            boolean r0 = r1.isASync()
            if (r0 != 0) goto L7a
        L34:
            r0 = 1
        L35:
            r5.LJII = r0
            if (r0 != 0) goto L78
            com.bytedance.forest.model.Request r1 = r6.LJZI
            boolean r0 = r1.getOnlyOnline()
            if (r0 != 0) goto L47
            boolean r0 = r1.getEnableCDNCache()
            if (r0 != 0) goto L78
        L47:
            r0 = 1
        L48:
            r5.LJIIIIZZ = r0
            if (r0 == 0) goto L76
            com.bytedance.forest.model.Request r0 = r6.LJZI
            boolean r0 = r0.getEnableNegotiation()
            if (r0 != 0) goto L76
            r0 = 1
        L55:
            r5.LJIIIZ = r0
            com.bytedance.forest.model.Request r0 = r6.LJZI
            java.lang.Object r2 = r0.getWebResourceRequest()
            boolean r0 = r2 instanceof android.webkit.WebResourceRequest
            r1 = 0
            if (r0 != 0) goto L63
            r2 = r1
        L63:
            android.webkit.WebResourceRequest r2 = (android.webkit.WebResourceRequest) r2
            if (r2 == 0) goto L6d
            boolean r0 = r2.isForMainFrame()
            if (r0 == r3) goto L6e
        L6d:
            r4 = 1
        L6e:
            r5.LJIIJ = r4
            java.lang.String r0 = "cdn_start"
            r6.W(r1, r0)
            return
        L76:
            r0 = 0
            goto L55
        L78:
            r0 = 0
            goto L48
        L7a:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61296O3w.<init>(X.O3v, X.O4j, kotlin.jvm.internal.AqS141S0200000_10):void");
    }
}
