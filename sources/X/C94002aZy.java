package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.EEScale;
import com.bytedance.ies.effectcreator.swig.EESize;
import com.bytedance.ies.effectcreator.swig.UIAnnotationScriptTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2DData;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3DData;
import kotlin.jvm.internal.o;

/* renamed from: X.aZy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94002aZy {
    public static final C94212adM LIZIZ() {
        return new C94212adM(1.0d, 1.0d, 0.5d, 0.5d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
    }

    public static final C94212adM LIZ(C94212adM c94212adM) {
        double d = c94212adM.LJLIL;
        if (d < Double.MIN_VALUE) {
            d = Double.MIN_VALUE;
        }
        double d2 = c94212adM.LJLILLLLZI;
        if (d2 < Double.MIN_VALUE) {
            d2 = Double.MIN_VALUE;
        }
        return new C94212adM(d, d2, c94212adM.LJLJI, c94212adM.LJLJJI, c94212adM.LJLJJL);
    }

    public static final C94212adM LJ(UIAnnotationTransform3D uIAnnotationTransform3D) {
        UIAnnotationTransform3DData normalizationTransform3DDataPtr = uIAnnotationTransform3D.getNormalizationTransform3DDataPtr();
        if (normalizationTransform3DDataPtr != null) {
            EESize size = normalizationTransform3DDataPtr.getSize();
            o.LJIIIIZZ(size, "transform3DData.size");
            double width = size.getWidth();
            EEScale scale = uIAnnotationTransform3D.getScale();
            o.LJIIIIZZ(scale, "scale");
            double x = width * scale.getX();
            EESize size2 = normalizationTransform3DDataPtr.getSize();
            o.LJIIIIZZ(size2, "transform3DData.size");
            double height = size2.getHeight();
            EEScale scale2 = uIAnnotationTransform3D.getScale();
            o.LJIIIIZZ(scale2, "scale");
            double y = scale2.getY() * height;
            EEPoint center = normalizationTransform3DDataPtr.getCenter();
            o.LJIIIIZZ(center, "transform3DData.center");
            double x2 = center.getX();
            EEPoint center2 = normalizationTransform3DDataPtr.getCenter();
            o.LJIIIIZZ(center2, "transform3DData.center");
            return LIZ(new C94212adM(x, y, x2, center2.getY(), normalizationTransform3DDataPtr.getRotationAngle()));
        }
        return LIZIZ();
    }

    public static final C94211adL LIZJ(C94212adM toMaterialRect, View view) {
        o.LJIIIZ(toMaterialRect, "$this$toMaterialRect");
        C94211adL c94211adL = new C94211adL((float) (toMaterialRect.LJLIL * view.getWidth()), (float) (toMaterialRect.LJLILLLLZI * view.getHeight()), (float) (toMaterialRect.LJLJI * view.getWidth()), (float) (toMaterialRect.LJLJJI * view.getHeight()), (float) toMaterialRect.LJLJJL);
        float f = c94211adL.LJLIL;
        if (f < 1.0f) {
            f = 1.0f;
        }
        float f2 = c94211adL.LJLILLLLZI;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return C94211adL.L(c94211adL, f, f2, 0.0f, 0.0f, 0.0f, 28);
    }

    public static final C94212adM LIZLLL(UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        if (uIAnnotationTransform2DData != null || (uIAnnotationTransform2DData = uIAnnotationScriptTransform2D.getNormalizationTransform2DUIDataPtr()) != null) {
            EESize size = uIAnnotationTransform2DData.getSize();
            o.LJIIIIZZ(size, "transform2DData.size");
            double width = size.getWidth();
            EEScale scale = uIAnnotationScriptTransform2D.getScale();
            o.LJIIIIZZ(scale, "scale");
            double x = width * scale.getX();
            EESize size2 = uIAnnotationTransform2DData.getSize();
            o.LJIIIIZZ(size2, "transform2DData.size");
            double height = size2.getHeight();
            EEScale scale2 = uIAnnotationScriptTransform2D.getScale();
            o.LJIIIIZZ(scale2, "scale");
            double y = scale2.getY() * height;
            EEPoint center = uIAnnotationTransform2DData.getCenter();
            o.LJIIIIZZ(center, "transform2DData.center");
            double x2 = center.getX();
            EEPoint center2 = uIAnnotationTransform2DData.getCenter();
            o.LJIIIIZZ(center2, "transform2DData.center");
            return LIZ(new C94212adM(x, y, x2, center2.getY(), uIAnnotationTransform2DData.getRotationAngle()));
        }
        return LIZIZ();
    }
}
