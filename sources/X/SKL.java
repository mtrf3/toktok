package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKL {
    public final WeakReference<Object> LIZ;

    public SKL(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = new WeakReference<>(fragment);
    }

    public final void LIZ(int i) {
        Object obj;
        WeakReference<Object> weakReference = this.LIZ;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (obj instanceof Fragment) {
            C71909SKb.LIZ.getClass();
            C71909SKb.LIZLLL().LJIIIIZZ(i, (Fragment) obj);
        } else {
            if (!(obj instanceof Activity)) {
                return;
            }
            C71909SKb.LIZ.getClass();
            C71909SKb.LIZLLL().LJIIIZ((Activity) obj, i);
        }
    }

    public final void LIZIZ(String string) {
        Object obj;
        o.LJIIIZ(string, "string");
        WeakReference<Object> weakReference = this.LIZ;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (obj instanceof Fragment) {
            C71909SKb.LIZ.getClass();
            C71909SKb.LIZLLL().LIZJ((Fragment) obj, string);
        } else {
            if (!(obj instanceof Activity)) {
                return;
            }
            C71909SKb.LIZ.getClass();
            C71909SKb.LIZLLL().LIZIZ((Activity) obj, string);
        }
    }

    public SKL(ActivityC45651qj activityC45651qj) {
        this.LIZ = new WeakReference<>(activityC45651qj);
    }
}
