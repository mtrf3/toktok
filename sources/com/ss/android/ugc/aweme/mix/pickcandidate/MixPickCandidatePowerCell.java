package com.ss.android.ugc.aweme.mix.pickcandidate;

import X.C02Y;
import X.C16880lQ;
import X.C1FL;
import X.C228648yC;
import X.C62846OlW;
import X.C78765Uvh;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixPickCandidatePowerCell extends PowerCell<C228648yC> {
    public Context LJLIL;

    public final void L(int i) {
        ((ImageView) this.itemView.findViewById(R.id.b4a)).setVisibility(0);
        ((TuxIconView) this.itemView.findViewById(R.id.b4a)).setIconRes(i);
        ((TuxIconView) this.itemView.findViewById(R.id.b4a)).setTintColor(this.itemView.getResources().getColor(R.color.ar));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C228648yC c228648yC) {
        List<String> urlList;
        C228648yC t = c228648yC;
        o.LJIIIZ(t, "t");
        UrlModel urlModel = t.LJLIL;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            if (!urlList.isEmpty()) {
                C62846OlW c62846OlW = (C62846OlW) this.itemView.findViewById(R.id.b45);
                String str = (String) ListProtector.get(urlList, 0);
                if (str == null) {
                    str = "";
                }
                C78765Uvh.LJIIIZ(c62846OlW, str, -1, -1);
            } else {
                Context context = this.LJLIL;
                if (context != null) {
                    C78765Uvh.LIZ((C62846OlW) this.itemView.findViewById(R.id.b45), context.getResources().getColor(R.color.ao));
                }
            }
        }
        if (t.LJLJI || t.LJLJJLL) {
            this.itemView.findViewById(R.id.b46).setVisibility(0);
        } else {
            this.itemView.findViewById(R.id.b46).setVisibility(8);
        }
        if (t.LJLJL) {
            L(R.raw.icon_exclamation_mark_circle);
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 332), this.itemView);
            C16880lQ.LJIJJ((C02Y) this.itemView.findViewById(R.id.b43), new ACListenerS23S0100000_3(this, 333));
            C16880lQ.LJIJ((RelativeLayout) this.itemView.findViewById(R.id.b44), new ACListenerS23S0100000_3(this, 334));
        } else if (t.LJLJJI) {
            L(R.raw.icon_playlist);
            ((ImageView) this.itemView.findViewById(R.id.b4a)).setVisibility(0);
        } else {
            ((ImageView) this.itemView.findViewById(R.id.b4a)).setVisibility(8);
        }
        ((TextView) this.itemView.findViewById(R.id.b43)).setSelected(t.LJLILLLLZI);
        this.itemView.findViewById(R.id.b43).setClickable(!t.LJLJI);
        if (!t.LJLJI && !t.LJLJJLL) {
            C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, t, 122), this.itemView);
            C16880lQ.LJIJJ((C02Y) this.itemView.findViewById(R.id.b43), new ACListenerS38S0200000_3(this, t, 123));
            C16880lQ.LJIJ((RelativeLayout) this.itemView.findViewById(R.id.b44), new ACListenerS38S0200000_3(this, t, 124));
        } else {
            if (t.LJLJL) {
                return;
            }
            C16880lQ.LJIIJ(null, this.itemView);
            C16880lQ.LJIJJ((C02Y) this.itemView.findViewById(R.id.b43), null);
            C16880lQ.LJIJ((RelativeLayout) this.itemView.findViewById(R.id.b44), null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        this.LJLIL = parent.getContext();
        return C1FL.LIZIZ(parent, R.layout.bt5, parent, false, "from(parent.context).inf…ate_video, parent, false)");
    }
}
