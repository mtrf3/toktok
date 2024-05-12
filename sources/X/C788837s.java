package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.37s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C788837s implements C38Z {
    public final C72582t4 LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final Object LIZIZ() {
        ?? LJJIJ;
        try {
            List<C789037u> LJ = this.LIZ.LIZLLL.LJIJI().LJ();
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
            for (C789037u c789037u : LJ) {
                List<C789537z> list = c789037u.LIZIZ;
                if (list != null) {
                    LJJIJ = new ArrayList(C32I.LJJL(list, 10));
                    for (C789537z c789537z : list) {
                        C789337x c789337x = c789037u.LIZ;
                        LJJIJ.add(new C787637g(c789337x.LIZ, c789337x, c789537z, c789037u.LIZJ));
                    }
                } else {
                    C789337x c789337x2 = c789037u.LIZ;
                    LJJIJ = C47261Igj.LJJIJ(new C787637g(c789337x2.LIZ, c789337x2, null, c789037u.LIZJ));
                }
                arrayList.add(LJJIJ);
            }
            return C32I.LJJLI(arrayList);
        } catch (Throwable unused) {
            return C61878OQg.INSTANCE;
        }
    }

    public C788837s(C72582t4 context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.InterfaceC789738b
    public final /* bridge */ /* synthetic */ Object LIZ(Object obj, C3CS c3cs) {
        return LIZIZ();
    }
}
