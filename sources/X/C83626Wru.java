package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wru, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83626Wru {
    public final C83622Wrq<?> LIZ;

    public C83626Wru(C83622Wrq<?> cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
    }

    public final AbstractC83672Wse LIZ(F9E f9e, String str) {
        switch (str.hashCode()) {
            case -1482757967:
                if (!str.equals("action_name_switch_wide_camera")) {
                    return null;
                }
                return new C81984WFo(this.LIZ);
            case -1393366345:
                if (!str.equals("action_name_close_camera") || !(f9e instanceof C83682Wso) || f9e == null) {
                    return null;
                }
                return new C83646WsE(this.LIZ, (C83682Wso) f9e);
            case -1231173743:
                if (!str.equals("action_name_switch_ar_mode") || !(f9e instanceof C81396Vx2) || f9e == null) {
                    return null;
                }
                return new C81429VxZ(this.LIZ, (C81396Vx2) f9e);
            case -1073201047:
                if (!str.equals("action_name_init_camera")) {
                    return null;
                }
                return new C83645WsD(this.LIZ);
            case -812395768:
                if (!str.equals("action_name_release_camera") || !(f9e instanceof C83683Wsp) || f9e == null) {
                    return null;
                }
                return new C83638Ws6(this.LIZ, (C83683Wsp) f9e);
            case -764891494:
                if (!str.equals("action_name_release_audio_capture")) {
                    return null;
                }
                return new C83657WsP(this.LIZ);
            case -410176117:
                if (!str.equals("action_name_stop_audio_capture")) {
                    return null;
                }
                return new WUH(this.LIZ);
            case 332989501:
                if (!str.equals("action_name_switch_shake_free_mode") || !(f9e instanceof VJ5) || f9e == null) {
                    return null;
                }
                return new C81430Vxa(this.LIZ, (VJ5) f9e);
            case 844351733:
                if (!str.equals("action_name_start_audio_capture") || !(f9e instanceof C46174IAg) || f9e == null) {
                    return null;
                }
                return new C83647WsF(this.LIZ, (C46174IAg) f9e);
            case 1077780470:
                if (!str.equals("action_name_stop_preview") || !(f9e instanceof C83684Wsq) || f9e == null) {
                    return null;
                }
                return new C83642WsA(this.LIZ, (C83684Wsq) f9e);
            case 1387725957:
                if (!str.equals("action_name_switch_camera") || !(f9e instanceof C83685Wsr) || f9e == null) {
                    return null;
                }
                return new C83641Ws9(this.LIZ, (C83685Wsr) f9e);
            case 1944166937:
                if (!str.equals("action_name_init_audio_capture") || !(f9e instanceof C83693Wsz) || f9e == null) {
                    return null;
                }
                return new C83658WsQ(this.LIZ, (C83693Wsz) f9e);
            case 2057931488:
                if (!str.equals("action_name_start_preview") || !(f9e instanceof C83678Wsk) || f9e == null) {
                    return null;
                }
                return new C83648WsG(this.LIZ, (C83678Wsk) f9e);
            default:
                return null;
        }
    }
}
