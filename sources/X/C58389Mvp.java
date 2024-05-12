package X;

import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import kotlin.jvm.internal.o;

/* renamed from: X.Mvp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58389Mvp extends C40197Fq5 {
    public final /* synthetic */ boolean LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58389Mvp(boolean z) {
        super("x-video-pro", false, false);
        this.LIZLLL = z;
    }

    @Override // X.C40197Fq5
    public final LynxUI<?> LIZLLL(VNU context) {
        o.LJIIIZ(context, "context");
        LynxVideoUI lynxVideoUI = new LynxVideoUI(context);
        boolean z = this.LIZLLL;
        C58390Mvq c58390Mvq = new C58390Mvq();
        lynxVideoUI.LJZI = c58390Mvq;
        ((C79982VaE) lynxVideoUI.mView).setUrlConstructor(c58390Mvq);
        if (z) {
            lynxVideoUI.LJZ = new O2P(context, EnumC61028NxI.LYNX_VIDEO);
        }
        ((C79982VaE) lynxVideoUI.mView).setEngineFactory(C58391Mvr.LJLIL);
        return lynxVideoUI;
    }
}
