package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.apI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94952apI implements InterfaceC208718Hb<C94952apI, InterfaceC57784Mm4> {
    public final EnumC93982aZe LJLIL;
    public final C43I<OSZ<TT2DSPPlatformInfo, TT2DSPSongInfo>> LJLILLLLZI;
    public final C43I<C93983aZf> LJLJI;
    public final C43I<TT2DSPSongInfo> LJLJJI;
    public final C8HZ<InterfaceC57784Mm4> LJLJJL;

    public C94952apI() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LJLIL.hashCode() * 31;
        C43I<OSZ<TT2DSPPlatformInfo, TT2DSPSongInfo>> c43i = this.LJLILLLLZI;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        C43I<C93983aZf> c43i2 = this.LJLJI;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<TT2DSPSongInfo> c43i3 = this.LJLJJI;
        if (c43i3 != null) {
            i = c43i3.hashCode();
        }
        return ((i3 + i) * 31) + this.LJLJJL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<InterfaceC57784Mm4> getListItemState() {
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
        LIZ.append("MusicDspSheetState(loadingStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", clickDspItem=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", selectDspPlaylist=");
        LIZ.append(this.LJLJI);
        LIZ.append(", createDspPlaylist=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", listState=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLJJL;
    }

    public /* synthetic */ C94952apI(int i) {
        this(EnumC93982aZe.DEFAULT, null, null, null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94952apI)) {
            return false;
        }
        C94952apI c94952apI = (C94952apI) obj;
        if (this.LJLIL == c94952apI.LJLIL && o.LJ(this.LJLILLLLZI, c94952apI.LJLILLLLZI) && o.LJ(this.LJLJI, c94952apI.LJLJI) && o.LJ(this.LJLJJI, c94952apI.LJLJJI) && o.LJ(this.LJLJJL, c94952apI.LJLJJL)) {
            return true;
        }
        return false;
    }

    public C94952apI(EnumC93982aZe loadingStatus, C43I<OSZ<TT2DSPPlatformInfo, TT2DSPSongInfo>> c43i, C43I<C93983aZf> c43i2, C43I<TT2DSPSongInfo> c43i3, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = loadingStatus;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
        this.LJLJJI = c43i3;
        this.LJLJJL = listState;
    }

    public static C94952apI LIZ(C94952apI c94952apI, EnumC93982aZe enumC93982aZe, C43I c43i, C43I c43i2, C43I c43i3, C8HZ c8hz, int i) {
        C8HZ listState = c8hz;
        C43I c43i4 = c43i3;
        C43I c43i5 = c43i2;
        EnumC93982aZe loadingStatus = enumC93982aZe;
        C43I c43i6 = c43i;
        if ((i & 1) != 0) {
            loadingStatus = c94952apI.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i6 = c94952apI.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i5 = c94952apI.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i4 = c94952apI.LJLJJI;
        }
        if ((i & 16) != 0) {
            listState = c94952apI.LJLJJL;
        }
        c94952apI.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(listState, "listState");
        return new C94952apI(loadingStatus, c43i6, c43i5, c43i4, listState);
    }
}
