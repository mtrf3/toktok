package X;

import com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState;

/* renamed from: X.77B, reason: invalid class name */
/* loaded from: classes4.dex */
public /* synthetic */ class C77B {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InteractionBubbleCacheState.values().length];
        try {
            iArr[InteractionBubbleCacheState.NO_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InteractionBubbleCacheState.COMMENT_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InteractionBubbleCacheState.LIKE_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InteractionBubbleCacheState.ALL_CACHE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
