package com.ss.android.ugc.profile.platform.business.tabs.container.other;

import X.AV1;
import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C0H1;
import X.C188727au;
import X.C212428Vi;
import X.C221108m2;
import X.C2314396l;
import X.C235099Kn;
import X.C26175APb;
import X.C26335AVf;
import X.C47261Igj;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55703Ltb;
import X.C55749LuL;
import X.C56484MEu;
import X.C5H3;
import X.C65352Pkq;
import X.C78857UxB;
import X.C79234V7u;
import X.C7HV;
import X.C80648Vky;
import X.C87030YDq;
import X.C87059YEt;
import X.C87066YFa;
import X.C87075YFj;
import X.C87079YFn;
import X.C87084YFs;
import X.C8VC;
import X.C8YN;
import X.C9IB;
import X.C9PB;
import X.FMX;
import X.InterfaceC234089Gq;
import X.InterfaceC235069Kk;
import X.InterfaceC36571c5;
import X.InterfaceC40262Fr8;
import X.InterfaceC57512Mhg;
import X.InterfaceC87073YFh;
import X.KNV;
import X.L14;
import X.LKR;
import X.MFB;
import X.MFC;
import X.MFF;
import X.OHZ;
import X.ORZ;
import X.OSZ;
import X.T6H;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import X.YFH;
import X.YFI;
import X.Z9N;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ba.impl.ui.BusinessPageFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.CollectProfileListFragment;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListFragment;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.aweme.stickerstore.fragment.StickerStoreProfileListFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class UserAwemePagerAssemV2 extends AwemePagerAssemV2 implements UserAwemePagerAbility, InterfaceC234089Gq {
    public MTAwemeListFragment LLIIJLIL;
    public MTAwemeListFragment LLIIL;
    public ProfileListFragment LLIILII;
    public ProfileListFragment LLIILZL;
    public ProfileListFragment LLIIZ;
    public EffectProfileListFragment LLIL;
    public StickerStoreProfileListFragment LLILII;
    public boolean LLILIL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public Map<Integer, View> LLJJ = new LinkedHashMap();
    public String LLILL = "";
    public final C55749LuL LLJIJIL = new C55749LuL(C47704Ins.LJ(this, C9IB.class, "profile_tab"), checkSupervisorPrepared());
    public final C5H3 LLJILJIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 688));
    public final C5H3 LLJILJILJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 689));
    public MFC LLJILLL = new YFH(this);

    private final String I6(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 6 ? i != 14 ? (i == 16 || i == 20) ? "user_shop" : "no matched" : "private_post" : "effect" : "ost" : "like" : "post";
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void LJIIJ() {
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public boolean P4() {
        return false;
    }

    public final void Z6() {
        this.LLIZ = false;
        this.LLILZLL = false;
        this.LLIZLLLIL = false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void _$_clearFindViewByIdCache() {
        this.LLJJ.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLJJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void j7(int[] iArr) {
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2, X.InterfaceC238569Xw, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // X.InterfaceC234089Gq
    public void updateIndexAtContainer(int i) {
    }

    private final C9IB<ProfileComponents> g4() {
        return (C9IB) this.LLJIJIL.getValue();
    }

    private final Bundle h6() {
        Bundle bundle = new Bundle();
        bundle.putString("sec_user_id", n4());
        bundle.putString("author_id", u4());
        bundle.putBoolean("is_my_profile", false);
        bundle.putString("enter_from", getEventType());
        bundle.putString("show_window_source", E6());
        bundle.putString("group_id", p6());
        bundle.putString("room_id", x6());
        bundle.putString("source_content_id", F6());
        bundle.putString("page_name", "others_homepage");
        bundle.putString("entrance_type", "showcase_list");
        bundle.putString("search_id", this.LLILZ);
        bundle.putString("search_result_id", this.LLILLL);
        bundle.putString("list_source_content_id", this.LLILZIL);
        bundle.putString("previous_page", e4());
        bundle.putString("trackParams", J6());
        int[] K6 = K6();
        if (K6 != null && K6.length != 0) {
            bundle.putIntArray("traffic_source_list", K6());
        }
        User user = getUser();
        if (user != null) {
            bundle.putInt("follow_status", user.getFollowStatus());
        }
        return bundle;
    }

    private final MFB q6() {
        return (MFB) this.LLJILJIL.getValue();
    }

    private final void q7() {
        Object obj;
        List<ProfileListFragment> list = this.LJLJJL;
        if (list == null || this.LJLJLLL >= list.size()) {
            return;
        }
        List<ProfileListFragment> list2 = this.LJLJJL;
        Object obj2 = null;
        if (list2 != null) {
            obj = ListProtector.get(list2, this.LJLJLLL);
        } else {
            obj = null;
        }
        if (obj instanceof YFI) {
            List<ProfileListFragment> list3 = this.LJLJJL;
            if (list3 != null) {
                obj2 = (ProfileListFragment) ListProtector.get(list3, this.LJLJLLL);
            }
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
            YFI yfi = (YFI) obj2;
            if (yfi == null) {
                return;
            }
            yfi.z4();
        }
    }

    private final MFF r6() {
        return (MFF) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void D4() {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null && L14.LIZ() && !mTAwemeListFragment.LJLLILLLL && mTAwemeListFragment.LJLL == 0) {
            mTAwemeListFragment.Ym();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public List<Aweme> LLLIIIL() {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            return mTAwemeListFragment.LLLIIIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void T4() {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.af();
        }
    }

    public final void T6() {
        List<Integer> list = this.LJLJJLL;
        if (list == null || list.size() == 0) {
            FMX.LJIILL("profile_tab_show", new OSZ(Integer.valueOf(Z3().getTabCount()), "tab_cnt"), new OSZ("", "tab_name"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<Integer> list2 = this.LJLJJLL;
        if (list2 != null) {
            Iterator<Integer> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(I6(it.next().intValue()));
            }
        }
        FMX.LJIILL("profile_tab_show", new OSZ(Integer.valueOf(Z3().getTabCount()), "tab_cnt"), new OSZ(ORZ.LLD(arrayList, null, null, null, null, 63), "tab_name"));
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void X4() {
        MTAwemeListFragment mTAwemeListFragment;
        List<Integer> list = this.LJLJJLL;
        if (list != null) {
            int intValue = ((Number) ListProtector.get(list, this.LJLJLLL)).intValue();
            if (intValue != 0) {
                if (intValue != 1 || (mTAwemeListFragment = this.LLIIL) == null) {
                    return;
                }
                mTAwemeListFragment.km();
                return;
            }
            MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
            if (mTAwemeListFragment2 == null) {
                return;
            }
            mTAwemeListFragment2.km();
        }
    }

    public final void i7() {
        ProfileListFragment profileListFragment;
        StickerStoreProfileListFragment stickerStoreProfileListFragment;
        ProfileListFragment profileListFragment2;
        EffectProfileListFragment effectProfileListFragment;
        User user;
        boolean z;
        User user2;
        ProfileListFragment profileListFragment3;
        ProfileListFragment profileListFragment4;
        User user3;
        boolean z2;
        User user4;
        MTAwemeListFragment mTAwemeListFragment;
        User user5;
        boolean z3;
        User user6;
        boolean LJIIZILJ;
        MTAwemeListFragment mTAwemeListFragment2;
        User user7;
        boolean z4;
        User user8;
        boolean LJIIZILJ2;
        T6H<ProfileListFragment> t6h = this.LJLJLJ;
        if (t6h != null && this.LJLJLLL == t6h.LJJIIZI(1) && (mTAwemeListFragment2 = this.LLIIL) != null && (mTAwemeListFragment2.LLFF || ((user7 = getUser()) != null && user7.isBlock))) {
            MTAwemeListFragment mTAwemeListFragment3 = this.LLIIL;
            if (mTAwemeListFragment3 != null) {
                if (getUser() == null) {
                    LJIIZILJ2 = this.LLILLIZIL;
                } else {
                    LJIIZILJ2 = AV1.LJIIZILJ(getUser(), false);
                }
                mTAwemeListFragment3.K7(LJIIZILJ2);
            }
            MTAwemeListFragment mTAwemeListFragment4 = this.LLIIL;
            if (mTAwemeListFragment4 != null) {
                if (getUser() != null && (user8 = getUser()) != null && user8.isBlocked()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mTAwemeListFragment4.Kh(z4);
            }
            MTAwemeListFragment mTAwemeListFragment5 = this.LLIIL;
            if (mTAwemeListFragment5 != null) {
                mTAwemeListFragment5.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h2 = this.LJLJLJ;
        if (t6h2 != null && this.LJLJLLL == t6h2.LJJIIZI(0) && (mTAwemeListFragment = this.LLIIJLIL) != null && (mTAwemeListFragment.LLFF || ((user5 = getUser()) != null && user5.isBlock))) {
            MTAwemeListFragment mTAwemeListFragment6 = this.LLIIJLIL;
            if (mTAwemeListFragment6 != null) {
                if (getUser() == null) {
                    LJIIZILJ = this.LLILLIZIL;
                } else {
                    LJIIZILJ = AV1.LJIIZILJ(getUser(), false);
                }
                mTAwemeListFragment6.K7(LJIIZILJ);
            }
            MTAwemeListFragment mTAwemeListFragment7 = this.LLIIJLIL;
            if (mTAwemeListFragment7 != null) {
                if (getUser() != null && (user6 = getUser()) != null && user6.isBlocked()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                mTAwemeListFragment7.Kh(z3);
            }
            MTAwemeListFragment mTAwemeListFragment8 = this.LLIIJLIL;
            if (mTAwemeListFragment8 != null) {
                mTAwemeListFragment8.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h3 = this.LJLJLJ;
        if (t6h3 != null && this.LJLJLLL == t6h3.LJJIIZI(3) && (profileListFragment4 = this.LLIILII) != null && (profileListFragment4.LJJ() || ((user3 = getUser()) != null && user3.isBlock))) {
            ProfileListFragment profileListFragment5 = this.LLIIII;
            if (profileListFragment5 != null) {
                profileListFragment5.K7(AV1.LJIIZILJ(getUser(), false));
            }
            ProfileListFragment profileListFragment6 = this.LLIIII;
            if (profileListFragment6 != null) {
                if (getUser() != null && (user4 = getUser()) != null && user4.isBlocked()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                profileListFragment6.Kh(z2);
            }
            ProfileListFragment profileListFragment7 = this.LLIIII;
            if (profileListFragment7 != null) {
                profileListFragment7.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h4 = this.LJLJLJ;
        if (t6h4 != null && this.LJLJLLL == t6h4.LJJIIZI(18) && (profileListFragment3 = this.LLII) != null && profileListFragment3.LJJ()) {
            ProfileListFragment profileListFragment8 = this.LLII;
            if (profileListFragment8 != null) {
                profileListFragment8.K7(AV1.LJIIZILJ(getUser(), false));
            }
            ProfileListFragment profileListFragment9 = this.LLII;
            if (profileListFragment9 != null) {
                profileListFragment9.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h5 = this.LJLJLJ;
        if (t6h5 != null && this.LJLJLLL == t6h5.LJJIIZI(6) && (effectProfileListFragment = this.LLIL) != null && (effectProfileListFragment.LJLL || ((user = getUser()) != null && user.isBlock))) {
            EffectProfileListFragment effectProfileListFragment2 = this.LLIL;
            if (effectProfileListFragment2 != null) {
                effectProfileListFragment2.K7(AV1.LJIIZILJ(getUser(), false));
            }
            EffectProfileListFragment effectProfileListFragment3 = this.LLIL;
            if (effectProfileListFragment3 != null) {
                if (getUser() != null && (user2 = getUser()) != null && user2.isBlocked()) {
                    z = true;
                } else {
                    z = false;
                }
                effectProfileListFragment3.Kh(z);
            }
            EffectProfileListFragment effectProfileListFragment4 = this.LLIL;
            if (effectProfileListFragment4 != null) {
                effectProfileListFragment4.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h6 = this.LJLJLJ;
        if (t6h6 != null && this.LJLJLLL == t6h6.LJJIIZI(16) && getUser() != null && (profileListFragment2 = this.LLIIZ) != null) {
            profileListFragment2.LJJJJ();
        }
        T6H<ProfileListFragment> t6h7 = this.LJLJLJ;
        if (t6h7 != null && this.LJLJLLL == t6h7.LJJIIZI(19) && getUser() != null && (stickerStoreProfileListFragment = this.LLILII) != null) {
            stickerStoreProfileListFragment.LJJJJ();
        }
        T6H<ProfileListFragment> t6h8 = this.LJLJLJ;
        if (t6h8 != null && this.LJLJLLL == t6h8.LJJIIZI(21) && getUser() != null && (profileListFragment = this.LLIFFJFJJ) != null) {
            profileListFragment.LJJJJ();
        }
    }

    private final void e6() {
        _$_findCachedViewById(R.id.mz6).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 152)));
    }

    public final String D6() {
        C87059YEt Qd;
        Aweme aweme;
        HashMap<String, String> mobParams;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null || (aweme = Qd.LIZJ) == null || (mobParams = aweme.getMobParams()) == null) {
            return null;
        }
        return mobParams.get("scene_type");
    }

    public final String E6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIILIIL;
    }

    public final String F6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIIL;
    }

    public final String H6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJFF;
    }

    public final String J6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIILLIIL;
    }

    public final int[] K6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIILL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void LLJLLIL() {
        if (AV1.LJIIZILJ(getUser(), false)) {
            f7(true);
            MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
            if (mTAwemeListFragment != null) {
                mTAwemeListFragment.Mm();
            }
            MTAwemeListFragment mTAwemeListFragment2 = this.LLIIL;
            if (mTAwemeListFragment2 != null) {
                mTAwemeListFragment2.Mm();
                return;
            }
            return;
        }
        MTAwemeListFragment mTAwemeListFragment3 = this.LLIIJLIL;
        if (mTAwemeListFragment3 != null) {
            mTAwemeListFragment3.LLLZI();
        }
        MTAwemeListFragment mTAwemeListFragment4 = this.LLIIL;
        if (mTAwemeListFragment4 == null) {
            return;
        }
        mTAwemeListFragment4.LLLZI();
    }

    public final void N6() {
        ((C2314396l) _$_findCachedViewById(R.id.mz6)).LIZJ();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public boolean R4() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return false;
        }
        if (LIZ instanceof InterfaceC40262Fr8) {
            if (!LKR.LIZIZ(LIZ, "NOTIFICATION") && KNV.LJFF(LIZ, "page_feed")) {
                return false;
            }
            return true;
        }
        C87030YDq c87030YDq = C87030YDq.LIZIZ;
        if (c87030YDq.isDetailActivity(LIZ)) {
            return !KNV.LJFF(LIZ, "page_feed");
        }
        return c87030YDq.isUserProfileActivity(LIZ);
    }

    public final boolean R6() {
        GeneralPermission generalPermission;
        User user = getUser();
        if (user != null && user.isUserCancelled()) {
            return true;
        }
        User user2 = getUser();
        if (user2 != null && (generalPermission = user2.getGeneralPermission()) != null && generalPermission.getFollowToastType() == 1) {
            return true;
        }
        User user3 = getUser();
        if (user3 != null && user3.isBlock) {
            return true;
        }
        User user4 = getUser();
        if (user4 != null && user4.isGeoBlocked()) {
            return true;
        }
        User user5 = getUser();
        if (user5 != null && user5.isBlocked()) {
            return true;
        }
        return false;
    }

    public final void X0() {
        _$_findCachedViewById(R.id.mz6).setVisibility(8);
        _$_findCachedViewById(R.id.mz6).clearAnimation();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public String e4() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LIZLLL;
    }

    public final String getEventType() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIIJ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public User getUser() {
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null) {
            return null;
        }
        return userProfileAbility.getUser();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public int m9() {
        return Z3().getTabCount();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public String n4() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LIZIZ;
    }

    public final String p6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIILJJIL;
    }

    public final String t6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public String u4() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LIZ;
    }

    public final String v6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIIZILJ;
    }

    public final String x6() {
        C87059YEt Qd;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null || (Qd = userProfileAbility.Qd()) == null) {
            return null;
        }
        return Qd.LJIIJJI;
    }

    private final void P6() {
        e6();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public MFC Q3() {
        return this.LLJILLL;
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
    }

    private final String M6(User user) {
        if (user.getGeneralPermission() == null) {
            return "";
        }
        int followToastType = user.getGeneralPermission().getFollowToastType();
        if (followToastType != 1) {
            if (followToastType != 2) {
                return "";
            }
            return "suspend";
        }
        return "ban";
    }

    private final void W6(int i) {
        if (this.LLILLJJLI && i == 0) {
            InterfaceC57512Mhg interfaceC57512Mhg = (InterfaceC57512Mhg) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57512Mhg.class));
            if (interfaceC57512Mhg != null) {
                interfaceC57512Mhg.H7();
            }
            this.LLILLJJLI = false;
        }
    }

    private final void s7(int i) {
        User user;
        T6H<ProfileListFragment> t6h = this.LJLJLJ;
        if (t6h != null && i == t6h.LJJIIZI(0)) {
            if (this.LLIZLLLIL && this.LLILZLL && getUser() != null && (user = getUser()) != null && !user.isBlock()) {
                C2314396l c2314396l = (C2314396l) _$_findCachedViewById(R.id.mz6);
                c2314396l.LIZLLL(c2314396l.LJLIL);
                return;
            }
            return;
        }
        if (!this.LLILZLL) {
            return;
        }
        this.LLIZLLLIL = true;
        X0();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void C4(int i) {
        super.C4(i);
        s7(i);
        i7();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void E3(int i) {
        String str;
        TabSetting tabSetting;
        StickerTab stickerTab;
        U5(i);
        boolean z = true;
        int i2 = 1;
        boolean z2 = false;
        if (i != 0) {
            if (i != 6) {
                String str2 = "others_homepage";
                if (i != 12) {
                    int i3 = 2;
                    if (i != 2) {
                        String str3 = null;
                        BusinessPageFragment businessPageFragment = null;
                        String str4 = null;
                        ProfileListFragment profileListFragment = null;
                        str3 = null;
                        if (i != 3) {
                            if (i != 4) {
                                String str5 = "";
                                switch (i) {
                                    case 14:
                                        User user = getUser();
                                        if (user == null) {
                                            return;
                                        }
                                        String eventType = getEventType();
                                        if (eventType != null) {
                                            str2 = eventType;
                                        }
                                        if (this.LLI == null) {
                                            Bundle i6 = i6(str2, user);
                                            TabCommerceFragment LIZLLL = ECommerceShowcaseService.LJIIIZ().LIZLLL(i);
                                            LIZLLL.setArguments(i6);
                                            this.LLI = LIZLLL;
                                        }
                                        v3(this.LLI, 20);
                                        C26335AVf.LJJIIZI("others_homepage", 0, str2, user, this.LLILZIL, 192);
                                        return;
                                    case 15:
                                        if (this.LLII == null) {
                                            ProfileListFragment LIZIZ = C7HV.LIZIZ.LIZIZ();
                                            if (LIZIZ != null) {
                                                LIZIZ.ye(u4(), n4());
                                                Bundle bundle = new Bundle();
                                                bundle.putString("enter_from", "others_homepage");
                                                LIZIZ.setArguments(bundle);
                                                profileListFragment = LIZIZ;
                                            }
                                            this.LLII = profileListFragment;
                                        }
                                        if (P4()) {
                                            str2 = "personal_homepage";
                                        }
                                        getContext();
                                        C26335AVf.LJJ("repost_history_show", str2, u4(), "");
                                        v3(this.LLII, 18);
                                        return;
                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                        if (this.LLILII == null) {
                                            StickerStoreProfileListFragment stickerStoreProfileListFragment = new StickerStoreProfileListFragment();
                                            Bundle bundle2 = new Bundle();
                                            C9IB<ProfileComponents> g4 = g4();
                                            if (g4 != null) {
                                                str4 = g4.LJLJI;
                                            }
                                            bundle2.putString("enter_from", str4);
                                            bundle2.putString("uid", u4());
                                            bundle2.putString("sec_userid", n4());
                                            bundle2.putBoolean("is_self", false);
                                            User user2 = getUser();
                                            if (user2 != null && (tabSetting = user2.getTabSetting()) != null && (stickerTab = tabSetting.stickerTab) != null) {
                                                Boolean showStickerSetSticker = stickerTab.getShowStickerSetSticker();
                                                if (showStickerSetSticker != null) {
                                                    bundle2.putBoolean("key_show_sticker_set_sticker", showStickerSetSticker.booleanValue());
                                                }
                                                Boolean showVideoSticker = stickerTab.getShowVideoSticker();
                                                if (showVideoSticker != null) {
                                                    bundle2.putBoolean("key_show_video_sticker", showVideoSticker.booleanValue());
                                                }
                                                Integer stickerSetCount = stickerTab.getStickerSetCount();
                                                if (stickerSetCount != null) {
                                                    bundle2.putInt("key_sticker_set_count", stickerSetCount.intValue());
                                                }
                                                Integer videoStickerCount = stickerTab.getVideoStickerCount();
                                                if (videoStickerCount != null) {
                                                    bundle2.putInt("key_video_sticker_count", videoStickerCount.intValue());
                                                }
                                            }
                                            stickerStoreProfileListFragment.setArguments(bundle2);
                                            this.LLILII = stickerStoreProfileListFragment;
                                        }
                                        v3(this.LLILII, 19);
                                        return;
                                    case 17:
                                        User user3 = getUser();
                                        if (user3 == null) {
                                            return;
                                        }
                                        if (this.LLIFFJFJJ == null) {
                                            BusinessPageFragment LJ = BAProfilePageServiceImpl.LJIIJJI().LJ(C87084YFs.LJLIL, false);
                                            if (LJ != null) {
                                                Bundle LIZ = C0H1.LIZ("enter_from", "others_homepage");
                                                LIZ.putString("author_id", user3.getUid());
                                                LIZ.putString("user_handle", AV1.LIZLLL(user3));
                                                String bioUrl = user3.getBioUrl();
                                                if (bioUrl == null) {
                                                    bioUrl = "";
                                                }
                                                LIZ.putString("web_url", bioUrl);
                                                String bioSecureUrl = user3.getBioSecureUrl();
                                                if (bioSecureUrl != null) {
                                                    str5 = bioSecureUrl;
                                                }
                                                LIZ.putString("secure_web_url", str5);
                                                LJ.setArguments(LIZ);
                                                businessPageFragment = LJ;
                                            }
                                            this.LLIFFJFJJ = businessPageFragment;
                                        }
                                        v3(this.LLIFFJFJJ, 21);
                                        return;
                                    default:
                                        return;
                                }
                            }
                            if (this.LLIL == null) {
                                EffectProfileListFragment W3 = AwemePagerAssemV2.W3(this, 0, 1, null);
                                this.LLIL = W3;
                                if (W3 != null) {
                                    W3.s(C79234V7u.LJIJI(6));
                                }
                            }
                            EffectProfileListFragment effectProfileListFragment = this.LLIL;
                            if (effectProfileListFragment != null) {
                                effectProfileListFragment.ye(u4(), n4());
                            }
                            v3(this.LLIL, 6);
                            return;
                        }
                        if (this.LLIILII == null) {
                            ProfileListFragment b4 = AwemePagerAssemV2.b4(this, 0, 1, null);
                            this.LLIILII = b4;
                            if (b4 != null) {
                                b4.s(C79234V7u.LJIJI(3));
                            }
                        }
                        ProfileListFragment profileListFragment2 = this.LLIILII;
                        if (profileListFragment2 == null) {
                            return;
                        }
                        IProfileMusicTabService Y3 = Y3();
                        if (Y3 != null) {
                            Y3.LIZLLL(profileListFragment2, new C87079YFn(this));
                        }
                        IProfileMusicTabService Y32 = Y3();
                        if (Y32 != null) {
                            User user4 = getUser();
                            if (user4 != null) {
                                str = user4.getUniqueId();
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                User user5 = getUser();
                                if (user5 != null) {
                                    str3 = user5.getShortId();
                                }
                            } else {
                                User user6 = getUser();
                                if (user6 != null) {
                                    str3 = user6.getUniqueId();
                                }
                            }
                            Y32.LJIIIZ(profileListFragment2, str3);
                        }
                        profileListFragment2.ye(u4(), n4());
                        v3(profileListFragment2, 3);
                        return;
                    }
                    if (this.LLIIL == null) {
                        this.LLIIL = k6(1, 2);
                    }
                    MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
                    if (mTAwemeListFragment == null) {
                        return;
                    }
                    mTAwemeListFragment.LLF = Q3();
                    int i4 = this.LJLJLLL;
                    if (!g5()) {
                        i3 = 1;
                    }
                    if (i4 == i3) {
                        z2 = true;
                    }
                    mTAwemeListFragment.LJLLJ = z2;
                    mTAwemeListFragment.s(C79234V7u.LJIJI(1));
                    mTAwemeListFragment.setPreviousPage(e4());
                    mTAwemeListFragment.LLJI(p6());
                    mTAwemeListFragment.ye(u4(), n4());
                    mTAwemeListFragment.LLLIZZ = new C87075YFj(this);
                    v3(mTAwemeListFragment, 1);
                    return;
                }
                User user7 = getUser();
                if (user7 == null) {
                    return;
                }
                if (this.LLIIZ == null) {
                    Bundle h6 = h6();
                    h6.putParcelable("user", new MiniUser(user7));
                    TabCommerceFragment LIZLLL2 = ECommerceShowcaseService.LJIIIZ().LIZLLL(i);
                    this.LLIIZ = LIZLLL2;
                    if (LIZLLL2 != null) {
                        LIZLLL2.setArguments(h6);
                    }
                }
                v3(this.LLIIZ, 16);
                IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
                String valueOf = String.valueOf(getEventType());
                String u4 = u4();
                if (user7.getFollowStatus() == 0) {
                    i2 = 0;
                }
                Integer valueOf2 = Integer.valueOf(i2);
                String e4 = e4();
                if (e4 != null || (e4 = getEventType()) != null) {
                    str2 = e4;
                }
                C87066YFa.LIZ(LJIIIZ, valueOf, "others_homepage", u4, false, valueOf2, str2, this.LLILZ, this.LLILLL, this.LLILZIL, null, 1024);
                return;
            }
            if (this.LLIILZL == null) {
                User user8 = getUser();
                CollectProfileListFragment collectProfileListFragment = new CollectProfileListFragment();
                collectProfileListFragment.LJLJJL = user8;
                collectProfileListFragment.LJLJJLL = false;
                this.LLIILZL = collectProfileListFragment;
                collectProfileListFragment.s(C79234V7u.LJIJI(8));
            }
            v3(this.LLIILZL, 8);
            return;
        }
        if (this.LLIIJLIL == null) {
            this.LLIIJLIL = k6(0, 1);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 == null) {
            return;
        }
        mTAwemeListFragment2.LLF = Q3();
        mTAwemeListFragment2.LLIIJI = q6();
        mTAwemeListFragment2.LLIIJLIL = r6();
        if (this.LJLJLLL != g5()) {
            z = false;
        }
        mTAwemeListFragment2.LJLLJ = z;
        mTAwemeListFragment2.s(C79234V7u.LJIJI(0));
        mTAwemeListFragment2.setPreviousPage(e4());
        mTAwemeListFragment2.LLLFF = t6();
        getEventType();
        mTAwemeListFragment2.LLLFFI = H6();
        mTAwemeListFragment2.LLLFZ = D6();
        mTAwemeListFragment2.LLJI(p6());
        mTAwemeListFragment2.ye(u4(), n4());
        v3(mTAwemeListFragment2, 0);
        C56484MEu.LIZ(new OHZ());
        e6();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public boolean E4(int i) {
        List<Integer> list;
        Integer num;
        C80648Vky c80648Vky;
        InterfaceC87073YFh interfaceC87073YFh;
        InterfaceC87073YFh interfaceC87073YFh2;
        Z(true, true);
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.zm(false);
        }
        if (C55703Ltb.LIZJ) {
            q7();
        }
        if (Math.abs(i) > 0 && (list = this.LJLJJLL) != null && (num = (Integer) ORZ.LJLLLLLL(this.LJLJLLL, list)) != null) {
            if (num.intValue() == 16) {
                InterfaceC36571c5 interfaceC36571c5 = this.LLIIZ;
                if ((interfaceC36571c5 instanceof InterfaceC87073YFh) && (interfaceC87073YFh2 = (InterfaceC87073YFh) interfaceC36571c5) != null) {
                    interfaceC87073YFh2.onScrollEnd();
                }
            } else {
                if (num.intValue() != 20 || (c80648Vky = this.LJLJL) == null) {
                    return false;
                }
                InterfaceC36571c5 interfaceC36571c52 = this.LLI;
                if ((interfaceC36571c52 instanceof InterfaceC87073YFh) && (interfaceC87073YFh = (InterfaceC87073YFh) interfaceC36571c52) != null) {
                    c80648Vky.getScrollY();
                    c80648Vky.getMaxY();
                    interfaceC87073YFh.onScrollEnd();
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public List<Integer> E5(User user) {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        if (g4() == null || !C235099Kn.LIZ()) {
            return super.E5(user);
        }
        C9IB<ProfileComponents> g4 = g4();
        if (g4 != null && (profileComponents = g4.LJLIL) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        List<Integer> LIZ = C9PB.LIZ(getUser(), list);
        P3(LIZ);
        O3(LIZ);
        return LIZ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public List<Integer> G5(String str) {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        if (g4() == null || !C235099Kn.LIZ()) {
            return super.G5(str);
        }
        C9IB<ProfileComponents> g4 = g4();
        if (g4 != null && (profileComponents = g4.LJLIL) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        List<Integer> LIZ = C9PB.LIZ(getUser(), list);
        P3(LIZ);
        O3(LIZ);
        return LIZ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2, X.InterfaceC86908Y8y
    public void LIZJ(int i) {
        super.LIZJ(i);
        W6(i);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void LJJIJ(String str) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Y0(str, false);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Y0(str, false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void LLJI(String str) {
        InterfaceC87073YFh interfaceC87073YFh;
        InterfaceC87073YFh interfaceC87073YFh2;
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LLJI(str);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.LLJI(str);
        }
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        InterfaceC36571c5 interfaceC36571c5 = this.LLI;
        if ((interfaceC36571c5 instanceof InterfaceC87073YFh) && (interfaceC87073YFh2 = (InterfaceC87073YFh) interfaceC36571c5) != null) {
            interfaceC87073YFh2.E5(str);
        }
        InterfaceC36571c5 interfaceC36571c52 = this.LLIIZ;
        if (!(interfaceC36571c52 instanceof InterfaceC87073YFh) || (interfaceC87073YFh = (InterfaceC87073YFh) interfaceC36571c52) == null) {
            return;
        }
        interfaceC87073YFh.E5(str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void Y4(MFC mfc) {
        o.LJIIIZ(mfc, "<set-?>");
        this.LLJILLL = mfc;
    }

    public final void a7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Sj(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Sj(z);
        }
        ProfileListFragment profileListFragment = this.LLIILII;
        if (profileListFragment != null) {
            profileListFragment.Sj(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILZL;
        if (profileListFragment2 != null) {
            profileListFragment2.Sj(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLILII;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJJLL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Sj(z);
        }
    }

    public final void b7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.H5(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.H5(z);
        }
        ProfileListFragment profileListFragment = this.LLIILII;
        if (profileListFragment != null) {
            profileListFragment.H5(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILZL;
        if (profileListFragment2 != null) {
            profileListFragment2.H5(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLILII;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJJI = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.H5(z);
        }
    }

    public final void c7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Kh(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Kh(z);
        }
        ProfileListFragment profileListFragment = this.LLIILII;
        if (profileListFragment != null) {
            profileListFragment.Kh(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILZL;
        if (profileListFragment2 != null) {
            profileListFragment2.Kh(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLILII;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJJL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Kh(z);
        }
    }

    public final void d7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Pf(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Pf(z);
        }
        ProfileListFragment profileListFragment = this.LLIILII;
        if (profileListFragment != null) {
            profileListFragment.Pf(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILZL;
        if (profileListFragment2 != null) {
            profileListFragment2.Pf(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLILII;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Pf(z);
        }
    }

    public final void e7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Yk(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Yk(z);
        }
        ProfileListFragment profileListFragment = this.LLIILII;
        if (profileListFragment != null) {
            profileListFragment.Yk(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILZL;
        if (profileListFragment2 != null) {
            profileListFragment2.H5(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLILII;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJLJ = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Yk(z);
        }
    }

    public final void f7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.K7(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.K7(z);
        }
        ProfileListFragment profileListFragment = this.LLIILII;
        if (profileListFragment != null) {
            profileListFragment.K7(z);
        }
        EffectProfileListFragment effectProfileListFragment = this.LLIL;
        if (effectProfileListFragment != null) {
            effectProfileListFragment.K7(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILZL;
        if (profileListFragment2 != null) {
            profileListFragment2.K7(z);
        }
    }

    public final void g6(User user) {
        if (user != null && user.getGeneralPermission() != null && !TextUtils.isEmpty(user.getGeneralPermission().getProfileToast())) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "others_homepage");
            c188727au.LJIIIZ("show_type", M6(user));
            FMX.LJIIL("show_punish_toast", c188727au.LIZ);
        }
    }

    public final void h7(String str) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LLJLLL = str;
        }
    }

    public final void m7(boolean z) {
        ((C2314396l) _$_findCachedViewById(R.id.mz6)).LIZLLL(z);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Map<String, String> LLJLLIL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        String str = null;
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, UserAwemePagerAbility.class, null);
        }
        if (C78857UxB.LJJJIL(F6())) {
            str = F6();
        } else if (C78857UxB.LJJJIL(x6())) {
            str = x6();
        } else if (C78857UxB.LJJJIL(p6())) {
            str = p6();
        }
        this.LLILZIL = str;
        if (this.LLILLL == null && this.LLILZ == null && C78857UxB.LJJJIL(getEventType()) && (LLJLLIL = Z9N.LIZIZ.LLJLLIL(getEventType(), "")) != null && !LLJLLIL.isEmpty()) {
            this.LLILLL = LLJLLIL.get("search_result_id");
            this.LLILZ = LLJLLIL.get("search_id");
        }
        C8YN.LJII(this, getProfilePlatformVM(), new TBT() { // from class: X.9Pj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LLFZ;
            }
        }, null, new AqS186S0100000_4(this, 235), 6);
        C8YN.LJII(this, c4(), new TBT() { // from class: X.YFR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLILLLLZI);
            }
        }, null, new AqS197S0100000_15(this, 39), 6);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Ie
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS181S0100000_15(this, 214));
        C8YN.LJII(this, getProfilePlatformVM(), new TBT() { // from class: X.YFT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLJLLL;
            }
        }, null, new AqS197S0100000_15(this, 34), 6);
        C8YN.LJII(this, getProfilePlatformVM(), new TBT() { // from class: X.9IX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LLFFF;
            }
        }, null, new AqS197S0100000_15(this, 35), 6);
        getProfilePlatformVM().ov0(new AqS181S0100000_15(this, 213));
        C8YN.LJII(this, getProfilePlatformVM(), new TBT() { // from class: X.9IW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LLFF;
            }
        }, null, new AqS197S0100000_15(this, 36), 6);
        C8YN.LJIIJ(this, getProfilePlatformVM(), new TBT() { // from class: X.9TR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLZ;
            }
        }, new TBT() { // from class: X.AW6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJZ;
            }
        }, null, new IDqS439S0100000_15(this, 8), 12);
        C8YN.LJII(this, getProfilePlatformVM(), new TBT() { // from class: X.YFV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LLII;
            }
        }, null, new AqS197S0100000_15(this, 37), 6);
        C8YN.LJII(this, getProfilePlatformVM(), new TBT() { // from class: X.YFc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LLIIIILZ;
            }
        }, null, new AqS197S0100000_15(this, 38), 6);
    }

    public final void t7(boolean z) {
        yc(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        C9IB<ProfileComponents> g4 = g4();
        if (g4 == null) {
            return;
        }
        g4.LJLIL = profileComponents;
    }

    private final Bundle i6(String str, User user) {
        Bundle LIZJ = AnonymousClass036.LIZJ("enter_from", str, "entrance_type", "shop_list");
        LIZJ.putString("list_source_content_id", this.LLILZIL);
        LIZJ.putIntArray("traffic_source_list", K6());
        LIZJ.putParcelable("user", new MiniUser(user));
        LIZJ.putString("trackParams", J6());
        return LIZJ;
    }

    private final MTAwemeListFragment k6(int i, int i2) {
        C26175APb c26175APb;
        String str;
        String str2;
        FragmentManager childFragmentManager;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        Fragment fragment = null;
        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append(i2);
            fragment = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        }
        MTAwemeListFragment mTAwemeListFragment = (MTAwemeListFragment) fragment;
        Bundle bundle = new Bundle();
        int[] K6 = K6();
        if (K6 != null && K6.length != 0) {
            bundle.putIntArray("traffic_source_list", K6());
        }
        String v6 = v6();
        if (v6 != null && v6.length() > 0) {
            bundle.putString("profile_enter_method", v6);
        }
        C9IB<ProfileComponents> g4 = g4();
        if (g4 != null && (str2 = g4.LJLJI) != null && str2.length() > 0) {
            bundle.putString("enter_from", str2);
        }
        C9IB<ProfileComponents> g42 = g4();
        if (g42 != null && (c26175APb = g42.LJLJLJ) != null && (str = c26175APb.LJLJJL) != null && str.length() > 0) {
            bundle.putString("rfevent_previous_page", str);
        }
        if (mTAwemeListFragment == null) {
            return MTAwemeListFragment.Vm(-1, i, u4(), n4(), false, true, false, bundle);
        }
        return mTAwemeListFragment;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public boolean C5(String str, int i) {
        return C47261Igj.LJJIJIL(0, 2).contains(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility
    public void Z(boolean z, boolean z2) {
        Object obj;
        List<ProfileListFragment> list = this.LJLJJL;
        if (list == null || this.LJLJLLL >= list.size()) {
            return;
        }
        List<ProfileListFragment> list2 = this.LJLJJL;
        Object obj2 = null;
        if (list2 != null) {
            obj = ListProtector.get(list2, this.LJLJLLL);
        } else {
            obj = null;
        }
        if (obj instanceof YFI) {
            List<ProfileListFragment> list3 = this.LJLJJL;
            if (list3 != null) {
                obj2 = (ProfileListFragment) ListProtector.get(list3, this.LJLJLLL);
            }
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
            YFI yfi = (YFI) obj2;
            if (yfi == null) {
                return;
            }
            if (z) {
                yfi.V6(false, z2);
            } else {
                yfi.H9();
            }
        }
    }

    public final void k7(String str, String str2) {
        String str3;
        ProfileListFragment profileListFragment = this.LLIILII;
        if (profileListFragment != null) {
            profileListFragment.ye(str, str2);
            IProfileMusicTabService Y3 = Y3();
            if (Y3 != null) {
                User user = getUser();
                String str4 = null;
                if (user != null) {
                    str3 = user.getUniqueId();
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    User user2 = getUser();
                    if (user2 != null) {
                        str4 = user2.getShortId();
                    }
                } else {
                    User user3 = getUser();
                    if (user3 != null) {
                        str4 = user3.getUniqueId();
                    }
                }
                Y3.LJIIIZ(profileListFragment, str4);
            }
        }
        EffectProfileListFragment effectProfileListFragment = this.LLIL;
        if (effectProfileListFragment != null) {
            effectProfileListFragment.ye(str, str2);
        }
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.ye(str, str2);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.ye(str, str2);
        }
        ProfileListFragment profileListFragment2 = this.LLII;
        if (profileListFragment2 != null) {
            profileListFragment2.ye(str, str2);
        }
    }

    public final void V6(InterfaceC87073YFh interfaceC87073YFh, User user, int i) {
        if (B5(user, i)) {
            interfaceC87073YFh.m4(new MiniUser(user));
        }
    }
}
