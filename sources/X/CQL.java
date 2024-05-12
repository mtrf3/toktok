package X;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubShowTwoBadgeEnableSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveBadgeLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreNameMaxLengthSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreUserNameColorSetting;
import com.bytedance.android.livesdk.livesetting.other.UserLevelBadgePositionSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenEffectiveDurationSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenInteractionMessageAvatarSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveChatViewImageSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class CQL implements InterfaceC31341CRt, InterfaceC29967BpT, InterfaceC31078CHq, CXK {
    public final long LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LJFF;
    public boolean LJIIIZ;
    public CharSequence LJIIJ;
    public CQQ LJIIJJI;
    public java.util.Map<User, C31472CWu> LJIIZILJ;
    public boolean LIZLLL = true;
    public final boolean LJ = FansClubShowTwoBadgeEnableSettings.INSTANCE.getValue();
    public final boolean LJI = LivePublicScreenSpaceExploreSetting.INSTANCE.optEnable();
    public final int LJII = LivePublicScreenSpaceExploreUserNameColorSetting.INSTANCE.getNameColor();
    public final int LJIIIIZZ = LivePublicScreenSpaceExploreNameMaxLengthSetting.INSTANCE.getNameMaxLength();
    public final C31298CQc LJIIL = new C31298CQc();
    public final C31307CQl LJIILIIL = new C31307CQl();
    public final C31377CTd LJIILJJIL = new C31377CTd();
    public final C31301CQf LJIILL = new C31301CQf();
    public final C31303CQh LJIILLIIL = new C31303CQh();
    public final Handler LJIJ = new Handler(C16880lQ.LLJJJJ());
    public final C5H3 LJIJI = C78996UzQ.LJJIJIIJI(CQX.LJLIL);
    public final C5H3 LJIJJ = C78996UzQ.LJJIJIIJI(CQY.LJLIL);

    @Override // X.CRD
    public boolean LJ() {
        return false;
    }

    @Override // X.CRD
    public boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.CRD
    public boolean LJIJ() {
        return false;
    }

    @Override // X.CRD
    public boolean LJIJI() {
        return true;
    }

    @Override // X.CRD
    public boolean LJJII() {
        return false;
    }

    @Override // X.CRD
    public boolean LJJIJIIJIL() {
        return false;
    }

    @Override // X.CRD
    public long LJJIJL() {
        return 0L;
    }

    public int LJJJ() {
        return R.drawable.d2a;
    }

    @Override // X.CRD
    public boolean LJJJIL() {
        return false;
    }

    public int LJJJJIZL() {
        return 0;
    }

    public void LJJJJZ() {
        this.LJIIIZ = true;
    }

    @Override // X.CRD
    public long LJJJZ() {
        return 0L;
    }

    public CU2 LJJLI() {
        return null;
    }

    public boolean LJJLIIIIJ() {
        return false;
    }

    @Override // X.CRD
    public boolean LJJLIIIJILLIZJL() {
        return false;
    }

    @Override // X.CRD
    public boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC31368CSu
    public void LJJLL() {
    }

    public boolean LJJZ() {
        return false;
    }

    public void LJJZZI(UserProfileEvent userProfileEvent) {
    }

    public CharSequence LJJZZIII() {
        return null;
    }

    public Text LJLI() {
        return null;
    }

    public boolean LJLJJI() {
        return false;
    }

    public boolean LJLJL() {
        return false;
    }

    public boolean LJLJLJ() {
        return false;
    }

    public boolean LJLJLLL() {
        return this instanceof C30781C6f;
    }

    public void LJLLJ() {
    }

    public void LJLLLLLL(int i, User user) {
    }

    public void LJLZ(User user) {
    }

    public boolean LJZ() {
        return this instanceof C29817Bn3;
    }

    public boolean LJZI() {
        return false;
    }

    public boolean LL() {
        return true;
    }

    @Override // X.CXK
    public final C31468CWq LJI() {
        int i;
        FansClubDynamicConfig fansClubDynamicConfig;
        FansClubConfig fansClubConfig = FansClubSettings.INSTANCE.getFansClubConfig();
        if (fansClubConfig != null && (fansClubDynamicConfig = fansClubConfig.fansClubDynamicConfig) != null) {
            i = fansClubDynamicConfig.badgeMarginSpanFactor;
        } else {
            i = 1;
        }
        return new C31468CWq(C15380j0.LJFF(R.dimen.afl) * i);
    }

    public int LJIIL() {
        if (!this.LJI) {
            return C259910h.LIZIZ(R.attr.dm, C78598Ut0.LJIIJ());
        }
        return this.LJII;
    }

    @Override // X.CRD
    public boolean LJJIII() {
        if (this.LJIIIZ && this.LIZJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31368CSu
    public void LJJJJLI() {
        if (LiveBadgeLoadOptSetting.INSTANCE.lazyLoad() && !this.LJFF) {
            this.LJFF = true;
            LJLJI();
        }
        java.util.Map<User, C31472CWu> map = this.LJIIZILJ;
        if (map != null) {
            Iterator it = ((LinkedHashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                ((C31472CWu) ((Map.Entry) it.next()).getValue()).LJIIIIZZ();
            }
        }
    }

    public final CQQ LJLIIL() {
        CQQ cqq = this.LJIIJJI;
        if (cqq != null) {
            return cqq;
        }
        o.LJIJI("publicScreenContext");
        throw null;
    }

    public String LJLIL() {
        if (this.LJIILL.LIZIZ) {
            return "pin_comment";
        }
        return "normal";
    }

    public final void LJLJI() {
        Text LJLI;
        List<TextPiece> list;
        TextPieceUser textPieceUser;
        boolean z;
        int i;
        boolean z2;
        java.util.Map<User, C31472CWu> map;
        int i2;
        if (this.LIZLLL && LJZ() && LL() && (LJLI = LJLI()) != null && (list = LJLI.pieces) != null) {
            Iterator it = ((ArrayList) ORZ.LJLL(list)).iterator();
            boolean z3 = true;
            boolean z4 = true;
            while (it.hasNext()) {
                TextPiece textPiece = (TextPiece) it.next();
                if (textPiece.type == CXI.USER.getPieceType() && (textPieceUser = textPiece.userValue) != null) {
                    List<BadgeStruct> LJLIIIL = LJLIIIL(textPieceUser.user, z4);
                    boolean z5 = false;
                    if (LJLIIIL != null) {
                        if (((ArrayList) LJLIIIL).size() < 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (LJLIIIL != null) {
                            Iterator it2 = ((ArrayList) LJLIIIL).iterator();
                            while (it2.hasNext()) {
                                BadgeStruct badgeStruct = (BadgeStruct) it2.next();
                                o.LJIIIZ(badgeStruct, "badgeStruct");
                                if (this.LJIIZILJ == null) {
                                    this.LJIIZILJ = new LinkedHashMap();
                                }
                                int i3 = 3;
                                C31472CWu c31472CWu = null;
                                if (!z && (map = this.LJIIZILJ) != null && map.containsKey(textPieceUser.user) == z3) {
                                    java.util.Map<User, C31472CWu> map2 = this.LJIIZILJ;
                                    if (map2 != null) {
                                        c31472CWu = (C31472CWu) ((LinkedHashMap) map2).get(textPieceUser.user);
                                    }
                                    if (LJLIIL().LJIIZILJ) {
                                        i2 = 3;
                                    } else {
                                        i2 = 1;
                                    }
                                    if (c31472CWu != null) {
                                        C31472CWu.LJIIJJI(c31472CWu, LJLIIL().LJFF, LJLIIL().LIZ, badgeStruct, new CQT(this), i2, textPieceUser.user, z5);
                                    }
                                } else {
                                    java.util.Map<User, C31472CWu> map3 = this.LJIIZILJ;
                                    if (map3 != null) {
                                        User user = textPieceUser.user;
                                        o.LJIIIIZZ(user, "textPieceUser.user");
                                        C31472CWu c31472CWu2 = new C31472CWu(this.LJIJ, null, z5, C15380j0.LJIIZILJ());
                                        int i4 = badgeStruct.badgeScene;
                                        if (i4 != 4 && (i4 == 6 ? UserLevelBadgePositionSetting.INSTANCE.getValue() == 0 : !(i4 == 8 || i4 == 10))) {
                                            i = C15380j0.LIZ(2.0f);
                                            z2 = false;
                                        } else {
                                            i = 0;
                                            z2 = true;
                                        }
                                        int i5 = badgeStruct.badgeScene;
                                        int LJFF = C15380j0.LJFF(R.dimen.nv);
                                        int LJFF2 = C15380j0.LJFF(R.dimen.nv);
                                        if (C30793C6r.LIZ && (i5 == 8 || i5 == 10)) {
                                            LJFF2 = 0;
                                            LJFF = 0;
                                        }
                                        C31647CbT c31647CbT = new C31647CbT(z5, z5, z5, z5, z5, z5, z5, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, z5 ? 1 : 0, 16777215);
                                        c31647CbT.LJLJLJ = i;
                                        c31647CbT.LJLL = C15380j0.LJFF(R.dimen.nx);
                                        c31647CbT.LJLZ = C15380j0.LJFF(R.dimen.nx);
                                        c31647CbT.LJLLILLLL = LJFF;
                                        c31647CbT.LJLLJ = LJFF2;
                                        c31647CbT.LJLLI = C15380j0.LJFF(R.dimen.nz);
                                        c31472CWu2.LIZIZ = c31647CbT;
                                        c31472CWu2.LJIIIIZZ = new AqS171S0100000_5(this, 840);
                                        if (!LJLIIL().LJIIZILJ) {
                                            i3 = 1;
                                        }
                                        C31472CWu.LJIIJJI(c31472CWu2, LJLIIL().LJFF, LJLIIL().LIZ, badgeStruct, new CQU(this), i3, textPieceUser.user, z2);
                                        map3.put(user, c31472CWu2);
                                    }
                                }
                                z3 = true;
                                z5 = false;
                            }
                        }
                    }
                    z4 = false;
                }
            }
        }
    }

    public final void LJLLL() {
        List<BadgeStruct> LJLIIIL;
        boolean z;
        int i;
        boolean z2;
        int i2;
        java.util.Map<User, C31472CWu> map;
        int i3;
        User user = getUser();
        if (user != null && (LJLIIIL = LJLIIIL(user, true)) != null) {
            if (((ArrayList) LJLIIIL).size() < 2) {
                z = true;
            } else {
                z = false;
            }
            if (LJLIIIL != null) {
                Iterator it = ((ArrayList) LJLIIIL).iterator();
                while (it.hasNext()) {
                    BadgeStruct badgeStruct = (BadgeStruct) it.next();
                    o.LJIIIZ(badgeStruct, "badgeStruct");
                    if (this.LJIIZILJ == null) {
                        this.LJIIZILJ = new LinkedHashMap();
                    }
                    C31472CWu c31472CWu = null;
                    if (!z && (map = this.LJIIZILJ) != null && map.containsKey(user)) {
                        java.util.Map<User, C31472CWu> map2 = this.LJIIZILJ;
                        if (map2 != null) {
                            c31472CWu = (C31472CWu) ((LinkedHashMap) map2).get(user);
                        }
                        if (LJLIIL().LJIIZILJ) {
                            i3 = 3;
                        } else {
                            i3 = 1;
                        }
                        if (c31472CWu != null) {
                            C31472CWu.LJIIJJI(c31472CWu, LJLIIL().LJFF, LJLIIL().LIZ, badgeStruct, new CQR((CQO) this), i3, user, false);
                        }
                    } else {
                        java.util.Map<User, C31472CWu> map3 = this.LJIIZILJ;
                        if (map3 != null) {
                            C31472CWu c31472CWu2 = new C31472CWu(this.LJIJ, null, false, C15380j0.LJIIZILJ());
                            int i4 = badgeStruct.badgeScene;
                            if (i4 != 4 && (i4 == 6 ? UserLevelBadgePositionSetting.INSTANCE.getValue() == 0 : !(i4 == 8 || i4 == 10))) {
                                i = C15380j0.LIZ(2.0f);
                                z2 = false;
                            } else {
                                i = 0;
                                z2 = true;
                            }
                            C31647CbT c31647CbT = new C31647CbT(false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777215);
                            c31647CbT.LJLJLJ = i;
                            c31647CbT.LJLL = C15380j0.LJFF(R.dimen.nx);
                            c31647CbT.LJLZ = C15380j0.LJFF(R.dimen.nx);
                            c31647CbT.LJLLILLLL = C15380j0.LJFF(R.dimen.nv);
                            c31647CbT.LJLLJ = C15380j0.LJFF(R.dimen.nv);
                            c31647CbT.LJLLI = C15380j0.LJFF(R.dimen.nz);
                            c31472CWu2.LIZIZ = c31647CbT;
                            CQO cqo = (CQO) this;
                            c31472CWu2.LJIIIIZZ = new AqS171S0100000_5(cqo, 841);
                            if (LJLIIL().LJIIZILJ) {
                                i2 = 3;
                            } else {
                                i2 = 1;
                            }
                            C31472CWu.LJIIJJI(c31472CWu2, LJLIIL().LJFF, LJLIIL().LIZ, badgeStruct, new CQS(cqo), i2, user, z2);
                            map3.put(user, c31472CWu2);
                        }
                    }
                }
            }
        }
    }

    @Override // X.CRD
    public final CharSequence getContent() {
        CharSequence LJJZZIII;
        if (TextUtils.isEmpty(this.LJIIJ)) {
            if (LL() && LJLI() != null) {
                LJJZZIII = LJLLLL();
            } else {
                LJJZZIII = LJJZZIII();
            }
            this.LJIIJ = LJJZZIII;
        }
        return this.LJIIJ;
    }

    @Override // X.InterfaceC31368CSu
    public void onAttach() {
        this.LJIIL.LIZLLL = SystemClock.uptimeMillis();
        this.LJIIL.LJ = C31012CFc.LIZIZ();
    }

    public boolean LJJJJ() {
        if (LJIIIZ()) {
            return LJJLIIIIJ();
        }
        return LJJZ();
    }

    @Override // X.CXK
    public final int LJJLIIIJJI() {
        return C15380j0.LIZIZ(R.color.a8j);
    }

    @Override // X.CXK
    public final int LJJLIL() {
        return C15380j0.LIZIZ(R.color.a8j);
    }

    public ImageModel LJJLJ() {
        ImageModel avatarThumb;
        List<String> urls;
        User user;
        User user2;
        ImageModel avatarMedium;
        List<String> urls2;
        if (!LJZL()) {
            return null;
        }
        if (LiveChatViewImageSetting.INSTANCE.getValue() < 1 || (user2 = getUser()) == null || (avatarMedium = user2.getAvatarMedium()) == null || (urls2 = avatarMedium.getUrls()) == null || urls2.isEmpty()) {
            User user3 = getUser();
            if (user3 == null || (avatarThumb = user3.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty() || (user = getUser()) == null) {
                return null;
            }
            return user.getAvatarThumb();
        }
        User user4 = getUser();
        if (user4 == null) {
            return null;
        }
        return user4.getAvatarMedium();
    }

    public final int LJL() {
        if (LJLIIL().LJIIZILJ) {
            return ((Number) this.LJIJJ.getValue()).intValue();
        }
        return ((Number) this.LJIJI.getValue()).intValue();
    }

    public final long LJLILLLLZI() {
        User user = getUser();
        if (user != null) {
            return user.getId();
        }
        return 0L;
    }

    public boolean LJLJJL() {
        return LJLIIL().LJFF;
    }

    public final boolean LJLJJLL() {
        if (LJLILLLLZI() != 0 && LJLILLLLZI() == LJLIIL().LJIILLIIL) {
            return true;
        }
        return false;
    }

    public boolean LJLL() {
        return LJZL();
    }

    public CharSequence LJLLLL() {
        return BXZ.LIZ(LJLI(), this);
    }

    public boolean LJZL() {
        if (!LJLJLLL()) {
            return false;
        }
        if (LJLIIL().LJFF && (LJLIIL().LIZIZ() == 1 || LJLIIL().LIZIZ() == 2)) {
            return true;
        }
        if (LJLIIL().LJFF || !LivePublicScreenInteractionMessageAvatarSetting.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    @Override // X.CRD
    public void dispose() {
        LJJIFFI().getClass();
        this.LJIIJ = null;
        java.util.Map<User, C31472CWu> map = this.LJIIZILJ;
        if (map != null) {
            Iterator<Map.Entry<User, C31472CWu>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().LIZJ();
            }
        }
        java.util.Map<User, C31472CWu> map2 = this.LJIIZILJ;
        if (map2 != null) {
            map2.clear();
        }
    }

    @Override // X.InterfaceC2301591n
    public final C31377CTd LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.CRD
    public final boolean LJIIIZ() {
        return this.LIZJ;
    }

    @Override // X.CRD
    public final long LJIL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC31368CSu
    public final C31298CQc LJJIFFI() {
        return this.LJIIL;
    }

    @Override // X.CRD
    public final C31301CQf LJJIIZI() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC31347CRz
    public final C31307CQl LJJJLL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC31382CTi
    public final C31303CQh LJJLIIJ() {
        return this.LJIILLIIL;
    }

    @Override // X.CRD
    public final long getToken() {
        return this.LIZ;
    }

    public CQL(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC31341CRt
    public final void LIZIZ(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        this.LJIIJJI = publicScreenContext;
        LJJJI(publicScreenContext);
    }

    @Override // X.InterfaceC31368CSu
    public void LJII(boolean z) {
        C31298CQc c31298CQc = this.LJIIL;
        if (c31298CQc.LIZLLL > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - c31298CQc.LIZLLL;
            long j = c31298CQc.LJFF + uptimeMillis;
            c31298CQc.LJFF = j;
            c31298CQc.LJI += uptimeMillis;
            if (j > 10) {
                c31298CQc.LJII++;
                if (z) {
                    if (!(this instanceof CQM)) {
                        LJLIIL().LJIIJ.LJIILLIIL(this);
                    }
                } else {
                    LJLIIL().LJIIJ.LJIILLIIL(this);
                }
                c31298CQc.LJFF = 0L;
            }
            if (c31298CQc.LJI > LivePublicScreenEffectiveDurationSetting.INSTANCE.getValue()) {
                c31298CQc.LJIIIIZZ++;
                if (z) {
                    if (!(this instanceof CQM)) {
                        LJLIIL().LJIIJ.LJIIZILJ(this);
                        LJLLJ();
                    }
                } else {
                    LJLIIL().LJIIJ.LJIIZILJ(this);
                    LJLLJ();
                }
                c31298CQc.LJI = 0L;
            }
        }
        c31298CQc.LIZLLL = 0L;
    }

    @Override // X.InterfaceC31341CRt
    public void LJIILLIIL(CQQ publicScreenContext) {
        boolean z;
        ImageModel LJJLJ;
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        if (LJLILLLLZI() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = z;
        this.LJIIJ = null;
        this.LIZIZ = SystemClock.elapsedRealtimeNanos();
        if (!LiveBadgeLoadOptSetting.INSTANCE.lazyLoad()) {
            LJLJI();
        }
        if (LJLL() && (LJJLJ = LJJLJ()) != null) {
            LJLIIL().LJIIJ.LJIIIZ();
            if (LiveAudienceImageCacheRefactorSetting.INSTANCE.getValue()) {
                int LJL = LJL();
                C78720Uuy LIZ = C15650jR.LIZ().LIZ(LJJLJ.getUrls());
                LIZ.LJI = LJL;
                LIZ.LJII = LJL;
                LIZ.LJIJI = Boolean.TRUE;
                LIZ.LJIILLIIL();
                return;
            }
            C15620jO.LJFF(LJJLJ);
        }
    }

    @Override // X.InterfaceC31341CRt
    public final void LJIJJLI(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        this.LJIIJJI = publicScreenContext;
        LJIILLIIL(publicScreenContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.CXK
    public final List<CQV> LJJIIJZLJL(User user) {
        C31472CWu c31472CWu;
        List<AbstractC31462CWk<? extends AbstractC31467CWp>> list;
        BadgeStruct badgeStruct;
        InterfaceC29517BiD interfaceC29517BiD;
        o.LJIIIZ(user, "user");
        if (!this.LIZLLL || !LJZ() || !this.LJ) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        java.util.Map<User, C31472CWu> map = this.LJIIZILJ;
        if (map != null && (c31472CWu = (C31472CWu) ((LinkedHashMap) map).get(user)) != null && (list = c31472CWu.LJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            int i = 0;
            while (it.hasNext()) {
                AbstractC31462CWk abstractC31462CWk = (AbstractC31462CWk) it.next();
                if ((abstractC31462CWk instanceof InterfaceC29517BiD) && (interfaceC29517BiD = (InterfaceC29517BiD) abstractC31462CWk) != null) {
                    badgeStruct = interfaceC29517BiD.LIZ();
                } else {
                    badgeStruct = null;
                }
                if ((abstractC31462CWk instanceof C31635CbH) && abstractC31462CWk != 0 && badgeStruct != null) {
                    if (LJLIIL().LJIIZILJ) {
                        abstractC31462CWk.LIZIZ().LIZJ = C15380j0.LJFF(R.dimen.abo);
                    }
                    arrayList.add(new CQV(new C31465CWn(abstractC31462CWk.LIZIZ()), badgeStruct));
                    i++;
                    if (i >= 2) {
                        return arrayList;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.CXK
    public final C31465CWn LJJIL(User user) {
        java.util.Map<User, C31472CWu> map;
        C31472CWu c31472CWu;
        List<AbstractC31462CWk<? extends AbstractC31467CWp>> list;
        AbstractC31462CWk abstractC31462CWk;
        o.LJIIIZ(user, "user");
        if (!this.LIZLLL || (map = this.LJIIZILJ) == null || (c31472CWu = (C31472CWu) ((LinkedHashMap) map).get(user)) == null || (list = c31472CWu.LJ) == null || (abstractC31462CWk = (AbstractC31462CWk) ORZ.LJLLLL(list)) == null || !(abstractC31462CWk instanceof C31635CbH)) {
            return null;
        }
        if (LJLIIL().LJIIZILJ) {
            abstractC31462CWk.LIZIZ().LIZJ = C15380j0.LJFF(R.dimen.abo);
        }
        return new C31465CWn(abstractC31462CWk.LIZIZ());
    }

    @Override // X.InterfaceC31341CRt
    public void LJJJI(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        if (!LiveBadgeLoadOptSetting.INSTANCE.lazyLoad()) {
            LJLJI();
        } else {
            this.LJFF = false;
        }
    }

    public BadgeStruct LJJJJJ(User user) {
        C31472CWu c31472CWu;
        List<AbstractC31462CWk<? extends AbstractC31467CWp>> list;
        Object obj;
        InterfaceC29517BiD interfaceC29517BiD;
        o.LJIIIZ(user, "user");
        java.util.Map<User, C31472CWu> map = this.LJIIZILJ;
        if (map == null || (c31472CWu = map.get(user)) == null || (list = c31472CWu.LJ) == null || (obj = (AbstractC31462CWk) ORZ.LJLLLL(list)) == null || !(obj instanceof InterfaceC29517BiD) || (interfaceC29517BiD = (InterfaceC29517BiD) obj) == null) {
            return null;
        }
        return interfaceC29517BiD.LIZ();
    }

    public CharSequence LJJJLZIJ(User user) {
        o.LJIIIZ(user, "user");
        String it = C05170If.LIZ(user);
        if (this.LJI && this.LJIIIIZZ > 0) {
            o.LJIIIIZZ(it, "it");
            return C78840Uwu.LJJIJLIJ(this.LJIIIIZZ, it);
        }
        o.LJIIIIZZ(it, "it");
        return it;
    }

    @Override // X.CXK
    public final C30778C6c LJJLIIIJ(User user) {
        return new C30778C6c(user);
    }

    public void LJLLI(BadgeStruct badgeStruct) {
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJ(LJLILLLLZI(), "comment_area_system_message", LJLJJL());
        }
    }

    public void LJLLILLLL(BadgeStruct badgeStruct) {
        o.LJIIIZ(badgeStruct, "badgeStruct");
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJFF(LJLILLLLZI(), "comment_area_system_message", LJLJJL());
        }
    }

    @Override // X.CXK
    public final C30777C6b LJIILJJIL(int i, User user) {
        if (user == null) {
            return new C30777C6b(i, user, null);
        }
        BadgeStruct LJJJJJ = LJJJJJ(user);
        if (LJJJJJ != null) {
            return new C30777C6b(i, user, String.valueOf(LJJJJJ.badgeScene));
        }
        return new C30777C6b(i, user, null);
    }

    @Override // X.CXK
    public final C30778C6c LJJIJ(int i, User user) {
        return new C30778C6c(i, user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00b4, code lost:
    
        if (r9 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct> LJLIIIL(com.bytedance.android.live.base.model.user.User r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CQL.LJLIIIL(com.bytedance.android.live.base.model.user.User, boolean):java.util.List");
    }
}
