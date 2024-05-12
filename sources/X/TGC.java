package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TGC extends TGA {
    public final InterfaceC46204IBk LJLLILLLL;
    public final C29S LJLLJ;
    public final FrameLayout LJLLL;
    public final FragmentManager LJLLLL;
    public final TGD LJLLLLLL;
    public final TF5 LJLZ;
    public final TEJ LJZ;
    public final TGS LJZI;
    public final TH7<THN, Fragment> LJZL;
    public final TGN LL;
    public final boolean LLD;
    public final TF1 LLF;

    @Override // X.IDH
    public final TGD R3() {
        return this.LJLLLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TGC(C29S activity, FrameLayout rootContainer, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, TGD tgd, TF5 tf5, TEJ tej, TH7 th7, TGN tabBarProvider, boolean z, TF1 tf1) {
        super(lifecycleOwner, tf5.LIZ);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(rootContainer, "rootContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(tabBarProvider, "tabBarProvider");
        this.LJLLJ = activity;
        this.LJLLL = rootContainer;
        this.LJLLLL = fragmentManager;
        this.LJLLLLLL = tgd;
        this.LJLZ = tf5;
        this.LJZ = tej;
        this.LJZI = null;
        this.LJZL = th7;
        this.LL = tabBarProvider;
        this.LLD = z;
        this.LLF = tf1;
        this.LJLLILLLL = tf5.LIZIZ;
    }
}
