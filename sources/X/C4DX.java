package X;

import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;

/* renamed from: X.4DX, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C4DX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[NaviStatusCode.values().length];
        try {
            iArr[NaviStatusCode.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NaviStatusCode.INVALID_INPUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NaviStatusCode.INTERNAL_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NaviStatusCode.NEW_USER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
