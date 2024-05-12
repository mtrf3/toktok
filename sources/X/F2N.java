package X;

import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class F2N {
    public static void LIZ() {
        HashMap<Class<?>, HashMap<String, Class<?>>> LJII;
        F0V f0v = new F0V();
        LIZIZ();
        IBulletHostProxy iBulletHostProxy = F2O.LIZIZ;
        if (iBulletHostProxy != null && (LJII = iBulletHostProxy.LJII()) != null) {
            f0v.LJJIIZ(LJII);
        }
        C37905EuD.LJIIIIZZ = f0v;
        Boolean bool = Boolean.TRUE;
        if (bool != null) {
            C37936Eui.LJII.put("jsb_tt_bridge_factory_manager_init", bool);
        }
        if (C19N.LJ("jsb_spark_init_optimize", false)) {
            C86290Xtm.LIZ();
            F2E.LIZ();
            C37936Eui.LJII.put("jsb_tt_init_optimize_settings_1", "true");
        }
        C37936Eui.LJII.put("jsb_tt_init_bridgeFactoryManager_finish", "true");
    }

    public static void LIZIZ() {
        Object LIZ;
        if (F2O.LIZIZ != null) {
            return;
        }
        try {
            F2O.LIZIZ = BulletHostProxy.LIZ();
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        IBulletHostProxy iBulletHostProxy = F2O.LIZIZ;
        if (iBulletHostProxy != null) {
            C37936Eui.LJII.put("jsb_tt_init_bullet_host_proxy", iBulletHostProxy);
        }
        String m14toStringimpl = C3C5.m14toStringimpl(LIZ);
        if (m14toStringimpl != null) {
            C37936Eui.LJII.put("jsb_tt_init_bullet_host_proxy_result", m14toStringimpl);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            System.out.println((Object) ("registerIBridges fail with " + ((Object) C3C5.m14toStringimpl(LIZ))));
        }
    }
}
