package X;

import android.text.TextUtils;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleCommentCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleCommonCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.78d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809178d extends C79Q implements Observer<C207668Da> {
    public final C79S LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public List<? extends InterfaceC57784Mm4> LJLLI;
    public final java.util.Set<String> LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public InterfaceC67352kd<? super A2G<C1809378f>> LJLLLLLL;
    public C1809978l LJLZ;

    @Override // X.C79Q
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.C79Q
    public final boolean LJI() {
        return true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentDeleteEvent(C174046sK event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.C79Q
    public final void LJFF() {
        this.LJLIL.LLLF.LJZL(ReactionBubbleDescriptionCell.class, ReactionBubbleCommentCell.class, ReactionBubbleCommonCell.class);
    }

    public final boolean LJII() {
        Aweme aweme = this.LJLJI;
        if (!C7GH.LJIIIIZZ(aweme) || !C7GH.LJIIJ(aweme) || !C7GH.LJI() || C7GH.LJ(aweme) <= 0 || (((Number) C7GK.LIZ.getValue()).intValue() & 2) != 2) {
            return false;
        }
        return true;
    }

    @Override // X.C79Q
    public final void LIZIZ() {
        super.LIZIZ();
        C42625Go9.LIZJ(this);
    }

    @Override // X.C79Q
    public final void LIZ(Aweme aweme) {
        int i = 0;
        this.LJLJLJ = 0;
        this.LJLL = 0;
        if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            o.LJIIIIZZ(author, "aweme.author");
            this.LJLZ = new C1809978l(author, aweme, aweme.getCreateTime() * 1000, this.LJLIL.getMMobEventParam());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addPublishBubbleItem, hashCode = ");
            C1809978l c1809978l = this.LJLZ;
            if (c1809978l != null) {
                i = c1809978l.hashCode();
            }
            LIZ.append(i);
            C71Y.LIZ("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
            this.LJLIL.getState().LIZJ(this.LJLZ);
        }
        this.LJLJL = CommentServiceImpl.LJJL().LJJIJIIJI(aweme);
        super.LIZ(aweme);
        C42625Go9.LIZIZ(this);
    }

    @Override // X.C79Q
    public final void LJ(InterfaceC67352kd<? super A2G<C1809378f>> continuation) {
        o.LJIIIZ(continuation, "continuation");
        this.LJLLLLLL = continuation;
        this.LJLL = 0;
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        int LIZ = C177126xI.LIZ();
        int LIZ2 = C176306vy.LIZ();
        if (this.LJLJL) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("xjccccccaweme fetch comment awemeid ");
            LIZ3.append(this.LJLILLLLZI);
            C71Y.LIZ("CommentAndLikeListMgr", X1D.LIZIZ(LIZ3));
            ((CommentListViewModel) this.LJLLJ.getValue()).lv0(LIZ, LIZ2, 0L, this.LJLILLLLZI);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C1809978l c1809978l = this.LJLZ;
        if (c1809978l != null) {
            ListProtector.add(arrayList, 0, c1809978l);
        }
        this.LJLLI = arrayList;
        LikeListVM.BubbleBridge bubbleBridge = ((LikeListVM) this.LJLLL.getValue()).LJLIL;
        if (bubbleBridge != null) {
            bubbleBridge.lv0(this.LJLILLLLZI, new PaginationCursor(0L, 0L));
        } else {
            o.LJIJI("bubbleBridge");
            throw null;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAnchorUpdateEvent(C1810678s event) {
        ReactionBubbleDescriptionCell reactionBubbleDescriptionCell;
        o.LJIIIZ(event, "event");
        C79V c79v = this.LJLIL;
        c79v.getClass();
        AbstractC029409q adapter = c79v.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                RecyclerView.ViewHolder LJJIZ = c79v.LJJIZ(i);
                if ((LJJIZ instanceof ReactionBubbleDescriptionCell) && (reactionBubbleDescriptionCell = (ReactionBubbleDescriptionCell) LJJIZ) != null) {
                    Aweme aweme = event.LJLIL;
                    o.LJIIIZ(aweme, "aweme");
                    C7G0 c7g0 = reactionBubbleDescriptionCell.LJLJLLL;
                    if (c7g0 != null) {
                        c7g0.LIZ(aweme, null);
                    }
                }
            }
        }
    }

    @QD3
    public final void onAuthChangeEvent(C1809278e c1809278e) {
        if (c1809278e != null && c1809278e.LJLILLLLZI) {
            LIZIZ();
            Aweme aweme = this.LJLJI;
            if (aweme != null) {
                LIZ(aweme);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBatchCommentEvent(C174186sY event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (i != 0 && i != 1 && i != 2) {
            return;
        }
        C79V c79v = this.LJLIL;
        c79v.getClass();
        C79Q c79q = c79v.LLLFFI;
        if (c79q == null) {
            return;
        }
        c79q.LIZIZ();
        Aweme aweme = c79q.LJLJI;
        if (aweme == null) {
            return;
        }
        c79q.LIZ(aweme);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUser(C175046tw c175046tw) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlockUserEvent ");
        LIZ.append(c175046tw);
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
        C79V c79v = this.LJLIL;
        c79v.getClass();
        C71Y.LIZLLL("ReactionBubbleList", "onBlockUser");
        C79Q c79q = c79v.LLLFFI;
        if (c79q != null) {
            c79q.LIZIZ();
            Aweme aweme = c79q.LJLJI;
            if (aweme != null) {
                c79q.LIZ(aweme);
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        String str2;
        C207668Da c207668Da2 = c207668Da;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChanged  ");
        Object obj = null;
        if (c207668Da2 != null) {
            str = c207668Da2.LIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" this is ");
        LIZ.append(this);
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
        if (c207668Da2 == null || (str2 = c207668Da2.LIZ) == null) {
            return;
        }
        switch (str2.hashCode()) {
            case -1118677714:
                if (!str2.equals("LOAD_MORE_COMMENT_LIST_FAIL")) {
                    return;
                }
                break;
            case -1077696328:
                if (!str2.equals("REFRESH_LIKED_LIST_SUCCESS")) {
                    return;
                }
                Object obj2 = c207668Da2.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                OSZ osz = (OSZ) obj;
                if (!o.LJ(osz.getFirst(), this.LJLILLLLZI)) {
                    return;
                }
                LJIIIZ((LikeListResponse) osz.getSecond(), true);
                return;
            case -1042345298:
                if (!str2.equals("REFRESH_VIDEO_VIEWER_HISTORY_FAIL")) {
                    return;
                }
                break;
            case -734123415:
                if (!str2.equals("REFRESH_LIKED_LIST_FAIL")) {
                    return;
                }
                break;
            case -675733933:
                if (!str2.equals("REFRESH_VIDEO_VIEWER_HISTORY_SUCCESS")) {
                    return;
                }
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                OSZ osz2 = (OSZ) obj;
                if (!o.LJ(osz2.getFirst(), this.LJLILLLLZI)) {
                    return;
                }
                LJIIJ((ViewerListResponse) osz2.getSecond(), true);
                return;
            case -249497211:
                if (!str2.equals("LOAD_MORE_LIKED_LIST_SUCCESS")) {
                    return;
                }
                Object obj4 = c207668Da2.LIZIZ;
                if (obj4 != null) {
                    obj = obj4;
                }
                OSZ osz3 = (OSZ) obj;
                if (!o.LJ(osz3.getFirst(), this.LJLILLLLZI)) {
                    return;
                }
                LJIIIZ((LikeListResponse) osz3.getSecond(), false);
                return;
            case 307526214:
                if (!str2.equals("REFRESH_COMMENT_LIST_SUCCESS")) {
                    return;
                }
                Object obj5 = c207668Da2.LIZIZ;
                if (obj5 != null) {
                    obj = obj5;
                }
                OSZ osz4 = (OSZ) obj;
                if (!o.LJ(osz4.getFirst(), this.LJLILLLLZI)) {
                    return;
                }
                LJIIIIZZ((CommentItemList) osz4.getSecond(), true);
                return;
            case 517174171:
                if (!str2.equals("REFRESH_COMMENT_LIST_FAIL")) {
                    return;
                }
                break;
            case 1262006593:
                if (!str2.equals("LOAD_MORE_VIDEO_VIEWER_HISTORY_FAIL")) {
                    return;
                }
                break;
            case 1637927891:
                if (!str2.equals("LOAD_MORE_COMMENT_LIST_SUCCESS")) {
                    return;
                }
                Object obj6 = c207668Da2.LIZIZ;
                if (obj6 != null) {
                    obj = obj6;
                }
                OSZ osz5 = (OSZ) obj;
                if (!o.LJ(osz5.getFirst(), this.LJLILLLLZI)) {
                    return;
                }
                LJIIIIZZ((CommentItemList) osz5.getSecond(), false);
                return;
            case 1780372668:
                if (!str2.equals("LOAD_MORE_LIKED_LIST_FAIL")) {
                    return;
                }
                break;
            case 1809158880:
                if (!str2.equals("LOAD_MORE_VIDEO_VIEWER_HISTORY_SUCCESS")) {
                    return;
                }
                Object obj7 = c207668Da2.LIZIZ;
                if (obj7 != null) {
                    obj = obj7;
                }
                OSZ osz6 = (OSZ) obj;
                if (!o.LJ(osz6.getFirst(), this.LJLILLLLZI)) {
                    return;
                }
                LJIIJ((ViewerListResponse) osz6.getSecond(), false);
                return;
            default:
                return;
        }
        Object obj8 = c207668Da2.LIZIZ;
        if (obj8 == null) {
            obj8 = null;
        }
        if (!o.LJ(obj8, this.LJLILLLLZI)) {
            return;
        }
        C71Y.LIZLLL("TrackResume", "continua.resume 1");
        InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd = this.LJLLLLLL;
        if (interfaceC67352kd != null) {
            A2F a2f = A2G.LIZ;
            Exception exc = new Exception();
            a2f.getClass();
            A2I LIZJ = A2F.LIZJ(exc);
            C3C5.m7constructorimpl(LIZJ);
            interfaceC67352kd.resumeWith(LIZJ);
        }
        this.LJLLLLLL = null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentEvent(C175136u5 event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BubbleCommentEvent ");
        LIZ.append(event);
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
        Comment comment = event.LJLILLLLZI;
        int i = event.LJLIL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C79V c79v = this.LJLIL;
                c79v.getClass();
                o.LJIIIZ(comment, "comment");
                C71Y.LIZLLL("ReactionBubbleList", "onCommentDeleted");
                C79Q c79q = c79v.LLLFFI;
                if (c79q == null) {
                    return;
                }
                c79q.LIZIZ();
                Aweme aweme = c79q.LJLJI;
                if (aweme == null) {
                    return;
                }
                c79q.LIZ(aweme);
                return;
            }
            C79V c79v2 = this.LJLIL;
            c79v2.getClass();
            o.LJIIIZ(comment, "comment");
            String fakeId = comment.getFakeId();
            o.LJIIIIZZ(fakeId, "comment.fakeId");
            if (TextUtils.isEmpty(fakeId)) {
                return;
            }
            Iterator it = ((ArrayList) c79v2.getState().LJII()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                if ((interfaceC57784Mm4 instanceof C1809778j) && o.LJ(((C1809778j) interfaceC57784Mm4).LJLILLLLZI.getFakeId(), fakeId)) {
                    if (i2 < 0) {
                        return;
                    }
                    InterfaceC57784Mm4 LJI = c79v2.getState().LJI(i2);
                    if (!(LJI instanceof C1809778j)) {
                        return;
                    }
                    c79v2.getState().LJIILL(i2, new C1809778j(comment, ((C1809778j) LJI).LJLJI, c79v2.LLLIL));
                    return;
                }
                i2++;
            }
            return;
        }
        this.LJLIL.LJLLL(comment);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDiggEvent(C1810878u event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BubbleDiggEvent ");
        LIZ.append(event);
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
        int i = event.LJLIL;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LJLIL.LJLLLLLL();
            return;
        }
        this.LJLIL.LJLLLL();
    }

    @QD3
    public final void onCommentEvent(C187227Wk c187227Wk) {
        if (c187227Wk == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCommentEvent  ");
        LIZ.append(c187227Wk.LJLILLLLZI.getAid());
        C71Y.LIZ("xjccccccc", X1D.LIZIZ(LIZ));
        if (TextUtils.equals(c187227Wk.LJLILLLLZI.getAid(), this.LJLILLLLZI)) {
            C79V c79v = this.LJLIL;
            c79v.getClass();
            C71Y.LIZLLL("ReactionBubbleList", "onCommentAuthChange");
            PowerAdapter powerAdapter = c79v.LLLF;
            powerAdapter.getClass();
            powerAdapter.LLIILZL(new SI2(powerAdapter));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1809178d(C79S params, C79V commentBubbleList) {
        super(commentBubbleList);
        o.LJIIIZ(params, "params");
        o.LJIIIZ(commentBubbleList, "commentBubbleList");
        this.LJLJJLL = params;
        this.LJLJL = true;
        this.LJLLILLLL = new LinkedHashSet();
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1657));
        this.LJLLJ = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1658));
        this.LJLLL = LIZIZ2;
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1659));
        this.LJLLLL = LIZIZ3;
        DataCenter dataCenter = (DataCenter) LIZIZ.getValue();
        dataCenter.iv0("REFRESH_COMMENT_LIST_SUCCESS", this, false);
        dataCenter.iv0("REFRESH_COMMENT_LIST_FAIL", this, false);
        dataCenter.iv0("LOAD_MORE_COMMENT_LIST_SUCCESS", this, false);
        dataCenter.iv0("LOAD_MORE_COMMENT_LIST_FAIL", this, false);
        LikeListVM.BubbleBridge bubbleBridge = ((LikeListVM) LIZIZ2.getValue()).LJLIL;
        if (bubbleBridge != null) {
            bubbleBridge.iv0("REFRESH_LIKED_LIST_SUCCESS", this, false);
            bubbleBridge.iv0("REFRESH_LIKED_LIST_FAIL", this, false);
            bubbleBridge.iv0("LOAD_MORE_LIKED_LIST_SUCCESS", this, false);
            bubbleBridge.iv0("LOAD_MORE_LIKED_LIST_FAIL", this, false);
            String str = params.LIZJ;
            if (str != null) {
                LikeListVM likeListVM = (LikeListVM) LIZIZ2.getValue();
                likeListVM.getClass();
                likeListVM.LJLLJ = str;
            }
            VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel = ((VideoViewerListVM) LIZIZ3.getValue()).LJLILLLLZI;
            if (bubbleVideoViewerViewModel != null) {
                bubbleVideoViewerViewModel.iv0("REFRESH_VIDEO_VIEWER_HISTORY_SUCCESS", this, false);
                bubbleVideoViewerViewModel.iv0("REFRESH_VIDEO_VIEWER_HISTORY_FAIL", this, false);
                bubbleVideoViewerViewModel.iv0("LOAD_MORE_VIDEO_VIEWER_HISTORY_SUCCESS", this, false);
                bubbleVideoViewerViewModel.iv0("LOAD_MORE_VIDEO_VIEWER_HISTORY_FAIL", this, false);
                return;
            }
            o.LJIJI("bubbleVM");
            throw null;
        }
        o.LJIJI("bubbleBridge");
        throw null;
    }

    @Override // X.C79Q
    public final void LIZLLL(InterfaceC67352kd<? super A2G<C1809378f>> continuation, C1809378f params) {
        o.LJIIIZ(continuation, "continuation");
        o.LJIIIZ(params, "params");
        this.LJLLLLLL = continuation;
        int LIZ = C177126xI.LIZ();
        int LIZ2 = C176306vy.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("list load more cursor:");
        LIZ3.append(params.LIZIZ);
        LIZ3.append("  type:");
        LIZ3.append(params.LIZ);
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ3));
        if (TextUtils.isEmpty(this.LJLILLLLZI)) {
            InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd = this.LJLLLLLL;
            if (interfaceC67352kd != null) {
                A2F a2f = A2G.LIZ;
                Exception exc = new Exception();
                a2f.getClass();
                A2I LIZJ = A2F.LIZJ(exc);
                C3C5.m7constructorimpl(LIZJ);
                interfaceC67352kd.resumeWith(LIZJ);
                return;
            }
            return;
        }
        int i = params.LIZ;
        if (i != 1) {
            if (i != 2) {
                VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel = ((VideoViewerListVM) this.LJLLLL.getValue()).LJLILLLLZI;
                if (bubbleVideoViewerViewModel != null) {
                    bubbleVideoViewerViewModel.lv0(this.LJLILLLLZI, params.LIZIZ, C77P.BULLET.getValue());
                    return;
                } else {
                    o.LJIJI("bubbleVM");
                    throw null;
                }
            }
            LikeListVM.BubbleBridge bubbleBridge = ((LikeListVM) this.LJLLL.getValue()).LJLIL;
            if (bubbleBridge != null) {
                bubbleBridge.lv0(this.LJLILLLLZI, params.LIZIZ);
                return;
            } else {
                o.LJIJI("bubbleBridge");
                throw null;
            }
        }
        ((CommentListViewModel) this.LJLLJ.getValue()).lv0(LIZ, LIZ2, params.LIZIZ.getCursor(), this.LJLILLLLZI);
    }

    public final void LJIIIIZZ(CommentItemList commentItemList, boolean z) {
        List<Comment> replyComments;
        C79V c79v;
        C72808Sho<InterfaceC57784Mm4> state;
        List<Comment> list = commentItemList.items;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleCommentListData original comment size ");
        LIZ.append(list.size());
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        for (Comment comment : list) {
            o.LJIIIIZZ(comment, "comment");
            arrayList.add(comment);
            java.util.Set<String> set = this.LJLLILLLL;
            String uid = comment.getUser().getUid();
            o.LJIIIIZZ(uid, "comment.user.uid");
            set.add(uid);
            if (list.size() < 20 && (replyComments = comment.getReplyComments()) != null && (c79v = this.LJLIL) != null && (state = c79v.getState()) != null) {
                Integer valueOf = Integer.valueOf(replyComments.size() + state.LJIIIIZZ());
                if (valueOf.intValue() <= 20) {
                    valueOf.intValue();
                    arrayList.addAll(replyComments);
                    for (Comment comment2 : replyComments) {
                        java.util.Set<String> set2 = this.LJLLILLLL;
                        String uid2 = comment2.getUser().getUid();
                        o.LJIIIIZZ(uid2, "reply.user.uid");
                        set2.add(uid2);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Comment comment3 = (Comment) it.next();
            C1811278y mMobEventParam = this.LJLIL.getMMobEventParam();
            o.LJIIIZ(comment3, "<this>");
            arrayList2.add(new C1809778j(comment3, false, mMobEventParam));
        }
        List<? extends InterfaceC57784Mm4> LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        this.LJLL++;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("currentCommentLoadTimes:");
        LIZ2.append(this.LJLL);
        LIZ2.append(" commentItems: ");
        ArrayList arrayList3 = (ArrayList) LLJILJILJ;
        LIZ2.append(arrayList3.size());
        LIZ2.append(" handleCommentListData: ");
        LIZ2.append(z);
        LIZ2.append(" hasmore ");
        LIZ2.append(commentItemList.hasMore);
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ2));
        C1809978l c1809978l = this.LJLZ;
        if (c1809978l != null && z) {
            ListProtector.add(LLJILJILJ, 0, c1809978l);
        }
        if (commentItemList.hasMore && this.LJLL < 5) {
            C71Y.LIZLLL("TrackResume", "continua.resume 2");
            LJIIJJI(LLJILJILJ, new C1809378f(1, new PaginationCursor(commentItemList.cursor, 0L)));
        } else {
            this.LJLLI = LLJILJILJ;
            C71Y.LIZLLL("TrackResume", "continua.resume 3");
            LikeListVM.BubbleBridge bubbleBridge = ((LikeListVM) this.LJLLL.getValue()).LJLIL;
            if (bubbleBridge != null) {
                bubbleBridge.lv0(this.LJLILLLLZI, new PaginationCursor(0L, 0L));
            } else {
                o.LJIJI("bubbleBridge");
                throw null;
            }
        }
        if (z && arrayList3.size() > 1) {
            this.LJLIL.LJLZ();
        }
        this.LJLIL.setVisibility(0);
    }

    public final void LJIIIZ(LikeListResponse likeListResponse, boolean z) {
        List<User> likeList = likeListResponse.getLikeList();
        if (likeList == null) {
            likeList = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(likeList, 10));
        for (User user : likeList) {
            java.util.Set<String> set = this.LJLLILLLL;
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "it.uid");
            set.add(uid);
            arrayList.add(C78939UyV.LJIIL(user, this.LJLIL.getMMobEventParam()));
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleLikedListData data:hasmore:");
        LIZ.append(likeListResponse.getHasMore());
        LIZ.append(" likedListItems:");
        ArrayList arrayList2 = (ArrayList) LLJILJILJ;
        LIZ.append(arrayList2.size());
        LIZ.append(" currentLikeLoadTimes:");
        LIZ.append(this.LJLJLJ);
        LIZ.append(' ');
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
        Collection collection = this.LJLLI;
        if (collection == null) {
            collection = C61878OQg.INSTANCE;
        }
        List<? extends InterfaceC57784Mm4> LLIIIZ = ORZ.LLIIIZ(LLJILJILJ, collection);
        this.LJLLI = null;
        this.LJLJLJ++;
        if (likeListResponse.getHasMore() && this.LJLJLJ < 5) {
            C71Y.LIZLLL("TrackResume", "continua.resume 4");
            LJIIJJI(LLIIIZ, new C1809378f(2, new PaginationCursor(likeListResponse.getCursor(), likeListResponse.getOffset())));
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("check enableVideoViewer ");
            LIZ2.append(LJII());
            C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ2));
            if (LJII()) {
                C71Y.LIZLLL("TrackResume", "continua.resume 5");
                this.LJLLI = LLIIIZ;
                VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel = ((VideoViewerListVM) this.LJLLLL.getValue()).LJLILLLLZI;
                if (bubbleVideoViewerViewModel != null) {
                    bubbleVideoViewerViewModel.lv0(this.LJLILLLLZI, new PaginationCursor(0L, 0L), C77P.BULLET.getValue());
                } else {
                    o.LJIJI("bubbleVM");
                    throw null;
                }
            } else {
                C71Y.LIZLLL("TrackResume", "continua.resume 6");
                InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd = this.LJLLLLLL;
                if (interfaceC67352kd != null) {
                    A2G.LIZ.getClass();
                    A2H LIZ3 = A2F.LIZ(LLIIIZ);
                    C3C5.m7constructorimpl(LIZ3);
                    interfaceC67352kd.resumeWith(LIZ3);
                }
                this.LJLLLLLL = null;
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("handleLikedListData:powerItemssize:");
        LIZ4.append(arrayList2.size());
        C71Y.LIZLLL("CommentAndLikeListMgr", X1D.LIZIZ(LIZ4));
        if (z && (!arrayList2.isEmpty())) {
            this.LJLIL.LJLZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.OQg] */
    public final void LJIIJ(ViewerListResponse viewerListResponse, boolean z) {
        ?? arrayList;
        if (viewerListResponse.getViewerList() == null) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            List<User> viewerList = viewerListResponse.getViewerList();
            ArrayList arrayList2 = new ArrayList();
            for (User user : viewerList) {
                if (!this.LJLLILLLL.contains(user.getUid())) {
                    arrayList2.add(user);
                }
            }
            arrayList = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                User user2 = (User) it.next();
                C1811278y mMobEventParam = this.LJLIL.getMMobEventParam();
                o.LJIIIZ(user2, "<this>");
                arrayList.add(new C1811078w(user2, C47261Igj.LJJIJ(1002), "views", mMobEventParam));
            }
        }
        C71Y.LIZLLL("CommentAndLikeListMgr", "handleVideoViewerListData data:hasmore:" + viewerListResponse.getHasMore() + ' ' + arrayList.size() + " currentLikeLoadTimes:" + this.LJLJLJ);
        Collection collection = this.LJLLI;
        if (collection == null) {
            collection = C61878OQg.INSTANCE;
        }
        List<? extends InterfaceC57784Mm4> LLIIIZ = ORZ.LLIIIZ(arrayList, collection);
        this.LJLLI = null;
        this.LJLJLLL++;
        if (viewerListResponse.getHasMore() && this.LJLJLLL < 5) {
            C71Y.LIZLLL("TrackResume", "continua.resume 7");
            LJIIJJI(LLIIIZ, new C1809378f(4, new PaginationCursor(viewerListResponse.getCursor(), viewerListResponse.getOffset())));
        } else {
            C71Y.LIZLLL("TrackResume", "continua.resume 8");
            InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd = this.LJLLLLLL;
            if (interfaceC67352kd != null) {
                A2G.LIZ.getClass();
                A2H LIZ = A2F.LIZ(LLIIIZ);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd.resumeWith(LIZ);
            }
        }
        this.LJLLLLLL = null;
        C71Y.LIZLLL("CommentAndLikeListMgr", "handleVideoViewerListData:powerItemssize:" + arrayList.size());
        if (z && (!arrayList.isEmpty())) {
            this.LJLIL.LJLZ();
        }
    }

    public final void LJIIJJI(List<? extends InterfaceC57784Mm4> list, C1809378f c1809378f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pendingItemAndTriggerNext ");
        LIZ.append(this.LJLIL.getState().LJIIIIZZ());
        LIZ.append("  pendingsize ");
        LIZ.append(((ArrayList) list).size());
        C71Y.LIZ("CommentAndLikeListMgr", X1D.LIZIZ(LIZ));
        InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd = this.LJLLLLLL;
        if (interfaceC67352kd != null) {
            A2V LJ = A2F.LJ(A2G.LIZ, null, c1809378f, list, 1);
            C3C5.m7constructorimpl(LJ);
            interfaceC67352kd.resumeWith(LJ);
        }
        this.LJLLLLLL = null;
    }
}
