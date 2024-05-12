package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final /* synthetic */ class M73 extends TBS implements InterfaceC88471Ynr<M7A, M7A, C76800UCe> {
    public M73(Object obj) {
        super(2, obj, M74.class, "onPopupStateChanged", "onPopupStateChanged(Lcom/bytedance/poplayer/PopupState;Lcom/bytedance/poplayer/PopupState;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(M7A m7a, M7A m7a2) {
        M7A p0 = m7a;
        M7A p1 = m7a2;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        ((M74) this.receiver).onPopupStateChanged(p0, p1);
        return C76800UCe.LIZ;
    }
}
