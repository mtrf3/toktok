package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.viewholder;

import X.C16880lQ;
import X.C1DI;
import X.C97073rT;
import X.C97113rX;
import X.C99033ud;
import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSug;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoSugWordCell extends PowerCell<C97073rT> {
    public final String L() {
        C99033ud c99033ud;
        C97073rT item;
        TakoSug takoSug;
        C97073rT item2 = getItem();
        if (item2 == null || (c99033ud = item2.LJLILLLLZI) == null) {
            return "";
        }
        if (o.LJ(c99033ud.getEnterFromForMob(), "homepage_hot_tikbot") && (item = getItem()) != null && (takoSug = item.LJLIL) != null && takoSug.LIZ) {
            return "1";
        }
        return "2";
    }

    public final void M(boolean z) {
        C99033ud c99033ud;
        C97073rT item;
        TakoSug takoSug;
        String str;
        C97073rT item2 = getItem();
        if (item2 == null || (c99033ud = item2.LJLILLLLZI) == null || (item = getItem()) == null || (takoSug = item.LJLIL) == null) {
            return;
        }
        String enterFromForMob = c99033ud.getEnterFromForMob();
        String enterMethod = c99033ud.getEnterMethod();
        String searchId = c99033ud.getSearchId();
        String conversationId = c99033ud.getConversationId();
        String str2 = takoSug.query;
        String L = L();
        String valueOf = String.valueOf(getBindingAdapterPosition());
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C97113rX.LIZ(enterFromForMob, enterMethod, searchId, conversationId, str2, L, valueOf, str, takoSug.LIZIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C97073rT c97073rT) {
        C99033ud c99033ud;
        C97073rT item;
        TakoSug takoSug;
        C97073rT t = c97073rT;
        o.LJIIIZ(t, "t");
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(this, t, 18), this.itemView);
        ((TextView) this.itemView.findViewById(R.id.ao8)).setText(t.LJLIL.query);
        C97073rT item2 = getItem();
        if (item2 == null || (c99033ud = item2.LJLILLLLZI) == null || (item = getItem()) == null || (takoSug = item.LJLIL) == null) {
            return;
        }
        C97113rX.LIZIZ(c99033ud.getEnterFromForMob(), c99033ud.getEnterMethod(), c99033ud.getSearchId(), c99033ud.getConversationId(), takoSug.query, L(), String.valueOf(getBindingAdapterPosition()), takoSug.LIZIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b0p, viewGroup, false, "from(parent.context)\n   …word_cell, parent, false)");
    }
}
