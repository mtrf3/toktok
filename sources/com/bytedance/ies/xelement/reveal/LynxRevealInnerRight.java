package com.bytedance.ies.xelement.reveal;

import X.VNU;
import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxRevealInnerRight extends UIGroup<VRK> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxRevealInnerRight(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }
}