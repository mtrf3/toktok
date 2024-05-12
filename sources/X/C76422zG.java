package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.iescore.depend.NetworkDependImpl$checkIfNetworkIsStillUnavailableManually$1$1", f = "NetworkDependImpl.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.2zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76422zG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C76422zG(InterfaceC67352kd<? super C76422zG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76422zG(interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(3000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (C48203Ivv.LJ(EF7.LIZIZ())) {
            return C76800UCe.LIZ;
        }
        if (C76482zM.LIZJ.compareAndSet(true, false)) {
            C76482zM.LIZ.getClass();
            C34B.LIZIZ("NetworkDependImpl", "Network Unavailable");
            Iterator it = ((CopyOnWriteArraySet) C76482zM.LIZIZ.getValue()).iterator();
            while (it.hasNext()) {
                InterfaceC76442zI interfaceC76442zI = (InterfaceC76442zI) it.next();
                EnumC115234ff enumC115234ff = EnumC115234ff.DISCONNECTED;
                C76482zM.LIZ.getClass();
                interfaceC76442zI.LIZ(new C76512zP(enumC115234ff, C76482zM.LIZJ()));
            }
            LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.get();
            o.LJIIIIZZ(lifecycleOwner, "get()");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C78613UtF.LIZJ, null, new C72892tZ(null), 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C76422zG(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
