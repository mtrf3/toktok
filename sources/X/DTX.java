package X;

import java.io.Serializable;

/* loaded from: classes7.dex */
public final class DTX implements Serializable {
    public double duration;
    public double preloadSize;
    public boolean shift;
    public double speed;
    public int type;
    public double videoSize;

    public DTX(double d, double d2, double d3, double d4, boolean z, int i) {
        this.preloadSize = d;
        this.videoSize = d2;
        this.duration = d3;
        this.speed = d4;
        this.shift = z;
        this.type = i;
    }
}
