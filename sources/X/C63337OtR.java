package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OtR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63337OtR {
    public static InterfaceC63336OtQ LIZ;

    public static final String LIZ(Throwable th) {
        if (th == null) {
            return "null exception";
        }
        String cls = th.getClass().toString();
        o.LJIIIIZZ(cls, "e.javaClass.toString()");
        if (cls.length() == 0) {
            return th.getClass().getName();
        }
        return cls;
    }

    public static final String LIZIZ(Throwable th) {
        String str = "";
        if (th != null) {
            try {
                StackTraceElement[] stackTrace = th.getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; stackTrace != null && i < stackTrace.length; i++) {
                    if (i > 0) {
                        sb.append("\n");
                    }
                    sb.append(stackTrace[i].getClassName());
                    sb.append(":");
                    sb.append(stackTrace[i].getMethodName());
                    sb.append(":");
                    sb.append(stackTrace[i].getLineNumber());
                }
                if (sb.length() > 1000) {
                    sb.substring(0, 999);
                }
                str = sb.toString();
            } catch (Exception unused) {
            }
            o.LJIIIIZZ(str, "try {\n            val st…\n            \"\"\n        }");
        }
        return str;
    }

    public static final void LJFF(Throwable th) {
        InterfaceC63336OtQ interfaceC63336OtQ;
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_exception");
        LIZJ.LIZ(android.util.Log.getStackTraceString(th), "error_stack");
        LIZJ.LIZLLL();
        if (C63308Osy.LJI().LIZLLL().LJJIJL && (interfaceC63336OtQ = LIZ) != null) {
            interfaceC63336OtQ.LIZJ("imsdk_exception", th);
        }
    }

    public static final boolean LIZJ(float f, String str) {
        if (C63308Osy.LJI().LIZLLL().LJJJJZI) {
            if (f > 0.0f && Math.random() < f) {
                return true;
            }
            return false;
        }
        InterfaceC63336OtQ interfaceC63336OtQ = LIZ;
        if (interfaceC63336OtQ != null) {
            interfaceC63336OtQ.LJ();
            return true;
        }
        return false;
    }

    public static final void LIZLLL(String str, JSONObject jSONObject) {
        InterfaceC63336OtQ interfaceC63336OtQ = LIZ;
        if (interfaceC63336OtQ != null) {
            interfaceC63336OtQ.LIZ(str, jSONObject);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("IMMonitor serviceName=");
        LIZ2.append(str);
        LIZ2.append(" duration=");
        LIZ2.append(jSONObject);
        LIZ2.append(" logExtra=");
        LIZ2.append((Object) null);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
    }

    public static final void LJ(String str, Throwable th) {
        InterfaceC63336OtQ interfaceC63336OtQ;
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_exception");
        LIZJ.LIZ(android.util.Log.getStackTraceString(th), "error_stack");
        LIZJ.LIZ(str, "error_msg");
        LIZJ.LIZLLL();
        if (C63308Osy.LJI().LIZLLL().LJJIJL && (interfaceC63336OtQ = LIZ) != null) {
            interfaceC63336OtQ.LIZJ(str, th);
        }
    }

    public static final void LJI(String str, String key) {
        o.LJIIIZ(key, "key");
        InterfaceC63336OtQ interfaceC63336OtQ = LIZ;
        if (interfaceC63336OtQ != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(key, 1.0f);
                jSONObject.put("service", str);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            interfaceC63336OtQ.LIZLLL(jSONObject);
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("IMMonitor serviceName=", str, " key=", key, " value=");
        LIZLLL.append(1.0f);
        C63322OtC.LJFF(X1D.LIZIZ(LIZLLL));
    }

    public static final C115064fO LJII(C63622Oy2 item, boolean z) {
        o.LJIIIZ(item, "item");
        C115064fO c115064fO = new C115064fO();
        c115064fO.LIZJ.put("duration", Long.valueOf(SystemClock.uptimeMillis() - item.LJLLI));
        EnumC63625Oy5 cmd = EnumC63625Oy5.fromValue(item.LJFF());
        if (cmd == null) {
            cmd = EnumC63625Oy5.IMCMD_NOT_USED;
        }
        o.LJIIIIZZ(cmd, "cmd");
        switch (C63624Oy4.LIZ[cmd.ordinal()]) {
            case 1:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "add_participants";
                break;
            case 2:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "create_conversation";
                break;
            case 3:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_conversation_info";
                break;
            case 4:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_conversation_info_list";
                break;
            case 5:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_favorite_conversation_list";
                break;
            case 6:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_top_conversation_list";
                break;
            case 7:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_msg_by_user";
                break;
            case 8:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_stranger_conversation_list";
                break;
            case 9:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_stranger_msg_list";
                break;
            case 10:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "install_init";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "leave";
                break;
            case 12:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "load_history";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "load_member";
                break;
            case 14:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "remove_member";
                break;
            case 15:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "message_send";
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "update_core";
                break;
            case 17:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "update_setting";
                break;
            case 18:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "update_member";
                break;
            case 19:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "update_core_ext";
                break;
            case 20:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "update_setting_ext";
                break;
            case 21:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "dissolve";
                break;
            case 22:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "message_set_property_send";
                break;
            case 23:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "get_conversation_participants_read_index";
                break;
            case 24:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "get_conversation_participants_min_index";
                break;
            case 25:
                c115064fO.LIZ = "upload";
                c115064fO.LIZIZ = "get_upload_token";
                break;
            case 26:
                c115064fO.LIZ = "upload";
                c115064fO.LIZIZ = "get_media_urls";
                break;
            case 27:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "get_user_count";
                break;
            case 28:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "broadcast_send_msg";
                break;
            case 29:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "broadcast_recv_msg";
                break;
            case 30:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "get_user_conversation_list";
                break;
            case 31:
                c115064fO.LIZ = "conversation";
                c115064fO.LIZIZ = "batch_update_participant";
                break;
            case 32:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "rtc_call";
                break;
            case 33:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "rtc_create";
                break;
            case 34:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "stranger_mark_read";
                break;
            case 35:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "stranger_mark_read";
                break;
            case 36:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "stranger_mark_all_read";
                break;
            case 37:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "stranger_delete_all_conversations";
                break;
            case 38:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_recent_msg";
                break;
            case 39:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_cmd_msg";
                break;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_msg_by_index_v2_range";
                break;
            case 41:
                c115064fO.LIZ = "core";
                c115064fO.LIZIZ = "get_messages";
                break;
            default:
                c115064fO.LIZ = "unknown";
                c115064fO.LIZIZ = "not_use";
                break;
        }
        if (z) {
            c115064fO.LIZJ.put("success", 1);
        } else {
            c115064fO.LIZJ.put("error", Integer.valueOf(item.LJLL));
            c115064fO.LIZJ.put("success", 0);
            try {
                Request request = item.LJLJJLL;
                if (request != null) {
                    c115064fO.LIZLLL.put("origin_request", C63682Oz0.LIZ.LJIILL(request));
                }
                Response response = item.LJLJL;
                if (response != null) {
                    c115064fO.LIZLLL.put("origin_response", C63682Oz0.LIZ.LJIILL(response));
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMonitor wrapMonitor ", e);
            }
        }
        return c115064fO;
    }
}
