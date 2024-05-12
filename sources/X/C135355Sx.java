package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import java.util.ArrayList;

/* renamed from: X.5Sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135355Sx {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(View view) {
        ViewGroup viewGroup;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && childAt.getWidth() != 0 && childAt.getHeight() != 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (1 > arrayList.size()) {
            return null;
        }
        return LIZIZ(viewGroup.getChildAt(((Number) ListProtector.get(arrayList, 0)).intValue()));
    }

    public static Rect LIZIZ(View view) {
        int[] iArr = {0, 0};
        if (view == null) {
            return null;
        }
        View view2 = view;
        while (!(view2 instanceof VideoViewCellRootView)) {
            iArr[0] = view2.getLeft() + iArr[0];
            iArr[1] = view2.getTop() + iArr[1];
            Object parent = view2.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                throw new RuntimeException("View has no ancestor View of the provided ancestor View");
            }
        }
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }
}
