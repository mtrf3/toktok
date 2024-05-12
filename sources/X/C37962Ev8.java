package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ev8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37962Ev8 {
    public static void LIZ() {
        Executor LIZIZ;
        C37961Ev7 LIZJ;
        if (C37876Etk.LIZ.get("DEFAULT") == null) {
            try {
                try {
                    C35657Dz3 c35657Dz3 = C37876Etk.LJI;
                    synchronized (c35657Dz3) {
                        c35657Dz3.LIZ("repository_handle_local_storage", new JSONObject());
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC37978EvO interfaceC37978EvO = C37876Etk.LJFF;
                    if (interfaceC37978EvO != null && (LIZJ = interfaceC37978EvO.LIZJ()) != null) {
                        C38521F9x LIZ = LIZJ.LIZ();
                        String str = (String) LIZ.LIZ;
                        if (str != null) {
                            if (((JSONObject) LIZ.LIZJ) != null) {
                                C37985EvV.LIZIZ(Boolean.TRUE, "jsb_auth_use_response_json");
                                JSONObject jSONObject = (JSONObject) LIZ.LIZJ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("from_storage");
                                LIZ2.append("_");
                                LIZ2.append((String) LIZ.LIZIZ);
                                C37963Ev9.LIZ(X1D.LIZIZ(LIZ2), jSONObject);
                            } else {
                                C37985EvV.LIZIZ(Boolean.FALSE, "jsb_auth_use_response_json");
                                JSONObject jSONObject2 = new JSONObject(str);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("from_storage");
                                LIZ3.append("_");
                                LIZ3.append((String) LIZ.LIZIZ);
                                C37963Ev9.LIZ(X1D.LIZIZ(LIZ3), jSONObject2);
                            }
                        }
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("handle local storage success!! cost_time = ");
                    LIZ4.append(System.currentTimeMillis() - currentTimeMillis);
                    LIZ4.append(" ms.");
                    String msg = X1D.LIZIZ(LIZ4);
                    o.LJIIJ(msg, "msg");
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("handle local storage failed!!, error = ");
                    LIZ5.append(e.getMessage());
                    String msg2 = X1D.LIZIZ(LIZ5);
                    o.LJIIJ(msg2, "msg");
                    C37985EvV.LIZIZ(o.LJIILLIIL("", e.getMessage()), "jsb_auth_bdx_handle_local_storage_error");
                }
                C37936Eui.LJII.put("handle_local_storage_in_hybrid_config", "true");
            } finally {
                InterfaceC37978EvO interfaceC37978EvO2 = C37876Etk.LJFF;
                if (interfaceC37978EvO2 != null && (LIZIZ = interfaceC37978EvO2.LIZIZ()) != null) {
                    LIZIZ.execute(new E2I());
                }
            }
        }
    }

    public static String LIZIZ() {
        try {
            StringBuilder sb = new StringBuilder();
            InputStream open = EF7.LIZIZ().getAssets().open("jsb_whitelist.zip");
            o.LJIIIIZZ(open, "getApplicationContext().…pen(ASSETS_JSB_WHITELIST)");
            ZipInputStream zipInputStream = new ZipInputStream(open);
            if (zipInputStream.getNextEntry() != null) {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = zipInputStream.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, PVC.LIZ));
                }
            }
            zipInputStream.close();
            return sb.toString();
        } catch (IOException unused) {
            return null;
        }
    }
}
