package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view;

import X.C06490Nh;
import X.C110614Vt;
import X.C16880lQ;
import X.C3IY;
import X.C3Q9;
import X.C45S;
import X.C4AS;
import X.C4WC;
import X.C61328O5c;
import X.C62846OlW;
import X.C63120Opw;
import X.C75782yE;
import X.C81093Gf;
import X.C89453fB;
import X.KNV;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareGroupCell extends PowerCell<C89453fB> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C89453fB c89453fB) {
        String str;
        C89453fB item = c89453fB;
        o.LJIIIZ(item, "item");
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(item.LJLIL);
        if (LIZ != null) {
            C81093Gf.LIZ().getClass();
            str = C3IY.LIZIZ(LIZ);
        } else {
            str = null;
        }
        C45S.LIZJ((C62846OlW) this.itemView.findViewById(R.id.acf), C4AS.LJIIJ(str), "ShareGroupCell");
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(item, this, 42), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b39, viewGroup, false);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(6);
        c110614Vt.LIZLLL = KNV.LIZIZ(0.5d);
        c110614Vt.LJFF = Integer.valueOf(R.attr.e0);
        Context context = LIZIZ.getContext();
        o.LJIIIIZZ(context, "view.context");
        LIZIZ.setBackground(c110614Vt.LIZ(context));
        return LIZIZ;
    }
}
