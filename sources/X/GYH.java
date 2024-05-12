package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createPrepareTaskFlow$3", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYH extends AbstractC65782Prm implements InterfaceC88471Ynr<GYE, InterfaceC67352kd<? super InterfaceC65462ha<? extends GYE>>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ForwardMedia LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYH(ForwardMedia forwardMedia, InterfaceC67352kd<? super GYH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = forwardMedia;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GYH gyh = new GYH(this.LJLILLLLZI, interfaceC67352kd);
        gyh.LJLIL = obj;
        return gyh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return GYP.LIZ(this.LJLILLLLZI, (GYE) this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(GYE gye, InterfaceC67352kd<? super InterfaceC65462ha<? extends GYE>> interfaceC67352kd) {
        return ((a) create(gye, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
