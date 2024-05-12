package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate$scrollTMsgWithIndex$1", f = "UnreadIndicatorDelegate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.49c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047249c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C1047549f LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047249c(C1047549f c1047549f, long j, InterfaceC67352kd<? super C1047249c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c1047549f;
        this.LJLILLLLZI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1047249c(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C1047549f c1047549f = this.LJLIL;
        c1047549f.LJLLLLLL = c1047549f.LJLJJLL.LIZ().invoke(new Long(this.LJLILLLLZI)).intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scrolling to: ");
        LIZ.append(this.LJLIL.LJLLLLLL);
        LIZ.append(" msgCount: ");
        LIZ.append(this.LJLIL.LJLJI.getItemCount());
        C34B.LJI("UnreadMessageTips", X1D.LIZIZ(LIZ));
        C1047549f c1047549f2 = this.LJLIL;
        if (c1047549f2.LJLLLLLL == -1 && c1047549f2.LJLJI.getItemCount() != 0) {
            C1047549f c1047549f3 = this.LJLIL;
            c1047549f3.LJLLI = true;
            c1047549f3.LJLZ++;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("scheduledGeneration: ");
            LIZ2.append(this.LJLIL.LJLZ);
            C34B.LJI("UnreadMessageTips", X1D.LIZIZ(LIZ2));
            C1047549f c1047549f4 = this.LJLIL;
            if (c1047549f4.LJLZ > 10) {
                c1047549f4.LJLZ = 0;
                c1047549f4.LJLLI = false;
                return C76800UCe.LIZ;
            }
            ChatRoomViewModel chatRoomViewModel = c1047549f4.LJLJJL;
            int i = (int) c1047549f4.LJLLL;
            C99843vw c99843vw = chatRoomViewModel.LJLLILLLL;
            int LJII = c99843vw.LJLIL.LJII();
            if (i < LJII) {
                i = LJII;
            }
            int i2 = i + 1;
            if (c99843vw.LJLILLLLZI != 1) {
                c99843vw.LJLJI = c99843vw.LJLIL.LJII();
                c99843vw.LJLIL.LIZIZ(i2);
                c99843vw.LJLILLLLZI = 1;
                c99843vw.LJLIL.LJFF();
            }
        } else {
            C1047549f c1047549f5 = this.LJLIL;
            c1047549f5.LJLLI = false;
            c1047549f5.LJLJLLL = true;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("current scroll position: ");
            LIZ3.append(this.LJLIL.LJLLLLLL);
            C34B.LJI("UnreadMessageTips", X1D.LIZIZ(LIZ3));
            C1047549f c1047549f6 = this.LJLIL;
            int i3 = c1047549f6.LJLLLLLL;
            if (i3 != -1) {
                if (c1047549f6.LLIIIJ) {
                    c1047549f6.LJLILLLLZI.LJLI(i3);
                } else if (i3 != -1) {
                    c1047549f6.LLIIIL = true;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
