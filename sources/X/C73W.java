package X;

import Y.AObjectS133S0100000_3;
import Y.AObjectS56S0101000_13;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS39S0100000_3;
import Y.IDRunnableS6S0101000;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.adapter.CommentPreCreateViewHolderManager;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentViewModelImpl;
import com.ss.android.ugc.aweme.comment.commentpage.viewmodel.CommentColorModeViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.73W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73W extends C8HS<Comment> implements AnonymousClass742 {
    public final InterfaceC1797373p LJLIL;
    public final HashMap<Long, Long> LJLILLLLZI;
    public final java.util.Set<Long> LJLJI;
    public C73Y LJLJJI;
    public Boolean LJLJJL;
    public final java.util.Set<Long> LJLJJLL;
    public String LJLJL;
    public Aweme LJLJLJ;
    public C174366sq LJLJLLL;
    public String LJLL;
    public C174386ss LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public boolean LJLLL;
    public final HashSet<Comment> LJLLLL;
    public C226288uO LJLLLLLL;
    public DataCenter LJLZ;
    public final CommentPreCreateViewHolderManager LJZ;
    public HashSet<String> LJZI;
    public CommentColorModeViewModel LJZL;
    public final CommentViewModelImpl LL;
    public final boolean LLD;
    public final C174706tO LLF;
    public final AbsFragment LLFF;
    public final C1796973l LLFFF;

    public final Aweme LL() {
        if (this.LJLJLLL.getAweme() == null) {
            return this.LJLJLJ;
        }
        return this.LJLJLLL.getAweme();
    }

    public final List<Comment> LLFFF() {
        if (this.mmItems == null) {
            this.mmItems = new ArrayList();
        }
        return new ArrayList(this.mmItems);
    }

    public final boolean LLIIII() {
        CommentColorModeViewModel commentColorModeViewModel = this.LJZL;
        if (commentColorModeViewModel == null || commentColorModeViewModel.LJLJI != 2) {
            return false;
        }
        return true;
    }

    public final boolean LLIIIILZ() {
        Aweme aweme;
        if (C54218LPq.LJLIL.LIZ() && (aweme = this.LJLJLJ) != null && aweme.nowPostInfo != null && aweme.getStatus().getPrivateStatus() == 1) {
            return true;
        }
        return false;
    }

    public final void LLIIIZ() {
        DataCenter dataCenter = this.LJLZ;
        if (dataCenter != null) {
            dataCenter.jv0(0, "comment_shown");
        }
    }

    public final void LLIILII() {
        SY4 sy4;
        C73Y c73y = this.LJLJJI;
        ViewGroup viewGroup = c73y.LJLJLLL;
        if (viewGroup != null && viewGroup.getVisibility() == 0 && (sy4 = c73y.LJLJLJ) != null && sy4.getVisibility() == 0 && !this.LJLJJL.booleanValue()) {
            C7HV.LIZIZ.LJIILIIL(this.LJLJLJ, this.LJLJLLL.getEnterFrom());
            this.LJLJJL = Boolean.TRUE;
        }
    }

    public static boolean LLIFFJFJJ() {
        if (C175236uF.LIZ() != 0 || C176826wo.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.C8HS, X.C4II
    public final int getBasicItemCount() {
        return super.getBasicItemCount();
    }

    @Override // X.C8HS
    public final List<Comment> getData() {
        return this.mmItems;
    }

    public final AnonymousClass745 LJLLLLLL(ViewGroup viewGroup) {
        View LLLLIILL;
        C174706tO c174706tO = this.LLF;
        c174706tO.getClass();
        c174706tO.LIZIZ = "comment_reply";
        if (LLIFFJFJJ() && !LLIIII()) {
            this.LLF.LJ();
            LLLLIILL = C16970lZ.LIZJ(R.layout.q6, C45804HyK.LJIJJ(viewGroup.getContext()), viewGroup, false);
            this.LLF.LIZLLL();
            if (C176826wo.LIZIZ()) {
                C16970lZ.LJ(R.layout.q6, viewGroup.getContext());
            }
        } else {
            this.LLF.LJ();
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.q6, viewGroup, false);
            this.LLF.LIZLLL();
        }
        return new AnonymousClass745(LLLLIILL, this.LLFF, this.LJLIL);
    }

    public final AnonymousClass746 LJLZ(ViewGroup viewGroup) {
        View LLLLIILL;
        C174706tO c174706tO = this.LLF;
        c174706tO.getClass();
        c174706tO.LIZIZ = "comment_new_style_for_reply";
        if (LLIFFJFJJ() && !LLIIII()) {
            this.LLF.LJ();
            LLLLIILL = C16970lZ.LIZJ(R.layout.q4, C45804HyK.LJIJJ(viewGroup.getContext()), viewGroup, false);
            this.LLF.LIZLLL();
            if (C176826wo.LIZIZ()) {
                C16970lZ.LJ(R.layout.q4, viewGroup.getContext());
            }
        } else {
            this.LLF.LJ();
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.q4, viewGroup, false);
            this.LLF.LIZLLL();
        }
        return new AnonymousClass746(LLLLIILL, this.LLFF, this.LJLIL);
    }

    public final int LLF(String str) {
        if (super.getBasicItemCount() == 0) {
            return -1;
        }
        for (int i = 0; i < this.mmItems.size(); i++) {
            Comment comment = (Comment) ListProtector.get(this.mmItems, i);
            if (comment != null && comment.getCommentType() == 223 && C38354F3m.LIZJ(comment.getFakeId(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final String LLFF(String str) {
        int basicItemCount = super.getBasicItemCount();
        if (basicItemCount == 0 || TextUtils.isEmpty(str) || this.mmItems == null) {
            return "";
        }
        for (int i = 0; i < basicItemCount; i++) {
            Comment comment = (Comment) ListProtector.get(this.mmItems, i);
            if (comment != null && C38354F3m.LIZJ(comment.getCid(), str)) {
                return comment.getDirectReplyCid();
            }
        }
        return "";
    }

    public final Rect LLFII(int i) {
        int basicItemViewType;
        int i2 = this.LJLLJ;
        int basicItemViewType2 = getBasicItemViewType(i);
        if (i >= super.getBasicItemCount() - 1) {
            basicItemViewType = -1;
        } else {
            basicItemViewType = getBasicItemViewType(i + 1);
        }
        if ((basicItemViewType2 == 1 || basicItemViewType2 == 0 || basicItemViewType2 == 10 || basicItemViewType2 == 12) && basicItemViewType != 1 && basicItemViewType != 0 && basicItemViewType != 10 && basicItemViewType != 12) {
            i2 = this.LJLLILLLL;
        }
        return new Rect(-1, this.LJLLJ, -1, i2);
    }

    public final void LLFZ(String str) {
        Comment comment;
        if (super.getBasicItemCount() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        Iterator it = this.mmItems.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Comment comment2 = (Comment) it.next();
            if (!C79004UzY.LJJIFFI(comment2.getReplyComments()) && (comment = (Comment) ListProtector.get(comment2.getReplyComments(), 0)) != null && TextUtils.equals(comment.getCid(), str)) {
                it.remove();
                z = true;
            }
        }
        if (!z) {
            return;
        }
        notifyDataSetChanged();
    }

    public final void LLIIIJ(C2UX c2ux) {
        if (super.getBasicItemCount() == 0 || this.mmItems == null) {
            return;
        }
        String str = c2ux.LJLIL;
        Boolean bool = c2ux.LJLILLLLZI;
        for (int i = 0; i < this.mmItems.size(); i++) {
            Comment comment = (Comment) ListProtector.get(this.mmItems, i);
            if (comment != null && C38354F3m.LIZJ(comment.getCid(), str)) {
                if (Boolean.TRUE.equals(bool)) {
                    notifyItemChanged(i, 3);
                } else {
                    notifyItemChanged(i, 4);
                }
                C2U8.LIZ(new C174046sK(2, new Object[]{this.LJLJLLL.getAid(), comment}));
                return;
            }
        }
    }

    public final void LLIIIL(boolean z) {
        final Comment comment;
        int i;
        String aid;
        if (z) {
            ((HashSet) this.LJLJJLL).clear();
            this.LJLJJL = Boolean.FALSE;
            List<T> list = this.mmItems;
            if (list != 0 && !list.isEmpty()) {
                i = 0;
                while (i < list.size()) {
                    if (ListProtector.get(list, i) instanceof C174496t3) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            List<T> list2 = this.mmItems;
            if (list2 != 0 && !list2.isEmpty()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list2.size()) {
                        break;
                    }
                    if (ListProtector.get(list2, i2) instanceof C174496t3) {
                        C174496t3 c174496t3 = (C174496t3) ListProtector.get(list2, i2);
                        if (c174496t3 != null) {
                            boolean hasMyUpvote = c174496t3.getHasMyUpvote();
                            Aweme aweme = c174496t3.getAweme();
                            if (aweme != null && (aid = aweme.getAid()) != null && !aid.isEmpty()) {
                                boolean LJFF = C7HV.LIZIZ.LJFF(aid);
                                if (!hasMyUpvote && LJFF) {
                                    c174496t3.setHasMyUpvote(LJFF);
                                    if (i > 0 && i < this.mmItems.size()) {
                                        notifyItemChanged(i);
                                    }
                                } else {
                                    c174496t3.setHasMyUpvote(LJFF);
                                }
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            ((LinkedHashMap) Y89.LIZIZ).clear();
        }
        HashMap<Long, Long> hashMap = this.LJLILLLLZI;
        if (hashMap == null || this.mmItems == null) {
            return;
        }
        for (Map.Entry<Long, Long> entry : hashMap.entrySet()) {
            Long key = entry.getKey();
            Comment comment2 = new Comment();
            comment2.setCid(String.valueOf(key));
            int indexOf = this.mmItems.indexOf(comment2);
            if (indexOf >= 0 && (comment = (Comment) ListProtector.get(this.mmItems, indexOf)) != null) {
                if (z) {
                    if (this.LJLJJI != null) {
                        LLIILII();
                    }
                    if (((HashSet) this.LJLJI).contains(key)) {
                        this.LJLILLLLZI.put(Long.valueOf(key.longValue()), Long.valueOf(System.currentTimeMillis()));
                        LLIIJI(comment);
                        CommentViewModelImpl commentViewModelImpl = this.LL;
                        if (commentViewModelImpl != null) {
                            commentViewModelImpl.hv0(comment, new InterfaceC65784Pro<Boolean>() { // from class: X.6tQ
                                @Override // X.InterfaceC65784Pro
                                public final Boolean invoke() {
                                    if (AnonymousClass710.LIZLLL(comment)) {
                                        C73W c73w = C73W.this;
                                        C74Z.LJJIJIIJIL("translate", c73w.LJLJL, C178406zM.LJ(c73w.LJLLI, comment), comment, C73W.this.LJLJLLL.getAuthorUid());
                                        C73W.this.LL.LJLILLLLZI = true;
                                    }
                                    Comment comment3 = comment;
                                    if (!comment3.isExpand && comment3.needCollapse) {
                                        FMX.LJIIL("show_more_comment", new C188727au().LIZ);
                                    }
                                    return Boolean.FALSE;
                                }
                            });
                        }
                    }
                } else {
                    CommentViewModelImpl commentViewModelImpl2 = this.LL;
                    if (commentViewModelImpl2 != null) {
                        ((java.util.Set) commentViewModelImpl2.LJLIL.getValue()).clear();
                    }
                    LLIIJLIL((Comment) ListProtector.get(this.mmItems, indexOf));
                    entry.setValue(0L);
                    CommentPreCreateViewHolderManager commentPreCreateViewHolderManager = this.LJZ;
                    synchronized (commentPreCreateViewHolderManager.LIZLLL) {
                        ((LinkedHashMap) commentPreCreateViewHolderManager.LIZLLL).clear();
                    }
                }
            }
        }
    }

    public final void LLIIJI(Comment comment) {
        long j;
        try {
            j = CastLongProtector.parseLong(comment.getCid());
            if (j != 0) {
                if (!((HashSet) this.LJLJJLL).contains(Long.valueOf(j)) && comment.isAuthorDigged && !TextUtils.equals(this.LJLJLLL.getAuthorUid(), Comment.getAuthorUid(comment))) {
                    C74Z.LJIL("show");
                }
            }
        } catch (Exception unused) {
            j = 0;
        }
        ((HashSet) this.LJLJJLL).add(Long.valueOf(j));
    }

    public final void LLIIJLIL(final Comment comment) {
        long j;
        final String cid;
        final String str;
        int i;
        final String str2;
        final String valueOf;
        final String valueOf2;
        String str3;
        final User author;
        if (comment == null || TextUtils.isEmpty(this.LJLJL)) {
            return;
        }
        try {
            j = CastLongProtector.parseLong(comment.getCid());
        } catch (Exception unused) {
            j = 0;
        }
        HashMap<Long, Long> hashMap = this.LJLILLLLZI;
        if (hashMap == null || hashMap.get(Long.valueOf(j)) == null || this.LJLILLLLZI.get(Long.valueOf(j)).longValue() <= 10) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI.get(Long.valueOf(j)).longValue();
        if (currentTimeMillis <= 30) {
            return;
        }
        final String predictedAgeGroup = ((RBX) HG3.LJIILL()).getCurUser().getPredictedAgeGroup();
        final String predictedAgeGroup2 = comment.getUser().getPredictedAgeGroup();
        int i2 = -1;
        final String str4 = "";
        if (comment.getCommentType() == 2) {
            cid = comment.getReplyId();
            C174386ss c174386ss = this.LJLLI;
            if (c174386ss == null) {
                str2 = "";
                i = -1;
            } else {
                i = c174386ss.LJFF(cid);
                str2 = comment.getCid();
                List<Comment> LJI = this.LJLLI.LJI(String.valueOf(i));
                if (LJI != null) {
                    i2 = LJI.indexOf(comment);
                }
            }
            str = "2";
        } else {
            if (comment.getCommentType() == 1) {
                cid = comment.getCid();
                C174386ss c174386ss2 = this.LJLLI;
                if (c174386ss2 != null) {
                    i = c174386ss2.LJFF(cid);
                } else {
                    i = -1;
                }
                str = "1";
            } else {
                cid = comment.getCid();
                List<T> list = this.mmItems;
                if (list == 0) {
                    str = "";
                    i = -1;
                } else {
                    i = list.indexOf(comment);
                    str = "";
                }
            }
            str2 = "";
            i2 = -1;
        }
        if (TextUtils.isEmpty(comment.getLabelText())) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(comment.getLabelType());
        }
        if (comment.getRelationLabel() == null) {
            valueOf2 = "";
        } else {
            valueOf2 = String.valueOf(comment.getRelationLabel().getType());
        }
        if (comment.getUser() == null || comment.getUser().getUid() == null) {
            str3 = "";
        } else {
            str3 = comment.getUser().getUid();
        }
        if (TextUtils.equals(this.LJLJLLL.getAuthorUid(), str3)) {
            str4 = "creator";
        } else if (comment.getUser().getFollowStatus() == 2) {
            str4 = "friends";
        } else if (comment.getUser().getFollowStatus() == 1) {
            str4 = "following";
        }
        Aweme aweme = this.LJLJLJ;
        if (aweme == null) {
            author = null;
        } else {
            author = aweme.getAuthor();
        }
        final String str5 = this.LJLJL;
        final String aid = this.LJLJLLL.getAid();
        final int i3 = i + 1;
        final int i4 = 1 + i2;
        final String str6 = this.LJLL;
        final int isLongItem = this.LJLJLLL.getIsLongItem();
        final String cid2 = comment.getCid();
        final boolean isSplitMode = this.LJLJLLL.isSplitMode();
        final String str7 = str3;
        C10K.LIZIZ(new Callable() { // from class: X.72h
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
            
                if (r0 == false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
            
                if (r10 != false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
            
                r6 = "1";
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
            
                r4.LJI("is_dm_entrance", r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x014a, code lost:
            
                if (android.text.TextUtils.isEmpty(r19) != false) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x014c, code lost:
            
                r4.LJIIIZ("secondary_comment_id", r19);
                r4.LIZLLL(r3, "secondary_position");
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x015a, code lost:
            
                r1 = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x015c, code lost:
            
                if (r1 == 0) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x015e, code lost:
            
                r4.LIZLLL(r1, "is_long_item");
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0165, code lost:
            
                if (r22 == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0167, code lost:
            
                r4.LJI("from_split", "1");
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0172, code lost:
            
                if (X.C227768wm.LJJIIJ(r9) == false) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0174, code lost:
            
                r4.LJI("log_pb", X.C3A5.LIZ.LIZIZ(r20));
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0187, code lost:
            
                if (android.text.TextUtils.isEmpty(r21) == false) goto L70;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:
            
                r4.LJI("comment_user_id", r3);
                X.FMX.LJIILJJIL("comment_duration", X.C227768wm.LJJIIZI(r4.LIZ));
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0199, code lost:
            
                return X.C76800UCe.LIZ;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x019a, code lost:
            
                r3 = r21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x019d, code lost:
            
                X.FMX.LJIIL("comment_duration", r4.LIZ);
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x013c, code lost:
            
                if (((X.RBX) r0).isMe(r8) != false) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 469
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC1793972h.call():java.lang.Object");
            }
        }, FMX.LIZIZ(), null);
        if (comment.getGift() == null) {
            return;
        }
        String str8 = this.LJLJL;
        String aid2 = this.LJLJLLL.getAid();
        String authorUid = this.LJLJLLL.getAuthorUid();
        String cid3 = comment.getCid();
        Long valueOf3 = Long.valueOf(comment.getGift().getId());
        C188727au LJ = C74Z.LJ(str8, aid2);
        LJ.LJI("enter_from", str8);
        LJ.LJI("group_id", aid2);
        LJ.LJI("author_id", authorUid);
        LJ.LJI("send_user_id", str3);
        LJ.LJI("comment_id", cid3);
        LJ.LJFF(valueOf3, "gift_id");
        FMX.LJIIL("show_gift_comment", LJ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8HS
    public final void addData(List<? extends Comment> list) {
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        C03200Aq.LIZ(new C176736wf(this.mmItems, list), true).LIZJ(this);
        this.mmItems = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0016. Please report as an issue. */
    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        List<T> list = this.mmItems;
        if (list != 0) {
            int commentType = ((Comment) ListProtector.get(list, i)).getCommentType();
            if (commentType != 0) {
                int i2 = 1;
                if (commentType != 1) {
                    i2 = 2;
                    if (commentType != 2) {
                        switch (commentType) {
                            case 9:
                                return 9;
                            case 10:
                                return 10;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                return 11;
                            case 12:
                                return 12;
                            default:
                                switch (commentType) {
                                    case 221:
                                        return 221;
                                    case 222:
                                        return 222;
                                    case 223:
                                        return 223;
                                    case 224:
                                        return 224;
                                    case 225:
                                        return 225;
                                }
                        }
                    }
                }
                return i2;
            }
            return 0;
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        View view;
        Comment comment;
        CommentManagementAssemVM commentManagementAssemVM;
        C74B c74b;
        View view2;
        long j;
        CommentManagementAssemVM commentManagementAssemVM2;
        AnonymousClass748 anonymousClass748;
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        View view3;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AnonymousClass744) {
            AnonymousClass744 anonymousClass744 = (AnonymousClass744) viewHolder;
            Comment comment2 = anonymousClass744.LJLILLLLZI;
            if (comment2 != null && comment2.isNeedHint() && (view3 = anonymousClass744.LLIIIJ) != null) {
                view3.postDelayed(new ARunnableS12S0101000_8(3, anonymousClass744, 35), 150L);
            }
            AbsFragment absFragment = anonymousClass744.LLIIIZ.get();
            if (absFragment != null && (commentBatchManagementViewModel = anonymousClass744.LLFII) != null) {
                commentBatchManagementViewModel.jv0().observe(absFragment, anonymousClass744.LLIFFJFJJ);
            }
            anonymousClass744.L();
            if (anonymousClass744.LLIIIILZ && anonymousClass744.LLIIIZ.get() != null && (commentManagementAssemVM2 = anonymousClass744.LLFZ) != null && (anonymousClass748 = anonymousClass744.LLII) != null) {
                commentManagementAssemVM2.jv0(anonymousClass744, anonymousClass748);
            }
            CommentViewModelImpl commentViewModelImpl = anonymousClass744.LLI;
            if (commentViewModelImpl != null) {
                commentViewModelImpl.hv0(anonymousClass744.LJLILLLLZI, new AObjectS56S0101000_13(2, anonymousClass744, 0));
            }
            comment = anonymousClass744.LJLILLLLZI;
        } else if (viewHolder instanceof AnonymousClass745) {
            AnonymousClass745 anonymousClass745 = (AnonymousClass745) viewHolder;
            Comment comment3 = anonymousClass745.LLFF;
            if (comment3 != null && comment3.isNeedHint() && (view2 = anonymousClass745.LJLILLLLZI) != null) {
                view2.postDelayed(new IDRunnableS6S0101000(1, anonymousClass745, 2), 150L);
            }
            AbsFragment absFragment2 = anonymousClass745.LLIILII.get();
            CommentBatchManagementViewModel commentBatchManagementViewModel2 = anonymousClass745.LLFZ;
            if (commentBatchManagementViewModel2 != null && absFragment2 != null) {
                commentBatchManagementViewModel2.jv0().observe(absFragment2, anonymousClass745.LLII);
            }
            anonymousClass745.L();
            if (anonymousClass745.LLILII && anonymousClass745.LLIILII.get() != null && (commentManagementAssemVM = anonymousClass745.LLI) != null && (c74b = anonymousClass745.LLIFFJFJJ) != null) {
                commentManagementAssemVM.jv0(anonymousClass745, c74b);
            }
            CommentViewModelImpl commentViewModelImpl2 = anonymousClass745.LLIIII;
            if (commentViewModelImpl2 != null) {
                commentViewModelImpl2.hv0(anonymousClass745.LLFF, new AObjectS133S0100000_3(anonymousClass745, 2));
            }
            comment = anonymousClass745.LLFF;
        } else {
            if (viewHolder instanceof C174836tb) {
                C174836tb c174836tb = (C174836tb) viewHolder;
                AbsFragment absFragment3 = c174836tb.LJLLI.get();
                CommentBatchManagementViewModel commentBatchManagementViewModel3 = c174836tb.LJLJLLL;
                if (commentBatchManagementViewModel3 == null || absFragment3 == null) {
                    return;
                }
                commentBatchManagementViewModel3.jv0().observe(absFragment3, c174836tb.LJLL);
                return;
            }
            if (viewHolder instanceof C73X) {
                C73X c73x = (C73X) viewHolder;
                C7BF c7bf = c73x.LJLJL;
                DataCenter dataCenter = c7bf.LJLJJL;
                boolean z = false;
                if (dataCenter != null) {
                    dataCenter.iv0("TAGGED_PEOPLE_ACTION", c7bf, false);
                }
                C42625Go9.LIZIZ(c7bf);
                C1797273o c1797273o = c73x.LJLJLJ.LJLIL;
                c1797273o.getClass();
                C7F9 c7f9 = c1797273o.LIZIZ;
                if (c7f9 == null) {
                    return;
                }
                c1797273o.LIZ.getClass();
                try {
                    Object LJLLJ = ORZ.LJLLJ(c7f9.LIZJ());
                    S1E s1e = (S1E) LJLLJ;
                    S1E s1e2 = (S1E) ORZ.LJLLLL(c7f9.LIZJ());
                    if (s1e2 != null && s1e2.LJIILJJIL() > 1) {
                        z = true;
                    }
                    s1e.LJ(C44100HSm.LIZIZ(c7f9, s1e, z));
                    C3C5.m7constructorimpl((S1E) LJLLJ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                Iterator<S1E> it = c7f9.LIZJ().iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
            if (viewHolder instanceof C1796173d) {
                C1796173d c1796173d = (C1796173d) viewHolder;
                CommentViewModelImpl commentViewModelImpl3 = c1796173d.LJLJJL;
                if (commentViewModelImpl3 == null) {
                    return;
                }
                commentViewModelImpl3.hv0(c1796173d.LJLJJLL, C2L6.LJLIL);
                return;
            }
            if (viewHolder instanceof C73Y) {
                this.LJLJJI = (C73Y) viewHolder;
                LLIILII();
                return;
            }
            if (!(viewHolder instanceof C73Z)) {
                return;
            }
            C73Z c73z = (C73Z) viewHolder;
            if (c73z.LJLLLL != null && !(!r0.isNeedHint()) && (view = c73z.LJLLJ) != null) {
                view.postDelayed(new ARunnableS39S0100000_3(c73z, 212), 150L);
            }
            ActivityC45651qj mo49getActivity = c73z.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            C9XU.LIZIZ(mo49getActivity, c73z);
            return;
        }
        if (comment == null || comment.getUser() == null) {
            return;
        }
        try {
            j = CastLongProtector.parseLong(comment.getCid());
            if (j != 0) {
                this.LJLILLLLZI.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Exception unused) {
            j = 0;
        }
        ((HashSet) this.LJLJI).add(Long.valueOf(j));
        if (comment.getAliasAweme() != null) {
            LLIIL(comment, "video_comment_show", this.LJLJL);
        }
        Aweme aweme = this.LJLJLJ;
        if (aweme != null && aweme.isAd() && comment.getAdFlag() == 1) {
            if (this.LJZI == null) {
                this.LJZI = new HashSet<>();
            }
            String cid = comment.getCid();
            if (!this.LJZI.contains(cid)) {
                this.LJZI.add(cid);
                C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_ad", "othershow", this.LJLJLJ.getAwemeRawAd());
                LIZLLL.LIZJ("top_comment", "refer");
                LIZLLL.LIZIZ(cid, "comment_id");
                LIZLLL.LJI();
            }
        }
        LLIIJI(comment);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        LiveData liveData;
        Comment comment;
        long j;
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof AnonymousClass744) {
            AnonymousClass744 anonymousClass744 = (AnonymousClass744) viewHolder;
            CommentBatchManagementViewModel commentBatchManagementViewModel = anonymousClass744.LLFII;
            if (commentBatchManagementViewModel != null) {
                commentBatchManagementViewModel.jv0().removeObserver(anonymousClass744.LLIFFJFJJ);
            }
            anonymousClass744.M();
            comment = anonymousClass744.LJLILLLLZI;
        } else if (viewHolder instanceof AnonymousClass745) {
            AnonymousClass745 anonymousClass745 = (AnonymousClass745) viewHolder;
            CommentBatchManagementViewModel commentBatchManagementViewModel2 = anonymousClass745.LLFZ;
            if (commentBatchManagementViewModel2 != null) {
                commentBatchManagementViewModel2.jv0().removeObserver(anonymousClass745.LLII);
            }
            anonymousClass745.M();
            comment = anonymousClass745.LLFF;
        } else {
            if (viewHolder instanceof C174836tb) {
                C174836tb c174836tb = (C174836tb) viewHolder;
                CommentBatchManagementViewModel commentBatchManagementViewModel3 = c174836tb.LJLJLLL;
                if (commentBatchManagementViewModel3 == null) {
                    return;
                }
                commentBatchManagementViewModel3.jv0().removeObserver(c174836tb.LJLL);
                return;
            }
            if (viewHolder instanceof C73X) {
                C7BF c7bf = ((C73X) viewHolder).LJLJL;
                DataCenter dataCenter = c7bf.LJLJJL;
                if (dataCenter != null && !TextUtils.isEmpty("TAGGED_PEOPLE_ACTION") && (liveData = (LiveData) ((HashMap) dataCenter.LJLILLLLZI).get("TAGGED_PEOPLE_ACTION")) != null) {
                    liveData.removeObserver(c7bf);
                }
                C42625Go9.LIZJ(c7bf);
                return;
            }
            if (viewHolder instanceof C73Y) {
                this.LJLJJI = null;
                return;
            } else {
                if (!(viewHolder instanceof C73Z)) {
                    return;
                }
                C73Z c73z = (C73Z) viewHolder;
                if (c73z.LJLILLLLZI.mo49getActivity() == null) {
                    return;
                }
                C9XU.LIZLLL(c73z);
                return;
            }
        }
        if (comment == null) {
            return;
        }
        try {
            j = CastLongProtector.parseLong(comment.getCid());
        } catch (Exception unused) {
            j = 0;
        }
        ((HashSet) this.LJLJI).remove(Long.valueOf(j));
    }

    public final void LJZ(int i, String str) {
        int basicItemCount = super.getBasicItemCount();
        if (basicItemCount == 0 || TextUtils.isEmpty(str) || this.mmItems == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 < basicItemCount) {
                Comment comment = (Comment) ListProtector.get(this.mmItems, i2);
                if (comment != null && C38354F3m.LIZJ(comment.getCid(), str)) {
                    if (comment.getGift() != null) {
                        String str2 = this.LJLJL;
                        String aid = this.LJLJLLL.getAid();
                        String authorUid = this.LJLJLLL.getAuthorUid();
                        Long valueOf = Long.valueOf(comment.getGift().getId());
                        C188727au LJ = C74Z.LJ(str2, aid);
                        LJ.LJI("enter_from", str2);
                        LJ.LJI("group_id", aid);
                        LJ.LJI("author_id", authorUid);
                        LJ.LJFF(valueOf, "gift_id");
                        FMX.LJIIL("delete_gift_from_comment", LJ.LIZ);
                    }
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        LJZL(i2, i);
    }

    public final void LJZI(int i, String str) {
        int basicItemCount = super.getBasicItemCount();
        if (basicItemCount == 0 || TextUtils.isEmpty(str) || this.mmItems == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 < basicItemCount) {
                Comment comment = (Comment) ListProtector.get(this.mmItems, i2);
                if (comment != null && C38354F3m.LIZJ(comment.getFakeId(), str)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        LJZL(i2, i);
    }

    public final void LJZL(int i, int i2) {
        int i3;
        List<T> list = this.mmItems;
        if (list != 0 && i > -1 && i < list.size()) {
            List<Comment> LLFFF = LLFFF();
            if (i2 > 1) {
                int i4 = i;
                while (true) {
                    i3 = i + i2;
                    if (i4 >= Math.min(this.mmItems.size(), i3)) {
                        break;
                    }
                    LLIIJLIL((Comment) ListProtector.get(this.mmItems, i4));
                    i4++;
                }
                List<T> list2 = this.mmItems;
                list2.subList(i, Math.min(list2.size(), i3)).clear();
            } else {
                LLIIJLIL((Comment) ListProtector.get(this.mmItems, i));
                ListProtector.remove(this.mmItems, i);
            }
            C51029K0z.LJIIIIZZ(this, LLFFF, this.mmItems);
        }
    }

    public final int LLD(int i, String str) {
        if (super.getBasicItemCount() == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < this.mmItems.size(); i2++) {
            Comment comment = (Comment) ListProtector.get(this.mmItems, i2);
            if (comment != null && comment.getCommentType() == i && C38354F3m.LIZJ(comment.getCid(), str)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.C8HS
    /* renamed from: LLII, reason: merged with bridge method [inline-methods] */
    public final void insertData(Comment comment, int i) {
        if (comment == null) {
            return;
        }
        List<Comment> LLFFF = LLFFF();
        List<T> list = this.mmItems;
        if (list != 0) {
            ListProtector.add(list, i, comment);
            C03200Aq.LIZ(new C176736wf(LLFFF, this.mmItems), true).LIZJ(this);
        }
    }

    public final void LLIILZL(String str, boolean z) {
        boolean z2;
        if (super.getBasicItemCount() == 0 || this.mmItems == null) {
            return;
        }
        for (int i = 0; i < this.mmItems.size(); i++) {
            Comment comment = (Comment) ListProtector.get(this.mmItems, i);
            if (comment != null && C38354F3m.LIZJ(comment.getCid(), str)) {
                if (z) {
                    C176726we.LIZ(comment, this.LJLJLLL.getAuthorUid());
                } else {
                    String authorUid = this.LJLJLLL.getAuthorUid();
                    if (comment.getUserBuried() == 0) {
                        if (comment.isUserDigged()) {
                            comment.setUserDigged(0);
                            comment.setDiggCount(Math.max(comment.getDiggCount() - 1, 0));
                        }
                        comment.setUserBuried(1);
                    } else if (comment.getUserBuried() == 1) {
                        comment.setUserBuried(0);
                    }
                    if (TextUtils.equals(authorUid, HG3.LJIILL().getCurUserId()) && comment.getLabelType() != 1) {
                        if (comment.getUserDigged() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        comment.setAuthorDigged(z2);
                    }
                }
                notifyItemChanged(i, 0);
                C2U8.LIZ(new C174046sK(2, new Object[]{this.LJLJLLL.getAid(), comment}));
                return;
            }
        }
    }

    public final void LLIIZ(String str, boolean z) {
        boolean z2;
        if (super.getBasicItemCount() == 0 || this.mmItems == null) {
            return;
        }
        for (int i = 0; i < this.mmItems.size(); i++) {
            Comment comment = (Comment) ListProtector.get(this.mmItems, i);
            if (comment != null && C38354F3m.LIZJ(comment.getCid(), str)) {
                String authorUid = this.LJLJLLL.getAuthorUid();
                if (comment.isUserDigged() != Boolean.valueOf(z).booleanValue()) {
                    if (comment.getUserDigged() == 1) {
                        comment.setUserDigged(0);
                        comment.setDiggCount(comment.getDiggCount() - 1);
                    } else {
                        comment.setUserDigged(1);
                        comment.setDiggCount(comment.getDiggCount() + 1);
                        if (comment.getUserBuried() == 1) {
                            comment.setUserBuried(0);
                        }
                    }
                    if (TextUtils.equals(authorUid, ((RBX) HG3.LJIILL()).getCurUserId()) && comment.getLabelType() != 1) {
                        if (comment.getUserDigged() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        comment.setAuthorDigged(z2);
                    }
                }
                notifyItemChanged(i, 0);
                C2U8.LIZ(new C174046sK(2, new Object[]{this.LJLJLLL.getAid(), comment}));
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0016. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    @Override // X.C4II
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r16, int r17) {
        /*
            Method dump skipped, instructions count: 2370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73W.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        AnonymousClass745 LJLLLLLL;
        View LIZ;
        View LLLLIILL;
        int i2;
        RecyclerView.ViewHolder LIZ2;
        AnonymousClass744 LJLZ;
        if (i != 2) {
            switch (i) {
                case 9:
                    if (!LLIIII()) {
                        LIZ = C16970lZ.LIZJ(R.layout.q3, C45804HyK.LJIJJ(viewGroup.getContext()), viewGroup, false);
                    } else {
                        LIZ = C28289B8j.LIZ(viewGroup, R.layout.q3, viewGroup, false);
                    }
                    return new C1796173d(LIZ, this.LLFF, this.LJLIL);
                case 10:
                    C1796273e c1796273e = new C1796273e();
                    c1796273e.LJII = 5;
                    c1796273e.LJI = this.LJLJL;
                    c1796273e.LJIIIIZZ = this.LLFFF;
                    return CommercializeAdServiceImpl.LJ().LIZIZ(viewGroup.getContext(), c1796273e);
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    C174706tO c174706tO = this.LLF;
                    c174706tO.getClass();
                    c174706tO.LIZIZ = "comment_reply_button";
                    if (LLIFFJFJJ() && !LLIIII()) {
                        this.LLF.LJ();
                        LLLLIILL = C16970lZ.LIZJ(R.layout.q7, C45804HyK.LJIJJ(viewGroup.getContext()), viewGroup, false);
                        this.LLF.LIZLLL();
                        if (C176826wo.LIZIZ()) {
                            C16970lZ.LJ(R.layout.q7, viewGroup.getContext());
                        }
                    } else {
                        this.LLF.LJ();
                        LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.q7, viewGroup, false);
                        this.LLF.LIZLLL();
                    }
                    C174836tb c174836tb = new C174836tb(LLLLIILL, this.LLFF, this.LJLIL);
                    if (this.LJLJLLL.getAweme() != null) {
                        c174836tb.LJLLILLLL = this.LJLJLLL.getAweme().getAuthor();
                    }
                    return c174836tb;
                case 12:
                    C1796273e c1796273e2 = new C1796273e();
                    c1796273e2.LIZ = C63077OpF.LIZ(this.LJLJLJ);
                    c1796273e2.LJII = 8;
                    c1796273e2.LJI = this.LJLJL;
                    c1796273e2.LJIIIIZZ = this.LLFFF;
                    return CommercializeAdServiceImpl.LJ().LIZIZ(viewGroup.getContext(), c1796273e2);
                default:
                    switch (i) {
                        case 221:
                            C73X c73x = new C73X(C28289B8j.LIZ(viewGroup, R.layout.qk, viewGroup, false), this.LJLIL);
                            c73x.LJLLILLLL = this.LJLZ;
                            return c73x;
                        case 222:
                            C1797073m c1797073m = new C1797073m(C28289B8j.LIZ(viewGroup, R.layout.qc, viewGroup, false));
                            boolean LJIJI = AV1.LJIJI(this.LJLJLLL.getAuthorUid());
                            TextView textView = c1797073m.LJLIL;
                            Resources resources = c1797073m.itemView.getContext().getResources();
                            if (LJIJI) {
                                i2 = R.string.tju;
                            } else {
                                i2 = R.string.tjt;
                            }
                            textView.setText(resources.getText(i2));
                            return c1797073m;
                        case 223:
                            if (!C176536wL.LIZ().LIZLLL || (LIZ2 = this.LJZ.LIZ(i)) == null) {
                                return new C1798173x(C28289B8j.LIZ(viewGroup, R.layout.q4, viewGroup, false), this.LLFF, this.LJLIL);
                            }
                            return LIZ2;
                        case 224:
                            return new C73Y(C28289B8j.LIZ(viewGroup, R.layout.qd, viewGroup, false), this.LJLIL);
                        case 225:
                            C73Z c73z = new C73Z(C28289B8j.LIZ(viewGroup, R.layout.q5, viewGroup, false), this.LLFF, this.LJLIL);
                            String str = this.LJLJL;
                            o.LJIIIZ(str, "<set-?>");
                            c73z.LJLLL = str;
                            return c73z;
                        default:
                            if (!C176536wL.LIZ().LIZLLL || (LJLZ = (AnonymousClass744) this.LJZ.LIZ(i)) == null) {
                                LJLZ = LJLZ(viewGroup);
                            }
                            LJLZ.LLIIII = this.LJLLI;
                            return LJLZ;
                    }
            }
        }
        if (!C176536wL.LIZ().LIZLLL || (LJLLLLLL = (AnonymousClass745) this.LJZ.LIZ(2)) == null) {
            LJLLLLLL = LJLLLLLL(viewGroup);
        }
        LJLLLLLL.LLIIIZ = this.LJLJLLL.getAuthorUid();
        LJLLLLLL.LLIIIL = this.LJLJLLL.getAid();
        LJLLLLLL.LLIIJI = this.LJLJLLL.getAweme();
        LJLLLLLL.LLIIIILZ = this.LJLLI;
        C54838Lfe.LJIJ(this.LJLJLJ);
        if (!this.LLD) {
            LJLLLLLL.LLIIJLIL = LLIIIILZ();
        }
        LJLLLLLL.LLIIIJ = this.LJLJL;
        return LJLLLLLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.73l] */
    public C73W(InterfaceC1797373p interfaceC1797373p, C174366sq c174366sq, AbsFragment absFragment) {
        this.LJLILLLLZI = new HashMap<>();
        this.LJLJI = new HashSet();
        this.LJLJJI = null;
        this.LJLJJL = Boolean.FALSE;
        this.LJLJJLL = new HashSet();
        this.LJLLILLLL = (int) KL2.LIZJ(EF7.LIZIZ(), 6.0f);
        this.LJLLJ = (int) KL2.LIZJ(EF7.LIZIZ(), 10.0f);
        this.LJLLL = false;
        this.LJLLLL = new HashSet<>();
        this.LLD = C7CA.LIZ();
        this.LLF = new C174706tO();
        this.LLFFF = new InterfaceC1799774n() { // from class: X.73l
            @Override // X.InterfaceC1799774n
            public final void LIZ() {
                InterfaceC173976sD interfaceC173976sD = ((CommentListFragment) C73W.this.LJLIL).LLLILZJ;
                if (interfaceC173976sD != null) {
                    interfaceC173976sD.Hj("");
                }
            }
        };
        this.LJLIL = interfaceC1797373p;
        this.LJLJLLL = c174366sq;
        this.LLFF = absFragment;
        setLoadEmptyText(R.string.ect);
        this.LL = C174516t5.LIZ(absFragment);
    }

    public final void LLIIL(Comment comment, String str, String str2) {
        String cid;
        int indexOf;
        String str3;
        String str4;
        String str5;
        String enterMethod;
        if (comment == null) {
            return;
        }
        int i = -1;
        if (comment.getCommentType() == 2) {
            cid = comment.getReplyId();
            C174386ss c174386ss = this.LJLLI;
            if (c174386ss != null) {
                indexOf = c174386ss.LJFF(cid);
                List<Comment> LJI = this.LJLLI.LJI(String.valueOf(indexOf));
                if (LJI != null) {
                    i = LJI.indexOf(comment);
                }
            }
            indexOf = -1;
        } else if (comment.getCommentType() == 1) {
            cid = comment.getCid();
            C174386ss c174386ss2 = this.LJLLI;
            if (c174386ss2 != null) {
                indexOf = c174386ss2.LJFF(cid);
            }
            indexOf = -1;
        } else {
            cid = comment.getCid();
            List<T> list = this.mmItems;
            if (list != 0) {
                indexOf = list.indexOf(comment);
            }
            indexOf = -1;
        }
        if (!TextUtils.isEmpty(comment.getReplyToReplyCommentId()) && !TextUtils.equals(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            str3 = "reply_to_reply";
        } else if (!TextUtils.isEmpty(comment.getReplyId()) && !TextUtils.equals(comment.getReplyId(), CardStruct.IStatusCode.DEFAULT)) {
            str3 = "reply";
        } else {
            str3 = "original";
        }
        String str6 = "";
        if (comment.getUser() == null || comment.getUser().getUid() == null) {
            str4 = "";
        } else {
            str4 = comment.getUser().getUid();
        }
        if (TextUtils.equals("reply_via_video", str)) {
            C1793872g.LJIIJ(str2, this.LJLJLLL.getAid(), comment.getCid(), str4, cid, indexOf + 1, i + 1, str3, this.LJLJLLL.getEnterFrom(), this.LJLJLLL.getInsertCids(), !TextUtils.equals(this.LJLJLLL.getAuthorUid(), ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0, V16.LJJIZ(comment));
            return;
        }
        if (comment.getAliasAweme() != null && comment.getAliasAweme().getAid() != null) {
            str6 = comment.getAliasAweme().getAid();
        }
        if (TextUtils.equals("click_comment_chain", this.LJLJL) || TextUtils.equals("click_comment_bubble", this.LJLJL) || TextUtils.equals("collection_comment", this.LJLJL)) {
            str5 = this.LJLJL;
            if (TextUtils.isEmpty(this.LJLJLLL.getEnterMethod())) {
                enterMethod = this.LJLJL;
            } else {
                enterMethod = this.LJLJLLL.getEnterMethod();
            }
        } else if (TextUtils.equals("message", this.LJLJL) || TextUtils.equals("push", this.LJLJL)) {
            if (TextUtils.equals("message", this.LJLJL)) {
                str5 = "notification";
            } else {
                str5 = this.LJLJL;
            }
            enterMethod = this.LJLJL;
        } else {
            enterMethod = this.LJLJL;
            str5 = "click_comment_button";
        }
        String aid = this.LJLJLLL.getAid();
        String cid2 = comment.getCid();
        int LJJJIL = C79004UzY.LJJJIL(this.LLFF.getContext(), LL());
        C188727au LIZJ = C1793872g.LIZJ(indexOf + 1, i + 1, str5, aid, cid2, str4, cid, str3);
        LIZJ.LJIIIZ("enter_from", enterMethod);
        LIZJ.LJIIIZ("comment_group_id", str6);
        LIZJ.LIZLLL(LJJJIL, "is_landscape_screen");
        FMX.LJIIL("video_comment_show", LIZJ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        Comment comment;
        CommentImageStruct commentImageStruct;
        AnonymousClass708 anonymousClass708;
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
            return;
        }
        if (list.isEmpty()) {
            onBindBasicViewHolder(viewHolder, i);
            return;
        }
        switch (((Integer) ListProtector.get(list, 0)).intValue()) {
            case 0:
                if (viewHolder instanceof AnonymousClass746) {
                    AnonymousClass744 anonymousClass744 = (AnonymousClass744) viewHolder;
                    Comment comment2 = anonymousClass744.LJLILLLLZI;
                    if (comment2 != null && (anonymousClass708 = anonymousClass744.LLD) != null) {
                        anonymousClass708.LJIIJ(Boolean.valueOf(comment2.isUserDigged()), Integer.valueOf(anonymousClass744.LJLILLLLZI.getDiggCount()), Boolean.valueOf(anonymousClass744.LJLILLLLZI.isAuthorDigged), true, false);
                        anonymousClass744.LLD.LJIIIZ(Boolean.valueOf(anonymousClass744.LJLILLLLZI.isUserBuried()));
                    }
                    anonymousClass744.LJLLLL = this.LJLJL;
                }
                if (!(viewHolder instanceof AnonymousClass745)) {
                    return;
                }
                InterfaceC1796473g interfaceC1796473g = (InterfaceC1796473g) viewHolder;
                interfaceC1796473g.LLZZLLIL();
                interfaceC1796473g.LLII(this.LJLJL);
                return;
            case 1:
                if (viewHolder instanceof AnonymousClass746) {
                    ((AnonymousClass744) viewHolder).LLLLZ();
                }
                if (!(viewHolder instanceof InterfaceC1796473g)) {
                    return;
                }
                ((InterfaceC1796473g) viewHolder).LLLLZ();
                return;
            case 2:
                if (!(viewHolder instanceof AnonymousClass746)) {
                    return;
                }
                ((AnonymousClass744) viewHolder).LLLLZ();
                return;
            case 3:
                if (viewHolder instanceof AnonymousClass746) {
                    ((AnonymousClass746) viewHolder).h0(true);
                }
                if (!(viewHolder instanceof AnonymousClass745)) {
                    return;
                }
                ((AnonymousClass745) viewHolder).h0(true);
                return;
            case 4:
                if (viewHolder instanceof AnonymousClass746) {
                    ((AnonymousClass746) viewHolder).h0(false);
                }
                if (!(viewHolder instanceof AnonymousClass745)) {
                    return;
                }
                ((AnonymousClass745) viewHolder).h0(false);
                return;
            case 5:
                if (viewHolder instanceof InterfaceC1798073w) {
                    ((InterfaceC1798073w) viewHolder).LLIIIILZ();
                } else if (viewHolder instanceof InterfaceC1796473g) {
                    ((InterfaceC1796473g) viewHolder).LLIIIILZ();
                }
                List<T> list2 = this.mmItems;
                if (list2 == 0 || list2.isEmpty() || (comment = (Comment) ListProtector.get(this.mmItems, i)) == null || comment.getImageList() == null || comment.getImageList().isEmpty() || (commentImageStruct = (CommentImageStruct) ListProtector.get(comment.getImageList(), 0)) == null || commentImageStruct.getProgress() != -1) {
                    return;
                }
                if (viewHolder instanceof AnonymousClass746) {
                    ((AnonymousClass744) viewHolder).LLLLZ();
                }
                if (!(viewHolder instanceof InterfaceC1796473g)) {
                    return;
                }
                ((InterfaceC1796473g) viewHolder).LLLLZ();
                return;
            case 6:
                if (!(viewHolder instanceof C73Y)) {
                    return;
                }
                C73Y c73y = (C73Y) viewHolder;
                C174496t3 c174496t3 = (C174496t3) ListProtector.get(this.mmItems, i);
                c73y.getClass();
                if (c174496t3 == null) {
                    return;
                }
                int i2 = C177676yB.LIZ[c174496t3.getExpandStatus().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c73y.M();
                        }
                    } else {
                        c73y.LJII();
                    }
                } else {
                    c73y.N(c174496t3.getRemainCount());
                }
                c73y.L();
                return;
            default:
                return;
        }
    }

    public C73W(InterfaceC1797373p interfaceC1797373p, C174366sq c174366sq, AbsFragment absFragment, RecyclerView recyclerView) {
        this(interfaceC1797373p, c174366sq, absFragment);
        if (C176536wL.LIZ().LIZLLL && recyclerView != null) {
            CommentPreCreateViewHolderManager commentPreCreateViewHolderManager = new CommentPreCreateViewHolderManager(this, recyclerView);
            this.LJZ = commentPreCreateViewHolderManager;
            commentPreCreateViewHolderManager.LIZJ = Math.min((int) c174366sq.getCommentCount(), 5);
            if (C175236uF.LIZ() != 0 || C176826wo.LIZIZ() || C71K.LIZIZ()) {
                return;
            }
            EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
            LIZJ.LIZIZ(new CommentPreCreateViewHolderManager.PreCreateViewHolderLegoTask(), true);
            LIZJ.LIZJ();
        }
    }
}
