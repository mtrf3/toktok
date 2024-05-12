package X;

import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;

/* renamed from: X.Gil, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C42291Gil {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AVPublishExtensionVisible.values().length];
        try {
            iArr[AVPublishExtensionVisible.VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AVPublishExtensionVisible.GRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AVPublishExtensionVisible.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
