package X;

import android.webkit.WebChromeClient;

/* renamed from: X.Ndw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59828Ndw implements InterfaceC59822Ndq {
    public final /* synthetic */ WebChromeClient.FileChooserParams LIZ;

    @Override // X.InterfaceC59822Ndq
    public final String[] LIZ() {
        return this.LIZ.getAcceptTypes();
    }

    public C59828Ndw(WebChromeClient.FileChooserParams fileChooserParams) {
        this.LIZ = fileChooserParams;
    }
}
