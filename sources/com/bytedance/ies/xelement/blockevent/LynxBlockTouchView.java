package com.bytedance.ies.xelement.blockevent;

import X.C58379Mvf;
import X.VRK;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxBlockTouchView extends UISimpleView<VRK> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxBlockTouchView(Context context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        o.LJIIJ(context, "context");
        return new C58379Mvf(context);
    }
}
