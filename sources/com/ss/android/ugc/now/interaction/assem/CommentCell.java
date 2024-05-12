package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC13940gg;
import X.AnonymousClass729;
import X.C12460eI;
import X.C16880lQ;
import X.C175306uM;
import X.C182117Ct;
import X.C182127Cu;
import X.C182177Cz;
import X.C184037Kd;
import X.C184047Ke;
import X.C184057Kf;
import X.C184067Kg;
import X.C19N;
import X.C1DI;
import X.C201577vd;
import X.C214298b3;
import X.C221108m2;
import X.C2U8;
import X.C50420Jqa;
import X.C56331M8x;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C73A;
import X.C77339UWx;
import X.C78886Uxe;
import X.C7D0;
import X.C7D1;
import X.C7D2;
import X.C7D3;
import X.C7D4;
import X.C7MY;
import X.C7ZV;
import X.C86036Xpg;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC100393wp;
import X.InterfaceC1798974f;
import X.InterfaceC203977zV;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.ViewOnClickListenerC13880ga;
import X.YE1;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDCListenerS109S0200000_3;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.CommentCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentCell extends PowerCell<CommentItem> {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public String LJLLLLLL;
    public User LJLZ;
    public Comment LJZ;
    public final C62822Ol8 LJZI;

    public final LinearLayout M() {
        return (LinearLayout) this.LJLJI.getValue();
    }

    public final C201577vd P() {
        return (C201577vd) this.LJLJLJ.getValue();
    }

    public final TuxTextView Q() {
        return (TuxTextView) this.LJLJJLL.getValue();
    }

    public final TuxTextView T() {
        return (TuxTextView) this.LJLJL.getValue();
    }

    public CommentCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CommentListVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1354);
        C182117Ct c182117Ct = C182117Ct.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7D0.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1339), new AqS153S0100000_3((InterfaceC93923mO) this, 1341), C184057Kf.INSTANCE, c182117Ct, new AqS153S0100000_3((InterfaceC93923mO) this, 1343), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7D2.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1345), new AqS153S0100000_3((InterfaceC93923mO) this, 1340), C184047Ke.INSTANCE, c182117Ct, new AqS153S0100000_3((InterfaceC93923mO) this, 1342), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7D1.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1344), new AqS153S0100000_3((InterfaceC93923mO) this, 1346), new AqS153S0100000_3((InterfaceC93923mO) this, 1348), c182117Ct, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowKeyboardVM.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ2, 1350);
        C182127Cu c182127Cu = C182127Cu.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS153S0100000_32, C7D3.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1355), new AqS153S0100000_3((InterfaceC93923mO) this, 1356), C184067Kg.INSTANCE, c182127Cu, new AqS153S0100000_3((InterfaceC93923mO) this, 1357), 256);
        } else if (o.LJ(c9bd, c9be)) {
            c214298b32 = new C214298b3(LIZ2, aqS153S0100000_32, C7D4.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1358), new AqS153S0100000_3((InterfaceC93923mO) this, 1359), C184037Kd.INSTANCE, c182127Cu, new AqS153S0100000_3((InterfaceC93923mO) this, 1329), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS153S0100000_32, C182177Cz.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1333), new AqS153S0100000_3((InterfaceC93923mO) this, 1335), new AqS153S0100000_3((InterfaceC93923mO) this, 1336), c182127Cu, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLILLLLZI = c214298b32;
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1330));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1331));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1338));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1351));
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1353));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1347));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1349));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1352));
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1334));
        this.LJLLILLLL = C7MY.LIZIZ(30);
        this.LJLLJ = C7MY.LIZIZ(16);
        this.LJLLL = C7MY.LIZIZ(4);
        this.LJLLLL = C7MY.LIZIZ(16);
        this.LJLLLLLL = "";
        this.LJZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1337));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        if (C19N.LJ("2860_avatar_distribute_expansion_switch", true)) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C12460eI.LIZJ(itemView, new AbstractC13940gg(this) { // from class: X.7Cs
                public final C182137Cv LJ = C182137Cv.LJLIL;
                public InterfaceC65784Pro<String> LJFF;
                public final C182097Cr LJI;

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ java.util.Map LJFF() {
                    return null;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZ() {
                    return this.LJ;
                }

                @Override // X.AbstractC13940gg
                public final InterfaceC65784Pro<String> LIZJ() {
                    return this.LJFF;
                }

                @Override // X.AbstractC13940gg
                public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                    return this.LJI;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [X.7Cr] */
                {
                    this.LJFF = new AqS153S0100000_3(this, 1332);
                    this.LJI = new InterfaceC19530ph() { // from class: X.7Cr
                        @Override // X.InterfaceC19530ph
                        public final void LIZ(View view, String itemID) {
                            InterfaceC100393wp interfaceC100393wp;
                            o.LJIIIZ(itemID, "itemID");
                            Object value = CommentCell.this.LJLJJL.getValue();
                            o.LJIIIIZZ(value, "<get-socPubAvatarFrameLayout>(...)");
                            if (((C53691L5j) value).getMode() != EnumC53695L5n.NONE && (interfaceC100393wp = (InterfaceC100393wp) CommentCell.this.LJZI.getValue()) != null) {
                                Object value2 = CommentCell.this.LJLJJL.getValue();
                                o.LJIIIIZZ(value2, "<get-socPubAvatarFrameLayout>(...)");
                                interfaceC100393wp.LJFF(((C53691L5j) value2).getMode());
                            }
                        }
                    };
                }

                @Override // X.AbstractC13940gg
                public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                    this.LJFF = interfaceC65784Pro;
                }
            });
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String str;
        super.onViewAttachedToWindow();
        CommentItem item = getItem();
        if (item != null) {
            C73A c73a = ((CommentListVM) this.LJLIL.getValue()).LJLJLLL;
            Comment comment = item.getComment();
            if (comment != null) {
                str = comment.getCid();
            } else {
                str = null;
            }
            c73a.LIZJ(str, item);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        Comment comment;
        String cid;
        super.onViewDetachedFromWindow();
        C73A c73a = ((CommentListVM) this.LJLIL.getValue()).LJLJLLL;
        CommentItem item = getItem();
        if (item == null || (comment = item.getComment()) == null || (cid = comment.getCid()) == null) {
            c73a.getClass();
        } else {
            c73a.LIZIZ(cid);
            c73a.LIZJ.remove(cid);
        }
    }

    public static int N(TuxTextView tuxTextView) {
        return (int) tuxTextView.getPaint().measureText(tuxTextView.getText().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        if (r9 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(com.ss.android.ugc.now.interaction.assem.CommentItem r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.CommentCell.U(com.ss.android.ugc.now.interaction.assem.CommentItem):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(CommentItem commentItem) {
        String str;
        User user;
        String str2;
        User user2;
        String str3;
        boolean z;
        String str4;
        List<TextExtraStruct> list;
        long j;
        Comment comment;
        String replyToUserId;
        String str5;
        User user3;
        CommentItem t = commentItem;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.LJZ = t.getComment();
        final NowFeedMobHierarchyData interactionHierarchyData = t.getInteractionHierarchyData();
        if (interactionHierarchyData == null || (str = interactionHierarchyData.getEnterFrom()) == null) {
            str = "";
        }
        this.LJLLLLLL = str;
        Comment comment2 = this.LJZ;
        if (comment2 != null) {
            user = comment2.getUser();
        } else {
            user = null;
        }
        this.LJLZ = user;
        TuxTextView Q = Q();
        Comment comment3 = this.LJZ;
        if (comment3 != null && (user3 = comment3.getUser()) != null) {
            str2 = C56331M8x.LIZIZ(user3, true, true);
        } else {
            str2 = null;
        }
        Q.setText(str2);
        C16880lQ.LJJIL((C71799SFv) this.LJLJJI.getValue(), new ACListenerS38S0200000_3(this, interactionHierarchyData, 79));
        ((View) this.LJLJJI.getValue()).setOnLongClickListener(new View.OnLongClickListener() { // from class: X.7Cy
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        Comment comment4 = this.LJZ;
        if (comment4 != null) {
            user2 = comment4.getUser();
        } else {
            user2 = null;
        }
        C62562cu LIZ = AnonymousClass729.LIZ(user2);
        if (LIZ != null) {
            C71799SFv ivAvatar = (C71799SFv) this.LJLJJI.getValue();
            o.LJIIIIZZ(ivAvatar, "ivAvatar");
            C71799SFv.LJIIJ(ivAvatar, LIZ, null, false, null, 110);
        }
        C16880lQ.LJJJJI(Q(), new ACListenerS38S0200000_3(this, interactionHierarchyData, 81));
        Q().setOnLongClickListener(new IDCListenerS109S0200000_3(this, t, 2));
        Comment comment5 = this.LJZ;
        if (comment5 != null) {
            str3 = comment5.getReplyToNickName();
        } else {
            str3 = null;
        }
        int i = 0;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (comment = this.LJZ) == null || (replyToUserId = comment.getReplyToUserId()) == null || replyToUserId.length() == 0) {
            ((View) this.LJLLI.getValue()).setVisibility(8);
        } else {
            TuxTextView T = T();
            Comment comment6 = this.LJZ;
            if (comment6 != null) {
                str5 = comment6.getReplyToNickName();
            } else {
                str5 = null;
            }
            T.setText(str5);
            ((View) this.LJLLI.getValue()).setVisibility(0);
            C16880lQ.LJJJJI(T(), new ACListenerS38S0200000_3(this, interactionHierarchyData, 82));
            T().setOnLongClickListener(new IDCListenerS109S0200000_3(this, t, 3));
        }
        P().setOnSpanClickListener(new InterfaceC203977zV() { // from class: X.7Cq
            @Override // X.InterfaceC203977zV
            public final void LIZ(TextExtraStruct textExtraStruct) {
                User user4 = new User();
                user4.setUid(textExtraStruct.getUserId());
                user4.setSecUid(textExtraStruct.getSecUid());
                CommentCell commentCell = CommentCell.this;
                Context context = commentCell.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                commentCell.L(user4, context, interactionHierarchyData, "comment_at");
            }
        });
        C201577vd P = P();
        Context context = P().getContext();
        o.LJIIIIZZ(context, "tvContent.context");
        P.setMentionSpanColor(C78886Uxe.LJJIFFI(R.attr.go, R.color.ck, context));
        C201577vd P2 = P();
        Comment comment7 = this.LJZ;
        if (comment7 != null) {
            str4 = comment7.getText();
        } else {
            str4 = null;
        }
        P2.setText(str4);
        C201577vd P3 = P();
        Comment comment8 = this.LJZ;
        if (comment8 != null) {
            list = comment8.getTextExtra();
        } else {
            list = null;
        }
        P3.LJJIZ(list, null, null);
        P().setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = (TextView) this.LJLJLLL.getValue();
        if (this.LJZ != null) {
            j = r0.getCreateTime() * 1000;
        } else {
            j = 0;
        }
        textView.setText(C86036Xpg.LIZIZ(j));
        P().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(this, 224)));
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 227), this.itemView);
        C16880lQ.LJJJJI((TuxTextView) this.LJLL.getValue(), new ACListenerS23S0100000_3(this, 228));
        ((View) this.LJLL.getValue()).setOnLongClickListener(new IDCListenerS109S0200000_3(this, t, 0));
        this.itemView.setOnLongClickListener(new IDCListenerS109S0200000_3(this, t, 1));
        this.itemView.post(new ARunnableS39S0100000_3(this, 159));
        View view = (View) this.LJLL.getValue();
        if (((CommentListVM) this.LJLIL.getValue()).LJLJJLL) {
            i = 8;
        }
        view.setVisibility(i);
        Comment comment9 = this.LJZ;
        if (comment9 != null && comment9.needHighlight) {
            M().postDelayed(new ARunnableS22S0200000_3(this, comment9, 49), 150L);
        }
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJZI.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(this.LJLZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bar, viewGroup, false, "from(parent.context)\n   …m_comment, parent, false)");
    }

    public final void L(User user, Context context, NowFeedMobHierarchyData nowFeedMobHierarchyData, String str) {
        String str2;
        String str3;
        Aweme aweme;
        int i;
        Aweme aweme2;
        User author;
        Aweme aweme3;
        NowPostInfo nowPostInfo;
        if (!TextUtils.isEmpty(user.getUid())) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            buildRoute.withParam("uid", user.getUid());
            String str4 = null;
            if (nowFeedMobHierarchyData != null) {
                str2 = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                str2 = null;
            }
            buildRoute.withParam("enter_from", str2);
            buildRoute.withParam("extra_from_pre_page", "homepage_now");
            buildRoute.withParam("extra_previous_page_position", "comment_panel");
            buildRoute.withParam("source_page", "homepage_now_comment");
            buildRoute.withParam("sec_uid", user.getSecUid());
            buildRoute.open();
            C7ZV c7zv = new C7ZV();
            if (nowFeedMobHierarchyData == null || (str3 = nowFeedMobHierarchyData.getEnterFrom()) == null) {
                str3 = "";
            }
            c7zv.LIZLLL = str3;
            c7zv.LJJLI = str;
            c7zv.LJJLJLI = "comment_list";
            c7zv.LJJLL = "comment_list";
            c7zv.LJLIIL = "";
            CommentItem item = getItem();
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
            c7zv.LJJIJ(aweme);
            c7zv.LJJLIIIJJIZ = user.getUid();
            if (C175306uM.LIZIZ) {
                c7zv.LJIJI = user.getRecType();
                c7zv.LJLLLL = Boolean.FALSE;
            }
            CommentItem item2 = getItem();
            if (item2 != null && (aweme3 = item2.getAweme()) != null && (nowPostInfo = aweme3.nowPostInfo) != null) {
                str4 = nowPostInfo.getNowMediaType();
            }
            c7zv.LJ("now_type", str4, InterfaceC1798974f.LIZ);
            CommentItem item3 = getItem();
            if (item3 != null && (aweme2 = item3.getAweme()) != null && (author = aweme2.getAuthor()) != null) {
                i = author.getFollowStatus();
            } else {
                i = 0;
            }
            c7zv.LIZJ(i, "follow_status");
            c7zv.LJIILIIL();
            C2U8.LIZ(new C50420Jqa(36));
        }
    }
}
