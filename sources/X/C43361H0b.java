package X;

import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.H0b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43361H0b implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ C43360H0a LIZ;

    public C43361H0b(C43360H0a c43360H0a) {
        this.LIZ = c43360H0a;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.LJIIJJI(t);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        if (videoCreation2 == null) {
            this.LIZ.LJIIJJI(new C41767GaJ(null, null, 3, null));
            return;
        }
        C67996QmO c67996QmO = this.LIZ.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LJ(new ERL(videoCreation2), false);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }
}
