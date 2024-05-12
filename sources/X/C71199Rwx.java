package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import fjb.a;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.util.EcPinCardDelayHelper$hookRequest$job$1", f = "EcPinCardDelayHelper.kt", l = {95}, m = "invokeSuspend")
/* renamed from: X.Rwx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71199Rwx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ C71200Rwy LJLJJL;
    public final /* synthetic */ ECommerceMessage LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71199Rwx(long j, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C71200Rwy c71200Rwy, ECommerceMessage eCommerceMessage, InterfaceC67352kd<? super C71199Rwx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = c71200Rwy;
        this.LJLJJLL = eCommerceMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C71199Rwx c71199Rwx = new C71199Rwx(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c71199Rwx.LJLILLLLZI = obj;
        return c71199Rwx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            obj2 = this.LJLILLLLZI;
            long j = this.LJLJI;
            this.LJLILLLLZI = obj2;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJJI.invoke();
        if (obj2 instanceof InterfaceC79150V4o) {
            Iterator<C71218RxG> it = this.LJLJJL.LIZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C71218RxG next = it.next();
                if (o.LJ(next.LJLILLLLZI, obj2)) {
                    if (next != null) {
                        this.LJLJJL.LIZ.remove(next);
                    }
                }
            }
        }
        this.LJLJJL.LIZIZ.add(new C71231RxT(this.LJLJJLL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
