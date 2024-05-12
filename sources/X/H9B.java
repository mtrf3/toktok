package X;

import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;

/* loaded from: classes8.dex */
public /* synthetic */ class H9B {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ShootActionOrigin.values().length];
        try {
            iArr[ShootActionOrigin.CLICK_EFFECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShootActionOrigin.CLICK_HASHTAG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
