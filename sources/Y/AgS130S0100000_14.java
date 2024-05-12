package Y;

import X.C10I;
import X.C10K;
import X.C16310kV;
import X.C76800UCe;
import X.C80672VlM;
import X.C80674VlO;
import X.C80675VlP;
import X.C81700W4q;
import X.O6R;
import X.WG3;
import X.WGH;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AgS130S0100000_14 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            default:
                return null;
        }
    }

    public AgS130S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS130S0100000_14 agS130S0100000_14, C10K c10k) {
        o.LJIIIZ(c10k, "<anonymous parameter 0>");
        ((TTLiveBroadcastView) agS130S0100000_14.l0).LIZIZ();
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS130S0100000_14 agS130S0100000_14, C10K c10k) {
        o.LJIIIZ(c10k, "<anonymous parameter 0>");
        ((TTLiveBroadcastView) agS130S0100000_14.l0).LIZIZ();
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS130S0100000_14 agS130S0100000_14, C10K c10k) {
        C80675VlP c80675VlP = ((SearchContainerFragment) agS130S0100000_14.l0).LJLJLJ;
        if (c80675VlP != null && c80675VlP.getTabMode() == 0 && c80675VlP.getTabCount() > 5) {
            int min = Math.min(c80675VlP.getTabCount(), 5);
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                C80674VlO LJIIJ = c80675VlP.LJIIJ(i2);
                o.LJI(LJIIJ);
                C80672VlM c80672VlM = LJIIJ.LJIIIIZZ;
                o.LJIIIIZZ(c80672VlM, "tabLayout.getTabAt(i)!!.view");
                if (c80672VlM.getVisibility() == 0) {
                    i += c80672VlM.getMeasuredWidth();
                }
            }
            o.LJI(c80675VlP.LJIIJ(5));
            if (O6R.LJJIIJZLJL(r0.LJIIIIZZ.getMeasuredWidth() * 0.5d) + i > 0) {
                float measuredWidth = (c80675VlP.getMeasuredWidth() - c80675VlP.getTabStripLeftPadding()) / 5.5f;
                int tabCount = c80675VlP.getTabCount();
                for (int i3 = 0; i3 < tabCount; i3++) {
                    C80674VlO LJIIJ2 = c80675VlP.LJIIJ(i3);
                    o.LJI(LJIIJ2);
                    C80672VlM c80672VlM2 = LJIIJ2.LJIIIIZZ;
                    o.LJIIIIZZ(c80672VlM2, "tabLayout.getTabAt(i)!!.view");
                    if (c80672VlM2.getVisibility() == 0) {
                        ViewGroup.LayoutParams layoutParams = c80672VlM2.getLayoutParams();
                        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.width = (int) measuredWidth;
                        layoutParams2.weight = 0.0f;
                        if (c80675VlP.LLD) {
                            layoutParams2.leftMargin = 0;
                            layoutParams2.rightMargin = 0;
                        }
                        c80672VlM2.setLayoutParams(layoutParams2);
                        C16310kV.LJIIJ(c80672VlM2, 0, c80672VlM2.getPaddingTop(), 0, c80672VlM2.getPaddingBottom());
                    }
                }
            }
        }
        return c10k.LJIIJJI();
    }

    public static final Object then$3(AgS130S0100000_14 agS130S0100000_14, C10K c10k) {
        WGH wgh = (WGH) agS130S0100000_14.l0;
        if (wgh != null) {
            if (c10k == null) {
                wgh.LIZ(null);
            } else {
                wgh.LIZ(c10k.LJIIJJI());
            }
        }
        return null;
    }

    public static final Object then$4(AgS130S0100000_14 agS130S0100000_14, C10K c10k) {
        boolean z;
        C81700W4q c81700W4q = (C81700W4q) agS130S0100000_14.l0;
        if (!c10k.LJIIL() && !c10k.LJIILJJIL() && ((Boolean) c10k.LJIIJJI()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        c81700W4q.getClass();
        valueOf.getClass();
        c81700W4q.LJIIL(valueOf, true);
        return null;
    }

    public static final Object then$5(AgS130S0100000_14 agS130S0100000_14, C10K c10k) {
        WG3 wg3 = (WG3) agS130S0100000_14.l0;
        if (wg3 != null) {
            if (c10k == null) {
                wg3.LIZ(null);
            } else {
                wg3.LIZ(c10k.LJIIJJI());
            }
        }
        return null;
    }

    public static final Object then$6(AgS130S0100000_14 agS130S0100000_14, C10K c10k) {
        o.LJIIIZ(c10k, "<anonymous parameter 0>");
        ((TTLiveBroadcastView) agS130S0100000_14.l0).LIZIZ();
        return C76800UCe.LIZ;
    }
}
