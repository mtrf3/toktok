package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.7TV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7TV extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7TV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.7TW
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (view2 != null) {
                    view2.requestApplyInsets();
                }
            }
        });
    }
}
