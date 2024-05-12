package com.ss.android.ugc.aweme.feed.assem.commoditycard;

import X.C2K0;
import X.C55096Ljo;
import X.C8M4;
import X.InterfaceC55102Lju;
import X.OUP;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CustomCommodityCardAssem extends BaseCellContentComponent implements ICommodityCardAbility, InterfaceC55102Lju {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 2048052340) {
            return null;
        }
        return this;
    }

    public CustomCommodityCardAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.commoditycard.ICommodityCardAbility
    public final void qf() {
        OUP.LJJJ(this, "event_commodity_card", new C8M4(201L));
        getContainerView().postDelayed(new ARunnableS39S0100000_3(this, 197), 201L);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.commoditycard.ICommodityCardAbility
    public final void Tt() {
        if (getContainerView() instanceof ViewGroup) {
            ((ViewGroup) getContainerView()).removeAllViews();
        }
        OUP.LJJJ(this, "event_commodity_card", new C8M4(0L));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }
}
