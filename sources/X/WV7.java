package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WV7 implements WVC {
    public final /* synthetic */ C82374WUo LIZ;

    public WV7(C82374WUo c82374WUo) {
        this.LIZ = c82374WUo;
    }

    @Override // X.WVC
    public final void LIZ(float f) {
        WV6 wv6 = this.LIZ.LLI;
        if (wv6 != null) {
            wv6.setCircleRadius(f);
        } else {
            o.LJIJI("progressSegmentView");
            throw null;
        }
    }
}
