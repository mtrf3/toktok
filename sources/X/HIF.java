package X;

import com.ss.ugc.aweme.creation.base.TrackModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HIF extends AbstractC65781Prl implements InterfaceC88472Yns<TrackModel, C76800UCe> {
    public static final HIF LJLIL = new HIF();

    public HIF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(TrackModel trackModel) {
        TrackModel track = trackModel;
        o.LJIIIZ(track, "$this$track");
        track.setShootWay("share_to_story");
        return C76800UCe.LIZ;
    }
}
