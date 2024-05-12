package X;

import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;

/* renamed from: X.4LD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LD {
    public static ShareService LIZ;
    public static ShareExtService LIZIZ;

    static {
        if (LIZ == null) {
            LIZ = ShareServiceImpl.LJJJLZIJ();
        }
        if (LIZIZ == null) {
            LIZIZ = ShareExtServiceImpl.LJJLIIJ();
        }
    }

    public static ShareService LIZ() {
        return LIZ;
    }
}
