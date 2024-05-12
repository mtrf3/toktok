package com.ss.android.ugc.aweme.comment.viewmodel;

import X.C36922EeM;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.T16;
import Y.AfS1S1100100_3;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.bubble.BarrageCommentAndLikeApi;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.ICommentListViewModel;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class CommentListViewModel extends ICommentListViewModel {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final LifecycleOwner LJLJL;
    public final C73318Sq2 LJLJLJ;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJLJ.LIZLLL();
    }

    public CommentListViewModel(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJL = lifecycleOwner;
        this.LJLJLJ = new C73318Sq2();
        this.LJLJI = lifecycleOwner;
    }

    public final void lv0(int i, int i2, long j, String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        if (awemeId.length() == 0) {
            if (C36922EeM.LIZ) {
                C36922EeM.LIZLLL(5, "StoryCommentListViewModel", "fetchCommentList awemeId is empty");
            }
        } else {
            C78999UzT.LJFF(BarrageCommentAndLikeApi.LIZIZ.fetchCommentList(awemeId, j, i, i2, 20, null, 1, 2, 1, o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS1S1100100_3(j, this, awemeId, 0), new AfS1S1100100_3(j, this, awemeId, 1)), this.LJLJLJ);
        }
    }
}
