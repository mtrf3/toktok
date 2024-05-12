package X;

import Y.AfS44S0300000_5;
import Y.AfS57S0100000_5;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import fjb.a;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$2", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BSk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28810BSk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC92693kP>, Object> {
    public final /* synthetic */ ImageModel LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ C68322mC<Bitmap> LJLJI;
    public final /* synthetic */ CountDownLatch LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28810BSk(ImageModel imageModel, C34K c34k, C68322mC<Bitmap> c68322mC, CountDownLatch countDownLatch, InterfaceC67352kd<? super C28810BSk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = imageModel;
        this.LJLILLLLZI = c34k;
        this.LJLJI = c68322mC;
        this.LJLJJI = countDownLatch;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28810BSk(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C73390SrC LIZJ = C31665Cbl.LIZJ(this.LJLIL);
        C34K c34k = this.LJLILLLLZI;
        C68322mC<Bitmap> c68322mC = this.LJLJI;
        CountDownLatch countDownLatch = this.LJLJJI;
        return LIZJ.LJJJLIIL(new AfS44S0300000_5(countDownLatch, c34k, c68322mC, 10), new AfS57S0100000_5(countDownLatch, 239));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC92693kP> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
