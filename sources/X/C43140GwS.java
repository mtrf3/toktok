package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import dmt.av.video.SingleImageCoverBitmapData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$6", f = "OptimizeTakePhotoProcessor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GwS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43140GwS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ C43139GwR LJLILLLLZI;
    public final /* synthetic */ CanvasVideoData LJLJI;
    public final /* synthetic */ SingleImageCoverBitmapData LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43140GwS(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C43139GwR c43139GwR, CanvasVideoData canvasVideoData, SingleImageCoverBitmapData singleImageCoverBitmapData, InterfaceC67352kd<? super C43140GwS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c43139GwR;
        this.LJLJI = canvasVideoData;
        this.LJLJJI = singleImageCoverBitmapData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43140GwS(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke();
        C43139GwR c43139GwR = this.LJLILLLLZI;
        H9T.LJIIIIZZ(c43139GwR, this.LJLJI, c43139GwR.LJIIIIZZ, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
