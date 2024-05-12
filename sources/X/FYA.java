package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FYA implements FYI {
    public FYB LIZJ;
    public FYH LJ;
    public final ConcurrentHashMap<Integer, FYB> LIZIZ = new ConcurrentHashMap<>();
    public WeakReference<Activity> LIZLLL = new WeakReference<>(null);

    public final void LIZ(Activity activity, Fragment fragment) {
        FYB fyb;
        if ((activity != null || (activity = this.LIZLLL.get()) != null) && (fyb = this.LIZIZ.get(Integer.valueOf(activity.hashCode()))) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            FYF fyf = fyb.LIZLLL;
            if (fyf != null) {
                fyf.LIZ(true);
            }
            ArrayList arrayList = new ArrayList();
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
                ListProtector.add(arrayList, 0, fragment2);
            }
            String LLD = ORZ.LLD(arrayList, "#", null, null, FYW.LJLIL, 30);
            String LLD2 = ORZ.LLD(arrayList, "#", null, null, FYX.LJLIL, 30);
            FYF fyf2 = (FYF) ((ConcurrentHashMap) fyb.LIZJ).get(Integer.valueOf(fragment.hashCode()));
            if (fyf2 == null) {
                fyf2 = new FYF("", "");
            }
            fyf2.LIZIZ = LLD;
            fyf2.LIZJ = LLD2;
            fyf2.LIZ(false);
            fyb.LIZLLL = fyf2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFragmentChanged cost time: ");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            FYH fyh = this.LJ;
            if (fyh != null) {
                fyh.LJII();
            }
        }
    }
}
