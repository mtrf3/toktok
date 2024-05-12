package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C2U8;
import X.C55331Lnb;
import X.C59316NPs;
import X.C63120Opw;
import X.C63309Osz;
import X.NT2;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS2S0220000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((LinearLayout) this.l0).setVisibility(8);
        String str = null;
        if (this.z2) {
            ((C59316NPs) this.l1).H();
            if (((C59316NPs) this.l1).LLZL() != null && this.z3) {
                ((C59316NPs) this.l1).LLZL().LIZJ();
                C59316NPs c59316NPs = (C59316NPs) this.l1;
                NT2.LJJJJLI(c59316NPs.LJLJLJ, c59316NPs.LJLLI, 2, c59316NPs.LJLJLLL + 1);
            }
            Aweme aweme = ((C59316NPs) this.l1).LJLJLJ;
            if (aweme != null) {
                str = aweme.getAid();
            }
            o.LJI(str);
            C2U8.LIZ(new C55331Lnb(false, str));
            return;
        }
        if (!TextUtils.equals(((C59316NPs) this.l1).LJLL, "general_search")) {
            return;
        }
        Aweme aweme2 = ((C59316NPs) this.l1).LJLJLJ;
        if (aweme2 != null) {
            str = aweme2.getAid();
        }
        o.LJI(str);
        C2U8.LIZ(new C55331Lnb(false, str));
    }

    public static final void run$0(ARunnableS2S0220000_10 aRunnableS2S0220000_10) {
        boolean LIZ;
        try {
            C63309Osz.LIZLLL().LJIIJJI(Collections.singletonList((C109544Rq) aRunnableS2S0220000_10.l0));
            if (aRunnableS2S0220000_10.z2 || aRunnableS2S0220000_10.z3) {
                C115284fk.LJIILIIL().LJIJI(2, (C63120Opw) aRunnableS2S0220000_10.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0220000_10 aRunnableS2S0220000_10) {
        boolean LIZ;
        try {
            aRunnableS2S0220000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0220000_10(Object obj, boolean z, Object obj2, boolean z2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
        this.z3 = z2;
    }
}
