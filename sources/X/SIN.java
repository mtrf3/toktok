package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SIN implements InterfaceC208718Hb<SIN, SIF> {
    public final C43I<List<SI6>> LJLIL;
    public final C43I<java.util.Set<SI6>> LJLILLLLZI;
    public final C43I<SI6> LJLJI;
    public final C43I<SR2> LJLJJI;
    public final C43I<EnumC63857P4j> LJLJJL;
    public final C43I<SRH> LJLJJLL;
    public final C43I<EnumC72128SSm> LJLJL;
    public final C43I<E33> LJLJLJ;
    public final C43I<APO> LJLJLLL;
    public final C8HZ<SIF> LJLL;

    public final int hashCode() {
        return this.LJLL.hashCode() + C40328FsC.LIZIZ(this.LJLJLLL, C40328FsC.LIZIZ(this.LJLJLJ, C40328FsC.LIZIZ(this.LJLJL, C40328FsC.LIZIZ(this.LJLJJLL, C40328FsC.LIZIZ(this.LJLJJL, C40328FsC.LIZIZ(this.LJLJJI, C40328FsC.LIZIZ(this.LJLJI, C40328FsC.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<SIF> getListItemState() {
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
        LIZ.append("AvatarSelectorState(dataSource=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedDownloadItems=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", selectedAvatar=");
        LIZ.append(this.LJLJI);
        LIZ.append(", mode=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", aigcPath=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", powerListFooterState=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", saveAvatarLoadingState=");
        LIZ.append(this.LJLJL);
        LIZ.append(", avatarDownloadInfo=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", fragmentAction=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<SIF> getListState() {
        return this.LJLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SIN)) {
            return false;
        }
        SIN sin = (SIN) obj;
        if (o.LJ(this.LJLIL, sin.LJLIL) && o.LJ(this.LJLILLLLZI, sin.LJLILLLLZI) && o.LJ(this.LJLJI, sin.LJLJI) && o.LJ(this.LJLJJI, sin.LJLJJI) && o.LJ(this.LJLJJL, sin.LJLJJL) && o.LJ(this.LJLJJLL, sin.LJLJJLL) && o.LJ(this.LJLJL, sin.LJLJL) && o.LJ(this.LJLJLJ, sin.LJLJLJ) && o.LJ(this.LJLJLLL, sin.LJLJLLL) && o.LJ(this.LJLL, sin.LJLL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SIN(C43I<? extends List<SI6>> c43i, C43I<? extends java.util.Set<SI6>> c43i2, C43I<SI6> c43i3, C43I<? extends SR2> c43i4, C43I<? extends EnumC63857P4j> c43i5, C43I<SRH> c43i6, C43I<? extends EnumC72128SSm> c43i7, C43I<E33> c43i8, C43I<? extends APO> c43i9, C8HZ<SIF> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = c43i5;
        this.LJLJJLL = c43i6;
        this.LJLJL = c43i7;
        this.LJLJLJ = c43i8;
        this.LJLJLLL = c43i9;
        this.LJLL = listState;
    }

    public static SIN LIZ(SIN sin, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7, C43I c43i8, C8HZ c8hz, int i) {
        C43I<APO> fragmentAction;
        C8HZ listState = c8hz;
        C43I avatarDownloadInfo = c43i8;
        C43I saveAvatarLoadingState = c43i7;
        C43I selectedDownloadItems = c43i2;
        C43I dataSource = c43i;
        C43I selectedAvatar = c43i3;
        C43I mode = c43i4;
        C43I aigcPath = c43i5;
        C43I powerListFooterState = c43i6;
        if ((i & 1) != 0) {
            dataSource = sin.LJLIL;
        }
        if ((i & 2) != 0) {
            selectedDownloadItems = sin.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            selectedAvatar = sin.LJLJI;
        }
        if ((i & 8) != 0) {
            mode = sin.LJLJJI;
        }
        if ((i & 16) != 0) {
            aigcPath = sin.LJLJJL;
        }
        if ((i & 32) != 0) {
            powerListFooterState = sin.LJLJJLL;
        }
        if ((i & 64) != 0) {
            saveAvatarLoadingState = sin.LJLJL;
        }
        if ((i & 128) != 0) {
            avatarDownloadInfo = sin.LJLJLJ;
        }
        if ((i & 256) != 0) {
            fragmentAction = sin.LJLJLLL;
        } else {
            fragmentAction = null;
        }
        if ((i & 512) != 0) {
            listState = sin.LJLL;
        }
        sin.getClass();
        o.LJIIIZ(dataSource, "dataSource");
        o.LJIIIZ(selectedDownloadItems, "selectedDownloadItems");
        o.LJIIIZ(selectedAvatar, "selectedAvatar");
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(aigcPath, "aigcPath");
        o.LJIIIZ(powerListFooterState, "powerListFooterState");
        o.LJIIIZ(saveAvatarLoadingState, "saveAvatarLoadingState");
        o.LJIIIZ(avatarDownloadInfo, "avatarDownloadInfo");
        o.LJIIIZ(fragmentAction, "fragmentAction");
        o.LJIIIZ(listState, "listState");
        return new SIN(dataSource, selectedDownloadItems, selectedAvatar, mode, aigcPath, powerListFooterState, saveAvatarLoadingState, avatarDownloadInfo, fragmentAction, listState);
    }
}
