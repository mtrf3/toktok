package X;

import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.v2.CaptionTextManager$clearCaptionTextLines$1", f = "CaptionTextManager.kt", l = {239}, m = "invokeSuspend")
/* renamed from: X.39d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C792539d extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XJO LJLIL;
    public UO1 LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ UO1 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C792539d(UO1 uo1, InterfaceC67352kd<? super C792539d> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = uo1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C792539d(this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UO1 uo1;
        XJO xjo;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
            if (i != 0) {
                if (i == 1) {
                    uo1 = this.LJLILLLLZI;
                    xjo = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                uo1 = this.LJLJJI;
                xjo = uo1.LJIILIIL;
                if (xjo != null) {
                    this.LJLIL = xjo;
                    this.LJLILLLLZI = uo1;
                    this.LJLJI = 1;
                    if (xjo.LIZ(null, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                return C76800UCe.LIZ;
            }
            ((ArrayList) uo1.LJIIJJI).clear();
            return C76800UCe.LIZ;
        } finally {
            xjo.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
