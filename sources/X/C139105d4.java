package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.5d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139105d4 extends AbstractC65781Prl implements InterfaceC88472Yns<Effect, Boolean> {
    public static final C139105d4 LJLIL = new C139105d4();

    public C139105d4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Effect effect) {
        Effect it = effect;
        o.LJIIIZ(it, "it");
        C48292IxM c48292IxM = C5OL.LIZIZ;
        String effectId = it.getEffectId();
        c48292IxM.getClass();
        o.LJIIIZ(effectId, "effectId");
        C139085d2 c139085d2 = (C139085d2) c48292IxM.LIZ;
        c139085d2.getClass();
        return Boolean.valueOf(ORY.LJJIJIIJIL(effectId, c139085d2.LIZ(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID())));
    }
}
