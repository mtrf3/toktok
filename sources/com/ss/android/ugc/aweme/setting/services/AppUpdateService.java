package com.ss.android.ugc.aweme.setting.services;

import X.C17J;
import X.C25552A1c;
import X.C38410F5q;
import X.C40561Fvx;
import X.C40566Fw2;
import X.C40567Fw3;
import X.C47261Igj;
import X.C58096Mr6;
import X.C77123UOp;
import X.E1Q;
import X.InterfaceC55643Lsd;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.android.play.core.appupdate.b;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.experiment.InboxMsgInterceptor;
import com.ss.android.ugc.aweme.setting.experiment.MarketInterceptor;
import com.ss.android.ugc.aweme.setting.lego.BetaAppTask;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AppUpdateService implements IAppUpdateService {
    @Override // com.ss.android.ugc.aweme.setting.services.IAppUpdateService
    public final List<IInterceptor> LIZ() {
        return C47261Igj.LJJIJIIJI(new InboxMsgInterceptor(), new MarketInterceptor());
    }

    public static IAppUpdateService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IAppUpdateService.class, false);
        if (LIZ != null) {
            return (IAppUpdateService) LIZ;
        }
        if (C58096Mr6.w6 == null) {
            synchronized (IAppUpdateService.class) {
                if (C58096Mr6.w6 == null) {
                    C58096Mr6.w6 = new AppUpdateService();
                }
            }
        }
        return C58096Mr6.w6;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IAppUpdateService
    public final BetaAppTask LIZJ() {
        return new BetaAppTask();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IAppUpdateService
    public final void LIZIZ(boolean z, InterfaceC55643Lsd scene) {
        o.LJIIIZ(scene, "scene");
        if (!BetaAppExperiment.LIZJ()) {
            return;
        }
        if (z && BetaAppExperiment.LJII && !C25552A1c.LJLJJI.getBoolean(C25552A1c.LJLJI, false)) {
            PopupManager.LJIIL(new C25552A1c(scene));
        }
        BetaAppExperiment.LJIIIIZZ.getClass();
        C40561Fvx LIZIZ = ((b) BetaAppExperiment.LJI.getValue()).LIZIZ();
        C77123UOp c77123UOp = C77123UOp.LJLIL;
        LIZIZ.getClass();
        E1Q e1q = C38410F5q.LIZ;
        LIZIZ.LIZJ(e1q, c77123UOp);
        C17J c17j = C17J.LJLJJL;
        C40566Fw2<ResultT> c40566Fw2 = LIZIZ.LIZIZ;
        C40567Fw3 c40567Fw3 = new C40567Fw3(e1q, c17j);
        synchronized (c40566Fw2.LIZ) {
            if (c40566Fw2.LIZIZ == null) {
                c40566Fw2.LIZIZ = new ArrayDeque();
            }
            ((ArrayDeque) c40566Fw2.LIZIZ).add(c40567Fw3);
        }
        LIZIZ.LIZLLL();
    }
}
