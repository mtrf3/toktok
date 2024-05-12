package X;

import android.content.Context;
import com.bytedance.applog.monitor.Monitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIB {
    public static final List<String> LIZJ = Collections.singletonList("AppLogMonitor");
    public Monitor LIZ;
    public final QI3 LIZIZ;

    public QIB(QI3 qi3) {
        this.LIZIZ = qi3;
    }

    public static String LIZ(QI2 qi2) {
        if (qi2 == null) {
            return "";
        }
        if (qi2 instanceof QIA) {
            return ((QIA) qi2).LLD;
        }
        if (qi2 instanceof QIC) {
            return ((QIC) qi2).LLF;
        }
        if (qi2 instanceof QIG) {
            return ((QIG) qi2).LLD;
        }
        if (qi2 instanceof QIH) {
            return "launch";
        }
        if (qi2 instanceof QIM) {
            return "terminate";
        }
        if (qi2 instanceof C66750QHq) {
            return "pack";
        }
        return "unknown_event_type";
    }

    public static QIK LIZIZ(C66750QHq c66750QHq) {
        QIK qik = QIK.f_net;
        int i = c66750QHq.LLF;
        if (i < 0) {
            return QIK.f_net_minus;
        }
        if (i == 0) {
            return QIK.f_net_zero;
        }
        if (i == 10) {
            return QIK.f_net_10;
        }
        if (i == 11) {
            return QIK.f_net_11;
        }
        if (i == 12) {
            return QIK.f_net_12;
        }
        if (i == 13) {
            return QIK.f_net_13;
        }
        if (i == 14) {
            return QIK.f_net_14;
        }
        if (i == 15) {
            return QIK.f_net_15;
        }
        if (i < 200) {
            return QIK.f_net_1xx;
        }
        if (i < 300) {
            return QIK.f_net_2xx;
        }
        if (i < 400) {
            return QIK.f_net_3xx;
        }
        if (i < 500) {
            return QIK.f_net_4xx;
        }
        if (i >= 600) {
            return qik;
        }
        return QIK.f_net_5xx;
    }

    public final synchronized void LIZLLL(Context context, String str) {
        LIZJ(context, Monitor.INTERVAL_REPORT, str);
    }

    public final void LJ(QIQ qiq, QIK qik) {
        Monitor monitor = this.LIZ;
        if (monitor == null) {
            return;
        }
        monitor.record(qiq.name(), qik.name());
    }

    public final void LJFF(QI2 qi2, QIK qik) {
        QIQ qiq;
        Monitor monitor = this.LIZ;
        if (monitor == null) {
            return;
        }
        if (qi2 == null) {
            qiq = QIQ.monitor_default;
        } else if (qi2 instanceof QIA) {
            qiq = QIQ.event;
        } else if (qi2 instanceof QIC) {
            qiq = QIQ.event_v3;
        } else if (qi2 instanceof QIG) {
            qiq = QIQ.log_data;
        } else if (qi2 instanceof QIH) {
            qiq = QIQ.launch;
        } else if (qi2 instanceof QIM) {
            qiq = QIQ.terminate;
        } else if (qi2 instanceof C66750QHq) {
            qiq = QIQ.pack;
        } else {
            qiq = QIQ.monitor_default;
        }
        monitor.record(qiq.name(), qik.name());
    }

    public final void LJII(List<C66750QHq> list, QIK qik) {
        QIK qik2;
        if (this.LIZ != null && list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() == 0) {
                return;
            }
            this.LIZ.recordCount(QIQ.pack.name(), qik.name(), arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C66750QHq c66750QHq = (C66750QHq) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(c66750QHq.LLIIJI);
                    int optInt = jSONObject.optInt("LAUNCH");
                    int optInt2 = jSONObject.optInt("TERMINATE");
                    int optInt3 = jSONObject.optInt("EVENT_V1");
                    int optInt4 = jSONObject.optInt("EVENT_V3");
                    int optInt5 = jSONObject.optInt("MISC");
                    int optInt6 = jSONObject.optInt("IMPRESSION");
                    if (qik == QIK.f_net) {
                        qik2 = LIZIZ(c66750QHq);
                    } else {
                        qik2 = qik;
                    }
                    String name = qik2.name();
                    this.LIZ.recordCount(QIQ.launch.name(), name, optInt);
                    this.LIZ.recordCount(QIQ.terminate.name(), name, optInt2);
                    this.LIZ.recordCount(QIQ.event.name(), name, optInt3);
                    this.LIZ.recordCount(QIQ.event_v3.name(), name, optInt4);
                    this.LIZ.recordCount(QIQ.log_data.name(), name, optInt5);
                    this.LIZ.recordCount(QIQ.item_impression.name(), name, optInt6);
                } catch (Exception e) {
                    this.LIZIZ.LJJIZ.LJIILL(LIZJ, "recordCountInPack failed", e, new Object[0]);
                }
            }
        }
    }

    public final void LJIIIIZZ(QIQ qiq, String str) {
        Monitor monitor = this.LIZ;
        if (monitor == null) {
            return;
        }
        monitor.recordCustomState(qiq.name(), str);
    }

    public final synchronized void LIZJ(Context context, long j, String str) {
        if (this.LIZ == null) {
            QJF qjf = new QJF(this);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("@");
            Monitor monitor = new Monitor(null, qjf, X1D.LIZIZ(LIZ));
            this.LIZ = monitor;
            monitor.setContext(context, 10000L);
            this.LIZ.setReportInterval(j);
            this.LIZ.setLogger(this.LIZIZ.LJJIZ);
        }
    }

    public final void LJI(QIQ qiq, QIK qik, int i) {
        Monitor monitor = this.LIZ;
        if (monitor == null) {
            return;
        }
        monitor.recordCount(qiq.name(), qik.name(), i);
    }

    public final void LJIIIZ(QIQ qiq, QIK qik, long j) {
        Monitor monitor = this.LIZ;
        if (monitor == null) {
            return;
        }
        monitor.recordTime(qiq.name(), qik.name(), j);
    }
}
