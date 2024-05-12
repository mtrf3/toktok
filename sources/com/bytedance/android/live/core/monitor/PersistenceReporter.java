package com.bytedance.android.live.core.monitor;

import X.C0K1;
import X.C0K2;
import X.C0NB;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C279017q;
import X.C2NU;
import X.C3C5;
import X.C47051sz;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC65349Pkn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.X1D;
import Y.IDHandlerS13S0100000;
import Y.IDRunnableS0S1200000;
import Y.IDRunnableS4S1100000;
import Y.IDRunnableS85S0100000;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.ttlivestreamer.livestreamv2.utils.JsonUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PersistenceReporter implements C0K1 {
    public static final Keva LJIIIIZZ;
    public static final C62822Ol8 LJIIIZ;
    public final String LIZ;
    public long LIZIZ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    public long LIZJ = 2048;
    public long LIZLLL = Long.MAX_VALUE;
    public InterfaceC88472Yns<? super JSONObject, C76800UCe> LJ;
    public final Keva LJFF;
    public HandlerThread LJI;
    public IDHandlerS13S0100000 LJII;

    public final synchronized IDHandlerS13S0100000 LJIIIZ() {
        IDHandlerS13S0100000 iDHandlerS13S0100000;
        HandlerThread handlerThread = this.LJI;
        if (handlerThread == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PersistenceReporter-");
            LIZ.append(this.LIZ);
            handlerThread = new HandlerThread(X1D.LIZIZ(LIZ));
            this.LJI = handlerThread;
            handlerThread.start();
        }
        iDHandlerS13S0100000 = new IDHandlerS13S0100000(this, handlerThread.getLooper(), 0);
        this.LJII = iDHandlerS13S0100000;
        return iDHandlerS13S0100000;
    }

    static {
        new ConcurrentHashMap();
        LJIIIIZZ = Keva.getRepo("PersistenceReporter-config");
        LJIIIZ = C221108m2.LIZIZ(C47051sz.LJLIL);
    }

    @Override // X.C0K1
    public final void LIZLLL() {
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            HandlerThread handlerThread = this.LJI;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.LJI = null;
            this.LJII = null;
        }
    }

    public final void LJI() {
        Map<String, ?> all = this.LJFF.getAll();
        if (all.isEmpty()) {
            return;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            C15380j0.LIZLLL();
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    if (entry.getValue() instanceof String) {
                        String key = entry.getKey();
                        o.LJIIIIZZ(key, "it.key");
                        Companion.InnerRecord LJIIJ = LJIIJ(key, String.valueOf(entry.getValue()));
                        if (LJIIJ != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (LJIIJ.getCreateTimeStamp() > currentTimeMillis) {
                                this.LJFF.erase(entry.getKey());
                            } else if (Math.abs(currentTimeMillis - LJIIJ.getCreateTimeStamp()) > this.LIZLLL) {
                                this.LJFF.erase(entry.getKey());
                            } else if (LJIIJ.getStartID() != ((Number) LJIIIZ.getValue()).longValue()) {
                                if (!LJIIJ.getDiscardWhenNextBoot()) {
                                    LJII(LJIIJ, false);
                                }
                                this.LJFF.erase(entry.getKey());
                            }
                        }
                    }
                } else {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {

        /* loaded from: classes.dex */
        public static final class InnerRecord {

            @InterfaceC65349Pkn("discard_next_boot")
            public boolean discardWhenNextBoot;

            @InterfaceC65349Pkn("start_id")
            public long startID = ((Number) PersistenceReporter.LJIIIZ.getValue()).longValue();

            @InterfaceC65349Pkn("create_time")
            public long createTimeStamp = System.currentTimeMillis();

            @InterfaceC65349Pkn("value")
            public String value = "{}";

            @InterfaceC65349Pkn("status")
            public int status = 1;

            public final long getCreateTimeStamp() {
                return this.createTimeStamp;
            }

            public final boolean getDiscardWhenNextBoot() {
                return this.discardWhenNextBoot;
            }

            public final long getStartID() {
                return this.startID;
            }

            public final int getStatus() {
                return this.status;
            }

            public final String getValue() {
                return this.value;
            }

            public final void setCreateTimeStamp(long j) {
                this.createTimeStamp = j;
            }

            public final void setDiscardWhenNextBoot(boolean z) {
                this.discardWhenNextBoot = z;
            }

            public final void setStartID(long j) {
                this.startID = j;
            }

            public final void setStatus(int i) {
                this.status = i;
            }

            public final void setValue(String str) {
                o.LJIIIZ(str, "<set-?>");
                this.value = str;
            }
        }
    }

    public PersistenceReporter(String str) {
        this.LIZ = str;
        this.LJFF = Keva.getRepo(str);
        IDHandlerS13S0100000 iDHandlerS13S0100000 = this.LJII;
        (iDHandlerS13S0100000 == null ? LJIIIZ() : iDHandlerS13S0100000).sendEmptyMessageDelayed(10000, this.LIZIZ);
        IDHandlerS13S0100000 iDHandlerS13S01000002 = this.LJII;
        (iDHandlerS13S01000002 == null ? LJIIIZ() : iDHandlerS13S01000002).sendEmptyMessageDelayed(10004, 0L);
        IDHandlerS13S0100000 iDHandlerS13S01000003 = this.LJII;
        (iDHandlerS13S01000003 == null ? LJIIIZ() : iDHandlerS13S01000003).postDelayed(new IDRunnableS85S0100000(this, 59), 5000L);
    }

    @Override // X.C0K1
    public final void LIZIZ(String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        IDHandlerS13S0100000 iDHandlerS13S0100000 = this.LJII;
        if (iDHandlerS13S0100000 == null) {
            iDHandlerS13S0100000 = LJIIIZ();
        }
        iDHandlerS13S0100000.post(new IDRunnableS4S1100000(this, sourceId, 3));
    }

    @Override // X.C0K1
    public final void LIZJ(String recordId) {
        o.LJIIIZ(recordId, "recordId");
        Message obtain = Message.obtain();
        obtain.what = 10002;
        obtain.obj = recordId;
        IDHandlerS13S0100000 iDHandlerS13S0100000 = this.LJII;
        if (iDHandlerS13S0100000 == null) {
            iDHandlerS13S0100000 = LJIIIZ();
        }
        iDHandlerS13S0100000.sendMessage(obtain);
    }

    @Override // X.C0K1
    public final void LIZ(final String sourceId, final String targetId) {
        o.LJIIIZ(sourceId, "sourceId");
        o.LJIIIZ(targetId, "targetId");
        IDHandlerS13S0100000 iDHandlerS13S0100000 = this.LJII;
        if (iDHandlerS13S0100000 == null) {
            iDHandlerS13S0100000 = LJIIIZ();
        }
        iDHandlerS13S0100000.post(new Runnable() { // from class: X.0Jy
            public final void LIZ() {
                String value = PersistenceReporter.this.LJFF.getString(sourceId, "");
                o.LJIIIIZZ(value, "value");
                if (value.length() > 0) {
                    PersistenceReporter.this.LJFF.storeString(targetId, value);
                    PersistenceReporter.this.LJFF.erase(sourceId);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // X.C0K1
    public final void LJ(String recordId, InterfaceC88471Ynr<? super String, ? super Long, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(recordId, "recordId");
        IDHandlerS13S0100000 iDHandlerS13S0100000 = this.LJII;
        if (iDHandlerS13S0100000 == null) {
            iDHandlerS13S0100000 = LJIIIZ();
        }
        iDHandlerS13S0100000.post(new IDRunnableS0S1200000(interfaceC88471Ynr, recordId, this, 5));
    }

    public final void LJII(Companion.InnerRecord innerRecord, boolean z) {
        Object LIZ;
        if (innerRecord.getValue().length() == 0 || o.LJ(innerRecord.getValue(), "{}")) {
            return;
        }
        try {
            LIZ = new JSONObject(innerRecord.getValue());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        JSONObject jSONObject = (JSONObject) LIZ;
        if (z && jSONObject != null) {
            jSONObject.put("expire_info", new JSONObject("{expire:1}"));
        }
        if (innerRecord.getStartID() != ((Number) LJIIIZ.getValue()).longValue() && innerRecord.getStatus() != 0) {
            if (jSONObject == null) {
                return;
            } else {
                jSONObject.put("app_killed", true);
            }
        } else if (jSONObject == null) {
            return;
        }
        C0K2.LJIIIIZZ(this.LIZ, innerRecord.getStatus(), jSONObject);
        InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns = this.LJ;
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(jSONObject);
    }

    public final Companion.InnerRecord LJIIJ(String str, String str2) {
        Object LIZ;
        try {
            LIZ = (Companion.InnerRecord) new Gson().LJI(str2, Companion.InnerRecord.class);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Companion.InnerRecord innerRecord = (Companion.InnerRecord) LIZ;
        if (innerRecord == null) {
            this.LJFF.erase(str);
        }
        return innerRecord;
    }

    public final void LJIIJJI(String str, boolean z) {
        boolean z2 = false;
        if (str.length() == 0 || !this.LJFF.contains(str)) {
            C279017q.LJ("report specific record id empty  recordId =", str, "PersistenceReporter");
            return;
        }
        C15380j0.LIZLLL();
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (!z2) {
            return;
        }
        String json = this.LJFF.getString(str, "{}");
        o.LJIIIIZZ(json, "json");
        Companion.InnerRecord LJIIJ = LJIIJ(str, json);
        if (LJIIJ == null) {
            return;
        }
        if (z) {
            LJIIJ.setStatus(1);
        }
        LJII(LJIIJ, z);
        this.LJFF.erase(str);
    }

    @Override // X.C0K1
    public final boolean LJFF(final long j, final String recordId, final String str, final boolean z, final boolean z2, final boolean z3) {
        o.LJIIIZ(recordId, "recordId");
        if (recordId.length() == 0) {
            return false;
        }
        HandlerThread handlerThread = this.LJI;
        if (handlerThread != null && C16880lQ.LLLLIIIILLL().getId() == handlerThread.getId()) {
            LJIIIIZZ(j, recordId, str, z, z2, z3);
        } else {
            IDHandlerS13S0100000 iDHandlerS13S0100000 = this.LJII;
            if (iDHandlerS13S0100000 == null) {
                iDHandlerS13S0100000 = LJIIIZ();
            }
            iDHandlerS13S0100000.post(new Runnable() { // from class: X.0K3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        PersistenceReporter.this.LJIIIIZZ(j, recordId, str, z, z2, z3);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        return true;
    }

    public final void LJIIIIZZ(long j, String str, String str2, boolean z, boolean z2, boolean z3) {
        Companion.InnerRecord LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateValue,recordId =");
        LIZ.append(str);
        LIZ.append(",isEnd =");
        LIZ.append(z);
        LIZ.append(" jsonString length = ");
        LIZ.append(str2.length());
        C0NB.LIZIZ("PersistenceReporter", X1D.LIZIZ(LIZ));
        if (!this.LJFF.contains(str)) {
            LJIIJ = new Companion.InnerRecord();
            if (j > 0) {
                Message obtain = Message.obtain();
                obtain.what = 10001;
                obtain.obj = str;
                IDHandlerS13S0100000 iDHandlerS13S0100000 = this.LJII;
                if (iDHandlerS13S0100000 == null) {
                    iDHandlerS13S0100000 = LJIIIZ();
                }
                iDHandlerS13S0100000.sendMessageDelayed(obtain, j);
            }
            IDHandlerS13S0100000 iDHandlerS13S01000002 = this.LJII;
            if (iDHandlerS13S01000002 == null) {
                iDHandlerS13S01000002 = LJIIIZ();
            }
            iDHandlerS13S01000002.sendEmptyMessage(10005);
        } else {
            String json = this.LJFF.getString(str, "{}");
            o.LJIIIIZZ(json, "json");
            LJIIJ = LJIIJ(str, json);
            if (LJIIJ == null) {
                LJIIJ = new Companion.InnerRecord();
            }
        }
        if (LJIIJ.getStatus() == 0) {
            return;
        }
        if (z3) {
            LJIIJ.setDiscardWhenNextBoot(true);
        }
        if (z2) {
            JSONObject jSONObject = new JSONObject(LJIIJ.getValue());
            JsonUtils.mergeJson(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
            o.LJIIIIZZ(str2, "dstJson.toString()");
        }
        LJIIJ.setValue(str2);
        LJIIJ.setStatus(1 ^ (z ? 1 : 0));
        this.LJFF.storeString(str, GsonProtectorUtils.toJson(new Gson(), LJIIJ));
    }
}
