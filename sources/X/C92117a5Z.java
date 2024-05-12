package X;

import android.webkit.WebSettings;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import java.io.File;

/* renamed from: X.a5Z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92117a5Z implements InterfaceC60455No3 {
    public final /* synthetic */ C92386a9u LIZ;

    public C92117a5Z(C92386a9u c92386a9u) {
        this.LIZ = c92386a9u;
    }

    @Override // X.InterfaceC60455No3
    public final void LIZ(WebSettings webSettings, WebKitView webKitView) {
        String str;
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        webSettings.setCacheMode(2);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        StringBuilder LIZ = X1D.LIZ();
        File parentFile = C16880lQ.LLIIJLIL(this.LIZ.LJLILLLLZI).getParentFile();
        if (parentFile == null || (str = parentFile.getPath()) == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append("/databases/");
        webSettings.setDatabasePath(X1D.LIZIZ(LIZ));
    }
}
