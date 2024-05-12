package X;

import X.C157816Hh;
import kotlin.jvm.internal.o;

/* renamed from: X.Wlv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83255Wlv<T extends C157816Hh> extends AbstractC83313Wmr<T, Void> {
    public final InterfaceC88471Ynr<T, InterfaceC67352kd<? super C76800UCe>, Object> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C83255Wlv(InterfaceC88471Ynr<? super T, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr) {
        super(0);
        this.LIZIZ = interfaceC88471Ynr;
    }

    @Override // X.AbstractC83313Wmr
    public final AbstractC83312Wmq LIZ(Object obj, String taskID) {
        C157816Hh param = (C157816Hh) obj;
        o.LJIIIZ(param, "param");
        o.LJIIIZ(taskID, "taskID");
        return new C83295WmZ(taskID, param, this.LIZIZ);
    }
}
