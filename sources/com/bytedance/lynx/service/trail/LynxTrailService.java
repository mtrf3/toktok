package com.bytedance.lynx.service.trail;

import X.C36904Ee4;
import X.C38686FGg;
import X.InterfaceC39939Flv;
import X.X1D;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LynxTrailService implements InterfaceC39939Flv {
    public static final LynxTrailService INSTANCE = new LynxTrailService();

    @Override // X.InterfaceC39939Flv
    public String stringValueForExperimentKey(String key) {
        Object obj;
        Map map;
        o.LJIIJ(key, "key");
        try {
            C36904Ee4 c36904Ee4 = new C36904Ee4(key, "".getClass());
            obj = C38686FGg.LIZJ(c36904Ee4.LIZIZ, c36904Ee4.LIZJ, c36904Ee4.LIZLLL, c36904Ee4.LIZ, false, true, null);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("experiment may not be initialized,failed to get experimentValue: ");
            LIZ.append(th);
            LLog.LIZLLL(4, "LynxTrailService", X1D.LIZIZ(LIZ));
            obj = null;
        }
        if (obj == null) {
            o.LJIIZILJ();
            throw null;
        }
        if (obj == null || o.LJ(obj, "")) {
            LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
            o.LJFF(LJIIIZ, "LynxEnv.inst()");
            if (LJIIIZ.LJIJJ != null) {
                LynxEnv LJIIIZ2 = LynxEnv.LJIIIZ();
                o.LJFF(LJIIIZ2, "LynxEnv.inst()");
                map = (Map) LJIIIZ2.LJIJJ.get("lynx_common");
            } else {
                map = null;
            }
            if (map != null) {
                obj = map.get(key);
            } else {
                LLog.LIZLLL(4, "LynxTrailService", "failed to get lynx_common");
            }
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Integer) && !(obj instanceof Boolean)) {
            return null;
        }
        return obj.toString();
    }
}
