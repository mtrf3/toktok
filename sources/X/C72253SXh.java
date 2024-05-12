package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.SXh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72253SXh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View target, int i, int i2, int i3, int i4) {
        o.LJIIIZ(target, "target");
        Object parent = target.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        Rect rect = new Rect();
        rect.left = C278817o.LIZ(i);
        rect.top = C278817o.LIZ(i2);
        rect.right = C278817o.LIZ(i3);
        rect.bottom = C278817o.LIZ(i4);
        TouchDelegate touchDelegate = view.getTouchDelegate();
        if (touchDelegate instanceof C72254SXi) {
            ((LinkedList) ((C72254SXi) touchDelegate).LIZ).add(new C72256SXk(rect, target));
        } else {
            C72254SXi c72254SXi = new C72254SXi(target);
            view.setTouchDelegate(c72254SXi);
            ((LinkedList) c72254SXi.LIZ).add(new C72256SXk(rect, target));
        }
    }
}
