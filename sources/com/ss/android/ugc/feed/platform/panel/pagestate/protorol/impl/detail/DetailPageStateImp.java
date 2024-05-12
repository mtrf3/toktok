package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail;

import X.C221108m2;
import X.C2K0;
import X.C62822Ol8;
import X.KUR;
import X.KUY;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public class DetailPageStateImp extends PageStateCommonComponent {
    public final C62822Ol8 LJLJLLL;

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC55102Lju
    public C2K0 provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    public DetailPageStateImp() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 917));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public KUR v3() {
        ILoadMoreAbility PZ;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || this.LJLJLLL.getValue() == null) {
            return null;
        }
        if (this.LJLJJI == null) {
            Context context = fragment.getContext();
            if (context == null) {
                return null;
            }
            KUR kur = new KUR(context, null);
            this.LJLJJI = kur;
            kur.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LJLJLLL.getValue();
            if (iFeedFragmentAbility != null && (PZ = iFeedFragmentAbility.PZ()) != null) {
                PZ.addView(this.LJLJJI, layoutParams);
            }
            KUR kur2 = this.LJLJJI;
            if (kur2 != null) {
                kur2.setBuilder(KUY.LIZ(fragment.mo49getActivity()));
            }
            KUR kur3 = this.LJLJJI;
            if (kur3 != null) {
                kur3.setBackgroundColor(0);
            }
        }
        return this.LJLJJI;
    }
}
