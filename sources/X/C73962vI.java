package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$2$1", f = "CaptionViewModel.kt", l = {82}, m = "invokeSuspend")
/* renamed from: X.2vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73962vI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ CaptionViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73962vI(String str, CaptionViewModel captionViewModel, InterfaceC67352kd<? super C73962vI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = captionViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73962vI(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XIC xic = C78613UtF.LIZ;
            C73972vJ c73972vJ = new C73972vJ(this.LJLILLLLZI, this.LJLJI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xic, c73972vJ, this) == enumC58928NAu) {
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