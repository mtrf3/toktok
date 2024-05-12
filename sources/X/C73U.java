package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.73U, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73U implements InterfaceC208718Hb<C73U, CommentItem> {
    public final C8HZ<CommentItem> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;
    public final CommentItem LJLJI;
    public final C43I<Long> LJLJJI;
    public final C43I<BaseResponse> LJLJJL;
    public final C178136yv LJLJJLL;
    public final boolean LJLJL;

    public C73U() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.LJLIL.hashCode() * 31;
        C43I<C76800UCe> c43i = this.LJLILLLLZI;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        CommentItem commentItem = this.LJLJI;
        if (commentItem == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = commentItem.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<Long> c43i2 = this.LJLJJI;
        if (c43i2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C43I<BaseResponse> c43i3 = this.LJLJJL;
        if (c43i3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C178136yv c178136yv = this.LJLJJLL;
        if (c178136yv != null) {
            i = c178136yv.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z = this.LJLJL;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return i6 + i7;
    }

    @Override // X.InterfaceC2064888m
    public final List<CommentItem> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentListVMState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", openKeyboard=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", deleteComment=");
        LIZ.append(this.LJLJI);
        LIZ.append(", commentCount=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", commentError=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", replyCommentState=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", commentPanelVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<CommentItem> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C73U(int i) {
        this(new C8HZ(null, null, 15), null, null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73U)) {
            return false;
        }
        C73U c73u = (C73U) obj;
        if (o.LJ(this.LJLIL, c73u.LJLIL) && o.LJ(this.LJLILLLLZI, c73u.LJLILLLLZI) && o.LJ(this.LJLJI, c73u.LJLJI) && o.LJ(this.LJLJJI, c73u.LJLJJI) && o.LJ(this.LJLJJL, c73u.LJLJJL) && o.LJ(this.LJLJJLL, c73u.LJLJJLL) && this.LJLJL == c73u.LJLJL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C73U(C8HZ<CommentItem> listState, C43I<C76800UCe> c43i, CommentItem commentItem, C43I<Long> c43i2, C43I<? extends BaseResponse> c43i3, C178136yv c178136yv, boolean z) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = c43i;
        this.LJLJI = commentItem;
        this.LJLJJI = c43i2;
        this.LJLJJL = c43i3;
        this.LJLJJLL = c178136yv;
        this.LJLJL = z;
    }

    public static C73U LIZ(C73U c73u, C8HZ c8hz, CommentItem commentItem, C43I c43i, C43I c43i2, boolean z, int i) {
        C43I<C76800UCe> c43i3;
        boolean z2 = z;
        C43I c43i4 = c43i2;
        C43I c43i5 = c43i;
        C8HZ listState = c8hz;
        CommentItem commentItem2 = commentItem;
        if ((i & 1) != 0) {
            listState = c73u.LJLIL;
        }
        C178136yv c178136yv = null;
        if ((i & 2) != 0) {
            c43i3 = c73u.LJLILLLLZI;
        } else {
            c43i3 = null;
        }
        if ((i & 4) != 0) {
            commentItem2 = c73u.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i5 = c73u.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i4 = c73u.LJLJJL;
        }
        if ((i & 32) != 0) {
            c178136yv = c73u.LJLJJLL;
        }
        if ((i & 64) != 0) {
            z2 = c73u.LJLJL;
        }
        c73u.getClass();
        o.LJIIIZ(listState, "listState");
        return new C73U(listState, c43i3, commentItem2, c43i5, c43i4, c178136yv, z2);
    }
}
