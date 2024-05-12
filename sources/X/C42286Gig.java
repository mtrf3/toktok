package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;

/* renamed from: X.Gig, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C42286Gig {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CreativeLoadingDialogBuilder.CancelType.values().length];
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.GONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_15S.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
