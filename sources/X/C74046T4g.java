package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.T4g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74046T4g {
    public static RectF LIZ(C74053T4n c74053T4n, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!c74053T4n.LJLLILLLL && (view instanceof C74045T4f)) {
            C74045T4f c74045T4f = (C74045T4f) view;
            int contentWidth = c74045T4f.getContentWidth();
            int contentHeight = c74045T4f.getContentHeight();
            int LIZIZ = C7MY.LIZIZ(24);
            if (contentWidth < LIZIZ) {
                contentWidth = LIZIZ;
            }
            int right = (c74045T4f.getRight() + c74045T4f.getLeft()) / 2;
            int bottom = (c74045T4f.getBottom() + c74045T4f.getTop()) / 2;
            int i = contentWidth / 2;
            return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
}
