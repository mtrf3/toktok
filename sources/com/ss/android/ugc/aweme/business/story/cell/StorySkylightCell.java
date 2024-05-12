package com.ss.android.ugc.aweme.business.story.cell;

import X.C12460eI;
import X.C16880lQ;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C53691L5j;
import X.C53726L6s;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C56331M8x;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C71799SFv;
import X.C78926UyI;
import X.C78939UyV;
import X.C7F6;
import X.EnumC53695L5n;
import X.InterfaceC100393wp;
import X.L7K;
import X.LJN;
import X.LJP;
import X.LYK;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StorySkylightCell extends PowerCell<LYK> {
    public final C214378bB LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avl;
    }

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
            if (L7K.LJFF && this.LJLJL) {
                i = R.string.rs5;
            } else {
                i = R.string.rs6;
            }
            str = this.itemView.getContext().getString(i);
        } else {
            LYK item = getItem();
            if (item != null && (aweme = item.LJLILLLLZI) != null && (author = aweme.getAuthor()) != null) {
                str = C56331M8x.LIZIZ(author, false, true);
            } else {
                str = null;
            }
        }
        textView.setText(str);
    }

    public final void P() {
        if (L7K.LJFF && this.LJLJJLL) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            if (c55723Ltv.LJIILJJIL().LIZIZ()) {
                if (c55723Ltv.LJIILJJIL().LJFF() && L().getMode() != EnumC53695L5n.PROGRESS) {
                    ImageView M = M();
                    M.setImageResource(R.drawable.au7);
                    M.setVisibility(0);
                    this.LJLJLJ = false;
                    return;
                }
                ImageView M2 = M();
                M2.setImageResource(R.drawable.au6);
                M2.setVisibility(0);
                this.LJLJLJ = true;
                return;
            }
        }
        M().setVisibility(8);
    }

    public StorySkylightCell() {
        LJP ljp = LJP.LJLIL;
        this.LJLIL = new C214378bB(C65352Pkq.LIZ(FeedSkylightListViewModel.class), ljp, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, LJN.INSTANCE, null, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 72));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 77));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 75));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 76));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 73));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        L().setConstTheme(true);
        C16880lQ.LJIILLIIL(M(), new ACListenerS29S0100000_9(this, 9));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 10), this.itemView);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new C53726L6s(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LYK lyk) {
        boolean z;
        UrlModel urlModel;
        LYK t = lyk;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        User author = t.LJLILLLLZI.getAuthor();
        boolean z2 = t.LJLIL;
        this.LJLJJLL = z2;
        if (z2 && L7K.LJFF && C54838Lfe.LJIJI(t.LJLILLLLZI)) {
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
        } else {
            urlModel = null;
        }
        C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(urlModel), null, false, null, 126);
        N();
        P();
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLJLLL.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LIZLLL(t.LJLILLLLZI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_feed_top_cell", parent.getContext(), R.layout.avl, null, parent, false, 40);
    }
}
