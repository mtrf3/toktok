package X;

import android.os.Handler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.o;

/* renamed from: X.V1j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79067V1j extends ESP {
    public Effect LJLILLLLZI;
    public final Handler LJLJI = new Handler(C16880lQ.LLJJJJ());

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLILLLLZI = null;
        DiyPropParser.LIZ = null;
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        XN6 LJFF = DiyPropParser.LJFF(session.LIZ);
        boolean z = false;
        if (LJFF == null) {
            return false;
        }
        XN9<?, ?>[] xn9Arr = LJFF.LIZLLL;
        if (xn9Arr == null || xn9Arr.length == 0) {
            z = true;
        }
        return !z;
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        Effect effect;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        Effect effect2 = session.LIZ;
        if (effect2 == null || (effect = this.LJLILLLLZI) == null || !o.LJ(effect.getEffectId(), effect2.getEffectId())) {
            LJIIJJI();
        }
        this.LJLILLLLZI = effect2;
    }
}
