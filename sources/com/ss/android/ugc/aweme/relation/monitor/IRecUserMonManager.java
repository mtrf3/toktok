package com.ss.android.ugc.aweme.relation.monitor;

import X.C2K0;
import X.C57819Mmd;
import X.C78657Utx;
import X.C78658Uty;
import X.EnumC57383Mfb;
import X.EnumC78629UtV;
import X.InterfaceC78660Uu0;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes10.dex */
public interface IRecUserMonManager extends C2K0 {
    RecUserBehaviorMonImpl Pz(Lifecycle lifecycle, C57819Mmd c57819Mmd, int i);

    C78658Uty be0(String str, String str2, EnumC57383Mfb enumC57383Mfb, InterfaceC78660Uu0 interfaceC78660Uu0);

    C78657Utx kK(String str, String str2, int i, EnumC57383Mfb enumC57383Mfb);

    RelationPageMonitor mP(Lifecycle lifecycle, C57819Mmd c57819Mmd);

    RecUserPopupMonImpl rq0(C57819Mmd c57819Mmd, EnumC78629UtV enumC78629UtV);
}
