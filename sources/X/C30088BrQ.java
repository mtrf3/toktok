package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.util.GlobalContext;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BrQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30088BrQ extends AbstractC65781Prl implements InterfaceC88472Yns<C29688Bky, C76800UCe> {
    public static final C30088BrQ LJLIL = new C30088BrQ();

    public C30088BrQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C29688Bky c29688Bky) {
        C29688Bky it = c29688Bky;
        o.LJIIIZ(it, "it");
        if (!C29689Bkz.LJIIL) {
            int i = C29689Bkz.LJIILL;
            if ((i == 1 || i == 2) && Build.VERSION.SDK_INT >= 30) {
                Context applicationContext = GlobalContext.getApplicationContext();
                try {
                    Object LLILL = C16880lQ.LLILL(GlobalContext.getApplicationContext(), "activity");
                    o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) LLILL).getHistoricalProcessExitReasons(applicationContext.getPackageName(), 0, 1);
                    o.LJIIIIZZ(historicalProcessExitReasons, "am.getHistoricalProcessE…ontext.packageName, 0, 1)");
                    ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) ORZ.LJLLLL(historicalProcessExitReasons);
                    if (applicationExitInfo != null) {
                        it.LIZJ.put("app_exit_reason", String.valueOf(applicationExitInfo.getReason()));
                        ConcurrentHashMap<String, String> concurrentHashMap = it.LIZJ;
                        String description = applicationExitInfo.getDescription();
                        if (description == null) {
                            description = "";
                        }
                        concurrentHashMap.put("app_kill_reason", description);
                        it.LIZJ.put("app_exit_timestamp", String.valueOf(applicationExitInfo.getTimestamp()));
                        it.LIZJ.put("app_exit_process_importance", String.valueOf(applicationExitInfo.getImportance()));
                    }
                } catch (Throwable unused) {
                }
            }
            it.LIZJ("system_exit_enter_room", "");
            C29688Bky.LJFF().LJIILIIL("system_enter_prepare_pushing");
            C29689Bkz.LJIIL = true;
        }
        return C76800UCe.LIZ;
    }
}
