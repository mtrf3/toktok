package X;

import defpackage.a1;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FGv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38701FGv {
    public static final /* synthetic */ InterfaceC74236TBo[] LJ;
    public static final ConcurrentHashMap<String, C38701FGv> LJFF;
    public static final C5H3 LJI;
    public static final C38702FGw LJII;
    public volatile String LIZ;
    public volatile EAB LIZIZ;
    public final C62822Ol8 LIZJ;
    public final String LIZLLL;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C38701FGv.class), "extraDidExposureHandler", "getExtraDidExposureHandler()Lcom/bytedance/ies/abmock/datacenter/precise/ExposureHandler;");
        C65352Pkq.LIZ.getClass();
        LJ = new InterfaceC74236TBo[]{tbt};
        LJII = new C38702FGw();
        LJFF = new ConcurrentHashMap<>();
        LJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, FH2.LJLIL);
    }

    public final EAB LIZIZ() {
        FH1.LJI.getClass();
        String LJFF2 = FH1.LJFF();
        if (!o.LJ(this.LIZ, LJFF2)) {
            this.LIZ = LJFF2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('{');
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("__extra_for_");
            LIZ2.append(this.LIZLLL);
            LIZ.append(X1D.LIZIZ(LIZ2));
            LIZ.append("}_{");
            this.LIZIZ = new EAB(new C38683FGd(q.LIZIZ(LIZ, this.LIZ, '}', LIZ)));
        }
        return this.LIZIZ;
    }

    public C38701FGv(String str) {
        this.LIZLLL = str;
        ConcurrentHashMap<String, C38701FGv> concurrentHashMap = LJFF;
        if (!concurrentHashMap.contains(str)) {
            concurrentHashMap.put(str, this);
            this.LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 152));
            return;
        }
        throw new IllegalArgumentException(a1.LJ("key ", str, " has been used"));
    }

    public static List LIZJ(String str) {
        ArrayList arrayList = null;
        if (str != null && str.length() > 0) {
            List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
            arrayList = new ArrayList();
            for (Object obj : LJLJJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final void LIZ(String str, boolean z) {
        List<String> LIZJ = LIZJ(str);
        if (LIZJ != null) {
            if (z) {
                EAB LIZIZ = LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.LIZ(LIZJ);
                }
            } else {
                ((EAB) this.LIZJ.getValue()).LIZ(LIZJ);
            }
            FH1.LJI.getClass();
            FH1.LIZLLL();
        }
    }
}
