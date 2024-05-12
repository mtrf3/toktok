package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NIX implements JV3 {
    public C49260JUy LIZ;
    public NIZ LIZIZ;
    public Aweme LIZJ;
    public AwemeRawAd LIZLLL;
    public Context LJ;
    public boolean LJFF;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C58822N6s.LJLIL);
    public final IMainService LJII = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
    public final NIW LJIIIIZZ = SearchAdMainService.LJIIJJI().LJII();
    public final NIP LJIIIZ = SearchAdMainService.LJIIJJI().LJIIIIZZ();
    public boolean LJIIJ;

    @Override // X.JV3
    public final void LJIIIZ() {
    }

    @Override // X.JV3
    public final void LJIILJJIL() {
    }

    @Override // X.JV3
    public final void LJIJ() {
    }

    @Override // X.JV3
    public final void LJIJJLI() {
    }

    @Override // X.JV3
    public final void LJJIFFI() {
        this.LJFF = false;
        LJJIJ().LJFF();
    }

    @Override // X.JV3
    public final void LJIIJJI() {
        this.LJIIIIZZ.LJII(this.LIZLLL);
    }

    @Override // X.JV3
    public final void LJIILL() {
        User user;
        AwemeRawAd awemeRawAd = this.LIZLLL;
        if (awemeRawAd != null && O5Y.LJIILLIIL(awemeRawAd)) {
            Aweme aweme = this.LIZJ;
            if (aweme != null && C63081OpJ.LJLJLJ(aweme)) {
                return;
            }
            ITopVideoAdService LJJIJ = LJJIJ();
            AwemeRawAd awemeRawAd2 = this.LIZLLL;
            Aweme aweme2 = this.LIZJ;
            if (aweme2 != null) {
                user = aweme2.getAuthor();
            } else {
                user = null;
            }
            LJJIJ.LJI(awemeRawAd2, user, this.LJ, new AqS160S0100000_10(this, 530), new AqS160S0100000_10(this, 531));
        } else {
            LJJIJ().LIZJ(this.LIZJ, this.LJ, new AqS160S0100000_10(this, 532), new AqS160S0100000_10(this, 533));
        }
        this.LJFF = true;
        NIZ niz = this.LIZIZ;
        if (niz != null) {
            niz.LJJJJZI();
        }
    }

    @Override // X.JV3
    public final void LJJ() {
        String str;
        NIW niw = this.LJIIIIZZ;
        AwemeRawAd awemeRawAd = this.LIZLLL;
        NIZ niz = this.LIZIZ;
        if (niz != null) {
            str = niz.getEnterFrom();
        } else {
            str = null;
        }
        niw.LJIJJ(awemeRawAd, str, null, false);
    }

    @Override // X.JV3
    public final void LJJI() {
        this.LJIIIIZZ.LJIIIZ(this.LIZLLL);
    }

    @Override // X.JV3
    public final void LJJIIZ() {
        User author;
        this.LJIIIIZZ.LJIJ(this.LIZLLL);
        Aweme aweme = this.LIZJ;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        C77266UUc.LIZIZ.getRelationService().LJFF().postValue(new RelationStatus(author.getUid(), LJJIIZI(author), Integer.valueOf(author.getFollowerStatus()), null, null, 24, null));
        NIZ niz = this.LIZIZ;
        if (niz != null) {
            niz.LJJJJL();
        }
        LJJIJ().LJ();
    }

    public final ITopVideoAdService LJJIJ() {
        return (ITopVideoAdService) this.LJI.getValue();
    }

    @Override // X.JV3
    public final void LJIIL() {
        LJJIJ().LJLLL();
    }

    @Override // X.JV3
    public final void LJIILIIL() {
        String str;
        if (!JHI.LIZ().LJIIJ || !this.LJIIIZ.LJIJJ(this.LIZJ)) {
            NIW niw = this.LJIIIIZZ;
            AwemeRawAd awemeRawAd = this.LIZLLL;
            NIZ niz = this.LIZIZ;
            if (niz != null) {
                str = niz.getEnterFrom();
            } else {
                str = null;
            }
            niw.LJIJJLI(awemeRawAd, str, C59406NTe.LJI(this.LIZJ));
        } else {
            JHI.LIZ().LJIIJ = false;
        }
        if (this.LJIIJ) {
            this.LJIIIIZZ.LJIIJJI(this.LIZLLL);
        }
    }

    @Override // X.JV3
    public final boolean LJJIIJ() {
        return this.LJFF;
    }

    public static int LJJIIZI(User user) {
        Integer valueOf;
        if (user != null && (valueOf = Integer.valueOf(user.getFollowStatus())) != null) {
            if (valueOf.intValue() == 0) {
                if (user.isAccuratePrivateAccount()) {
                    return 4;
                }
                if (user.getFollowerStatus() != 1) {
                    return 1;
                }
                return 2;
            }
            if (valueOf.intValue() != 4 && valueOf.intValue() != 1) {
                valueOf.intValue();
            }
        }
        return 0;
    }

    @Override // X.JV3
    public final void LJIIJ(boolean z) {
        this.LJIIJ = z;
    }

    @Override // X.JV3
    public final void LJIILLIIL(String str) {
        this.LJIIIIZZ.LJIIZILJ(this.LIZLLL, str);
    }

    @Override // X.InterfaceC48872JGa
    public final void init(JGV adSceneDepend) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Context context;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        o.LJIIIZ(adSceneDepend, "adSceneDepend");
        C49260JUy c49260JUy = (C49260JUy) adSceneDepend;
        this.LIZ = c49260JUy;
        InterfaceC48875JGd interfaceC48875JGd = c49260JUy.LIZ;
        o.LJII(interfaceC48875JGd, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.search.TopFeed.ISearchAdTopVideoSceneCallBack");
        this.LIZIZ = (NIZ) interfaceC48875JGd;
        C49260JUy c49260JUy2 = this.LIZ;
        ViewGroup viewGroup3 = null;
        if (c49260JUy2 != null) {
            aweme = c49260JUy2.LIZIZ;
        } else {
            aweme = null;
        }
        this.LIZJ = aweme;
        if (c49260JUy2 != null) {
            awemeRawAd = c49260JUy2.LIZJ;
        } else {
            awemeRawAd = null;
        }
        this.LIZLLL = awemeRawAd;
        if (awemeRawAd != null) {
            awemeRawAd.getSearchAdInfo();
        }
        C49260JUy c49260JUy3 = this.LIZ;
        if (c49260JUy3 != null) {
            context = c49260JUy3.LIZLLL;
        } else {
            context = null;
        }
        this.LJ = context;
        ITopVideoAdService LJJIJ = LJJIJ();
        if (LJJIJ != null) {
            NIZ niz = this.LIZIZ;
            if (niz != null) {
                viewGroup2 = niz.LJJI();
            } else {
                viewGroup2 = null;
            }
            LJJIJ.LIZIZ(viewGroup2, this.LJ, this.LIZLLL);
        }
        ITopVideoAdService LJJIJ2 = LJJIJ();
        if (LJJIJ2 != null) {
            NIZ niz2 = this.LIZIZ;
            if (niz2 != null) {
                viewGroup = niz2.LJJJJI();
            } else {
                viewGroup = null;
            }
            LJJIJ2.LIZ(viewGroup, this.LJ, this.LIZJ, new ACListenerS30S0100000_10(this, 171));
        }
        ITopVideoAdService LJJIJ3 = LJJIJ();
        if (LJJIJ3 != null) {
            NIZ niz3 = this.LIZIZ;
            if (niz3 != null) {
                viewGroup3 = niz3.LJJII();
            }
            LJJIJ3.LIZLLL(viewGroup3, this.LJ, this.LIZLLL);
        }
    }

    @Override // X.JV3
    public final void searchAdTransformOpen(Context context, Aweme aweme, int i) {
        this.LJII.searchAdTransformOpen(context, aweme, i);
    }
}
