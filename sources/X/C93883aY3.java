package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.aY3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93883aY3 extends ViewOutlineProvider {
    public final float LIZ;

    public C93883aY3(float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(outline, "outline");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.LIZ);
    }
}
