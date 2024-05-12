package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import ujb.o;
import ujb.s;

/* renamed from: X.F4t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38387F4t {
    public static final List<String> LIZ = C47261Igj.LJJIJIL("java.", "androidx.", "android.", "com.android.", "dalvik.", "io.reactivex.", "com.google.gson.", "kotlin.", "kotlinx.", "com.bytedance.helios.binder", "com.bytedance.pumbaa");

    public static OSJ LIZ(View view) {
        Object parent;
        View view2;
        Object tag;
        String obj;
        if (view == null || (parent = view.getParent()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (parent instanceof View) {
            View view3 = (View) parent;
            if (view3 != null && (tag = view3.getTag(R.id.ni3)) != null && (obj = tag.toString()) != null && (o.LJJJLIIL(obj, "Fragment#", false) || o.LJJJLIIL(obj, "Dialog#", false))) {
                List LJLJJL = s.LJLJJL(obj, new String[]{"#"}, 0, 6);
                if (LJLJJL.size() > 1) {
                    return new OSJ(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1), arrayList);
                }
            }
            String LJLLILLLL = C16880lQ.LJLLILLLL(parent.getClass());
            kotlin.jvm.internal.o.LJIIIIZZ(LJLLILLLL, "nextView.javaClass.canonicalName");
            arrayList.add(LJLLILLLL);
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                parent = view2.getParent();
            } else {
                parent = null;
            }
            i++;
            if (i >= 10) {
                break;
            }
        }
        return new OSJ(null, null, arrayList);
    }
}
