package X;

import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdk.model.message.QuestionSwitchMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Bex, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29315Bex implements CRX {
    @Override // X.CRX
    public final void LIZIZ(C0HK registry, CQQ publicScreenContext) {
        o.LJIIIZ(registry, "registry");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
    }

    @Override // X.CRX
    public final void LIZLLL(CUN cun) {
    }

    @Override // X.CRX
    public final void LIZ(CBL registry) {
        o.LJIIIZ(registry, "registry");
        registry.LIZLLL(QuestionMessage.class, new BWK());
        registry.LIZLLL(QuestionSwitchMessage.class, new BWJ());
    }

    @Override // X.CRX
    public final void LIZJ(CT7 ct7) {
        if (ct7.LJIILIIL()) {
            ct7.LLD(BWH.class, new C29312Beu(1));
        } else {
            ct7.LLD(BWH.class, new C29314Bew());
        }
    }

    @Override // X.CRX
    public final void LJ(InterfaceC31378CTe registry) {
        o.LJIIIZ(registry, "registry");
    }

    @Override // X.CRX
    public final void LJFF(CS7 registry) {
        o.LJIIIZ(registry, "registry");
    }

    @Override // X.CRX
    public final void LJI(InterfaceC29574Bj8 registry) {
        o.LJIIIZ(registry, "registry");
        C31319CQx c31319CQx = (C31319CQx) registry;
        c31319CQx.LJLIIIL(EnumC31509CYf.QUESTION.getIntType());
        c31319CQx.LJLIIIL(EnumC31509CYf.QUESTION_SWITCH_MESSAGE.getIntType());
    }

    @Override // X.CRX
    public final void LJII(C29821Fa registry) {
        o.LJIIIZ(registry, "registry");
        registry.LIZIZ(QuestionMessage.class, new BYL());
    }
}
