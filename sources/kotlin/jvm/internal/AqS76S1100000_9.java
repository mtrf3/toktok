package kotlin.jvm.internal;

import X.AX5;
import X.AbstractC65781Prl;
import X.C116484hg;
import X.C189837ch;
import X.C221018lt;
import X.C53710L6c;
import X.C56916MVk;
import X.C57430MgM;
import X.C66182ik;
import X.C66192il;
import X.C76800UCe;
import X.E2C;
import X.InterfaceC65784Pro;
import X.L6Y;
import X.L9T;
import X.LND;
import X.M4S;
import X.X1D;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import defpackage.b0;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AqS76S1100000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS76S1100000_9 aqS76S1100000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataStore erase ");
        b0.LJFF(LIZ, aqS76S1100000_9.s0, LIZ, "NoticePerfManager");
        M4S m4s = (M4S) aqS76S1100000_9.l1;
        String str = aqS76S1100000_9.s0;
        synchronized (m4s) {
            m4s.LIZIZ.storeString(str, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS76S1100000_9 aqS76S1100000_9) {
        String str;
        String str2 = AX5.LIZ;
        Map LIZJ = E2C.LIZJ("follow_source", ((C56916MVk) aqS76S1100000_9.l1).P());
        BaseNotice baseNotice = ((C56916MVk) aqS76S1100000_9.l1).LJLJLLL;
        if (baseNotice != null) {
            str = baseNotice.getAccountType();
        } else {
            str = null;
        }
        return new C57430MgM("notification_page", null, "button", null, "message", null, null, "other_places", "1002", null, aqS76S1100000_9.s0, null, str, str2, null, null, null, 0, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, LIZJ, null, -13718, 383);
    }

    public static final Object invoke$2(AqS76S1100000_9 aqS76S1100000_9) {
        final Lifecycle lifecycle = (Lifecycle) aqS76S1100000_9.l1;
        final String str = aqS76S1100000_9.s0;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.provider.VScopeCacheManager$put$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    String key = str;
                    o.LJIIIZ(key, "key");
                    L9T.LIZ.remove(key);
                    lifecycle.removeObserver(this);
                }
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS76S1100000_9 aqS76S1100000_9) {
        String str;
        SlideGuideViewModel slideGuideViewModel = ((LND) aqS76S1100000_9.l1).LJLJJI;
        if (slideGuideViewModel != null) {
            String tag = aqS76S1100000_9.s0;
            o.LJIIIZ(tag, "tag");
            switch (tag.hashCode()) {
                case -1965615457:
                    if (tag.equals("Nearby")) {
                        str = "homepage_nearby";
                        C116484hg.LIZ("enter_from", str, "homepage_copywriting_show");
                        break;
                    }
                    break;
                case -1525083535:
                    if (tag.equals("Following")) {
                        str = "homepage_follow";
                        C116484hg.LIZ("enter_from", str, "homepage_copywriting_show");
                        break;
                    }
                    break;
                case -1309089240:
                    if (tag.equals("FRIENDS_FEED")) {
                        str = "homepage_friends";
                        C116484hg.LIZ("enter_from", str, "homepage_copywriting_show");
                        break;
                    }
                    break;
                case 2576150:
                    if (tag.equals("Shop")) {
                        str = "shop_tab";
                        C116484hg.LIZ("enter_from", str, "homepage_copywriting_show");
                        break;
                    }
                    break;
                case 984907784:
                    if (tag.equals("For You")) {
                        str = "homepage_hot";
                        C116484hg.LIZ("enter_from", str, "homepage_copywriting_show");
                        break;
                    }
                    break;
                case 1270713017:
                    if (tag.equals("Popular")) {
                        str = "faq_page";
                        C116484hg.LIZ("enter_from", str, "homepage_copywriting_show");
                        break;
                    }
                    break;
                case 1442906357:
                    if (tag.equals("MUSIC_DSP_XTAB")) {
                        str = "music_tab";
                        C116484hg.LIZ("enter_from", str, "homepage_copywriting_show");
                        break;
                    }
                    break;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(tag);
            LIZ.append(" guide real show!");
            C221018lt.LJFF("SlideGuide", X1D.LIZIZ(LIZ));
            XKQ xkq = slideGuideViewModel.LJLLILLLL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            slideGuideViewModel.LJLLILLLL = XKX.LIZLLL(ViewModelKt.getViewModelScope(slideGuideViewModel), slideGuideViewModel.LJLJI, null, new C66182ik(slideGuideViewModel, null), 2);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(slideGuideViewModel), slideGuideViewModel.LJLJI, null, new C66192il(null), 2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS76S1100000_9 aqS76S1100000_9) {
        C53710L6c c53710L6c = ((L6Y) aqS76S1100000_9.l1).M().get(aqS76S1100000_9.s0);
        if (c53710L6c != null && c53710L6c.LIZ == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mark read, cur status: ");
            LIZ.append(c53710L6c.LIZ);
            C189837ch.LIZ("story-avatar", X1D.LIZIZ(LIZ));
            ((L6Y) aqS76S1100000_9.l1).N(aqS76S1100000_9.s0, new C53710L6c(2, Boolean.TRUE, Long.valueOf(System.currentTimeMillis())), Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS76S1100000_9(L6Y l6y, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = l6y;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS76S1100000_9(LND lnd, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = lnd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS76S1100000_9(C56916MVk c56916MVk, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c56916MVk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS76S1100000_9(Lifecycle lifecycle, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = lifecycle;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS76S1100000_9(String str, M4S m4s, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = m4s;
    }
}
