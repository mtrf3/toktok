package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Sbk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72432Sbk extends ViewOutlineProvider {
    public final /* synthetic */ C72431Sbj LIZ;

    public C72432Sbk(C72431Sbj c72431Sbj) {
        this.LIZ = c72431Sbj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.LIZ.LJZL) {
            ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
            return;
        }
        Rect rect = new Rect();
        this.LIZ.LJLILLLLZI.roundOut(rect);
        outline.setRoundRect(rect, rect.width() / 2.0f);
    }
}
