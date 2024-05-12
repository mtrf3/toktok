package com.ss.android.ugc.aweme.profile.widgets.awemepager;

import X.AV1;
import X.AnonymousClass036;
import X.C0H1;
import X.C188727au;
import X.C212428Vi;
import X.C221108m2;
import X.C2314396l;
import X.C234999Kd;
import X.C26175APb;
import X.C26335AVf;
import X.C33928DTg;
import X.C34504DgS;
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
import X.C87066YFa;
import X.C87074YFi;
import X.C87078YFm;
import X.C87082YFq;
import X.C8VC;
import X.C8YN;
import X.C9PN;
import X.FMX;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC36571c5;
import X.InterfaceC57512Mhg;
import X.InterfaceC87065YEz;
import X.InterfaceC87073YFh;
import X.L14;
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
import X.YFI;
import X.YFJ;
import X.Z9N;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
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
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.stickerstore.fragment.StickerStoreProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class UserAwemePagerAssem extends AwemePagerAssem implements InterfaceC87065YEz, UserPostApiPreloadApi {
    public MTAwemeListFragment LLIIJLIL;
    public MTAwemeListFragment LLIIL;
    public ProfileListFragment LLIILII;
    public ProfileListFragment LLIILZL;
    public EffectProfileListFragment LLIIZ;
    public StickerStoreProfileListFragment LLIL;
    public boolean LLILII;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Map<Integer, View> LLJILLL = new LinkedHashMap();
    public String LLILIL = "";
    public final C55749LuL LLJI = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());
    public final C5H3 LLJIJIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 604));
    public final C5H3 LLJILJIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 605));
    public MFC LLJILJILJ = new YFJ(this);

    private final String I6(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 6 ? i != 14 ? (i == 16 || i == 20) ? "user_shop" : "no matched" : "private_post" : "effect" : "ost" : "like" : "post";
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public boolean I4() {
        return false;
    }

    @Override // X.InterfaceC87065YEz
    public void LJIIJ() {
    }

    public final void W6() {
        this.LLILZLL = false;
        this.LLILZIL = false;
        this.LLIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void _$_clearFindViewByIdCache() {
        this.LLJILLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLJILLL;
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

    public final void i7(int[] iArr) {
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem, X.InterfaceC238569Xw, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final Bundle g6() {
        Bundle bundle = new Bundle();
        bundle.putString("sec_user_id", l4());
        bundle.putString("author_id", q4());
        bundle.putBoolean("is_my_profile", false);
        bundle.putString("enter_from", getEventType());
        bundle.putString("show_window_source", E6());
        bundle.putString("group_id", k6());
        bundle.putString("room_id", x6());
        bundle.putString("source_content_id", F6());
        bundle.putString("page_name", "others_homepage");
        bundle.putString("entrance_type", "showcase_list");
        bundle.putString("search_id", this.LLILLL);
        bundle.putString("search_result_id", this.LLILLJJLI);
        bundle.putString("list_source_content_id", this.LLILZ);
        bundle.putString("previous_page", e4());
        bundle.putString("trackParams", J6());
        int[] K6 = K6();
        if (K6 != null && K6.length != 0) {
            bundle.putIntArray("traffic_source_list", K6());
        }
        User mUser = getMUser();
        if (mUser != null) {
            bundle.putInt("follow_status", mUser.getFollowStatus());
        }
        return bundle;
    }

    private final C26175APb getProfileInitData() {
        return (C26175APb) this.LLJI.getValue();
    }

    private final MFB p6() {
        return (MFB) this.LLJIJIL.getValue();
    }

    private final MFF q6() {
        return (MFF) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void B4() {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null && L14.LIZ() && !mTAwemeListFragment.LJLLILLLL && mTAwemeListFragment.LJLL == 0) {
            mTAwemeListFragment.Ym();
        }
    }

    public final String D6() {
        Aweme aweme;
        HashMap<String, String> mobParams;
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null && (aweme = c9pn.LJI) != null && (mobParams = aweme.getMobParams()) != null) {
            return mobParams.get("scene_type");
        }
        return null;
    }

    public final String E6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJ;
        }
        return null;
    }

    public final String F6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJIILL;
        }
        return null;
    }

    public final String H6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJIJI;
        }
        return null;
    }

    public final String J6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJJIFFI;
        }
        return null;
    }

    public final int[] K6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJIJ;
        }
        return null;
    }

    @Override // X.InterfaceC87065YEz
    public List<Aweme> LLLIIIL() {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            return mTAwemeListFragment.LLLIIIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void R4() {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.af();
        }
    }

    public final void R6() {
        List<Integer> list = this.LJLJJI;
        if (list == null || list.size() == 0) {
            FMX.LJIILL("profile_tab_show", new OSZ(Integer.valueOf(Z3().getTabCount()), "tab_cnt"), new OSZ("", "tab_name"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<Integer> list2 = this.LJLJJI;
        if (list2 != null) {
            Iterator<Integer> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(I6(it.next().intValue()));
            }
        }
        FMX.LJIILL("profile_tab_show", new OSZ(Integer.valueOf(Z3().getTabCount()), "tab_cnt"), new OSZ(ORZ.LLD(arrayList, null, null, null, null, 63), "tab_name"));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void S4() {
        MTAwemeListFragment mTAwemeListFragment;
        List<Integer> list = this.LJLJJI;
        if (list != null) {
            int intValue = ((Number) ListProtector.get(list, this.LJLJL)).intValue();
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public String e4() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LIZJ;
        }
        return null;
    }

    public final String getEventType() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LIZLLL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public User getMUser() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    public final void h7() {
        ProfileListFragment profileListFragment;
        StickerStoreProfileListFragment stickerStoreProfileListFragment;
        ProfileListFragment profileListFragment2;
        EffectProfileListFragment effectProfileListFragment;
        boolean z;
        User mUser;
        User mUser2;
        ProfileListFragment profileListFragment3;
        ProfileListFragment profileListFragment4;
        User mUser3;
        boolean z2;
        User mUser4;
        MTAwemeListFragment mTAwemeListFragment;
        boolean LJIIZILJ;
        boolean z3;
        User mUser5;
        User mUser6;
        MTAwemeListFragment mTAwemeListFragment2;
        boolean LJIIZILJ2;
        boolean z4;
        User mUser7;
        User mUser8;
        T6H<ProfileListFragment> t6h = this.LJLJJLL;
        if (t6h != null && this.LJLJL == t6h.LJJIIZI(1) && (mTAwemeListFragment2 = this.LLIIL) != null) {
            o.LJI(mTAwemeListFragment2);
            if (mTAwemeListFragment2.LLFF || ((mUser8 = getMUser()) != null && mUser8.isBlock)) {
                MTAwemeListFragment mTAwemeListFragment3 = this.LLIIL;
                o.LJI(mTAwemeListFragment3);
                if (getMUser() == null) {
                    LJIIZILJ2 = this.LLILL;
                } else {
                    LJIIZILJ2 = AV1.LJIIZILJ(getMUser(), false);
                }
                mTAwemeListFragment3.K7(LJIIZILJ2);
                MTAwemeListFragment mTAwemeListFragment4 = this.LLIIL;
                o.LJI(mTAwemeListFragment4);
                if (getMUser() != null && (mUser7 = getMUser()) != null && mUser7.isBlocked()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mTAwemeListFragment4.Kh(z4);
                MTAwemeListFragment mTAwemeListFragment5 = this.LLIIL;
                o.LJI(mTAwemeListFragment5);
                mTAwemeListFragment5.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h2 = this.LJLJJLL;
        if (t6h2 != null && this.LJLJL == t6h2.LJJIIZI(0) && (mTAwemeListFragment = this.LLIIJLIL) != null) {
            o.LJI(mTAwemeListFragment);
            if (mTAwemeListFragment.LLFF || ((mUser6 = getMUser()) != null && mUser6.isBlock)) {
                MTAwemeListFragment mTAwemeListFragment6 = this.LLIIJLIL;
                o.LJI(mTAwemeListFragment6);
                if (getMUser() == null) {
                    LJIIZILJ = this.LLILL;
                } else {
                    LJIIZILJ = AV1.LJIIZILJ(getMUser(), false);
                }
                mTAwemeListFragment6.K7(LJIIZILJ);
                MTAwemeListFragment mTAwemeListFragment7 = this.LLIIJLIL;
                o.LJI(mTAwemeListFragment7);
                if (getMUser() != null && (mUser5 = getMUser()) != null && mUser5.isBlocked()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                mTAwemeListFragment7.Kh(z3);
                MTAwemeListFragment mTAwemeListFragment8 = this.LLIIJLIL;
                o.LJI(mTAwemeListFragment8);
                mTAwemeListFragment8.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h3 = this.LJLJJLL;
        if (t6h3 != null && this.LJLJL == t6h3.LJJIIZI(3) && (profileListFragment4 = this.LLIIII) != null && (profileListFragment4.LJJ() || ((mUser3 = getMUser()) != null && mUser3.isBlock))) {
            ProfileListFragment profileListFragment5 = this.LLIIII;
            if (profileListFragment5 != null) {
                profileListFragment5.K7(AV1.LJIIZILJ(getMUser(), false));
            }
            ProfileListFragment profileListFragment6 = this.LLIIII;
            if (profileListFragment6 != null) {
                if (getMUser() != null && (mUser4 = getMUser()) != null && mUser4.isBlocked()) {
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
        T6H<ProfileListFragment> t6h4 = this.LJLJJLL;
        if (t6h4 != null && this.LJLJL == t6h4.LJJIIZI(18) && (profileListFragment3 = this.LLII) != null && profileListFragment3.LJJ()) {
            ProfileListFragment profileListFragment8 = this.LLII;
            if (profileListFragment8 != null) {
                profileListFragment8.K7(AV1.LJIIZILJ(getMUser(), false));
            }
            ProfileListFragment profileListFragment9 = this.LLII;
            if (profileListFragment9 != null) {
                profileListFragment9.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h5 = this.LJLJJLL;
        if (t6h5 != null && this.LJLJL == t6h5.LJJIIZI(6) && (effectProfileListFragment = this.LLIIZ) != null) {
            o.LJI(effectProfileListFragment);
            if (effectProfileListFragment.LJLL || ((mUser2 = getMUser()) != null && mUser2.isBlock)) {
                EffectProfileListFragment effectProfileListFragment2 = this.LLIIZ;
                o.LJI(effectProfileListFragment2);
                effectProfileListFragment2.K7(AV1.LJIIZILJ(getMUser(), false));
                EffectProfileListFragment effectProfileListFragment3 = this.LLIIZ;
                o.LJI(effectProfileListFragment3);
                if (getMUser() != null && (mUser = getMUser()) != null && mUser.isBlocked()) {
                    z = true;
                } else {
                    z = false;
                }
                effectProfileListFragment3.Kh(z);
                EffectProfileListFragment effectProfileListFragment4 = this.LLIIZ;
                o.LJI(effectProfileListFragment4);
                effectProfileListFragment4.LJJJJ();
            }
        }
        T6H<ProfileListFragment> t6h6 = this.LJLJJLL;
        if (t6h6 != null && this.LJLJL == t6h6.LJJIIZI(16) && getMUser() != null && (profileListFragment2 = this.LLIILZL) != null) {
            profileListFragment2.LJJJJ();
        }
        T6H<ProfileListFragment> t6h7 = this.LJLJJLL;
        if (t6h7 != null && this.LJLJL == t6h7.LJJIIZI(19) && getMUser() != null && (stickerStoreProfileListFragment = this.LLIL) != null) {
            stickerStoreProfileListFragment.LJJJJ();
        }
        T6H<ProfileListFragment> t6h8 = this.LJLJJLL;
        if (t6h8 != null && this.LJLJL == t6h8.LJJIIZI(21) && getMUser() != null && (profileListFragment = this.LLIFFJFJJ) != null) {
            profileListFragment.LJJJJ();
        }
    }

    public final String k6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJII;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public String l4() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LIZIZ;
        }
        return null;
    }

    public final void m7() {
        List<ProfileListFragment> list = this.LJLJI;
        if (list == null || this.LJLJL >= list.size()) {
            return;
        }
        List<ProfileListFragment> list2 = this.LJLJI;
        o.LJI(list2);
        if (ListProtector.get(list2, this.LJLJL) instanceof YFI) {
            List<ProfileListFragment> list3 = this.LJLJI;
            o.LJI(list3);
            Object obj = ListProtector.get(list3, this.LJLJL);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
            YFI yfi = (YFI) obj;
            if (yfi == null) {
                return;
            }
            yfi.z4();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public String q4() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LIZ;
        }
        return null;
    }

    public final String r6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJFF;
        }
        return null;
    }

    public final String t6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJIJJ;
        }
        return null;
    }

    public final Aweme v6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJJII;
        }
        return null;
    }

    public final String x6() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJIILJJIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.UserPostApiPreloadApi
    public void xC() {
        MTAwemeListFragment mTAwemeListFragment;
        if ((C33928DTg.LIZ || C34504DgS.LIZ) && (mTAwemeListFragment = this.LLIIJLIL) != null) {
            mTAwemeListFragment.LJJJJ();
        }
    }

    private final void c6() {
        _$_findCachedViewById(R.id.mz6).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 125)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[ORIG_RETURN, RETURN] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean J4() {
        /*
            r4 = this;
            X.1qj r3 = X.C212428Vi.LIZ(r4)
            if (r3 == 0) goto L30
            boolean r0 = r3 instanceof X.InterfaceC40262Fr8
            java.lang.String r2 = "page_feed"
            if (r0 == 0) goto L1c
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = X.LKR.LIZIZ(r3, r0)
            if (r0 != 0) goto L1a
            boolean r0 = X.KNV.LJFF(r3, r2)
            if (r0 != 0) goto L30
        L1a:
            r0 = 1
        L1b:
            return r0
        L1c:
            X.YDq r1 = X.C87030YDq.LIZIZ
            boolean r0 = r1.isDetailActivity(r3)
            if (r0 == 0) goto L2b
            boolean r0 = X.KNV.LJFF(r3, r2)
            if (r0 != 0) goto L30
            goto L1a
        L2b:
            boolean r0 = r1.isUserProfileActivity(r3)
            goto L1b
        L30:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.awemepager.UserAwemePagerAssem.J4():boolean");
    }

    @Override // X.InterfaceC87065YEz
    public void LLJLLIL() {
        if (AV1.LJIIZILJ(getMUser(), false)) {
            e7(true);
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

    public final void X0() {
        _$_findCachedViewById(R.id.mz6).setVisibility(8);
        _$_findCachedViewById(R.id.mz6).clearAnimation();
    }

    @Override // X.InterfaceC87065YEz
    public int m9() {
        return Z3().getTabCount();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, UserPostApiPreloadApi.class, null);
        }
    }

    private final void P6() {
        c6();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public MFC W3() {
        return this.LLJILJILJ;
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

    private final void V6(int i) {
        if (this.LLILLIZIL && i == 0) {
            InterfaceC57512Mhg interfaceC57512Mhg = (InterfaceC57512Mhg) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC57512Mhg.class));
            if (interfaceC57512Mhg != null) {
                interfaceC57512Mhg.H7();
            }
            this.LLILLIZIL = false;
        }
    }

    private final void q7(int i) {
        User mUser;
        T6H<ProfileListFragment> t6h = this.LJLJJLL;
        if (t6h != null && i == t6h.LJJIIZI(0)) {
            if (this.LLIZ && this.LLILZIL && getMUser() != null && (mUser = getMUser()) != null && !mUser.isBlock()) {
                C2314396l c2314396l = (C2314396l) _$_findCachedViewById(R.id.mz6);
                c2314396l.LIZLLL(c2314396l.LJLIL);
                return;
            }
            return;
        }
        if (!this.LLILZIL) {
            return;
        }
        this.LLIZ = true;
        X0();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void A4(int i) {
        super.A4(i);
        q7(i);
        h7();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public boolean C4(int i) {
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
            m7();
        }
        if (Math.abs(i) > 0 && (list = this.LJLJJI) != null && (num = (Integer) ORZ.LJLLLLLL(this.LJLJL, list)) != null) {
            if (num.intValue() == 16) {
                InterfaceC36571c5 interfaceC36571c5 = this.LLIILZL;
                if ((interfaceC36571c5 instanceof InterfaceC87073YFh) && (interfaceC87073YFh2 = (InterfaceC87073YFh) interfaceC36571c5) != null) {
                    interfaceC87073YFh2.onScrollEnd();
                }
            } else {
                if (num.intValue() != 20 || (c80648Vky = this.LJLJJL) == null) {
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void E3(int i) {
        String str;
        TabSetting tabSetting;
        StickerTab stickerTab;
        G5(i);
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        i2 = 0;
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
                                        User mUser = getMUser();
                                        if (mUser == null) {
                                            return;
                                        }
                                        String eventType = getEventType();
                                        if (eventType != null) {
                                            str2 = eventType;
                                        }
                                        if (this.LLI == null) {
                                            Bundle h6 = h6(str2, mUser);
                                            TabCommerceFragment LIZLLL = ECommerceShowcaseService.LJIIIZ().LIZLLL(i);
                                            LIZLLL.setArguments(h6);
                                            this.LLI = LIZLLL;
                                        }
                                        v3(this.LLI, 20);
                                        C26335AVf.LJJIIZI("others_homepage", 0, str2, getMUser(), this.LLILZ, 192);
                                        return;
                                    case 15:
                                        if (this.LLII == null) {
                                            ProfileListFragment LIZIZ = C7HV.LIZIZ.LIZIZ();
                                            if (LIZIZ != null) {
                                                LIZIZ.ye(q4(), l4());
                                                Bundle bundle = new Bundle();
                                                bundle.putString("enter_from", "others_homepage");
                                                LIZIZ.setArguments(bundle);
                                                profileListFragment = LIZIZ;
                                            }
                                            this.LLII = profileListFragment;
                                        }
                                        if (I4()) {
                                            str2 = "personal_homepage";
                                        }
                                        getContext();
                                        C26335AVf.LJJ("repost_history_show", str2, q4(), "");
                                        v3(this.LLII, 18);
                                        return;
                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                        if (this.LLIL == null) {
                                            StickerStoreProfileListFragment stickerStoreProfileListFragment = new StickerStoreProfileListFragment();
                                            Bundle bundle2 = new Bundle();
                                            C26175APb profileInitData = getProfileInitData();
                                            if (profileInitData != null) {
                                                str4 = profileInitData.LJLJI;
                                            }
                                            bundle2.putString("enter_from", str4);
                                            bundle2.putString("uid", q4());
                                            bundle2.putString("sec_userid", l4());
                                            bundle2.putBoolean("is_self", false);
                                            User mUser2 = getMUser();
                                            if (mUser2 != null && (tabSetting = mUser2.getTabSetting()) != null && (stickerTab = tabSetting.stickerTab) != null) {
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
                                            this.LLIL = stickerStoreProfileListFragment;
                                        }
                                        v3(this.LLIL, 19);
                                        return;
                                    case 17:
                                        User mUser3 = getMUser();
                                        if (mUser3 == null) {
                                            return;
                                        }
                                        if (this.LLIFFJFJJ == null) {
                                            BusinessPageFragment LJ = BAProfilePageServiceImpl.LJIIJJI().LJ(C87082YFq.LJLIL, false);
                                            if (LJ != null) {
                                                Bundle LIZ = C0H1.LIZ("enter_from", "others_homepage");
                                                LIZ.putString("author_id", mUser3.getUid());
                                                LIZ.putString("user_handle", AV1.LIZLLL(mUser3));
                                                String bioUrl = mUser3.getBioUrl();
                                                if (bioUrl == null) {
                                                    bioUrl = "";
                                                }
                                                LIZ.putString("web_url", bioUrl);
                                                String bioSecureUrl = mUser3.getBioSecureUrl();
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
                            if (this.LLIIZ == null) {
                                EffectProfileListFragment R3 = AwemePagerAssem.R3(this, 0, 1, null);
                                this.LLIIZ = R3;
                                o.LJI(R3);
                                R3.s(C79234V7u.LJIJI(6));
                            }
                            EffectProfileListFragment effectProfileListFragment = this.LLIIZ;
                            o.LJI(effectProfileListFragment);
                            effectProfileListFragment.ye(q4(), l4());
                            v3(this.LLIIZ, 6);
                            return;
                        }
                        if (this.LLIIII == null) {
                            ProfileListFragment b4 = AwemePagerAssem.b4(this, 0, 1, null);
                            this.LLIIII = b4;
                            if (b4 != null) {
                                b4.s(C79234V7u.LJIJI(3));
                            }
                        }
                        ProfileListFragment profileListFragment2 = this.LLIIII;
                        if (profileListFragment2 == null) {
                            return;
                        }
                        IProfileMusicTabService Y3 = Y3();
                        if (Y3 != null) {
                            Y3.LIZLLL(profileListFragment2, new C87078YFm(this));
                        }
                        IProfileMusicTabService Y32 = Y3();
                        if (Y32 != null) {
                            User mUser4 = getMUser();
                            if (mUser4 != null) {
                                str = mUser4.getUniqueId();
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                User mUser5 = getMUser();
                                if (mUser5 != null) {
                                    str3 = mUser5.getShortId();
                                }
                            } else {
                                User mUser6 = getMUser();
                                if (mUser6 != null) {
                                    str3 = mUser6.getUniqueId();
                                }
                            }
                            Y32.LJIIIZ(profileListFragment2, str3);
                        }
                        profileListFragment2.ye(q4(), l4());
                        v3(profileListFragment2, 3);
                        return;
                    }
                    if (this.LLIIL == null) {
                        this.LLIIL = i6(1, 2);
                    }
                    MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
                    if (mTAwemeListFragment == null) {
                        return;
                    }
                    mTAwemeListFragment.LLF = W3();
                    int i4 = this.LJLJL;
                    if (!f5()) {
                        i3 = 1;
                    }
                    if (i4 == i3) {
                        z2 = true;
                    }
                    mTAwemeListFragment.LJLLJ = z2;
                    mTAwemeListFragment.s(C79234V7u.LJIJI(1));
                    mTAwemeListFragment.setPreviousPage(e4());
                    mTAwemeListFragment.LLJI(k6());
                    mTAwemeListFragment.ye(q4(), l4());
                    mTAwemeListFragment.LLLIZZ = new C87074YFi(this);
                    v3(mTAwemeListFragment, 1);
                    return;
                }
                User mUser7 = getMUser();
                if (mUser7 == null) {
                    return;
                }
                if (this.LLIILZL == null) {
                    Bundle g6 = g6();
                    g6.putParcelable("user", new MiniUser(mUser7));
                    TabCommerceFragment LIZLLL2 = ECommerceShowcaseService.LJIIIZ().LIZLLL(i);
                    this.LLIILZL = LIZLLL2;
                    if (LIZLLL2 != null) {
                        LIZLLL2.setArguments(g6);
                    }
                }
                v3(this.LLIILZL, 16);
                IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
                String valueOf = String.valueOf(getEventType());
                String q4 = q4();
                User mUser8 = getMUser();
                if (mUser8 != null && mUser8.getFollowStatus() == 0) {
                    i2 = 1;
                }
                Integer valueOf2 = Integer.valueOf(i2 ^ 1);
                String e4 = e4();
                if (e4 != null || (e4 = getEventType()) != null) {
                    str2 = e4;
                }
                C87066YFa.LIZ(LJIIIZ, valueOf, "others_homepage", q4, false, valueOf2, str2, this.LLILLL, this.LLILLJJLI, this.LLILZ, null, 1024);
                return;
            }
            if (this.LLIILII == null) {
                User mUser9 = getMUser();
                CollectProfileListFragment collectProfileListFragment = new CollectProfileListFragment();
                collectProfileListFragment.LJLJJL = mUser9;
                collectProfileListFragment.LJLJJLL = false;
                this.LLIILII = collectProfileListFragment;
                collectProfileListFragment.s(C79234V7u.LJIJI(8));
            }
            v3(this.LLIILII, 8);
            return;
        }
        if (this.LLIIJLIL == null) {
            this.LLIIJLIL = i6(0, 1);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 == null) {
            return;
        }
        mTAwemeListFragment2.LLF = W3();
        mTAwemeListFragment2.LLIIJI = p6();
        mTAwemeListFragment2.LLIIJLIL = q6();
        if (this.LJLJL != f5()) {
            z = false;
        }
        mTAwemeListFragment2.LJLLJ = z;
        mTAwemeListFragment2.s(C79234V7u.LJIJI(0));
        mTAwemeListFragment2.setPreviousPage(e4());
        mTAwemeListFragment2.LLLFF = r6();
        getEventType();
        mTAwemeListFragment2.LLLFFI = H6();
        mTAwemeListFragment2.LLLFZ = D6();
        mTAwemeListFragment2.LLJI(k6());
        mTAwemeListFragment2.ye(q4(), l4());
        v3(mTAwemeListFragment2, 0);
        C56484MEu.LIZ(new OHZ());
        c6();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem, X.InterfaceC86908Y8y
    public void LIZJ(int i) {
        super.LIZJ(i);
        V6(i);
    }

    @Override // X.InterfaceC87065YEz
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

    @Override // X.InterfaceC87065YEz
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
        InterfaceC36571c5 interfaceC36571c52 = this.LLIILZL;
        if (!(interfaceC36571c52 instanceof InterfaceC87073YFh) || (interfaceC87073YFh = (InterfaceC87073YFh) interfaceC36571c52) == null) {
            return;
        }
        interfaceC87073YFh.E5(str);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void T4(MFC mfc) {
        o.LJIIIZ(mfc, "<set-?>");
        this.LLJILJILJ = mfc;
    }

    public final void Z6(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Sj(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Sj(z);
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.Sj(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILII;
        if (profileListFragment2 != null) {
            profileListFragment2.Sj(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJJLL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Sj(z);
        }
    }

    public final void a7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.H5(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.H5(z);
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.H5(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILII;
        if (profileListFragment2 != null) {
            profileListFragment2.H5(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJJI = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.H5(z);
        }
    }

    public final void b7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Kh(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Kh(z);
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.Kh(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILII;
        if (profileListFragment2 != null) {
            profileListFragment2.Kh(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJJL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Kh(z);
        }
    }

    public final void c7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Pf(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Pf(z);
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.Pf(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILII;
        if (profileListFragment2 != null) {
            profileListFragment2.Pf(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJL = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Pf(z);
        }
    }

    public final void d7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.Yk(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.Yk(z);
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.Yk(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILII;
        if (profileListFragment2 != null) {
            profileListFragment2.H5(z);
        }
        StickerStoreProfileListFragment stickerStoreProfileListFragment = this.LLIL;
        if (stickerStoreProfileListFragment != null) {
            stickerStoreProfileListFragment.LJLJLJ = z;
        }
        ProfileListFragment profileListFragment3 = this.LLIFFJFJJ;
        if (profileListFragment3 != null) {
            profileListFragment3.Yk(z);
        }
    }

    public final void e6(User user) {
        if (user != null && user.getGeneralPermission() != null && !TextUtils.isEmpty(user.getGeneralPermission().getProfileToast())) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "others_homepage");
            c188727au.LJIIIZ("show_type", M6(user));
            FMX.LJIIL("show_punish_toast", c188727au.LIZ);
        }
    }

    public final void e7(boolean z) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.K7(z);
        }
        MTAwemeListFragment mTAwemeListFragment2 = this.LLIIJLIL;
        if (mTAwemeListFragment2 != null) {
            mTAwemeListFragment2.K7(z);
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.K7(z);
        }
        EffectProfileListFragment effectProfileListFragment = this.LLIIZ;
        if (effectProfileListFragment != null) {
            effectProfileListFragment.K7(z);
        }
        ProfileListFragment profileListFragment2 = this.LLIILII;
        if (profileListFragment2 != null) {
            profileListFragment2.K7(z);
        }
    }

    public final void f7(String str) {
        MTAwemeListFragment mTAwemeListFragment = this.LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LLJLLL = str;
        }
    }

    public final void k7(boolean z) {
        ((C2314396l) _$_findCachedViewById(R.id.mz6)).LIZLLL(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C78857UxB.LJJJIL(F6())) {
            str = F6();
        } else if (C78857UxB.LJJJIL(x6())) {
            str = x6();
        } else if (C78857UxB.LJJJIL(k6())) {
            str = k6();
        } else {
            str = null;
        }
        this.LLILZ = str;
        if (this.LLILLJJLI == null && this.LLILLL == null && C78857UxB.LJJJIL(getEventType())) {
            Z9N z9n = Z9N.LIZIZ;
            String eventType = getEventType();
            o.LJI(eventType);
            Map<String, String> LLJLLIL = z9n.LLJLLIL(eventType, "");
            if (LLJLLIL != null && !LLJLLIL.isEmpty()) {
                this.LLILLJJLI = LLJLLIL.get("search_result_id");
                this.LLILLL = LLJLLIL.get("search_id");
            }
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Pi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIILIIL;
            }
        }, new AqS181S0100000_15(this, 139));
        C8YN.LJII(this, c4(), new TBT() { // from class: X.YFP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLILLLLZI);
            }
        }, null, new AqS197S0100000_15(this, 30), 6);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Ic
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS181S0100000_15(this, UserLevelGeckoUpdateSetting.DEFAULT));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.YFS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJI;
            }
        }, new AqS181S0100000_15(this, 133));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Ia
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, new AqS181S0100000_15(this, 134));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Ib
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS181S0100000_15(this, 135));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9IZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIIIZZ;
            }
        }, new AqS181S0100000_15(this, 136));
        C8VC.LJIIJ(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9TS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LIZ;
            }
        }, new TBT() { // from class: X.AW7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LIZIZ;
            }
        }, new AqS197S0100000_15(this, 29));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.YFU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIJ;
            }
        }, new AqS181S0100000_15(this, 137));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.YFb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIJJ;
            }
        }, new AqS181S0100000_15(this, 138));
    }

    public final void s7(boolean z) {
        yc(!z);
    }

    private final Bundle h6(String str, User user) {
        Bundle LIZJ = AnonymousClass036.LIZJ("enter_from", str, "entrance_type", "shop_list");
        LIZJ.putString("list_source_content_id", this.LLILZ);
        LIZJ.putIntArray("traffic_source_list", K6());
        LIZJ.putParcelable("user", new MiniUser(user));
        LIZJ.putString("trackParams", J6());
        return LIZJ;
    }

    private final MTAwemeListFragment i6(int i, int i2) {
        String str;
        String str2;
        FragmentManager childFragmentManager;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        Fragment fragment = null;
        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(i2);
            fragment = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        }
        MTAwemeListFragment mTAwemeListFragment = (MTAwemeListFragment) fragment;
        Bundle bundle = new Bundle();
        int[] K6 = K6();
        if (K6 != null && K6.length != 0) {
            bundle.putIntArray("traffic_source_list", K6());
        }
        String t6 = t6();
        if (t6 != null && t6.length() > 0) {
            bundle.putString("profile_enter_method", t6);
        }
        C26175APb profileInitData = getProfileInitData();
        if (profileInitData != null && (str2 = profileInitData.LJLJI) != null && str2.length() > 0) {
            bundle.putString("enter_from", str2);
        }
        C26175APb profileInitData2 = getProfileInitData();
        if (profileInitData2 != null && (str = profileInitData2.LJLJJL) != null && str.length() > 0) {
            bundle.putString("rfevent_previous_page", str);
        }
        if (mTAwemeListFragment == null) {
            return MTAwemeListFragment.Vm(-1, i, q4(), l4(), false, true, false, bundle);
        }
        return mTAwemeListFragment;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public boolean B5(String str, int i) {
        return C47261Igj.LJJIJIL(0, 2).contains(Integer.valueOf(i));
    }

    @Override // X.InterfaceC87065YEz
    public void Z(boolean z, boolean z2) {
        List<ProfileListFragment> list = this.LJLJI;
        if (list == null || this.LJLJL >= list.size()) {
            return;
        }
        List<ProfileListFragment> list2 = this.LJLJI;
        o.LJI(list2);
        if (ListProtector.get(list2, this.LJLJL) instanceof YFI) {
            List<ProfileListFragment> list3 = this.LJLJI;
            o.LJI(list3);
            Object obj = ListProtector.get(list3, this.LJLJL);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
            YFI yfi = (YFI) obj;
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

    public final void j7(String str, String str2) {
        String str3;
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.ye(str, str2);
            IProfileMusicTabService Y3 = Y3();
            if (Y3 != null) {
                User mUser = getMUser();
                String str4 = null;
                if (mUser != null) {
                    str3 = mUser.getUniqueId();
                } else {
                    str3 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    User mUser2 = getMUser();
                    if (mUser2 != null) {
                        str4 = mUser2.getShortId();
                    }
                } else {
                    User mUser3 = getMUser();
                    if (mUser3 != null) {
                        str4 = mUser3.getUniqueId();
                    }
                }
                Y3.LJIIIZ(profileListFragment, str4);
            }
        }
        EffectProfileListFragment effectProfileListFragment = this.LLIIZ;
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

    public final void T6(InterfaceC87073YFh interfaceC87073YFh, User user, int i) {
        if (y5(user, i)) {
            interfaceC87073YFh.m4(new MiniUser(user));
        }
    }
}
