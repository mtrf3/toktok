package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: X.IsO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47984IsO implements PX8 {
    public final /* synthetic */ InterfaceC47420IjI LIZ;
    public final /* synthetic */ C47985IsP LIZIZ;

    public C47984IsO(C47985IsP c47985IsP, C47590Im2 c47590Im2) {
        this.LIZIZ = c47985IsP;
        this.LIZ = c47590Im2;
    }

    @Override // X.PX8
    public final void onFailure(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
        this.LIZIZ.LIZIZ = 2;
        this.LIZ.LIZIZ(null, new C47789IpF("", -9994, 0, iOException.toString()));
    }

    @Override // X.PX8
    public final void onResponse(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
        JSONObject jSONObject;
        int i;
        try {
            PVM pvm = c64598PWw.LJLJL;
            try {
                try {
                    jSONObject = new JSONObject(pvm.string());
                    i = -1;
                    e = null;
                    if (!c64598PWw.LIZIZ()) {
                        e = new Exception("http fail");
                        i = c64598PWw.LJLJI;
                    }
                } catch (Exception e) {
                    e = e;
                    TTVideoEngineLog.d(e);
                    jSONObject = null;
                    i = -9979;
                }
                if (pvm != null) {
                    try {
                        pvm.close();
                    } catch (Exception unused) {
                    }
                }
                if (e == null) {
                    this.LIZ.LIZIZ(jSONObject, null);
                } else {
                    this.LIZ.LIZIZ(jSONObject, new C47789IpF("", i, 0, e.toString()));
                }
            } catch (Throwable th) {
                if (pvm != null) {
                    try {
                        pvm.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
