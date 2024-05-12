package com.bytedance.ies.xelement;

import X.F5B;
import X.VPD;
import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxBounceView extends UISimpleView<VRK> {
    public String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxBounceView(Context context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLIL = "right";
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        return new VRK(context);
    }

    @VPD(customType = "right", name = "direction")
    public final void setDirection(F5B direction) {
        o.LJIIJ(direction, "direction");
        if (direction.getType() == ReadableType.String) {
            String asString = direction.asString();
            o.LJFF(asString, "direction.asString()");
            this.LJLIL = asString;
        }
    }
}
