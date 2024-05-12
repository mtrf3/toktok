package X;

import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Gzp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43349Gzp extends AbstractC43455H3r {
    public final VEWatermarkParam LJFF;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.COMPILE;
    }

    public AbstractC43349Gzp(VEWatermarkParam vEWatermarkParam) {
        this.LJFF = vEWatermarkParam;
    }

    @Override // X.AbstractC43455H3r
    public void LJI(ERR args, C67996QmO c67996QmO) {
        boolean z;
        o.LJIIIZ(args, "args");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("has watermark: ");
        if (this.LJFF != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        c67996QmO.LIZIZ(new C43393H1h("WaveCompile", X1D.LIZIZ(LIZ)), EnumC43531H6p.OUTER);
    }
}
