package X;

import com.bytedance.ies.effectcreator.swig.EEPoint;
import com.bytedance.ies.effectcreator.swig.EEScale;
import com.bytedance.ies.effectcreator.swig.EESize;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.UIAnnotationAnchorType;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2DData;
import kotlin.jvm.internal.o;

/* renamed from: X.aga, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94412aga extends AbstractC94369aft {
    @Override // X.InterfaceC93980aZc
    public final void LIZ(boolean z) {
    }

    @Override // X.InterfaceC93980aZc
    public final C94362afm LJ() {
        int i;
        boolean z;
        Feature isTrackingSticker = this.LIZJ;
        o.LJIIIZ(isTrackingSticker, "$this$isTrackingSticker");
        FeatureType featureType = isTrackingSticker.getFeatureType();
        if (featureType == null || ((i = C93824aX6.LIZIZ[featureType.ordinal()]) != 1 && ((i != 2 && i != 3) || isTrackingSticker.get2DStickerAnchorType() == UIAnnotationAnchorType.UIAnnotationAnchorType_None))) {
            z = false;
        } else {
            z = true;
        }
        return new C94362afm(false, !z);
    }

    @Override // X.InterfaceC93980aZc
    public final C94363afn LJFF() {
        C94212adM LIZIZ;
        UIAnnotationTransform2D LJII = LJII();
        if (LJII != null) {
            UIAnnotationTransform2DData normalizationTransform2DDataPtr = LJII.getNormalizationTransform2DDataPtr();
            if (normalizationTransform2DDataPtr != null) {
                EESize size = normalizationTransform2DDataPtr.getSize();
                o.LJIIIIZZ(size, "transform2DData.size");
                double width = size.getWidth();
                EEScale scale = LJII.getScale();
                o.LJIIIIZZ(scale, "scale");
                double x = width * scale.getX();
                EESize size2 = normalizationTransform2DDataPtr.getSize();
                o.LJIIIIZZ(size2, "transform2DData.size");
                double height = size2.getHeight();
                EEScale scale2 = LJII.getScale();
                o.LJIIIIZZ(scale2, "scale");
                double y = scale2.getY() * height;
                EEPoint center = normalizationTransform2DDataPtr.getCenter();
                o.LJIIIIZZ(center, "transform2DData.center");
                double x2 = center.getX();
                EEPoint center2 = normalizationTransform2DDataPtr.getCenter();
                o.LJIIIIZZ(center2, "transform2DData.center");
                LIZIZ = C94002aZy.LIZ(new C94212adM(x, y, x2, center2.getY(), normalizationTransform2DDataPtr.getRotationAngle()));
            } else {
                LIZIZ = C94002aZy.LIZIZ();
            }
            return new C94363afn(C47261Igj.LJJIJ(LIZIZ), EnumC93697aV3.RECTANGLE);
        }
        return new C94363afn(C61878OQg.INSTANCE, EnumC93697aV3.EMPTY);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94412aga(Feature feature) {
        super(feature);
        o.LJIIIZ(feature, "feature");
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZIZ(float f) {
        UIAnnotationTransform2D LJII = LJII();
        if (LJII != null) {
            UIAnnotationTransform2DData normalizationTransform2DDataPtr = LJII.getNormalizationTransform2DDataPtr();
            o.LJIIIIZZ(normalizationTransform2DDataPtr, "normalizationTransform2DDataPtr");
            LJII.updateValue(normalizationTransform2DDataPtr.getRotationAngle() + f);
        }
        XKX.LIZLLL(this.LIZ, null, null, new C94731alj(null), 3);
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZLLL(float f, float f2) {
        UIAnnotationTransform2D LJII = LJII();
        if (LJII != null) {
            EESize eESize = new EESize();
            UIAnnotationTransform2DData normalizationTransform2DDataPtr = LJII.getNormalizationTransform2DDataPtr();
            o.LJIIIIZZ(normalizationTransform2DDataPtr, "normalizationTransform2DDataPtr");
            EESize size = normalizationTransform2DDataPtr.getSize();
            o.LJIIIIZZ(size, "normalizationTransform2DDataPtr.size");
            eESize.setWidth(size.getWidth() * f);
            UIAnnotationTransform2DData normalizationTransform2DDataPtr2 = LJII.getNormalizationTransform2DDataPtr();
            o.LJIIIIZZ(normalizationTransform2DDataPtr2, "normalizationTransform2DDataPtr");
            EESize size2 = normalizationTransform2DDataPtr2.getSize();
            o.LJIIIIZZ(size2, "normalizationTransform2DDataPtr.size");
            eESize.setHeight(size2.getHeight() * f2);
            LJII.updateValue(eESize);
        }
        XKX.LIZLLL(this.LIZ, null, null, new C94732alk(null), 3);
    }

    @Override // X.InterfaceC93980aZc
    public final void LIZJ(float f, float f2, boolean z) {
        UIAnnotationTransform2D LJII = LJII();
        if (LJII != null) {
            EEPoint eEPoint = new EEPoint();
            UIAnnotationTransform2DData normalizationTransform2DDataPtr = LJII.getNormalizationTransform2DDataPtr();
            o.LJIIIIZZ(normalizationTransform2DDataPtr, "normalizationTransform2DDataPtr");
            EEPoint center = normalizationTransform2DDataPtr.getCenter();
            o.LJIIIIZZ(center, "normalizationTransform2DDataPtr.center");
            eEPoint.setX(center.getX() + f);
            UIAnnotationTransform2DData normalizationTransform2DDataPtr2 = LJII.getNormalizationTransform2DDataPtr();
            o.LJIIIIZZ(normalizationTransform2DDataPtr2, "normalizationTransform2DDataPtr");
            EEPoint center2 = normalizationTransform2DDataPtr2.getCenter();
            o.LJIIIIZZ(center2, "normalizationTransform2DDataPtr.center");
            eEPoint.setY(center2.getY() + f2);
            LJII.updateValue(eEPoint);
        }
        XKX.LIZLLL(this.LIZ, null, null, new C94730ali(null), 3);
    }
}
