package X;

import com.bytedance.keva.KevaImpl;

/* renamed from: X.V1y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79082V1y {
    public static final int LIZ;
    public static final int LIZIZ;

    static {
        int i;
        int i2 = 2;
        if (KevaImpl.getRepoSync("lighten_alog_verbose", 1).getBoolean("is_enable_lighten_alog_verbose", false)) {
            i = 2;
        } else {
            i = 3;
        }
        LIZ = i;
        if (!KevaImpl.getRepoSync("lighten_alog_verbose", 1).getBoolean("is_enable_lighten_alog_verbose", false)) {
            i2 = 5;
        }
        LIZIZ = i2;
    }
}
