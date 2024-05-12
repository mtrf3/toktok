package com.ss.android.ugc.now.interaction.assem;

import X.ActivityC45651qj;
import X.AnonymousClass729;
import X.C16880lQ;
import X.C184077Kh;
import X.C187377Wz;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56331M8x;
import X.C57939MoZ;
import X.C62562cu;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C73305Spp;
import X.C73A;
import X.C73G;
import X.C73L;
import X.C73M;
import X.C73N;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C90733hF;
import X.C9BD;
import X.C9BE;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.SYL;
import X.TBT;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentListAssem extends UIListContentAssem<CommentListVM> implements ICommentListAssemAbility {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214378bB LJLJJLL;

    public CommentListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1361));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1365));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1360));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CommentListVM.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1362), C73L.INSTANCE, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowKeyboardVM.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ2, c9bd, new AqS153S0100000_3(LIZ2, 1363), C73M.INSTANCE, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(InteractionSyncVM.class);
        C73N c73n = C73N.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1364);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJLL = new C214378bB(LIZ3, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c73n, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    public final C73305Spp C3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    public final InteractionSyncVM E3() {
        return (InteractionSyncVM) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final CommentListVM A3() {
        return (CommentListVM) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), ICommentListAssemAbility.class, null);
        }
    }

    public final void H3(Aweme aweme) {
        CommentItem commentItem;
        Comment comment = null;
        if (v3().getState().LJIIIIZZ() != 0) {
            InterfaceC57784Mm4 LJI = v3().getState().LJI(0);
            o.LJII(LJI, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.assem.CommentItem");
            commentItem = (CommentItem) LJI;
            InterfaceC57784Mm4 LJI2 = v3().getState().LJI(v3().getState().LJIIIIZZ() - 1);
            o.LJII(LJI2, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.assem.CommentItem");
            CommentItem commentItem2 = (CommentItem) LJI2;
            if (commentItem.getComment().getCreateTime() < commentItem2.getComment().getCreateTime()) {
                commentItem = commentItem2;
            }
        } else {
            commentItem = null;
        }
        InteractionSyncVM E3 = E3();
        if (E3 != null) {
            if (commentItem != null) {
                comment = commentItem.getComment();
            }
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            E3.setState(new AqS57S1100000_3(comment, aid, 26));
        }
    }

    public final void I3(Aweme aweme) {
        CommentItem commentItem;
        InterfaceC57784Mm4 LJI;
        Comment comment = null;
        if (v3().getState().LJIIIIZZ() > 0) {
            InterfaceC57784Mm4 LJI2 = v3().getState().LJI(0);
            o.LJII(LJI2, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.assem.CommentItem");
            commentItem = (CommentItem) LJI2;
            if (v3().getState().LJIIIIZZ() > 1) {
                LJI = v3().getState().LJI(1);
            } else {
                LJI = v3().getState().LJI(0);
            }
            o.LJII(LJI, "null cannot be cast to non-null type com.ss.android.ugc.now.interaction.assem.CommentItem");
            CommentItem commentItem2 = (CommentItem) LJI;
            if (commentItem.getComment().getCreateTime() < commentItem2.getComment().getCreateTime()) {
                commentItem = commentItem2;
            }
        } else {
            commentItem = null;
        }
        InteractionSyncVM E3 = E3();
        if (E3 != null) {
            if (commentItem != null) {
                comment = commentItem.getComment();
            }
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            E3.setState(new AqS57S1100000_3(comment, aid, 26));
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        Aweme aweme;
        String desc;
        User user;
        String str2;
        String str3;
        User author;
        NowFeedMobHierarchyData nowFeedMobHierarchyData;
        Integer nowFeedType;
        Aweme aweme2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        v3().LLLF.LJZL(CommentCell.class);
        getContext();
        v3().setLayoutManager(new LinearLayoutManager());
        C73G LJJII = C63081OpJ.LJJII(this);
        if (LJJII != null && (aweme2 = LJJII.LJLIL) != null) {
            CommentListVM A3 = A3();
            String aid = aweme2.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            String authorUid = aweme2.getAuthorUid();
            o.LJIIIIZZ(authorUid, "it.authorUid");
            C73G LJJII2 = C63081OpJ.LJJII(this);
            if (LJJII2 != null) {
                nowFeedMobHierarchyData2 = LJJII2.LJLJJL;
            } else {
                nowFeedMobHierarchyData2 = null;
            }
            A3.getClass();
            A3.LJLIL = aid;
            A3.LJLJI = authorUid;
            A3.LJLJL = nowFeedMobHierarchyData2;
            C73A c73a = A3.LJLJLLL;
            c73a.LJI = aid;
            c73a.LJFF = authorUid;
            c73a.LJII = c73a.LJII;
            A3().LJLILLLLZI = aweme2;
            A3().LJLJJLL = aweme2.isPrivate();
        }
        CommentListVM A32 = A3();
        C73G LJJII3 = C63081OpJ.LJJII(this);
        if (LJJII3 != null) {
            str = LJJII3.LJLILLLLZI;
        } else {
            str = null;
        }
        A32.LJLJJI = str;
        C187377Wz c187377Wz = C187377Wz.LIZIZ;
        if (c187377Wz.LIZIZ() != 0 && ((c187377Wz.LIZIZ() != 2 || ((nowFeedMobHierarchyData = C63081OpJ.LJJII(this).LJLJJL) != null && (nowFeedType = nowFeedMobHierarchyData.getNowFeedType()) != null && c187377Wz.LIZ(nowFeedType.intValue()))) && (aweme = C63081OpJ.LJJII(this).LJLIL) != null && (desc = aweme.getDesc()) != null && desc.length() != 0)) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(C212428Vi.LIZ(this)), R.layout.bas, null, false);
            v3().LJLJL(0, LLLLIILL);
            C71799SFv c71799SFv = (C71799SFv) LLLLIILL.findViewById(R.id.eye);
            TextView textView = (TextView) LLLLIILL.findViewById(R.id.mby);
            TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.b4s);
            Aweme aweme3 = C63081OpJ.LJJII(this).LJLIL;
            if (aweme3 != null) {
                user = aweme3.getAuthor();
            } else {
                user = null;
            }
            C62562cu LIZ = AnonymousClass729.LIZ(user);
            if (LIZ != null && c71799SFv != null) {
                C71799SFv.LJIIJ(c71799SFv, LIZ, null, false, null, 110);
            }
            Aweme aweme4 = C63081OpJ.LJJII(this).LJLIL;
            if (aweme4 != null && (author = aweme4.getAuthor()) != null) {
                str2 = C56331M8x.LIZIZ(author, true, true);
            } else {
                str2 = null;
            }
            textView.setText(str2);
            Aweme aweme5 = C63081OpJ.LJJII(this).LJLIL;
            if (aweme5 != null) {
                str3 = aweme5.getDesc();
            } else {
                str3 = null;
            }
            textView2.setText(str3);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.6zH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 181), 4);
        C8YN.LJII(this, E3(), new TBT() { // from class: X.75s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getCommentPublishState();
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 184), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.716
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 187), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.72s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C73U) obj).LJLJJL;
            }
        }, null, C90733hF.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.73F
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C73U) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 172), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.73O
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C73U) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 174), 4);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.73V
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C73U c73u = (C73U) obj;
                c73u.getClass();
                return C208708Ha.LIZLLL(c73u);
            }
        }, null, new AqS169S0100000_3(this, 732), new AqS153S0100000_3(this, 1519), new AqS169S0100000_3(this, 733), 2, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.70q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJLLL;
            }
        }, null, new AqS185S0100000_3(this, 180), 6);
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ2, null), this, ICommentListAssemAbility.class, null);
        }
    }
}
