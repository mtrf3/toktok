package com.lynx.canvas;

import X.C40154FpO;
import X.VNU;
import X.VPD;
import android.content.Context;
import android.view.MotionEvent;
import com.lynx.tasm.behavior.ui.LynxUI;

/* loaded from: classes15.dex */
public class UICanvas extends LynxUI<UICanvasView> {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPY
    public final boolean dispatchEvent(C40154FpO c40154FpO) {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ((UICanvasView) this.mView).LIZ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        ((UICanvasView) this.mView).LIZJ(getBoundingClientRect());
    }

    public UICanvas(VNU vnu) {
        super(vnu);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final UICanvasView createView(Context context) {
        UICanvasView uICanvasView = new UICanvasView(context);
        this.mView = uICanvasView;
        return uICanvasView;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPY
    public final boolean dispatchTouch(MotionEvent motionEvent) {
        if (isUserInteractionEnabled()) {
            ((UICanvasView) this.mView).LIZIZ(motionEvent, this.mContext.LJLJLLL.getBoundingClientRect(), getBoundingClientRect());
            return false;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(name = "name")
    public void setName(String str) {
        super.setName(str);
        if (str != null) {
            ((UICanvasView) this.mView).setId(str);
        }
    }
}
