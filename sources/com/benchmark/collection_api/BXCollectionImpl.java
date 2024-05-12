package com.benchmark.collection_api;

import X.C09590Zf;
import X.C0TB;
import X.C16880lQ;
import X.C275316f;
import X.C38891fp;
import X.C47261Igj;
import X.C58096Mr6;
import X.C89999ZTv;
import X.InterfaceC37276Ek4;
import X.X1D;
import X.ZTV;
import X.ZU4;
import X.ZU5;
import X.ZUA;
import X.ZUC;
import X.ZUR;
import X.ZUU;
import Y.IDCallableS415S0100000_17;
import android.content.Context;
import com.benchmark.collection.service.ByteBenchProcessInterface;
import com.benchmark.netUtils.BytebenchAPI;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public class BXCollectionImpl implements BXCollectionAPI {
    public static BXCollectionAPI LIZJ() {
        Object LIZ = C58096Mr6.LIZ(BXCollectionAPI.class, false);
        if (LIZ != null) {
            return (BXCollectionAPI) LIZ;
        }
        return new BXCollectionImpl();
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final void LIZ() {
        ZU4 zu4 = ZU4.LIZJ;
        ZUU zuu = (ZUU) zu4.LIZ();
        if (zuu.LIZLLL == ZUA.INIT) {
            C09590Zf.LJIILLIIL.getClass();
            zuu.LIZJ = System.currentTimeMillis();
            zuu.LIZLLL = ZUA.LOADING;
            HashMap hashMap = new HashMap();
            if (hashMap.isEmpty()) {
                hashMap.put("", "");
            }
            BytebenchAPI bytebenchAPI = (BytebenchAPI) C0TB.LIZIZ().LIZ.LIZ(BytebenchAPI.class);
            HashMap hashMap2 = new HashMap(C0TB.LIZIZ().LIZ());
            if (zu4.LIZIZ.LIZ) {
                hashMap2.put("aid", "123123");
                hashMap2.put("task_group_id", String.valueOf(zu4.LIZIZ.LIZIZ));
            }
            InterfaceC37276Ek4<TypedInput> defaultBenchmark = bytebenchAPI.getDefaultBenchmark(hashMap, hashMap2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("load task url: ");
            LIZ.append(defaultBenchmark.request().getUrl());
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILJJIL("BytebenchV2");
            defaultBenchmark.enqueue(zuu.LJ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("load ByteBench: invaild status: ");
        LIZ2.append(zuu.LIZLLL);
        X1D.LIZIZ(LIZ2);
        C47261Igj.LJIILL("BytebenchV2");
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int stop() {
        ZUU zuu = (ZUU) ZU4.LIZJ.LIZ();
        if (zuu.LIZLLL != ZUA.RUN) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopByteBench: invaild status: ");
            LIZ.append(zuu.LIZLLL);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BytebenchV2");
            return -4;
        }
        zuu.LIZLLL = ZUA.STOPPING;
        C89999ZTv.LIZ(new IDCallableS415S0100000_17(zuu, 2), C89999ZTv.LJ);
        return 0;
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int LIZIZ(C275316f c275316f) {
        ZTV ztv;
        String str;
        String str2;
        ZU4 zu4 = ZU4.LIZJ;
        ZUU zuu = (ZUU) zu4.LIZ();
        zuu.getClass();
        if (!C09590Zf.LJIILLIIL.LIZIZ()) {
            return -105;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ZU5 zu5 = zu4.LIZIZ;
        zu5.getClass();
        zu5.LIZ = c275316f.LIZ;
        zu5.LIZIZ = c275316f.LIZIZ;
        zu5.LIZLLL = c275316f.LIZJ;
        zu5.LJ = c275316f.LIZLLL;
        zuu.LIZ = new ZUR(zuu);
        ZU5 zu52 = zu4.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C09590Zf.LJIILLIIL.LJIILJJIL);
        LIZ.append("/bytebench_collection");
        zu52.LIZJ = X1D.LIZIZ(LIZ);
        synchronized (ZTV.class) {
            if (ZTV.LJII == null) {
                ZTV.LJII = new ZTV();
            }
            ztv = ZTV.LJII;
        }
        zuu.LIZIZ = ztv;
        ZUR zur = zuu.LIZ;
        ztv.getClass();
        Context context = C09590Zf.LJIILLIIL.LIZ;
        ztv.LIZIZ = context;
        if (context != null) {
            ztv.LJFF = new ByteBenchProcessInterface();
            String str3 = "";
            if (zu4.LIZIZ.LJ) {
                str = "";
                str2 = "";
            } else {
                try {
                    File LLIIIL = C16880lQ.LLIIIL(ztv.LIZIZ);
                    if (LLIIIL == null) {
                        str = "";
                    } else {
                        str = LLIIIL.getPath();
                    }
                    File LLIIIZ = C16880lQ.LLIIIZ(ztv.LIZIZ);
                    if (LLIIIZ == null) {
                        str2 = "";
                    } else {
                        str2 = LLIIIZ.getPath();
                    }
                    if (ztv.LIZIZ.getApplicationInfo() != null) {
                        str3 = ztv.LIZIZ.getApplicationInfo().nativeLibraryDir;
                    }
                } catch (Exception unused) {
                    C47261Igj.LJIILL("ByteBenchServiceManager");
                }
            }
            int init = ztv.LJFF.init(zu4.LIZIZ.LIZJ, str, str2, str3, ztv.LIZIZ);
            if (init < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("initRefactor: failed");
                LIZ2.append(init);
                X1D.LIZIZ(LIZ2);
                C47261Igj.LJIILL("ByteBenchServiceManager");
            } else {
                ztv.LJFF.setByteBenchCallback(ztv.LIZLLL);
                ztv.LJ = zur;
            }
        }
        zuu.LIZ.LIZIZ(100, "bytebench init");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            C38891fp.LJJII("bytebench_collection_init_v2", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return 0;
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int start(int i) {
        ZUU zuu = (ZUU) ZU4.LIZJ.LIZ();
        if (zuu.LIZLLL != ZUA.LOAD && zuu.LIZLLL != ZUA.STOP) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startByteBench: invaild status: ");
            LIZ.append(zuu.LIZLLL);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BytebenchV2");
            return -4;
        }
        zuu.LIZLLL = ZUA.START;
        if (i == -1) {
            return -1;
        }
        C89999ZTv.LIZ(new ZUC(zuu, i), C89999ZTv.LJ);
        return 0;
    }
}
