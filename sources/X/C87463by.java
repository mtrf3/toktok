package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3by, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87463by implements InterfaceC208718Hb<C87463by, C72052sD> {
    public final C8HZ<C72052sD> LJLIL;
    public final StickerSetInfo LJLILLLLZI;

    public C87463by() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        StickerSetInfo stickerSetInfo = this.LJLILLLLZI;
        if (stickerSetInfo == null) {
            hashCode = 0;
        } else {
            hashCode = stickerSetInfo.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // X.InterfaceC2064888m
    public final List<C72052sD> getListItemState() {
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
        LIZ.append("StickerSetDetailState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", info=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C72052sD> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C87463by(int i) {
        this(new C8HZ(null, null, 15), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87463by)) {
            return false;
        }
        C87463by c87463by = (C87463by) obj;
        if (o.LJ(this.LJLIL, c87463by.LJLIL) && o.LJ(this.LJLILLLLZI, c87463by.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C87463by(C8HZ<C72052sD> listState, StickerSetInfo stickerSetInfo) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = stickerSetInfo;
    }

    public static C87463by LIZ(C87463by c87463by, C8HZ listState, StickerSetInfo stickerSetInfo, int i) {
        if ((i & 1) != 0) {
            listState = c87463by.LJLIL;
        }
        if ((i & 2) != 0) {
            stickerSetInfo = c87463by.LJLILLLLZI;
        }
        c87463by.getClass();
        o.LJIIIZ(listState, "listState");
        return new C87463by(listState, stickerSetInfo);
    }
}
