package X;

import Y.ARunnableS18S0000000_11;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.view.Choreographer;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EWV extends EG4 {
    public final /* synthetic */ MainLooperOptService LJLIL;

    public EWV(MainLooperOptService mainLooperOptService) {
        this.LJLIL = mainLooperOptService;
    }

    @Override // X.EG4, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        MainLooperOptService mainLooperOptService = this.LJLIL;
        Choreographer choreographer = mainLooperOptService.LJLJLLL;
        if (choreographer == null) {
            return;
        }
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: X.EWT
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                int i;
                if (((Boolean) C34710Djm.LJJLIIJ.getValue()).booleanValue()) {
                    Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                    if (JatoXL.isInited()) {
                        try {
                            i = EUS.LIZIZ(((Long) C36496EUa.LIZ(Thread.class, "nativePeer").get(LLLLIIIILLL)).longValue() + 12);
                        } catch (Throwable unused) {
                            i = -1;
                        }
                        EVM.LIZ(i, -20);
                        CpusetManager.bindBigCore(i);
                    }
                }
                C56672Kh.LIZ().LJJIII = EHX.MAIN_MEASURE;
                FAJ.LJFF("cold_boot_main_resume_to_measure", true);
                FAJ.LIZ("cold_boot_main_measure_duration", true);
                FAJ.LIZ("measure_begin_to_fragment_create", true);
                EWU.LIZIZ("cold_boot_main_resume_to_measure");
                if (((Boolean) C35143Dql.LIZJ.getValue()).booleanValue()) {
                    C38995FSd.LIZIZ().execute(new ARunnableS18S0000000_11(30));
                }
                FAK LIZ = C56672Kh.LIZ();
                FAV stage = FAV.RESUME_TO_FOCUS;
                LIZ.getClass();
                o.LJIIIZ(stage, "stage");
                LIZ.LJJIJIIJI = FAV.OTHER;
            }
        });
        try {
            MainLooperOptService.LJ(mainLooperOptService.LJLJLLL, new IDRunnableS6S0101000(6, mainLooperOptService, 1));
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
        }
    }
}
