package X;

import kotlin.jvm.internal.AqS164S0100000_14;

/* loaded from: classes15.dex */
public final class WSU implements WSW {
    public final /* synthetic */ WST LIZ;

    public WSU(WST wst) {
        this.LIZ = wst;
    }

    @Override // X.WSW
    public final void LIZ(C124344uM[] c124344uMArr) {
        boolean z;
        WST wst = this.LIZ;
        if (c124344uMArr == null || c124344uMArr.length == 0) {
            z = false;
        } else {
            z = true;
        }
        wst.LIZIZ = z;
        if (System.currentTimeMillis() - wst.LJ < 1000) {
            return;
        }
        wst.LJ = System.currentTimeMillis();
        WST wst2 = this.LIZ;
        wst2.getClass();
        C6QQ.LIZ(new AqS164S0100000_14(wst2, 35));
    }
}
