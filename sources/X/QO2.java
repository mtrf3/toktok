package X;

import Y.ARunnableS47S0100000_11;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QO2 {
    public final List<QO3> LIZ = new ArrayList();
    public volatile boolean LIZIZ = false;
    public final int LIZJ;

    public final void LIZIZ() {
        try {
            QNB qnb = QNC.LIZ;
            ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(this, 143);
            QNL qnl = qnb.LIZIZ;
            if (qnl != null) {
                qnl.post(aRunnableS47S0100000_11);
            }
        } catch (Exception unused) {
        }
    }

    public QO2(int i) {
        this.LIZJ = LiveEffectMusicFadeDurationSetting.DEFAULT;
        if (i > 6000) {
            this.LIZJ = i;
        }
    }

    public final void LIZ(MotionEvent motionEvent) {
        if (!this.LIZIZ) {
            try {
                if (((ArrayList) this.LIZ).size() < this.LIZJ) {
                    int action = motionEvent.getAction();
                    try {
                        QO3 qo3 = new QO3();
                        qo3.LIZ = motionEvent.getPressure();
                        qo3.LIZIZ = motionEvent.getTouchMajor();
                        qo3.LIZJ = motionEvent.getX();
                        qo3.LIZLLL = motionEvent.getY();
                        qo3.LJ = motionEvent.getEventTime();
                        qo3.LJFF = motionEvent.getAction();
                        ((ArrayList) this.LIZ).add(qo3);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("events : ");
                        LIZ.append(((ArrayList) this.LIZ).size());
                        X1D.LIZIZ(LIZ);
                        if (action != 1) {
                            return;
                        }
                    } catch (Exception unused) {
                        if (action != 1) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (action != 1) {
                            throw th;
                        }
                        this.LIZIZ = true;
                        LIZIZ();
                        throw th;
                    }
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            this.LIZIZ = true;
            LIZIZ();
        }
    }
}
