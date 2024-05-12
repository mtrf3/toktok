package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.K2T;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchMusicSugFeedbackCell extends PowerCell<K2T> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2T t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.d95), new View.OnClickListener() { // from class: X.78U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2U8.LIZ(new IEvent() { // from class: X.78V
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
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgw, viewGroup, false, "from(parent.context)\n   …_feedback, parent, false)");
    }
}
