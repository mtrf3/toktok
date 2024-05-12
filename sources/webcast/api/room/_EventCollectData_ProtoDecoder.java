package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _EventCollectData_ProtoDecoder implements InterfaceC31105CIr<EventCollectData> {
    @Override // X.InterfaceC31105CIr
    public final EventCollectData LIZ(Q9H q9h) {
        EventCollectData eventCollectData = new EventCollectData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return eventCollectData;
    }
}
