package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.comp.impl.game.GameDropsShortCardAgent$loadGameDropsShortCardWithLottie$2$3$1", f = "GameDropsShortCardAgent.kt", l = {252}, m = "invokeSuspend")
/* renamed from: X.2w8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74482w8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C30451BxH LJLILLLLZI;
    public final /* synthetic */ C29701Eo LJLJI;
    public final /* synthetic */ C68322mC<Bitmap> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74482w8(C30451BxH c30451BxH, C29701Eo c29701Eo, C68322mC<Bitmap> c68322mC, InterfaceC67352kd<? super C74482w8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c30451BxH;
        this.LJLJI = c29701Eo;
        this.LJLJJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74482w8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C30451BxH c30451BxH = this.LJLILLLLZI;
            C29701Eo c29701Eo = this.LJLJI;
            final Bitmap bitmap = this.LJLJJI.element;
            this.LJLIL = 1;
            c30451BxH.getClass();
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C15490jB.LJIIJJI(c29701Eo, "tiktok_live_game_demand_2", "ttlive_game_drops_appearance.zip", false, new InterfaceC15710jX() { // from class: X.2vR
                @Override // X.InterfaceC15710jX
                public final void onFinish(boolean z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("lottie success, previewBitmap =");
                    LIZ.append(bitmap);
                    C0NB.LIZIZ("GameDropsShortCardAgent", X1D.LIZIZ(LIZ));
                    InterfaceC67352kd<Boolean> interfaceC67352kd = c84654XKg;
                    Boolean bool = Boolean.TRUE;
                    C3C5.m7constructorimpl(bool);
                    interfaceC67352kd.resumeWith(bool);
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
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
