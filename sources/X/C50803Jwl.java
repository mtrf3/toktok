package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jwl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50803Jwl extends AbstractC60800Ntc {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C68322mC<InterfaceC60761Nsz> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C34K LJLJJI;
    public final /* synthetic */ C50811Jwt LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        this.LJLIL.element = true;
        this.LJLILLLLZI.element = view;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryPreload by spark succeed:");
        LIZ.append(this.LJLJI);
        C15280iq.LIZIZ("search_spark_preload", X1D.LIZIZ(LIZ));
        if (this.LJLJJI.element) {
            C50811Jwt c50811Jwt = this.LJLJJL;
            EnumC50808Jwq enumC50808Jwq = EnumC50808Jwq.SUCCEED;
            c50811Jwt.getClass();
            o.LJIIIZ(enumC50808Jwq, "<set-?>");
            c50811Jwt.LJLJI = enumC50808Jwq;
            if (C50060Jkm.LIZ(this.LJLJI)) {
                AbstractC60800Ntc remove = C50804Jwm.LJ.remove(this.LJLJJL.LJLILLLLZI);
                if (remove != null) {
                    remove.LJJJJJ(view);
                    return;
                }
                return;
            }
            C50804Jwm.LIZ(this.LJLJJLL, this.LJLJI, this.LJLJJL);
            return;
        }
        C50102JlS c50102JlS = new C50102JlS();
        c50102JlS.LJIIZILJ("type", "load_error");
        c50102JlS.LJIL(1);
        c50102JlS.LJIIZILJ("error", "runtime_not_ready");
        c50102JlS.LJIIZILJ("schema", this.LJLJI);
        c50102JlS.LJIILIIL();
        C34444DfU c34444DfU = C34444DfU.LJLILLLLZI;
        String str = this.LJLJI;
        if (!c34444DfU.LJJII()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (!JWA.LJ(str)) {
            return;
        }
        C50811Jwt c50811Jwt2 = this.LJLJJL;
        EnumC50808Jwq enumC50808Jwq2 = EnumC50808Jwq.SUCCEED;
        c50811Jwt2.getClass();
        o.LJIIIZ(enumC50808Jwq2, "<set-?>");
        c50811Jwt2.LJLJI = enumC50808Jwq2;
        if (C50060Jkm.LIZ(this.LJLJI)) {
            AbstractC60800Ntc remove2 = C50804Jwm.LJ.remove(this.LJLJJL.LJLILLLLZI);
            if (remove2 == null) {
                return;
            }
            remove2.LJJJJJ(view);
            return;
        }
        C50804Jwm.LIZ(this.LJLJJLL, this.LJLJI, this.LJLJJL);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRuntimeReady ");
        LIZ.append(this.LJLJI);
        C15280iq.LIZIZ("search_spark_preload", X1D.LIZIZ(LIZ));
        this.LJLJJI.element = true;
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLILLLLZI.element;
        if (interfaceC60761Nsz != null) {
            C34K c34k = this.LJLIL;
            C50811Jwt c50811Jwt = this.LJLJJL;
            String str = this.LJLJI;
            boolean z = this.LJLJJLL;
            if (c34k.element) {
                EnumC50808Jwq enumC50808Jwq = EnumC50808Jwq.SUCCEED;
                c50811Jwt.getClass();
                o.LJIIIZ(enumC50808Jwq, "<set-?>");
                c50811Jwt.LJLJI = enumC50808Jwq;
                if (C50060Jkm.LIZ(str)) {
                    AbstractC60800Ntc remove = C50804Jwm.LJ.remove(c50811Jwt.LJLILLLLZI);
                    if (remove != null) {
                        remove.LJJJJJ(interfaceC60761Nsz);
                        return;
                    }
                    return;
                }
                C50804Jwm.LIZ(z, str, c50811Jwt);
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFailed reason:");
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(this.LJLJI);
        C15280iq.LIZIZ("search_spark_preload", X1D.LIZIZ(LIZ));
        if (C50060Jkm.LIZ(this.LJLJI)) {
            C50811Jwt c50811Jwt = this.LJLJJL;
            EnumC50808Jwq enumC50808Jwq = EnumC50808Jwq.FAILED;
            c50811Jwt.getClass();
            o.LJIIIZ(enumC50808Jwq, "<set-?>");
            c50811Jwt.LJLJI = enumC50808Jwq;
            AbstractC60800Ntc remove = C50804Jwm.LJ.remove(this.LJLJJL.LJLILLLLZI);
            if (remove != null) {
                remove.LJJJJI(view, url, str);
            }
        }
    }

    public C50803Jwl(C34K c34k, C68322mC<InterfaceC60761Nsz> c68322mC, String str, C34K c34k2, C50811Jwt c50811Jwt, boolean z) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = str;
        this.LJLJJI = c34k2;
        this.LJLJJL = c50811Jwt;
        this.LJLJJLL = z;
    }
}
