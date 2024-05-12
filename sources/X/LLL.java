package X;

import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LLL extends LLN {
    public final ActivityC45651qj LIZIZ;
    public final LLN LIZJ;
    public HomeViewPagerAbility LIZLLL;
    public ScrollSwitchStateManager LJ;

    public final boolean LIZ() {
        if (KNV.LJFF(this.LIZIZ, "page_feed") && o.LJ(C84193Sd.LIZ(this.LIZIZ).LJLZ, "Following") && C53295Kvr.LIZIZ() && !LWM.LIZIZ.LJI() && C84193Sd.LIZ(this.LIZIZ).lv0()) {
            return true;
        }
        return false;
    }

    public final boolean LJ() {
        if (KNV.LJFF(this.LIZIZ, "page_feed") && o.LJ(C84193Sd.LIZ(this.LIZIZ).LJLZ, "FRIENDS_TAB")) {
            C54029LIj c54029LIj = C54029LIj.LIZIZ;
            if (c54029LIj.LJJI() && !c54029LIj.LJJLIIIJLJLI() && C84193Sd.LIZ(this.LIZIZ).lv0()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJFF() {
        if (KNV.LJFF(this.LIZIZ, "page_feed") && o.LJ(C84193Sd.LIZ(this.LIZIZ).LJLZ, "USER")) {
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        if (KNV.LJFF(this.LIZIZ, "page_feed") && o.LJ(C84193Sd.LIZ(this.LIZIZ).LJLZ, "Nearby") && !LQA.LIZIZ.LJIILJJIL() && C84193Sd.LIZ(this.LIZIZ).lv0()) {
            return true;
        }
        return false;
    }

    public LLL(ActivityC45651qj activity, LLN scrollBasicChecker) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(scrollBasicChecker, "scrollBasicChecker");
        this.LIZIZ = activity;
        this.LIZJ = scrollBasicChecker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0064, code lost:
    
        if (r6 == 1) goto L37;
     */
    @Override // X.LLN, X.InterfaceC208778Hh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(float r5, int r6) {
        /*
            r4 = this;
            X.LLN r0 = r4.LIZJ
            boolean r0 = r0.LIZJ(r5, r6)
            r3 = 0
            if (r0 != 0) goto L10
            boolean r0 = r4.LJFF()
            if (r0 != 0) goto L10
            return r3
        L10:
            r0 = -1
            r2 = 1
            if (r6 != r0) goto L49
            X.1qj r1 = r4.LIZIZ
            java.lang.String r0 = "page_discover"
            boolean r0 = X.KNV.LJFF(r1, r0)
            if (r0 != 0) goto L2e
            X.1qj r1 = r4.LIZIZ
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = X.KNV.LJFF(r1, r0)
            if (r0 == 0) goto L30
            boolean r0 = X.C53765L8f.LJIJ()
            if (r0 == 0) goto L30
        L2e:
            r3 = 1
        L2f:
            return r3
        L30:
            boolean r0 = r4.LJFF()
            if (r0 != 0) goto L2e
            boolean r0 = r4.LJ()
            if (r0 != 0) goto L2e
            boolean r0 = r4.LIZ()
            if (r0 != 0) goto L2e
            boolean r0 = r4.LJI()
            if (r0 == 0) goto L2f
            goto L2e
        L49:
            if (r6 != r2) goto L64
            boolean r0 = r4.LJFF()
            if (r0 != 0) goto L63
            boolean r0 = r4.LJ()
            if (r0 != 0) goto L63
            boolean r0 = r4.LJI()
            if (r0 != 0) goto L63
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L66
        L63:
            return r3
        L64:
            if (r6 != r2) goto La4
        L66:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r4.LJ
            if (r0 != 0) goto L72
            X.1qj r0 = r4.LIZIZ
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = X.C84193Sd.LIZ(r0)
            r4.LJ = r0
        L72:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r4.LJ
            if (r0 == 0) goto La4
            java.lang.String r1 = r0.hv0()
            java.lang.String r0 = "page_feed"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != r2) goto La4
            boolean r0 = X.C53765L8f.LJIJ()
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = r4.LIZLLL
            if (r0 != 0) goto L9a
            X.1qj r0 = r4.LIZIZ
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C78866UxK.LJJLIIIJJI(r0)
            if (r0 == 0) goto La5
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = X.C78880UxY.LJJJJIZL(r0)
        L98:
            r4.LIZLLL = r0
        L9a:
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = r4.LIZLLL
            if (r0 == 0) goto La7
            int r0 = r0.dL()
            if (r0 != 0) goto La7
        La4:
            return r2
        La5:
            r0 = 0
            goto L98
        La7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLL.LIZJ(float, int):boolean");
    }
}
