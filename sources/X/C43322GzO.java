package X;

import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.composer.EffectWatermarkComposer$fetchEffectById$2$1", f = "EffectWatermarkComposer.kt", l = {176}, m = "invokeSuspend")
/* renamed from: X.GzO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43322GzO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ H4P LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ XJL<Effect> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43322GzO(H4P h4p, String str, XJL<? super Effect> xjl, InterfaceC67352kd<? super C43322GzO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = h4p;
        this.LJLJI = str;
        this.LJLJJI = xjl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43322GzO(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            H4P h4p = this.LJLILLLLZI;
            this.LJLIL = 1;
            h4p.getClass();
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
            Context LLLLJI = C16880lQ.LLLLJI(C60903NvH.LJ);
            o.LJIIIIZZ(LLLLJI, "getApplication().applicationContext");
            effectService.buildEffectPlatform(LLLLJI, true, new C37275Ek3(xks), C43941HMj.LIZ());
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str = this.LJLJI;
        C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
        final XJL<Effect> xjl = this.LJLJJI;
        final H4P h4p2 = this.LJLILLLLZI;
        final String str2 = this.LJLJI;
        ((InterfaceC84498XEg) obj).LIZLLL(str, LJJJLIIL, new IFetchEffectListener() { // from class: X.5iN
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                if (effect == null) {
                    XJL<Effect> xjl2 = xjl;
                    C3C4 LIZ = C141335gf.LIZ(new NullPointerException("fetched effect is null"));
                    C3C5.m7constructorimpl(LIZ);
                    xjl2.resumeWith(LIZ);
                    return;
                }
                XJL<Effect> xjl3 = xjl;
                C3C5.m7constructorimpl(effect);
                xjl3.resumeWith(effect);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult e) {
                o.LJIIIZ(e, "e");
                XJL<Effect> xjl2 = xjl;
                Exception exception = e.getException();
                o.LJIIIIZZ(exception, "e.exception");
                C3C4 LIZ = C141335gf.LIZ(exception);
                C3C5.m7constructorimpl(LIZ);
                xjl2.resumeWith(LIZ);
                H4P h4p3 = h4p2;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("failed to fetch effect(id=");
                LIZ2.append(str2);
                LIZ2.append("), reason: ");
                LIZ2.append(e);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                h4p3.getClass();
                H4P.LJI(LIZIZ);
            }
        });
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
