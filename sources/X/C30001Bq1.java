package X;

import Y.ALAdapterS4S0200000_5;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Bq1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30001Bq1 extends AbstractC30009Bq9 {
    public final HashSet<C29701Eo> LIZ = new HashSet<>();
    public final HashSet<C2A4> LIZIZ = new HashSet<>();
    public final /* synthetic */ SelfLikeWidget LIZJ;

    public C30001Bq1(SelfLikeWidget selfLikeWidget) {
        this.LIZJ = selfLikeWidget;
    }

    public final void LIZIZ(C29701Eo c29701Eo) {
        c29701Eo.setVisibility(4);
        if (this.LIZ.size() >= 5) {
            FrameLayout frameLayout = this.LIZJ.LJLIL;
            if (frameLayout != null) {
                C16880lQ.LJLLLL(c29701Eo, frameLayout);
                return;
            } else {
                o.LJIJI("tapLottieContainer");
                throw null;
            }
        }
        this.LIZ.add(c29701Eo);
    }

    public final void LIZ(C29701Eo c29701Eo, PointF pointF) {
        c29701Eo.setVisibility(0);
        c29701Eo.setX(pointF.x);
        c29701Eo.setY(pointF.y);
        ALAdapterS4S0200000_5 aLAdapterS4S0200000_5 = new ALAdapterS4S0200000_5(this, c29701Eo, 6);
        ((InterfaceC29205BdB) AbstractC73638SvC.LJI(new C30006Bq6(c29701Eo, aLAdapterS4S0200000_5)).LJIIIZ(new C30007Bq7(c29701Eo, aLAdapterS4S0200000_5, this)).LIZLLL(WidgetExtendsKt.autoDispose(this.LIZJ))).LIZ();
        if (LiveLikePerformanceOptimizeSettings.INSTANCE.enablePerformanceOptimize()) {
            c29701Eo.useHardwareAcceleration();
        }
    }
}
