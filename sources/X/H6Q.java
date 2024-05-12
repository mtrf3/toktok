package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.resourceloader.EndingWatermarkResourceLoader$load$1", f = "EndingWatermarkResourceLoader.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H6Q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ H6P LJLILLLLZI;
    public final /* synthetic */ InterfaceC88474Ynu<Boolean, List<String>, String, String, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H6Q(H6P h6p, InterfaceC88474Ynu<? super Boolean, ? super List<String>, ? super String, ? super String, C76800UCe> interfaceC88474Ynu, InterfaceC67352kd<? super H6Q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = h6p;
        this.LJLJI = interfaceC88474Ynu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H6Q(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(1:(1:4)(2:47|48))(2:49|(1:51))|5|(16:37|(3:41|42|43)|8|(2:12|(1:14))|15|(1:17)|25|26|27|(1:31)|32|33|19|(1:21)|22|23)|7|8|(3:10|12|(0))|15|(0)|25|26|27|(1:31)|32|33|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r11, X.X1D.LIZIZ(r0)) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        X.C39579Fg7.LJIL(r4);
        r4 = X.H4M.LIZIZ();
        r1 = X.X1D.LIZ();
        r1.append(-1);
        r1.append('-');
        r1.append(-1);
        r4.storeString("key_ending_frame_ready", X.X1D.LIZIZ(r1));
        X.H78.LIZLLL("WatermarkResourceLoader", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H6Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
