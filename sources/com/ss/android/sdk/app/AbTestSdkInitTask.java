package com.ss.android.sdk.app;

import X.AnonymousClass027;
import X.C0RN;
import X.C35039Dp5;
import X.C36922EeM;
import X.C38680FGa;
import X.C38684FGe;
import X.C38686FGg;
import X.C38687FGh;
import X.C38691FGl;
import X.C38696FGq;
import X.C43588H8u;
import X.C76L;
import X.E8L;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FH5;
import X.InterfaceC195747mE;
import X.InterfaceC36076EDw;
import X.RunnableC38685FGf;
import X.TTL;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.setting.TiktokSkinHelper;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AbTestSdkInitTask implements EE1, InterfaceC36076EDw {
    public static volatile boolean LJLIL;

    /* loaded from: classes7.dex */
    public interface AbTestApi {
        @E8L
        C76L<String> doGet(@InterfaceC195747mE String str);
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "AbTestSdkInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        return 2;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1048577;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public static void LIZLLL(Context context) {
        C36922EeM.LJ("AbTestSdkInitTask");
        String str = C35039Dp5.LIZ;
        FH5 LIZIZ = FH5.LIZIZ();
        LIZIZ.LIZJ = new C38680FGa();
        if (LIZIZ.LIZJ != null && LIZIZ.LIZJ.LIZJ() && LIZIZ.LIZJ.LIZLLL() != null) {
            LIZIZ.LIZJ.LIZLLL().init(context);
        }
        Application application = (Application) context;
        String trim = str.trim();
        C38687FGh c38687FGh = new C38687FGh();
        C38684FGe c38684FGe = new C38684FGe();
        TTL ttl = new TTL();
        C43588H8u c43588H8u = new C43588H8u();
        C38691FGl.LJFF.getClass();
        o.LJIIJ(application, "application");
        C38691FGl.LIZIZ = application;
        if (!C38686FGg.LJ) {
            Object obj = C38686FGg.LJII;
            synchronized (obj) {
                if (!C38686FGg.LJ) {
                    C38686FGg.LIZLLL = C38696FGq.LIZ(new RunnableC38685FGf(application, c38684FGe, c38687FGh, c43588H8u, ttl, trim));
                    C38686FGg.LJ = true;
                    C38686FGg.LJFF = true;
                }
                obj.notifyAll();
            }
        } else {
            C38686FGg.LIZ = c38687FGh;
        }
        AnonymousClass027.LJJIII(1);
        TiktokSkinHelper.LIZ(context.getResources());
        TiktokSkinHelper.LIZ = true;
        AwemeConfigCenter.LIZIZ.set(true);
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!LJLIL) {
            synchronized (AbTestSdkInitTask.class) {
                if (!LJLIL) {
                    LIZLLL(context);
                    LJLIL = true;
                }
            }
        }
    }
}
