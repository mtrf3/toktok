package X;

import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment;

/* renamed from: X.Xa0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85064Xa0 extends AbstractC008101l {
    public final /* synthetic */ FullEpisodeDetailFragment LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        this.LIZJ.Jl();
        this.LIZJ.Hl().stopPlayer(new C84735XNj("STOP_FROM_MAIN_PLAYER"));
        ActivityC45651qj mo49getActivity = this.LIZJ.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85064Xa0(FullEpisodeDetailFragment fullEpisodeDetailFragment) {
        super(true);
        this.LIZJ = fullEpisodeDetailFragment;
    }
}
