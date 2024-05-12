package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.THr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74395THr implements InterfaceC72705Sg9 {
    public final /* synthetic */ C74391THn LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ InterfaceC74398THu LJLJI;

    @Override // X.InterfaceC72705Sg9
    public final void LIZ(W4W<C81392Vwy<W5A>> dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
        C74391THn c74391THn = this.LJLIL;
        c74391THn.LIZIZ = true;
        c74391THn.LIZ(this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC72705Sg9
    public final void onFailure(Exception exc) {
        C74391THn c74391THn = this.LJLIL;
        c74391THn.LIZIZ = true;
        c74391THn.LIZ(this.LJLILLLLZI, this.LJLJI);
    }

    public C74395THr(C74391THn c74391THn, Effect effect, InterfaceC74398THu interfaceC74398THu) {
        this.LJLIL = c74391THn;
        this.LJLILLLLZI = effect;
        this.LJLJI = interfaceC74398THu;
    }
}
