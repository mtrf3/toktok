package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: X.73y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC1798273y implements View.OnClickListener, View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass744 LJLIL;

    public ViewOnClickListenerC1798273y(AnonymousClass744 anonymousClass744) {
        this.LJLIL = anonymousClass744;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Comment comment;
        AnonymousClass744 anonymousClass744 = this.LJLIL;
        InterfaceC1797373p interfaceC1797373p = anonymousClass744.LLIL;
        if (interfaceC1797373p != null && (comment = anonymousClass744.LJLILLLLZI) != null) {
            ((CommentListFragment) interfaceC1797373p).An(anonymousClass744.LLF, comment);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Comment comment;
        AnonymousClass744 anonymousClass744 = this.LJLIL;
        InterfaceC1797373p interfaceC1797373p = anonymousClass744.LLIL;
        if (interfaceC1797373p != null && (comment = anonymousClass744.LJLILLLLZI) != null) {
            ((CommentListFragment) interfaceC1797373p).Cn(anonymousClass744.LLF, comment, anonymousClass744.LLFF);
            return true;
        }
        return true;
    }
}
