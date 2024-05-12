package X;

import Y.ARunnableS8S0301000_7;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS49S1200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUS extends GUX {
    public volatile AbstractC41437GOb LJLIL;
    public volatile int LJLILLLLZI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final /* synthetic */ GUQ LJLJI;

    public GUS(GUQ guq) {
        this.LJLJI = guq;
    }

    public final boolean LIZ(AbstractC41437GOb abstractC41437GOb, String str) {
        if ((abstractC41437GOb instanceof C41442GOg) || (abstractC41437GOb instanceof C41438GOc)) {
            return true;
        }
        GUQ guq = this.LJLJI;
        guq.getClass();
        if ((abstractC41437GOb instanceof GOS) && o.LJ(((GOS) abstractC41437GOb).LIZ, GAI.LIZ)) {
            return false;
        }
        C07950Sx c07950Sx = guq.LJLJJLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(", require cancel, but state:");
        LIZ.append(abstractC41437GOb);
        c07950Sx.LIZ(X1D.LIZIZ(LIZ));
        return false;
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        if (this.LJLILLLLZI > i && e1.LIZ(31744, "studio_correct_publish_progress", true, false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("previous progress (");
            C15890jp.LIZIZ(LIZ, this.LJLILLLLZI, ") is greater than current progress (", i, "), ignore");
            H78.LJI(X1D.LIZIZ(LIZ));
            return;
        }
        this.LJLILLLLZI = i;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishParallel PublishTask(");
        C0EH.LIZLLL(LIZ2, this.LJLJI.LJLJJL.LIZIZ, ") onProgress ", i, " callbackList size ");
        LIZ2.append(((ArrayList) this.LJLJI.LJLJLJ).size());
        H78.LJI(X1D.LIZIZ(LIZ2));
        GUQ guq = this.LJLJI;
        guq.LJLJJI.execute(new ARunnableS8S0301000_7(i, this, guq, obj, 0));
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishParallel PublishTask(");
        LIZ.append(this.LJLJI.LJLJJL.LIZIZ);
        LIZ.append(") onFinish ");
        LIZ.append(result);
        LIZ.append(" callbackList size ");
        LIZ.append(((ArrayList) this.LJLJI.LJLJLJ).size());
        H78.LJI(X1D.LIZIZ(LIZ));
        if ((result instanceof C41505GQr) || (result instanceof C41614GUw)) {
            GUQ guq = this.LJLJI;
            guq.LJLJI.LJIIIIZZ(guq.LJLJJL);
        } else if (result instanceof C41478GPq) {
            GUQ guq2 = this.LJLJI;
            guq2.LJLJI.LJIIIIZZ(guq2.LJLJJL);
        } else if ((result instanceof C41477GPp) || this.LJLJI.LJLLILLLL) {
            GUQ guq3 = this.LJLJI;
            guq3.LJLJI.LJIIIIZZ(guq3.LJLJJL);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PublishTask PublishCallback  onFinish=Cancel publishid=");
            LIZ2.append(this.LJLJI.LJLJJL.LIZIZ);
            H78.LIZ(X1D.LIZIZ(LIZ2));
            if (GUW.LIZ() && this.LJLJI.LJLJJL.LIZ.publishType == 0) {
                GUQ guq4 = this.LJLJI;
                Iterator it = ((ArrayList) guq4.LJLJLJ).iterator();
                while (it.hasNext()) {
                    GUX gux = (GUX) it.next();
                    if (gux instanceof C41604GUm) {
                        if (!(((C41604GUm) gux).LJLIL instanceof InterfaceC41602GUk)) {
                            guq4.LJLJJL.LIZJ.add(gux);
                        }
                    } else if (!(gux instanceof InterfaceC41602GUk)) {
                        guq4.LJLJJL.LIZJ.add(gux);
                    }
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("cancelTaskCallbackList  size=");
                LIZ3.append(this.LJLJI.LJLJJL.LIZJ.size());
                H78.LIZ(X1D.LIZIZ(LIZ3));
            } else {
                GUQ guq5 = this.LJLJI;
                guq5.LJLJI.LJIIIIZZ(guq5.LJLJJL);
            }
        }
        GUQ guq6 = this.LJLJI;
        guq6.LJLJJI.execute(new GUR(this, guq6, result, obj, publishModel));
    }

    @Override // X.GUX
    public final void onStageUpdate(String stage, AbstractC41758GaA state, Object obj) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(state, "state");
        AbstractC41437GOb abstractC41437GOb = null;
        if (o.LJ(stage, "STAGE_SYNTHETIC_PAUSE")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel PublishTask(");
            H78.LJI(JBR.LJFF(LIZ, this.LJLJI.LJLJJL.LIZIZ, ") paused", LIZ));
            AbstractC41437GOb abstractC41437GOb2 = this.LJLJI.LJLJJL.LIZLLL;
            C41438GOc c41438GOc = C41438GOc.LIZ;
            if (!o.LJ(abstractC41437GOb2, c41438GOc)) {
                abstractC41437GOb = abstractC41437GOb2;
            }
            this.LJLIL = abstractC41437GOb;
            this.LJLJI.LJLJJL.LIZ(c41438GOc);
        } else if (o.LJ(stage, "STAGE_SYNTHETIC_RESUME")) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PublishParallel PublishTask(");
            H78.LJI(JBR.LJFF(LIZ2, this.LJLJI.LJLJJL.LIZIZ, ") resumed", LIZ2));
            GUU guu = this.LJLJI.LJLJJL;
            AbstractC41437GOb abstractC41437GOb3 = this.LJLIL;
            if (abstractC41437GOb3 == null) {
                abstractC41437GOb3 = new C41442GOg(0, null);
            }
            guu.LIZ(abstractC41437GOb3);
            this.LJLIL = null;
        }
        this.LJLJI.LIZLLL(new AqS49S1200000_7(stage, state, obj, 0));
    }
}
