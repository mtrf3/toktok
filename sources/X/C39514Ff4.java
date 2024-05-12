package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ff4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39514Ff4 extends F9E {
    public final WebView LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C39514Ff4(WebView webView, String namespace) {
        o.LJIIIZ(namespace, "namespace");
        this.LJLIL = webView;
        this.LJLILLLLZI = namespace;
    }
}
