package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3PK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PK {
    public static final C3PK LJI = new C3PK(0);
    public final C98453th LIZ;
    public final java.util.Map<String, C3PI> LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;
    public final InterfaceC65784Pro<Boolean> LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final InterfaceC88472Yns<String, C3PI> LJFF;

    public C3PK(int i) {
        C98453th c98453th = new C98453th("update_supervisor", "search", 4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3PN selfUid = C3PN.LJLIL;
        C3PM isInMainProcess = C3PM.LJLIL;
        C33S c33s = new C33S(C53330KwQ.LIZ);
        C3PL createCombinedSearchContentEngine = C3PL.LJLIL;
        o.LJIIIZ(selfUid, "selfUid");
        o.LJIIIZ(isInMainProcess, "isInMainProcess");
        o.LJIIIZ(createCombinedSearchContentEngine, "createCombinedSearchContentEngine");
        this.LIZ = c98453th;
        this.LIZIZ = linkedHashMap;
        this.LIZJ = selfUid;
        this.LIZLLL = isInMainProcess;
        this.LJ = c33s;
        this.LJFF = createCombinedSearchContentEngine;
    }
}
