package X;

import com.bytedance.ies.nle.editor_jni.KeyframeType;

/* renamed from: X.X6g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C84290X6g {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[KeyframeType.values().length];
        LIZ = iArr;
        iArr[KeyframeType.VideoKeyframe.ordinal()] = 1;
        iArr[KeyframeType.MaskKeyframe.ordinal()] = 2;
        iArr[KeyframeType.TextKeyframe.ordinal()] = 3;
        iArr[KeyframeType.StickerKeyframe.ordinal()] = 4;
        iArr[KeyframeType.FilterKeyframe.ordinal()] = 5;
        iArr[KeyframeType.ChromaKeyframe.ordinal()] = 6;
    }
}
