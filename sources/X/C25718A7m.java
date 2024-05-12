package X;

import fjb.a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$buildSwitchItem$1$1", f = "LinkPrivacyNoticeController.kt", l = {270, 271, 275}, m = "invokeSuspend")
/* renamed from: X.A7m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25718A7m extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C25710A7e LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ CancellationException LJLJJL;
    public final /* synthetic */ AI2 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25718A7m(C25710A7e c25710A7e, boolean z, CancellationException cancellationException, AI2 ai2, InterfaceC67352kd<? super C25718A7m> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c25710A7e;
        this.LJLJJI = z;
        this.LJLJJL = cancellationException;
        this.LJLJJLL = ai2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25718A7m(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
        } catch (Throwable th) {
            th = th;
            if (!o.LJ(th, this.LJLJJL)) {
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C25719A7n c25719A7n = new C25719A7n(this.LJLJJLL, this.LJLJJI, null);
                this.LJLIL = th;
                this.LJLILLLLZI = 3;
                if (XKX.LJI(abstractC78621UtN, c25719A7n, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        th = (Throwable) this.LJLIL;
                        C141335gf.LIZJ(obj);
                        C221018lt.LIZJ("@LinkRelation", "update switch error", th);
                        return C76800UCe.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("switch the privacy ");
                LIZ.append(this.LJLJJI);
                C221018lt.LJFF("@LinkRelation", X1D.LIZIZ(LIZ));
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI = 1;
            if (C1JD.LIZJ(300L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C25710A7e c25710A7e = this.LJLJI;
        boolean z = this.LJLJJI;
        this.LJLILLLLZI = 2;
        if (c25710A7e.LIZLLL(z, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("switch the privacy ");
        LIZ2.append(this.LJLJJI);
        C221018lt.LJFF("@LinkRelation", X1D.LIZIZ(LIZ2));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
