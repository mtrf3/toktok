package com.bytedance.ies.xelement.text.text;

import X.VNU;
import X.VS2;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.text.UIText;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxTextUI extends UIText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxTextUI(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.lynx.tasm.behavior.ui.text.UIText
    /* renamed from: LJIJJLI */
    public final VS2 createView(Context context) {
        o.LJIIJ(context, "context");
        return new VS2(context);
    }

    @Override // com.lynx.tasm.behavior.ui.text.UIText, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }
}
