package X;

import android.content.Context;
import com.bytedance.android.live.browser.IBrowserService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BTc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28828BTc extends AbstractC28827BTb<C28826BTa> {
    public static final C28828BTc LIZIZ = new C28828BTc();
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("http", "https");

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        android.net.Uri uri = c28826BTa.LIZ;
        if (uri == null) {
            return false;
        }
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        C30882CAc.LJII(context, new C28871BUt(uri.toString()));
        return true;
    }
}
