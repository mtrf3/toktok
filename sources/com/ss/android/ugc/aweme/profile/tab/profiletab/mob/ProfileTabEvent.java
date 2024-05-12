package com.ss.android.ugc.aweme.profile.tab.profiletab.mob;

import X.C188727au;
import X.FMX;

/* loaded from: classes2.dex */
public final class ProfileTabEvent implements IProfileTabEventAbility {
    public long LJLIL;
    public int LJLILLLLZI;
    public long LJLJI;

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.mob.IProfileTabEventAbility
    public final void sh0() {
        this.LJLILLLLZI++;
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.mob.IProfileTabEventAbility
    public final void x60() {
        this.LJLJI = (System.currentTimeMillis() - this.LJLIL) + this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.mob.IProfileTabEventAbility
    public final void B6() {
        this.LJLIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.mob.IProfileTabEventAbility
    public final void RS(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJ(this.LJLJI, "duration");
        c188727au.LIZLLL(this.LJLILLLLZI, "load_times");
        FMX.LJIIL("tab_load_time", c188727au.LIZ);
        this.LJLIL = 0L;
        this.LJLILLLLZI = 0;
        this.LJLJI = 0L;
    }
}
