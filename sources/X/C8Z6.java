package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8Z6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Z6 {
    public static final /* synthetic */ int LIZ = 0;

    public static RecyclerView LIZ(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView LIZ2 = LIZ(viewGroup.getChildAt(i));
                if (LIZ2 != null) {
                    return LIZ2;
                }
            }
            return null;
        }
        return null;
    }
}
