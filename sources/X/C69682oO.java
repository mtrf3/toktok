package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$init$1", f = "StorageSyncer.kt", l = {29}, m = "invokeSuspend")
/* renamed from: X.2oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69682oO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69682oO(String str, InterfaceC67352kd<? super C69682oO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69682oO(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        C3GR c3gr;
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
            C69622oI c69622oI = C69622oI.LIZ;
            String str = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c69622oI.LIZIZ(str, false, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        if (localTestApi != null) {
            bool = Boolean.valueOf(localTestApi.enableBoe());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            c3gr = C3GR.RELATION_STORAGE_BOE;
        } else {
            c3gr = C3GR.RELATION_STORAGE_ONLINE;
        }
        new C74162vc(c3gr, new C69672oN(null));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
