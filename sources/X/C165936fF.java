package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.ve.handlers.DownloadEffectHandler$handleData$2$isSuccess$1", f = "DownloadEffectHandler.kt", l = {29}, m = "invokeSuspend")
/* renamed from: X.6fF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165936fF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166026fO>, Object> {
    public int LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165936fF(Effect effect, InterfaceC67352kd<? super C165936fF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165936fF(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final Effect effect = this.LJLILLLLZI;
            this.LJLIL = 1;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C166696gT.LIZ().getClass();
            if (C169416kr.LIZ(effect)) {
                C166026fO c166026fO = new C166026fO();
                c166026fO.LIZIZ = effect;
                c166026fO.LIZ = true;
                C3C5.m7constructorimpl(c166026fO);
                c84654XKg.resumeWith(c166026fO);
            } else {
                C169416kr LIZ = C166696gT.LIZ();
                InterfaceC166016fN interfaceC166016fN = new InterfaceC166016fN() { // from class: X.6fG
                    @Override // X.InterfaceC166016fN
                    public final void onSuccess(Effect effect2) {
                        String str;
                        if (effect2 != null) {
                            str = effect2.getEffectId();
                        } else {
                            str = null;
                        }
                        if (o.LJ(str, Effect.this.getEffectId())) {
                            InterfaceC67352kd<C166026fO> interfaceC67352kd = c84654XKg;
                            C166026fO c166026fO2 = new C166026fO();
                            c166026fO2.LIZIZ = effect2;
                            c166026fO2.LIZ = true;
                            C3C5.m7constructorimpl(c166026fO2);
                            interfaceC67352kd.resumeWith(c166026fO2);
                        }
                    }

                    @Override // X.InterfaceC166016fN
                    public final void onFail(Effect effect2, ExceptionResult e) {
                        String str;
                        o.LJIIIZ(e, "e");
                        if (effect2 != null) {
                            str = effect2.getEffectId();
                        } else {
                            str = null;
                        }
                        if (o.LJ(str, Effect.this.getEffectId())) {
                            InterfaceC67352kd<C166026fO> interfaceC67352kd = c84654XKg;
                            C166026fO c166026fO2 = new C166026fO();
                            c166026fO2.LIZIZ = effect2;
                            c166026fO2.LIZ = false;
                            C3C5.m7constructorimpl(c166026fO2);
                            interfaceC67352kd.resumeWith(c166026fO2);
                        }
                    }
                };
                LIZ.getClass();
                o.LJIIIZ(effect, "effect");
                InterfaceC84498XEg LIZIZ = C166696gT.LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.fetchEffect(effect, new C44364Hb6(new C44366Hb8("effect", new C166006fM(interfaceC166016fN), false, null)));
                }
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166026fO> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
