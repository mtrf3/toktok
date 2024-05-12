package X;

import com.ss.android.elearning.lingo.log.ElLogDefault;
import com.ss.android.elearning.lingo.log.ElLogService;
import com.ss.android.elearning.lingo.log.LogLevel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NJO implements ElLogService {
    public static final NJO LIZIZ = new NJO();
    public final /* synthetic */ ElLogService LIZ;

    @Override // com.ss.android.elearning.lingo.log.ElLogService
    public final void LIZ(LogLevel level, String str, String msg) {
        o.LJIIIZ(level, "level");
        o.LJIIIZ(msg, "msg");
        this.LIZ.LIZ(level, str, msg);
    }

    public NJO() {
        ElLogService elLogService;
        Object LIZ = C58096Mr6.LIZ(ElLogService.class, false);
        if (LIZ != null) {
            elLogService = (ElLogService) LIZ;
        } else {
            if (C58096Mr6.LJJJJ == null) {
                synchronized (ElLogService.class) {
                    if (C58096Mr6.LJJJJ == null) {
                        C58096Mr6.LJJJJ = new ElLogDefault();
                    }
                }
            }
            elLogService = C58096Mr6.LJJJJ;
        }
        this.LIZ = elLogService;
    }

    public final void LIZIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        LIZ(LogLevel.DEBUG, str, msg);
    }
}
