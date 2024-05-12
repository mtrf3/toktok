package Y;

import X.C0C3;
import X.C212428Vi;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C76732zl;
import X.C77275UUl;
import X.C7S6;
import X.EV9;
import X.OQY;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.prefab.ViewPagerAssem;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class IDiS165S0200000_3 implements C0C3 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrolled$0(IDiS165S0200000_3 iDiS165S0200000_3, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(IDiS165S0200000_3 iDiS165S0200000_3, int i, float f, int i2) {
    }

    public static final void onPageSelected$1(IDiS165S0200000_3 iDiS165S0200000_3, int i) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS165S0200000_3(ViewPagerAssem viewPagerAssem, int i) {
        this.$t = i;
        this.l1 = viewPagerAssem;
        this.l0 = C7S6.CLICK;
    }

    public static final void onPageScrollStateChanged$0(IDiS165S0200000_3 iDiS165S0200000_3, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            iDiS165S0200000_3.l0 = C7S6.SCROLL;
            return;
        }
        iDiS165S0200000_3.l0 = C7S6.CLICK;
    }

    public static final void onPageScrollStateChanged$1(IDiS165S0200000_3 iDiS165S0200000_3, int i) {
        if (i == 1) {
            if (((C76732zl) iDiS165S0200000_3.l0).element != i) {
                ((FeedPhotosViewHolder) iDiS165S0200000_3.l1).LLLLLLL().kv0();
                ((C76732zl) iDiS165S0200000_3.l0).element = i;
                return;
            }
            return;
        }
        if (i != 0 || ((C76732zl) iDiS165S0200000_3.l0).element == i) {
            return;
        }
        ((FeedPhotosViewHolder) iDiS165S0200000_3.l1).LLLLLLL().lv0();
        ((C76732zl) iDiS165S0200000_3.l0).element = i;
    }

    public static final void onPageSelected$0(IDiS165S0200000_3 iDiS165S0200000_3, int i) {
        Set LJII;
        Fragment LIZLLL = C212428Vi.LIZLLL((ViewPagerAssem) iDiS165S0200000_3.l1);
        if (LIZLLL != null) {
            C2K0 LIZ = C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), ViewPagerPageSelectedSubscriber.class, null);
            if (LIZ == null) {
                LJII = OQY.INSTANCE;
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        LJII = ((EV9) invocationHandler).LIZ;
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    LJII = C77275UUl.LJII(LIZ);
                }
            }
            if (LJII != null) {
                Iterator it = LJII.iterator();
                while (it.hasNext()) {
                    ((ViewPagerPageSelectedSubscriber) it.next()).cR(i, (C7S6) iDiS165S0200000_3.l0);
                }
            }
        }
    }

    public IDiS165S0200000_3(C76732zl c76732zl, FeedPhotosViewHolder feedPhotosViewHolder, int i) {
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = feedPhotosViewHolder;
    }
}
