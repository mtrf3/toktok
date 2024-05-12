package X;

import com.bytedance.pia.core.plugins.HtmlPlugin;

/* renamed from: X.EmS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37424EmS implements InterfaceC37454Emw {
    public final /* synthetic */ java.util.Map LIZ;
    public final /* synthetic */ HtmlPlugin LIZIZ;

    @Override // X.InterfaceC37454Emw
    public final /* synthetic */ boolean isForMainFrame() {
        return false;
    }

    @Override // X.InterfaceC37454Emw
    public final android.net.Uri getUrl() {
        return this.LIZIZ.LIZ.LJ;
    }

    @Override // X.InterfaceC37454Emw
    public final java.util.Map<String, String> getRequestHeaders() {
        return this.LIZ;
    }

    public C37424EmS(HtmlPlugin htmlPlugin, java.util.Map map) {
        this.LIZIZ = htmlPlugin;
        this.LIZ = map;
    }
}
