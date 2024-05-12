package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3OA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OA implements InterfaceC83713Qh {
    public final ActivityC45651qj LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC88472Yns<String, Boolean> LIZLLL;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LJ;

    public C3OA(ActivityC45651qj fragmentActivity, String str, String str2) {
        C3O9 c3o9 = new C3O9(C84283Sm.LIZ);
        C36E c36e = new C36E(C3TV.LIZ);
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        this.LIZ = fragmentActivity;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c3o9;
        this.LJ = c36e;
    }

    @Override // X.InterfaceC83713Qh
    public final void LIZ(C3L4 session, int i, java.util.Map<String, String> map) {
        boolean z;
        C3OB c3ob;
        o.LJIIIZ(session, "session");
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3 || (c3ob = session.LJZL) == null) {
                    return;
                }
                c3ob.LIZ(this.LIZ, session, i, null);
                return;
            }
            if (session.LJZ == null) {
                session.LJZ = new HashMap<>();
            }
            HashMap<String, String> hashMap = session.LJZ;
            o.LJIIIIZZ(hashMap, "session.extraParams");
            hashMap.put("enter_from", this.LIZIZ);
            if (this.LIZJ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                HashMap<String, String> hashMap2 = session.LJZ;
                o.LJIIIIZZ(hashMap2, "session.extraParams");
                hashMap2.put("enter_method", "cell");
            } else {
                HashMap<String, String> hashMap3 = session.LJZ;
                o.LJIIIIZZ(hashMap3, "session.extraParams");
                hashMap3.put("enter_method", this.LIZJ);
            }
            C3OB c3ob2 = session.LJZL;
            if (c3ob2 != null) {
                c3ob2.LIZ(this.LIZ, session, i, map);
            }
            if (session.LJIIIIZZ() == 20) {
                InterfaceC88472Yns<String, Boolean> interfaceC88472Yns = this.LIZLLL;
                String LJFF = session.LJFF();
                o.LJIIIIZZ(LJFF, "session.sessionID");
                if (interfaceC88472Yns.invoke(LJFF).booleanValue()) {
                    return;
                }
            }
            if (session.LJIIIIZZ() == 2) {
                return;
            }
            if (i == 2 && (session instanceof C3L3)) {
                return;
            }
            session.LJLLILLLL = 0;
            return;
        }
        C82223Ko c82223Ko = C99033ud.Companion;
        String LJFF2 = session.LJFF();
        c82223Ko.getClass();
        if (C82223Ko.LIZ(LJFF2)) {
            return;
        }
        if (session.LJZ == null) {
            session.LJZ = new HashMap<>();
        }
        HashMap<String, String> hashMap4 = session.LJZ;
        o.LJIIIIZZ(hashMap4, "session.extraParams");
        hashMap4.put("enter_from", this.LIZIZ);
        C3OB c3ob3 = session.LJZL;
        if (c3ob3 != null) {
            c3ob3.LIZ(this.LIZ, session, i, null);
        }
        this.LJ.invoke(Integer.valueOf(session.LJIIIIZZ()), Integer.valueOf(session.LJLLLLLL));
    }
}
