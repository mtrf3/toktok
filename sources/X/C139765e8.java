package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sharedar.message.handler.EffectReadyMessageHandler$loadCurrentUserAvatarAndSendToEffect$1$bitmap$1", f = "EffectReadyMessageHandler.kt", l = {106}, m = "invokeSuspend")
/* renamed from: X.5e8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139765e8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Bitmap>, Object> {
    public int LJLIL;
    public final /* synthetic */ C44328HaW LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139765e8(C44328HaW c44328HaW, InterfaceC67352kd<? super C139765e8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c44328HaW;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C139765e8(this.LJLILLLLZI, interfaceC67352kd);
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
            C44328HaW c44328HaW = this.LJLILLLLZI;
            this.LJLIL = 1;
            c44328HaW.getClass();
            final XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
            if (currentUser == null) {
                C3C5.m7constructorimpl(null);
                xks.resumeWith(null);
            } else {
                C78764Uvg.LJIILIIL(currentUser.getAvatarThumb(), 0, 0, new InterfaceC15040iS() { // from class: X.5e2
                    @Override // X.InterfaceC15040iS
                    public final void accept(Object obj2) {
                        XJL<Bitmap> xjl = xks;
                        C3C5.m7constructorimpl(obj2);
                        xjl.resumeWith(obj2);
                    }
                });
            }
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
