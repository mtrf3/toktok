package com.ss.android.ugc.aweme.mention.ui.page;

import X.AJ9;
import X.AP9;
import X.C118264kY;
import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C217868go;
import X.C221108m2;
import X.C56331M8x;
import X.C58187MsZ;
import X.C58447Mwl;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79234V7u;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.Y9B;
import X.Y9C;
import X.Y9D;
import X.Y9E;
import X.Y9F;
import X.Y9G;
import X.Y9H;
import X.YE1;
import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.mention.viewmodel.CommentMentionViewModel;
import com.ss.android.ugc.aweme.mention.viewmodel.SelectedMentionVM;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CommentMentionHorizontalCell extends PowerCell<C217868go> {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;

    public CommentMentionHorizontalCell() {
        C214298b3 c214298b3;
        C221108m2.LIZIZ(C58187MsZ.LJLIL);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SelectedMentionVM.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 258);
        C58447Mwl c58447Mwl = C58447Mwl.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS160S0100000_10, Y9C.INSTANCE, new AqS160S0100000_10((InterfaceC93923mO) this, 259), new AqS165S0100000_15(this, 472), Y9F.INSTANCE, c58447Mwl, new AqS165S0100000_15(this, 473), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS160S0100000_10, Y9D.INSTANCE, new AqS165S0100000_15(this, 474), new AqS165S0100000_15(this, 470), Y9E.INSTANCE, c58447Mwl, new AqS165S0100000_15(this, 471), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS160S0100000_10, Y9B.INSTANCE, new AqS160S0100000_10((InterfaceC93923mO) this, 255), new AqS160S0100000_10((InterfaceC93923mO) this, 256), new AqS160S0100000_10((InterfaceC93923mO) this, 257), c58447Mwl, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 108), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C217868go c217868go) {
        float f;
        Set<String> set;
        boolean z;
        int i;
        C217868go t = c217868go;
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        if (t.LJLIL.LJIJI.LIZ) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        view.setAlpha(f);
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ != null) {
            set = ((CommentMentionViewModel) ViewModelProviders.of(LJIIIZ).get(CommentMentionViewModel.class)).LJLJJL;
        } else {
            set = null;
        }
        if (set != null && set.contains(t.LJLIL.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        View findViewById = this.itemView.findViewById(R.id.e2j);
        if (findViewById != null) {
            findViewById.setSelected(z);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
        SpannableString spannableString = new SpannableString(C56331M8x.LIZ(Y9H.LIZJ(t.LJLIL), true, false));
        AP9 ap9 = (AP9) this.itemView.findViewById(R.id.jd7);
        Y9G y9g = t.LJLIL;
        ap9.setUserData(new UserVerify(y9g.LJFF, y9g.LJIIIIZZ, y9g.LJIIIZ, Integer.valueOf(y9g.LJIIJ)));
        List<Position> list = t.LJLIL.LJIJI.LJII;
        if (list != null && !list.isEmpty()) {
            for (Position position : t.LJLIL.LJIJI.LJII) {
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C118264kY.LIZIZ(itemView, spannableString, position.getBegin(), position.getEnd() + 1);
            }
        }
        ((AP9) this.itemView.findViewById(R.id.jd7)).LIZ();
        Context context = this.itemView.getContext();
        Y9G y9g2 = t.LJLIL;
        AJ9.LJ(context, y9g2.LJIIIIZZ, y9g2.LJIIIZ, (TextView) this.itemView.findViewById(R.id.mby));
        ((TextView) this.itemView.findViewById(R.id.mby)).setText(C56331M8x.LIZIZ(Y9H.LIZJ(t.LJLIL), true, false));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bs6, viewGroup, false, "from(parent.context)\n   …list_item, parent, false)");
    }
}
