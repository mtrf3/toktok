package X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uyg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78950Uyg {
    public static final /* synthetic */ int LIZ = 0;

    public static Interpolator LIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1536602315:
                if (!str.equals("TUX_easeOvershoot")) {
                    return null;
                }
                return C55953Lxd.LJIIJJI();
            case -1243722766:
                if (!str.equals("TUX_easeOutCubic")) {
                    return null;
                }
                return C55953Lxd.LJIIIIZZ();
            case -1230794137:
                if (!str.equals("TUX_easeOutQuart")) {
                    return null;
                }
                return new DecelerateInterpolator(2.0f);
            case -1230786573:
                if (!str.equals("TUX_easeOutQuint")) {
                    return null;
                }
                return C55953Lxd.LJIIIZ();
            case -824569726:
                if (!str.equals("TUX_easeInBack")) {
                    return null;
                }
                return C55953Lxd.LIZJ();
            case -824457843:
                if (!str.equals("TUX_easeInExpo")) {
                    return null;
                }
                return new AccelerateInterpolator(3.0f);
            case -824103710:
                if (!str.equals("TUX_easeInQuad")) {
                    return null;
                }
                PathInterpolator LIZIZ = C18950ol.LIZIZ(0.11f, 0.0f, 0.5f, 0.0f);
                o.LJIIIIZZ(LIZIZ, "create(0.11f, 0f, 0.5f, 0f)");
                return LIZIZ;
            case -824055256:
                if (!str.equals("TUX_easeInSine")) {
                    return null;
                }
                PathInterpolator LIZIZ2 = C18950ol.LIZIZ(0.12f, 0.0f, 0.39f, 0.0f);
                o.LJIIIIZZ(LIZIZ2, "create(0.12f, 0f, 0.39f, 0f)");
                return LIZIZ2;
            case -165133229:
                if (!str.equals("TUX_easeInOut")) {
                    return null;
                }
                return C55953Lxd.LIZLLL();
            case 209660687:
                if (!str.equals("TUX_easeInCubic")) {
                    return null;
                }
                return new AccelerateInterpolator(1.5f);
            case 222589316:
                if (!str.equals("TUX_easeInQuart")) {
                    return null;
                }
                return new AccelerateInterpolator(2.0f);
            case 222596880:
                if (!str.equals("TUX_easeInQuint")) {
                    return null;
                }
                return new AccelerateInterpolator(2.5f);
            case 1038830263:
                if (!str.equals("TUX_easeInOutCubic")) {
                    return null;
                }
                return C55953Lxd.LJ();
            case 1051758892:
                if (!str.equals("TUX_easeInOutQuart")) {
                    return null;
                }
                PathInterpolator LIZIZ3 = C18950ol.LIZIZ(0.76f, 0.0f, 0.24f, 1.0f);
                o.LJIIIIZZ(LIZIZ3, "create(0.76f, 0f, 0.24f, 1f)");
                return LIZIZ3;
            case 1051766456:
                if (!str.equals("TUX_easeInOutQuint")) {
                    return null;
                }
                PathInterpolator LIZIZ4 = C18950ol.LIZIZ(0.83f, 0.0f, 0.17f, 1.0f);
                o.LJIIIIZZ(LIZIZ4, "create(0.83f, 0f, 0.17f, 1f)");
                return LIZIZ4;
            case 1483851583:
                if (!str.equals("TUX_easeOutBack")) {
                    return null;
                }
                return C55953Lxd.LJII();
            case 1483963466:
                if (!str.equals("TUX_easeOutExpo")) {
                    return null;
                }
                return new DecelerateInterpolator(3.0f);
            case 1484317599:
                if (!str.equals("TUX_easeOutQuad")) {
                    return null;
                }
                PathInterpolator LIZIZ5 = C18950ol.LIZIZ(0.5f, 1.0f, 0.89f, 1.0f);
                o.LJIIIIZZ(LIZIZ5, "create(0.5f, 1f, 0.89f, 1f)");
                return LIZIZ5;
            case 1484366053:
                if (!str.equals("TUX_easeOutSine")) {
                    return null;
                }
                PathInterpolator LIZIZ6 = C18950ol.LIZIZ(0.61f, 1.0f, 0.88f, 1.0f);
                o.LJIIIIZZ(LIZIZ6, "create(0.61f, 1f, 0.88f, 1f)");
                return LIZIZ6;
            case 1696141541:
                if (!str.equals("TUX_easeInOutExpo")) {
                    return null;
                }
                PathInterpolator LIZIZ7 = C18950ol.LIZIZ(0.87f, 0.0f, 0.13f, 1.0f);
                o.LJIIIIZZ(LIZIZ7, "create(0.87f, 0f, 0.13f, 1f)");
                return LIZIZ7;
            case 1696495674:
                if (!str.equals("TUX_easeInOutQuad")) {
                    return null;
                }
                return C55953Lxd.LJFF();
            case 1696544128:
                if (!str.equals("TUX_easeInOutSine")) {
                    return null;
                }
                return C55953Lxd.LJI();
            case 2012213869:
                if (!str.equals("TUX_linear")) {
                    return null;
                }
                return new LinearInterpolator();
            case 2141713685:
                if (!str.equals("TUX_easeOutStandard")) {
                    return null;
                }
                return C55953Lxd.LJIIJ();
            default:
                return null;
        }
    }

    public static AnoleComponentAnimationModel LIZIZ(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AnoleComponentAnimationModel anoleComponentAnimationModel = (AnoleComponentAnimationModel) next;
            if (LIZLLL(anoleComponentAnimationModel) && (C78951Uyh.LIZ(anoleComponentAnimationModel.getType()) instanceof AbstractC78952Uyi)) {
                obj = next;
                break;
            }
        }
        return (AnoleComponentAnimationModel) obj;
    }

    public static boolean LIZJ(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        List<AnoleComponentAnimationModel> animations = appearModel.getAnimations();
        if (animations != null) {
            ArrayList arrayList = new ArrayList();
            for (AnoleComponentAnimationModel anoleComponentAnimationModel : animations) {
                if (LIZLLL(anoleComponentAnimationModel)) {
                    arrayList.add(anoleComponentAnimationModel);
                }
            }
            return !arrayList.isEmpty();
        }
        return false;
    }

    public static boolean LIZLLL(AnoleComponentAnimationModel animationModel) {
        o.LJIIIZ(animationModel, "animationModel");
        if (animationModel.getDuration() > 0) {
            return true;
        }
        return false;
    }

    public static List LJ(AbstractC78953Uyj abstractC78953Uyj, List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "animations");
        for (Object obj : list) {
            AnoleComponentAnimationModel anoleComponentAnimationModel = (AnoleComponentAnimationModel) obj;
            if (LIZLLL(anoleComponentAnimationModel) && o.LJ(C78951Uyh.LIZ(anoleComponentAnimationModel.getType()), abstractC78953Uyj)) {
                LJ.add(obj);
            }
        }
        return LJ;
    }
}
