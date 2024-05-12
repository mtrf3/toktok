package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NkQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60230NkQ extends C60379Nmp implements InterfaceC60232NkS {
    public final InterfaceC60233NkT LJLJI;

    @Override // X.InterfaceC60232NkS
    public final InterfaceC60233NkT getConfig() {
        return this.LJLJI;
    }

    public C60230NkQ(C60511Nox config) {
        o.LJIIJ(config, "config");
        this.LJLJI = config;
    }

    @Override // X.InterfaceC60232NkS
    public final C60235NkV LJII(String url, List<String> list) {
        o.LJIIJ(url, "url");
        return C60236NkW.LIZ(url, list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x014a, code lost:
    
        if (r2.equals("webview_page") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01e6, code lost:
    
        if (r13 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01ec, code lost:
    
        if (r13.length() != 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x020f, code lost:
    
        r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r13);
        kotlin.jvm.internal.o.LJFF(r2, "Uri.parse(lynxSchema)");
        r0 = new X.C60231NkR(r2, X.F0S.LYNX);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01ee, code lost:
    
        if (r18 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01f4, code lost:
    
        if (r18.length() != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01ff, code lost:
    
        r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r18);
        kotlin.jvm.internal.o.LJFF(r2, "Uri.parse(rnSchema)");
        r0 = new X.C60231NkR(r2, X.F0S.RN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01f6, code lost:
    
        r0 = new X.C60231NkR(r3, X.F0S.WEB);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0154, code lost:
    
        if (r2.equals("lynxview_page") != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x01bd, code lost:
    
        if (r13 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x01c3, code lost:
    
        if (r13.length() != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x01ce, code lost:
    
        r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r13);
        kotlin.jvm.internal.o.LJFF(r2, "Uri.parse(lynxSchema)");
        r0 = new X.C60231NkR(r2, X.F0S.LYNX);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x01c5, code lost:
    
        r0 = new X.C60231NkR(r3, X.F0S.LYNX);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x015b, code lost:
    
        if (r2.equals("webview") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0165, code lost:
    
        if (r2.equals("lynx_popup") != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x016e, code lost:
    
        if (r2.equals("lynx_page") != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0177, code lost:
    
        if (r2.equals("reactnative_popup") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0194, code lost:
    
        if (r18 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x019a, code lost:
    
        if (r18.length() != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01a5, code lost:
    
        r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r18);
        kotlin.jvm.internal.o.LJFF(r2, "Uri.parse(rnSchema)");
        r0 = new X.C60231NkR(r2, X.F0S.RN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x019c, code lost:
    
        r0 = new X.C60231NkR(r3, X.F0S.RN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0180, code lost:
    
        if (r2.equals("lynxview_popup") != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0189, code lost:
    
        if (r2.equals("reactnative") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0192, code lost:
    
        if (r2.equals("reactnative_page") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01bb, code lost:
    
        if (r2.equals("lynxview") != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01e4, code lost:
    
        if (r2.equals("webview_popup") != false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d4  */
    @Override // X.InterfaceC60232NkS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri LJIIJJI(android.net.Uri r27, android.os.Bundle r28, java.util.List<java.lang.String> r29, java.util.List<? extends X.InterfaceC60163NjL> r30) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60230NkQ.LJIIJJI(android.net.Uri, android.os.Bundle, java.util.List, java.util.List):android.net.Uri");
    }
}
