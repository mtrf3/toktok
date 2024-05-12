package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment$saveItems$1", f = "SubscriptionSpotlightFragment.kt", l = {595, 607}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UFU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public C76876UFc LJLJI;
    public C76876UFc LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ SubscriptionSpotlightFragment LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UFU(SubscriptionSpotlightFragment subscriptionSpotlightFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super UFU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJLJ = subscriptionSpotlightFragment;
        this.LJLJLLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        UFU ufu = new UFU(this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        ufu.LJLJL = obj;
        return ufu;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6 A[Catch: Exception -> 0x01d6, CancellationException -> 0x01fb, TryCatch #2 {CancellationException -> 0x01fb, Exception -> 0x01d6, blocks: (B:7:0x00cc, B:8:0x00cf, B:10:0x00d6, B:12:0x00da, B:13:0x00e0, B:15:0x00e6, B:16:0x00f6, B:18:0x00fc, B:20:0x0109, B:21:0x010d, B:24:0x0113, B:27:0x011e, B:30:0x0126, B:54:0x012a, B:33:0x013d, B:34:0x0147, B:36:0x014d, B:38:0x015a, B:39:0x015e, B:42:0x0164, B:45:0x0168, B:66:0x0189, B:74:0x0080, B:75:0x0083, B:78:0x0092, B:80:0x009a, B:82:0x00a2, B:83:0x00a4, B:85:0x00a8, B:86:0x00aa, B:87:0x0057, B:89:0x005d, B:94:0x00b0, B:100:0x0040), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009a A[Catch: Exception -> 0x01d6, CancellationException -> 0x01fb, TryCatch #2 {CancellationException -> 0x01fb, Exception -> 0x01d6, blocks: (B:7:0x00cc, B:8:0x00cf, B:10:0x00d6, B:12:0x00da, B:13:0x00e0, B:15:0x00e6, B:16:0x00f6, B:18:0x00fc, B:20:0x0109, B:21:0x010d, B:24:0x0113, B:27:0x011e, B:30:0x0126, B:54:0x012a, B:33:0x013d, B:34:0x0147, B:36:0x014d, B:38:0x015a, B:39:0x015e, B:42:0x0164, B:45:0x0168, B:66:0x0189, B:74:0x0080, B:75:0x0083, B:78:0x0092, B:80:0x009a, B:82:0x00a2, B:83:0x00a4, B:85:0x00a8, B:86:0x00aa, B:87:0x0057, B:89:0x005d, B:94:0x00b0, B:100:0x0040), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a8 A[Catch: Exception -> 0x01d6, CancellationException -> 0x01fb, TryCatch #2 {CancellationException -> 0x01fb, Exception -> 0x01d6, blocks: (B:7:0x00cc, B:8:0x00cf, B:10:0x00d6, B:12:0x00da, B:13:0x00e0, B:15:0x00e6, B:16:0x00f6, B:18:0x00fc, B:20:0x0109, B:21:0x010d, B:24:0x0113, B:27:0x011e, B:30:0x0126, B:54:0x012a, B:33:0x013d, B:34:0x0147, B:36:0x014d, B:38:0x015a, B:39:0x015e, B:42:0x0164, B:45:0x0168, B:66:0x0189, B:74:0x0080, B:75:0x0083, B:78:0x0092, B:80:0x009a, B:82:0x00a2, B:83:0x00a4, B:85:0x00a8, B:86:0x00aa, B:87:0x0057, B:89:0x005d, B:94:0x00b0, B:100:0x0040), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005d A[Catch: Exception -> 0x01d6, CancellationException -> 0x01fb, TryCatch #2 {CancellationException -> 0x01fb, Exception -> 0x01d6, blocks: (B:7:0x00cc, B:8:0x00cf, B:10:0x00d6, B:12:0x00da, B:13:0x00e0, B:15:0x00e6, B:16:0x00f6, B:18:0x00fc, B:20:0x0109, B:21:0x010d, B:24:0x0113, B:27:0x011e, B:30:0x0126, B:54:0x012a, B:33:0x013d, B:34:0x0147, B:36:0x014d, B:38:0x015a, B:39:0x015e, B:42:0x0164, B:45:0x0168, B:66:0x0189, B:74:0x0080, B:75:0x0083, B:78:0x0092, B:80:0x009a, B:82:0x00a2, B:83:0x00a4, B:85:0x00a8, B:86:0x00aa, B:87:0x0057, B:89:0x005d, B:94:0x00b0, B:100:0x0040), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b0 A[Catch: Exception -> 0x01d6, CancellationException -> 0x01fb, TryCatch #2 {CancellationException -> 0x01fb, Exception -> 0x01d6, blocks: (B:7:0x00cc, B:8:0x00cf, B:10:0x00d6, B:12:0x00da, B:13:0x00e0, B:15:0x00e6, B:16:0x00f6, B:18:0x00fc, B:20:0x0109, B:21:0x010d, B:24:0x0113, B:27:0x011e, B:30:0x0126, B:54:0x012a, B:33:0x013d, B:34:0x0147, B:36:0x014d, B:38:0x015a, B:39:0x015e, B:42:0x0164, B:45:0x0168, B:66:0x0189, B:74:0x0080, B:75:0x0083, B:78:0x0092, B:80:0x009a, B:82:0x00a2, B:83:0x00a4, B:85:0x00a8, B:86:0x00aa, B:87:0x0057, B:89:0x005d, B:94:0x00b0, B:100:0x0040), top: B:2:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x007d -> B:55:0x0083). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
