package X;

import com.bytedance.ies.effectcreator.swig.Asset;
import com.bytedance.ies.effectcreator.swig.AssetImageTexture;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EEScale;
import com.bytedance.ies.effectcreator.swig.EESize;
import com.bytedance.ies.effectcreator.swig.EEStdUIAnnotationBaseList;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.Project;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2DData;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS34S0300000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aXT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93847aXT {
    public static final /* synthetic */ int LIZ = 0;

    public static double LIZIZ(double d) {
        if (Math.abs(d) < 1.0E-5d) {
            return 1.0d;
        }
        if (Math.abs(d) >= 0.01d) {
            return d;
        }
        return 0.01d;
    }

    public static void LJ(Feature feature, Asset asset, boolean z) {
        EEStdUIAnnotationBaseList uiAnnotations = feature.getUiAnnotations();
        if (uiAnnotations != null) {
            Iterator<UIAnnotationBase> it = uiAnnotations.iterator();
            while (it.hasNext()) {
                UIAnnotationBase it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                if (it2.getUIType() == UIAnnotationUIType.UIAnnotationUIType_AssetTexture) {
                    C93744aVo.LIZ(new IDqS34S0300000_42(it2, asset, feature, 2));
                } else if (it2.getUIType() == UIAnnotationUIType.UIAnnotationUIType_Transform2D) {
                    FeatureType type = feature.getType();
                    o.LJIIIIZZ(type, "feature.type");
                    AssetImageTexture dynamicCast = AssetImageTexture.dynamicCast((Element) asset);
                    o.LJIIIIZZ(dynamicCast, "AssetImageTexture.dynamicCast(asset)");
                    UIAnnotationTransform2D dynamicCast2 = UIAnnotationTransform2D.dynamicCast((Element) it2);
                    o.LJIIIIZZ(dynamicCast2, "UIAnnotationTransform2D.dynamicCast(it)");
                    LIZ(type, dynamicCast, dynamicCast2, z);
                }
            }
        }
    }

    public static void LIZ(FeatureType featureType, AssetImageTexture assetImageTexture, UIAnnotationTransform2D uIAnnotationTransform2D, boolean z) {
        Project project;
        Canvas canvasPtr;
        EESize canvasSize;
        double d;
        double LIZIZ;
        try {
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null && (project = LJI.LIZJ) != null && (canvasPtr = project.getCanvasPtr()) != null && (canvasSize = canvasPtr.getCanvasSize()) != null) {
                double width = assetImageTexture.getWidth() / canvasSize.getWidth();
                double height = assetImageTexture.getHeight() / canvasSize.getHeight();
                double d2 = 1.0d;
                if (!z) {
                    UIAnnotationTransform2DData normalizationTransform2DDataPtr = uIAnnotationTransform2D.getNormalizationTransform2DDataPtr();
                    o.LJIIIIZZ(normalizationTransform2DDataPtr, "transform2D.normalizationTransform2DDataPtr");
                    EESize size = normalizationTransform2DDataPtr.getSize();
                    if (size != null) {
                        d = Math.max(size.getWidth() * canvasSize.getWidth(), size.getHeight() * canvasSize.getHeight()) / Math.max(assetImageTexture.getWidth(), assetImageTexture.getHeight());
                    } else {
                        return;
                    }
                } else if (featureType == FeatureType.FeatureType_Foreground2D) {
                    if (assetImageTexture.getWidth() > assetImageTexture.getHeight()) {
                        d = Math.min(0.6666666666666666d / width, 1.0d);
                    } else {
                        d = Math.min(0.3443526170798898d / height, 1.0d);
                    }
                } else if (featureType == FeatureType.FeatureType_Background2D) {
                    if (assetImageTexture.getWidth() > assetImageTexture.getHeight()) {
                        d = 1.0f / height;
                    } else {
                        d = 1.0f / width;
                    }
                } else {
                    d = 1.0d;
                }
                EESize eESize = new EESize();
                double d3 = width * d;
                if (!z) {
                    LIZIZ = 1.0d;
                } else {
                    EEScale scale = uIAnnotationTransform2D.getScale();
                    o.LJIIIIZZ(scale, "transform2D.scale");
                    LIZIZ = LIZIZ(scale.getX());
                }
                eESize.setWidth(d3 / LIZIZ);
                double d4 = height * d;
                if (z) {
                    EEScale scale2 = uIAnnotationTransform2D.getScale();
                    o.LJIIIIZZ(scale2, "transform2D.scale");
                    d2 = LIZIZ(scale2.getY());
                }
                eESize.setHeight(d4 / d2);
                uIAnnotationTransform2D.updateValue(eESize);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("adjustStickerVision: ");
            LIZ2.append(e.getMessage());
            C94034aaU.LIZJ("ObjectEffectHandler", X1D.LIZIZ(LIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.ies.effectcreator.swig.Asset LIZLLL(java.lang.String r7, java.lang.String r8, X.EnumC93823aX5 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93847aXT.LIZLLL(java.lang.String, java.lang.String, X.aX5, java.lang.Object):com.bytedance.ies.effectcreator.swig.Asset");
    }

    public static void LIZJ(long j, String str, String value, EnumC93823aX5 enumC93823aX5, Object obj) {
        Feature LJFF;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("inner replace res path:");
        LIZ2.append(str);
        C94034aaU.LIZ("ObjectEffectHandler", X1D.LIZIZ(LIZ2));
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJFF = LJI.LJFF(j)) != null) {
            o.LJIIIZ(value, "value");
            LJFF.setExtraInfo("cke_effect_asset_identity", value);
            Asset LIZLLL = LIZLLL(str, value, enumC93823aX5, obj);
            if (LIZLLL != null) {
                LJ(LJFF, LIZLLL, false);
                LJFF.setIconPath(LIZLLL.getAbsoluteCoverImgPath());
                C93829aXB LJI2 = CKEffectEditorContext.LJI();
                if (LJI2 != null) {
                    LJI2.LIZIZ();
                }
            }
        }
    }
}
