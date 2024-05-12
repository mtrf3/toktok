package X;

import android.content.Context;
import com.bytedance.common.jato.JatoXLConfig;
import java.util.concurrent.ExecutorService;

/* renamed from: X.EFu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36126EFu {
    public final JatoXLConfig LIZ = new JatoXLConfig();

    public final JatoXLConfig LIZ() {
        JatoXLConfig jatoXLConfig = this.LIZ;
        if (jatoXLConfig.mExecuteService == null || jatoXLConfig.mContext == null) {
            return null;
        }
        return jatoXLConfig;
    }

    public final void LIZIZ(Context context) {
        this.LIZ.mContext = context;
    }

    public final void LIZJ(ExecutorService executorService) {
        this.LIZ.mExecuteService = executorService;
    }

    public final void LIZLLL(boolean z) {
        this.LIZ.isEnabledCpuSetFeature = z;
    }

    public final void LJ(int i) {
        this.LIZ.mPriority = i;
    }

    public final void LJFF(int i) {
        this.LIZ.mLogCutType = i;
    }

    public final void LJI(int i) {
        if (i >= 0) {
            this.LIZ.mMaxGcBlockTime = i;
        }
    }

    public final void LJII(boolean z) {
        this.LIZ.mUseJitBlock = z;
    }

    public final void LJIIIIZZ(boolean z) {
        this.LIZ.mIsAddref = z;
    }

    public final void LJIIIZ(boolean z) {
        this.LIZ.mUseLogCut = z;
    }
}
