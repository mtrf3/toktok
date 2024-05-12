package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.Response;
import kotlin.jvm.internal.o;

/* renamed from: X.OxP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63583OxP {
    public final boolean LIZ = C63308Osy.LJI().LIZLLL().LJLLI;

    public static void LIZJ(C63588OxU remoteRequest) {
        o.LJIIIZ(remoteRequest, "remoteRequest");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch ws error:");
        LIZ.append(remoteRequest.LJLIL.cmd);
        LIZ.append(" and seq:");
        LIZ.append(remoteRequest.LJLIL.sequence_id);
        LIZ.append(" reason:");
        LIZ.append("ws unknown error");
        C63322OtC.LJI("RemoteFetcherLogger", X1D.LIZIZ(LIZ), null);
    }

    public static void LJ(C63588OxU remoteRequest, String str) {
        o.LJIIIZ(remoteRequest, "remoteRequest");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch switch to http:");
        LIZ.append(remoteRequest.LJLIL.cmd);
        LIZ.append(" and seq:");
        LIZ.append(remoteRequest.LJLIL.sequence_id);
        LIZ.append(" reason:");
        LIZ.append(str);
        C63322OtC.LJI("RemoteFetcherLogger", X1D.LIZIZ(LIZ), null);
    }

    public final void LIZIZ(C63588OxU remoteRequest, Response response) {
        String str;
        o.LJIIIZ(remoteRequest, "remoteRequest");
        long uptimeMillis = SystemClock.uptimeMillis() - remoteRequest.LJLJJLL;
        try {
            Integer num = response.cmd;
            o.LJIIIIZZ(num, "response.cmd");
            str = C63626Oy6.LIZ(num.intValue());
        } catch (Exception unused) {
            str = "";
        }
        if (this.LIZ) {
            Integer num2 = response.cmd;
            o.LJIIIIZZ(num2, "response.cmd");
            P04.LJ(num2.intValue(), "On Get Response By Http : cmd: " + response.cmd + " sequence_id= " + response.sequence_id, response);
        } else {
            C1A7.LJJIIJZLJL(response.cmd, "On Get Response By Http : cmd: " + response.cmd + " sequence_id= " + response.sequence_id, response);
        }
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_network_request");
        LIZJ.LIZ(response.cmd, "imsdk_cmd");
        LIZJ.LIZ(str, "url_path");
        LIZJ.LIZ(1, "imsdk_result");
        LIZJ.LIZ(response.sequence_id, "seq_id");
        LIZJ.LIZ(Long.valueOf(uptimeMillis), "duration");
        LIZJ.LIZ("http", "net_type");
        LIZJ.LIZ(response.log_id, "log_id");
        LIZJ.LIZ(response.status_code, "status");
        LIZJ.LIZ(Integer.valueOf(remoteRequest.LJLJJI + remoteRequest.LJLJJL), "retry_times");
        LIZJ.LIZLLL();
    }

    public final void LIZLLL(C63588OxU remoteRequest, Response response) {
        String str;
        o.LJIIIZ(remoteRequest, "remoteRequest");
        o.LJIIIZ(response, "response");
        long uptimeMillis = SystemClock.uptimeMillis() - remoteRequest.LJLJJLL;
        try {
            Integer num = response.cmd;
            o.LJIIIIZZ(num, "response.cmd");
            str = C63626Oy6.LIZ(num.intValue());
        } catch (Exception unused) {
            str = "";
        }
        if (this.LIZ) {
            Integer num2 = response.cmd;
            o.LJIIIIZZ(num2, "response.cmd");
            P04.LJ(num2.intValue(), "On Get Response By WS : cmd: " + response.cmd + " sequence_id= " + response.sequence_id, response);
        } else {
            C1A7.LJJIIJZLJL(response.cmd, "On Get Response By WS : cmd: " + response.cmd + " sequence_id= " + response.sequence_id, response);
        }
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_network_request");
        LIZJ.LIZ(response.cmd, "imsdk_cmd");
        LIZJ.LIZ(str, "url_path");
        LIZJ.LIZ(1, "imsdk_result");
        LIZJ.LIZ(response.sequence_id, "seq_id");
        LIZJ.LIZ(Long.valueOf(uptimeMillis), "duration");
        LIZJ.LIZ("ws", "net_type");
        LIZJ.LIZ(response.log_id, "log_id");
        LIZJ.LIZ(response.status_code, "status");
        LIZJ.LIZ(Integer.valueOf(remoteRequest.LJLJJI), "retry_times");
        LIZJ.LIZLLL();
    }

    public static void LIZ(C63588OxU remoteRequest, C63606Oxm httpRequest, int i, Exception e) {
        o.LJIIIZ(remoteRequest, "remoteRequest");
        o.LJIIIZ(httpRequest, "httpRequest");
        o.LJIIIZ(e, "e");
        long uptimeMillis = SystemClock.uptimeMillis() - remoteRequest.LJLJJLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendByHttp cmd: ");
        LIZ.append(httpRequest.LIZLLL.cmd);
        LIZ.append(" url: ");
        LIZ.append(httpRequest.LIZ);
        C63322OtC.LJI("RemoteFetcherLogger", X1D.LIZIZ(LIZ), e);
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("imsdk_network_request");
        c63323OtD.LIZ(httpRequest.LIZLLL.cmd, "imsdk_cmd");
        c63323OtD.LIZ(httpRequest.LIZ, "url_path");
        c63323OtD.LIZ(0, "imsdk_result");
        c63323OtD.LIZ(httpRequest.LIZLLL.sequence_id, "seq_id");
        c63323OtD.LIZ(Long.valueOf(uptimeMillis), "duration");
        String message = e.getMessage();
        if (message == null) {
            message = "net_request_failed_fetcher";
        }
        c63323OtD.LIZ(message, "error_msg");
        c63323OtD.LIZ(Integer.valueOf(i), "error_code");
        c63323OtD.LIZ(C63337OtR.LIZIZ(e), "error_stack");
        c63323OtD.LIZ(C63337OtR.LIZ(e), "error_name");
        c63323OtD.LIZ("http", "net_type");
        c63323OtD.LIZ(Integer.valueOf(remoteRequest.LJLJJI + remoteRequest.LJLJJL), "retry_times");
        c63323OtD.LIZLLL();
    }
}
