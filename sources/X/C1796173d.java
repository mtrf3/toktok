package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentViewModelImpl;
import com.ss.android.ugc.aweme.comment.model.CommentInsertInputStruct;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.73d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1796173d extends RecyclerView.ViewHolder {
    public final InterfaceC1797373p LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public String LJLJJI;
    public final CommentViewModelImpl LJLJJL;
    public CommentInsertInputStruct LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1796173d(View itemView, AbsFragment fragment, InterfaceC1797373p interfaceC1797373p) {
        super(itemView);
        CommentViewModelImpl commentViewModelImpl;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = interfaceC1797373p;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(itemView, 1692));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(itemView, 1693));
        if (C1DG.LJ(itemView, "itemView.context") != null) {
            commentViewModelImpl = C174516t5.LIZ(fragment);
        } else {
            commentViewModelImpl = null;
        }
        this.LJLJJL = commentViewModelImpl;
    }
}
