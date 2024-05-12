package X;

import com.bytedance.vcloud.vctrace.BuildConfig;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.UploadFrameServiceImpl$FramePackageHandlerFactory$createFramePackageHandler$1$createFramePackage$2$1", f = "UploadFrameServiceImpl.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H18 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ H1C LJLILLLLZI;
    public final /* synthetic */ H16 LJLJI;
    public final /* synthetic */ InterfaceC67352kd<String> LJLJJI;
    public final /* synthetic */ H1B LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H18(H1C h1c, H16 h16, InterfaceC67352kd<? super String> interfaceC67352kd, H1B h1b, InterfaceC67352kd<? super H18> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLILLLLZI = h1c;
        this.LJLJI = h16;
        this.LJLJJI = interfaceC67352kd;
        this.LJLJJL = h1b;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H18(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r14 == null) goto L22;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H18.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
