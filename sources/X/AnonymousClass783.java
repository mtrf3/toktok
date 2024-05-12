package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.783, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass783 implements InterfaceC208718Hb<AnonymousClass783, C78K> {
    public final C8HZ<C78K> LJLIL;
    public final C43I<String> LJLILLLLZI;
    public final C43I<Aweme> LJLJI;
    public final C43I<String> LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final C43I<Integer> LJLJJLL;

    public AnonymousClass783() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLJJLL.hashCode() + C40328FsC.LIZIZ(this.LJLJJL, C40328FsC.LIZIZ(this.LJLJJI, C40328FsC.LIZIZ(this.LJLJI, C40328FsC.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C78K> getListItemState() {
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
        LIZ.append("RepostVideoState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", onCellClickEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onCellLongPressEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", deleteRepost=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", needRefresh=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", scrollToPosition=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C78K> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ AnonymousClass783(int i) {
        this(new C8HZ(null, null, 15), new C43I(""), new C43I(null), new C43I(""), new C43I(Boolean.TRUE), new C43I(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass783)) {
            return false;
        }
        AnonymousClass783 anonymousClass783 = (AnonymousClass783) obj;
        if (o.LJ(this.LJLIL, anonymousClass783.LJLIL) && o.LJ(this.LJLILLLLZI, anonymousClass783.LJLILLLLZI) && o.LJ(this.LJLJI, anonymousClass783.LJLJI) && o.LJ(this.LJLJJI, anonymousClass783.LJLJJI) && o.LJ(this.LJLJJL, anonymousClass783.LJLJJL) && o.LJ(this.LJLJJLL, anonymousClass783.LJLJJLL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass783(C8HZ<C78K> listState, C43I<String> onCellClickEvent, C43I<? extends Aweme> onCellLongPressEvent, C43I<String> deleteRepost, C43I<Boolean> needRefresh, C43I<Integer> scrollToPosition) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(onCellClickEvent, "onCellClickEvent");
        o.LJIIIZ(onCellLongPressEvent, "onCellLongPressEvent");
        o.LJIIIZ(deleteRepost, "deleteRepost");
        o.LJIIIZ(needRefresh, "needRefresh");
        o.LJIIIZ(scrollToPosition, "scrollToPosition");
        this.LJLIL = listState;
        this.LJLILLLLZI = onCellClickEvent;
        this.LJLJI = onCellLongPressEvent;
        this.LJLJJI = deleteRepost;
        this.LJLJJL = needRefresh;
        this.LJLJJLL = scrollToPosition;
    }

    public static AnonymousClass783 LIZ(AnonymousClass783 anonymousClass783, C8HZ c8hz, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, int i) {
        C43I<String> deleteRepost;
        C43I scrollToPosition = c43i4;
        C43I needRefresh = c43i3;
        C43I onCellLongPressEvent = c43i2;
        C8HZ listState = c8hz;
        C43I onCellClickEvent = c43i;
        if ((i & 1) != 0) {
            listState = anonymousClass783.LJLIL;
        }
        if ((i & 2) != 0) {
            onCellClickEvent = anonymousClass783.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            onCellLongPressEvent = anonymousClass783.LJLJI;
        }
        if ((i & 8) != 0) {
            deleteRepost = anonymousClass783.LJLJJI;
        } else {
            deleteRepost = null;
        }
        if ((i & 16) != 0) {
            needRefresh = anonymousClass783.LJLJJL;
        }
        if ((i & 32) != 0) {
            scrollToPosition = anonymousClass783.LJLJJLL;
        }
        anonymousClass783.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(onCellClickEvent, "onCellClickEvent");
        o.LJIIIZ(onCellLongPressEvent, "onCellLongPressEvent");
        o.LJIIIZ(deleteRepost, "deleteRepost");
        o.LJIIIZ(needRefresh, "needRefresh");
        o.LJIIIZ(scrollToPosition, "scrollToPosition");
        return new AnonymousClass783(listState, onCellClickEvent, onCellLongPressEvent, deleteRepost, needRefresh, scrollToPosition);
    }
}
