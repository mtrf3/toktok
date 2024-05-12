package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NML implements InterfaceC53896LDg {
    public final /* synthetic */ ShakeEgg LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
    }

    public NML(ShakeEgg shakeEgg) {
        this.LJLIL = shakeEgg;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        ShakeEgg shakeEgg = this.LJLIL;
        shakeEgg.LJFF();
        shakeEgg.LJ();
        shakeEgg.LIZLLL();
    }
}
