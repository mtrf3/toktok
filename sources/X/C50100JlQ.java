package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.AqS8S0600000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JlQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50100JlQ extends AbstractC60800Ntc {
    public final /* synthetic */ C68322mC<C50811Jwt> LJLIL;
    public final /* synthetic */ C50098JlO LJLILLLLZI;
    public final /* synthetic */ C50107JlX LJLJI;
    public final /* synthetic */ AbstractC60800Ntc LJLJJI;
    public final /* synthetic */ DynamicPatch LJLJJL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJLL;
    public final /* synthetic */ JTD LJLJL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C50811Jwt c50811Jwt = this.LJLIL.element;
        if (c50811Jwt != null) {
            C50802Jwk.LIZLLL(this.LJLILLLLZI, c50811Jwt, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            C50802Jwk.LIZ.LIZJ(this.LJLJI, this.LJLILLLLZI, this.LJLJJL, this.LJLJL, this.LJLJJLL, this.LJLJJI);
        } else {
            C243119gR.LIZ(new AqS8S0600000_8(this.LJLJI, (C50107JlX) this.LJLILLLLZI, (C50098JlO) this.LJLJJL, (DynamicPatch) this.LJLJL, (JTD) this.LJLJJLL, (java.util.Map<String, ? extends Object>) this.LJLJJI, (AbstractC60800Ntc) 0));
        }
    }

    public C50100JlQ(C68322mC c68322mC, C50098JlO c50098JlO, C50107JlX c50107JlX, C50099JlP c50099JlP, DynamicPatch dynamicPatch, java.util.Map map, JTD jtd) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c50098JlO;
        this.LJLJI = c50107JlX;
        this.LJLJJI = c50099JlP;
        this.LJLJJL = dynamicPatch;
        this.LJLJJLL = map;
        this.LJLJL = jtd;
    }
}
