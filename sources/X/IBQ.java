package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBQ extends AbstractC65781Prl implements InterfaceC88472Yns<Effect, C44946HkU> {
    public static final IBQ LJLIL = new IBQ();

    public IBQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C44946HkU invoke(Effect effect) {
        Effect it = effect;
        o.LJIIIZ(it, "it");
        if (!DiyPropParser.LJIIIZ(it) || DiyPropParser.LJIIJ(it)) {
            return DiyPropParser.LJI(it);
        }
        return null;
    }
}
