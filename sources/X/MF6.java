package X;

import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;

/* loaded from: classes10.dex */
public final class MF6 implements InterfaceC73307Spr {
    public final /* synthetic */ AwemeListFragmentImpl LIZ;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        C223338pd c223338pd = this.LIZ.LLD;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            this.LIZ.LLD.setVisibility(8);
        }
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        C223338pd c223338pd = this.LIZ.LLD;
        if (c223338pd != null) {
            c223338pd.LIZIZ();
            this.LIZ.LLD.setVisibility(0);
        }
    }

    public MF6(AwemeListFragmentImpl awemeListFragmentImpl) {
        this.LIZ = awemeListFragmentImpl;
    }
}
