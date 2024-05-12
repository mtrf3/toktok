package com.bytedance.applog.monitor;

import X.C16880lQ;
import X.C68880R1o;
import X.F9J;
import X.InterfaceC66740QHg;
import X.J7D;
import X.J7E;
import X.QI3;
import X.QIB;
import X.QIK;
import X.QIQ;
import X.QIT;
import X.QJ0;
import X.QJF;
import X.QJK;
import X.QL2;
import X.V10;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.a1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Monitor implements Handler.Callback {
    public static long INTERVAL_REPORT = 86400000;
    public volatile boolean loaded;
    public Context mContext;
    public long mLastReportTs;
    public InterfaceC66740QHg mLogger;
    public volatile boolean mSaving;
    public QIT mStore;
    public final String mStoreFilePrefix;
    public volatile QL2 mUploader;
    public final Handler mWorkHandler;
    public Map<String, Map<String, J7E>> mRecords = new ConcurrentHashMap();
    public long mInstallTime = 0;

    private void doSave() {
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream;
        BufferedWriter bufferedWriter;
        QIT qit = this.mStore;
        if (qit == null) {
            this.mStore = new QIT(this.mContext, this.mStoreFilePrefix, this.mLogger);
        } else {
            qit.getClass();
            File file = new File(qit.LIZ);
            if (file.exists()) {
                C16880lQ.LLLZZIL(file);
            }
        }
        if (this.mRecords.isEmpty()) {
            return;
        }
        QIT qit2 = this.mStore;
        long j = this.mLastReportTs;
        List<JSONObject> LIZ = J7D.LIZ(this.mRecords);
        InterfaceC66740QHg interfaceC66740QHg = qit2.LIZIZ;
        List<String> list = QIT.LIZJ;
        StringBuilder LIZJ = V10.LIZJ("[saveRecords]: lastReportTS:", j, ",jsonObjects:");
        ArrayList arrayList = (ArrayList) LIZ;
        LIZJ.append(arrayList.size());
        interfaceC66740QHg.LJIIIZ(8, list, X1D.LIZIZ(LIZJ), new Object[0]);
        BufferedWriter bufferedWriter2 = null;
        try {
            fileOutputStream = new FileOutputStream(qit2.LIZ);
            try {
                outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                try {
                    bufferedWriter = new BufferedWriter(outputStreamWriter);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter = null;
            fileOutputStream = null;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(j);
            LIZ2.append(QIT.LIZLLL);
            bufferedWriter.write(X1D.LIZIZ(LIZ2));
            if (arrayList.size() != 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(((JSONObject) arrayList.get(i)).toString());
                    LIZ3.append(QIT.LIZLLL);
                    bufferedWriter.write(X1D.LIZIZ(LIZ3));
                }
            }
            qit2.LIZ(bufferedWriter);
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter2 = bufferedWriter;
            try {
                qit2.LIZIZ.LJIIJ(8, QIT.LIZJ, "saveByLine error ", th, new Object[0]);
                qit2.LIZ(bufferedWriter2);
                qit2.LIZ(outputStreamWriter);
                qit2.LIZ(fileOutputStream);
            } catch (Throwable th5) {
                qit2.LIZ(bufferedWriter2);
                qit2.LIZ(outputStreamWriter);
                qit2.LIZ(fileOutputStream);
                throw th5;
            }
        }
        qit2.LIZ(outputStreamWriter);
        qit2.LIZ(fileOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.monitor.Monitor.load():void");
    }

    private void loadInstallTimeOrSaveNow() {
        Context context = this.mContext;
        if (context == null) {
            this.mLogger.LJ("loadInstallTimeOrSaveNow: context is null", 8, new Object[0]);
            return;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mStoreFilePrefix);
            LIZ.append("monitor");
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, X1D.LIZIZ(LIZ));
            long j = LIZIZ.getLong("monitor_install_time3", 0L);
            this.mInstallTime = j;
            if (j <= 0 || j > System.currentTimeMillis()) {
                this.mInstallTime = System.currentTimeMillis();
                LIZIZ.edit().putLong("monitor_install_time3", this.mInstallTime).apply();
            }
        } catch (Throwable th) {
            this.mLogger.LIZJ(8, "loadInstallTimeOrSaveNow error", th, new Object[0]);
        }
        InterfaceC66740QHg interfaceC66740QHg = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("loadInstallTimeOrSaveNow: mInstallTime = ");
        LIZ2.append(this.mInstallTime);
        interfaceC66740QHg.LJII(X1D.LIZIZ(LIZ2), 8, new Object[0]);
    }

    private boolean report() {
        List<JSONObject> LIZ = J7D.LIZ(this.mRecords);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(new QJK((JSONObject) it.next()));
        }
        if (this.mUploader == null || arrayList.size() == 0) {
            return false;
        }
        InterfaceC66740QHg interfaceC66740QHg = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[report]: reportDataLists:");
        LIZ2.append(arrayList.size());
        interfaceC66740QHg.LJII(X1D.LIZIZ(LIZ2), 8, new Object[0]);
        QJF qjf = (QJF) this.mUploader;
        qjf.getClass();
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            QJK qjk = (QJK) it2.next();
            if (qjk != null) {
                if (qjf.LIZ.LIZIZ.LJJJ) {
                    qjf.LIZ.LIZIZ.LJJIZ.LJIJI(0, QIB.LIZJ, a1.LJ("[onUpload]: reportData.event:", "applog_trace", ",reportData.jsonObject: {}"), qjk.LIZ);
                }
                QI3 qi3 = qjf.LIZ.LIZIZ;
                JSONObject jSONObject = qjk.LIZ;
                qi3.LIZLLL.LJ(QIQ.event_v3, QIK.init);
                qi3.LJIIIZ("applog_trace", jSONObject);
            }
        }
        return true;
    }

    private void save() {
        if (this.mContext == null) {
            this.mSaving = false;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.mLastReportTs) >= INTERVAL_REPORT && report()) {
            this.mLastReportTs = currentTimeMillis;
            this.mRecords.clear();
        }
        this.mSaving = false;
        doSave();
    }

    private void doRecord(Message message) {
        if (this.mContext != null && !this.mSaving && this.loaded) {
            this.mSaving = true;
            this.mWorkHandler.removeMessages(4);
            this.mWorkHandler.sendEmptyMessageDelayed(4, 10000L);
        }
        QJ0 qj0 = (QJ0) message.obj;
        String str = qj0.LIZ;
        String str2 = qj0.LIZIZ;
        int i = qj0.LIZJ;
        long j = qj0.LIZLLL;
        Map<String, J7E> map = this.mRecords.get(str);
        if (map == null) {
            map = new HashMap<>(4);
            this.mRecords.put(str, map);
        }
        J7E j7e = map.get(str2);
        if (j7e == null) {
            j7e = new J7E();
        }
        int i2 = message.what;
        if (i2 == 2) {
            j7e.LIZ += i;
            j7e.LIZIZ = -1L;
        } else if (i2 == 3) {
            j7e.LIZIZ += j;
            j7e.LIZ++;
        }
        map.put(str2, j7e);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    save();
                }
            } else {
                doRecord(message);
            }
        } else {
            load();
        }
        return true;
    }

    public void setContext(Context context) {
        this.mContext = context;
        this.mWorkHandler.sendEmptyMessage(1);
    }

    public void setLogger(InterfaceC66740QHg interfaceC66740QHg) {
        this.mLogger = interfaceC66740QHg;
    }

    public void setMonitorUploader(QL2 ql2) {
        this.mUploader = ql2;
    }

    public void setReportInterval(long j) {
        INTERVAL_REPORT = Math.min(j, 3600000L);
    }

    public void record(String str, String str2) {
        recordCount(str, str2, 1);
    }

    public void recordCustom(String str, String str2) {
        recordCustomCount(str, str2, 1);
    }

    public void recordCustomState(String str, String str2) {
        if (str == null) {
            return;
        }
        recordCustomCount(str, str2, 1);
    }

    public void setContext(Context context, long j) {
        this.mContext = context;
        this.mWorkHandler.sendEmptyMessageDelayed(1, j);
    }

    public Monitor(Looper looper, QL2 ql2, String str) {
        this.mStoreFilePrefix = str;
        this.mUploader = ql2;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("bd_monitor_wt");
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        this.mWorkHandler = new Handler(looper, this);
        this.mLogger = new C68880R1o();
    }

    public void recordCount(String str, String str2, int i) {
        if (str == null || str2 == null || i <= 0) {
            return;
        }
        recordCustomCount(str, str2, i);
    }

    public void recordCustomCount(String str, String str2, int i) {
        if (str == null || str2 == null || i <= 0) {
            return;
        }
        this.mWorkHandler.obtainMessage(2, new QJ0(str, str2, i, -1L)).sendToTarget();
    }

    public void recordCustomTime(String str, String str2, long j) {
        if (str == null || str2 == null || j <= 0) {
            return;
        }
        this.mWorkHandler.obtainMessage(3, new QJ0(str, str2, 0, j)).sendToTarget();
    }

    public void recordTime(String str, String str2, long j) {
        if (str == null || str2 == null || j <= 0) {
            return;
        }
        recordCustomTime(str, str2, j);
    }
}
