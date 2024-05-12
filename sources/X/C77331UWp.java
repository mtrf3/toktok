package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.UWp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77331UWp implements InterfaceC61107NyZ {
    public final /* synthetic */ LocalMusicTabFragment LIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    public C77331UWp(LocalMusicTabFragment localMusicTabFragment) {
        this.LIZ = localMusicTabFragment;
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da[] results) {
        o.LJIIIZ(results, "results");
        C164906da c164906da = (C164906da) ORY.LJJJ(results);
        if (c164906da != null) {
            LocalMusicTabFragment localMusicTabFragment = this.LIZ;
            int i = C76865UEr.LIZ[c164906da.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 3) {
                    return;
                }
                localMusicTabFragment.Nl(localMusicTabFragment.getContext(), null);
                return;
            }
            C40211FqJ.LIZIZ(localMusicTabFragment.mo49getActivity());
        }
    }
}
