package X;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.BrE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30076BrE {
    public static final /* synthetic */ int LIZIZ = 0;
    public final RecyclableWidgetManager LIZ;

    public C30076BrE(RecyclableWidgetManager mWidgetManager) {
        o.LJIIIZ(mWidgetManager, "mWidgetManager");
        this.LIZ = mWidgetManager;
        new HashSet();
    }

    public final void LIZIZ(InterfaceC30078BrG interfaceC30078BrG, Class cls) {
        if (cls != null) {
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(cls))) {
                interfaceC30078BrG.LIZJ(new C30077BrF(this, cls));
                return;
            } else {
                this.LIZ.load(cls);
                return;
            }
        }
        this.LIZ.load(cls);
    }

    public final void LIZ(InterfaceC30078BrG interfaceC30078BrG, int i, LiveWidget liveWidget, boolean z) {
        if (liveWidget != null) {
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(liveWidget.getClass()))) {
                interfaceC30078BrG.LIZJ(new C30075BrD(liveWidget, this, i));
                return;
            } else {
                this.LIZ.load(i, liveWidget, z);
                return;
            }
        }
        this.LIZ.load(i, liveWidget, z);
    }

    public final void LIZJ(boolean z, InterfaceC30078BrG interfaceC30078BrG, int i, LiveWidget liveWidget) {
        if (liveWidget != null) {
            if (C58521Mxx.LIZ(C16880lQ.LJLLJ(liveWidget.getClass())) && !z) {
                interfaceC30078BrG.LIZJ(new C30074BrC(liveWidget, this, i));
                return;
            } else {
                this.LIZ.load(i, liveWidget);
                return;
            }
        }
        this.LIZ.load(i, liveWidget);
    }
}
