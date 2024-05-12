package X;

import android.webkit.WebView;
import java.util.List;

/* renamed from: X.Eg8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37032Eg8 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C35996EAu LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ WebView LJLJL;
    public final /* synthetic */ OSJ<String, String, List<String>> LJLJLJ;
    public final /* synthetic */ EnumC37038EgE LJLJLLL;
    public final /* synthetic */ Throwable LJLL;

    public RunnableC37032Eg8(String str, String str2, boolean z, C35996EAu c35996EAu, String str3, boolean z2, WebView webView, OSJ osj, EnumC37038EgE enumC37038EgE, C37033Eg9 c37033Eg9) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = z;
        this.LJLJJI = c35996EAu;
        this.LJLJJL = str3;
        this.LJLJJLL = z2;
        this.LJLJL = webView;
        this.LJLJLJ = osj;
        this.LJLJLLL = enumC37038EgE;
        this.LJLL = c37033Eg9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        r1 = r7.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        if ((r1 instanceof android.app.Activity) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        r0 = X.C16880lQ.LJLLILLLL(r1.getClass());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010d, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010f, code lost:
    
        r0 = X.C16880lQ.LJLLILLLL(r0.getClass());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0117, code lost:
    
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0119, code lost:
    
        r0 = X.C16880lQ.LJLLILLLL(r1.getClass());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r2.put("containerName", r0);
        r2.put("containerType", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        r1 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        r2.put("injectTiming", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        r8 = new java.lang.StringBuilder();
        r7 = r3.getStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        if (r7 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        r6 = r7.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r5 >= r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        r9 = r7[r5];
        r10 = X.C38387F4t.LIZ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r10.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        r3 = r10.next();
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (r9 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        r0 = r9.getClassName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (ujb.o.LJJJLIIL(r0, r1, false) != true) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        if (r3 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("at ");
        r1.append(r9);
        r1.append('\n');
        r8.append(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        r1 = r8.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "stackTraceBuffer.toString()");
        r2.put("callingPoint", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        X.C09900aA.LJ("hybrid_security_monitor_jsGuard", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0136, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        r1 = X.EnumC37038EgE.PAGE_INIT.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0080, code lost:
    
        if (r8 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC37032Eg8.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
