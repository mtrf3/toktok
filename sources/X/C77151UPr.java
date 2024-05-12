package X;

import Y.IDhS72S0200000_13;
import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UPr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77151UPr {
    public boolean LIZ = true;
    public boolean LIZIZ;

    public static boolean LIZJ(java.util.Map map) {
        if (o.LJ(map.get(EnumC77154UPu.CHECK_UID_PERMISSION), Boolean.FALSE) && o.LJ(map.get(EnumC77154UPu.CHECK_ACTUAL_PERMISSION), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(java.util.Map map) {
        Object obj = map.get(EnumC77154UPu.CHECK_UID_PERMISSION);
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool) && o.LJ(map.get(EnumC77154UPu.CHECK_ACTUAL_PERMISSION), bool)) {
            return true;
        }
        return false;
    }

    public final AbstractC73672Svk<C77157UPx> LJI(UPC upc) {
        if (this.LIZ) {
            AbstractC73672Svk<C77157UPx> LJJIZ = AbstractC73672Svk.LJJIZ(upc.LJIIJ().LJJJ(C73969T1h.LIZIZ()).LJJIII(C77153UPt.LJLIL, false), AbstractC73672Svk.LJJIJIL(new C77157UPx(EnumC77154UPu.AUTHORIZED, new C77150UPq(true, 0, 0, null, 30))));
            o.LJFF(LJJIZ, "Observable.merge(\n      …          )\n            )");
            return LJJIZ;
        }
        return AbstractC73672Svk.LJJIJIL(new C77157UPx(EnumC77154UPu.AUTHORIZED, new C77150UPq(true, 0, 0, null, 30)));
    }

    public static C73565Su1 LIZ(EnumC77154UPu enumC77154UPu, C77150UPq c77150UPq) {
        return AbstractC73672Svk.LJJIJIL(new C77157UPx(enumC77154UPu, c77150UPq));
    }

    public static java.util.Map LIZIZ(boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            if (z2) {
                EnumC77154UPu enumC77154UPu = EnumC77154UPu.CHECK_UID_PERMISSION;
                Boolean bool = Boolean.TRUE;
                linkedHashMap.put(enumC77154UPu, bool);
                linkedHashMap.put(EnumC77154UPu.CHECK_ACTUAL_PERMISSION, bool);
            } else {
                linkedHashMap.put(EnumC77154UPu.CHECK_UID_PERMISSION, Boolean.TRUE);
                linkedHashMap.put(EnumC77154UPu.CHECK_ACTUAL_PERMISSION, Boolean.FALSE);
            }
        } else if (z2) {
            linkedHashMap.put(EnumC77154UPu.CHECK_UID_PERMISSION, Boolean.FALSE);
            linkedHashMap.put(EnumC77154UPu.CHECK_ACTUAL_PERMISSION, Boolean.TRUE);
        } else {
            EnumC77154UPu enumC77154UPu2 = EnumC77154UPu.CHECK_UID_PERMISSION;
            Boolean bool2 = Boolean.FALSE;
            linkedHashMap.put(enumC77154UPu2, bool2);
            linkedHashMap.put(EnumC77154UPu.CHECK_ACTUAL_PERMISSION, bool2);
        }
        return linkedHashMap;
    }

    public static AbstractC73672Svk LJFF(UPC upc, C77150UPq c77150UPq) {
        AbstractC73672Svk<R> LJJIII = upc.LJIIIZ(c77150UPq.LJLILLLLZI, c77150UPq.LJLIL).LJJIII(C77152UPs.LJLIL, false);
        o.LJFF(LJJIII, "ufr.syncStatus(status.st…sult = it))\n            }");
        return LJJIII;
    }

    public final AbstractC73672Svk LJ(Context context, Class clazz, String uid, String enterFrom, String enterMethod, boolean z, boolean z2, java.util.Map map) {
        o.LJIIJ(context, "context");
        o.LJIIJ(clazz, "clazz");
        o.LJIIJ(uid, "uid");
        o.LJIIJ(enterFrom, "enterFrom");
        o.LJIIJ(enterMethod, "enterMethod");
        this.LIZ = z2;
        UPC upc = (UPC) clazz.newInstance();
        upc.LJI(context, uid, enterFrom, enterMethod, z, z2, map);
        this.LIZIZ = z;
        AbstractC73672Svk<R> LJJIII = AbstractC73672Svk.LJJLL(upc.LIZIZ(), upc.LIZ(), new C77149UPp(this)).LJJJ(C73969T1h.LIZIZ()).LJJIII(new IDhS72S0200000_13(this, upc, 11), false);
        o.LJFF(LJJIII, "Observable.zip(\n        …          }\n            }");
        return LJJIII;
    }
}
