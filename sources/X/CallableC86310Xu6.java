package X;

import com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import java.util.concurrent.Callable;

/* renamed from: X.Xu6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class CallableC86310Xu6<V> implements Callable {
    public static final CallableC86310Xu6<V> LJLIL = new CallableC86310Xu6<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        UserNightScreenTimeSettings LIZIZ = C86308Xu4.LIZIZ();
        DoNotDisturbSettings LIZLLL = C86308Xu4.LIZLLL();
        DoNotDisturbSettings LIZ = C86308Xu4.LIZ();
        int i = C86308Xu4.LIZ.getInt(C86308Xu4.LJ("screen_time_management_repeat_type"), 0);
        C86306Xu2.LIZLLL = new DigitalWellbeingBean(null, 0, null, null, null, null, null, null, null, LIZIZ, LIZ, LIZLLL, Integer.valueOf(i), C86308Xu4.LIZJ(), 511, null);
        return C76800UCe.LIZ;
    }
}
