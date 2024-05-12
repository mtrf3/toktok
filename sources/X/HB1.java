package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* loaded from: classes8.dex */
public final class HB1 implements InterfaceC43591H8x {
    public final /* synthetic */ ShortVideoContext LJLIL;

    public HB1(ShortVideoContext shortVideoContext) {
        this.LJLIL = shortVideoContext;
    }

    @Override // X.InterfaceC43591H8x
    public final void LIZIZ(HBR hbr, String str) {
        switch (HBQ.LIZ[hbr.ordinal()]) {
            case 1:
                this.LJLIL.extraSession.mainBusinessData = str;
                return;
            case 2:
                this.LJLIL.extraSession.socialData = str;
                return;
            case 3:
                this.LJLIL.extraSession.commerceData = str;
                return;
            case 4:
                this.LJLIL.extraSession.ugData = str;
                return;
            case 5:
                this.LJLIL.extraSession.techData = str;
                return;
            case 6:
                this.LJLIL.extraSession.globalData = str;
                return;
            default:
                return;
        }
    }
}
