package com.ss.android.ugc.aweme.relation.monitor;

import X.C72329Sa5;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.SIT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ConstTrackChunk extends SIT {
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIIIZZ(TrackCell.class);
        this.LJLJJL.LIZJ(new C72329Sa5(new AqS162S0100000_12(this, 890)));
    }

    /* loaded from: classes13.dex */
    public final class TrackCell extends PowerCell<C72329Sa5> {
        public boolean LJLIL;

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onViewAttachedToWindow() {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
            super.onViewAttachedToWindow();
            if (!this.LJLIL) {
                C72329Sa5 item = getItem();
                if (item != null && (interfaceC65784Pro = item.LJLIL) != null) {
                    interfaceC65784Pro.invoke();
                }
                this.LJLIL = true;
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup parent) {
            o.LJIIIZ(parent, "parent");
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            return view;
        }
    }

    public ConstTrackChunk(AqS162S0100000_12 aqS162S0100000_12) {
        this.LJLJJLL = aqS162S0100000_12;
    }
}
