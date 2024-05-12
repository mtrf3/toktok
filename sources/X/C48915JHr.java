package X;

import Y.ARunnableS44S0100000_8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* renamed from: X.JHr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48915JHr extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ KMZ LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48915JHr(KMZ kmz, boolean z, int i) {
        super(0);
        this.LJLIL = kmz;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i;
        Video video;
        C48679J8p mVideoControl = this.LJLIL.getMVideoControl();
        if (mVideoControl != null) {
            int i2 = this.LJLJI;
            KMZ kmz = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            float f = i2;
            Aweme aweme = kmz.LJLJJI;
            if (aweme != null && (video = aweme.getVideo()) != null) {
                i = video.getDuration();
            } else {
                i = 100;
            }
            float f2 = (f / i) * 100;
            InterfaceC46330IGg interfaceC46330IGg = mVideoControl.LIZIZ;
            if (interfaceC46330IGg != null) {
                interfaceC46330IGg.LJI(f2);
            }
            kmz.LJIIL("onSeeked", C113554cx.LJJJLZIJ(new OSZ("progress", Integer.valueOf(i2))));
            if (!z) {
                kmz.postDelayed(new ARunnableS44S0100000_8(mVideoControl, 20), 500L);
            }
        }
        this.LJLIL.LLFII = true ^ this.LJLILLLLZI;
        return C76800UCe.LIZ;
    }
}
