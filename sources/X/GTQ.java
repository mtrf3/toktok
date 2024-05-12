package X;

import android.graphics.Bitmap;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.badge.BadgeShareDialog$onCreate$2", f = "BadgeShareDialog.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GTQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OVZ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTQ(OVZ ovz, InterfaceC67352kd<? super GTQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ovz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GTQ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                Bitmap LJIILIIL = C38891fp.LJIILIIL(this.LJLILLLLZI.LJLJLLL.getResources().getDimensionPixelOffset(R.dimen.a6i), this.LJLILLLLZI.LJLJLLL.getResources().getDimensionPixelOffset(R.dimen.a6h), this.LJLILLLLZI.LJLLI);
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                GTR gtr = new GTR(this.LJLILLLLZI, LJIILIIL, null);
                this.LJLIL = 1;
                if (XKX.LJI(abstractC78621UtN, gtr, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
