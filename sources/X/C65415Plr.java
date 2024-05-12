package X;

import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.SelfDataManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.o;
import java.util.HashMap;

/* renamed from: X.Plr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65415Plr {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile int LIZLLL;
    public static InterfaceC65419Plv LJ = new C77123UOp();

    public static boolean LIZIZ() {
        if (!LIZJ) {
            return false;
        }
        if (LIZLLL == 0) {
            LIZ = KevaImpl.getRepo("safe_protector_config_repo", 1).getBoolean("safe_protector_enable_key", LIZ);
            LIZLLL = 1;
            if (!LIZIZ) {
                String string = KevaImpl.getRepo("safe_protector_config_repo", 1).getString("safe_protector_config_key", "[]");
                C16880lQ.LLLZ("loadConfImmediately lastConfig %s", new Object[]{string});
                LJ.LJII();
                LIZJ(GsonProtectorUtils.parse(new o(), string).LJIILLIIL());
            }
            C16880lQ.LLLZ("IMMEDIATELY_INIT lastEnable: %b", new Object[]{Boolean.valueOf(LIZ)});
            LJ.LJII();
        }
        return LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.google.gson.g r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65415Plr.LIZJ(com.google.gson.g):void");
    }

    public static PTF LIZ(EnumC65856Psy enumC65856Psy, Throwable th) {
        InterfaceC65419Plv interfaceC65419Plv = LJ;
        if (interfaceC65419Plv != null) {
            try {
                PTF LIZ2 = PTE.LIZIZ.LIZ(enumC65856Psy, th);
                if (LIZ2 != null) {
                    interfaceC65419Plv.LIZIZ(th);
                    return LIZ2;
                }
            } catch (Throwable th2) {
                HashMap hashMap = new HashMap();
                hashMap.put("Protector/SelfData", SelfDataManager.LJ.LIZJ(th2).toString());
                LJ.LIZ(th2, hashMap);
            }
            interfaceC65419Plv.LJFF(th);
        }
        return null;
    }
}
