package com.ss.android.ugc.aweme.comment.viewmodel;

import X.AnonymousClass702;
import X.AnonymousClass706;
import X.C176616wT;
import X.C36922EeM;
import X.C55688LtM;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.InterfaceC64592gB;
import X.T16;
import Y.AfS35S0101000_3;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentLikeViewModel extends ViewModel {
    public boolean LJLJI;
    public Comment LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public AnonymousClass706 LJLJLJ;
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final SingleLiveEvent<AnonymousClass702> LJLILLLLZI = new SingleLiveEvent<>();
    public final C176616wT LJLJLLL = new C176616wT();

    public final void gv0(final int i, final boolean z) {
        String str;
        String str2 = this.LJLJJL;
        if (str2 == null || str2.length() == 0) {
            if (C36922EeM.LIZ) {
                C36922EeM.LIZLLL(5, "jxl1107", "requestLikeComment awemeId is empty");
                return;
            }
            return;
        }
        final Comment comment = this.LJLJJI;
        this.LJLJI = true;
        String str3 = this.LJLJJL;
        String str4 = this.LJLJJLL;
        this.LJLJLLL.LJ();
        C176616wT c176616wT = this.LJLJLLL;
        c176616wT.getClass();
        c176616wT.LIZLLL = "ttk_comment_digg_api_monitor";
        C176616wT c176616wT2 = this.LJLJLLL;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            c176616wT2.LIZ.put("digg_type", valueOf);
        } else {
            c176616wT2.getClass();
        }
        AnonymousClass706 anonymousClass706 = this.LJLJLJ;
        if (anonymousClass706 != null && (str = anonymousClass706.LIZ) != null) {
            this.LJLJLLL.LIZ.put("enter_from", str);
        }
        if (str3 != null) {
            this.LJLJLLL.LIZIZ.put("gid", str3);
        }
        if (str4 != null) {
            this.LJLJLLL.LIZIZ.put("cid", str4);
        }
        C78999UzT.LJFF(((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).likeComment(this.LJLJJLL, this.LJLJJL, String.valueOf(i), C55688LtM.LIZ(this.LJLJL)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.701
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str5;
                String str6;
                BaseResponse it = (BaseResponse) obj;
                CommentLikeViewModel commentLikeViewModel = CommentLikeViewModel.this;
                o.LJIIIIZZ(it, "it");
                commentLikeViewModel.LJLJLLL.LIZ();
                commentLikeViewModel.LJLJLLL.LIZLLL(it);
                commentLikeViewModel.LJLJLLL.LJFF();
                int i2 = i;
                if (i2 == 1 || i2 == 2) {
                    CommentLikeViewModel commentLikeViewModel2 = CommentLikeViewModel.this;
                    Comment comment2 = comment;
                    boolean z2 = z;
                    commentLikeViewModel2.getClass();
                    if (comment2 != null) {
                        if (i2 == 1) {
                            comment2.setUserDigged(1);
                            comment2.setDiggCount(comment2.getDiggCount() + 1);
                            comment2.isAuthorDigged = z2;
                            comment2.setUserBuried(0);
                            str5 = "like success";
                        } else {
                            comment2.setUserDigged(0);
                            comment2.setDiggCount(comment2.getDiggCount() - 1);
                            comment2.isAuthorDigged = z2;
                            str5 = "unlike success";
                        }
                        commentLikeViewModel2.LJLILLLLZI.setValue(new AnonymousClass702(str5, 2));
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("digg success: comment id ");
                        LIZ.append(comment2.getCid());
                        C71Y.LIZLLL("LikeAndHateView", X1D.LIZIZ(LIZ));
                        commentLikeViewModel2.hv0(i2, true);
                        Z9N.LIZIZ.LLJJJJJIL(Integer.valueOf(comment2.getUserDigged()), comment2.getCid());
                        String cid = comment2.getCid();
                        o.LJIIIIZZ(cid, "comment.cid");
                        C2U8.LIZ(new C174396st(cid, comment2.getUserDigged(), "comment_panel"));
                        C1800774x.LIZ(commentLikeViewModel2.LJLJJL, null);
                    }
                } else if (i2 == 3 || i2 == 4) {
                    CommentLikeViewModel commentLikeViewModel3 = CommentLikeViewModel.this;
                    Comment comment3 = comment;
                    boolean z3 = z;
                    commentLikeViewModel3.getClass();
                    if (comment3 != null) {
                        if (i2 == 3) {
                            comment3.setUserBuried(1);
                            if (comment3.isUserDigged()) {
                                comment3.setUserDigged(0);
                                comment3.setDiggCount(comment3.getDiggCount() - 1);
                                comment3.isAuthorDigged = z3;
                            }
                            str6 = "hate success";
                        } else {
                            comment3.setUserBuried(0);
                            str6 = "unhate success";
                        }
                        commentLikeViewModel3.LJLILLLLZI.setValue(new AnonymousClass702(str6, 2));
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("hate success: comment id ");
                        LIZ2.append(comment3.getCid());
                        C71Y.LIZLLL("LikeAndHateView", X1D.LIZIZ(LIZ2));
                        commentLikeViewModel3.hv0(i2, true);
                        String cid2 = comment3.getCid();
                        o.LJIIIIZZ(cid2, "comment.cid");
                        C2U8.LIZ(new C174396st(cid2, comment3.getUserDigged(), "comment_panel"));
                        C1800774x.LIZ(commentLikeViewModel3.LJLJJL, null);
                    }
                }
                CommentLikeViewModel.this.LJLJI = false;
            }
        }, new AfS35S0101000_3(i, this, 0)), this.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r13 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r3 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(int r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel.hv0(int, boolean):void");
    }
}
