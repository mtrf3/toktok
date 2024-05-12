package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;

/* renamed from: X.BDt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28429BDt {
    public final boolean LIZ;
    public final int LIZIZ;

    public final boolean LIZ() {
        if (!LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
            return this.LIZ;
        }
        return true;
    }

    public C28429BDt(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
