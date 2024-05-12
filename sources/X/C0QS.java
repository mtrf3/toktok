package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0QS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QS implements Comparable<C0QS> {
    public static C0QR LJLJJL = C0QR.Stripe;
    public final C29321Dc LJLIL;
    public final C29321Dc LJLILLLLZI;
    public final C10390ax LJLJI;
    public final EnumC23500w6 LJLJJI;

    @Override // java.lang.Comparable
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0QS other) {
        o.LJIIIZ(other, "other");
        C10390ax c10390ax = this.LJLJI;
        if (c10390ax == null) {
            return 1;
        }
        C10390ax c10390ax2 = other.LJLJI;
        if (c10390ax2 == null) {
            return -1;
        }
        if (LJLJJL == C0QR.Stripe) {
            if (c10390ax.LIZLLL - c10390ax2.LIZIZ <= 0.0f) {
                return -1;
            }
            if (c10390ax.LIZIZ - c10390ax2.LIZLLL >= 0.0f) {
                return 1;
            }
        }
        if (this.LJLJJI == EnumC23500w6.Ltr) {
            float f = c10390ax.LIZ - c10390ax2.LIZ;
            if (f != 0.0f) {
                if (f >= 0.0f) {
                    return 1;
                }
                return -1;
            }
        } else {
            float f2 = c10390ax.LIZJ - c10390ax2.LIZJ;
            if (f2 != 0.0f) {
                if (f2 < 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        float f3 = c10390ax.LIZIZ - c10390ax2.LIZIZ;
        if (f3 == 0.0f) {
            C10390ax LJJIIZI = C78977Uz7.LJJIIZI(u.LJIIIIZZ(this.LJLILLLLZI));
            C10390ax LJJIIZI2 = C78977Uz7.LJJIIZI(u.LJIIIIZZ(other.LJLILLLLZI));
            C29321Dc LJIIIZ = u.LJIIIZ(this.LJLILLLLZI, new IDqS416S0100000(LJJIIZI, UserLevelGeckoUpdateSetting.DEFAULT));
            C29321Dc LJIIIZ2 = u.LJIIIZ(other.LJLILLLLZI, new IDqS416S0100000(LJJIIZI2, 141));
            if (LJIIIZ != null) {
                if (LJIIIZ2 == null) {
                    return 1;
                }
                return new C0QS(this.LJLIL, LJIIIZ).compareTo(new C0QS(other.LJLIL, LJIIIZ2));
            }
            if (LJIIIZ2 != null) {
                return -1;
            }
            int compare = C29321Dc.LLIL.compare(this.LJLILLLLZI, other.LJLILLLLZI);
            if (compare != 0) {
                return -compare;
            }
            return this.LJLILLLLZI.LJLILLLLZI - other.LJLILLLLZI.LJLILLLLZI;
        }
        if (f3 >= 0.0f) {
            return 1;
        }
        return -1;
    }

    public C0QS(C29321Dc subtreeRoot, C29321Dc c29321Dc) {
        C10390ax c10390ax;
        o.LJIIIZ(subtreeRoot, "subtreeRoot");
        this.LJLIL = subtreeRoot;
        this.LJLILLLLZI = c29321Dc;
        this.LJLJJI = subtreeRoot.LJLZ;
        C55952Hn c55952Hn = subtreeRoot.LLI.LIZIZ;
        AbstractC538029g LJIIIIZZ = u.LJIIIIZZ(c29321Dc);
        if (c55952Hn.LIZLLL() && LJIIIIZZ.LIZLLL()) {
            c10390ax = c55952Hn.LJIIJ(LJIIIIZZ, true);
        } else {
            c10390ax = null;
        }
        this.LJLJI = c10390ax;
    }
}
