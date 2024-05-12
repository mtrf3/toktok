package X;

import Y.IDfS128S0100000_7;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createSingleImagePrepareTaskFlow$$inlined$map$1$2", f = "ForwardOnThisDayEnvironment.kt", l = {136}, m = "emit")
/* loaded from: classes8.dex */
public final class GYY extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS128S0100000_7 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYY(IDfS128S0100000_7 iDfS128S0100000_7, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS128S0100000_7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
