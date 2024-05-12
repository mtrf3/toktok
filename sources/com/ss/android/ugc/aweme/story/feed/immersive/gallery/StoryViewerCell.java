package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.AUP;
import X.AUQ;
import X.AUU;
import X.C05040Hs;
import X.C107724Kq;
import X.C16880lQ;
import X.C189257bl;
import X.C189367bw;
import X.C189377bx;
import X.C214298b3;
import X.C226668v0;
import X.C53506KzG;
import X.C53526Kza;
import X.C53592L1o;
import X.C56331M8x;
import X.C56958MXa;
import X.C56959MXb;
import X.C56960MXc;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77339UWx;
import X.C78857UxB;
import X.C7X9;
import X.C7ZX;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC112694bZ;
import X.EnumC53663L4h;
import X.EnumC53719L6l;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.L69;
import X.MXX;
import X.MXY;
import X.MXZ;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.o;
import q03.IDaS487S0100000_9;

/* loaded from: classes10.dex */
public final class StoryViewerCell extends PowerCell<C7X9> {
    public L69 LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public RelationButton LJLJJI;
    public final C214298b3 LJLJJL;
    public boolean LJLJJLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cof;
    }

    public final StoryViewerListViewModel L() {
        return (StoryViewerListViewModel) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        String str;
        super.onItemViewCreated();
        C189377bx c189377bx = L().LJLILLLLZI;
        if (c189377bx == null || (str = c189377bx.getFeedEnterFrom()) == null) {
            str = "";
        }
        L69 l69 = (L69) this.itemView.findViewById(R.id.ad0);
        if (l69 != null) {
            AUU auu = new AUU();
            C107724Kq c107724Kq = new C107724Kq(this);
            c107724Kq.LIZLLL = str;
            c107724Kq.LJ = "profile";
            auu.LIZ(new AUP(new C53592L1o(EnumC53719L6l.STORY_VIEWS_LIST_PANEL, null, null, null, new AqS159S0100000_9(this, 632), null, null, null, null, false, null, null, 16366)), new AUQ(new C53526Kza(null, null, c107724Kq, 31)), new C53506KzG(0));
            new AqS32S1000000_9(str, 0).invoke(auu.LIZJ);
            l69.LIZJ(auu);
            C16880lQ.LJIIJ(new IDaS487S0100000_9(this, 0), l69.getAvatar());
        } else {
            l69 = null;
        }
        this.LJLIL = l69;
        this.LJLILLLLZI = (TuxTextView) this.itemView.findViewById(R.id.gw7);
        this.LJLJI = (TuxTextView) this.itemView.findViewById(R.id.c7z);
        this.LJLJJI = (RelationButton) this.itemView.findViewById(R.id.iug);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 67), this.itemView);
    }

    public StoryViewerCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StoryViewerListViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 638);
        C56958MXa c56958MXa = C56958MXa.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, MXY.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 639), new AqS159S0100000_9((InterfaceC93923mO) this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT), C56960MXc.INSTANCE, c56958MXa, new AqS159S0100000_9((InterfaceC93923mO) this, 641), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, MXZ.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 642), new AqS159S0100000_9((InterfaceC93923mO) this, 633), C56959MXb.INSTANCE, c56958MXa, new AqS159S0100000_9((InterfaceC93923mO) this, 634), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, MXX.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 635), new AqS159S0100000_9((InterfaceC93923mO) this, 636), new AqS159S0100000_9((InterfaceC93923mO) this, 637), c56958MXa, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLJJL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7X9 c7x9) {
        String str;
        Integer valueOf;
        String str2;
        C7X9 t = c7x9;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        int i = 0;
        this.LJLJJLL = false;
        User user = t.LJLIL.getUser();
        L69 l69 = this.LJLIL;
        String str3 = null;
        if (l69 != null) {
            if (user == null || (str2 = user.getUid()) == null) {
                str2 = "";
            }
            l69.LJ(str2, user, this);
            l69.LJII(t.LJLIL.getStoryInteraction(), EnumC53663L4h.INTERACTION);
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            if (user != null) {
                str = C56331M8x.LIZIZ(user, true, false);
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LJLJI;
        if (tuxTextView2 != null) {
            StoryInteraction storyInteraction = t.LJLIL.getStoryInteraction();
            if (storyInteraction != null) {
                int type = storyInteraction.getType();
                if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            valueOf = Integer.valueOf(R.string.rq1);
                        }
                    } else {
                        valueOf = Integer.valueOf(R.string.rq2);
                    }
                } else {
                    valueOf = Integer.valueOf(R.string.rq3);
                }
                if (valueOf != null) {
                    str3 = this.itemView.getContext().getString(valueOf.intValue());
                }
            }
            TuxTextView tuxTextView3 = this.LJLJI;
            if (tuxTextView3 != null) {
                if (!C78857UxB.LJJJIL(str3)) {
                    i = 8;
                }
                tuxTextView3.setVisibility(i);
            }
            tuxTextView2.setText(str3);
        }
        RelationButton relationButton = this.LJLJJI;
        if (relationButton == null) {
            return;
        }
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZIZ = true;
        c226668v0.LJIIIZ = this;
        c226668v0.LIZIZ(EnumC112694bZ.MESSAGE);
        c226668v0.LIZ = t.LJLIL.getUser();
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        relationButton.setTracker(new AqS150S0200000_3(this, t, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(Context context, String str) {
        StoryInteractionUser storyInteractionUser;
        User user;
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        C7X9 item = getItem();
        if (item == null || (storyInteractionUser = item.LJLIL) == null || (user = storyInteractionUser.getUser()) == null) {
            return;
        }
        C189367bw c189367bw = ((C189257bl) L().getState()).LJLILLLLZI;
        String str6 = null;
        if (c189367bw != null) {
            aweme = c189367bw.LIZ;
        } else {
            aweme = null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("previous_page", "story_views_list_panel");
        C189377bx c189377bx = L().LJLILLLLZI;
        if (c189377bx != null) {
            str2 = c189377bx.getFeedEnterFrom();
        } else {
            str2 = null;
        }
        buildRoute.withParam("enter_from", str2);
        buildRoute.withParam("enter_method", str);
        if (aweme != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        buildRoute.withParam("group_id", str3);
        if (aweme != null) {
            str4 = aweme.getAuthorUid();
        } else {
            str4 = null;
        }
        C05040Hs.LJ(buildRoute, "author_id", str4, "story_type", "story");
        C189377bx c189377bx2 = L().LJLILLLLZI;
        if (c189377bx2 != null) {
            i = c189377bx2.getFeedPageType();
        } else {
            i = 0;
        }
        C189377bx c189377bx3 = L().LJLILLLLZI;
        if (c189377bx3 != null) {
            str5 = c189377bx3.getFeedEnterFrom();
        } else {
            str5 = null;
        }
        C189377bx c189377bx4 = L().LJLILLLLZI;
        if (c189377bx4 != null) {
            str6 = c189377bx4.getFeedFrom();
        }
        C7ZX.LIZ(context, aweme, i, str5, str6, str, "story_views_list_panel");
    }
}
