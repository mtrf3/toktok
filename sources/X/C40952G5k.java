package X;

import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;

/* renamed from: X.G5k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C40952G5k {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AVPublishContentType.values().length];
        try {
            iArr[AVPublishContentType.Video.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AVPublishContentType.PhotoMovie.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
