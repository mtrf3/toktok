package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createSingleImageCanvasPrepareTaskFlow$2", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYT extends AbstractC65782Prm implements InterfaceC88471Ynr<GYE, InterfaceC67352kd<? super InterfaceC65462ha<? extends OSZ<? extends GYE, ? extends CanvasVideoData>>>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ CreativeInfo LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYT(CreativeInfo creativeInfo, InterfaceC67352kd<? super GYT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = creativeInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GYT gyt = new GYT(this.LJLILLLLZI, interfaceC67352kd);
        gyt.LJLIL = obj;
        return gyt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return V1M.LJFF(new C41709GYn(this.LJLILLLLZI, (GYE) this.LJLIL, null));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(GYE gye, InterfaceC67352kd<? super InterfaceC65462ha<? extends OSZ<? extends GYE, ? extends CanvasVideoData>>> interfaceC67352kd) {
        return ((a) create(gye, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
