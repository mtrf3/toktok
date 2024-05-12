package X;

import android.os.SystemClock;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Locale;

/* renamed from: X.IlX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47559IlX implements InterfaceC47564Ilc {
    public static final C47559IlX LIZ = new C47559IlX();

    @Override // X.InterfaceC47564Ilc
    public final void LIZ(int i, long j, long j2) {
        ISpeedPredictor iSpeedPredictor = C78966Uyw.LJLJLLL;
        if (i == 2 && iSpeedPredictor != null) {
            iSpeedPredictor.update(j, j2, SystemClock.elapsedRealtime());
            if (j2 != 0) {
                TTVideoEngineLog.d("TTVideoEngine", C16880lQ.LLLZI(Locale.US, "[IESSpeedPredictor]: speedRecord:%f", new Object[]{Double.valueOf(j / j2)}));
            }
        }
    }
}
