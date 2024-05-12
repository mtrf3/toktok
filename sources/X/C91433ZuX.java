package X;

import Y.IDfS293S0100000_29;
import android.content.Context;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuX, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91433ZuX implements InterfaceC84349X8n {
    @Override // X.InterfaceC84349X8n
    public final void LIZ(X8W trigger) {
        o.LJIIIZ(trigger, "trigger");
        Context LIZIZ = EF7.LIZIZ();
        if (C48207Ivz.LIZIZ == null) {
            C48207Ivz.LIZIZ = C48203Ivv.LIZIZ(LIZIZ);
        }
        boolean z = false;
        if (C48207Ivz.LIZIZ != EnumC48204Ivw.NONE) {
            boolean z2 = C91432ZuW.LJLIL;
            if (ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
                YBM.LIZ.getClass();
                if (YBM.LIZ().getDspClipShowStrategy() != 6) {
                    z = true;
                }
            }
            boolean LIZ = C48207Ivz.LIZ(EF7.LIZIZ());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("triggerAfterInit ");
            LIZ2.append(z2);
            LIZ2.append(' ');
            LIZ2.append(LIZ);
            LIZ2.append(' ');
            LIZ2.append(z);
            X1D.LIZIZ(LIZ2);
            if (!z2) {
                if ((!LIZ && !YBK.LIZ().firstFrameOpt.getEnableMobileApiPreload()) || z) {
                    return;
                }
                if (C91237ZrN.LIZIZ()) {
                    if (!YBK.LIZ().firstFrameOpt.getEnableRepeatPreloadLocalMedia()) {
                        return;
                    }
                    AbstractC73672Svk.LJJIIJZLJL(new CallableC91236ZrM(true)).LJJL(T16.LIZ()).LJJJLIIL(new IDfS293S0100000_29(trigger, 10), C91430ZuU.LJLIL);
                    return;
                }
                C91432ZuW.LIZJ(trigger);
            }
        }
    }
}
