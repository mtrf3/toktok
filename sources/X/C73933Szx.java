package X;

import Y.ACallableS83S0101000_12;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.Szx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73933Szx {
    public static C73816Sy4 LIZIZ(T01 t01) {
        return new C73816Sy4(new C73541Std(new ACallableS83S0101000_12(0, t01, 0)), null);
    }

    public static C73816Sy4 LIZJ(View view) {
        if (view == null) {
            return LIZIZ(new KMP());
        }
        return LIZIZ(new C73930Szu(view));
    }

    public static C73816Sy4 LIZLLL(Fragment fragment) {
        if (fragment == null) {
            return LIZIZ(new KMP());
        }
        return LIZIZ(C73931Szv.LIZIZ(fragment, Lifecycle.Event.ON_DESTROY));
    }

    public static C73816Sy4 LJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return LIZIZ(new KMP());
        }
        return LIZIZ(C73931Szv.LIZIZ(lifecycleOwner, Lifecycle.Event.ON_DESTROY));
    }

    public static C73816Sy4 LIZ(C73931Szv c73931Szv, C62705OjF c62705OjF) {
        return new C73816Sy4(new C73541Std(new ACallableS83S0101000_12(1, c73931Szv, 2)), c62705OjF);
    }
}
