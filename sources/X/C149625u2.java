package X;

import com.ss.android.ugc.aweme.music.model.SeparateStatus;

/* renamed from: X.5u2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C149625u2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SeparateStatus.values().length];
        try {
            iArr[SeparateStatus.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SeparateStatus.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SeparateStatus.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SeparateStatus.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
