package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.utils.LiveLottieUtils$loadLottieAndUpdateImages$1$1$1", f = "LiveLottieUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CXX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<ImageModel> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ List<Bitmap> LJLJI;
    public final /* synthetic */ CountDownLatch LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CXX(List<? extends ImageModel> list, int i, List<Bitmap> list2, CountDownLatch countDownLatch, InterfaceC67352kd<? super CXX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = list2;
        this.LJLJJI = countDownLatch;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CXX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C73390SrC LIZJ = C31665Cbl.LIZJ((ImageModel) ListProtector.get(this.LJLIL, this.LJLILLLLZI));
        List<Bitmap> list = this.LJLJI;
        CountDownLatch countDownLatch = this.LJLJJI;
        LIZJ.LJJJLIIL(new AfS54S0200000_5(list, countDownLatch, 76), new AfS57S0100000_5(countDownLatch, 379));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
