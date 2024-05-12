package X;

import Y.IDfS24S0200000_9;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.presenter.StickerPropDetailHelperKt$collectSticker$1", f = "StickerPropDetailHelper.kt", l = {73}, m = "invokeSuspend")
/* renamed from: X.Mf3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57349Mf3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IAVEffectService.EffectPlatformLoader LJLILLLLZI;
    public final /* synthetic */ NewFaceStickerBean LJLJI;
    public final /* synthetic */ MIW LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57349Mf3(IAVEffectService.EffectPlatformLoader effectPlatformLoader, NewFaceStickerBean newFaceStickerBean, MIW miw, InterfaceC67352kd<? super C57349Mf3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectPlatformLoader;
        this.LJLJI = newFaceStickerBean;
        this.LJLJJI = miw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57349Mf3(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XGL LIZ = XGJ.LIZ();
            IAVEffectService.EffectPlatformLoader effectPlatformLoader = this.LJLILLLLZI;
            String str = this.LJLJI.id;
            o.LJIIIIZZ(str, "stickerBean.id");
            XGR LIZ2 = LIZ.LIZ(new C57350Mf4(effectPlatformLoader, str, this.LJLJI.isFavorite));
            LIZ2.LIZ(new C84568XGy(new C57352Mf6(C47261Igj.LJJIJ(this.LJLJI.id))));
            InterfaceC65462ha LIZIZ = LIZ2.LIZIZ();
            IDfS24S0200000_9 iDfS24S0200000_9 = new IDfS24S0200000_9(this.LJLJJI, this.LJLJI, 0);
            this.LJLIL = 1;
            if (LIZIZ.collect(iDfS24S0200000_9, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
