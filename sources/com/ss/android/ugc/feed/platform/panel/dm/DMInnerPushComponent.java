package com.ss.android.ugc.feed.platform.panel.dm;

import X.C221108m2;
import X.C55614LsA;
import X.C55615LsB;
import X.C55616LsC;
import X.C62822Ol8;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DMInnerPushComponent extends BasePanelComponent {
    public C55615LsB LJLILLLLZI;
    public int LJLJJL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 725));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C55616LsC.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C55614LsA.LJLIL);

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            C55615LsB c55615LsB = this.LJLILLLLZI;
            if (c55615LsB != null) {
                iViewPagerComponentAbility.Cp(c55615LsB);
            } else {
                o.LJIJI("changeListener");
                throw null;
            }
        }
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LJLILLLLZI = new C55615LsB(this);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            C55615LsB c55615LsB = this.LJLILLLLZI;
            if (c55615LsB != null) {
                iViewPagerComponentAbility.De0(c55615LsB);
            } else {
                o.LJIJI("changeListener");
                throw null;
            }
        }
    }
}
