package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;

/* renamed from: X.7BH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BH extends C7B9 {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final DataCenter LJLJI;

    @Override // X.C7B9, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if ((interfaceC57784Mm4 instanceof C7BH) && ((C7BH) interfaceC57784Mm4).LJLIL == this.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof C7BH;
    }

    public C7BH(int i, int i2, DataCenter dataCenter) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = dataCenter;
    }
}
