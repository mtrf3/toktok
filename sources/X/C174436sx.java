package X;

import Y.AObjectS133S0100000_3;
import Y.AObjectS48S0101000_3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174436sx implements InterfaceC174626tG, InterfaceC223218pR<Comment>, InterfaceC174656tJ, InterfaceC174636tH, InterfaceC191547fS {
    public String LJLIL;
    public final InterfaceC174016sH LJLILLLLZI;
    public final InterfaceC174486t2 LJLJI;
    public final RecyclerView LJLJJI;
    public final Context LJLJJL;
    public final C174386ss LJLJJLL;
    public int LJLJL;
    public Comment LJLJLJ;
    public final Aweme LJLJLLL;
    public C174366sq LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public CharSequence LJLLL = "";

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Comment> list, boolean z) {
    }

    public final AbstractC029409q LIZ() {
        C73210SoI c73210SoI = (C73210SoI) this.LJLJJI.getAdapter();
        if (c73210SoI == null) {
            return null;
        }
        return c73210SoI.LJLIL;
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        this.LJLJJI.setVisibility(0);
        this.LJLILLLLZI.LJII();
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        LJIIZILJ(new ArrayList(), false, "");
    }

    public final boolean LJ() {
        boolean z;
        boolean z2;
        C8HS c8hs = (C8HS) LIZ();
        if (c8hs == null || c8hs.mmItems == null) {
            return false;
        }
        if (c8hs.getBasicItemCount() == 1 && (ListProtector.get(c8hs.mmItems, 0) instanceof C1796773j)) {
            z = true;
        } else {
            z = false;
        }
        if (c8hs.getBasicItemCount() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        MK7 mk7 = (MK7) LIZ();
        if (mk7 != null) {
            mk7.showLoadMoreLoading();
        }
    }

    public static List LIZIZ(C73W c73w) {
        ArrayList arrayList = new ArrayList();
        Collection collection = c73w.mmItems;
        if (!C79004UzY.LJJIFFI(collection)) {
            arrayList.addAll(collection);
        }
        return arrayList;
    }

    public static boolean LJI(List list) {
        Comment comment;
        if (C79004UzY.LJJIFFI(list) || (comment = (Comment) ListProtector.get(list, 0)) == null || comment.getCommentType() != 220) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((Comment) ListProtector.get(list, i)).getCommentType() == 221) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0136, code lost:
    
        if (r3 < 0) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.comment.model.Comment r14) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174436sx.LIZLLL(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    public final boolean LJFF(Comment comment) {
        if (!V16.LJJIZ(comment)) {
            return false;
        }
        AbstractC029409q LIZ = LIZ();
        if (!(LIZ instanceof C73W) || ((C73W) LIZ).LLF(comment.getFakeId()) < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174436sx.LJIIJ(java.lang.String):void");
    }

    public final void LJIILLIIL(C73306Spq c73306Spq) {
        C73305Spp statusView = this.LJLILLLLZI.getStatusView();
        o.LJIIIZ(statusView, "<this>");
        statusView.setVisibility(0);
        statusView.setStatus(c73306Spq);
    }

    public final void LJIJI(List<Comment> list) {
        boolean z;
        int i = 8;
        if (list == null) {
            this.LJLJJI.setVisibility(8);
            return;
        }
        if (LJI(list) || LJIIIIZZ(list) || this.LJLLILLLL) {
            z = true;
        } else {
            z = false;
        }
        RecyclerView recyclerView = this.LJLJJI;
        if (z) {
            i = 0;
        }
        recyclerView.setVisibility(i);
    }

    public final void Nl0(Comment comment) {
        int LIZIZ;
        if (comment == null || !comment.getShouldDisplayFakeComment()) {
            return;
        }
        boolean z = !C174446sy.LIZLLL(comment);
        if (V16.LJJIZ(comment)) {
            AbstractC029409q LIZ = LIZ();
            if (z && (LIZ instanceof C73W)) {
                LIZIZ = ((C73W) LIZ).LLF(comment.getFakeId());
            } else {
                LIZIZ = C174446sy.LIZIZ(comment);
            }
            if (LIZIZ >= 0) {
                LJIJJ(comment, LIZIZ);
                C174446sy.LJI(comment, LIZIZ);
            } else {
                LIZLLL(comment);
            }
        } else if (z) {
            LIZLLL(comment);
        }
        C174456sz c174456sz = (C174456sz) ((HashMap) C174446sy.LIZ).get(comment.getFakeId());
        if (c174456sz == null || c174456sz.LIZ != 3) {
            C174446sy.LJII(comment);
        }
        if (z) {
            return;
        }
        int LIZIZ2 = C174446sy.LIZIZ(comment);
        AbstractC029409q LIZ2 = LIZ();
        if (LIZIZ2 < 0 || LIZ2 == null) {
            return;
        }
        LIZ2.notifyItemChanged(LIZIZ2, 1);
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        LJIJ(exc, new ArrayList());
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        MK7 mk7 = (MK7) LIZ();
        if (mk7 != null) {
            mk7.showLoadMoreError();
        }
    }

    @Override // X.InterfaceC174626tG
    public final void onDeleteFailed(Exception exc) {
        if ((exc instanceof C38333F2r) && ((C38306F1q) exc).getErrorCode() == 3002042) {
            C1A7.LJIJJLI(this.LJLJJL, exc, R.string.dma);
        }
    }

    @Override // X.InterfaceC174636tH
    public final void tp0(Object... objArr) {
        C73W c73w = (C73W) LIZ();
        if (c73w != null) {
            c73w.LLIILZL((String) objArr[0], false);
        }
    }

    @Override // X.InterfaceC174656tJ
    public final void vp0(Object... objArr) {
        C73W c73w = (C73W) LIZ();
        if (c73w != null) {
            c73w.LLIILZL((String) objArr[0], true);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Comment> list, boolean z) {
        int i;
        C73W c73w = (C73W) LIZ();
        if (c73w == null) {
            return;
        }
        c73w.setShowFooter(true);
        if (!z) {
            if (!c73w.LJLLL) {
                c73w.setShowFooter(false);
            } else {
                c73w.showLoadMoreEmpty();
            }
        } else {
            c73w.resetLoadMoreState();
        }
        if (list != null) {
            Iterator<Comment> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Comment next = it.next();
                if (next.getCommentType() == 1 || next.getCommentType() == 223) {
                    if (next.isAuthorPin()) {
                        this.LJLJLJ = next;
                        break;
                    }
                }
            }
            c73w.setData(list);
            int size = list.size();
            Context context = this.LJLJJL;
            o.LJIIIZ(context, "context");
            if ((C175236uF.LIZ() & 4) == 4) {
                int i2 = size - 5;
                if (i2 > 5) {
                    i = 5;
                } else {
                    i = i2;
                }
                int i3 = 3;
                int i4 = size - 3;
                if (i4 <= 3) {
                    i3 = i4;
                }
                if (i2 > 5) {
                    i2 = 5;
                }
                for (int i5 = 0; i5 < i; i5++) {
                    C16970lZ.LJ(R.layout.q4, context);
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    C16970lZ.LJ(R.layout.q6, context);
                }
                for (int i7 = 0; i7 < i2; i7++) {
                    C16970lZ.LJ(R.layout.q7, context);
                }
            }
        }
        this.LJLJJI.setVisibility(0);
        this.LJLILLLLZI.setVisibility(8);
    }

    public final int LIZJ(C73W c73w, Comment comment) {
        C174466t0 c174466t0 = this.LJLJJLL.LIZJ;
        String replyId = comment.getReplyId();
        if (c174466t0 != null && c174466t0.LIZ() > 0 && c73w.mmItems != null) {
            int i = 0;
            while (i < c73w.mmItems.size()) {
                Comment comment2 = (Comment) ListProtector.get(c73w.mmItems, i);
                if (comment2 == null || !C38354F3m.LIZJ(comment2.getCid(), replyId) || (comment2.getCommentType() != 1 && !V16.LJJIZ(comment2))) {
                    i++;
                } else {
                    return i;
                }
            }
            return -1;
        }
        return c73w.LLD(1, replyId);
    }

    public final void LJIIIZ(java.util.Map map, java.util.Set set) {
        Comment comment;
        CommentReplyButtonStruct commentReplyButtonStruct;
        C73W c73w = (C73W) LIZ();
        if (c73w == null) {
            return;
        }
        if (c73w.mmItems != null) {
            List<Comment> LLFFF = c73w.LLFFF();
            for (Object obj : set) {
                if (c73w.mmItems.size() > 0 && (comment = (Comment) map.get(obj)) != null) {
                    int indexOf = c73w.mmItems.indexOf(comment);
                    if (indexOf >= 0) {
                        int LIZLLL = c73w.LJLLI.LIZLLL(comment.getCid());
                        if (LIZLLL > 1) {
                            List<T> list = c73w.mmItems;
                            list.subList(indexOf, Math.min(list.size(), LIZLLL + indexOf)).clear();
                        } else {
                            ListProtector.remove(c73w.mmItems, indexOf);
                        }
                    } else {
                        CommentReplyListItem LJII = c73w.LJLLI.LJII(comment.getReplyId());
                        if (LJII != null) {
                            if (LJII.mReplyComments.indexOf(comment) >= 0 && (commentReplyButtonStruct = LJII.mButtonStruct) != null) {
                                commentReplyButtonStruct.setReplyCommentTotal(LJII.mComment.getReplyCommentTotal() - 1);
                                int topSize = LJII.mButtonStruct.getTopSize() + CastIntegerProtector.valueOf(LJII.mButtonStruct.getCid()).intValue() + 1;
                                if (LJII.mButtonStruct.getReplyCommentTotal() <= LJII.mButtonStruct.getTopSize()) {
                                    ListProtector.remove(c73w.mmItems, topSize);
                                } else {
                                    c73w.notifyDataSetChanged();
                                }
                            }
                            Comment comment2 = LJII.mComment;
                            comment2.setReplyCommentTotal(comment2.getReplyCommentTotal() - 1);
                            LJII.mReplyComments.remove(comment);
                        }
                    }
                    c73w.LLIIJLIL(comment);
                }
            }
            C51029K0z.LJIIIIZZ(c73w, LLFFF, c73w.mmItems);
        }
        if (LJ()) {
            c73w.setShowFooter(false);
            if (this.LJLLJ) {
                C73306Spq c73306Spq = new C73306Spq();
                c73306Spq.LIZIZ(this.LJLLL);
                LJIILLIIL(c73306Spq);
                CommentListFragment commentListFragment = (CommentListFragment) this.LJLJI;
                commentListFragment.LLIL.LLF(commentListFragment.LLLIIIL);
                commentListFragment.LLLLIL = false;
            } else {
                C73306Spq c73306Spq2 = new C73306Spq();
                c73306Spq2.LIZIZ(((CommentListFragment) this.LJLJI).Im());
                LJIILLIIL(c73306Spq2);
            }
        }
        C2U8.LIZ(new C174046sK(4, this.LJLIL));
        C1800774x.LIZ(this.LJLIL, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x000d A[ADDED_TO_REGION, EDGE_INSN: B:56:0x000d->B:9:0x000d BREAK  A[LOOP:0: B:28:0x0044->B:51:0x00d3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(com.ss.android.ugc.aweme.comment.model.Comment r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174436sx.LJIILL(com.ss.android.ugc.aweme.comment.model.Comment, boolean):void");
    }

    public final void LJIJ(Exception exc, List<Comment> list) {
        C8HS c8hs = (C8HS) LIZ();
        if (c8hs == null) {
            return;
        }
        if (c8hs.mShowFooter) {
            c8hs.setShowFooter(false);
        }
        c8hs.setData(list);
        if (exc instanceof C38333F2r) {
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LIZIZ(((CommentListFragment) this.LJLJI).Im());
            LJIILLIIL(c73306Spq);
            LJIJI(c8hs.mmItems);
            if (((C38306F1q) exc).getErrorCode() == 14) {
                C1A7.LJIJJ(this.LJLJJL, exc);
                return;
            }
            return;
        }
        MGN mgn = MGN.LJLILLLLZI;
        if (mgn.isStandardUIEnable()) {
            mgn.setStatusView(this.LJLILLLLZI.getStatusView(), "comment_list_page", new AObjectS48S0101000_3(0, this, 1), exc);
            mgn.triggerNetworkTips((Activity) this.LJLJJL, "comment_list_page", (Exception) null, this.LJLILLLLZI.getStatusView());
        } else {
            CommentListFragment commentListFragment = (CommentListFragment) this.LJLJI;
            commentListFragment.getClass();
            C73306Spq c73306Spq2 = new C73306Spq();
            C73312Spw.LJI(c73306Spq2, new AObjectS133S0100000_3(commentListFragment, 1));
            LJIILLIIL(c73306Spq2);
        }
        LJIJI(c8hs.mmItems);
    }

    public final void LJIJJ(Comment comment, int i) {
        C8HS c8hs;
        List<T> list;
        AbstractC029409q LIZ = LIZ();
        if ((LIZ instanceof C73W) && (list = (c8hs = (C8HS) LIZ).mmItems) != 0 && i >= 0 && i <= list.size() - 1) {
            ListProtector.set(list, i, comment);
            c8hs.notifyItemChanged(i);
        }
        List<Comment> list2 = this.LJLJJLL.LIZIZ;
        if (list2 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= list2.size()) {
                    break;
                }
                if (TextUtils.equals(((Comment) ListProtector.get(list2, i2)).getFakeId(), comment.getFakeId())) {
                    ListProtector.set(list2, i2, comment);
                    break;
                }
                i2++;
            }
        }
        List<CommentReplyListItem> list3 = this.LJLJJLL.LIZ;
        if (list3 != null) {
            Iterator it = ((ArrayList) list3).iterator();
            while (it.hasNext()) {
                CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
                if (TextUtils.equals(commentReplyListItem.mComment.getFakeId(), comment.getFakeId())) {
                    commentReplyListItem.mComment = comment;
                } else if (TextUtils.equals(commentReplyListItem.mComment.getCid(), comment.getReplyId())) {
                    List<Comment> list4 = commentReplyListItem.mReplyComments;
                    if (list4 == null) {
                        return;
                    }
                    int size = list4.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (TextUtils.equals(((Comment) ListProtector.get(list4, i3)).getFakeId(), comment.getFakeId())) {
                            C174176sX.LJJIIZ(1, commentReplyListItem.mComment.getCid());
                            ListProtector.set(list4, i3, comment);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Comment> list, boolean z) {
        C73W c73w = (C73W) LIZ();
        if (c73w == null) {
            return;
        }
        c73w.setShowFooter(true);
        if (list == null || list.isEmpty() || !z) {
            if (!c73w.LJLLL) {
                c73w.setShowFooter(false);
            } else {
                c73w.showLoadMoreEmpty();
            }
        } else {
            c73w.resetLoadMoreState();
        }
        c73w.setDataAfterLoadMore(list);
    }

    @Override // X.InterfaceC174626tG
    public final void onDeleteSuccess(String str, C174126sS c174126sS) {
        String str2;
        Comment comment;
        C73W c73w = (C73W) LIZ();
        if (c73w == null) {
            return;
        }
        if (str != null && (comment = this.LJLJLJ) != null && str.equals(comment.getCid())) {
            this.LJLJLJ = null;
        }
        String LLFF = c73w.LLFF(str);
        c73w.LJZ(this.LJLJJLL.LIZLLL(str), str);
        if (LJ()) {
            c73w.setShowFooter(false);
            if (this.LJLLJ) {
                C73306Spq c73306Spq = new C73306Spq();
                c73306Spq.LIZIZ(this.LJLLL);
                LJIILLIIL(c73306Spq);
                this.LJLILLLLZI.setVisibility(0);
                CommentListFragment commentListFragment = (CommentListFragment) this.LJLJI;
                commentListFragment.LLIL.LLF(commentListFragment.LLLIIIL);
                commentListFragment.LLLLIL = false;
            } else {
                C73306Spq c73306Spq2 = new C73306Spq();
                c73306Spq2.LIZIZ(((CommentListFragment) this.LJLJI).Im());
                LJIILLIIL(c73306Spq2);
                this.LJLILLLLZI.setVisibility(0);
            }
        }
        C2U8.LIZ(new C174046sK(4, this.LJLIL));
        C2U8.LIZ(new C174546t8(false, "", str));
        if (str != null && C78857UxB.LJJJIL(LLFF)) {
            C35979EAd<String, C174476t1> c35979EAd = C178046ym.LIZ;
            C174476t1 quickReplyState = c35979EAd.LIZIZ(LLFF);
            if (quickReplyState != null) {
                str2 = quickReplyState.LJLIL;
            } else {
                str2 = null;
            }
            if (o.LJ(str2, str)) {
                o.LJIIIIZZ(quickReplyState, "quickReplyState");
                c35979EAd.LIZLLL(LLFF, new C174476t1("", quickReplyState.LJLILLLLZI));
            }
        }
        C1800774x.LIZ(this.LJLIL, null);
    }

    public final void LJIILIIL(Comment comment, int i, int i2) {
        C174456sz c174456sz;
        int i3;
        List<T> list;
        Comment LIZ;
        List<CommentImageStruct> imageList;
        UrlModel originUrl;
        if (comment == null) {
            return;
        }
        if (C175276uJ.LIZJ() && (LIZ = C174446sy.LIZ(comment.getFakeId())) != null && (imageList = LIZ.getImageList()) != null && (!imageList.isEmpty()) && (originUrl = ((CommentImageStruct) ListProtector.get(imageList, 0)).getOriginUrl()) != null) {
            String cid = comment.getCid();
            o.LJIIIZ(cid, "cid");
            ((java.util.Map) C174936tl.LIZ.getValue()).put(cid, originUrl);
        }
        if (!C174446sy.LIZLLL(comment) && !LJFF(comment)) {
            LIZLLL(comment);
        }
        C174446sy.LJ(comment);
        java.util.Map<String, C174456sz> map = C174446sy.LIZ;
        String fakeId = comment.getFakeId();
        o.LJIIIIZZ(fakeId, "comment.fakeId");
        HashMap hashMap = (HashMap) map;
        C174456sz c174456sz2 = (C174456sz) hashMap.get(comment.getFakeId());
        if (c174456sz2 != null) {
            c174456sz = C174456sz.LIZ(c174456sz2, 4, null, 0, null, 0, null, 62);
        } else {
            c174456sz = new C174456sz(4, null, 0, null, 0, null, 62);
        }
        hashMap.put(fakeId, c174456sz);
        String fakeId2 = comment.getFakeId();
        C8HS c8hs = (C8HS) LIZ();
        if (c8hs != null && (list = c8hs.mmItems) != 0) {
            i3 = 0;
            while (i3 < list.size()) {
                Comment comment2 = (Comment) ListProtector.get(list, i3);
                if (comment2 != null && TextUtils.equals(comment2.getFakeId(), fakeId2)) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        i3 = -1;
        C174446sy.LJI(comment, i3);
        LJIJJ(comment, i3);
        int LIZIZ = C174446sy.LIZIZ(comment);
        if ((LIZIZ == -1 || i < 0 || i2 < 0 || LIZIZ < i || LIZIZ > i2) && !comment.isIgnoreToast()) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJJI);
            c26045AKb.LJIIIIZZ(R.string.dm0);
            c26045AKb.LJIIJ();
        }
        ((HashMap) C174446sy.LIZ).remove(comment.getFakeId());
        this.LJLJJI.setVisibility(0);
        this.LJLILLLLZI.setVisibility(8);
    }

    public final void LJIILJJIL(boolean z, String str, Boolean bool) {
        boolean z2;
        boolean z3;
        C174386ss c174386ss = this.LJLJJLL;
        if (c174386ss == null || c174386ss.LIZ == null) {
            return;
        }
        C174466t0 c174466t0 = c174386ss.LIZJ;
        if ((c174466t0 == null || c174466t0.LIZ() <= 0) && !bool.booleanValue()) {
            return;
        }
        boolean z4 = false;
        if (c174466t0.LIZ() < ((ArrayList) this.LJLJJLL.LIZ).size()) {
            z = false;
        }
        C174366sq c174366sq = this.LJLL;
        if (c174366sq != null && c174366sq.isEnableComment() && !C63081OpJ.LJJLIIIJLJLI(this.LJLJLLL)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C174366sq c174366sq2 = this.LJLL;
        if (c174366sq2 != null && c174366sq2.isCommentClose()) {
            z3 = true;
        } else {
            z3 = false;
        }
        EnumC177706yE enumC177706yE = EnumC177706yE.DEFAULT;
        C174366sq c174366sq3 = this.LJLL;
        if (c174366sq3 != null && c174366sq3.isNoPermissionVideo()) {
            z4 = true;
        }
        if (!z2 && !z4) {
            enumC177706yE = EnumC177706yE.FORBID;
        } else if (z3 && !z4) {
            enumC177706yE = EnumC177706yE.CLOSE;
            this.LJLJI.E4();
        } else if (z) {
            enumC177706yE = EnumC177706yE.EMPTY;
        }
        C174496t3 c174496t3 = c174466t0.LIZJ;
        if (c174496t3 != null && enumC177706yE == c174496t3.getFooterInfo().LIZ && !bool.booleanValue()) {
            return;
        }
        String str2 = this.LJLIL;
        if (str2 == null) {
            str2 = "";
        }
        C73W c73w = (C73W) LIZ();
        if (c73w == null) {
            return;
        }
        int LLD = c73w.LLD(224, HG3.LJIILL().getCurUserId());
        this.LJLJJLL.LJIIJ(str2, LLD, null, new C175446ua(enumC177706yE, str));
        c73w.notifyItemChanged(LLD);
    }

    public final void LJIIZILJ(List<Comment> list, boolean z, CharSequence charSequence) {
        C8HS c8hs = (C8HS) LIZ();
        if (c8hs == null) {
            return;
        }
        c8hs.setShowFooter(false);
        c8hs.setData(list);
        if (z) {
            C73306Spq c73306Spq = new C73306Spq();
            c73306Spq.LJI = charSequence;
            LJIILLIIL(c73306Spq);
        } else {
            C73306Spq c73306Spq2 = new C73306Spq();
            c73306Spq2.LIZIZ(((CommentListFragment) this.LJLJI).Im());
            LJIILLIIL(c73306Spq2);
        }
        LJIJI(c8hs.mmItems);
    }

    @Override // X.InterfaceC174656tJ
    public final void PB(String str, String str2, Exception exc) {
        List<Comment> list;
        int i;
        AbstractC029409q LIZ = LIZ();
        if (LIZ == null || (list = this.LJLJJLL.LIZIZ) == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int size = list.size();
            i = R.string.ei0;
            if (i2 >= size) {
                break;
            }
            Comment comment = (Comment) ListProtector.get(list, i2);
            if (TextUtils.equals(str, comment.getCid())) {
                if (comment.isUserDigged()) {
                    i = R.string.tdd;
                }
                LIZ.notifyItemChanged(i2);
            } else {
                i2++;
            }
        }
        if ((exc instanceof C38333F2r) && ((C38306F1q) exc).getErrorCode() == 3002043) {
            if (str2 == String.valueOf(1)) {
                i = R.string.dmb;
            } else if (str2 == String.valueOf(2)) {
                i = R.string.dmc;
            }
        }
        C1A7.LJIJJLI(this.LJLJJL, exc, i);
    }

    @Override // X.InterfaceC174636tH
    public final void rs(String str, String str2, Exception exc) {
        int i;
        if (LIZ() == null || this.LJLJJLL.LIZIZ == null) {
            return;
        }
        if (!(exc instanceof C38333F2r) || ((C38306F1q) exc).getErrorCode() != 3002043 || str2.equals(String.valueOf(3)) || !str2.equals(String.valueOf(4))) {
            i = R.string.cgn;
        } else {
            i = R.string.cgo;
        }
        C1A7.LJIJJLI(this.LJLJJL, exc, i);
    }

    public final boolean LJIIL(Exception exc, Comment comment, int i, int i2) {
        boolean z;
        if (!C174446sy.LIZLLL(comment) && !LJFF(comment)) {
            LIZLLL(comment);
        }
        C174446sy.LJFF(comment);
        Context context = this.LJLJJI.getContext();
        int LIZIZ = C174446sy.LIZIZ(comment);
        if (LIZIZ == -1 || i < 0 || i2 < 0 || LIZIZ < i || LIZIZ > i2) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZLLL = C178296zB.LIZLLL(context, exc, R.string.dlw, z, comment.isIgnoreToast());
        if (LIZLLL) {
            ((HashMap) C174446sy.LIZ).remove(comment.getFakeId());
        } else {
            int LIZIZ2 = C174446sy.LIZIZ(comment);
            AbstractC029409q LIZ = LIZ();
            if (LIZIZ2 >= 0 && LIZ != null) {
                LIZ.notifyItemChanged(LIZIZ2, 1);
            }
        }
        return LIZLLL;
    }

    public C174436sx(ActivityC45651qj activityC45651qj, InterfaceC174016sH interfaceC174016sH, RecyclerView recyclerView, C174386ss c174386ss, Aweme aweme, InterfaceC174486t2 interfaceC174486t2) {
        this.LJLJJL = activityC45651qj;
        this.LJLJI = interfaceC174486t2;
        this.LJLILLLLZI = interfaceC174016sH;
        this.LJLJJI = recyclerView;
        this.LJLJJLL = c174386ss;
        this.LJLJLLL = aweme;
    }
}
