package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140825fq extends AbstractC65781Prl implements InterfaceC88471Ynr<AbstractC142705is, Runnable, C76800UCe> {
    public static final C140825fq LJLIL = new C140825fq();

    public C140825fq() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AbstractC142705is abstractC142705is, Runnable runnable) {
        Runnable task = runnable;
        o.LJIIIZ(abstractC142705is, "<anonymous parameter 0>");
        o.LJIIIZ(task, "task");
        task.run();
        return C76800UCe.LIZ;
    }
}
