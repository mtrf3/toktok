package com.lynx.tasm.behavior.ui.scroll;

import X.F5B;
import X.VNU;
import X.VPD;
import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.view.UISimpleView;

/* loaded from: classes15.dex */
public class UIBounceView extends UISimpleView<VRK> {
    public int LJLIL;

    public UIBounceView(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }

    @VPD(customType = "right", name = "direction")
    public void setDirection(F5B f5b) {
        if (f5b.getType() == ReadableType.String) {
            String asString = f5b.asString();
            if (asString.equals("right")) {
                this.LJLIL = 0;
                return;
            }
            if (asString.equals("left")) {
                this.LJLIL = 1;
            } else if (asString.equals("top")) {
                this.LJLIL = 2;
            } else {
                if (!asString.equals("bottom")) {
                    return;
                }
                this.LJLIL = 3;
            }
        }
    }
}
