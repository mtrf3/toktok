package X;

import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.Erm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37754Erm<T> implements ValueCallback {
    public final /* synthetic */ android.net.Uri LIZ;
    public final /* synthetic */ WebKitView LIZIZ;

    public C37754Erm(android.net.Uri uri, WebKitView webKitView) {
        this.LIZ = uri;
        this.LIZIZ = webKitView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        android.net.Uri uri = this.LIZ;
        o.LJIIIIZZ(uri, "uri");
        WebBackForwardList copyBackForwardList = this.LIZIZ.copyBackForwardList();
        o.LJIIIIZZ(copyBackForwardList, "it.copyBackForwardList()");
        C35972E9w.LIZ((String) obj, uri, copyBackForwardList);
    }
}
