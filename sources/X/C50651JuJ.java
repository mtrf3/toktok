package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.JuJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50651JuJ {
    public static C50321Joz LIZIZ() {
        C50438Jqs mutableData;
        C50652JuK c50652JuK = (C50652JuK) C85855Xml.LIZIZ(C50652JuK.class);
        if (c50652JuK != null && (mutableData = c50652JuK.getMutableData()) != null) {
            return mutableData.getFragmentData();
        }
        return null;
    }

    public static C50650JuI LIZJ() {
        C50652JuK c50652JuK = (C50652JuK) C85855Xml.LIZIZ(C50652JuK.class);
        if (c50652JuK != null) {
            return c50652JuK.getImmutableData();
        }
        return null;
    }

    public static C50321Joz LIZLLL(View view) {
        InterfaceC55235Lm3 LJIIL;
        InterfaceC55251LmJ LIZLLL;
        C50652JuK c50652JuK;
        C50438Jqs mutableData;
        if (view == null || (LJIIL = LJIIL(view)) == null || (LIZLLL = C55247LmF.LIZLLL(LJIIL, C50652JuK.class, "source_default_key")) == null || (c50652JuK = (C50652JuK) LIZLLL.getSource()) == null || (mutableData = c50652JuK.getMutableData()) == null) {
            return null;
        }
        return mutableData.getFragmentData();
    }

    public static C50321Joz LJ(Fragment fragment) {
        C50652JuK LJIIJ;
        C50438Jqs mutableData;
        if (fragment == null || (LJIIJ = LJIIJ(fragment)) == null || (mutableData = LJIIJ.getMutableData()) == null) {
            return null;
        }
        return mutableData.getFragmentData();
    }

    public static C50431Jql LJFF(LifecycleOwner lifecycleOwner) {
        C50652JuK LJIIJ;
        C50438Jqs mutableData;
        if (lifecycleOwner == null || (LJIIJ = LJIIJ(lifecycleOwner)) == null || (mutableData = LJIIJ.getMutableData()) == null) {
            return null;
        }
        return mutableData.getGlobalData();
    }

    public static C50650JuI LJI(View view) {
        InterfaceC55235Lm3 LJIIL;
        InterfaceC55251LmJ LIZLLL;
        C50652JuK c50652JuK;
        if (view == null || (LJIIL = LJIIL(view)) == null || (LIZLLL = C55247LmF.LIZLLL(LJIIL, C50652JuK.class, "source_default_key")) == null || (c50652JuK = (C50652JuK) LIZLLL.getSource()) == null) {
            return null;
        }
        return c50652JuK.getImmutableData();
    }

    public static C50650JuI LJII(LifecycleOwner lifecycleOwner) {
        C50652JuK LJIIJ;
        if (lifecycleOwner == null || (LJIIJ = LJIIJ(lifecycleOwner)) == null) {
            return null;
        }
        return LJIIJ.getImmutableData();
    }

    public static C50650JuI LJIIIIZZ(InterfaceC55235Lm3 interfaceC55235Lm3) {
        InterfaceC55251LmJ LIZLLL;
        C50652JuK c50652JuK;
        if (interfaceC55235Lm3 == null || (LIZLLL = C55247LmF.LIZLLL(interfaceC55235Lm3, C50652JuK.class, "source_default_key")) == null || (c50652JuK = (C50652JuK) LIZLLL.getSource()) == null) {
            return null;
        }
        return c50652JuK.getImmutableData();
    }

    public static C50652JuK LJIIIZ(View view) {
        InterfaceC55235Lm3 LJIIL;
        InterfaceC55251LmJ LIZLLL;
        if (view == null || (LJIIL = LJIIL(view)) == null || (LIZLLL = C55247LmF.LIZLLL(LJIIL, C50652JuK.class, "source_default_key")) == null) {
            return null;
        }
        return (C50652JuK) LIZLLL.getSource();
    }

    public static C50652JuK LJIIJ(LifecycleOwner lifecycleOwner) {
        InterfaceC55235Lm3 LIZJ;
        InterfaceC55251LmJ LIZLLL;
        if (lifecycleOwner == null) {
            return null;
        }
        if (lifecycleOwner instanceof ActivityC45651qj) {
            LIZJ = C55230Lly.LIZLLL((ActivityC45651qj) lifecycleOwner, null);
        } else if (lifecycleOwner instanceof Fragment) {
            Fragment fragment = (Fragment) lifecycleOwner;
            if (fragment.getContext() == null) {
                return null;
            }
            LIZJ = C55230Lly.LIZJ(fragment, null);
        } else {
            throw new RuntimeException("SearchContextSource not support this lifecycleOwner except Activity&Fragment");
        }
        if (LIZJ == null || (LIZLLL = C55247LmF.LIZLLL(LIZJ, C50652JuK.class, "source_default_key")) == null) {
            return null;
        }
        return (C50652JuK) LIZLLL.getSource();
    }

    public static C50321Joz LJIIJJI(ActivityC45651qj activityC45651qj) {
        C50652JuK LJIIJ;
        C50438Jqs mutableData;
        if (activityC45651qj == null || (LJIIJ = LJIIJ(activityC45651qj)) == null || (mutableData = LJIIJ.getMutableData()) == null) {
            return null;
        }
        return mutableData.getFragmentData();
    }

    public static InterfaceC55235Lm3 LJIIL(View view) {
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        if (LJIIIZ != null && LJIIIZ.getContext() == null) {
            return null;
        }
        return C55230Lly.LJ(view);
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, C50652JuK source) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(source, "source");
        if (lifecycleOwner instanceof Activity) {
            C1DH.LIZ(lifecycleOwner, source, C50652JuK.class);
        } else {
            if (lifecycleOwner instanceof Fragment) {
                C55247LmF.LIZIZ(C55230Lly.LIZJ((Fragment) lifecycleOwner, null), source, C50652JuK.class, "source_default_key");
                return;
            }
            throw new RuntimeException("SearchContextSource not support this lifecycleOwner except Activity&Fragment");
        }
    }
}
