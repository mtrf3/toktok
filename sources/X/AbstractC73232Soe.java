package X;

import X.AbstractC73265SpB;
import X.C73236Soi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Soe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73232Soe<T, VH extends AbstractC73265SpB<T>, M extends C73236Soi<VH>> extends AbstractC73235Soh<VH, M> implements InterfaceC73226SoY<T> {
    public final C60930Nvi LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return LJJIIZI().LIZJ.size();
    }

    public AbstractC73232Soe(C73246Sos config) {
        o.LJIIJ(config, "config");
        this.LJLIL = null;
        new C73231Sod(new C73238Sok(this), config, null);
    }

    @Override // X.InterfaceC73226SoY
    public final void LJJIIJ(List<? extends T> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIJ(list, "list");
        C73227SoZ.LIZIZ(this, list, interfaceC65784Pro);
    }

    public final T LJLZ(int i, boolean z) {
        return LJJIIZI().LIZ(i, z);
    }
}
