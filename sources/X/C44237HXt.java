package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.HXt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44237HXt {
    public final int LIZ;
    public final int LIZIZ;

    public C44237HXt(int i) {
        this(i, 0, 30);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StartRecordingCommandEvent{recordType=");
        return b0.LIZJ(LIZ, this.LIZ, '}', LIZ);
    }

    public C44237HXt(int i, int i2, int i3) {
        String recordLocation;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            recordLocation = "general";
        } else {
            recordLocation = null;
        }
        String countDownByHand = (i3 & 16) != 0 ? "" : null;
        o.LJIIIZ(recordLocation, "recordLocation");
        o.LJIIIZ(countDownByHand, "countDownByHand");
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
