package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate$smoothToUnreadMessageTips$1", f = "UnreadIndicatorDelegate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.49b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047149b extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C1047549f LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047149b(C1047549f c1047549f, InterfaceC67352kd<? super C1047149b> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c1047549f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1047149b(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C109544Rq message;
        C109544Rq message2;
        C141335gf.LIZJ(obj);
        C34B.LJI("UnreadMessageTips", "smoothToUnreadMessageTips start===");
        C1033643w invoke = this.LJLIL.LJLJJLL.LIZIZ().invoke(new Long(this.LJLIL.LJLLILLLL));
        int i = invoke.LJLIL;
        if (i != -1) {
            C1047549f c1047549f = this.LJLIL;
            c1047549f.LJLLLLLL = i;
            IMMessage iMMessage = (IMMessage) ListProtector.get(c1047549f.LJLJI.getCurrentList(), this.LJLIL.LJLLLLLL);
            if (iMMessage != null && (message = iMMessage.getMessage()) != null) {
                if (message.getMsgType() == 4006) {
                    IMMessage iMMessage2 = (IMMessage) ListProtector.get(this.LJLIL.LJLJI.getCurrentList(), this.LJLIL.LJLLLLLL - 1);
                    if (iMMessage2 != null && (message2 = iMMessage2.getMessage()) != null) {
                        message = message2;
                    }
                } else {
                    this.LJLIL.LJLLLLLL++;
                }
                message.putLocalCache(507, Boolean.TRUE);
                ChatRoomViewModel chatRoomViewModel = this.LJLIL.LJLJJL;
                C91593id c91593id = new C91593id(C47261Igj.LJJIJ(message));
                chatRoomViewModel.getClass();
                chatRoomViewModel.LJLLLL.onNext(c91593id);
            }
        } else {
            int i2 = invoke.LJLILLLLZI;
            if (i2 != -1) {
                this.LJLIL.LJLLLLLL = i2;
            } else {
                this.LJLIL.LJLLLLLL = -1;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currentUnreadPosition: ");
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
            ChatRoomViewModel chatRoomViewModel2 = c1047549f4.LJLJJL;
            int i3 = (int) c1047549f4.LJLLL;
            C99843vw c99843vw = chatRoomViewModel2.LJLLILLLL;
            int LJII = c99843vw.LJLIL.LJII();
            if (i3 < LJII) {
                i3 = LJII;
            }
            int i4 = i3 + 1;
            if (c99843vw.LJLILLLLZI != 1) {
                c99843vw.LJLJI = c99843vw.LJLIL.LJII();
                c99843vw.LJLIL.LIZIZ(i4);
                c99843vw.LJLILLLLZI = 1;
                c99843vw.LJLIL.LJFF();
            }
        } else {
            C1047549f c1047549f5 = this.LJLIL;
            c1047549f5.LJLLI = false;
            c1047549f5.LJLJLLL = true;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("currentUnreadPosition: ");
            LIZ3.append(this.LJLIL.LJLLLLLL);
            C34B.LJI("UnreadMessageTips", X1D.LIZIZ(LIZ3));
            C1047549f c1047549f6 = this.LJLIL;
            int i5 = c1047549f6.LJLLLLLL;
            if (i5 != -1) {
                if (c1047549f6.LLIIIJ) {
                    c1047549f6.LJLILLLLZI.LJLI(i5);
                } else if (i5 != -1) {
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
