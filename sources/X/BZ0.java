package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget$onLoad$4$1", f = "CaptionTextWidget.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BZ0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CaptionTextWidget LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BZ0(CaptionTextWidget captionTextWidget, InterfaceC67352kd<? super BZ0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = captionTextWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BZ0(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C1YG c1yg = new C1YG(EnumC30204BtI.SHARE.getView(this.LJLILLLLZI.dataChannel));
        c1yg.LIZ(R.string.mfi);
        c1yg.LJIIL = BZ1.LJLIL;
        C30770C5u.LIZLLL(new C1YH(c1yg), C09.CAPTION);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
