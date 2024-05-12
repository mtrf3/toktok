package X;

import com.bytedance.android.live.base.model.ImageModel;
import fjb.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.utils.LiveLottieUtils$loadLottieAndUpdateImages$1", f = "LiveLottieUtils.kt", l = {45, 58, 71, 76}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CXV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ List<ImageModel> LJLJL;
    public final /* synthetic */ CountDownLatch LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ C29701Eo LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ int LJLLJ;
    public final /* synthetic */ int LJLLL;
    public final /* synthetic */ List<String> LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CXV(List<? extends ImageModel> list, CountDownLatch countDownLatch, boolean z, C29701Eo c29701Eo, String str, String str2, int i, int i2, List<String> list2, InterfaceC67352kd<? super CXV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = list;
        this.LJLJLJ = countDownLatch;
        this.LJLJLLL = z;
        this.LJLL = c29701Eo;
        this.LJLLI = str;
        this.LJLLILLLL = str2;
        this.LJLLJ = i;
        this.LJLLL = i2;
        this.LJLLLL = list2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CXV(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
