package X;

import Y.AfS61S0100000_9;
import Y.IDiS271S0100000_9;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LKn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54085LKn implements LMX {
    public final ActivityC45651qj LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJII;
    public boolean LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final java.util.Map<String, InterfaceC54084LKm> LIZIZ = new LinkedHashMap();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 985));
    public final Object LJI = new Object();

    public final boolean LJFF() {
        ActivityC45651qj activityC45651qj = this.LIZ;
        if (activityC45651qj == null || !com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).wv0("HOME") || !LJI() || !R8() || this.LIZJ) {
            return false;
        }
        return true;
    }

    public static boolean LJI() {
        if (C53297Kvt.LIZ()) {
            if (!C53765L8f.LJIIJJI() && C53765L8f.LJIIL("NOTIFICATION")) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.LMX
    public final void LIZLLL() {
        if (!LJFF() || this.LIZIZ.isEmpty()) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            if (((InterfaceC54084LKm) entry.getValue()).LJIILIIL()) {
                LJII((InterfaceC54084LKm) entry.getValue());
            }
        }
    }

    @Override // X.LMX
    public final boolean R8() {
        ActivityC45651qj activityC45651qj;
        Aweme currentAweme;
        IAccountUserService LJIILL = HG3.LJIILL();
        if ((LJIILL != null && !((RBX) LJIILL).isLogin()) || C86550Xxy.LIZIZ.LIZLLL(false) || IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService().LIZJ() || this.LJIIIIZZ) {
            return false;
        }
        MainBusinessAbility mainBusinessAbility = (MainBusinessAbility) this.LJFF.getValue();
        if ((mainBusinessAbility == null || (currentAweme = mainBusinessAbility.getCurrentAweme()) == null || !currentAweme.isAd()) && (activityC45651qj = this.LIZ) != null && KNV.LJFF(activityC45651qj, "page_feed") && !((IPipFeedService) this.LJIIIZ.getValue()).isInPipMode() && this.LJII == 0 && !this.LJ) {
            return true;
        }
        return false;
    }

    public C54085LKn(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 983));
        this.LJIIIZ = C221108m2.LIZIZ(C54087LKp.LJLIL);
        C54086LKo c54086LKo = new C54086LKo(this);
        LDT ldt = new LDT(this);
        if (LJI()) {
            if (activityC45651qj != null) {
                LNH.LIZ(activityC45651qj, activityC45651qj, c54086LKo);
            }
            C84763XOl.LJI().LJJJJZI(new AfS61S0100000_9(this, 79));
            if (activityC45651qj != null) {
                com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).gv0(ldt);
            }
            HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) LIZIZ.getValue();
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.ii(new IDiS271S0100000_9(this, 13));
            }
        }
    }

    @Override // X.LMX
    public final InterfaceC54084LKm LIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        if (!LJI() || tag.length() == 0) {
            return null;
        }
        return (InterfaceC54084LKm) ((LinkedHashMap) this.LIZIZ).get(tag);
    }

    @Override // X.LMX
    public final void LIZJ(boolean z) {
        this.LJIIIIZZ = z;
        if (z) {
            AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 987);
            LDQ ldq = LER.LIZIZ;
            if (ldq != null) {
                ldq.dismiss();
            }
            aqS159S0100000_9.invoke();
        }
    }

    @Override // X.LMX
    public final boolean LJ(InterfaceC54084LKm interfaceC54084LKm) {
        if (!LJFF()) {
            return false;
        }
        LJII(interfaceC54084LKm);
        return true;
    }

    public final void LJII(InterfaceC54084LKm interfaceC54084LKm) {
        synchronized (this.LJI) {
            this.LIZJ = true;
        }
        this.LIZLLL = true;
        PopupManager.LJIIL(new C54083LKl(this.LIZ, interfaceC54084LKm.LJIILLIIL(), interfaceC54084LKm, new AqS159S0100000_9(this, 986)));
    }

    @Override // X.LMX
    public final void LIZIZ(String str, InterfaceC54084LKm business) {
        o.LJIIIZ(business, "business");
        if (!LJI() || str.length() == 0 || this.LIZIZ.containsKey(str)) {
            return;
        }
        this.LIZIZ.put(str, business);
    }
}
