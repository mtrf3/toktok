package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import X.C93603ls;
import X.C93613lt;
import X.C93623lu;
import X.InterfaceC57784Mm4;
import X.ORZ;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchResultListCell extends BaseContactListCell<C93613lt> {
    @Override // com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.BaseContactListCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: P, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C93613lt item) {
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        View findViewById = this.itemView.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.name_tv)");
        C93603ls.LIZIZ((TextView) findViewById, item.LJLIL.getDisplayName(), item.LJLJI);
        View findViewById2 = this.itemView.findViewById(R.id.c9f);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.detail_tv)");
        C93603ls.LIZIZ((TextView) findViewById2, item.LJLIL.getUniqueId(), item.LJLJI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4, List payloads) {
        C93613lt t = (C93613lt) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        Object LJLLLLLL = ORZ.LJLLLLLL(0, payloads);
        if ((LJLLLLLL instanceof C93623lu) && ((C93623lu) LJLLLLLL).LJLIL) {
            View findViewById = this.itemView.findViewById(R.id.gw7);
            o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.name_tv)");
            C93603ls.LIZIZ((TextView) findViewById, t.LJLIL.getDisplayName(), t.LJLJI);
            View findViewById2 = this.itemView.findViewById(R.id.c9f);
            o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.detail_tv)");
            C93603ls.LIZIZ((TextView) findViewById2, t.LJLIL.getUniqueId(), t.LJLJI);
        }
    }
}
