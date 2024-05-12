package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LivePodcastRequest_ProtoDecoder implements InterfaceC31105CIr<LivePodcastRequest> {
    @Override // X.InterfaceC31105CIr
    public final LivePodcastRequest LIZ(Q9H q9h) {
        LivePodcastRequest livePodcastRequest = new LivePodcastRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return livePodcastRequest;
    }
}
