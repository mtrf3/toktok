package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM$startLoad$2", f = "CustomDotVM.kt", l = {111, 149, 111, 149}, m = "invokeSuspend")
/* renamed from: X.ELd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36265ELd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public M18 LJLIL;
    public CustomDotVM LJLILLLLZI;
    public M18 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ M18 LJLJL;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super Response<CustomDotResponse>>, Object> LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ CustomDotVM LJLL;
    public final /* synthetic */ M18 LJLLI;
    public final /* synthetic */ boolean LJLLILLLL;
    public final /* synthetic */ boolean LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36265ELd(M18 m18, InterfaceC88471Ynr<? super Boolean, ? super InterfaceC67352kd<? super Response<CustomDotResponse>>, ? extends Object> interfaceC88471Ynr, boolean z, CustomDotVM customDotVM, M18 m182, boolean z2, boolean z3, InterfaceC67352kd<? super C36265ELd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = m18;
        this.LJLJLJ = interfaceC88471Ynr;
        this.LJLJLLL = z;
        this.LJLL = customDotVM;
        this.LJLLI = m182;
        this.LJLLILLLL = z2;
        this.LJLLJ = z3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36265ELd(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, interfaceC67352kd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(1:2)|(5:4|(1:(1:(1:(4:9|10|11|12)(2:15|16))(2:17|18))(1:69))(6:71|72|73|75|76|(2:78|(7:81|(4:83|(2:84|(2:86|(1:88)(1:115))(2:116|117))|89|(3:91|92|(2:100|(1:102)(7:103|104|105|(1:107)(1:113)|108|109|(1:111)))(1:99)))|118|92|(0)|100|(0)(0))))|70|11|12)(4:123|124|125|(2:127|128))|19|21|22|(2:24|(7:28|(4:30|(2:31|(2:33|(1:35)(1:62))(2:63|64))|36|(3:38|39|(2:47|(1:49)(7:50|51|52|(1:54)(1:60)|55|56|(1:58)))(1:46)))|65|39|(0)|47|(0)(0)))|10|11|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009e, code lost:
    
        X.C36266ELe.LIZ(r4, "api request fail");
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: all -> 0x0167, CancellationException -> 0x023e, TryCatch #8 {CancellationException -> 0x023e, all -> 0x0167, blocks: (B:9:0x0023, B:10:0x00f0, B:24:0x00a3, B:28:0x00b1, B:30:0x00b7, B:31:0x00bb, B:33:0x00c1, B:36:0x00d0, B:38:0x00d4, B:39:0x00d8, B:42:0x00e3, B:44:0x00e9, B:46:0x00ed, B:47:0x00f7, B:49:0x00fb, B:50:0x0110, B:56:0x014c, B:68:0x009e, B:124:0x006f), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb A[Catch: all -> 0x0167, CancellationException -> 0x023e, TryCatch #8 {CancellationException -> 0x023e, all -> 0x0167, blocks: (B:9:0x0023, B:10:0x00f0, B:24:0x00a3, B:28:0x00b1, B:30:0x00b7, B:31:0x00bb, B:33:0x00c1, B:36:0x00d0, B:38:0x00d4, B:39:0x00d8, B:42:0x00e3, B:44:0x00e9, B:46:0x00ed, B:47:0x00f7, B:49:0x00fb, B:50:0x0110, B:56:0x014c, B:68:0x009e, B:124:0x006f), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110 A[Catch: all -> 0x0167, CancellationException -> 0x023e, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x023e, all -> 0x0167, blocks: (B:9:0x0023, B:10:0x00f0, B:24:0x00a3, B:28:0x00b1, B:30:0x00b7, B:31:0x00bb, B:33:0x00c1, B:36:0x00d0, B:38:0x00d4, B:39:0x00d8, B:42:0x00e3, B:44:0x00e9, B:46:0x00ed, B:47:0x00f7, B:49:0x00fb, B:50:0x0110, B:56:0x014c, B:68:0x009e, B:124:0x006f), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0179  */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM] */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM] */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM] */
    /* JADX WARN: Type inference failed for: r17v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36265ELd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
