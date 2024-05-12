package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8j8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219308j8 implements InterfaceC208718Hb<C219308j8, C219368jE> {
    public final C8HZ<C219368jE> LJLIL;
    public final C3C5<AddYoursTopic> LJLILLLLZI;
    public final C3C5<C219948kA> LJLJI;

    public C219308j8() {
        this(0);
    }

    public final int hashCode() {
        int m11hashCodeimpl;
        int hashCode = this.LJLIL.hashCode() * 31;
        C3C5<AddYoursTopic> c3c5 = this.LJLILLLLZI;
        int i = 0;
        if (c3c5 == null) {
            m11hashCodeimpl = 0;
        } else {
            m11hashCodeimpl = C3C5.m11hashCodeimpl(c3c5.m15unboximpl());
        }
        int i2 = (hashCode + m11hashCodeimpl) * 31;
        C3C5<C219948kA> c3c52 = this.LJLJI;
        if (c3c52 != null) {
            i = C3C5.m11hashCodeimpl(c3c52.m15unboximpl());
        }
        return i2 + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<C219368jE> getListItemState() {
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
        LIZ.append("AddYoursCollectionListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", unCollectTopicResult=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", translationResult=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C219368jE> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C219308j8(int i) {
        this(new C8HZ(null, null, 15), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C219308j8)) {
            return false;
        }
        C219308j8 c219308j8 = (C219308j8) obj;
        if (o.LJ(this.LJLIL, c219308j8.LJLIL) && o.LJ(this.LJLILLLLZI, c219308j8.LJLILLLLZI) && o.LJ(this.LJLJI, c219308j8.LJLJI)) {
            return true;
        }
        return false;
    }

    public C219308j8(C8HZ<C219368jE> listState, C3C5<AddYoursTopic> c3c5, C3C5<C219948kA> c3c52) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = c3c5;
        this.LJLJI = c3c52;
    }

    public static C219308j8 LIZ(C219308j8 c219308j8, C8HZ listState, C3C5 c3c5, C3C5 c3c52, int i) {
        if ((i & 1) != 0) {
            listState = c219308j8.LJLIL;
        }
        if ((i & 2) != 0) {
            c3c5 = c219308j8.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c3c52 = c219308j8.LJLJI;
        }
        c219308j8.getClass();
        o.LJIIIZ(listState, "listState");
        return new C219308j8(listState, c3c5, c3c52);
    }
}
