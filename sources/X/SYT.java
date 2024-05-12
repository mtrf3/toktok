package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SYT implements InterfaceC57784Mm4, SYX {
    public C8BG<?> LJLIL;
    public SZT LJLILLLLZI;
    public SZT LJLJI;

    public SYT() {
        this(null);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public SYT(Object obj) {
        this.LJLIL = null;
        this.LJLJI = new SZT();
    }

    @Override // X.SYX
    public final void LJIIL(SZZ data) {
        o.LJIIIZ(data, "data");
        SZT value = data.LJLILLLLZI;
        o.LJIIIZ(value, "value");
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = value;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        AbstractC72298SZa abstractC72298SZa;
        SYT syt;
        SZT szt;
        SZT szt2 = this.LJLILLLLZI;
        AbstractC72298SZa abstractC72298SZa2 = null;
        if (szt2 != null) {
            abstractC72298SZa = szt2.LJLILLLLZI;
        } else {
            abstractC72298SZa = null;
        }
        if ((interfaceC57784Mm4 instanceof SYT) && (syt = (SYT) interfaceC57784Mm4) != null && (szt = syt.LJLJI) != null) {
            abstractC72298SZa2 = szt.LJLILLLLZI;
        }
        return o.LJ(abstractC72298SZa, abstractC72298SZa2);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
