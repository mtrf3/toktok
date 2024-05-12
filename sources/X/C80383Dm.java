package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80383Dm {
    public static C3EO LIZ(final C60692Zt taskInfo) {
        o.LJIIIZ(taskInfo, "taskInfo");
        int i = taskInfo.LIZJ;
        if (i <= 10 && i >= 1) {
            if (10 == i) {
                return new C3EO() { // from class: X.3Ds
                    @Override // X.C3EO
                    public final InterfaceC115714gR<Object> LIZ(AbstractC73672Svk<Object> upstream) {
                        o.LJIIIZ(upstream, "upstream");
                        return upstream.LJJL(T16.LJ).LJJJ(C73969T1h.LIZIZ());
                    }
                };
            }
            return new C3EO() { // from class: X.3Dt
                @Override // X.C3EO
                public final InterfaceC115714gR<Object> LIZ(AbstractC73672Svk<Object> upstream) {
                    o.LJIIIZ(upstream, "upstream");
                    T1N t1n = C80463Du.LIZ;
                    C60692Zt taskInfo2 = C60692Zt.this;
                    t1n.getClass();
                    o.LJIIIZ(taskInfo2, "taskInfo");
                    return upstream.LJJL(new T1M(t1n, taskInfo2)).LJJJ(C73969T1h.LIZIZ());
                }
            };
        }
        "Priority should be between RxTaskInfo.PRIORITY_BACKGROUND and RxTaskInfo.PRIORITY_IMMEDIATE!".toString();
        throw new IllegalArgumentException("Priority should be between RxTaskInfo.PRIORITY_BACKGROUND and RxTaskInfo.PRIORITY_IMMEDIATE!");
    }
}
