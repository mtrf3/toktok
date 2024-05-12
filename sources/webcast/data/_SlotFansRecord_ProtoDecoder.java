package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SlotFansRecord_ProtoDecoder implements InterfaceC31105CIr<SlotFansRecord> {
    public static SlotFansRecord LIZIZ(Q9H q9h) {
        SlotFansRecord slotFansRecord = new SlotFansRecord();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    slotFansRecord.activeFans = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                slotFansRecord.newFans = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            slotFansRecord.duration = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        slotFansRecord.endTimeMs = Q9J.LIZIZ(q9h);
                    }
                } else {
                    slotFansRecord.startTimeMs = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return slotFansRecord;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SlotFansRecord LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
