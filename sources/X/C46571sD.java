package X;

import android.os.CountDownTimer;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameSessionChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.1sD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46571sD extends AbstractC65781Prl implements InterfaceC88472Yns<C76800UCe, C76800UCe> {
    public static final C46571sD LJLIL = new C46571sD();

    public C46571sD() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0GC] */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C76800UCe it) {
        C0GC c0gc;
        o.LJIIIZ(it, "it");
        if (C0GB.LJ != null) {
            if (C0GB.LIZJ == null) {
                C0GB.LIZJ = new CountDownTimer(((Number) C0GB.LIZIZ.getValue()).longValue()) { // from class: X.0GC
                    @Override // android.os.CountDownTimer
                    public final void onTick(long j) {
                    }

                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        C0GA.LIZLLL(C0GB.LJ, false);
                        DataChannel dataChannel = C0GB.LJ;
                        if (dataChannel != null) {
                            dataChannel.pv0(DrawGuessExitGameEvent.class);
                        }
                        DataChannel dataChannel2 = C0GB.LJ;
                        if (dataChannel2 != null) {
                            dataChannel2.rv0(DrawGuessInGameSessionChannel.class, Boolean.FALSE);
                        }
                    }
                };
            }
            if (C0GB.LIZLLL && (c0gc = C0GB.LIZJ) != null) {
                c0gc.cancel();
            }
            C0GC c0gc2 = C0GB.LIZJ;
            if (c0gc2 != null) {
                c0gc2.start();
            }
            C0GB.LIZLLL = true;
        }
        return C76800UCe.LIZ;
    }
}
