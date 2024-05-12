package com.ss.android.ugc.aweme.comment.commentlist.viewmodel;

import X.C174766tU;
import X.C174776tV;
import X.C174986tq;
import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65784Pro;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentViewModelImpl extends CommentViewModel {
    public static final /* synthetic */ int LJLJJL = 0;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C174986tq.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C174776tV.LJLIL);

    @Override // com.ss.android.ugc.aweme.comment.api.CommentViewModel
    public final MutableLiveData gv0() {
        return ((C174766tU) this.LJLJJI.getValue()).LIZ;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public final void hv0(Comment comment, InterfaceC65784Pro<Boolean> block) {
        String cid;
        o.LJIIIZ(block, "block");
        if (comment == null || (cid = comment.getCid()) == null || cid.length() == 0 || ((Set) this.LJLIL.getValue()).contains(comment.getCid())) {
            return;
        }
        Set set = (Set) this.LJLIL.getValue();
        String cid2 = comment.getCid();
        o.LJIIIIZZ(cid2, "comment.cid");
        set.add(cid2);
        block.invoke();
    }
}
