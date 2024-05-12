package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* renamed from: X.NrQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60664NrQ implements InterfaceC60684Nrk {
    public final /* synthetic */ C60680Nrg LIZ;

    public C60664NrQ(C60680Nrg c60680Nrg) {
        this.LIZ = c60680Nrg;
    }

    @Override // X.InterfaceC60684Nrk
    public final WebKitView LIZ(Context context, EnumC60689Nrp enumC60689Nrp) {
        if (enumC60689Nrp == EnumC60689Nrp.WEB) {
            WebKitView webKitView = new WebKitView(context);
            C16880lQ.LLZLL(webKitView, new C60667NrT());
            if (this.LIZ.LIZJ) {
                webKitView.LJLLLL(context, webKitView.getHybridContext());
            }
            if (this.LIZ.LIZLLL) {
                C60634Nqw c60634Nqw = new C60634Nqw();
                C60623Nql c60623Nql = (C60623Nql) C60632Nqu.LIZ(C60425NnZ.class, "hybrid_web_extension_webkit");
                C60630Nqs c60630Nqs = c60634Nqw.LIZ;
                c60630Nqs.LIZJ = webKitView;
                c60623Nql.LIZ(context, c60630Nqs);
                if (this.LIZ.LIZJ) {
                    webKitView.setJsBridgeOnKitViewProvided(context);
                    return webKitView;
                }
                return webKitView;
            }
            return webKitView;
        }
        return null;
    }
}
