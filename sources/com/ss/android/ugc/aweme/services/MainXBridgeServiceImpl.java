package com.ss.android.ugc.aweme.services;

import X.AbstractC37594EpC;
import X.C38252Ezo;
import X.C38968FRc;
import X.C42641GoP;
import X.C42642GoQ;
import X.C43036Gum;
import X.C43304Gz6;
import X.C45411Hrz;
import X.C47261Igj;
import X.C58096Mr6;
import X.C58829N6z;
import X.C58905N9x;
import X.C60526NpC;
import X.C61177Nzh;
import X.C61478OAw;
import X.C61878OQg;
import X.C61967OTr;
import X.C62199Ob5;
import X.C85404XfU;
import X.C85420Xfk;
import X.C86949YAn;
import X.C86962YBa;
import X.FZ6;
import X.HQV;
import X.MCB;
import X.N7I;
import X.O0A;
import X.O0G;
import X.Y7C;
import com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class MainXBridgeServiceImpl implements IMainXBridgetService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService
    public List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC37594EpC<?, ?>>> list;
        ArrayList LJII = C47261Igj.LJII(C43304Gz6.class, MCB.class, FZ6.class, C61478OAw.class, N7I.class, C43036Gum.class, C38252Ezo.class, C62199Ob5.class, C42641GoP.class, C58829N6z.class, C60526NpC.class, Y7C.class, C61177Nzh.class, C86962YBa.class, C85404XfU.class, C58905N9x.class, C42642GoQ.class, C85420Xfk.class, HQV.class, O0G.class, C86949YAn.class, O0A.class, C45411Hrz.class, C38968FRc.class, C61967OTr.class);
        IShortcutService LJIIJ = TiktokShortcutManager.LJIIJ();
        if (LJIIJ == null || (list = LJIIJ.LIZJ()) == null) {
            list = C61878OQg.INSTANCE;
        }
        LJII.addAll(list);
        return LJII;
    }

    public static IMainXBridgetService createIMainXBridgetServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IMainXBridgetService.class, z);
        if (LIZ != null) {
            return (IMainXBridgetService) LIZ;
        }
        if (C58096Mr6.O5 == null) {
            synchronized (IMainXBridgetService.class) {
                if (C58096Mr6.O5 == null) {
                    C58096Mr6.O5 = new MainXBridgeServiceImpl();
                }
            }
        }
        return C58096Mr6.O5;
    }
}
