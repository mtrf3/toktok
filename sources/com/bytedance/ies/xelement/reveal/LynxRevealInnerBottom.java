package com.bytedance.ies.xelement.reveal;

import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;

/* loaded from: classes11.dex */
public final class LynxRevealInnerBottom extends UIGroup<VRK> {
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }
}
