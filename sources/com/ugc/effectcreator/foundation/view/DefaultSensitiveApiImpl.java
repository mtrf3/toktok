package com.ugc.effectcreator.foundation.view;

import android.graphics.Canvas;
import android.view.View;
import com.bytedance.effectcreatormobile.ckeapi.api.ISensitiveApi;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DefaultSensitiveApiImpl implements ISensitiveApi {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.ISensitiveApi
    public void drawCanvas(View view, Canvas canvas) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(canvas, "canvas");
        view.draw(canvas);
    }
}
