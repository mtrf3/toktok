package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel$loopForResult$1", f = "ReapymentRetViewModel.kt", l = {121, 124, 132, 144, 150, 159, 162}, m = "invokeSuspend")
/* renamed from: X.aLq, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93126aLq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public C64797Pbt LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ RepaymentViewModel LJLJJI;
    public final /* synthetic */ C76732zl LJLJJL;
    public final /* synthetic */ C72242sW LJLJJLL;
    public final /* synthetic */ InterfaceC88475Ynv<Integer, Long, EnumC91916a2K, EnumC91995a3b, RepaymentResultInfo, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93126aLq(RepaymentViewModel repaymentViewModel, C76732zl c76732zl, C72242sW c72242sW, InterfaceC88475Ynv<? super Integer, ? super Long, ? super EnumC91916a2K, ? super EnumC91995a3b, ? super RepaymentResultInfo, C76800UCe> interfaceC88475Ynv, InterfaceC67352kd<? super C93126aLq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = repaymentViewModel;
        this.LJLJJL = c76732zl;
        this.LJLJJLL = c72242sW;
        this.LJLJL = interfaceC88475Ynv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93126aLq(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:35|(2:37|38)|9|10|(2:59|(1:61))(3:14|(2:16|17)(1:58)|(2:39|(7:41|(2:43|44)|45|(2:47|48)|32|33|(0))(7:49|(2:51|52)|53|54|32|33|(0)))(4:19|(2:21|22)|23|(1:25)(5:28|(2:30|31)|32|33|(0))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:49|(2:51|52)|53|54|32|33|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0176, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0174, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7 A[Catch: Exception -> 0x0174, TryCatch #2 {Exception -> 0x0174, blocks: (B:10:0x0070, B:12:0x0082, B:14:0x00a3, B:19:0x00c9, B:23:0x00e3, B:28:0x00f7, B:32:0x016a, B:35:0x0044, B:39:0x0103, B:41:0x0112, B:45:0x0129, B:49:0x0133, B:58:0x00ba, B:59:0x008d), top: B:9:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044 A[Catch: Exception -> 0x0174, TRY_ENTER, TryCatch #2 {Exception -> 0x0174, blocks: (B:10:0x0070, B:12:0x0082, B:14:0x00a3, B:19:0x00c9, B:23:0x00e3, B:28:0x00f7, B:32:0x016a, B:35:0x0044, B:39:0x0103, B:41:0x0112, B:45:0x0129, B:49:0x0133, B:58:0x00ba, B:59:0x008d), top: B:9:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x006c -> B:9:0x0070). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93126aLq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
