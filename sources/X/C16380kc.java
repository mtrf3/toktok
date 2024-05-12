package X;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* renamed from: X.0kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16380kc {
    public static void LIZ(View view) {
        view.cancelDragAndDrop();
    }

    public static void LIZIZ(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    public static void LIZJ(View view) {
        view.dispatchStartTemporaryDetach();
    }

    public static void LIZLLL(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static void LJFF(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    public static boolean LJ(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }
}
