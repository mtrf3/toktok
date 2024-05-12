package X;

import fjb.a;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.UnreadCountModelImpl$reportUnreadCount$1", f = "UnreadCountModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110704Wc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110704Wc(String str, int i, Integer num, InterfaceC67352kd<? super C110704Wc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = num;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C110704Wc(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C4WL c4wl = C4WL.LIZIZ;
        final String str = this.LJLIL;
        final int i = this.LJLILLLLZI;
        final Integer num = this.LJLJI;
        c4wl.getClass();
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        long j = i;
        InterfaceC63361Otp interfaceC63361Otp = new InterfaceC63361Otp() { // from class: X.4Wb
            @Override // X.InterfaceC63361Otp
            public final void onSuccess() {
                C63322OtC.LJI("UnreadCountModelImpl", "Report unread count succesfull", null);
                ((ConcurrentHashMap) C4WL.LIZJ).put(str, Integer.valueOf(i));
            }

            @Override // X.InterfaceC63361Otp
            public final void LIZ(C63622Oy2 c63622Oy2) {
                String str2;
                Integer num2 = num;
                if (num2 != null) {
                    ((ConcurrentHashMap) C4WL.LIZJ).put(str, num2);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Report unread count failed ");
                if (c63622Oy2 != null) {
                    str2 = c63622Oy2.LJ();
                } else {
                    str2 = null;
                }
                LIZ.append(str2);
                C63322OtC.LJI("UnreadCountModelImpl", X1D.LIZIZ(LIZ), null);
            }
        };
        LJIIIZ.getClass();
        C63628Oy8 c63628Oy8 = new C63628Oy8();
        C120574oH c120574oH = new C120574oH();
        if (j != -1) {
            c120574oH.LIZLLL = Long.valueOf(j);
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJLIIIIJ = c120574oH.build();
        c63628Oy8.LJIIJJI(0, c89453Z8v.build(), interfaceC63361Otp, new Object[0]);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
