package X;

import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;

/* renamed from: X.Gaa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C41784Gaa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EditPostPoiChangeType.values().length];
        try {
            iArr[EditPostPoiChangeType.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EditPostPoiChangeType.MODIFY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EditPostPoiChangeType.DELETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
