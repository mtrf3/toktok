package X;

import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.AqS157S0200000_10;

/* renamed from: X.NMf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59225NMf extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ WebResourceRequest LJLILLLLZI;
    public final /* synthetic */ NUJ LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ WebView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59225NMf(Boolean bool, WebResourceRequest webResourceRequest, NUJ nuj, String str, WebView webView) {
        super(0);
        this.LJLIL = bool;
        this.LJLILLLLZI = webResourceRequest;
        this.LJLJI = nuj;
        this.LJLJJI = str;
        this.LJLJJL = webView;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        Boolean bool = this.LJLIL;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        boolean z2 = !z;
        WebResourceRequest webResourceRequest = this.LJLILLLLZI;
        if (webResourceRequest != null && Build.VERSION.SDK_INT >= 24) {
            z2 = webResourceRequest.isRedirect();
        }
        NUJ nuj = this.LJLJI;
        NMZ nmz = nuj.LIZ;
        N1V n1v = nmz.LIZIZ;
        if (n1v != null) {
            n1v.LJII(this.LJLJJI, z2, nmz.LJIIIZ, new AqS157S0200000_10(nuj, this.LJLJJL, 24), this.LJLJJL);
        }
        this.LJLJI.LIZ.LJIIIZ = 0;
        return C76800UCe.LIZ;
    }
}
