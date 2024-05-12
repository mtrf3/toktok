package X;

/* loaded from: classes16.dex */
public final class YLI {
    public final YLK LIZ;

    public YLI(YLK ylk) {
        this.LIZ = ylk;
    }

    public void onEvent(YLM ylm) {
        if (ylm != null) {
            int i = ylm.LIZ;
            YLH ylh = ylm.LIZIZ;
            switch (i) {
                case 201:
                    float f = ylh.LIZIZ;
                    float f2 = ylh.LIZJ;
                    int i2 = ylh.LIZ;
                    YLK ylk = this.LIZ;
                    if (ylk == null) {
                        return;
                    }
                    ylk.processTouchDownEvent(f, f2, i2);
                    return;
                case 202:
                    float f3 = ylh.LIZIZ;
                    float f4 = ylh.LIZJ;
                    int i3 = ylh.LIZ;
                    YLK ylk2 = this.LIZ;
                    if (ylk2 == null) {
                        return;
                    }
                    ylk2.processTouchUpEvent(f3, f4, i3);
                    return;
                case 203:
                    float f5 = ylh.LIZIZ;
                    float f6 = ylh.LIZJ;
                    float f7 = ylh.LIZLLL;
                    float f8 = ylh.LJ;
                    float f9 = ylh.LJFF;
                    YLK ylk3 = this.LIZ;
                    if (ylk3 == null) {
                        return;
                    }
                    ylk3.processPanEvent(f5, f6, f7, f8, f9);
                    return;
                case 204:
                    float f10 = ylh.LIZIZ;
                    float f11 = ylh.LIZJ;
                    YLK ylk4 = this.LIZ;
                    if (ylk4 == null) {
                        return;
                    }
                    ylk4.processLongPressEvent(f10, f11);
                    return;
                case 205:
                    float f12 = ylh.LJI;
                    float f13 = ylh.LJFF;
                    YLK ylk5 = this.LIZ;
                    if (ylk5 == null) {
                        return;
                    }
                    ylk5.processScaleEvent(f12, f13);
                    return;
                case 206:
                    float f14 = ylh.LIZIZ;
                    float f15 = ylh.LIZJ;
                    YLK ylk6 = this.LIZ;
                    if (ylk6 == null) {
                        return;
                    }
                    ylk6.processTouchEvent(f14, f15);
                    return;
                case 207:
                    long j = ylh.LJIIIIZZ;
                    float f16 = ylh.LIZIZ;
                    float f17 = ylh.LIZJ;
                    float f18 = ylh.LJIIIZ;
                    float f19 = ylh.LJIIJ;
                    int i4 = ylh.LJIIJJI;
                    int i5 = ylh.LJIIL;
                    YLK ylk7 = this.LIZ;
                    if (ylk7 == null) {
                        return;
                    }
                    ylk7.processTouchEventWithTouchType(j, f16, f17, f18, f19, i4, i5);
                    return;
                case 208:
                    float f20 = ylh.LJII;
                    float f21 = ylh.LJFF;
                    YLK ylk8 = this.LIZ;
                    if (ylk8 == null) {
                        return;
                    }
                    ylk8.processRotationEvent(f20, f21);
                    return;
                default:
                    return;
            }
        }
    }
}
