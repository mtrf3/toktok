package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.WsJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83651WsJ {
    public static InterfaceC158836Lf LIZ;
    public static final C83651WsJ LIZIZ = new C83651WsJ();

    public static final Cert LIZJ(InterfaceC83722WtS interfaceC83722WtS, InterfaceC158846Lg interfaceC158846Lg) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CertService: getDefaultCert: point: ");
        LIZ2.append(interfaceC83722WtS);
        LIZ2.append(" scene: ");
        LIZ2.append(interfaceC158846Lg);
        LIZ2.append(' ');
        LIZ2.append(new Throwable());
        LIZLLL.w(X1D.LIZIZ(LIZ2));
        return C78857UxB.LJJIIJ(0, "");
    }

    public final C78862UxG LIZ(InterfaceC83713WtJ avStartPoint, InterfaceC158836Lf interfaceC158836Lf) {
        Object LIZJ;
        o.LJIIIZ(avStartPoint, "avStartPoint");
        if (interfaceC158836Lf == null) {
            interfaceC158836Lf = LIZ;
        }
        if (interfaceC158836Lf == null) {
            return (C78862UxG) LIZJ(avStartPoint, null);
        }
        if (interfaceC158836Lf == HX4.SHOOT) {
            if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1692");
            } else if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1693");
            } else if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_START) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1695");
            } else if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1696");
            } else if (avStartPoint == EnumC83653WsL.FTC_OPEN_CAMERA_ENTER_PAGE) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1699");
            } else if (avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1726");
            } else if (avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1747");
            } else if (avStartPoint == EnumC83653WsL.SWITCH_CAMERA_TOOL_BAR) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1748");
            } else if (avStartPoint == EnumC83653WsL.AUDIO_START_RECORD_DEFAULT_WITH_AUDIO) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1816");
            } else if (avStartPoint == EnumC83653WsL.AUDIO_START_RECORD_DEFAULT_NOT_AUDIO) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1817");
            } else if (avStartPoint == EnumC83653WsL.AUDIO_START_RECORD_USE_EFFECT) {
                LIZJ = C78857UxB.LJJIIJ(1476788229, "bpea-1820");
            } else {
                LIZJ = (C78862UxG) LIZJ(avStartPoint, null);
            }
        } else if (interfaceC158836Lf == HX4.TTEP_PREVIEW) {
            if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE) {
                LIZJ = C78857UxB.LJJIIJ(1476788230, "bpea-131");
            } else if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_START || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                LIZJ = C78857UxB.LJJIIJ(1476788230, "bpea-ttep_preview_enter_shoot");
            } else if (avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW || avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP || avStartPoint == EnumC83653WsL.SWITCH_CAMERA_TOOL_BAR) {
                LIZJ = C78857UxB.LJJIIJ(1476788230, "bpea-ttep_preview_shoot_switch_camera_front_rear");
            } else if (avStartPoint == EnumC83653WsL.AUDIO_START_RECORD_USE_EFFECT) {
                LIZJ = C78857UxB.LJJIIJ(1476788230, "bpea-ttep_preview_audio_record_by_prop");
            } else {
                LIZJ = (C78862UxG) LIZJ(avStartPoint, null);
            }
        } else if (interfaceC158836Lf == HX4.DUET) {
            if (avStartPoint == EnumC83653WsL.AUDIO_START_DUET) {
                LIZJ = C78857UxB.LJJIIJ(1476788236, "bpea-1828");
            } else if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_START || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                LIZJ = C78857UxB.LJJIIJ(1476788236, "bpea-duet_enter_shoot");
            } else if (avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW || avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP || avStartPoint == EnumC83653WsL.SWITCH_CAMERA_TOOL_BAR) {
                LIZJ = C78857UxB.LJJIIJ(1476788236, "bpea-duet_shoot_switch_camera_front_rear");
            } else if (avStartPoint == EnumC83653WsL.AUDIO_START_RECORD_USE_EFFECT) {
                LIZJ = C78857UxB.LJJIIJ(1476788236, "bpea-duet_shoot_start_record");
            } else {
                LIZJ = (C78862UxG) LIZJ(avStartPoint, null);
            }
        } else if (interfaceC158836Lf == HX4.STITCH) {
            if (avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_START || avStartPoint == EnumC83653WsL.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                LIZJ = C78857UxB.LJJIIJ(1476788237, "bpea-stitch_enter_shoot");
            } else if (avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW || avStartPoint == EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP || avStartPoint == EnumC83653WsL.SWITCH_CAMERA_TOOL_BAR) {
                LIZJ = C78857UxB.LJJIIJ(1476788237, "bpea-stitch_shoot_switch_camera_front_rear");
            } else if (avStartPoint == EnumC83653WsL.AUDIO_START_RECORD_USE_EFFECT) {
                LIZJ = C78857UxB.LJJIIJ(1476788237, "bpea-stitch_shoot_start_record");
            } else {
                LIZJ = (C78862UxG) LIZJ(avStartPoint, null);
            }
        } else {
            LIZJ = LIZJ(avStartPoint, interfaceC158836Lf);
        }
        return (C78862UxG) LIZJ;
    }

    public final C78862UxG LIZIZ(InterfaceC83714WtK avStopPoint, EnumC158826Le avStopScene) {
        Object LIZJ;
        o.LJIIIZ(avStopPoint, "avStopPoint");
        o.LJIIIZ(avStopScene, "avStopScene");
        if (avStopScene == EnumC158826Le.USER_OPERATION) {
            if (avStopPoint == EnumC83650WsI.STOP_AUDIO_USING_SOUND_EFFECT) {
                LIZJ = C78857UxB.LJJIIJ(1476788483, "bpea-1794");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_CANCEL_SOUND_EFFECT) {
                LIZJ = C78857UxB.LJJIIJ(1476788483, "bpea-1795");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_CAPTURE_WITH_DISABLE) {
                LIZJ = C78857UxB.LJJIIJ(1476788483, "bpea-1808");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_CAPTURE_WITH_ENABLE) {
                LIZJ = C78857UxB.LJJIIJ(1476788483, "bpea-1823");
            } else {
                LIZJ = (C78862UxG) LIZJ(avStopPoint, null);
            }
        } else if (avStopScene == EnumC158826Le.PAGE_INVISIBLE) {
            if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_CONTROLLER_ON_DESTROY) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1757");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_COMPONENT_ON_DESTROY) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1758");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_SURFACE_DESTROY) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1762");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_VIEW_ON_STOP) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1763");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_COMPONENT_ON_STOP) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1764");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_ADD_STREAM) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1768");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_ON_PAUSE) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1769");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_ON_STOP_CAMERA_LOGIC) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1770");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_ON_SURFACE_DESTROY) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1765");
            } else if (avStopPoint == EnumC83650WsI.CLOSE_CAMERA_ON_TEXTURE_DESTROY) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1766");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_ON_PAUSE) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1792");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_SOUND_EFFECT_STOP) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1796");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_CAMERA_LOGIC_PAUSE) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1814");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_CAMERA_CLOSE) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1824");
            } else if (avStopPoint == EnumC83650WsI.STOP_AUDIO_RELEASE_CAMERA_CLOSE) {
                LIZJ = C78857UxB.LJJIIJ(1476788484, "bpea-1825");
            } else {
                LIZJ = (C78862UxG) LIZJ(avStopPoint, null);
            }
        } else {
            LIZJ = LIZJ(avStopPoint, avStopScene);
        }
        return (C78862UxG) LIZJ;
    }
}
