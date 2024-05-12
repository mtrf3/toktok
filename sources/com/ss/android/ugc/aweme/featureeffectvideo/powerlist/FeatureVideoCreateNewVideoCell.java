package com.ss.android.ugc.aweme.featureeffectvideo.powerlist;

import X.C16880lQ;
import X.C240209bk;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeatureVideoCreateNewVideoCell extends PowerCell<C240209bk> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.avd);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C240209bk c240209bk, List payloads) {
        C240209bk t = c240209bk;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(t, 260), this.itemView);
    }
}
