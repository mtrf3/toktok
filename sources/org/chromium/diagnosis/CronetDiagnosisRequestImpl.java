package org.chromium.diagnosis;

import J.N;
import X.C16880lQ;
import X.InterfaceC66688QFg;
import X.QEK;
import X.QFR;
import X.QFT;
import X.QFU;
import X.QFX;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.ttnet.org.chromium.net.impl.TTCronetNetExpRequest;
import java.util.List;
import org.chromium.CronetClient;

/* loaded from: classes12.dex */
public class CronetDiagnosisRequestImpl implements InterfaceC66688QFg {
    public static final String TAG = C16880lQ.LJLLJ(CronetDiagnosisRequestImpl.class);
    public static QEK sCronetEngine;
    public QFX mCallback;
    public QFT mCronetCallback = new QFT(this);
    public QFU mRequest;

    public static void loadCronetKernel() {
        Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
    }

    @Override // X.InterfaceC66688QFg
    public void cancel() {
        QFU qfu = this.mRequest;
        if (qfu != null) {
            TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) qfu;
            synchronized (tTCronetNetExpRequest.LJIIJ) {
                if (tTCronetNetExpRequest.LJIIIZ && tTCronetNetExpRequest.LJIIIIZZ != 0) {
                    if (tTCronetNetExpRequest.LJIIIIZZ != 0) {
                        N.M6$xRvea(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest);
                        tTCronetNetExpRequest.LJIIIIZZ = 0L;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC66688QFg
    public void start() {
        QFU qfu = this.mRequest;
        if (qfu != null) {
            TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) qfu;
            synchronized (tTCronetNetExpRequest.LJIIJ) {
                if (!tTCronetNetExpRequest.LJIIIZ) {
                    long LJJJJZ = tTCronetNetExpRequest.LIZ.LJJJJZ();
                    int i = tTCronetNetExpRequest.LIZIZ;
                    List<String> list = tTCronetNetExpRequest.LIZJ;
                    long MPJAsrFC = N.MPJAsrFC(tTCronetNetExpRequest, LJJJJZ, i, (String[]) list.toArray(new String[list.size()]), tTCronetNetExpRequest.LIZLLL, tTCronetNetExpRequest.LJ, tTCronetNetExpRequest.LJFF);
                    tTCronetNetExpRequest.LJIIIIZZ = MPJAsrFC;
                    if (MPJAsrFC != 0) {
                        tTCronetNetExpRequest.LJIIIZ = true;
                        N.MLiR9ZbW(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest);
                        return;
                    }
                    throw new NullPointerException("Create native net exp request adapter failed.");
                }
            }
        }
    }

    private QEK getCronetEngine() {
        Logger.debug();
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
            Logger.debug();
        }
        return CronetClient.getCronetEngine();
    }

    @Override // X.InterfaceC66688QFg
    public void doExtraCommand(String str, String str2) {
        QFU qfu = this.mRequest;
        if (qfu != null) {
            TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) qfu;
            synchronized (tTCronetNetExpRequest.LJIIJ) {
                if (tTCronetNetExpRequest.LJIIIZ && tTCronetNetExpRequest.LJIIIIZZ != 0) {
                    N.MDZjmtTn(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest, str, str2);
                }
            }
        }
    }

    public CronetDiagnosisRequestImpl(QFX qfx, int i, List<String> list, int i2, int i3, int i4) {
        this.mCallback = qfx;
        if (sCronetEngine == null) {
            sCronetEngine = getCronetEngine();
        }
        QEK qek = sCronetEngine;
        if (qek != null) {
            QFR LIZIZ = qek.LIZIZ(this.mCronetCallback);
            LIZIZ.getClass();
            LIZIZ.LIZLLL = list;
            LIZIZ.getClass();
            LIZIZ.getClass();
            LIZIZ.getClass();
            this.mRequest = LIZIZ.LIZ.LJJJJI(LIZIZ.LIZJ, LIZIZ.LIZIZ, i, list, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Can not get cronet engine.");
    }
}
