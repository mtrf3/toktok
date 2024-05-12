package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _TimeStruct_ProtoDecoder implements InterfaceC31105CIr<TimeStruct> {
    @Override // X.InterfaceC31105CIr
    public final TimeStruct LIZ(Q9H q9h) {
        TimeStruct timeStruct = new TimeStruct();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            timeStruct.strTime = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        timeStruct.timezone = Q9J.LIZIZ(q9h);
                    }
                } else {
                    timeStruct.timestamp = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return timeStruct;
            }
        }
    }
}
