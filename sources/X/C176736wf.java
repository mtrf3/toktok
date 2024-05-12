package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176736wf extends AbstractC03120Ai {
    public final List<? extends Comment> LIZ;
    public final List<? extends Comment> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        return null;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C176736wf(List<? extends Comment> mOldList, List<? extends Comment> mNewList) {
        o.LJIIIZ(mOldList, "mOldList");
        o.LJIIIZ(mNewList, "mNewList");
        this.LIZ = mOldList;
        this.LIZIZ = mNewList;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        Comment comment = (Comment) ListProtector.get(this.LIZ, i);
        Comment comment2 = (Comment) ListProtector.get(this.LIZIZ, i2);
        if (o.LJ(comment.getCid(), comment2.getCid()) && comment.getCommentType() == comment2.getCommentType() && comment.isNeedHint() == comment2.isNeedHint() && comment.isAuthorPin() == comment2.isAuthorPin() && o.LJ(comment.getText(), comment2.getText()) && o.LJ(comment.getImageList(), comment2.getImageList()) && comment.getDiggCount() == comment2.getDiggCount() && comment.isAuthorDigged == comment2.isAuthorDigged && comment.getReplyCommentTotal() == comment2.getReplyCommentTotal() && comment.getTransBtnStyle() == comment2.getTransBtnStyle()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        boolean z;
        Comment comment = (Comment) ListProtector.get(this.LIZ, i);
        Comment comment2 = (Comment) ListProtector.get(this.LIZIZ, i2);
        if (o.LJ(comment, comment2) && o.LJ(comment.getCid(), comment2.getCid()) && comment.isNeedHint() == comment2.isNeedHint() && comment.isAuthorPin() == comment2.isAuthorPin()) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("areItemsTheSame ");
        LIZ.append(z);
        LIZ.append(" old ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(comment);
        LIZ.append(" \n new ");
        LIZ.append(i2);
        LIZ.append(' ');
        LIZ.append(comment2);
        C71Y.LIZ("xjccccccccc", X1D.LIZIZ(LIZ));
        return z;
    }
}
