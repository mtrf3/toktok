package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174386ss {
    public List<CommentReplyListItem> LIZ;
    public List<Comment> LIZIZ;
    public C174466t0 LIZJ;
    public String LIZLLL = "";
    public Comment LJ;
    public Aweme LJFF;
    public boolean LJI;
    public boolean LJII;
    public C174136sT LJIIIIZZ;

    public final void LIZIZ() {
        List<CommentReplyListItem> list = this.LIZ;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        List<Comment> list2 = this.LIZIZ;
        if (list2 != null) {
            list2.clear();
        }
        C174466t0 c174466t0 = this.LIZJ;
        if (c174466t0 != null) {
            c174466t0.LIZ = 0;
            c174466t0.LIZIZ = -1;
            c174466t0.LIZJ = null;
        }
    }

    public final void LIZJ() {
        if (this.LIZ == null) {
            this.LIZ = new ArrayList();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        if (this.LIZJ == null) {
            this.LIZJ = new C174466t0();
        }
        this.LJ = null;
    }

    public final int LIZLLL(String str) {
        int i;
        int size;
        C174466t0 c174466t0;
        EnumC177686yC enumC177686yC;
        if (C79004UzY.LJJIFFI(this.LIZIZ)) {
            return 0;
        }
        for (int i2 = 0; i2 < this.LIZIZ.size(); i2++) {
            Comment comment = (Comment) ListProtector.get(this.LIZIZ, i2);
            if (TextUtils.equals(comment.getCid(), str)) {
                if (comment.getCommentType() == 2) {
                    CommentReplyListItem LJII = LJII(comment.getReplyId());
                    if (LJII != null) {
                        int indexOf = LJII.mReplyComments.indexOf(comment);
                        CommentReplyButtonStruct commentReplyButtonStruct = LJII.mButtonStruct;
                        if (commentReplyButtonStruct != null) {
                            if (indexOf < commentReplyButtonStruct.getTopSize()) {
                                CommentReplyButtonStruct commentReplyButtonStruct2 = LJII.mButtonStruct;
                                commentReplyButtonStruct2.setTopSize(commentReplyButtonStruct2.getTopSize() - 1);
                            }
                            CommentReplyButtonStruct commentReplyButtonStruct3 = LJII.mButtonStruct;
                            commentReplyButtonStruct3.setExpandSize(commentReplyButtonStruct3.getExpandSize() - 1);
                            LJII.mButtonStruct.setReplyCommentTotal(LJII.mComment.getReplyCommentTotal() - 1);
                            if (comment.getReplyCommentTotal() <= LJII.mButtonStruct.getTopSize()) {
                                LJII.mButtonStruct.setStatus(4);
                            }
                        }
                        Comment comment2 = LJII.mComment;
                        comment2.setReplyCommentTotal(comment2.getReplyCommentTotal() - 1);
                        LJII.mReplyComments.remove(comment);
                        C174176sX.LJJIIZ(-1, LJII.mComment.getCid());
                        long replyCommentTotal = LJII.mComment.getReplyCommentTotal();
                        if (((Number) C176076vb.LIZ.getValue()).intValue() == 1 && replyCommentTotal <= 0) {
                            ((ArrayList) this.LIZ).remove(LJII);
                            this.LIZIZ.remove(LJII.mButtonStruct);
                        }
                        return 1;
                    }
                } else if (comment.getCommentType() == 1 || V16.LJJIZ(comment)) {
                    CommentReplyListItem LJII2 = LJII(comment.getCid());
                    if (LJII2 == null) {
                        return 0;
                    }
                    if (LJII2.mInsertInputStruct != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    CommentReplyButtonStruct commentReplyButtonStruct4 = LJII2.mButtonStruct;
                    if (commentReplyButtonStruct4 != null) {
                        size = commentReplyButtonStruct4.getExpandSize() + 2;
                    } else {
                        size = LJII2.mReplyComments.size() + 1;
                    }
                    int i3 = size + i;
                    ((ArrayList) this.LIZ).remove(LJII2);
                    if (V16.LJJIZ(comment) && (c174466t0 = this.LIZJ) != null) {
                        c174466t0.LIZIZ--;
                        if (c174466t0.LIZ() <= 0) {
                            C174496t3 c174496t3 = this.LIZJ.LIZJ;
                            if (c174496t3 != null) {
                                enumC177686yC = c174496t3.getExpandStatus();
                            } else {
                                enumC177686yC = null;
                            }
                            if (enumC177686yC == EnumC177686yC.ALL_EXPANDED) {
                                this.LIZJ.LIZJ = null;
                                i3++;
                            }
                        }
                    }
                    for (int indexOf2 = ((ArrayList) this.LIZ).indexOf(LJII2); indexOf2 < ((ArrayList) this.LIZ).size(); indexOf2++) {
                        CommentReplyButtonStruct commentReplyButtonStruct5 = ((CommentReplyListItem) ListProtector.get(this.LIZ, indexOf2)).mButtonStruct;
                        if (commentReplyButtonStruct5 != null) {
                            commentReplyButtonStruct5.setCid(String.valueOf(Math.max(CastIntegerProtector.valueOf(commentReplyButtonStruct5.getCid()).intValue() - 1, 0)));
                        }
                    }
                    return i3;
                }
            }
        }
        return 0;
    }

    public final int LJ(Comment comment) {
        List<Comment> list = this.LIZIZ;
        if (list != null && comment != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (TextUtils.equals(comment.getCid(), ((Comment) ListProtector.get(this.LIZIZ, i)).getCid())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int LJFF(String str) {
        Comment comment;
        if (this.LIZ == null) {
            return -1;
        }
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            CommentReplyListItem commentReplyListItem = (CommentReplyListItem) ListProtector.get(this.LIZ, i);
            if (commentReplyListItem != null && (comment = commentReplyListItem.mComment) != null && TextUtils.equals(comment.getCid(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final List<Comment> LJI(String str) {
        try {
            List<CommentReplyListItem> list = this.LIZ;
            if (list != null && !C79004UzY.LJJIFFI(list)) {
                return ((CommentReplyListItem) ListProtector.get(this.LIZ, CastIntegerProtector.parseInt(str))).mReplyComments;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final CommentReplyListItem LJII(String str) {
        List<CommentReplyListItem> list = this.LIZ;
        if (list == null) {
            return null;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
            Comment comment = commentReplyListItem.mComment;
            if (comment != null && TextUtils.equals(comment.getCid(), str)) {
                return commentReplyListItem;
            }
        }
        return null;
    }

    public final String LJIIIIZZ(String str) {
        List<CommentReplyListItem> list = this.LIZ;
        if (list == null) {
            return "";
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
            Comment comment = commentReplyListItem.mComment;
            if (comment != null && TextUtils.equals(comment.getCid(), str)) {
                return commentReplyListItem.mComment.getUser().getUid();
            }
        }
        return "";
    }

    public final void LIZ(Comment comment, int i) {
        if (this.LIZ == null || comment == null || i < 0) {
            return;
        }
        CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
        commentReplyListItem.mComment = comment;
        commentReplyListItem.mReplyComments = comment.getReplyComments();
        List<CommentReplyListItem> list = this.LIZ;
        ListProtector.add(list, Math.min(i, ((ArrayList) list).size()), commentReplyListItem);
        if (Math.min(i, ((ArrayList) this.LIZ).size()) == 0) {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                CommentReplyButtonStruct commentReplyButtonStruct = ((CommentReplyListItem) it.next()).mButtonStruct;
                if (commentReplyButtonStruct != null) {
                    commentReplyButtonStruct.setCid(String.valueOf(Math.min(CastIntegerProtector.valueOf(commentReplyButtonStruct.getCid()).intValue() + 1, ((ArrayList) this.LIZ).size())));
                }
            }
        }
        if (!V16.LJJIZ(comment) || this.LIZJ == null) {
            return;
        }
        int min = Math.min(i, ((ArrayList) this.LIZ).size());
        C174466t0 c174466t0 = this.LIZJ;
        if (min < c174466t0.LIZ) {
            c174466t0.LIZ = min;
        }
        int i2 = c174466t0.LIZIZ;
        if (min <= i2) {
            min = i2 + 1;
        }
        c174466t0.LIZIZ = min;
    }

    public final boolean LJIIIZ(String str, String str2) {
        List<CommentReplyListItem> list = this.LIZ;
        if (list == null) {
            return false;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
            Comment comment = commentReplyListItem.mComment;
            if (comment != null && TextUtils.equals(comment.getCid(), str2)) {
                List<Comment> list2 = commentReplyListItem.mReplyComments;
                if (list2 == null) {
                    return false;
                }
                Iterator<Comment> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (TextUtils.equals(it2.next().getCid(), str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void LJIIJ(String str, int i, EnumC177686yC enumC177686yC, C175446ua c175446ua) {
        List<Comment> list = this.LIZIZ;
        if (list == null || this.LIZJ == null || i < 0 || i >= list.size()) {
            return;
        }
        C174496t3 c174496t3 = this.LIZJ.LIZJ;
        C174496t3 c174496t32 = new C174496t3();
        Aweme aweme = this.LJFF;
        if (aweme != null) {
            c174496t32.setAweme(aweme);
        }
        long j = 0;
        if (enumC177686yC == EnumC177686yC.ALL_EXPANDED) {
            c174496t32.setRemainCount(0L);
        } else {
            C7HV c7hv = C7HV.LIZIZ;
            if (str == null) {
                str = "";
            }
            UpvoteList LJIIIZ = c7hv.LJIIIZ(str);
            if (LJIIIZ != null) {
                j = LJIIIZ.getTotal();
            }
            c174496t32.setRemainCount(j - this.LIZJ.LIZ());
        }
        if (enumC177686yC != null) {
            c174496t32.setExpandStatus(enumC177686yC);
        } else if (c174496t3 != null) {
            c174496t32.setExpandStatus(c174496t3.getExpandStatus());
        }
        if (c175446ua != null) {
            c174496t32.setFooterInfo(c175446ua);
        } else if (c174496t3 != null) {
            c174496t32.setFooterInfo(c174496t3.getFooterInfo());
        }
        this.LIZJ.LIZJ = c174496t32;
        ListProtector.set(this.LIZIZ, i, c174496t32);
    }
}
