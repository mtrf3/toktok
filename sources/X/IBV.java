package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* loaded from: classes8.dex */
public final class IBV implements InterfaceC83514Wq6 {
    public final /* synthetic */ C46193IAz LIZ;

    @Override // X.InterfaceC83514Wq6
    public final void LIZIZ() {
        C46193IAz c46193IAz = this.LIZ;
        c46193IAz.LLIIJLIL.pic2VideoSource = 0;
        c46193IAz.LLJILJILJ = 0;
    }

    public IBV(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.InterfaceC83514Wq6
    public final void LIZ(boolean z) {
        int i;
        ShortVideoContext shortVideoContext = this.LIZ.LLIIJLIL;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        shortVideoContext.pic2VideoSource = i;
    }
}
