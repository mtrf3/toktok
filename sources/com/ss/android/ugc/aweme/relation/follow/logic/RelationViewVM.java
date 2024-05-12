package com.ss.android.ugc.aweme.relation.follow.logic;

import X.AbstractC57378MfW;
import X.C113554cx;
import X.C225338sr;
import X.C36636EZk;
import X.C38333F2r;
import X.C3U1;
import X.C46104I7o;
import X.C48841JEv;
import X.C57107Mb9;
import X.C57272Mdo;
import X.C57285Me1;
import X.C57362MfG;
import X.C57377MfV;
import X.C57430MgM;
import X.C58655N0h;
import X.C58704N2e;
import X.C63081OpJ;
import X.C64962gm;
import X.C73340SqO;
import X.C76800UCe;
import X.C78613UtF;
import X.C78685UuP;
import X.EF7;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57435MgR;
import X.InterfaceC88471Ynr;
import X.NN1;
import X.OJY;
import X.OSZ;
import X.T2R;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RelationViewVM extends ViewModel implements C3U1 {
    public final C64962gm LJLIL = C48841JEv.LIZ(C36636EZk.LIZ.plus(T2R.LJIIJJI()));
    public final NextLiveData<OSZ<String, Boolean>> LJLILLLLZI;
    public final NextLiveData LJLJI;

    public RelationViewVM() {
        NextLiveData<OSZ<String, Boolean>> nextLiveData = new NextLiveData<>();
        this.LJLILLLLZI = nextLiveData;
        this.LJLJI = nextLiveData;
    }

    public static void gv0(C57285Me1 c57285Me1, RelationStatus relationStatus, boolean z) {
        Aweme aweme;
        if (z) {
            Aweme aweme2 = c57285Me1.LJII;
            if (aweme2 != null) {
                kv0(c57285Me1.LIZJ, aweme2, c57285Me1.LJIIIIZZ, relationStatus);
                return;
            }
            return;
        }
        if (relationStatus.status_code != 2149 || (aweme = c57285Me1.LJII) == null) {
            return;
        }
        kv0(c57285Me1.LIZJ, aweme, c57285Me1.LJIIIIZZ, relationStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void hv0(User user, boolean z, C57430MgM c57430MgM) {
        Integer num;
        EnumC57365MfJ enumC57365MfJ;
        String str;
        String str2;
        EnumC57366MfK enumC57366MfK;
        String str3;
        String str4;
        String str5;
        int i;
        int i2;
        String str6;
        String str7;
        int i3;
        String str8;
        String str9;
        String str10;
        boolean z2;
        boolean z3;
        String str11;
        Map LJJJLIIL;
        MatchedFriendStruct matchedFriendStruct;
        String str12;
        C57377MfV c57377MfV;
        String uid;
        Boolean bool;
        MatchedFriendStruct matchedFriendStruct2;
        Boolean bool2;
        String str13;
        boolean z4 = false;
        String str14 = null;
        if (z) {
            enumC57365MfJ = EnumC57365MfJ.ENTER_CHAT;
        } else {
            if (user != null) {
                num = Integer.valueOf(user.getFollowStatus());
            } else {
                num = null;
            }
            int value = EnumC57435MgR.UNFOLLOW.getValue();
            if (num == null || num.intValue() != value) {
                enumC57365MfJ = EnumC57365MfJ.FOLLOW_CANCEL;
            } else if (c57430MgM != null && o.LJ(c57430MgM.LJJIFFI, Boolean.TRUE)) {
                enumC57365MfJ = EnumC57365MfJ.PROFILE_VIDEO_FOLLOW;
            } else {
                enumC57365MfJ = EnumC57365MfJ.FOLLOW;
            }
        }
        C57362MfG c57362MfG = new C57362MfG();
        if (c57430MgM != null) {
            str = c57430MgM.LJFF;
        } else {
            str = null;
        }
        c57362MfG.LJJJI(str);
        if (c57430MgM != null) {
            str2 = c57430MgM.LIZIZ;
        } else {
            str2 = null;
        }
        c57362MfG.LJJIIZI(str2);
        if (c57430MgM != null && (str13 = c57430MgM.LJIIJJI) != null) {
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            String upperCase = str13.toUpperCase(ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            enumC57366MfK = EnumC57366MfK.valueOf(upperCase);
        } else {
            enumC57366MfK = null;
        }
        c57362MfG.LJJLI = enumC57366MfK;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        if (c57430MgM != null) {
            str3 = c57430MgM.LJIILLIIL;
        } else {
            str3 = null;
        }
        String str15 = "";
        if (str3 == null) {
            str3 = "";
        }
        c57362MfG.LJJLIIIJJI = str3;
        if (c57430MgM != null) {
            str4 = c57430MgM.LJIILJJIL;
        } else {
            str4 = null;
        }
        c57362MfG.LJJJ(str4);
        if (c57430MgM != null) {
            str5 = c57430MgM.LJIIZILJ;
        } else {
            str5 = null;
        }
        c57362MfG.LJJJJZI = str5;
        if (c57430MgM != null) {
            i = c57430MgM.LJIJI;
        } else {
            i = 0;
        }
        c57362MfG.LJJJLL = i;
        if (c57430MgM != null) {
            i2 = c57430MgM.LJIJJ;
        } else {
            i2 = 0;
        }
        c57362MfG.LJJJLZIJ = i2;
        if (c57430MgM == null || (str6 = c57430MgM.LJI) == null) {
            str6 = "";
        }
        c57362MfG.LJJLIIIJLJLI = str6;
        if (c57430MgM != null) {
            str7 = c57430MgM.LJIJ;
        } else {
            str7 = null;
        }
        c57362MfG.LJJJLIIL = str7;
        c57362MfG.LJJJJIZL(user);
        if (c57430MgM != null && (bool2 = c57430MgM.LJJIZ) != null) {
            i3 = bool2.booleanValue();
        } else {
            i3 = 0;
        }
        c57362MfG.LJLJLLL = i3;
        if (user == null || ((str8 = user.getFriendTypeStr()) == null && ((matchedFriendStruct2 = user.getMatchedFriendStruct()) == null || (str8 = matchedFriendStruct2.getRelationType()) == null))) {
            str8 = "";
        }
        c57362MfG.LJJLIIIJLLLLLLLZ = str8;
        if (user != null) {
            str9 = user.getAccurateRecType();
        } else {
            str9 = null;
        }
        c57362MfG.LJJJIL(str9);
        if (c57430MgM != null) {
            str10 = c57430MgM.LIZLLL;
        } else {
            str10 = null;
        }
        c57362MfG.LJJIJ(str10);
        if (c57430MgM != null && (bool = c57430MgM.LJIJJLI) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        c57362MfG.LJLI = z2;
        if (c57430MgM != null) {
            z3 = c57430MgM.LJJ;
        } else {
            z3 = false;
        }
        c57362MfG.LJLJLJ = z3;
        if (user instanceof RecUser) {
            RecUser recUser = (RecUser) user;
            if (recUser.isRelatedRec()) {
                AbstractC57378MfW from = recUser.getFrom();
                if ((from instanceof C57377MfV) && (c57377MfV = (C57377MfV) from) != null && (uid = c57377MfV.getUid()) != null) {
                    str15 = uid;
                }
                int LJJIII = C46104I7o.LJJIII(recUser);
                c57362MfG.LJLIIIL = true;
                c57362MfG.LJLIIL = str15;
                c57362MfG.LJLIL = LJJIII;
            }
            c57362MfG.LJLILLLLZI = recUser.getFrom() instanceof C225338sr;
        }
        if (c57430MgM != null) {
            str11 = c57430MgM.LJJIIJ;
        } else {
            str11 = null;
        }
        if (C78685UuP.LJJJZ(str11)) {
            if (c57430MgM != null) {
                str12 = c57430MgM.LJJIIJ;
            } else {
                str12 = null;
            }
            c57362MfG.LJJIL = str12;
        }
        if (user != null && (matchedFriendStruct = user.getMatchedFriendStruct()) != null) {
            z4 = o.LJ(matchedFriendStruct.isNewMaF(), Boolean.TRUE);
        }
        if (c57430MgM != null) {
            str14 = c57430MgM.LIZIZ;
        }
        c57362MfG.LJJIJL(str14, z4);
        if (c57430MgM == null || (LJJJLIIL = c57430MgM.LJJJ) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        c57362MfG.LIZ(LJJJLIIL);
        c57362MfG.LJIILIIL();
    }

    public static int iv0(int i, int i2, boolean z) {
        EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOWED;
        if (i == enumC57435MgR.getValue()) {
            if (z) {
                return EnumC57435MgR.FOLLOW_REQUESTED.getValue();
            }
            if (i2 == enumC57435MgR.getValue()) {
                return EnumC57435MgR.FOLLOW_MUTUAL.getValue();
            }
            return enumC57435MgR.getValue();
        }
        return EnumC57435MgR.UNFOLLOW.getValue();
    }

    @Override // X.C3U1
    public final void yQ(C57285Me1 c57285Me1, String str, InterfaceC88471Ynr<? super Boolean, ? super C38333F2r, C76800UCe> interfaceC88471Ynr) {
        if (c57285Me1 == null) {
            return;
        }
        c57285Me1.LJIILLIIL = System.currentTimeMillis();
        XKX.LIZLLL(this.LJLIL, C78613UtF.LIZJ, null, new C57272Mdo(this, c57285Me1, interfaceC88471Ynr, str, null), 2);
    }

    public static void kv0(int i, Aweme aweme, String str, RelationStatus relationStatus) {
        if (str != null) {
            int i2 = 1;
            if (i != 1 || !C63081OpJ.LJLJL(aweme)) {
                return;
            }
            if (o.LJ(str, "feed")) {
                OJY LJIL = C73340SqO.LJIL();
                Context LIZIZ = EF7.LIZIZ();
                String uid = relationStatus.getUid();
                Integer valueOf = Integer.valueOf(relationStatus.getFollowStatus());
                if (valueOf != null) {
                    FollowStatus followStatus = new FollowStatus(uid, valueOf.intValue());
                    LJIL.getClass();
                    NN1.LJJIIJZLJL(LIZIZ, aweme, followStatus);
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "follow", aweme.getAwemeRawAd());
                    if (!relationStatus.isCheating()) {
                        i2 = 0;
                    }
                    LIZLLL.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
                    LIZLLL.LIZIZ(Integer.valueOf(relationStatus.getFollowStatus()), "follow_status");
                    LIZLLL.LJII();
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (!o.LJ(str, "homepage")) {
                return;
            }
            OJY LJIL2 = C73340SqO.LJIL();
            Context LIZIZ2 = EF7.LIZIZ();
            String uid2 = relationStatus.getUid();
            Integer valueOf2 = Integer.valueOf(relationStatus.getFollowStatus());
            if (valueOf2 != null) {
                FollowStatus followStatus2 = new FollowStatus(uid2, valueOf2.intValue());
                LJIL2.getClass();
                OJY.LJIIIZ(LIZIZ2, aweme, followStatus2);
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("homepage_ad", "follow", aweme.getAwemeRawAd());
                if (!relationStatus.isCheating()) {
                    i2 = 0;
                }
                LIZLLL2.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
                LIZLLL2.LIZIZ(Integer.valueOf(relationStatus.getFollowStatus()), "follow_status");
                LIZLLL2.LJII();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static void jv0(int i, String str, C57430MgM c57430MgM, LifecycleOwner lifecycleOwner, boolean z) {
        if (i != EnumC57435MgR.FOLLOW_MUTUAL.getValue() || str == null || str.length() == 0) {
            return;
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (!C57107Mb9.LIZIZ(createIIMServicebyMonsterPlugin.getImSayHiService(), str, 6) || c57430MgM == null || !(!o.LJ(c57430MgM.LIZIZ, "inner_push"))) {
            return;
        }
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("enter_from", c57430MgM.LIZIZ);
        String str2 = c57430MgM.LIZLLL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        oszArr[1] = new OSZ("enter_method", str2);
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        String str4 = c57430MgM.LJIIJ;
        if (str4 != null) {
            LJJLIIIIJ.put("sub_page", str4);
        }
        User user = c57430MgM.LIZJ;
        if (user != null) {
            String accurateRecType = user.getAccurateRecType();
            if (accurateRecType != null) {
                str3 = accurateRecType;
            }
            LJJLIIIIJ.put("rec_type", str3);
            LJJLIIIIJ.put("relation_tag", String.valueOf(user.getFollowStatus()));
        }
        createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZ(str, LJJLIIIIJ, lifecycleOwner, z);
    }
}
