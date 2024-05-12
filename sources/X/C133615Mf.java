package X;

import com.ss.android.vesdk.VEEditor;

/* renamed from: X.5Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C133615Mf {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VEEditor.SEEK_MODE.values().length];
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
