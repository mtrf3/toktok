package X;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.04h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C015504h {
    public static final C015504h LIZ = new C015504h();

    public static final void LIZ(AccessibilityNodeInfo node, List<String> data) {
        o.LJIIIZ(node, "node");
        o.LJIIIZ(data, "data");
        node.setAvailableExtraData(data);
    }
}
