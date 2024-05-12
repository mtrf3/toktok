package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C221108m2;
import X.C62822Ol8;
import X.JN1;
import Y.IDCListenerS245S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ext_power_list.AssemPowerCell;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchTakoSugCell extends AssemPowerCell<SearchTakoSugAssem, JN1> {
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 219));

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final SearchTakoSugAssem L() {
        return new SearchTakoSugAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View onCreateItemView = super.onCreateItemView(parent);
        onCreateItemView.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 6));
        return onCreateItemView;
    }
}
