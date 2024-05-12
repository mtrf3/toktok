package X;

import Y.AObserverS80S0100000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TK9 {
    public final I9W LIZ;
    public boolean LIZIZ;
    public AqS159S0200000_12 LIZJ;
    public final C62822Ol8 LIZLLL;

    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LIZ.LLZL().LIZLLL(new TK8(this));
        this.LIZ.LLLLL().LJIIIIZZ().LJIILL().observe(this.LIZ.getLifecycleOwner(), new AObserverS80S0100000_12(this, 60));
    }

    public TK9(I9W stickerApi) {
        o.LJIIIZ(stickerApi, "stickerApi");
        this.LIZ = stickerApi;
        this.LIZLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1033));
    }
}
