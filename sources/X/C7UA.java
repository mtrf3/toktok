package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7UA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7UA implements InterfaceC208718Hb<C7UA, C188457aT> {
    public final List<Aweme> LJLIL;
    public final C8HZ<C188457aT> LJLILLLLZI;

    public C7UA() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        List<Aweme> list = this.LJLIL;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return this.LJLILLLLZI.hashCode() + (hashCode * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C188457aT> getListItemState() {
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
        LIZ.append("PoiDetailDiscoveryCategoryAwemeListState(awemeList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C188457aT> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C7UA(int i) {
        this(new C8HZ(null, null, 15), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7UA)) {
            return false;
        }
        C7UA c7ua = (C7UA) obj;
        if (o.LJ(this.LJLIL, c7ua.LJLIL) && o.LJ(this.LJLILLLLZI, c7ua.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C7UA(C8HZ listState, List list) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = list;
        this.LJLILLLLZI = listState;
    }
}
