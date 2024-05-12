package X;

import android.util.Pair;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvZ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91497ZvZ implements InterfaceC91459Zux, InterfaceC91288ZsC {
    public C91605ZxJ LJLIL;

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPause(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptResume(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSetStartPlayTime(int i) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptStop(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final InterfaceC91296ZsK processPlayable(InterfaceC91296ZsK interfaceC91296ZsK) {
        return interfaceC91296ZsK;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLJI.LJII(this);
        } else {
            o.LJIJI("mediaPlayerService");
            throw null;
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLJI.LJIIL(this);
        } else {
            o.LJIJI("mediaPlayerService");
            throw null;
        }
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSeek(long j) {
        int i;
        int i2;
        Pair<Integer, Integer> LJIILLIIL;
        Integer num;
        Pair<Integer, Integer> LJIILLIIL2;
        Integer num2;
        C91605ZxJ c91605ZxJ = this.LJLIL;
        if (c91605ZxJ != null) {
            InterfaceC91296ZsK LIZ = c91605ZxJ.LIZ();
            if (LIZ == null || !LIZ.LJIILIIL()) {
                return false;
            }
            if (LIZ == null || (LJIILLIIL2 = LIZ.LJIILLIIL()) == null || (num2 = (Integer) LJIILLIIL2.first) == null) {
                i = 0;
            } else {
                i = num2.intValue();
            }
            if (LIZ == null || (LJIILLIIL = LIZ.LJIILLIIL()) == null || (num = (Integer) LJIILLIIL.second) == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            if (j >= i && j <= i2) {
                return false;
            }
            return true;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLIL = c91605ZxJ;
    }
}
