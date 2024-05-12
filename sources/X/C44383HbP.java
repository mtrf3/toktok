package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.o;

/* renamed from: X.HbP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44383HbP extends AbstractC65781Prl implements InterfaceC88472Yns<Effect, Boolean> {
    public static final C44383HbP LJLIL = new C44383HbP();

    public C44383HbP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Effect effect) {
        Effect it = effect;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(DiyPropParser.LIZ(it));
    }
}
