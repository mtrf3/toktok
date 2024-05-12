package X;

import android.webkit.WebView;

/* renamed from: X.Ndd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59809Ndd extends C60404NnE {
    public final /* synthetic */ C59075NGl LJLIL;

    public C59809Ndd(C59075NGl c59075NGl) {
        this.LJLIL = c59075NGl;
    }

    @Override // X.AbstractC60402NnC
    public final void onProgressChanged(WebView webView, int i) {
        this.LJLIL.LJLILLLLZI.setProgress(i);
    }
}
