package X;

import fjb.a;
import java.util.LinkedList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.event.monitor.EventMonitor$monitorClickEnter$job$1", f = "EventMonitor.kt", l = {102}, m = "invokeSuspend")
/* renamed from: X.BRl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28785BRl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C28786BRm LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28785BRl(long j, String str, Object obj, C28786BRm c28786BRm, InterfaceC67352kd<? super C28785BRl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = obj;
        this.LJLJJL = c28786BRm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28785BRl(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Object obj2 = this.LJLJJI;
        if (obj2 != null) {
            JDX.LIZJ(obj2, "EC_CLICK_MISS_ENTER");
        }
        LinkedList<C28786BRm> linkedList = JDX.LJFF;
        C28786BRm c28786BRm = this.LJLJJL;
        synchronized (linkedList) {
            linkedList.remove(c28786BRm);
        }
        XKQ xkq = this.LJLJJL.LIZJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJJL.LIZJ = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
