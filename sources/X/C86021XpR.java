package X;

import java.util.ArrayList;

/* renamed from: X.XpR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86021XpR {
    public static C86022XpS LIZ;

    static {
        C86023XpT c86023XpT = new C86023XpT();
        ((ArrayList) c86023XpT.LIZ).add(new C86024XpU());
        LIZ = new C86022XpS(c86023XpT);
    }

    public static C86031Xpb LIZ(Q9D q9d) {
        C86022XpS c86022XpS = LIZ;
        c86022XpS.getClass();
        C86025XpV c86025XpV = new C86025XpV(c86022XpS, q9d);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c86022XpS.LIZ);
        arrayList.add(new C86029XpZ());
        return new C86027XpX(0, arrayList, q9d, c86025XpV).LIZ(q9d);
    }
}
