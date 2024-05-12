package X;

import Y.ARunnableS45S0100000_9;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* renamed from: X.Lh5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54927Lh5 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ UrlModel LJLIL;
    public final /* synthetic */ VideoMusicCoverAssem LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ SmartImageView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54927Lh5(UrlModel urlModel, VideoMusicCoverAssem videoMusicCoverAssem, int i, int i2, C72434Sbm c72434Sbm) {
        super(0);
        this.LJLIL = urlModel;
        this.LJLILLLLZI = videoMusicCoverAssem;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = c72434Sbm;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ImageUrlModel LJ = C78939UyV.LJ(this.LJLIL);
        if (C2049682q.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLILLLLZI)).getAweme()) && LJ.LIZ()) {
            this.LJLILLLLZI.u4();
            VideoMusicCoverAssem videoMusicCoverAssem = this.LJLILLLLZI;
            C72434Sbm c72434Sbm = videoMusicCoverAssem.LLIIIJ;
            if (c72434Sbm != null) {
                c72434Sbm.post(new ARunnableS45S0100000_9(videoMusicCoverAssem, 139));
            }
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLILLLLZI)).getAweme();
            C54944LhM.LJ(aweme, ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLILLLLZI)).mEventType, C54944LhM.LIZLLL(aweme), false);
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(this.LJLIL));
        int i = this.LJLJI;
        int i2 = this.LJLJJI;
        LJII.LJII = i;
        LJII.LJIIIIZZ = i2;
        LJII.LJJIJIIJIL = true;
        LJII.LIZIZ("VideoMusicCoverAssem");
        LJII.LJJIIJ = this.LJLJJL;
        LJII.LJJIZ = new L5X(((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLILLLLZI)).getAweme(), ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLILLLLZI)).mEventType);
        C16880lQ.LLJJJ(LJII);
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
