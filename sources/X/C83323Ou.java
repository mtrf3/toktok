package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83323Ou extends AbstractC65781Prl implements InterfaceC65784Pro<C83303Os> {
    public static final C83323Ou LJLIL = new C83323Ou();

    public C83323Ou() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Os] */
    @Override // X.InterfaceC65784Pro
    public final C83303Os invoke() {
        return new C3OZ() { // from class: X.3Os
            @Override // X.C3OZ, X.C2TS
            public final void LIZ(ActivityC45651qj activityC45651qj, String sessionID, java.util.Map<String, String> map) {
                o.LJIIIZ(sessionID, "sessionID");
                C3L4 LIZJ = C771431a.LIZ().LIZJ(sessionID);
                if (LIZJ == null) {
                    return;
                }
                C96963rI.LIZJ().getClass();
                C84503Ti.LIZIZ(activityC45651qj, LIZJ);
            }

            @Override // X.C3OZ, X.C2TS
            public final void LIZIZ(ActivityC45651qj activityC45651qj, String sessionID, java.util.Map<String, String> map) {
                o.LJIIIZ(sessionID, "sessionID");
                LIZ(activityC45651qj, sessionID, map);
            }
        };
    }
}
