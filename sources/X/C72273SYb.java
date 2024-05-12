package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.sdk.powerviewpager.FragmentPageSelectedManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.SYb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72273SYb implements InterfaceC213398Zb {
    public final C0CM LIZ;
    public final C72272SYa LIZIZ;

    @Override // X.InterfaceC222788ok
    public final C72808Sho<InterfaceC57784Mm4> getState() {
        return this.LIZIZ.LLF;
    }

    @Override // X.InterfaceC222788ok
    public final void LIZIZ(C220188kY configBuilder) {
        o.LJIIIZ(configBuilder, "configBuilder");
        if (configBuilder instanceof C8ZV) {
            C72272SYa c72272SYa = this.LIZIZ;
            C8ZV c8zv = (C8ZV) configBuilder;
            SYU configFrom = SYU.Direct;
            c72272SYa.getClass();
            o.LJIIIZ(configFrom, "configFrom");
            if (configFrom.ordinal() >= c72272SYa.LJLZ.ordinal()) {
                C57939MoZ LIZ = C72275SYd.LIZ(c8zv);
                c72272SYa.LJLZ = configFrom;
                c72272SYa.LJLLLL = LIZ;
                c72272SYa.LJLLLLLL = c8zv;
                c72272SYa.LLFII.onNext(LIZ);
                if (c8zv.LJFF == C8ZW.LIMITED_NUM_FRAGMENTS_NO_DESTROY) {
                    int i = c72272SYa.LJZ;
                    int i2 = c8zv.LJI;
                    if (i < i2) {
                        i = i2;
                    }
                    c72272SYa.LJZ = i;
                    c72272SYa.LJLL.setItemViewCacheSize(i);
                }
            }
            int i3 = configBuilder.LIZ;
            if (i3 > 0) {
                this.LIZ.setOffscreenPageLimit(i3);
                return;
            }
            return;
        }
        throw new RuntimeException("Can not find fragment viewpager config !");
    }

    @Override // X.InterfaceC222788ok
    public final void LIZJ(KEG keg) {
        this.LIZIZ.registerAdapterDataObserver(keg);
    }

    @Override // X.InterfaceC213398Zb
    public final Fragment LJ(int i) {
        FragmentPageSelectedManager fragmentPageSelectedManager = this.LIZIZ.LJLLJ;
        WeakReference<Fragment> weakReference = fragmentPageSelectedManager.LJLILLLLZI.get(fragmentPageSelectedManager.LJLIL.LLF(i));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C72273SYb(C0CM viewPager2, C72272SYa fragmentAdapter) {
        o.LJIIIZ(viewPager2, "viewPager2");
        o.LJIIIZ(fragmentAdapter, "fragmentAdapter");
        this.LIZ = viewPager2;
        this.LIZIZ = fragmentAdapter;
    }
}
