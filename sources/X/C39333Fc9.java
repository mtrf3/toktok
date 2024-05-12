package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Fc9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39333Fc9 {
    public static void LIZ(String log) {
        o.LJIIIZ(log, "log");
        if (C40413FtZ.LJIIJ == null) {
            C40413FtZ.LJIIJ = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSpecActDebugService();
        }
        EOT eot = C40413FtZ.LJIIJ;
        if (eot != null) {
            eot.LIZ("Praise", log);
        }
    }
}
