package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _MockRequest_ProtoDecoder implements InterfaceC31105CIr<MockRequest> {
    @Override // X.InterfaceC31105CIr
    public final MockRequest LIZ(Q9H q9h) {
        MockRequest mockRequest = new MockRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    mockRequest.needGuideVideos = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return mockRequest;
            }
        }
    }
}
