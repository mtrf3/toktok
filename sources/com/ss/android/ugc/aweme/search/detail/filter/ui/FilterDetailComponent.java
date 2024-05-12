package com.ss.android.ugc.aweme.search.detail.filter.ui;

import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC51657KPd;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class FilterDetailComponent extends DetailPageComponent {
    public final C62822Ol8 LLIILII;

    public FilterDetailComponent() {
        new LinkedHashMap();
        this.LLIILII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 150));
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void Jk() {
        InterfaceC51657KPd Sl = ((FilterDetailPageFragment) this.LLIILII.getValue()).Sl();
        if (Sl != null && Sl.LIZLLL()) {
            return;
        }
        super.Jk();
    }
}
