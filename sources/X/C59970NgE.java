package X;

import android.webkit.ValueCallback;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.NgE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59970NgE<T> implements ValueCallback {
    public final /* synthetic */ android.net.Uri LIZ;
    public final /* synthetic */ AddWikiActivity LIZIZ;

    public C59970NgE(android.net.Uri uri, AddWikiActivity addWikiActivity) {
        this.LIZ = uri;
        this.LIZIZ = addWikiActivity;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        android.net.Uri uri = this.LIZ;
        o.LJIIIIZZ(uri, "uri");
        C35972E9w.LIZ((String) obj, uri, this.LIZIZ.LLIIJLIL().copyBackForwardList());
    }
}
