package X;

import Y.IDfS20S0200000;
import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget$observeViewModel$1", f = "StickerShortCutWidget.kt", l = {513}, m = "invokeSuspend")
/* renamed from: X.2Ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54592Ch extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StickerShortCutWidget LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54592Ch(StickerShortCutWidget stickerShortCutWidget, InterfaceC67352kd<? super C54592Ch> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = stickerShortCutWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54592Ch c54592Ch = new C54592Ch(this.LJLJI, interfaceC67352kd);
        c54592Ch.LJLILLLLZI = obj;
        return c54592Ch;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            StickerShortCutWidget stickerShortCutWidget = this.LJLJI;
            XLL xll = stickerShortCutWidget.LJLJJL.LJLJI;
            IDfS20S0200000 iDfS20S0200000 = new IDfS20S0200000(stickerShortCutWidget, interfaceC70422pa, 0);
            this.LJLIL = 1;
            if (xll.collect(iDfS20S0200000, this) == enumC58928NAu) {
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
