package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import fjb.a;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$notifyRedEnvelopeInfos$3$1", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BSU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC92693kP>, Object> {
    public final /* synthetic */ ImageModel LJLIL;
    public final /* synthetic */ CountDownLatch LJLILLLLZI;
    public final /* synthetic */ C68322mC<Bitmap> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSU(ImageModel imageModel, CountDownLatch countDownLatch, C68322mC<Bitmap> c68322mC, InterfaceC67352kd<? super BSU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = imageModel;
        this.LJLILLLLZI = countDownLatch;
        this.LJLJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BSU(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C73390SrC LIZJ = C31665Cbl.LIZJ(this.LJLIL);
        CountDownLatch countDownLatch = this.LJLILLLLZI;
        return LIZJ.LJJJLIIL(new AfS54S0200000_5(countDownLatch, (CountDownLatch) this.LJLJI, (C68322mC<Bitmap>) 19), new AfS57S0100000_5(countDownLatch, 105));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC92693kP> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
