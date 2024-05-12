package X;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TGE implements TGP, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public TGE(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
    }

    @Override // X.TGP
    public final TGC LIZ(C29S c29s, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(fragmentManager, "fragmentManager");
        I0N i0n = (I0N) this.LJLIL.LJ(I0N.class, null);
        TGD tgd = (TGD) this.LJLIL.LJ(TGD.class, null);
        TGB LIZLLL = C74355TGd.LIZLLL(tgd, i0n.LLLLL(), i0n.LLZL(), (InterfaceC84497XEf) this.LJLIL.LJ(InterfaceC84497XEf.class, null), (InterfaceC74343TFr) this.LJLIL.LJ(InterfaceC74343TFr.class, null), this.LJLIL);
        if (tgd.LJLLI.LJLLJ) {
            LIZLLL.LJLJJLL = new THW(this.LJLIL);
        }
        return LIZLLL.LIZ(c29s, frameLayout, lifecycleOwner, fragmentManager);
    }
}
