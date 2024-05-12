package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* loaded from: classes8.dex */
public final class HB0 implements InterfaceC43592H8y {
    public final /* synthetic */ ShortVideoContext LJLIL;

    public HB0(ShortVideoContext shortVideoContext) {
        this.LJLIL = shortVideoContext;
    }

    @Override // X.InterfaceC43592H8y
    public final String LIZIZ(HBR hbr) {
        switch (HBQ.LIZ[hbr.ordinal()]) {
            case 1:
                return this.LJLIL.extraSession.mainBusinessData;
            case 2:
                return this.LJLIL.extraSession.socialData;
            case 3:
                return this.LJLIL.extraSession.commerceData;
            case 4:
                return this.LJLIL.extraSession.ugData;
            case 5:
                return this.LJLIL.extraSession.techData;
            case 6:
                return this.LJLIL.extraSession.globalData;
            default:
                return null;
        }
    }
}
