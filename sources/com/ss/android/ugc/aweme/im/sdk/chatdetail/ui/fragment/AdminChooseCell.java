package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.fragment;

import X.C117464jG;
import X.C117474jH;
import X.C16880lQ;
import X.C221108m2;
import X.C4AS;
import X.C62822Ol8;
import X.C63044Ooi;
import X.ORZ;
import X.W5G;
import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdminChooseCell extends PowerCell<C117464jG> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 534));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 538));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 537));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 536));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 535));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b2s;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C117464jG c117464jG) {
        int i;
        C117464jG t = c117464jG;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        IMUser iMUser = t.LJLIL;
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-avatar>(...)");
        C4AS.LJII((W5G) value, iMUser.getAvatarThumb(), "adminChooseModel", null, null, 0, 0, 504);
        Object value2 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value2, "<get-nickName>(...)");
        ((TextView) value2).setText(iMUser.getNickName());
        Object value3 = this.LJLJI.getValue();
        o.LJIIIIZZ(value3, "<get-friendTag>(...)");
        View view = (View) value3;
        if (iMUser.getFollowStatus() == 2) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        Object value4 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value4, "<get-detail>(...)");
        ((TextView) value4).setText(iMUser.getUniqueId());
        Object value5 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value5, "<get-checkRadio>(...)");
        ((C63044Ooi) value5).setChecked(t.LJLILLLLZI);
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(iMUser, t, 48), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C117464jG c117464jG, List payloads) {
        C117464jG t = c117464jG;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        Object LJLLLLLL = ORZ.LJLLLLLL(0, payloads);
        if ((LJLLLLLL instanceof C117474jH) && ((C117474jH) LJLLLLLL).LJLIL) {
            Object value = this.LJLJJL.getValue();
            o.LJIIIIZZ(value, "<get-checkRadio>(...)");
            ((C63044Ooi) value).setChecked(t.LJLILLLLZI);
        }
    }
}
