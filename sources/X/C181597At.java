package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;

/* renamed from: X.7At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public /* synthetic */ class C181597At {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[UpvoteCacheState.values().length];
        try {
            iArr[UpvoteCacheState.PRE_PUBLISH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpvoteCacheState.PUBLISH_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
