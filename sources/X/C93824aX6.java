package X;

import com.bytedance.ies.effectcreator.swig.AssetType;
import com.bytedance.ies.effectcreator.swig.FeatureType;

/* renamed from: X.aX6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final /* synthetic */ class C93824aX6 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[AssetType.values().length];
        LIZ = iArr;
        iArr[AssetType.AssetType_ImageTexture.ordinal()] = 1;
        iArr[AssetType.AssetType_AnimSeq.ordinal()] = 2;
        iArr[AssetType.AssetType_Gif.ordinal()] = 3;
        int[] iArr2 = new int[FeatureType.values().length];
        LIZIZ = iArr2;
        iArr2[FeatureType.FeatureType_Face3DSticker.ordinal()] = 1;
        iArr2[FeatureType.FeatureType_Foreground2D.ordinal()] = 2;
        iArr2[FeatureType.FeatureType_Background2D.ordinal()] = 3;
        EnumC93823aX5.values();
        EnumC93823aX5.Text.ordinal();
    }
}
