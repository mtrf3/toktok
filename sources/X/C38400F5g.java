package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.setting.services.StorageServiceImpl;

/* renamed from: X.F5g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38400F5g {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(long j) {
        int i;
        long LIZJ = C268513p.LIZJ(EF7.LIZIZ());
        long LIZ2 = StorageServiceImpl.LIZLLL().LIZ();
        if (j == 0 * 1048576 || j > 1 * 1048576) {
            i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        } else {
            i = 200;
        }
        if (LIZJ + LIZ2 <= i * 1048576) {
            return false;
        }
        return true;
    }
}
