package X;

import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2Q extends IHybridResourceLoader {
    public final String LIZ = "CDN";

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final String getTAG() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final O26 loadSync(O26 input, O1M config) {
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, "start to sync load from cdn", null, null, 6);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LIZ(input.LJI, true, config, new AqS56S0400000_10(this, c68322mC, input, countDownLatch, 16), new AqS114S0300000_10(this, input, countDownLatch, 28));
        countDownLatch.await(config.LIZJ, TimeUnit.MILLISECONDS);
        return (O26) c68322mC.element;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void loadAsync(O26 input, O1M config, InterfaceC88472Yns<? super O26, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        android.net.Uri uri;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        C61268O2u c61268O2u = new C61268O2u();
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, "start to async load from cdn", null, null, 6);
        if (config.LJIIIIZZ.length() == 0) {
            uri = input.LJI;
        } else {
            uri = UriProtector.parse(config.LJIIIIZZ);
        }
        o.LJFF(uri, "uri");
        LIZ(uri, false, config, new AqS56S0400000_10(resolve, input, c61268O2u, reject, 15), new AqS114S0300000_10(input, c61268O2u, reject, 27));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r2 = r4.toString();
        kotlin.jvm.internal.o.LJFF(r2, "uri.toString()");
        X.C61270O2w.LIZ.LIZ(getService()).LJI.LIZ(r2, r5, r6, new X.O2V(r3, r7, r2, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.net.Uri r4, boolean r5, X.O1M r6, X.InterfaceC88472Yns<? super X.C61258O2k, X.C76800UCe> r7, X.InterfaceC88472Yns<? super java.lang.Throwable, X.C76800UCe> r8) {
        /*
            r3 = this;
            java.lang.String r2 = r4.getScheme()
            if (r2 != 0) goto L11
        L6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cdn Invalid URL"
            r1.<init>(r0)
            r8.invoke(r1)
        L10:
            return
        L11:
            int r1 = r2.hashCode()
            r0 = -1772600516(0xffffffff9658433c, float:-1.7469556E-25)
            if (r1 == r0) goto L54
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r0) goto L25
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r1 == r0) goto L2e
            goto L6
        L25:
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6
            goto L36
        L2e:
            java.lang.String r0 = "https"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6
        L36:
            java.lang.String r2 = r4.toString()
            java.lang.String r0 = "uri.toString()"
            kotlin.jvm.internal.o.LJFF(r2, r0)
            X.O2S r1 = X.C61270O2w.LIZ
            com.bytedance.lynx.hybrid.service.IResourceService r0 = r3.getService()
            X.O2J r0 = r1.LIZ(r0)
            X.O2y r1 = r0.LJI
            X.O2V r0 = new X.O2V
            r0.<init>(r3, r7, r2, r8)
            r1.LIZ(r2, r5, r6, r0)
            goto L10
        L54:
            java.lang.String r0 = "lynxview"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6
            java.lang.String r0 = "surl"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r4, r0)
            if (r2 == 0) goto L79
        L64:
            X.O2S r1 = X.C61270O2w.LIZ
            com.bytedance.lynx.hybrid.service.IResourceService r0 = r3.getService()
            X.O2J r0 = r1.LIZ(r0)
            X.O2y r1 = r0.LJI
            X.O2V r0 = new X.O2V
            r0.<init>(r3, r7, r2, r8)
            r1.LIZ(r2, r5, r6, r0)
            goto L10
        L79:
            java.lang.String r2 = ""
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2Q.LIZ(android.net.Uri, boolean, X.O1M, X.Yns, X.Yns):void");
    }
}
