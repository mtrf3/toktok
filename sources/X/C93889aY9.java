package X;

import com.bytedance.ies.effectcreator.swig.FeatureType;

/* renamed from: X.aY9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final /* synthetic */ class C93889aY9 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[FeatureType.values().length];
        LIZ = iArr;
        FeatureType featureType = FeatureType.FeatureType_Face3DSticker;
        iArr[featureType.ordinal()] = 1;
        int[] iArr2 = new int[FeatureType.values().length];
        LIZIZ = iArr2;
        iArr2[FeatureType.FeatureType_Background2D.ordinal()] = 1;
        iArr2[FeatureType.FeatureType_Foreground2D.ordinal()] = 2;
        iArr2[FeatureType.FeatureType_FaceInset.ordinal()] = 3;
        iArr2[FeatureType.FeatureType_Filter.ordinal()] = 4;
        iArr2[FeatureType.FeatureType_FaceDistortion.ordinal()] = 5;
        iArr2[FeatureType.FeatureType_FaceLiquify.ordinal()] = 6;
        iArr2[FeatureType.FeatureType_Body.ordinal()] = 7;
        iArr2[FeatureType.FeatureType_HairColor.ordinal()] = 8;
        iArr2[FeatureType.FeatureType_Makeup.ordinal()] = 9;
        iArr2[FeatureType.FeatureType_Gan.ordinal()] = 10;
        iArr2[featureType.ordinal()] = 11;
        iArr2[FeatureType.FeatureType_Unknown.ordinal()] = 12;
        iArr2[FeatureType.FeatureType_PostProcess.ordinal()] = 13;
        iArr2[FeatureType.FeatureType_LegacyFeature.ordinal()] = 14;
    }
}
