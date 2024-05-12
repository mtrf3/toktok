package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.core.ChangeAvatarCreateInfoStickerUtils$fetchAvatarInfoSticker$2$1$onSuccess$1$1$1$1", f = "ChangeAvatarCreateInfoStickerUtils.kt", l = {45}, m = "invokeSuspend")
/* renamed from: X.5ZF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends C121514pn, ? extends Effect>>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectCategoryResponse LJLILLLLZI;
    public final /* synthetic */ Effect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5ZF(EffectCategoryResponse effectCategoryResponse, Effect effect, InterfaceC67352kd<? super C5ZF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectCategoryResponse;
        this.LJLJI = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5ZF(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            final String key = this.LJLILLLLZI.getKey();
            final Effect effect = this.LJLJI;
            this.LJLIL = 1;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            TN4.LIZ().LJJIIZI(effect, new IFetchEffectListener() { // from class: X.5ZD
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect2) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect2) {
                    if (effect2 != null) {
                        C121514pn c121514pn = new C121514pn(0);
                        c121514pn.LJIIJJI = Effect.this.getUnzipPath();
                        c121514pn.LJIILJJIL = Effect.this.getEffectId();
                        if (o.LJ(key, "left")) {
                            OSZ<Float, Float> osz = C5ZG.LIZ;
                            c121514pn.LJ = osz.getFirst().floatValue();
                            c121514pn.LJFF = osz.getSecond().floatValue();
                        } else {
                            OSZ<Float, Float> osz2 = C5ZG.LIZIZ;
                            c121514pn.LJ = osz2.getFirst().floatValue();
                            c121514pn.LJFF = osz2.getSecond().floatValue();
                        }
                        c121514pn.LIZLLL = C149525ts.LIZ().maxDuration;
                        InterfaceC67352kd<OSZ<C121514pn, ? extends Effect>> interfaceC67352kd = c84654XKg;
                        OSZ osz3 = new OSZ(c121514pn, effect2);
                        C3C5.m7constructorimpl(osz3);
                        interfaceC67352kd.resumeWith(osz3);
                        return;
                    }
                    InterfaceC67352kd<OSZ<C121514pn, ? extends Effect>> interfaceC67352kd2 = c84654XKg;
                    C3C5.m7constructorimpl(null);
                    interfaceC67352kd2.resumeWith(null);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect2, ExceptionResult e) {
                    String str;
                    o.LJIIIZ(e, "e");
                    InterfaceC67352kd<OSZ<C121514pn, ? extends Effect>> interfaceC67352kd = c84654XKg;
                    C76800UCe c76800UCe = null;
                    C3C5.m7constructorimpl(null);
                    interfaceC67352kd.resumeWith(null);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("downloadEffect effect:");
                    if (effect2 != null) {
                        str = effect2.getEffectId();
                    } else {
                        str = null;
                    }
                    LIZ.append(str);
                    LIZ.append(' ');
                    Exception exception = e.getException();
                    if (exception != null) {
                        C16880lQ.LLLLIIL(exception);
                        c76800UCe = C76800UCe.LIZ;
                    }
                    LIZ.append(c76800UCe);
                    X1D.LIZIZ(LIZ);
                }
            });
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends C121514pn, ? extends Effect>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
