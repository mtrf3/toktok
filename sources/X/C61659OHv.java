package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OHv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61659OHv extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public final C35893E6v L() {
        return new C35893E6v((java.util.Map<String, ? extends Object>) C113554cx.LJJL(new OSZ("container_load_error_code", Integer.valueOf(this.LJLIL)), new OSZ("container_load_error_msg", this.LJLILLLLZI)));
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C61659OHv(int i, String errorMsg, String virtualAid, String biz) {
        o.LJIIJ(errorMsg, "errorMsg");
        o.LJIIJ(virtualAid, "virtualAid");
        o.LJIIJ(biz, "biz");
        this.LJLIL = i;
        this.LJLILLLLZI = errorMsg;
        this.LJLJI = virtualAid;
        this.LJLJJI = biz;
    }
}
