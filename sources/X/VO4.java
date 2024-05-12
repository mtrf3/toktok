package X;

import com.lynx.jsbridge.LynxExposureModule;

/* loaded from: classes15.dex */
public final class VO4 extends VO1 {
    public final /* synthetic */ LynxExposureModule LJLILLLLZI;

    @Override // X.VO1
    public final void LIZ() {
        VOE voe = this.LJLILLLLZI.mLynxContext.LLFZ;
        if (voe != null) {
            voe.LJIIJJI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO4(LynxExposureModule lynxExposureModule, VNU vnu) {
        super(vnu);
        this.LJLILLLLZI = lynxExposureModule;
    }
}
