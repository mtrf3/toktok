package com.ss.android.ugc.aweme.experiment;

import X.C113554cx;
import X.C221108m2;
import X.C32I;
import X.C47261Igj;
import X.C51029K0z;
import X.C60832a7;
import X.C60892aD;
import X.C62822Ol8;
import X.C75792yF;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.gson.reflect.TypeToken;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LogInterceptImpl implements ILogInterceptApi {
    public final List<C60832a7> LIZ;
    public final HandlerThread LIZIZ;
    public Handler LIZJ;
    public boolean LIZLLL;
    public final Map<String, ApplogDegradeInfoList> LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.3mF] */
    public LogInterceptImpl() {
        ?? LJJJLIIL;
        List<C60832a7> LJJIJ = C47261Igj.LJJIJ(C60832a7.LIZJ);
        this.LIZ = LJJIJ;
        this.LIZIZ = new HandlerThread("AppLogInterceptorThread");
        this.LJ = new LinkedHashMap();
        this.LJFF = C221108m2.LIZIZ(C60892aD.LJLIL);
        this.LJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 57));
        for (C60832a7 c60832a7 : LJJIJ) {
            if (((Boolean) c60832a7.LIZIZ.getValue()).booleanValue()) {
                Map map = this.LJ;
                String info = c60832a7.LIZ().getString(C60832a7.LJFF, "");
                o.LJIIIIZZ(info, "info");
                if (info.length() == 0) {
                    LJJJLIIL = C113554cx.LJJJLIIL();
                } else {
                    try {
                        List list = (List) C75792yF.LIZIZ().LJII(info, new TypeToken<List<? extends ApplogDegradeInfoList>>() { // from class: X.2VL
                        }.getType());
                        if (list != null) {
                            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
                            LJJJLIIL = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
                            for (Object obj : list) {
                                String event = ((ApplogDegradeInfoList) obj).getEvent();
                                if (event == null) {
                                    event = "";
                                }
                                LJJJLIIL.put(event, obj);
                            }
                        } else {
                            LJJJLIIL = C113554cx.LJJJLIIL();
                        }
                    } catch (Exception unused) {
                        LJJJLIIL = C113554cx.LJJJLIIL();
                    }
                }
                map.putAll(LJJJLIIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZ(String str) {
        boolean z = false;
        if (!((Boolean) this.LJI.getValue()).booleanValue()) {
            return false;
        }
        ApplogDegradeInfoList applogDegradeInfoList = (ApplogDegradeInfoList) ((LinkedHashMap) this.LJ).get(str);
        if (((Number) this.LJFF.getValue()).longValue() < 0 || applogDegradeInfoList == null) {
            return false;
        }
        if (((float) ((Number) this.LJFF.getValue()).longValue()) < applogDegradeInfoList.getSampling() * 100) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZIZ(final String str, JSONObject jSONObject) {
        if (!((Boolean) this.LJI.getValue()).booleanValue() || str == null || jSONObject == null) {
            return false;
        }
        ApplogDegradeInfoList applogDegradeInfoList = (ApplogDegradeInfoList) ((LinkedHashMap) this.LJ).get(str);
        if (((Number) this.LJFF.getValue()).longValue() < 0 || applogDegradeInfoList == null) {
            return false;
        }
        Set<String> cuttingProperties = applogDegradeInfoList.getCuttingProperties();
        if (cuttingProperties != null && !cuttingProperties.isEmpty()) {
            for (String str2 : cuttingProperties) {
                if (str2 != null) {
                    jSONObject.remove(str2);
                }
            }
        }
        if (((float) ((Number) this.LJFF.getValue()).longValue()) < applogDegradeInfoList.getSampling() * 100) {
            return false;
        }
        if (applogDegradeInfoList.getTransferStorage()) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
                this.LIZIZ.start();
                this.LIZJ = new Handler(this.LIZIZ.getLooper());
            }
            final String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "param.toString()");
            Handler handler = this.LIZJ;
            if (handler != null) {
                handler.post(new Runnable() { // from class: X.2aB
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, jSONObject2);
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
        return true;
    }
}
