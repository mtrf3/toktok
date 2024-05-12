package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OG8 extends AbstractC65781Prl implements InterfaceC88471Ynr<Effect, String, Integer> {
    public static final OG8 LJLIL = new OG8();

    public OG8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Integer invoke(Effect effect, String enterMethod) {
        int i;
        o.LJIIIZ(enterMethod, "enterMethod");
        if (o.LJ(enterMethod, "auto_open") || o.LJ(enterMethod, "recover")) {
            i = 2;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
