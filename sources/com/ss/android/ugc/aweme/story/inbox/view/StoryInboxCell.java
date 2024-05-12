package com.ss.android.ugc.aweme.story.inbox.view;

import X.C107454Jp;
import X.C12460eI;
import X.C16880lQ;
import X.C221108m2;
import X.C48709J9t;
import X.C53339KwZ;
import X.C53691L5j;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C56331M8x;
import X.C62822Ol8;
import X.C71799SFv;
import X.C77357UXp;
import X.C78939UyV;
import X.C7F6;
import X.EnumC53695L5n;
import X.InterfaceC100393wp;
import X.L1Y;
import X.L2P;
import X.LJS;
import X.LJT;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.IInboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryInboxCell extends PowerCell<StoryInboxItem> {
    public static final /* synthetic */ int LJLLI = 0;
    public C71799SFv LJLJI;
    public TuxTextView LJLJJI;
    public ImageView LJLJJL;
    public C53691L5j LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 645));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 644));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 643));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        int i;
        String str;
        Aweme storyCollection;
        UserStory userStory;
        Aweme storyCollection2;
        User author;
        Aweme storyCollection3;
        User author2;
        super.onViewAttachedToWindow();
        StoryInboxItem item = getItem();
        int i2 = 0;
        if (item != null && (storyCollection3 = item.getStoryCollection()) != null && (author2 = storyCollection3.getAuthor()) != null) {
            i = author2.getFollowStatus();
        } else {
            i = 0;
        }
        StoryInboxItem item2 = getItem();
        if (item2 != null && (storyCollection2 = item2.getStoryCollection()) != null && (author = storyCollection2.getAuthor()) != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StoryInboxItem item3 = getItem();
        if (item3 != null && (storyCollection = item3.getStoryCollection()) != null && (userStory = storyCollection.getUserStory()) != null && userStory.getAllViewed()) {
            i2 = 1;
        }
        linkedHashMap.put("is_read", Integer.valueOf(i2));
        C77357UXp.LJJIJIIJIL(this, "story", str, i, null, linkedHashMap, 50);
    }

    public final LJT L() {
        return (LJT) this.LJLILLLLZI.getValue();
    }

    public final IInboxTopHorizontalListVM M() {
        return (IInboxTopHorizontalListVM) this.LJLIL.getValue();
    }

    public final void P() {
        if (this.LJLJL) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            if (c55723Ltv.LJIILJJIL().LIZIZ()) {
                if (c55723Ltv.LJIILJJIL().LJFF()) {
                    C53691L5j c53691L5j = this.LJLJJLL;
                    if (c53691L5j != null) {
                        if (c53691L5j.getMode() != EnumC53695L5n.PROGRESS) {
                            if (C107454Jp.LIZIZ()) {
                                ImageView imageView = this.LJLJJL;
                                if (imageView != null) {
                                    imageView.setImageResource(R.drawable.c7a);
                                } else {
                                    o.LJIJI("iconImageView");
                                    throw null;
                                }
                            } else {
                                ImageView imageView2 = this.LJLJJL;
                                if (imageView2 != null) {
                                    imageView2.setImageResource(R.drawable.c7_);
                                } else {
                                    o.LJIJI("iconImageView");
                                    throw null;
                                }
                            }
                            ImageView imageView3 = this.LJLJJL;
                            if (imageView3 != null) {
                                imageView3.setVisibility(0);
                                this.LJLJLLL = false;
                                return;
                            } else {
                                o.LJIJI("iconImageView");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("flStoryRing");
                        throw null;
                    }
                }
                if (L1Y.LIZ()) {
                    if (C107454Jp.LIZIZ()) {
                        ImageView imageView4 = this.LJLJJL;
                        if (imageView4 != null) {
                            imageView4.setImageResource(R.drawable.c79);
                        } else {
                            o.LJIJI("iconImageView");
                            throw null;
                        }
                    } else {
                        ImageView imageView5 = this.LJLJJL;
                        if (imageView5 != null) {
                            imageView5.setImageResource(R.drawable.c78);
                        } else {
                            o.LJIJI("iconImageView");
                            throw null;
                        }
                    }
                    ImageView imageView6 = this.LJLJJL;
                    if (imageView6 != null) {
                        imageView6.setVisibility(0);
                        this.LJLJLLL = true;
                        return;
                    } else {
                        o.LJIJI("iconImageView");
                        throw null;
                    }
                }
            }
        }
        ImageView imageView7 = this.LJLJJL;
        if (imageView7 != null) {
            imageView7.setVisibility(8);
        } else {
            o.LJIJI("iconImageView");
            throw null;
        }
    }

    public final void Q() {
        Aweme storyCollection;
        User author;
        int i;
        TuxTextView tuxTextView = this.LJLJJI;
        String str = null;
        if (tuxTextView != null) {
            if (this.LJLJL) {
                if (this.LJLJLJ) {
                    i = R.string.rs5;
                } else {
                    i = R.string.rs6;
                }
                str = this.itemView.getContext().getString(i);
            } else {
                StoryInboxItem item = getItem();
                if (item != null && (storyCollection = item.getStoryCollection()) != null && (author = storyCollection.getAuthor()) != null) {
                    str = C56331M8x.LIZIZ(author, false, true);
                }
            }
            tuxTextView.setText(str);
            return;
        }
        o.LJIJI("nameTextView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        if (C48709J9t.LIZ) {
            return R.layout.coa;
        }
        return R.layout.co_;
    }

    public static boolean N() {
        if (L2P.LIZ() || C53339KwZ.LJ()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ImageView imageView;
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        this.LJLJI = (C71799SFv) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name_tv)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.kl_);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.story_ring)");
        this.LJLJJLL = (C53691L5j) findViewById3;
        if (C107454Jp.LIZIZ()) {
            View findViewById4 = this.itemView.findViewById(R.id.ebv);
            o.LJIIIIZZ(findViewById4, "{\n            itemView.f…id.icon_iv_new)\n        }");
            imageView = (ImageView) findViewById4;
        } else {
            View findViewById5 = this.itemView.findViewById(R.id.ebu);
            o.LJIIIIZZ(findViewById5, "{\n            itemView.f…d(R.id.icon_iv)\n        }");
            imageView = (ImageView) findViewById5;
        }
        this.LJLJJL = imageView;
        C16880lQ.LJIILLIIL(imageView, new ACListenerS29S0100000_9(this, 69));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 70), this.itemView);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new LJS(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(StoryInboxItem storyInboxItem) {
        String str;
        boolean z;
        StoryInboxItem t = storyInboxItem;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        User author = t.getStoryCollection().getAuthor();
        UrlModel urlModel = null;
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        boolean LJIIJJI = C54838Lfe.LJIIJJI(str);
        this.LJLJL = LJIIJJI;
        if (LJIIJJI && C54838Lfe.LJIJI(t.getStoryCollection())) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJLJ = z;
        C71799SFv c71799SFv = this.LJLJI;
        if (c71799SFv != null) {
            if (author != null) {
                urlModel = author.getAvatarThumb();
            }
            C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(urlModel), null, false, null, 126);
            Q();
            P();
            InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLL.getValue();
            if (interfaceC100393wp != null) {
                interfaceC100393wp.LIZLLL(t.getStoryCollection());
                return;
            }
            return;
        }
        o.LJIJI("avatarImageView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_inbox_top_cell", parent.getContext(), getLayoutId(), null, parent, false, 40);
    }
}
