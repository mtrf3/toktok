package X;

import Y.IDgS349S0100000_9;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;

/* loaded from: classes10.dex */
public final /* synthetic */ class M81 extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public M81(MixVideosDialog mixVideosDialog) {
        super(0, mixVideosDialog, MixVideosDialog.class, "checkLoginAndToggleFavorite", "checkLoginAndToggleFavorite()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        MixVideosDialog mixVideosDialog = (MixVideosDialog) this.receiver;
        mixVideosDialog.getClass();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZJ(mixVideosDialog, "playlist", "playlist_panel", null, new IDgS349S0100000_9(mixVideosDialog, 13));
        } else {
            mixVideosDialog.Tk0();
        }
        return C76800UCe.LIZ;
    }
}
