package Y;

import X.C09900aA;
import X.C0NB;
import X.C0NE;
import X.C16880lQ;
import X.C28733BPl;
import X.C2V;
import X.C38330F2o;
import X.C38977FRl;
import X.C64096PDo;
import X.C82887Wfz;
import X.C83573Wr3;
import X.FCD;
import X.QM6;
import X.QM7;
import X.QM8;
import X.QMB;
import X.X1D;
import X.XNE;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ies.effecteditor.swig.EEStdStringVector;
import com.bytedance.ies.effecteditor.swig.EffectEditorJni;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2;
import defpackage.a1;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDRunnableS0S1201000 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDRunnableS0S1201000 iDRunnableS0S1201000) {
        QM8 qm8;
        switch (iDRunnableS0S1201000.i3) {
            case 0:
                C0NE c0ne = (C0NE) iDRunnableS0S1201000.l1;
                String str = iDRunnableS0S1201000.s0;
                Map map = (Map) iDRunnableS0S1201000.l2;
                c0ne.getClass();
                C0NB.LIZIZ(str, c0ne.LJFF(str, C0NE.LJIIJJI(map)));
                return;
            default:
                List<QMB> readConfigList = (List) iDRunnableS0S1201000.l1;
                Context context = (Context) iDRunnableS0S1201000.l2;
                String key = iDRunnableS0S1201000.s0;
                o.LJIIIZ(readConfigList, "$readConfigList");
                o.LJIIIZ(context, "$context");
                o.LJIIIZ(key, "$key");
                for (QMB qmb : readConfigList) {
                    if (FCD.LJFF(context, qmb.LIZ)) {
                        QM6.LJFF.add(qmb.LIZ);
                    }
                }
                boolean z = false;
                for (QMB qmb2 : readConfigList) {
                    try {
                        if (!FCD.LJFF(context, qmb2.LIZ)) {
                            QM6.LJ(new QM8(qmb2.LIZ, "no install", false, 8));
                        } else if (!QM6.LIZIZ(qmb2.LIZ)) {
                            QM6.LJ(new QM8(qmb2.LIZ, "not support", false, 8));
                        } else {
                            z = true;
                            if (qmb2.LIZJ) {
                                qm8 = QM6.LJFF(qmb2, key);
                                if (qm8.LIZIZ) {
                                    QM6.LJ(qm8);
                                    if (!TextUtils.isEmpty(qm8.LJFF)) {
                                        return;
                                    }
                                }
                            } else {
                                qm8 = null;
                            }
                            if (qmb2.LIZLLL) {
                                QM8 LJI = QM6.LJI(qmb2, key);
                                if (LJI.LIZIZ) {
                                    QM6.LJ(LJI);
                                    if (!TextUtils.isEmpty(LJI.LJFF)) {
                                        return;
                                    }
                                }
                            }
                            if (qmb2.LJ) {
                                QM6.LIZLLL.post(new ARunnableS14S0201000_11(0, key, qmb2, 7));
                            } else {
                                if (qm8 == null) {
                                    qm8 = new QM8(qmb2.LIZ, "have no valid query type", false, 8);
                                }
                                QM6.LJ(qm8);
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        QM7 qm7 = new QM7();
                        qm7.LIZJ("share_sdk_read_data_err");
                        qm7.LIZIZ(e.getMessage(), "err_msg");
                        qm7.LIZIZ(Log.getStackTraceString(e), "err_msg_stack");
                        qm7.LIZLLL();
                        QM6.LJ(new QM8(2, qmb2.LIZ, "read form provider", false));
                    }
                }
                if (!z) {
                    QM6.LJ(new QM8(2, "", "no valid query pkg", false));
                    return;
                }
                return;
        }
    }

    public static final void run$1(IDRunnableS0S1201000 iDRunnableS0S1201000) {
        switch (iDRunnableS0S1201000.i3) {
            case 0:
                C0NE c0ne = (C0NE) iDRunnableS0S1201000.l1;
                String str = iDRunnableS0S1201000.s0;
                Map map = (Map) iDRunnableS0S1201000.l2;
                c0ne.getClass();
                c0ne.LJIIIZ(str, C0NE.LJIIJJI(map));
                return;
            default:
                SimDtReportServiceV2.m183lambda$semisugar$reportVideoPlayStart$lambda0$0((Callable) iDRunnableS0S1201000.l1, (SimDtReportServiceV2) iDRunnableS0S1201000.l2, iDRunnableS0S1201000.s0);
                return;
        }
    }

    public static final void run$2(IDRunnableS0S1201000 iDRunnableS0S1201000) {
        switch (iDRunnableS0S1201000.i3) {
            case 0:
                C0NE c0ne = (C0NE) iDRunnableS0S1201000.l1;
                String str = iDRunnableS0S1201000.s0;
                Map map = (Map) iDRunnableS0S1201000.l2;
                c0ne.getClass();
                C0NB.LJ(str, c0ne.LJFF(str, C0NE.LJIIJJI(map)));
                return;
            case 1:
                XNE xne = (XNE) iDRunnableS0S1201000.l1;
                String str2 = iDRunnableS0S1201000.s0;
                C2V c2v = (C2V) iDRunnableS0S1201000.l2;
                xne.getClass();
                String substring = str2.substring(str2.lastIndexOf(".") + 1);
                String LIZJ = C38330F2o.LIZJ(str2);
                if (LIZJ == null) {
                    LIZJ = UUID.randomUUID().toString();
                }
                String LJ = a1.LJ(LIZJ, ".", substring);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(xne.LIZLLL);
                String str3 = C38977FRl.LIZ;
                LIZ.append(str3);
                LIZ.append(EffectEditorJni.kUIAnnotationCallbackTypeVlExtra());
                LIZ.append(str3);
                LIZ.append(LJ);
                if (C38977FRl.LIZ(str2, X1D.LIZIZ(LIZ))) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str3);
                    LIZ2.append(EffectEditorJni.kUIAnnotationCallbackTypeVlExtra());
                    LIZ2.append(str3);
                    LIZ2.append(LJ);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    U u = xne.LIZJ;
                    if (u != 0) {
                        u.updateValue(new EEStdStringVector(new String[]{LIZIZ}));
                    }
                    C83573Wr3.LIZ(c2v);
                    C82887Wfz.LIZIZ();
                    return;
                }
                C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
                C82887Wfz.LIZIZ();
                return;
            default:
                SimDtReportServiceV2.m184lambda$semisugar$reportVideoPlayTime$lambda5$0((SimDtReportServiceV2) iDRunnableS0S1201000.l1, iDRunnableS0S1201000.s0, (Callable) iDRunnableS0S1201000.l2);
                return;
        }
    }

    public static final void run$3(IDRunnableS0S1201000 iDRunnableS0S1201000) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = new C64096PDo(iDRunnableS0S1201000.s0, iDRunnableS0S1201000.i3, (JSONObject) iDRunnableS0S1201000.l1, null, null, (JSONObject) iDRunnableS0S1201000.l2).LIZ();
            if (LIZ2 != null) {
                C09900aA.LJIILLIIL("monitorStatusAndDuration", LIZ2.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS0S1201000(Context context, List list, int i) {
        this.$t = i;
        this.i3 = 1;
        this.l1 = list;
        this.l2 = context;
        this.s0 = "key_account_info";
    }

    public IDRunnableS0S1201000(C28733BPl c28733BPl, String str, Map map, int i) {
        this.$t = i;
        this.i3 = 0;
        this.l1 = c28733BPl;
        this.s0 = str;
        this.l2 = map;
    }

    public IDRunnableS0S1201000(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable, int i) {
        this.$t = i;
        this.i3 = 1;
        this.l1 = callable;
        this.l2 = simDtReportServiceV2;
        this.s0 = str;
    }

    public IDRunnableS0S1201000(String str, int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
