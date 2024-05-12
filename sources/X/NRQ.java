package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NRQ extends AbstractC65781Prl implements InterfaceC88472Yns<NRR, ViewGroup> {
    public static final NRQ LJLIL = new NRQ();

    public NRQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ViewGroup invoke(NRR nrr) {
        NRR inject = nrr;
        o.LJIIIZ(inject, "$this$inject");
        return inject.getContainer();
    }
}
