package com.ss.android.ugc.aweme.relation.monitor;

import X.C57819Mmd;
import X.C78657Utx;
import X.C78658Uty;
import X.EnumC57383Mfb;
import X.EnumC78629UtV;
import X.InterfaceC78660Uu0;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RecUserMonManagerImpl implements IRecUserMonManager {
    public static final RecUserMonManagerImpl LJLIL = new RecUserMonManagerImpl();
    public static final MonitorSamplingConfig LJLILLLLZI = MonitorSamplingConfig.LIZ;

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final RelationPageMonitor mP(Lifecycle lifecycle, C57819Mmd c57819Mmd) {
        o.LJIIIZ(lifecycle, "lifecycle");
        LJLILLLLZI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJIIIIZZ.getValue()).booleanValue()) {
            return null;
        }
        RelationPageMonitor relationPageMonitor = new RelationPageMonitor(c57819Mmd);
        lifecycle.addObserver(relationPageMonitor);
        return relationPageMonitor;
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final RecUserPopupMonImpl rq0(C57819Mmd c57819Mmd, EnumC78629UtV type) {
        o.LJIIIZ(type, "type");
        LJLILLLLZI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJ.getValue()).booleanValue()) {
            return null;
        }
        return new RecUserPopupMonImpl(c57819Mmd, type);
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final RecUserBehaviorMonImpl Pz(Lifecycle lifecycle, C57819Mmd c57819Mmd, int i) {
        o.LJIIIZ(lifecycle, "lifecycle");
        if (i <= 1000) {
            LJLILLLLZI.getClass();
            if (!((Boolean) MonitorSamplingConfig.LJFF.getValue()).booleanValue()) {
                return null;
            }
            RecUserBehaviorMonImpl recUserBehaviorMonImpl = new RecUserBehaviorMonImpl(c57819Mmd);
            lifecycle.addObserver(recUserBehaviorMonImpl);
            return recUserBehaviorMonImpl;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final C78658Uty be0(String str, String str2, EnumC57383Mfb enumC57383Mfb, InterfaceC78660Uu0 interfaceC78660Uu0) {
        LJLILLLLZI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJI.getValue()).booleanValue()) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C78658Uty(str, str2, enumC57383Mfb, interfaceC78660Uu0);
    }

    @Override // com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager
    public final C78657Utx kK(String enterFrom, String str, int i, EnumC57383Mfb imgType) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(imgType, "imgType");
        LJLILLLLZI.getClass();
        if (!((Boolean) MonitorSamplingConfig.LJI.getValue()).booleanValue()) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        return new C78657Utx(enterFrom, str, i, imgType);
    }
}
