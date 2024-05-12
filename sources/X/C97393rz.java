package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97393rz extends C3L5 {
    public static final C97393rz LLIIIILZ = new C97393rz();

    @Override // X.C3L5, X.C3L4
    public final String LJFF() {
        return "empty_session_id_for_session_list";
    }

    @Override // X.C3L4
    public final int LJIIIIZZ() {
        return 99;
    }

    @Override // X.C3L4
    public final C3OB LIZJ() {
        return new C3OB() { // from class: X.3s0
            @Override // X.C3OB
            public final void LIZ(ActivityC45651qj activity, C3L4 session, int i, java.util.Map<String, String> map) {
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(session, "session");
            }
        };
    }
}
