package com.bytedance.ies.xelement;

import X.C16880lQ;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class LynxImpressionView extends UISimpleView<VRK> {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    @VPD(defaultInt = 0, name = "impression-percent")
    public void impressionPercent(int i) {
    }

    static {
        C16880lQ.LJLLJ(LynxImpressionView.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxImpressionView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        return new VRK(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLIL = map.containsKey("impression");
            this.LJLILLLLZI = map.containsKey("exit");
        }
    }
}
