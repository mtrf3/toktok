package X;

import android.webkit.WebResourceResponse;
import java.io.InputStream;

/* renamed from: X.O4h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61307O4h implements InterfaceC61315O4p {
    public boolean LIZ;
    public final /* synthetic */ WebResourceResponse LIZIZ;

    @Override // X.InterfaceC61315O4p
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC61315O4p
    public final InputStream LIZ() {
        if (!this.LIZ) {
            this.LIZ = true;
            return this.LIZIZ.getData();
        }
        return null;
    }

    public C61307O4h(WebResourceResponse webResourceResponse) {
        this.LIZIZ = webResourceResponse;
    }
}
