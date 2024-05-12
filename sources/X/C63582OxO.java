package X;

import Y.IDcS134S0200000_10;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.proto.Response;

/* renamed from: X.OxO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63582OxO implements InterfaceC114864f4 {
    public final /* synthetic */ C63622Oy2 LIZ;
    public final /* synthetic */ InterfaceC63557Owz LIZIZ;
    public final /* synthetic */ C63606Oxm LIZJ;
    public final /* synthetic */ AbstractC63581OxN LIZLLL;

    @Override // X.InterfaceC114864f4
    public final void LIZ(C114844f2 c114844f2) {
        if (C63308Osy.LJI().LIZLLL().LJJLI) {
            RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, c114844f2, 11), null, false);
        } else {
            this.LIZLLL.LJIIJ(this.LIZ, this.LIZJ, c114844f2);
        }
    }

    @Override // X.InterfaceC114864f4
    public final void LIZIZ(Exception exc, String str, int i) {
        String str2;
        C63622Oy2 c63622Oy2;
        int i2;
        if (TextUtils.isEmpty(str)) {
            str = exc.getMessage();
        }
        this.LIZ.LJIIJJI(i, str);
        InterfaceC63557Owz interfaceC63557Owz = this.LIZIZ;
        if (interfaceC63557Owz != null) {
            C63546Owo c63546Owo = (C63546Owo) interfaceC63557Owz;
            if (c63546Owo.LIZLLL.get(Integer.valueOf((this.LIZ.LJLLL + 1) * 10)) == null) {
                c63546Owo.LIZ("logSendByHttpFailure is null");
            } else {
                SystemClock.uptimeMillis();
            }
        }
        int i3 = C63308Osy.LJI().LIZLLL().LJIILJJIL;
        if (i3 > 0 && (i2 = (c63622Oy2 = this.LIZ).LJLLL) < i3) {
            c63622Oy2.LJLJL = null;
            c63622Oy2.LJLL = 0;
            c63622Oy2.LJLLJ = 0;
            int i4 = i2 + 1;
            c63622Oy2.LJLLL = i4;
            InterfaceC63557Owz interfaceC63557Owz2 = this.LIZIZ;
            if (interfaceC63557Owz2 != null) {
                C63546Owo c63546Owo2 = (C63546Owo) interfaceC63557Owz2;
                if (c63546Owo2.LIZLLL.get(Integer.valueOf(i4 * 10)) == null) {
                    c63546Owo2.LIZ("logSendByHttpFailure is null");
                } else {
                    SystemClock.uptimeMillis();
                }
            }
            this.LIZLLL.LJIILLIIL(103, this.LIZ, C63308Osy.LJI().LIZLLL().LJIILL);
        } else {
            this.LIZLLL.LJIJ(this.LIZ);
        }
        if (!C63312Ot2.LIZIZ(Integer.valueOf(this.LIZ.LJFF()))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendByHttp cmd:");
            LIZ.append(this.LIZ.LJFF());
            LIZ.append(" url:");
            LIZ.append(this.LIZJ.LIZ);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), exc);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C115064fO c115064fO = new C115064fO();
        c115064fO.LIZ = "network";
        c115064fO.LIZIZ = "http";
        c115064fO.LIZJ.put("message_uuid", this.LIZ.LJII());
        c115064fO.LIZJ.put("duration", Long.valueOf(uptimeMillis - this.LIZ.LJLLILLLL));
        c115064fO.LIZJ.put("error", exc);
        c115064fO.LIZJ.put("error_stack", C63337OtR.LIZIZ(exc));
        c115064fO.LIZJ.put("cmd", Integer.valueOf(this.LIZ.LJFF()));
        c115064fO.LIZJ.put("url", this.LIZJ.LIZ);
        c115064fO.LIZJ.put("success", 0);
        c115064fO.LIZ();
        C63622Oy2 c63622Oy22 = this.LIZ;
        long j = uptimeMillis - c63622Oy22.LJLLILLLL;
        try {
            str2 = C63626Oy6.LIZ(c63622Oy22.LJFF());
        } catch (Exception unused) {
            str2 = "";
        }
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_network_request");
        LIZJ.LIZ(Integer.valueOf(c63622Oy22.LJFF()), "imsdk_cmd");
        LIZJ.LIZ(str2, "url_path");
        LIZJ.LIZ(0, "imsdk_result");
        LIZJ.LIZ(Long.valueOf(c63622Oy22.LJLIL), "seq_id");
        LIZJ.LIZ(Long.valueOf(j), "duration");
        if (str == null) {
            str = "net_request_failed_handler";
        }
        LIZJ.LIZ(str, "error_msg");
        LIZJ.LIZ(Integer.valueOf(i), "error_code");
        LIZJ.LIZ(C63337OtR.LIZIZ(exc), "error_stack");
        LIZJ.LIZ(C63337OtR.LIZ(exc), "error_name");
        LIZJ.LIZ("http", "net_type");
        LIZJ.LIZ(c63622Oy22.LJLJJLL.retry_count, "retry_times");
        try {
            Response response = c63622Oy22.LJLJL;
            if (response != null) {
                LIZJ.LIZ(response.log_id, "log_id");
                LIZJ.LIZ(c63622Oy22.LJLJL.status_code, "status");
            }
        } catch (Exception e) {
            C63337OtR.LJFF(e);
        }
        LIZJ.LIZLLL();
    }

    public C63582OxO(AbstractC63581OxN abstractC63581OxN, C63622Oy2 c63622Oy2, InterfaceC63557Owz interfaceC63557Owz, C63606Oxm c63606Oxm) {
        this.LIZLLL = abstractC63581OxN;
        this.LIZ = c63622Oy2;
        this.LIZIZ = interfaceC63557Owz;
        this.LIZJ = c63606Oxm;
    }
}
