package X;

import Y.IDeS152S0200000_13;
import Y.IDeS361S0100000_7;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createPrepareTaskFlow$1", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYF extends AbstractC65782Prm implements InterfaceC88471Ynr<GYE, InterfaceC67352kd<? super InterfaceC65462ha<? extends OSZ<? extends GYE, ? extends C163166am>>>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ForwardMedia LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYF(ForwardMedia forwardMedia, InterfaceC67352kd<? super GYF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = forwardMedia;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GYF gyf = new GYF(this.LJLILLLLZI, interfaceC67352kd);
        gyf.LJLIL = obj;
        return gyf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        GYE gye = (GYE) this.LJLIL;
        if (gye.LIZJ == null) {
            return new C3CJ(new C3C3(new C41692GXw(null)), GYP.LIZ(this.LJLILLLLZI, gye), new C41689GXt(null));
        }
        return new IDeS361S0100000_7(new IDeS152S0200000_13((InterfaceC88471Ynr) new C41686GXq(null), GYP.LIZ(this.LJLILLLLZI, gye), 2), 1);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(GYE gye, InterfaceC67352kd<? super InterfaceC65462ha<? extends OSZ<? extends GYE, ? extends C163166am>>> interfaceC67352kd) {
        return ((a) create(gye, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
