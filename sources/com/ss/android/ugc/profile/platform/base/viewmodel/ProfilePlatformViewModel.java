package com.ss.android.ugc.profile.platform.base.viewmodel;

import X.APY;
import X.C19N;
import X.C213688a4;
import X.C237249Su;
import X.C26175APb;
import X.C2YJ;
import X.C43I;
import X.C46104I7o;
import X.C47261Igj;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C76800UCe;
import X.C770830u;
import X.C78983UzD;
import X.C87059YEt;
import X.C90853hR;
import X.C9PM;
import X.C9T1;
import X.EFJ;
import X.EnumC235129Kq;
import X.EnumC53719L6l;
import X.HG3;
import X.InterfaceC55235Lm3;
import X.InterfaceC88472Yns;
import X.L61;
import X.L6F;
import X.OSJ;
import X.RBX;
import X.T16;
import X.TBT;
import Y.AfS56S0100000_4;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.profile.platform.base.data.UpdateProfileUserAPI;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class ProfilePlatformViewModel extends AssemViewModel<C9PM> {
    public InterfaceC55235Lm3 LJLJI;
    public User LJLJJI;
    public String LJLIL = "normal_mode";
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LJFF(this, C26175APb.class, null), true);
    public boolean LJLJJL = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C9PM defaultState() {
        return new C9PM(0);
    }

    public final User hv0() {
        if (this.LJLJJL) {
            return AccountService.LJIJ().LJFF().getCurUser();
        }
        return this.LJLJJI;
    }

    public final Aweme gv0() {
        UserProfileAbility userProfileAbility;
        C87059YEt Qd;
        Aweme aweme = getState().LJLJLLL;
        if (aweme == null) {
            InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJI;
            if (interfaceC55235Lm3 == null || (userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(interfaceC55235Lm3, UserProfileAbility.class, null)) == null || (Qd = userProfileAbility.Qd()) == null) {
                return null;
            }
            return Qd.LIZJ;
        }
        return aweme;
    }

    public final String iv0() {
        String str = getState().LJZL;
        if (TextUtils.equals(str, "prop_page") && gv0() != null) {
            return "prop_page_detail_aweme";
        }
        return str;
    }

    public final String jv0() {
        UserProfileAbility userProfileAbility;
        C87059YEt Qd;
        String str = getState().LJZ;
        if (str == null) {
            InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJI;
            if (interfaceC55235Lm3 == null || (userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(interfaceC55235Lm3, UserProfileAbility.class, null)) == null || (Qd = userProfileAbility.Qd()) == null) {
                return null;
            }
            return Qd.LIZIZ;
        }
        return str;
    }

    public final String kv0() {
        UserProfileAbility userProfileAbility;
        C87059YEt Qd;
        String str = getState().LJLZ;
        if (str == null) {
            InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJI;
            if (interfaceC55235Lm3 == null || (userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(interfaceC55235Lm3, UserProfileAbility.class, null)) == null || (Qd = userProfileAbility.Qd()) == null) {
                return null;
            }
            return Qd.LIZ;
        }
        return str;
    }

    public final void ov0(InterfaceC88472Yns<? super C43I<C76800UCe>, C76800UCe> interfaceC88472Yns) {
        AssemViewModel.selectSubscribe$default(this, new TBT() { // from class: X.9Ju
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), null, null, new AqS170S0100000_4(interfaceC88472Yns, (InterfaceC88472Yns<? super APY, C76800UCe>) 813), 12, null);
    }

    public final void pv0(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        AssemViewModel.selectSubscribe$default(this, new TBT() { // from class: X.9K0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PM) obj).LJLLLLLL);
            }
        }, null, null, null, new AqS170S0100000_4(interfaceC88472Yns, (InterfaceC88472Yns<? super APY, C76800UCe>) 814), 14, null);
    }

    public final void qv0(InterfaceC88472Yns<? super C43I<? extends OSJ<Integer, Integer, ? extends Intent>>, C76800UCe> interfaceC88472Yns) {
        AssemViewModel.selectSubscribe$default(this, new TBT() { // from class: X.9Jg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLJI;
            }
        }, null, null, null, new AqS170S0100000_4(interfaceC88472Yns, (InterfaceC88472Yns<? super APY, C76800UCe>) 815), 14, null);
    }

    public final void rv0(InterfaceC88472Yns<? super C43I<Boolean>, C76800UCe> interfaceC88472Yns) {
        AssemViewModel.selectSubscribe$default(this, new TBT() { // from class: X.9IU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PM) obj).LJLILLLLZI;
            }
        }, null, null, null, new AqS170S0100000_4(interfaceC88472Yns, (InterfaceC88472Yns<? super APY, C76800UCe>) 816), 14, null);
    }

    public final void sv0(InterfaceC88472Yns<? super Boolean, C76800UCe> subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        AssemViewModel.selectSubscribe$default(this, new TBT() { // from class: X.9KC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PM) obj).LJLJJL);
            }
        }, null, null, null, new AqS170S0100000_4(subscriber, (InterfaceC88472Yns<? super APY, C76800UCe>) 817), 14, null);
    }

    public static void tv0(String str, ArrayList arrayList) {
        if (!C19N.LJ("profile_platform_legacy_migrate", false)) {
            return;
        }
        synchronized (arrayList) {
            if ((!arrayList.isEmpty()) && C78983UzD.LJJJJ((String) arrayList.get(0))) {
                Object obj = arrayList.get(0);
                o.LJIIIIZZ(obj, "existRequestComplete[0]");
                if (s.LJJJLZIJ((String) obj, "_error", false) && s.LJJJLZIJ(str, "_error", false)) {
                    return;
                }
                User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                ((RBX) HG3.LJIILL()).updateCurUser(curUser);
                L6F.LIZIZ.LIZLLL(L61.STORY, EnumC53719L6l.PROFILE, C47261Igj.LJJIJ(curUser), new AqS170S0100000_4(curUser, 1638));
            } else {
                arrayList.add(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r18 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r18 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nv0(com.ss.android.ugc.aweme.profile.model.User r18, X.EnumC235129Kq r19, com.ss.android.ugc.profile.platform.base.data.ProfileUser r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel.nv0(com.ss.android.ugc.aweme.profile.model.User, X.9Kq, com.ss.android.ugc.profile.platform.base.data.ProfileUser, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0118, code lost:
    
        if (((java.lang.Number) X.C9TA.LIZIZ.getValue()).intValue() == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void lv0(com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r13, int r14, X.EnumC235129Kq r15, java.lang.String r16, int r17) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel.lv0(com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel, int, X.9Kq, java.lang.String, int):void");
    }

    public static void mv0(ProfilePlatformViewModel profilePlatformViewModel, int i, EnumC235129Kq enumC235129Kq, String str, int i2) {
        String sceneId;
        boolean z;
        String jv0;
        Integer num;
        String str2;
        String str3;
        NewFaceStickerBean stickerEntranceInfo;
        String str4;
        AwemeRawAd awemeRawAd;
        C26175APb c26175APb;
        String methodFrom = str;
        int i3 = i;
        EnumC235129Kq action = enumC235129Kq;
        if ((i2 & 1) != 0) {
            sceneId = C9T1.OTHER_PROFILE.getId();
        } else {
            sceneId = null;
        }
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            action = EnumC235129Kq.NORMAL;
        }
        String str5 = "";
        if ((i2 & 8) != 0) {
            methodFrom = "";
        }
        profilePlatformViewModel.getClass();
        o.LJIIIZ(sceneId, "sceneId");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(methodFrom, "methodFrom");
        long currentTimeMillis = System.currentTimeMillis();
        if (profilePlatformViewModel.gv0() != null || ((c26175APb = (C26175APb) profilePlatformViewModel.LJLILLLLZI.getValue()) != null && c26175APb.LJLJL)) {
            z = false;
        } else {
            z = true;
        }
        String kv0 = profilePlatformViewModel.kv0();
        if ((kv0 == null || ujb.o.LJJJJJL(kv0)) && ((jv0 = profilePlatformViewModel.jv0()) == null || ujb.o.LJJJJJL(jv0))) {
            profilePlatformViewModel.setState(C90853hR.LJLIL);
            return;
        }
        if (i3 == 0) {
            C26175APb c26175APb2 = (C26175APb) profilePlatformViewModel.LJLILLLLZI.getValue();
            if (c26175APb2 != null) {
                num = Integer.valueOf(c26175APb2.LJLJLLL);
            } else {
                num = null;
            }
            Aweme gv0 = profilePlatformViewModel.gv0();
            if (gv0 != null && (stickerEntranceInfo = gv0.getStickerEntranceInfo()) != null) {
                str2 = stickerEntranceInfo.ownerId;
            } else {
                str2 = null;
            }
            Aweme gv02 = profilePlatformViewModel.gv0();
            if (gv02 == null) {
                str3 = "";
            } else {
                str3 = gv02.getAuthorUid();
            }
            boolean equals = TextUtils.equals(str2, str3);
            if (TextUtils.equals(profilePlatformViewModel.iv0(), "music_detail")) {
                i3 = 1;
            } else if (TextUtils.equals(profilePlatformViewModel.iv0(), "prop_page")) {
                i3 = 3;
            } else if (!TextUtils.equals(profilePlatformViewModel.iv0(), "general_search") || num == null || num.intValue() != 2) {
                if (!TextUtils.equals(profilePlatformViewModel.iv0(), "general_search") || num == null || num.intValue() != 3) {
                    if (!TextUtils.equals(profilePlatformViewModel.iv0(), "general_search") || num == null || num.intValue() != 1) {
                        if (equals) {
                            i3 = 7;
                        } else {
                            i3 = 0;
                        }
                    } else {
                        i3 = 6;
                    }
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
        }
        Aweme gv03 = profilePlatformViewModel.gv0();
        String kv02 = profilePlatformViewModel.kv0();
        String jv02 = profilePlatformViewModel.jv0();
        C237249Su c237249Su = new C237249Su(currentTimeMillis, methodFrom, profilePlatformViewModel, action);
        if (gv03 != null && (awemeRawAd = gv03.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
            AwemeRawAd awemeRawAd2 = gv03.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str4 = awemeRawAd2.getCreativeIdStr();
            } else {
                str4 = null;
            }
            str5 = "true";
        } else {
            str4 = null;
        }
        Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
        if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
            if (!TextUtils.isEmpty(jv02)) {
                kv02 = null;
            } else {
                jv02 = null;
            }
        }
        IRetrofitFactory LJJII = C46104I7o.LJJII();
        String str6 = EFJ.LIZJ;
        ((UpdateProfileUserAPI) C770830u.LIZJ(str6, "API_URL_PREFIX_SI", LJJII, str6).LIZ.LIZ(UpdateProfileUserAPI.class)).getOtherUserInfo(sceneId, str4, jv02, kv02, i3, str5, z).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS56S0100000_4(c237249Su, 128), new AfS56S0100000_4(c237249Su, 129));
    }
}
