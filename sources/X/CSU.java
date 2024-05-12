package X;

import com.bytedance.android.live.pin.PinMessageViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CSU implements InterfaceC31364CSq<CSV> {
    public final /* synthetic */ PinMessageViewModel LIZ;

    public CSU(PinMessageViewModel pinMessageViewModel) {
        this.LIZ = pinMessageViewModel;
    }

    @Override // X.InterfaceC31364CSq
    public final void LIZ(CSV csv) {
        CSV t = csv;
        o.LJIIIZ(t, "t");
        this.LIZ.jv0(t.LIZ, t.LIZJ);
    }

    @Override // X.InterfaceC31364CSq
    public final void LIZIZ(CSV csv) {
        CSV t = csv;
        o.LJIIIZ(t, "t");
        CSH<? extends CRD> csh = t.LIZ;
        csh.getClass();
        if (!(csh instanceof CTR)) {
            this.LIZ.jv0(t.LIZ, t.LIZJ);
        }
    }

    @Override // X.InterfaceC31364CSq
    public final void LIZJ(CSV csv, Throwable e) {
        CSV t = csv;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(e, "e");
        CSH<? extends CRD> csh = t.LIZ;
        csh.getClass();
        if (!(csh instanceof CTR)) {
            this.LIZ.jv0(t.LIZ, t.LIZJ);
        }
    }
}
