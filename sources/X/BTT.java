package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BTT extends BTZ<C28826BTa> {
    public static final List<String> LJFF = C47261Igj.LJJIJIIJI("webcast_webview", "webcast_lynxview", "webcast_webview_popup", "webcast_lynxview_popup", "webcast_lynxview_card");
    public final U4A LIZIZ;
    public final C78253UnR LIZJ;
    public final C28869BUr LIZLLL;
    public final BNV LJ;

    @Override // X.BTZ
    public final List<String> LIZIZ() {
        return LJFF;
    }

    @Override // X.BTZ
    public final boolean LIZ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        if (this.LIZIZ.canHandle(uri) || this.LIZJ.canHandle(uri) || this.LIZLLL.canHandle(uri) || this.LJ.canHandle(uri)) {
            return true;
        }
        return false;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        android.net.Uri uri = c28826BTa.LIZ;
        if (uri == null) {
            return false;
        }
        if (this.LIZIZ.canHandle(uri)) {
            return this.LIZIZ.LIZJ(context, uri, null);
        }
        if (this.LIZJ.canHandle(uri)) {
            return this.LIZJ.handle(context, uri);
        }
        if (this.LIZLLL.canHandle(uri)) {
            return this.LIZLLL.handle(context, uri);
        }
        if (!this.LJ.canHandle(uri)) {
            return false;
        }
        return this.LJ.handle(context, uri);
    }

    public BTT(U4A u4a, C78253UnR c78253UnR, C28869BUr c28869BUr, BNV bnv) {
        this.LIZIZ = u4a;
        this.LIZJ = c78253UnR;
        this.LIZLLL = c28869BUr;
        this.LJ = bnv;
    }
}
