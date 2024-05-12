package X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.0kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16460kk {
    public static final ArrayList<WeakReference<View>> LIZLLL = new ArrayList<>();
    public WeakHashMap<View, Boolean> LIZ;
    public SparseArray<WeakReference<View>> LIZIZ;
    public WeakReference<KeyEvent> LIZJ;

    public static boolean LIZIZ(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.l0k);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC16450kj) ListProtector.get(arrayList, size)).LIZ()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final View LIZ(View view, KeyEvent keyEvent) {
        View LIZ;
        WeakHashMap<View, Boolean> weakHashMap = this.LIZ;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    LIZ = LIZ(viewGroup.getChildAt(childCount), keyEvent);
                }
            } while (LIZ == null);
            return LIZ;
        }
        if (!LIZIZ(view, keyEvent)) {
            return null;
        }
        return view;
    }
}
