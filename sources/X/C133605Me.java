package X;

import com.ss.android.vesdk.VEEditor;

/* renamed from: X.5Me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C133605Me {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[VEEditor.SEEK_MODE.values().length];
        LIZ = iArr;
        iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing.ordinal()] = 1;
        iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.ordinal()] = 2;
        iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn.ordinal()] = 3;
        iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut.ordinal()] = 4;
        iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut.ordinal()] = 5;
        int[] iArr2 = new int[VEEditor.SET_RANGE_MODE.values().length];
        LIZIZ = iArr2;
        iArr2[VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED.ordinal()] = 1;
        iArr2[VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED.ordinal()] = 2;
    }
}
