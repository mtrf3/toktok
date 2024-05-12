package com.bytedance.lynx.hybrid.prefetch.bridge;

import X.C06830Op;
import X.C113554cx;
import X.C141335gf;
import X.C37699Eqt;
import X.C37742Era;
import X.C37744Erc;
import X.C37746Ere;
import X.C37750Eri;
import X.C38097ExJ;
import X.C38504F9g;
import X.C3C5;
import X.C60737Nsb;
import X.C76800UCe;
import X.InterfaceC37580Eoy;
import X.X1D;
import android.content.Context;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class WorkerEnvModule extends JSModule {
    public static final C37746Ere Companion = new C37746Ere();
    public static final String NAME = "workerEnv";
    public final C37742Era ctx;
    public WritableMap globalProps;
    public WritableMap initData;
    public String version;

    @InterfaceC37580Eoy
    public final WritableMap getGlobalProps() {
        return this.globalProps;
    }

    @InterfaceC37580Eoy
    public final WritableMap getInitialData() {
        return this.initData;
    }

    @InterfaceC37580Eoy
    public final void onInit(ReadableMap readableMap) {
        String str;
        if (readableMap != null) {
            str = readableMap.getString("version", "null");
        } else {
            str = null;
        }
        this.version = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JS Worker onInit, version = ");
        LIZ.append(this.version);
        C37750Eri.LIZ(X1D.LIZIZ(LIZ));
    }

    @InterfaceC37580Eoy
    public final void save(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Map<String, ?> LJJLIIIJLLLLLLLZ;
        C37742Era c37742Era;
        Map<String, Object> map;
        C37742Era c37742Era2;
        C38504F9g c38504F9g;
        if (readableMap != null) {
            try {
                ReadableMap map2 = readableMap.getMap("result");
                if (map2 != null && (hashMap = map2.toHashMap()) != null) {
                    LJJLIIIJLLLLLLLZ = C113554cx.LJJLIIIJLLLLLLLZ(hashMap);
                    if (LJJLIIIJLLLLLLLZ != null && (c37742Era = this.ctx) != null && (map = c37742Era.LIZ) != null) {
                        map.put("prefetchData", LJJLIIIJLLLLLLLZ);
                    }
                    c37742Era2 = this.ctx;
                    if (c37742Era2 == null && (c38504F9g = c37742Era2.LIZJ) != null) {
                        c38504F9g.LJII(LJJLIIIJLLLLLLLZ);
                        return;
                    }
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fail to save data, error = ");
                LIZ.append(e.getMessage());
                C37750Eri.LIZIZ(X1D.LIZIZ(LIZ), null, 6);
                return;
            }
        }
        LJJLIIIJLLLLLLLZ = null;
        c37742Era2 = this.ctx;
        if (c37742Era2 == null) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerEnvModule(Context context, Object obj) {
        super(context, obj);
        o.LJIIJ(context, "context");
        C76800UCe c76800UCe = null;
        C37742Era c37742Era = (C37742Era) (obj instanceof C37742Era ? obj : null);
        this.ctx = c37742Era;
        if (c37742Era != null) {
            try {
                Map<String, Object> map = c37742Era.LIZ;
                if (map != null) {
                    C37699Eqt c37699Eqt = WorkerBridgeModule.Companion;
                    JSONObject jSONObject = new JSONObject(map);
                    c37699Eqt.getClass();
                    this.globalProps = C37699Eqt.LIZIZ(jSONObject);
                }
                Map<Object, Object> map2 = c37742Era.LIZIZ;
                if (map2 != null) {
                    C37699Eqt c37699Eqt2 = WorkerBridgeModule.Companion;
                    JSONObject jSONObject2 = new JSONObject(map2);
                    c37699Eqt2.getClass();
                    this.initData = C37699Eqt.LIZIZ(jSONObject2);
                    c76800UCe = C76800UCe.LIZ;
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return;
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
    }

    @InterfaceC37580Eoy
    public final void log(String message, int i) {
        o.LJIIJ(message, "message");
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("[worker] ");
                            LIZ.append(message);
                            o.LJIIJ(X1D.LIZIZ(LIZ), "message");
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("[worker] ");
                            LIZ2.append(message);
                            o.LJIIJ(X1D.LIZIZ(LIZ2), "message");
                        }
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("[worker] ");
                        LIZ3.append(message);
                        o.LJIIJ(X1D.LIZIZ(LIZ3), "message");
                    }
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("[worker] ");
                    LIZ4.append(message);
                    o.LJIIJ(X1D.LIZIZ(LIZ4), "message");
                }
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("[worker] ");
                LIZ5.append(message);
                o.LJIIJ(X1D.LIZIZ(LIZ5), "message");
            }
        } catch (Throwable unused) {
        }
    }

    @InterfaceC37580Eoy
    public final void saveSegmenting(String id, ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Map LJJLIIIJLLLLLLLZ;
        C37742Era c37742Era;
        C38504F9g c38504F9g;
        o.LJIIJ(id, "id");
        if (readableMap != null) {
            try {
                ReadableMap map = readableMap.getMap("result");
                if (map != null && (hashMap = map.toHashMap()) != null && (LJJLIIIJLLLLLLLZ = C113554cx.LJJLIIIJLLLLLLLZ(hashMap)) != null && (c37742Era = this.ctx) != null && (c38504F9g = c37742Era.LIZJ) != null) {
                    C37744Erc.LIZ(c38504F9g.LIZIZ(id), null, null, null, id, LJJLIIIJLLLLLLLZ, 7);
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fail to save data, error = ");
                LIZ.append(e.getMessage());
                C37750Eri.LIZIZ(X1D.LIZIZ(LIZ), null, 6);
            }
        }
    }

    @InterfaceC37580Eoy
    public final void onFinished(int i, String str, Integer num) {
        String str2;
        C60737Nsb c60737Nsb;
        C38504F9g c38504F9g;
        C38504F9g c38504F9g2;
        C38504F9g c38504F9g3;
        C38504F9g c38504F9g4;
        C38504F9g c38504F9g5;
        C37742Era c37742Era = this.ctx;
        if (c37742Era == null || (((c38504F9g4 = c37742Era.LIZJ) == null || (str2 = c38504F9g4.LIZ) == null) && ((c38504F9g5 = c37742Era.LIZJ) == null || (str2 = c38504F9g5.LJIIIZ) == null))) {
            str2 = "";
        }
        if (c37742Era != null && (c38504F9g3 = c37742Era.LIZJ) != null) {
            c60737Nsb = c38504F9g3.LJIIJ;
        } else {
            c60737Nsb = null;
        }
        C38097ExJ.LIZIZ("hybrid_prefetch_worker_finish", c60737Nsb, str2, new JSONObject().put("success", i).put("errorCode", num).put("errorMsg", str));
        StringBuilder LIZ = C06830Op.LIZ("worker on finished, status = ", i, ", errorMsg = ", str, ", errorCode = ");
        LIZ.append(num);
        C37750Eri.LIZ(X1D.LIZIZ(LIZ));
        if (i == 1) {
            C37742Era c37742Era2 = this.ctx;
            if (c37742Era2 != null && (c38504F9g2 = c37742Era2.LIZJ) != null) {
                C38504F9g.LJIIJ(c38504F9g2, null, null, null, 7);
                return;
            }
            return;
        }
        C37742Era c37742Era3 = this.ctx;
        if (c37742Era3 == null || (c38504F9g = c37742Era3.LIZJ) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("worker runtime error, errorCode = ");
        LIZ2.append(num);
        LIZ2.append(", errorMsg = ");
        LIZ2.append(str);
        C38504F9g.LJIIJ(c38504F9g, 3, X1D.LIZIZ(LIZ2), null, 4);
    }
}
