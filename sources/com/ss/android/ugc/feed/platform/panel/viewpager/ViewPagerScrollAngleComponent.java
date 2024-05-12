package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.C221108m2;
import X.C221138m5;
import X.C51781KTx;
import X.C52891KpL;
import X.C52893KpN;
import X.C54442LYg;
import X.C56509MFt;
import X.C5H3;
import X.C62822Ol8;
import X.C80796VnM;
import X.EnumC221088m0;
import X.JAK;
import X.KR8;
import X.KU4;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS65S0110000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ViewPagerScrollAngleComponent extends BasePanelUIComponent {
    public final C5H3 LJLJJI;
    public final C221138m5 LJLJJL;
    public C54442LYg LJLJJLL;
    public C80796VnM LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewPagerScrollAngleComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS159S0100000_9((KU4) this, 746), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS65S0110000_9(false, (KU4) this, 6));
        }
        this.LJLJJI = c62822Ol8;
        this.LJLJJL = KR8.LJIIJJI(new AqS159S0100000_9(this, 747));
    }

    public final void v3() {
        Aweme currentAweme;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJL.getValue();
        if (iViewPagerComponentAbility != null && (currentAweme = iViewPagerComponentAbility.getCurrentAweme()) != null && currentAweme.getAwemeType() == 101) {
            C80796VnM c80796VnM = this.LJLJL;
            if (c80796VnM != null) {
                c80796VnM.setSlideAngle(((Number) C52891KpL.LIZ.getValue()).intValue());
                return;
            }
            return;
        }
        C80796VnM c80796VnM2 = this.LJLJL;
        if (c80796VnM2 == null) {
            return;
        }
        c80796VnM2.setSlideAngle(30);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        super.onDestroy();
        C54442LYg c54442LYg = this.LJLJJLL;
        if (c54442LYg != null && (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJL.getValue()) != null) {
            iViewPagerComponentAbility.Cp(c54442LYg);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJL = (C80796VnM) view.findViewById(R.id.ncx);
        if (((Number) C52893KpN.LIZ.getValue()).intValue() > 0 || (C56509MFt.LJIIJ(getPanelContext()) | C56509MFt.LJIIIIZZ(getPanelContext()))) {
            C80796VnM c80796VnM = this.LJLJL;
            if (c80796VnM != null) {
                c80796VnM.setSlideAngle(30);
            }
            this.LJLJJLL = new C54442LYg(this);
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJL.getValue();
            if (iViewPagerComponentAbility != null) {
                iViewPagerComponentAbility.De0(this.LJLJJLL);
            }
            v3();
        }
    }
}
