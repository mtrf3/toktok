package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: X.XTk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84892XTk {
    public static Integer LIZ;

    public static final String LIZ() {
        int i;
        String currentUploadFrameResult = AVExternalServiceImpl.LIZ().getCurrentUploadFrameResult();
        if (currentUploadFrameResult.length() > 0) {
            i = 2;
        } else {
            i = 3;
        }
        LIZ = i;
        return currentUploadFrameResult;
    }
}
