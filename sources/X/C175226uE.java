package X;

import android.text.Editable;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6uE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C175226uE {
    public TuxSheet LIZLLL;
    public Comment LJ;
    public Comment LJFF;
    public final /* synthetic */ C176996x5 LJII;
    public final java.util.Map<String, Editable> LIZ = new HashMap();
    public final java.util.Map<String, List<CommentImageModel>> LIZIZ = new HashMap();
    public final java.util.Map<String, Comment> LIZJ = new HashMap();
    public boolean LJI = false;

    public C175226uE(C176996x5 c176996x5) {
        this.LJII = c176996x5;
    }

    public final void LIZ(Comment comment) {
        if (comment == null) {
            return;
        }
        ((HashMap) this.LIZ).remove(comment.getFakeId());
        ((HashMap) this.LIZIZ).remove(comment.getFakeId());
        ((HashMap) this.LIZJ).remove(comment.getFakeId());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.comment.model.Comment r11, boolean r12) {
        /*
            r10 = this;
            X.C174446sy.LJII(r11)
            X.6wa r3 = X.C174446sy.LIZJ(r11)
            boolean r0 = X.V16.LJJIZ(r11)
            r7 = 0
            if (r0 == 0) goto L5d
            X.6x5 r2 = r10.LJII
            X.6xA r0 = r2.LJLJJI
            if (r0 == 0) goto L5d
            java.lang.String r4 = r11.getText()
            java.util.List r5 = r11.getTextExtra()
            X.6x5 r0 = r10.LJII
            java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel> r6 = r0.LJZL
            r8 = 1
            r9 = r7
            r2.LJJJJJ(r3, r4, r5, r6, r7, r8, r9)
        L25:
            java.util.Map<java.lang.String, android.text.Editable> r0 = r10.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel>> r0 = r10.LIZIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.model.Comment> r0 = r10.LIZJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            r0 = 0
            r10.LJ = r0
            if (r12 == 0) goto L5c
            boolean r2 = r10.LJI
            java.lang.String r1 = r11.getAwemeId()
            java.lang.String r0 = "aid"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "comment"
            X.7au r1 = X.C78Z.LIZ(r0, r1, r2)
            java.lang.String r0 = "no_show"
            r1.LIZLLL(r7, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "comment_rethink_hit"
            X.FMX.LJIIL(r0, r1)
        L5c:
            return
        L5d:
            boolean r0 = r3 instanceof X.C176676wZ
            if (r0 == 0) goto L81
            X.6wZ r3 = (X.C176676wZ) r3
            r2 = 1
            r3.LJIIL = r2
            X.6x5 r0 = r10.LJII
            X.6wW r1 = r0.LJIILIIL()
            int r0 = r11.getCommentType()
            r1.LJLJJLL = r0
            r1.LJLJLLL = r11
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r7] = r3
            r1.LJJIIJZLJL(r0)
            X.6x5 r0 = r10.LJII
            r0.LJJJJZ(r1)
            goto L25
        L81:
            X.C174446sy.LJFF(r11)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175226uE.LIZIZ(com.ss.android.ugc.aweme.comment.model.Comment, boolean):void");
    }
}
