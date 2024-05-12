package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ext.AdapterLoader$refresh$1", f = "AdapterCompat.kt", l = {149}, m = "invokeSuspend")
/* renamed from: X.Mpz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58027Mpz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C58029Mq1<T> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58027Mpz(C58029Mq1<T> c58029Mq1, InterfaceC67352kd<? super C58027Mpz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c58029Mq1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C58027Mpz(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C58029Mq1<T> c58029Mq1 = this.LJLILLLLZI;
                this.LJLIL = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                c58029Mq1.LJLJJI = xks;
                PowerPageSource<T> powerPageSource = c58029Mq1.LJLJI;
                if (powerPageSource != 0) {
                    powerPageSource.onRefresh(xks);
                    obj = xks.LJIIJJI();
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    o.LJIJI("pageSource");
                    throw null;
                }
            }
            A2G a2g = (A2G) obj;
            if (a2g instanceof A2V) {
                this.LJLILLLLZI.LJLJJL = ((A2V) a2g).LIZJ;
            }
        } catch (Throwable th) {
            AYY.LIZ.getClass();
            AYY.LIZ("AdapterLoader", "adapter loader refresh error", th);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
