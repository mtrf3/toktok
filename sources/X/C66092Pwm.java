package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Pwm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66092Pwm implements InterfaceC66095Pwp {
    public C66108Px2 LIZ;
    public final List<C37622Epe> LIZIZ = new ArrayList();

    public final void LIZIZ(C66104Pwy c66104Pwy) {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.LIZIZ) {
            for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
                C37622Epe c37622Epe = (C37622Epe) ((ArrayList) this.LIZIZ).get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "page");
                jSONObject.put("title", c37622Epe.LIZIZ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(i);
                jSONObject.put("id", X1D.LIZIZ(LIZ));
                jSONObject.put("description", "");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ws://");
                LIZ2.append(c37622Epe.LIZLLL);
                jSONObject.put("webSocketDebuggerUrl", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("/devtools/inspector.html?ws=");
                LIZ3.append(c37622Epe.LIZLLL);
                jSONObject.put("devtoolsFrontendUrl", X1D.LIZIZ(LIZ3));
                jSONArray.put(jSONObject);
            }
        }
        C66108Px2 LJIILIIL = AbstractC38911fr.LJIILIIL(jSONArray.toString(), "application/json");
        c66104Pwy.LIZJ = 200;
        c66104Pwy.LIZLLL = "OK";
        c66104Pwy.LJ = LJIILIIL;
    }

    public final void LIZJ(C66104Pwy c66104Pwy) {
        String str;
        if (this.LIZ == null) {
            JSONObject LJ = C47135Ieh.LJ("Browser", "VMSDK-Debugger", "Protocol-Version", "1.3");
            synchronized (C66093Pwn.class) {
                if (!C66093Pwn.LIZIZ) {
                    C66093Pwn.LIZIZ = true;
                    try {
                        C66093Pwn.LIZ = C66093Pwn.LIZ();
                    } catch (IOException unused) {
                    }
                }
                str = C66093Pwn.LIZ;
            }
            LJ.put("Android-Package", str);
            LJ.put("V8-Version", "7.2.1");
            this.LIZ = AbstractC38911fr.LJIILIIL(LJ.toString(), "application/json");
        }
        C66108Px2 c66108Px2 = this.LIZ;
        c66104Pwy.LIZJ = 200;
        c66104Pwy.LIZLLL = "OK";
        c66104Pwy.LJ = c66108Px2;
    }

    @Override // X.InterfaceC66095Pwp
    public final boolean LIZ(C66096Pwq c66096Pwq, C66105Pwz c66105Pwz, C66104Pwy c66104Pwy) {
        String path = c66105Pwz.LIZJ.getPath();
        try {
            if ("/json/version".equals(path)) {
                LIZJ(c66104Pwy);
            } else if ("/json".equals(path)) {
                LIZIZ(c66104Pwy);
            } else {
                c66104Pwy.LIZJ = 501;
                c66104Pwy.LIZLLL = "Not implemented";
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("No support for ");
                LIZ.append(path);
                LIZ.append("\n");
                c66104Pwy.LJ = AbstractC38911fr.LJIILIIL(X1D.LIZIZ(LIZ), "text/plain");
            }
            return true;
        } catch (JSONException e) {
            c66104Pwy.LIZJ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
            c66104Pwy.LIZLLL = "Internal server error";
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(e.toString());
            LIZ2.append("\n");
            c66104Pwy.LJ = AbstractC38911fr.LJIILIIL(X1D.LIZIZ(LIZ2), "text/plain");
            return true;
        }
    }
}
