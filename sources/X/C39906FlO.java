package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FlO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39906FlO extends AbstractC60811Ntn {
    public boolean LJLILLLLZI = true;
    public String LJLJI = "";

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            C35918E7u.LIZ = true;
            C35918E7u.LIZJ(this.LJLJI, true);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        if (this.LJLJI.length() == 0) {
            this.LJLJI = url;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            C35918E7u.LIZ = false;
            C35918E7u.LIZJ(this.LJLJI, false);
        }
    }
}
