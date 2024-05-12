package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JfK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49722JfK extends C49917JiT<C49820Jgu> {
    @Override // X.C49917JiT, X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        super.onSuccess();
        T t = this.LJLIL;
        if (((AbstractC51036K1g) t).mListQueryType == 4 && ((AbstractC51036K1g) t).isDataEmpty()) {
            ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
        }
    }

    @Override // X.C49917JiT, X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        super.onFailed(e);
        if ((e instanceof JZN) && ((AbstractC51036K1g) this.LJLIL).isDataEmpty()) {
            ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
        }
    }
}
