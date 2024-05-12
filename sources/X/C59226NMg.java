package X;

import android.webkit.WebView;

/* renamed from: X.NMg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59226NMg extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ NUJ LJLIL;
    public final /* synthetic */ WebView LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59226NMg(NUJ nuj, WebView webView, String str, int i, String str2) {
        super(0);
        this.LJLIL = nuj;
        this.LJLILLLLZI = webView;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        NJX.LIZIZ(this.LJLIL.LIZ, this.LJLILLLLZI, this.LJLJI, false, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
