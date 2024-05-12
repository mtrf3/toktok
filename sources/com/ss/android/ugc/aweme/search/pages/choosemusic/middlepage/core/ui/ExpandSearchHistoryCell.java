package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.K2S;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExpandSearchHistoryCell extends PowerCell<K2S> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2S t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C16880lQ.LJIIZILJ((LinearLayout) this.itemView.findViewById(R.id.d1c), new View.OnClickListener() { // from class: X.78S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2U8.LIZ(new IEvent() { // from class: X.78T
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C2U8.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C2U8.LIZIZ(this);
                        return this;
                    }
                });
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgp, viewGroup, false, "from(parent.context).inf…h_history, parent, false)");
    }
}
