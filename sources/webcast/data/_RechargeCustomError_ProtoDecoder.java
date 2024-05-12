package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _RechargeCustomError_ProtoDecoder implements InterfaceC31105CIr<RechargeCustomError> {
    public static RechargeCustomError LIZIZ(Q9H q9h) {
        RechargeCustomError rechargeCustomError = new RechargeCustomError();
        rechargeCustomError.contentReplace = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rechargeCustomError.promptType = q9h.LJIIJ();
                        break;
                    case 2:
                        rechargeCustomError.toastContent = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        rechargeCustomError.popUpTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        rechargeCustomError.popUpContent = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        long LIZJ2 = q9h.LIZJ();
                        String str = null;
                        RechargePopUpContentReplace rechargePopUpContentReplace = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        rechargePopUpContentReplace = _RechargePopUpContentReplace_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (str != null) {
                                    if (rechargePopUpContentReplace != null) {
                                        rechargeCustomError.contentReplace.put(str, rechargePopUpContentReplace);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 6:
                        rechargeCustomError.popUpDismiss = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        rechargeCustomError.popUpDismissAction = q9h.LJIIJ();
                        break;
                    case 8:
                        rechargeCustomError.popUpPrimaryCta = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        rechargeCustomError.popUpPrimaryCtaSchema = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        rechargeCustomError.extra = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rechargeCustomError.popUpStyle = q9h.LJIIJ();
                        break;
                    case 12:
                        rechargeCustomError.linkToJump = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rechargeCustomError.popUpPrimaryAction = q9h.LJIIJ();
                        break;
                    case 14:
                        rechargeCustomError.penaltyWarningSkip = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        rechargeCustomError.errCode = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rechargeCustomError;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RechargeCustomError LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
