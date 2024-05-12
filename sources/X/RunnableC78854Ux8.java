package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;

/* renamed from: X.Ux8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC78854Ux8 implements Runnable {
    public final /* synthetic */ C79067V1j LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public RunnableC78854Ux8(C79067V1j c79067V1j, long j, boolean z) {
        this.LJLIL = c79067V1j;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
    }

    public final void LIZ() {
        long j;
        XN6 LJFF;
        XN9<?, ?>[] xn9Arr;
        String effectId;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect call back is posted to Main Thread, try to send messages to EE, ");
        LIZ.append(this.LJLIL.LJLILLLLZI);
        H78.LIZIZ("MET-JADEN", X1D.LIZIZ(LIZ));
        Effect effect = this.LJLIL.LJLILLLLZI;
        if (effect != null && (effectId = effect.getEffectId()) != null) {
            j = CastLongProtector.parseLong(effectId);
        } else {
            j = 0;
        }
        if (j != this.LJLILLLLZI || !this.LJLJI || (LJFF = DiyPropParser.LJFF(this.LJLIL.LJLILLLLZI)) == null || (xn9Arr = LJFF.LIZLLL) == null) {
            return;
        }
        for (XN9<?, ?> xn9 : xn9Arr) {
            xn9.LIZIZ();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
