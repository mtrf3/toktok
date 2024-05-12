package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BAP implements InterfaceC75507TkF {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;

    @Override // X.InterfaceC75507TkF
    public final void onFailed(String errorMessage) {
        o.LJIIIZ(errorMessage, "errorMessage");
    }

    @Override // X.InterfaceC75507TkF
    public final void onSuccess() {
        this.LIZ.invoke();
    }

    public BAP(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
    }
}
