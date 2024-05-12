package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$handleCreatorInboxUnreadCount$2$1", f = "SessionListManagerV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3M7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3M7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ C82253Kr LJLILLLLZI;
    public final /* synthetic */ InterfaceC81953Jn LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3M7(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C82253Kr c82253Kr, InterfaceC81953Jn interfaceC81953Jn, InterfaceC67352kd<? super C3M7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c82253Kr;
        this.LJLJI = interfaceC81953Jn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3M7(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke();
        boolean z2 = this.LJLILLLLZI.LJIILL().LIZIZ;
        this.LJLILLLLZI.LLFF.getClass();
        if (L0W.LIZ()) {
            C82253Kr c82253Kr = this.LJLILLLLZI;
            C3LC c3lc = c82253Kr.LLFF;
            int i = c82253Kr.LJIILL().LIZ;
            c3lc.getClass();
            C2U8.LIZ(new C82793Mt(i));
        }
        this.LJLILLLLZI.LLFF.getClass();
        if (C82903Ne.LIZIZ() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && z2) {
            this.LJLILLLLZI.LJIILL().LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("using creator, upload the unread count of all conversations in Primary Tab:");
            LIZ.append(this.LJLILLLLZI.LJIILL().LIZ);
            C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handle unread count in ");
        LIZ2.append(this.LJLJI.LIZIZ());
        LIZ2.append(", count=");
        LIZ2.append(this.LJLILLLLZI.LJIILL().LIZ);
        LIZ2.append(", isUnreadCountAvailable=");
        LIZ2.append(z2);
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ2));
        C82253Kr c82253Kr2 = this.LJLILLLLZI;
        List LLJI = ORZ.LLJI(this.LJLJI.LJII().values());
        int i2 = this.LJLILLLLZI.LJIILL().LIZ;
        c82253Kr2.getClass();
        C82253Kr.LJJIII(i2, z2, LLJI);
        if (!C54305LSz.LIZJ()) {
            AVO.LIZIZ(this.LJLILLLLZI.LJIILL().LIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
