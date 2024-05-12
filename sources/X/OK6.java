package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OK6 extends OK7 {
    public final List<String> LJLJJL = C47261Igj.LJJIJIL("//obj/tiktok-teko-internal-sg/tiktok/fe/live/tiktok_fe_address_map_pia/index.html", "//obj/tiktok-teko-source-sg/tiktok/fe/live/tiktok_fe_address_map_pia/index.html");
    public final List<String> LJLJJLL = C47261Igj.LJJIJIL("https://lf16-gecko-source.tiktokcdn.com");

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        View view2 = null;
        if (interfaceC38263Ezz != null) {
            view = interfaceC38263Ezz.getView();
        } else {
            view = null;
        }
        if (view instanceof WebView) {
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            if (interfaceC38263Ezz2 != null) {
                view2 = interfaceC38263Ezz2.getView();
            }
            o.LJII(view2, "null cannot be cast to non-null type android.webkit.WebView");
            String url = ((WebView) view2).getUrl();
            if (url == null) {
                C31626Cb8.LIZ(c37356ElM, 0, "XGetCurrentLocation get wrong url", 4);
                return;
            }
            android.net.Uri parse = UriProtector.parse(url);
            o.LJIIIIZZ(parse, "Uri.parse(this)");
            String path = parse.getPath();
            String host = parse.getHost();
            List<String> list = this.LJLJJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append(host);
            if (!list.contains(X1D.LIZIZ(LIZ)) || !ORZ.LJLJJI(path, this.LJLJJL)) {
                C31626Cb8.LIZ(c37356ElM, 0, "XGetCurrentLocation get wrong path", 4);
                return;
            } else {
                C78996UzQ.LJIIIZ(new C85405XfV(c37356ElM));
                return;
            }
        }
        C31626Cb8.LIZ(c37356ElM, 0, "XGetCurrentLocation get wrong view", 4);
    }
}
