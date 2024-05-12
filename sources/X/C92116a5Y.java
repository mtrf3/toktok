package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.a5Y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92116a5Y {
    public static final ViewGroup LIZ(View view) {
        o.LJIIIZ(view, "view");
        if (view instanceof FrameLayout) {
            return (ViewGroup) view;
        }
        Object parent = view.getParent();
        if (parent == null) {
            Context context = view.getContext();
            if (context != null) {
                View findViewById = ((Activity) context).findViewById(R.id.content);
                o.LJIIIIZZ(findViewById, "view.context as Activity…yId(android.R.id.content)");
                return (ViewGroup) findViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        if (parent instanceof FrameLayout) {
            return (ViewGroup) parent;
        }
        return LIZ((View) parent);
    }
}
