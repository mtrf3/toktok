package X;

import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget$initRecyclerView$2$3$1", f = "StickerShortCutWidget.kt", l = {316}, m = "invokeSuspend")
/* renamed from: X.2Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54572Cf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StickerShortCutWidget LJLILLLLZI;
    public final /* synthetic */ LiveEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54572Cf(StickerShortCutWidget stickerShortCutWidget, LiveEffect liveEffect, InterfaceC67352kd<? super C54572Cf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerShortCutWidget;
        this.LJLJI = liveEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54572Cf(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XK4 xk4 = this.LJLILLLLZI.LJLJJL.LJLILLLLZI;
            C36981ck c36981ck = new C36981ck(this.LJLJI);
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c36981ck, this) == enumC58928NAu) {
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
