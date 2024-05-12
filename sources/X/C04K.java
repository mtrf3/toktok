package X;

import android.view.ViewParent;
import kotlin.jvm.internal.o;

/* renamed from: X.04K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04K {
    public static final C04K LIZ = new C04K();

    public static final void LIZ(C45211q1 ownerView) {
        o.LJIIIZ(ownerView, "ownerView");
        ViewParent parent = ownerView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(ownerView, ownerView);
        }
    }
}
