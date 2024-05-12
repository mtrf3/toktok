package X;

import Y.IDeS360S0100000_1;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createCanvasPrepareTaskFlow$2", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYS extends AbstractC65782Prm implements InterfaceC88471Ynr<GYE, InterfaceC67352kd<? super InterfaceC65462ha<? extends GYE>>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ForwardMedia LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYS(ForwardMedia forwardMedia, InterfaceC67352kd<? super GYS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = forwardMedia;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GYS gys = new GYS(this.LJLILLLLZI, interfaceC67352kd);
        gys.LJLIL = obj;
        return gys;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        GYE canvasMediaInfo = (GYE) this.LJLIL;
        ForwardMedia source = this.LJLILLLLZI;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(canvasMediaInfo, "canvasMediaInfo");
        C41700GYe.LJI("calculateBackgroundColor start");
        C44428Hc8 c44428Hc8 = C41700GYe.LJ;
        if (c44428Hc8 != null && !c44428Hc8.LIZIZ) {
            c44428Hc8.LIZLLL();
        }
        if (C00F.LIZ(31744, 0, "creation_add_to_story_background_style", true) == 1) {
            return V1M.LJFF(new C41711GYp(canvasMediaInfo, null));
        }
        C44428Hc8 c44428Hc82 = C41700GYe.LJ;
        if (c44428Hc82 != null && c44428Hc82.LIZIZ) {
            c44428Hc82.LJ();
        }
        C41700GYe.LJI("calculateBackgroundColor finish with default color.");
        return new IDeS360S0100000_1(canvasMediaInfo, 10);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(GYE gye, InterfaceC67352kd<? super InterfaceC65462ha<? extends GYE>> interfaceC67352kd) {
        return ((a) create(gye, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
