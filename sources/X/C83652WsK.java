package X;

import com.bytedance.bpea.basics.Cert;

/* renamed from: X.WsK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83652WsK {
    public static Cert LIZ(String str) {
        switch (str.hashCode()) {
            case -1561975018:
                if (!str.equals("bpea-audio_capture_tools_release_onpause")) {
                    return null;
                }
                return C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_ON_PAUSE, EnumC158826Le.PAGE_INVISIBLE);
            case -251539147:
                if (!str.equals("bpea-audio_tools_release_with_camera_closed")) {
                    return null;
                }
                return C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_RELEASE_CAMERA_CLOSE, EnumC158826Le.PAGE_INVISIBLE);
            case -27067870:
                if (!str.equals("bpea-audio_tools_default_record_start")) {
                    return null;
                }
                return C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.AUDIO_START_RECORD_DEFAULT_NOT_AUDIO, null);
            case 16352014:
                if (!str.equals("bpea-audio_capture_tools_release_with_camera_closed")) {
                    return null;
                }
                return C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_CAMERA_CLOSE, EnumC158826Le.PAGE_INVISIBLE);
            case 118964923:
                if (!str.equals("bpea-audio_capture_tools_default_record_start")) {
                    return null;
                }
                return C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.AUDIO_START_RECORD_DEFAULT_WITH_AUDIO, null);
            case 1578837995:
                if (!str.equals("bpea-camera_tools_record_toolbar_switch")) {
                    return null;
                }
                return C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.SWITCH_CAMERA_TOOL_BAR, null);
            default:
                return null;
        }
    }
}
