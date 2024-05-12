package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreVM;
import fjb.a;
import kotlin.jvm.internal.AqS172S0100000_6;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreVM$fetchSearchDataList$1", f = "DynamicSearchStoreFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EBm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36014EBm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ KFN LJLILLLLZI;
    public final /* synthetic */ DynamicSearchStoreVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36014EBm(KFN kfn, DynamicSearchStoreVM dynamicSearchStoreVM, InterfaceC67352kd<? super C36014EBm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = kfn;
        this.LJLJI = dynamicSearchStoreVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36014EBm c36014EBm = new C36014EBm(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c36014EBm.LJLIL = obj;
        return c36014EBm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        m LJ;
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        try {
            LJ = EcSearchApi.LJ(this.LJLILLLLZI);
        } catch (Exception e) {
            this.LJLJI.setState(new AqS172S0100000_6(e, 31));
        }
        if (!C79146V4k.LJJJ(interfaceC70422pa.getCoroutineContext())) {
            return C76800UCe.LIZ;
        }
        this.LJLJI.setState(new AqS172S0100000_6(LJ, 30));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
