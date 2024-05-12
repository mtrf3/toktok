package X;

import android.webkit.WebView;

/* renamed from: X.Fof, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40109Fof extends C60413NnN {
    public int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C40109Fof(int i) {
        this.LJLJI = i;
    }

    @Override // X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        int i = this.LJLILLLLZI + 1;
        this.LJLILLLLZI = i;
        if (i != 1) {
            if (i == 2) {
                IK8.LIZIZ(this.LJLJI);
            }
        } else if (webView != null) {
            C78565UsT.LJJIJLIJ(webView, new C40108Foe(this.LJLJI, null));
        }
        super.LJ(webView, str);
    }
}
