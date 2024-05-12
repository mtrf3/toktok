package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.AqS56S0400000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.O1g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61228O1g extends IXResourceLoader {
    public final String LJLIL = "CDN";

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final String getTAG() {
        return this.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final O1I loadSync(O1I input, O1L config) {
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        C39973FmT.LIZIZ(this, "start to sync load from cdn", null, null, 6);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LIZIZ(input.LJFF, true, config, new AqS56S0400000_10(this, c68322mC, input, countDownLatch, 6), new AqS114S0300000_10(this, input, countDownLatch, 9));
        countDownLatch.await(config.LIZIZ, TimeUnit.MILLISECONDS);
        return (O1I) c68322mC.element;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(O1I input, O1L config, InterfaceC88472Yns<? super O1I, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        android.net.Uri uri;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        C61237O1p c61237O1p = new C61237O1p();
        C39973FmT.LIZIZ(this, "start to async load from cdn", null, null, 6);
        if (config.LJII.length() == 0) {
            uri = input.LJFF;
        } else {
            uri = UriProtector.parse(config.LJII);
        }
        o.LJFF(uri, "uri");
        LIZIZ(uri, false, config, new AqS56S0400000_10(resolve, input, c61237O1p, reject, 5), new AqS114S0300000_10(input, c61237O1p, reject, 8));
    }

    public final void LIZ(String str, boolean z, O1L o1l, InterfaceC88472Yns<? super C61224O1c, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        C61238O1q.LIZ.LIZ(getService()).LJIIJJI.LIZ(str, z, o1l, new C61229O1h(this, interfaceC88472Yns, str, o1l, interfaceC88472Yns2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r4 = r4.toString();
        kotlin.jvm.internal.o.LJFF(r4, "uri.toString()");
        LIZ(r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.net.Uri r4, boolean r5, X.O1L r6, X.InterfaceC88472Yns<? super X.C61224O1c, X.C76800UCe> r7, X.InterfaceC88472Yns<? super java.lang.Throwable, X.C76800UCe> r8) {
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
            if (r1 == r0) goto L43
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
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "uri.toString()"
            kotlin.jvm.internal.o.LJFF(r4, r0)
            r3.LIZ(r4, r5, r6, r7, r8)
            goto L10
        L43:
            java.lang.String r0 = "lynxview"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6
            java.lang.String r0 = "surl"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r4, r0)
            if (r4 == 0) goto L57
        L53:
            r3.LIZ(r4, r5, r6, r7, r8)
            goto L10
        L57:
            java.lang.String r4 = ""
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61228O1g.LIZIZ(android.net.Uri, boolean, X.O1L, X.Yns, X.Yns):void");
    }
}
