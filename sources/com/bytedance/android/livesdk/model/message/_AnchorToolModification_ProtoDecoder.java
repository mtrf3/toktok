package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _AnchorToolModification_ProtoDecoder implements InterfaceC31105CIr<AnchorToolModification> {
    public static AnchorToolModification LIZIZ(Q9H q9h) {
        AnchorToolModification anchorToolModification = new AnchorToolModification();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorToolModification.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        anchorToolModification.userId = q9h.LJIIJJI();
                        break;
                    case 3:
                        anchorToolModification.effectId = q9h.LJIIJJI();
                        break;
                    case 4:
                        anchorToolModification.name = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        anchorToolModification.resourceId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        anchorToolModification.modificationType = q9h.LJIIJ();
                        break;
                    case 7:
                        anchorToolModification.role = q9h.LJIIJJI();
                        break;
                    case 8:
                        anchorToolModification.msgType = q9h.LJIIJ();
                        break;
                    case 9:
                        anchorToolModification.subType = q9h.LJIIJJI();
                        break;
                    case 10:
                        anchorToolModification.startTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        anchorToolModification.endTime = q9h.LJIIJJI();
                        break;
                    case 12:
                        anchorToolModification.duration = q9h.LJIIJJI();
                        break;
                    default:
                        switch (LJI) {
                            case 21:
                                anchorToolModification.tab = Q9J.LIZIZ(q9h);
                                break;
                            case 22:
                                anchorToolModification.mode = q9h.LJIIJJI();
                                break;
                            case 23:
                                anchorToolModification.from = q9h.LJIIJJI();
                                break;
                            case 24:
                                anchorToolModification.value = Double.longBitsToDouble(q9h.LJIIIZ());
                                break;
                            case 25:
                                anchorToolModification.url = Q9J.LIZIZ(q9h);
                                break;
                            case 26:
                                anchorToolModification.scene = Q9J.LIZIZ(q9h);
                                break;
                            case 27:
                                anchorToolModification.status = q9h.LJIIJJI();
                                break;
                            case 28:
                                anchorToolModification.content = Q9J.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorToolModification;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorToolModification LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
