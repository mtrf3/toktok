package X;

import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Enn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37507Enn {
    public static final java.util.Set<C37403Em7<?, ?>> LIZ = new HashSet();
    public static final C37506Enm LIZIZ;

    static {
        C37473EnF c37473EnF = C37473EnF.LIZ;
        C37533EoD c37533EoD = new C37533EoD();
        C37511Enr c37511Enr = new C37511Enr();
        C37506Enm c37506Enm = new C37506Enm();
        c37506Enm.LIZ = "HybridKit";
        c37506Enm.LJFF = c37473EnF;
        c37506Enm.LIZJ = c37533EoD;
        c37506Enm.LJI = c37511Enr;
        LIZIZ = c37506Enm;
    }

    public static void LIZ(String message) {
        EnumC39866Fkk level = EnumC39866Fkk.I;
        o.LJIIJ(message, "message");
        o.LJIIJ(level, "level");
        C39048FUe.LIZIZ.LIZ(message, level, "PiaCore");
    }
}
