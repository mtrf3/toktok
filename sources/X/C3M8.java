package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$handleNormalInboxUnreadCount$2$1", f = "SessionListManagerV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3M8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3M8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ C82253Kr LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC81953Jn LJLJJI;
    public final /* synthetic */ List<C3L4> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3M8(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C82253Kr c82253Kr, int i, InterfaceC81953Jn interfaceC81953Jn, List<? extends C3L4> list, InterfaceC67352kd<? super C3M8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c82253Kr;
        this.LJLJI = i;
        this.LJLJJI = interfaceC81953Jn;
        this.LJLJJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3M8(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke();
        this.LJLILLLLZI.LLFF.getClass();
        if (L0W.LIZ()) {
            C3LC c3lc = this.LJLILLLLZI.LLFF;
            int i = this.LJLJI;
            c3lc.getClass();
            C2U8.LIZ(new C82793Mt(i));
            C34B.LJI("SessionListManagerV2", "syncSessionListI18n step 7 speed up red dot show");
        }
        this.LJLILLLLZI.LLFF.getClass();
        if (C82903Ne.LIZIZ() == 2 && this.LJLJJI.LJIIJJI()) {
            ((C3MB) this.LJLILLLLZI.LJZI.getValue()).LIZ(null, null);
            C34B.LJI("SessionListManagerV2", "syncSessionListI18n step 6 upload unread count");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle unread count in ");
        LIZ.append(this.LJLJJI.LIZIZ());
        LIZ.append(", count=");
        LIZ.append(this.LJLJI);
        C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
        C82253Kr c82253Kr = this.LJLILLLLZI;
        List<C3L4> list = this.LJLJJL;
        int i2 = this.LJLJI;
        boolean LJIIJJI = this.LJLJJI.LJIIJJI();
        c82253Kr.getClass();
        C82253Kr.LJJIII(i2, LJIIJJI, list);
        if (!C54305LSz.LIZJ()) {
            AVO.LIZIZ(this.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
