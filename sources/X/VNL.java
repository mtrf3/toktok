package X;

import Y.ARunnableS25S0300000_14;
import android.os.Handler;
import android.os.Looper;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.lepus.LepusApiActor;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VNL {
    public final TemplateAssembler LIZ;
    public final ArrayList<VNO> LIZIZ = new ArrayList<>();
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());

    public VNL(TemplateAssembler templateAssembler) {
        this.LIZ = templateAssembler;
    }

    public final void LIZIZ(VNN vnn) {
        int position;
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            String str = vnn.LIZIZ;
            if (templateAssembler.LJIIJ == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sendCustomEvent: ");
                LIZ.append(str);
                LIZ.append(" error: mlepusApiActor is null.");
                LLog.LIZLLL(4, "TemplateAssembler", X1D.LIZIZ(LIZ));
            } else {
                C40053Fnl c40053Fnl = C40053Fnl.LIZ;
                java.util.Map<String, Object> LIZ2 = vnn.LIZ();
                c40053Fnl.getClass();
                ByteBuffer LIZIZ = C40053Fnl.LIZIZ(LIZ2);
                if (LIZIZ == null) {
                    position = 0;
                } else {
                    position = LIZIZ.position();
                }
                String LIZIZ2 = vnn.LIZIZ();
                LepusApiActor lepusApiActor = templateAssembler.LJIIJ;
                int i = vnn.LIZ;
                lepusApiActor.getClass();
                lepusApiActor.LIZIZ(new VNJ(lepusApiActor, str, i, LIZIZ, position, LIZIZ2));
            }
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("sendTouchEvent event: ");
            LIZ3.append(vnn.LIZIZ);
            LIZ3.append(" failed since mTemplateAssembler is null");
            LLog.LIZLLL(4, "EventEmitter", X1D.LIZIZ(LIZ3));
        }
        ARunnableS25S0300000_14 aRunnableS25S0300000_14 = new ARunnableS25S0300000_14(this, VJ4.kLynxEventTypeCustomEvent, vnn, 2);
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            aRunnableS25S0300000_14.run();
        } else {
            this.LIZJ.post(aRunnableS25S0300000_14);
        }
    }

    public final void LIZJ(VNM vnm) {
        VNS vns;
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            String str = vnm.LIZIZ;
            LepusApiActor lepusApiActor = templateAssembler.LJIIJ;
            if (lepusApiActor == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SendTouchEvent: ");
                LIZ.append(str);
                LIZ.append(" error: mlepusApiActor is null.");
                LLog.LIZLLL(4, "TemplateAssembler", X1D.LIZIZ(LIZ));
            } else {
                int i = vnm.LIZ;
                PPO ppo = vnm.LIZJ;
                float f = ppo.LIZ;
                float f2 = ppo.LIZIZ;
                PPO ppo2 = vnm.LIZLLL;
                float f3 = ppo2.LIZ;
                float f4 = ppo2.LIZIZ;
                PPO ppo3 = vnm.LJ;
                lepusApiActor.LIZIZ(new VNI(lepusApiActor, str, i, f, f2, f3, f4, ppo3.LIZ, ppo3.LIZIZ));
            }
            TemplateAssembler templateAssembler2 = this.LIZ;
            String str2 = vnm.LIZIZ;
            WeakReference<VNU> weakReference = templateAssembler2.LJIIJJI;
            if (weakReference != null) {
                vns = weakReference.get().LJI();
            } else {
                vns = null;
            }
            C40154FpO c40154FpO = new C40154FpO(str2, vns);
            VNV vnv = templateAssembler2.LIZJ;
            if (vnv != null) {
                vnv.LJIIL(c40154FpO);
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sendTouchEvent event: ");
        LIZ2.append(vnm.LIZIZ);
        LIZ2.append(" failed since mTemplateAssembler is null");
        LLog.LIZLLL(4, "EventEmitter", X1D.LIZIZ(LIZ2));
    }

    public final void LIZ(int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            LepusApiActor lepusApiActor = templateAssembler.LJIIJ;
            if (lepusApiActor == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onPseudoStatusChanged Fained since mlepusApiActor is null: id ");
                LIZ.append(i);
                LLog.LIZLLL(4, "TemplateAssembler", X1D.LIZIZ(LIZ));
                return;
            }
            lepusApiActor.LIZIZ(new VNK(lepusApiActor, i, i2, i3));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPseudoStatusChanged id: ");
        LIZ2.append(i);
        LIZ2.append(" failed since mTemplateAssembler is null");
        LLog.LIZLLL(4, "EventEmitter", X1D.LIZIZ(LIZ2));
    }
}
