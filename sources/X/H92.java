package X;

import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H92 implements InterfaceC51059K2d {
    public static final H92 LJLIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLILLLLZI;
    public static final C43684HCm LJLJI;
    public static final C43684HCm LJLJJI;
    public static final C43684HCm LJLJJL;
    public static final C43684HCm LJLJJLL;
    public static final C43684HCm LJLJL;
    public static final C43684HCm LJLJLJ;
    public static final C43684HCm LJLJLLL;
    public static final C43684HCm LJLL;
    public static final C43684HCm LJLLI;
    public static final List<H97> LJLLILLLL;
    public static final C43684HCm LJLLJ;
    public static final C43684HCm LJLLL;
    public static final C43684HCm LJLLLL;
    public static InterfaceC65784Pro<Boolean> LJLLLLLL;

    static {
        TBV tbv = new TBV(H92.class, "inCommercialSoundPage", "getInCommercialSoundPage()Z", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLILLLLZI = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(H92.class, "lastSearchSoundPage", "getLastSearchSoundPage()Lcom/ss/android/ugc/aweme/commerce/tools/music/context/SearchSoundPage;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "actionOriginatedFrom", "getActionOriginatedFrom()Lcom/ss/android/ugc/aweme/commerce/tools/music/ShootActionOrigin;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "bannerId", "getBannerId()Ljava/lang/String;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "bannerType", "getBannerType()Ljava/lang/String;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "playlistSuggestionId", "getPlaylistSuggestionId()Ljava/lang/String;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "categoryId", "getCategoryId()Ljava/lang/String;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "musicOrder", "getMusicOrder()Ljava/lang/Integer;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "playlistOrderInCsp", "getPlaylistOrderInCsp()Ljava/lang/Integer;", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "inPromoteReplaceMusicScene", "getInPromoteReplaceMusicScene()Z", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "inPromoteRecommendCMLScene", "getInPromoteRecommendCMLScene()Z", 0, c65351Pkp), C07250Qf.LIZIZ(H92.class, "shootWay", "getShootWay()Ljava/lang/String;", 0, c65351Pkp)};
        LJLIL = new H92();
        Boolean bool = Boolean.FALSE;
        LJLJI = new C43684HCm(bool);
        LJLJJI = new C43684HCm(HJZ.NONE);
        LJLJJL = new C43684HCm(ShootActionOrigin.OTHERS);
        LJLJJLL = new C43684HCm(null);
        LJLJL = new C43684HCm(null);
        LJLJLJ = new C43684HCm(null);
        LJLJLLL = new C43684HCm(null);
        LJLL = new C43684HCm(null);
        LJLLI = new C43684HCm(null);
        LJLLILLLL = new ArrayList();
        LJLLJ = new C43684HCm(bool);
        LJLLL = new C43684HCm(bool);
        LJLLLL = new C43684HCm(null);
    }

    public static final ShootActionOrigin LIZ() {
        return (ShootActionOrigin) LJLJJL.LIZ(LJLILLLLZI[2]);
    }

    public static final String LIZIZ() {
        return (String) LJLJL.LIZ(LJLILLLLZI[4]);
    }

    public static H97 LIZJ() {
        return (H97) ORZ.LLFII(LJLLILLLL);
    }

    public static final boolean LJ() {
        return ((Boolean) LJLLJ.LIZ(LJLILLLLZI[9])).booleanValue();
    }

    @Override // X.InterfaceC51059K2d
    public final boolean getInCommercialSoundPage() {
        return ((Boolean) LJLJI.LIZ(LJLILLLLZI[0])).booleanValue();
    }

    @Override // X.InterfaceC51059K2d
    public final HJZ getLastSearchSoundPage() {
        return (HJZ) LJLJJI.LIZ(LJLILLLLZI[1]);
    }

    public static boolean LIZLLL() {
        Boolean valueOf;
        H97 LIZJ = LIZJ();
        if (!(LIZJ instanceof H94) || (valueOf = Boolean.valueOf(((H94) LIZJ).LIZIZ)) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    public static final void LJFF(String str) {
        LJLJLLL.LIZIZ(LJLILLLLZI[6], str);
    }

    public static final void LJI(Integer num) {
        LJLL.LIZIZ(LJLILLLLZI[7], num);
    }

    public static final void LJII(String str) {
        LJLJLJ.LIZIZ(LJLILLLLZI[5], str);
    }

    @Override // X.InterfaceC51059K2d
    public final void setInCommercialSoundPage(boolean z) {
        LJLJI.LIZIZ(LJLILLLLZI[0], Boolean.valueOf(z));
    }

    @Override // X.InterfaceC51059K2d
    public final void setLastSearchSoundPage(HJZ hjz) {
        o.LJIIIZ(hjz, "<set-?>");
        LJLJJI.LIZIZ(LJLILLLLZI[1], hjz);
    }
}
