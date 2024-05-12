package X;

import android.webkit.WebView;

/* renamed from: X.EsU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37798EsU implements Runnable {
    public final /* synthetic */ WebView LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ C68322mC<android.net.Uri> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ android.net.Uri LJLJJL;
    public final /* synthetic */ java.util.Map<String, String> LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC37798EsU(WebView webView, C68322mC<String> c68322mC, C68322mC<android.net.Uri> c68322mC2, boolean z, android.net.Uri uri, java.util.Map<String, String> map, String str) {
        this.LJLIL = webView;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c68322mC2;
        this.LJLJJI = z;
        this.LJLJJL = uri;
        this.LJLJJLL = map;
        this.LJLJL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto La6
            android.webkit.WebView r1 = r7.LJLIL
            java.util.WeakHashMap<android.webkit.WebView, java.lang.ref.WeakReference<android.webkit.WebViewClient>> r0 = X.EXK.LJII
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L2f
            java.lang.Object r6 = r0.get()
            android.webkit.WebViewClient r6 = (android.webkit.WebViewClient) r6
            if (r6 == 0) goto L2f
            android.webkit.WebView r5 = r7.LJLIL
            X.EsV r4 = new X.EsV
            X.2mC<android.net.Uri> r3 = r7.LJLJI
            boolean r2 = r7.LJLJJI
            java.lang.String r1 = r7.LJLJL
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.LJLJJLL
            r4.<init>(r3, r2, r1, r0)
            boolean r0 = r6.shouldOverrideUrlLoading(r5, r4)
        L2d:
            if (r0 != 0) goto L61
        L2f:
            X.EsW r3 = X.C37801EsX.LJIIIIZZ
            android.webkit.WebView r2 = r7.LJLIL
            X.2mC<android.net.Uri> r0 = r7.LJLJI
            T r0 = r0.element
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r1 = r0.toString()
            boolean r0 = r7.LJLJJI
            r3.getClass()
            X.EsX r3 = X.C37800EsW.LIZ(r2, r1, r0)
            if (r3 != 0) goto L81
        L48:
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.LJLJJLL
            if (r0 == 0) goto L52
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L62
        L52:
            android.webkit.WebView r1 = r7.LJLIL
            X.2mC<android.net.Uri> r0 = r7.LJLJI
            T r0 = r0.element
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r0 = r0.toString()
            X.C16880lQ.LLZZ(r1, r0)
        L61:
            return
        L62:
            android.webkit.WebView r4 = r7.LJLIL
            X.2mC<android.net.Uri> r0 = r7.LJLJI
            T r0 = r0.element
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r3 = r0.toString()
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.LJLJJLL
            X.EgD r0 = X.C37037EgD.LIZ
            java.lang.String r1 = r0.LIZLLL(r4, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7d
            r3 = r1
        L7d:
            r4.loadUrl(r3, r2)
            goto L61
        L81:
            android.webkit.WebView r2 = r7.LJLIL
            android.net.Uri r0 = r7.LJLJJL
            java.lang.String r1 = r0.toString()
            boolean r0 = r7.LJLJJI
            X.EsX r0 = X.C37800EsW.LIZ(r2, r1, r0)
            r3.LIZIZ = r0
            if (r3 == 0) goto L48
            org.json.JSONObject r1 = r3.LIZ()
            if (r1 == 0) goto La4
            java.lang.String r0 = "count"
            int r1 = r1.optInt(r0)
        L9f:
            int r0 = r3.LIZ
            if (r1 <= r0) goto L48
            goto L61
        La4:
            r1 = 0
            goto L9f
        La6:
            android.webkit.WebView r1 = r7.LJLIL
            java.util.WeakHashMap<android.webkit.WebView, java.lang.ref.WeakReference<android.webkit.WebViewClient>> r0 = X.EXK.LJII
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L2f
            java.lang.Object r2 = r0.get()
            android.webkit.WebViewClient r2 = (android.webkit.WebViewClient) r2
            if (r2 == 0) goto L2f
            android.webkit.WebView r1 = r7.LJLIL
            X.2mC<java.lang.String> r0 = r7.LJLILLLLZI
            T r0 = r0.element
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r2.shouldOverrideUrlLoading(r1, r0)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC37798EsU.LIZ():void");
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
