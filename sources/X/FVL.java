package X;

import android.content.Context;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FVL<T> implements InterfaceC64592gB {
    public static final FVL<T> LJLIL = new FVL<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C2323199v it = (C2323199v) obj;
        o.LJIIIIZZ(it, "it");
        int i = FVO.LIZ[it.LIZ.ordinal()];
        final String str = "launch";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                final String str2 = "terminate";
                C73040SlY.LJII(EF7.LIZIZ(), "monitor", "terminate");
                final String str3 = it.LIZJ;
                if (!FVJ.LIZ()) {
                    final Context LIZIZ = EF7.LIZIZ();
                    C10K.LIZJ(new Callable() { // from class: X.FVK
                        public final /* synthetic */ String LJLIL = "monitor";

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String str4 = this.LJLIL;
                            String str5 = str2;
                            String str6 = str3;
                            Context context = LIZIZ;
                            JSONObject LJ = C47135Ieh.LJ("event", str4, "label", str5);
                            LJ.put("session_id", str6);
                            LJ.put(WM7.SCENE_SERVICE, "low_retain");
                            LJ.put("local_time", System.currentTimeMillis() / 1000);
                            AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(context, "app_perf", LJ);
                            return null;
                        }
                    });
                }
                FVQ.LIZ = false;
                CommonFeedLaunchServiceImpl.LJ().LIZLLL();
                return;
            }
            final String str4 = it.LIZJ;
            if (!FVJ.LIZ()) {
                final Context LIZIZ2 = EF7.LIZIZ();
                C10K.LIZJ(new Callable() { // from class: X.FVK
                    public final /* synthetic */ String LJLIL = "monitor";

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str42 = this.LJLIL;
                        String str5 = str;
                        String str6 = str4;
                        Context context = LIZIZ2;
                        JSONObject LJ = C47135Ieh.LJ("event", str42, "label", str5);
                        LJ.put("session_id", str6);
                        LJ.put(WM7.SCENE_SERVICE, "low_retain");
                        LJ.put("local_time", System.currentTimeMillis() / 1000);
                        AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(context, "app_perf", LJ);
                        return null;
                    }
                });
            }
            MultiAccountService.LJ().LIZIZ();
            return;
        }
        if (FVQ.LIZ) {
            return;
        }
        FVQ.LIZ = true;
        C73040SlY.LJII(EF7.LIZIZ(), "monitor", "launch");
    }
}
