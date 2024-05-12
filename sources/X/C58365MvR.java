package X;

import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.tasm.behavior.ui.LynxUI;
import kotlin.jvm.internal.o;

/* renamed from: X.MvR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58365MvR extends C40197Fq5 {
    public final /* synthetic */ boolean LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58365MvR(boolean z) {
        super("x-lottie", false, false);
        this.LIZLLL = z;
    }

    @Override // X.C40197Fq5
    public final LynxUI<?> LIZLLL(VNU context) {
        o.LJIIIZ(context, "context");
        LynxBytedLottieView lynxBytedLottieView = new LynxBytedLottieView(context);
        if (this.LIZLLL) {
            lynxBytedLottieView.LJLZ = new C60789NtR(context, false, EnumC61028NxI.LYNX_LOTTIE);
        }
        return lynxBytedLottieView;
    }
}
