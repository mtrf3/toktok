package X;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WFJ implements InterfaceC16490kn {
    public static final WFJ LIZ = new WFJ();

    @Override // X.InterfaceC16490kn
    public final WFG onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (o.LJ(str, "RelativeLayout")) {
            WFG wfg = new WFG(context, attributeSet);
            wfg.setEnableOptimize(true);
            return wfg;
        }
        return null;
    }
}
