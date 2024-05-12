package Y;

import X.ActivityC45651qj;
import X.C139825eE;
import X.C189837ch;
import X.C26045AKb;
import X.C26343AVn;
import X.C2U8;
import X.C54060LJo;
import X.C54113LLp;
import X.C54790Les;
import X.C55096Ljo;
import X.C56278M6w;
import X.C82682Wcg;
import X.C9CI;
import X.FMX;
import X.InterfaceC54061LJp;
import X.InterfaceC55235Lm3;
import X.InterfaceC82683Wch;
import X.L7M;
import X.LHM;
import X.LLQ;
import X.WHL;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishBottomTabViewFactory;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ARunnableS10S1100000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Aweme currentAweme;
        InterfaceC55235Lm3 Dl;
        MainPageSocialAbility mainPageSocialAbility;
        MainPageSocialAbility mainPageSocialAbility2;
        if (LHM.LIZIZ.LIZ().shouldShowFriendsTab()) {
            String str = null;
            if (o.LJ("HOME", this.s0) && (Dl = ((MainPageFragment) this.l1).Dl()) != null && (mainPageSocialAbility = (MainPageSocialAbility) C55096Ljo.LIZ(Dl, MainPageSocialAbility.class, null)) != null && mainPageSocialAbility.cg0() != null) {
                InterfaceC55235Lm3 Dl2 = ((MainPageFragment) this.l1).Dl();
                if (Dl2 != null && (mainPageSocialAbility2 = (MainPageSocialAbility) C55096Ljo.LIZ(Dl2, MainPageSocialAbility.class, null)) != null) {
                    str = mainPageSocialAbility2.cg0();
                }
                C2U8.LIZ(new C54060LJo(str));
            } else if (o.LJ("FRIENDS_TAB", this.s0)) {
                C2U8.LIZ(new C54060LJo("homepage_friends"));
            }
            InterfaceC54061LJp wl = ((MainPageFragment) this.l1).wl();
            if (wl != null && (currentAweme = wl.getCurrentAweme()) != null) {
                String str2 = this.s0;
                MainPageFragment mainPageFragment = (MainPageFragment) this.l1;
                if ((o.LJ("HOME", str2) || o.LJ("FRIENDS_TAB", str2)) && !o.LJ(currentAweme, mainPageFragment.getCurrentAweme())) {
                    C2U8.LIZ(new C9CI(currentAweme));
                }
            }
        }
    }

    public final void LIZ$2() {
        PublishBottomTabViewFactory publishBottomTabViewFactory = (PublishBottomTabViewFactory) this.l1;
        C54113LLp c54113LLp = publishBottomTabViewFactory.LJLILLLLZI;
        if (c54113LLp != null) {
            String str = this.s0;
            if (str == null || TextUtils.isEmpty(str)) {
                return;
            }
            Context context = c54113LLp.getContext();
            o.LJIIIIZZ(context, "addBtn.context");
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZ.LIZIZ = c54113LLp;
            c139825eE.LIZJ = str;
            c139825eE.LJI(WHL.TOP);
            C82682Wcg c82682Wcg = c139825eE.LIZ;
            c82682Wcg.LJII = 5000L;
            c82682Wcg.LJIJJLI = false;
            InterfaceC82683Wch LIZJ = c139825eE.LIZJ();
            publishBottomTabViewFactory.LJLJL = LIZJ;
            LIZJ.show();
            return;
        }
        o.LJIJI("tabView");
        throw null;
    }

    public final void LIZ$1() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dispatching update: uid: ");
        LIZ.append(this.s0);
        LIZ.append(", aweme instance: ");
        LIZ.append(System.identityHashCode((Aweme) this.l1));
        C189837ch.LIZ("AvatarEntryManager", X1D.LIZIZ(LIZ));
        Set set = (Set) ((LinkedHashMap) C54790Les.LIZIZ).get(this.s0);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((L7M) it.next()).LIZ();
            }
        }
        Set set2 = (Set) ((LinkedHashMap) C54790Les.LIZIZ).get("*");
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ((L7M) it2.next()).LIZ();
            }
        }
    }

    public static final void run$0(ARunnableS10S1100000_9 aRunnableS10S1100000_9) {
        boolean LIZ;
        try {
            C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) aRunnableS10S1100000_9.l1);
            c26045AKb.LJIIIZ(aRunnableS10S1100000_9.s0);
            c26045AKb.LIZJ(C56278M6w.LJLIL);
            c26045AKb.LJIIJ();
            C26343AVn.LIZJ = true;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S1100000_9 aRunnableS10S1100000_9) {
        boolean LIZ;
        try {
            FMX.LJIIL(aRunnableS10S1100000_9.s0, (Map) aRunnableS10S1100000_9.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS10S1100000_9 aRunnableS10S1100000_9) {
        boolean LIZ;
        try {
            FMX.LJIIL(aRunnableS10S1100000_9.s0, (Map) aRunnableS10S1100000_9.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS10S1100000_9 aRunnableS10S1100000_9) {
        boolean LIZ;
        try {
            aRunnableS10S1100000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS10S1100000_9 aRunnableS10S1100000_9) {
        boolean LIZ;
        try {
            aRunnableS10S1100000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS10S1100000_9 aRunnableS10S1100000_9) {
        boolean LIZ;
        try {
            LLQ C3 = ((MainPageBusinessAssem) aRunnableS10S1100000_9.l1).C3();
            if (C3 != null) {
                C3.LJIJJLI(aRunnableS10S1100000_9.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS10S1100000_9 aRunnableS10S1100000_9) {
        boolean LIZ;
        try {
            aRunnableS10S1100000_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public ARunnableS10S1100000_9(PublishBottomTabViewFactory publishBottomTabViewFactory, String str, Long l, int i) {
        this.$t = i;
        this.l1 = publishBottomTabViewFactory;
        this.s0 = str;
    }
}
