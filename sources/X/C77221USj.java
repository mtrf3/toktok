package X;

import kotlin.jvm.internal.o;

/* renamed from: X.USj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77221USj {
    public final EnumC77147UPn LIZ;

    public final UTI LIZ() {
        int i = C77232USu.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new C77219USh();
                    }
                    throw new Exception("no such relationAuthPlatform");
                }
                return new C77213USb();
            }
            return new C77220USi();
        }
        return new C77218USg();
    }

    public C77221USj(EnumC77147UPn platform) {
        o.LJIIIZ(platform, "platform");
        this.LIZ = platform;
    }
}
