package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hr1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45351Hr1 {
    public final float LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public C45351Hr1(boolean z, boolean z2) {
        if (z) {
            this.LIZ += EnumC45352Hr2.VIDEO_DOWNLOAD_TYPE.getWeight();
        }
        if (z2) {
            this.LIZ += EnumC45352Hr2.VIDEO_WATER_TYPE.getWeight();
        }
    }

    public final int LIZ(EnumC45352Hr2 videoProcess, int i) {
        o.LJIIIZ(videoProcess, "videoProcess");
        int i2 = C45353Hr3.LIZ[videoProcess.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.LIZJ = true;
            }
        } else {
            this.LIZIZ = true;
        }
        float weight = (videoProcess.getWeight() / this.LIZ) * i;
        int i3 = 0;
        if (videoProcess != EnumC45352Hr2.VIDEO_DOWNLOAD_TYPE && this.LIZIZ) {
            i3 = 0 + ((int) ((r1.getWeight() / this.LIZ) * 100));
        }
        if (videoProcess != EnumC45352Hr2.VIDEO_WATER_TYPE && this.LIZJ) {
            i3 += (int) ((r1.getWeight() / this.LIZ) * 100);
        }
        return (int) (weight + i3);
    }
}
