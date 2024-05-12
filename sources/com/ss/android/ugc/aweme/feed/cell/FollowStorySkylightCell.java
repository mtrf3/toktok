package com.ss.android.ugc.aweme.feed.cell;

import X.C12460eI;
import X.C16880lQ;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C53691L5j;
import X.C53728L6u;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C56331M8x;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C71799SFv;
import X.C78926UyI;
import X.C78939UyV;
import X.EnumC53695L5n;
import X.InterfaceC100393wp;
import X.L7K;
import X.LJO;
import X.LJQ;
import X.LYL;
import X.LYU;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowStorySkylightCell extends PowerCell<LYL> {
    public final C214378bB LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public final C53691L5j L() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-storyRing>(...)");
        return (C53691L5j) value;
    }

    public final ImageView M() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-storyStatusIcon>(...)");
        return (ImageView) value;
    }

    public final void N() {
        String str;
        Aweme aweme;
        User author;
        int i;
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-username>(...)");
        TextView textView = (TextView) value;
        if (this.LJLJJLL) {
            if (this.LJLJL) {
                i = R.string.rs5;
            } else {
                i = R.string.rs6;
            }
            str = this.itemView.getContext().getString(i);
        } else {
            LYL item = getItem();
            if (item != null && (aweme = item.LJLIL) != null && (author = aweme.getAuthor()) != null) {
                str = C56331M8x.LIZIZ(author, false, true);
            } else {
                str = null;
            }
        }
        textView.setText(str);
    }

    public final void P() {
        if (L7K.LIZLLL && this.LJLJJLL) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            if (c55723Ltv.LJIILJJIL().LIZIZ()) {
                if (c55723Ltv.LJIILJJIL().LJFF() && L().getMode() != EnumC53695L5n.PROGRESS) {
                    ImageView M = M();
                    M.setImageResource(R.drawable.c7d);
                    M.setVisibility(0);
                    this.LJLJLJ = false;
                    return;
                }
                ImageView M2 = M();
                M2.setImageResource(R.drawable.c7c);
                M2.setVisibility(0);
                this.LJLJLJ = true;
                return;
            }
        }
        M().setVisibility(8);
    }

    public FollowStorySkylightCell() {
        LJQ ljq = LJQ.LJLIL;
        this.LJLIL = new C214378bB(C65352Pkq.LIZ(FollowStorySkylightVM.class), ljq, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, LJO.INSTANCE, null, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 217));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 222));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 220));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 221));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 218));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        if (LYU.LIZJ()) {
            return R.layout.aw1;
        }
        return R.layout.aw2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        L().setConstTheme(true);
        C16880lQ.LJIILLIIL(M(), new ACListenerS29S0100000_9(this, 17));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 18), this.itemView);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new C53728L6u(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LYL lyl) {
        String str;
        boolean z;
        LYL t = lyl;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        User author = t.LJLIL.getAuthor();
        UrlModel urlModel = null;
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        boolean LJIIJJI = C54838Lfe.LJIIJJI(str);
        this.LJLJJLL = LJIIJJI;
        if (L7K.LIZLLL && LJIIJJI && C54838Lfe.LJIJI(t.LJLIL)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-avatar>(...)");
        C71799SFv c71799SFv = (C71799SFv) value;
        if (author != null) {
            urlModel = author.getAvatarThumb();
        }
        C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(urlModel), null, false, null, 126);
        N();
        P();
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLJLLL.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LIZLLL(t.LJLIL);
        }
    }
}
