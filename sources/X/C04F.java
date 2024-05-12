package X;

import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.04F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04F {
    public static final C04F LIZ = new C04F();

    public static final void LIZ(ActionMode actionMode) {
        o.LJIIIZ(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public static final ActionMode LIZIZ(View view, ActionMode.Callback actionModeCallback, int i) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(actionModeCallback, "actionModeCallback");
        return view.startActionMode(actionModeCallback, i);
    }
}
