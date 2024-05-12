package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIJ implements Serializable {
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public HIJ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final InterfaceC65784Pro<C76800UCe> getOnFail() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnSuccess() {
        return this.LJLIL;
    }

    public final void setOnFail(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    public final void setOnSuccess(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLIL = interfaceC65784Pro;
    }

    public HIJ(InterfaceC65784Pro<C76800UCe> onSuccess, InterfaceC65784Pro<C76800UCe> onFail) {
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFail, "onFail");
        this.LJLIL = onSuccess;
        this.LJLILLLLZI = onFail;
    }

    public /* synthetic */ HIJ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HIK.LJLIL : interfaceC65784Pro, (i & 2) != 0 ? HIL.LJLIL : interfaceC65784Pro2);
    }
}
