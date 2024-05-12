package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _MockResponse_ProtoDecoder implements InterfaceC31105CIr<MockResponse> {
    @Override // X.InterfaceC31105CIr
    public final MockResponse LIZ(Q9H q9h) {
        MockResponse mockResponse = new MockResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    mockResponse.data = _MockResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return mockResponse;
            }
        }
    }
}
