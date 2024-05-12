package X;

import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import ujb.o;

/* loaded from: classes7.dex */
public final class EIN implements QJ8 {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);

    @Override // X.QJ8
    public final void LIZ(boolean z) {
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
    }

    @Override // X.QJ8
    public final void LIZIZ(String str, String str2) {
        if (str == null || o.LJJJJJL(str) || !this.LJLIL.compareAndSet(false, true)) {
            return;
        }
        try {
            ISettingManagerService LIZJ = SettingManagerServiceImpl.LIZJ();
            EF7.LIZIZ();
            LIZJ.LIZ(0);
        } catch (Throwable unused) {
        }
    }
}
