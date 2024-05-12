package X;

import android.text.TextUtils;
import com.bytedance.ies.effectcreator.swig.AssetImageTexture;
import com.bytedance.ies.effectcreator.swig.AssetType;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationAssetTexture;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.o;

/* renamed from: X.aX7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93825aX7 {
    public static final long LIZ(Feature ckeId) {
        o.LJIIIZ(ckeId, "$this$ckeId");
        return ckeId.id().objectId();
    }

    public static final String LIZIZ(Feature feature) {
        String extraInfo = feature.getExtraInfo("cke_effect_asset_identity");
        if (extraInfo != null) {
            return extraInfo;
        }
        return "";
    }

    public static final UIAnnotationAssetTexture LIZJ(Feature getAssetTexture) {
        o.LJIIIZ(getAssetTexture, "$this$getAssetTexture");
        return UIAnnotationAssetTexture.dynamicCast((Element) getAssetTexture.getUiAnnotationAccordingUIType(UIAnnotationUIType.UIAnnotationUIType_AssetTexture));
    }

    public static final EnumC93823aX5 LIZLLL(AssetImageTexture assetImageTexture) {
        String extraInfo = assetImageTexture.getExtraInfo("asset_image_texture_type");
        if (extraInfo == null || extraInfo.length() == 0 || !TextUtils.isDigitsOnly(extraInfo)) {
            return EnumC93823aX5.UnKnow;
        }
        C93822aX4 c93822aX4 = EnumC93823aX5.Companion;
        int parseInt = CastIntegerProtector.parseInt(extraInfo);
        c93822aX4.getClass();
        return C93822aX4.LIZ(parseInt);
    }

    public static final EnumC93823aX5 LJ(Feature ckeAssetType) {
        UIAnnotationAssetTexture LIZLLL;
        AssetImageTexture assetTexture;
        o.LJIIIZ(ckeAssetType, "$this$ckeAssetType");
        if (CKEffectEditorContext.LJI() == null || (LIZLLL = C93829aXB.LIZLLL(ckeAssetType)) == null || (assetTexture = LIZLLL.getAssetTexture()) == null) {
            String extraInfo = ckeAssetType.getExtraInfo("feature_asset_type");
            if (extraInfo != null && extraInfo.length() != 0 && TextUtils.isDigitsOnly(extraInfo)) {
                C93822aX4 c93822aX4 = EnumC93823aX5.Companion;
                int parseInt = CastIntegerProtector.parseInt(extraInfo);
                c93822aX4.getClass();
                return C93822aX4.LIZ(parseInt);
            }
        } else {
            EnumC93823aX5 LIZLLL2 = LIZLLL(assetTexture);
            if (LIZLLL2 != null) {
                return LIZLLL2;
            }
        }
        return EnumC93823aX5.UnKnow;
    }

    public static final String LJFF(Feature effectIdentity) {
        o.LJIIIZ(effectIdentity, "$this$effectIdentity");
        String extraInfo = effectIdentity.getExtraInfo("cke_effect_identity");
        o.LJIIIIZZ(extraInfo, "getExtraInfo(CKE_EFFECT_IDENTITY)");
        return extraInfo;
    }

    public static final String LJI(Feature textExtra) {
        UIAnnotationAssetTexture LIZLLL;
        AssetImageTexture assetTexture;
        String extraInfo;
        o.LJIIIZ(textExtra, "$this$textExtra");
        if (CKEffectEditorContext.LJI() != null && (LIZLLL = C93829aXB.LIZLLL(textExtra)) != null && (assetTexture = LIZLLL.getAssetTexture()) != null && (extraInfo = assetTexture.getExtraInfo("cke_effect_text_extra")) != null) {
            return extraInfo;
        }
        return "";
    }

    public static final String LJII(Feature feature) {
        UIAnnotationAssetTexture LIZLLL;
        AssetImageTexture assetTexture;
        AssetType assetType;
        if (o.LJ(feature.getSecondPanelType(), "texture_select_panel") && CKEffectEditorContext.LJI() != null && (LIZLLL = C93829aXB.LIZLLL(feature)) != null && (assetTexture = LIZLLL.getAssetTexture()) != null && (assetType = assetTexture.getAssetType()) != null) {
            int i = C93824aX6.LIZ[assetType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "gif";
                    }
                } else {
                    return "sequence";
                }
            } else {
                if (LIZLLL(assetTexture) == EnumC93823aX5.Text) {
                    return "text";
                }
                return "image";
            }
        }
        return "";
    }
}
