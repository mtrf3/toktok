package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import fjb.a;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$notifyRedEnvelopeInfos$3$2", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BST extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC92693kP>, Object> {
    public final /* synthetic */ C68322mC<ImageModel> LJLIL;
    public final /* synthetic */ C68322mC<Bitmap> LJLILLLLZI;
    public final /* synthetic */ CountDownLatch LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BST(C68322mC<ImageModel> c68322mC, C68322mC<Bitmap> c68322mC2, CountDownLatch countDownLatch, InterfaceC67352kd<? super BST> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c68322mC2;
        this.LJLJI = countDownLatch;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BST(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C73390SrC LIZJ = C31665Cbl.LIZJ(this.LJLIL.element);
        C68322mC<Bitmap> c68322mC = this.LJLILLLLZI;
        CountDownLatch countDownLatch = this.LJLJI;
        return LIZJ.LJJJLIIL(new AfS54S0200000_5(countDownLatch, (CountDownLatch) c68322mC, (C68322mC<Bitmap>) 20), new AfS57S0100000_5(countDownLatch, 106));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC92693kP> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
