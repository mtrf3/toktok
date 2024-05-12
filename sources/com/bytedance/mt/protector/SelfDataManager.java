package com.bytedance.mt.protector;

import X.C16880lQ;
import X.C65415Plr;
import X.FII;
import X.InterfaceC65419Plv;
import X.O1A;
import X.X1D;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.g;
import com.google.gson.internal.Excluder;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import defpackage.q;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes12.dex */
public final class SelfDataManager {
    public static final SelfDataManager LJ = new SelfDataManager();
    public final ThreadLocal<SelfDataItem> LIZ = new ThreadLocal<>();
    public final List<SelfDataItem> LIZIZ = FII.LIZ();
    public final Gson LIZJ;
    public final long LIZLLL;

    /* loaded from: classes12.dex */
    public static class SelfDataItem {

        @O1A
        public j payload;
        public Throwable sourceThrowable;

        @O1A
        public long timeStamp;

        @O1A
        public String type;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SelfDataItem{, payload=");
            LIZ.append(this.payload);
            LIZ.append(", timeStamp=");
            LIZ.append(this.timeStamp);
            LIZ.append(", type=");
            return q.LIZIZ(LIZ, this.type, '}', LIZ);
        }

        public j toJsonObject(Gson gson) {
            return gson.LJIJJLI(this);
        }
    }

    public SelfDataManager() {
        e eVar = new e();
        eVar.LJIILL = true;
        Excluder clone = eVar.LIZ.clone();
        clone.LJLJJI = true;
        eVar.LIZ = clone;
        this.LIZJ = eVar.LIZ();
        this.LIZLLL = System.currentTimeMillis();
    }

    public static String LIZIZ(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }

    public final m LIZJ(Throwable th) {
        Throwable th2;
        m mVar = new m();
        g gVar = new g();
        SelfDataItem selfDataItem = this.LIZ.get();
        if (selfDataItem == null || (th2 = selfDataItem.sourceThrowable) == null || th == null || (th2 != th && !TextUtils.equals(LIZIZ(th2), LIZIZ(th)))) {
            synchronized (this.LIZIZ) {
                for (SelfDataItem selfDataItem2 : this.LIZIZ) {
                    if (th == null) {
                        gVar.LJJII(selfDataItem2.toJsonObject(this.LIZJ));
                    } else if (selfDataItem2 != null) {
                        Throwable th3 = selfDataItem2.sourceThrowable;
                        if (th3 != null) {
                            if (th3 != th && !TextUtils.equals(LIZIZ(th3), LIZIZ(th))) {
                            }
                            gVar.LJJII(selfDataItem2.toJsonObject(this.LIZJ));
                        }
                    }
                }
                this.LIZIZ.size();
            }
        } else {
            gVar.LJJII(selfDataItem.toJsonObject(this.LIZJ));
        }
        mVar.LJJII("initTimeStamp", new p((Number) Long.valueOf(this.LIZLLL)));
        mVar.LJJII("reportTimeStamp", new p((Number) Long.valueOf(System.currentTimeMillis())));
        mVar.LJJII("data", gVar);
        String str = "toJsonObject" + mVar.toString();
        InterfaceC65419Plv interfaceC65419Plv = C65415Plr.LJ;
        C16880lQ.LLLZ("%s %s", new Object[]{"BusinessTokenManager", str});
        interfaceC65419Plv.LJIIIIZZ();
        return mVar;
    }

    public final void LIZ(String str, Throwable th, m mVar) {
        SelfDataItem selfDataItem = new SelfDataItem();
        selfDataItem.type = str;
        selfDataItem.payload = mVar;
        selfDataItem.sourceThrowable = th;
        selfDataItem.timeStamp = System.currentTimeMillis();
        if (this.LIZIZ.size() >= 5) {
            this.LIZIZ.remove(0);
        }
        this.LIZIZ.add(selfDataItem);
        this.LIZ.set(selfDataItem);
    }
}
