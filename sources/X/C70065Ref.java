package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment$initData$6", f = "PdpFragment.kt", l = {543, 548}, m = "invokeSuspend")
/* renamed from: X.Ref, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70065Ref extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLILLLLZI;
    public final /* synthetic */ PdpFragment LJLJI;
    public final /* synthetic */ HashMap<String, String> LJLJJI;
    public final /* synthetic */ C34K LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70065Ref(IPdpStarter.PdpEnterParam pdpEnterParam, PdpFragment pdpFragment, HashMap<String, String> hashMap, C34K c34k, InterfaceC67352kd<? super C70065Ref> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpEnterParam;
        this.LJLJI = pdpFragment;
        this.LJLJJI = hashMap;
        this.LJLJJL = c34k;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70065Ref(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x016b, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, r4) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9 A[Catch: all -> 0x02c4, TryCatch #2 {all -> 0x02c4, blocks: (B:6:0x0010, B:12:0x02a0, B:13:0x02a3, B:15:0x02a9, B:17:0x02ac, B:21:0x0020, B:24:0x0030, B:26:0x0049, B:28:0x004c, B:30:0x0050, B:33:0x0067, B:34:0x006b, B:36:0x007d, B:38:0x0082, B:40:0x008a, B:43:0x008e, B:45:0x0094, B:47:0x0099, B:49:0x00a3, B:51:0x00b3, B:52:0x00b5, B:54:0x014b, B:56:0x0151, B:58:0x0157, B:60:0x024a, B:62:0x0252, B:63:0x016d, B:65:0x0189, B:66:0x019d, B:68:0x01a9, B:70:0x01b3, B:71:0x01b7, B:73:0x01c1, B:74:0x01c6, B:78:0x0271, B:79:0x0283, B:83:0x01d0, B:85:0x01e7, B:86:0x01e9, B:88:0x0203, B:89:0x0205, B:91:0x0217, B:92:0x0219, B:94:0x022c, B:97:0x0243, B:103:0x0167, B:107:0x00bb, B:112:0x00c0, B:114:0x00cc, B:116:0x00cf, B:119:0x00e6, B:122:0x00f3, B:124:0x00ff, B:126:0x0108, B:131:0x0114, B:133:0x012e, B:135:0x0134, B:139:0x0105), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1 A[Catch: all -> 0x02c4, TryCatch #2 {all -> 0x02c4, blocks: (B:6:0x0010, B:12:0x02a0, B:13:0x02a3, B:15:0x02a9, B:17:0x02ac, B:21:0x0020, B:24:0x0030, B:26:0x0049, B:28:0x004c, B:30:0x0050, B:33:0x0067, B:34:0x006b, B:36:0x007d, B:38:0x0082, B:40:0x008a, B:43:0x008e, B:45:0x0094, B:47:0x0099, B:49:0x00a3, B:51:0x00b3, B:52:0x00b5, B:54:0x014b, B:56:0x0151, B:58:0x0157, B:60:0x024a, B:62:0x0252, B:63:0x016d, B:65:0x0189, B:66:0x019d, B:68:0x01a9, B:70:0x01b3, B:71:0x01b7, B:73:0x01c1, B:74:0x01c6, B:78:0x0271, B:79:0x0283, B:83:0x01d0, B:85:0x01e7, B:86:0x01e9, B:88:0x0203, B:89:0x0205, B:91:0x0217, B:92:0x0219, B:94:0x022c, B:97:0x0243, B:103:0x0167, B:107:0x00bb, B:112:0x00c0, B:114:0x00cc, B:116:0x00cf, B:119:0x00e6, B:122:0x00f3, B:124:0x00ff, B:126:0x0108, B:131:0x0114, B:133:0x012e, B:135:0x0134, B:139:0x0105), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0 A[Catch: all -> 0x02c4, TryCatch #2 {all -> 0x02c4, blocks: (B:6:0x0010, B:12:0x02a0, B:13:0x02a3, B:15:0x02a9, B:17:0x02ac, B:21:0x0020, B:24:0x0030, B:26:0x0049, B:28:0x004c, B:30:0x0050, B:33:0x0067, B:34:0x006b, B:36:0x007d, B:38:0x0082, B:40:0x008a, B:43:0x008e, B:45:0x0094, B:47:0x0099, B:49:0x00a3, B:51:0x00b3, B:52:0x00b5, B:54:0x014b, B:56:0x0151, B:58:0x0157, B:60:0x024a, B:62:0x0252, B:63:0x016d, B:65:0x0189, B:66:0x019d, B:68:0x01a9, B:70:0x01b3, B:71:0x01b7, B:73:0x01c1, B:74:0x01c6, B:78:0x0271, B:79:0x0283, B:83:0x01d0, B:85:0x01e7, B:86:0x01e9, B:88:0x0203, B:89:0x0205, B:91:0x0217, B:92:0x0219, B:94:0x022c, B:97:0x0243, B:103:0x0167, B:107:0x00bb, B:112:0x00c0, B:114:0x00cc, B:116:0x00cf, B:119:0x00e6, B:122:0x00f3, B:124:0x00ff, B:126:0x0108, B:131:0x0114, B:133:0x012e, B:135:0x0134, B:139:0x0105), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70065Ref.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
