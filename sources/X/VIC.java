package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VIC implements InterfaceC79769VSj {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ VIB LIZIZ;

    @Override // X.InterfaceC79769VSj
    public final void LIZ(int i) {
        ListProtector.set(this.LIZIZ.LIZLLL, this.LIZ, Integer.valueOf(i));
        new ArrayList(this.LIZIZ.LIZLLL);
        VID vid = this.LIZIZ.LJ;
        if (vid != null) {
            vid.LIZ(this.LIZ, Integer.valueOf(i));
        }
    }

    public VIC(VIB vib, int i) {
        this.LIZIZ = vib;
        this.LIZ = i;
    }
}
