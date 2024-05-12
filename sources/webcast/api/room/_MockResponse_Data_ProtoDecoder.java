package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import webcast.api.room.MockResponse;

/* loaded from: classes6.dex */
public final class _MockResponse_Data_ProtoDecoder implements InterfaceC31105CIr<MockResponse.Data> {
    public static MockResponse.Data LIZIZ(Q9H q9h) {
        MockResponse.Data data = new MockResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            data.guideVideos = _MockResponse_GuideVideoURL_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        data.mockRoomId = q9h.LJIIJJI();
                    }
                } else {
                    data.room = _Room_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MockResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
