package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsStickerAdapter$onViewAttachedToWindow$1$1", f = "MyEffectsStickerAdapter.kt", l = {525, 526}, m = "invokeSuspend")
/* renamed from: X.Aua, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27736Aua extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TD3 LJLILLLLZI;
    public final /* synthetic */ C73365Sqn<Effect> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27736Aua(TD3 td3, C73365Sqn<Effect> c73365Sqn, InterfaceC67352kd<? super C27736Aua> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = td3;
        this.LJLJI = c73365Sqn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27736Aua(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(100L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XIF xif = EXT.LIZ;
        C27735AuZ c27735AuZ = new C27735AuZ(this.LJLILLLLZI, this.LJLJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(xif, c27735AuZ, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
