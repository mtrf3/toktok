package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadRemoteData$2", f = "ShopMainViewModel.kt", l = {437}, m = "invokeSuspend")
/* renamed from: X.LyZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56011LyZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ShopMainViewModel LJLJI;
    public final /* synthetic */ EnumC56007LyV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56011LyZ(EnumC56007LyV enumC56007LyV, ShopMainViewModel shopMainViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = shopMainViewModel;
        this.LJLJJI = enumC56007LyV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C56011LyZ c56011LyZ = new C56011LyZ(this.LJLJJI, this.LJLJI, interfaceC67352kd);
        c56011LyZ.LJLILLLLZI = obj;
        return c56011LyZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0210, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a4 A[Catch: Exception -> 0x0237, TRY_ENTER, TryCatch #1 {Exception -> 0x0237, blocks: (B:6:0x009a, B:7:0x009d, B:9:0x00a1, B:11:0x00a7, B:14:0x00b2, B:16:0x00b8, B:18:0x00c4, B:19:0x00c9, B:21:0x00d3, B:22:0x00da, B:24:0x00e0, B:25:0x00f4, B:27:0x00fe, B:29:0x0104, B:31:0x010a, B:33:0x0110, B:39:0x0121, B:49:0x013b, B:51:0x014f, B:53:0x0155, B:54:0x0159, B:56:0x0161, B:57:0x0182, B:65:0x0194, B:68:0x01a4, B:70:0x01b5, B:74:0x01bf, B:76:0x01c2, B:78:0x01d4, B:79:0x01e3, B:81:0x01f3, B:83:0x0201, B:85:0x020b, B:87:0x0212, B:89:0x0218, B:91:0x0227, B:94:0x01db, B:100:0x002e, B:106:0x0048, B:107:0x005c, B:111:0x0056, B:112:0x004f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d4 A[Catch: Exception -> 0x0237, TryCatch #1 {Exception -> 0x0237, blocks: (B:6:0x009a, B:7:0x009d, B:9:0x00a1, B:11:0x00a7, B:14:0x00b2, B:16:0x00b8, B:18:0x00c4, B:19:0x00c9, B:21:0x00d3, B:22:0x00da, B:24:0x00e0, B:25:0x00f4, B:27:0x00fe, B:29:0x0104, B:31:0x010a, B:33:0x0110, B:39:0x0121, B:49:0x013b, B:51:0x014f, B:53:0x0155, B:54:0x0159, B:56:0x0161, B:57:0x0182, B:65:0x0194, B:68:0x01a4, B:70:0x01b5, B:74:0x01bf, B:76:0x01c2, B:78:0x01d4, B:79:0x01e3, B:81:0x01f3, B:83:0x0201, B:85:0x020b, B:87:0x0212, B:89:0x0218, B:91:0x0227, B:94:0x01db, B:100:0x002e, B:106:0x0048, B:107:0x005c, B:111:0x0056, B:112:0x004f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db A[Catch: Exception -> 0x0237, TryCatch #1 {Exception -> 0x0237, blocks: (B:6:0x009a, B:7:0x009d, B:9:0x00a1, B:11:0x00a7, B:14:0x00b2, B:16:0x00b8, B:18:0x00c4, B:19:0x00c9, B:21:0x00d3, B:22:0x00da, B:24:0x00e0, B:25:0x00f4, B:27:0x00fe, B:29:0x0104, B:31:0x010a, B:33:0x0110, B:39:0x0121, B:49:0x013b, B:51:0x014f, B:53:0x0155, B:54:0x0159, B:56:0x0161, B:57:0x0182, B:65:0x0194, B:68:0x01a4, B:70:0x01b5, B:74:0x01bf, B:76:0x01c2, B:78:0x01d4, B:79:0x01e3, B:81:0x01f3, B:83:0x0201, B:85:0x020b, B:87:0x0212, B:89:0x0218, B:91:0x0227, B:94:0x01db, B:100:0x002e, B:106:0x0048, B:107:0x005c, B:111:0x0056, B:112:0x004f), top: B:2:0x000e }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56011LyZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
