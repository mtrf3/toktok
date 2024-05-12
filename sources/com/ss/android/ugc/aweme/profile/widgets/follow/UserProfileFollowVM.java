package com.ss.android.ugc.aweme.profile.widgets.follow;

import X.AV1;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C188727au;
import X.C227768wm;
import X.C235099Kn;
import X.C26175APb;
import X.C2U8;
import X.C34074DYw;
import X.C36636EZk;
import X.C3U3;
import X.C3U6;
import X.C45804HyK;
import X.C47704Ins;
import X.C48841JEv;
import X.C55749LuL;
import X.C57107Mb9;
import X.C57362MfG;
import X.C57364MfI;
import X.C57368MfM;
import X.C57369MfN;
import X.C57370MfO;
import X.C57371MfP;
import X.C57372MfQ;
import X.C57373MfR;
import X.C57374MfS;
import X.C57375MfT;
import X.C57376MfU;
import X.C58655N0h;
import X.C58704N2e;
import X.C63081OpJ;
import X.C64962gm;
import X.C73340SqO;
import X.C78920UyC;
import X.C8RV;
import X.C98593tv;
import X.C9IB;
import X.EF7;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57387Mff;
import X.FMX;
import X.HG3;
import X.InterfaceC214228aw;
import X.InterfaceC244509ig;
import X.InterfaceC57106Mb8;
import X.NN1;
import X.OJY;
import X.OSZ;
import X.RBX;
import X.T16;
import X.Z9N;
import Y.AfS61S0100000_9;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserProfileFollowVM extends AssemViewModel<C57376MfU> {
    public final InterfaceC214228aw<InterfaceC244509ig> LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C55749LuL LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public User LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public Integer LJLLI;
    public final C64962gm LJLLILLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C57376MfU defaultState() {
        return new C57376MfU(0);
    }

    public final C26175APb iv0() {
        if (((Number) C235099Kn.LIZ.getValue()).intValue() > 0) {
            C9IB c9ib = (C9IB) this.LJLJI.getValue();
            if (c9ib != null) {
                return c9ib.LJLJLJ;
            }
            return null;
        }
        return (C26175APb) this.LJLILLLLZI.getValue();
    }

    public final void pv0() {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        User user = this.LJLJJLL;
        if (user == null || (str = user.getUid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("click_remove_fans", c188727au.LIZ);
    }

    public final void tv0() {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        User user = this.LJLJJLL;
        if (user == null || (str = user.getUid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("remove_fans", c188727au.LIZ);
    }

    public final String hv0() {
        C57368MfM c57368MfM;
        C57364MfI c57364MfI;
        C57368MfM c57368MfM2;
        String str;
        C57368MfM c57368MfM3;
        C26175APb iv0 = iv0();
        if (iv0 == null || (c57368MfM2 = iv0.LJLJLJ) == null || (str = c57368MfM2.LJI) == null || str.length() == 0) {
            C26175APb iv02 = iv0();
            if (iv02 == null || (c57368MfM = iv02.LJLJLJ) == null || (c57364MfI = c57368MfM.LJFF) == null) {
                return null;
            }
            return c57364MfI.getPosition();
        }
        C26175APb iv03 = iv0();
        if (iv03 == null || (c57368MfM3 = iv03.LJLJLJ) == null) {
            return null;
        }
        return c57368MfM3.LJI;
    }

    public UserProfileFollowVM(InterfaceC214228aw<InterfaceC244509ig> repository) {
        o.LJIIIZ(repository, "repository");
        this.LJLIL = repository;
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJFF(this, C26175APb.class, null), true);
        this.LJLJI = new C55749LuL(C47704Ins.LJFF(this, C9IB.class, "root_data"), true);
        this.LJLLILLLL = C48841JEv.LIZ(C36636EZk.LIZ);
    }

    public static void nv0(int i) {
        FMX.LJIIL("choose_punish_pop", C78920UyC.LIZJ(i, "is_follow").LIZ);
    }

    public static void uv0(User user) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        if (user != null && user.getGeneralPermission() != null) {
            int followToastType = user.getGeneralPermission().getFollowToastType();
            if (followToastType != 1) {
                if (followToastType == 2) {
                    str = "suspend";
                }
            } else {
                str = "ban";
            }
            c188727au.LJIIIZ("show_type", str);
            FMX.LJIIL("show_punish_pop", c188727au.LIZ);
        }
        str = "";
        c188727au.LJIIIZ("show_type", str);
        FMX.LJIIL("show_punish_pop", c188727au.LIZ);
    }

    public final void gv0(EnumC57387Mff eventEnum) {
        User user;
        User user2;
        User user3;
        User user4;
        GeneralPermission generalPermission;
        User user5;
        o.LJIIIZ(eventEnum, "eventEnum");
        if (eventEnum.compareTo(EnumC57387Mff.LOGIN) < 0 && !((RBX) HG3.LJIILL()).isLogin()) {
            setState(C57369MfN.LJLIL);
            return;
        }
        if (eventEnum.compareTo(EnumC57387Mff.BLOCK) < 0 && (user5 = this.LJLJJLL) != null && user5.isBlock && !AV1.LJIILIIL(user5.getFollowStatus())) {
            setState(C57370MfO.LJLIL);
            return;
        }
        if (eventEnum.compareTo(EnumC57387Mff.BAN) < 0 && (user3 = this.LJLJJLL) != null && user3.getFollowStatus() == 0 && (user4 = this.LJLJJLL) != null && (generalPermission = user4.getGeneralPermission()) != null) {
            int followToastType = generalPermission.getFollowToastType();
            if (followToastType == 1) {
                setState(C57371MfP.LJLIL);
                return;
            } else if (followToastType == 2) {
                setState(C57374MfS.LJLIL);
                return;
            }
        }
        if (eventEnum.compareTo(EnumC57387Mff.DOUBLE_CANCEL) < 0 && (user2 = this.LJLJJLL) != null && user2.getFollowStatus() == 2) {
            setState(C57372MfQ.LJLIL);
        } else if (eventEnum.compareTo(EnumC57387Mff.REQUESTED) < 0 && (user = this.LJLJJLL) != null && user.getFollowStatus() == 4) {
            setState(C57373MfR.LJLIL);
        } else {
            setState(C57375MfT.LJLIL);
        }
    }

    public final void jv0(Integer num, String... strArr) {
        this.LJLJJI = strArr[0];
        this.LJLJJL = strArr[1];
        this.LJLJL = strArr[2];
        this.LJLJLJ = strArr[3];
        this.LJLJLLL = strArr[4];
        this.LJLL = strArr[5];
        this.LJLLI = num;
    }

    public final void kv0(String str, String str2) {
        AbstractC73672Svk<BaseResponse> LJJL;
        InterfaceC244509ig operator = this.LJLIL.getOperator();
        if (!C34074DYw.LIZ) {
            LJJL = operator.LIZJ(str, str2);
        } else {
            LJJL = operator.LIZJ(str, str2).LJJL(T16.LIZ());
        }
        disposeOnClear(LJJL.LJJL(T16.LIZ()).LJJJLIIL(new AfS61S0100000_9(this, 19), new AfS61S0100000_9(this, 20)));
    }

    public final void qv0(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", str);
        c188727au.LJIIIZ("rec_type", str2);
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("previous_page", this.LJLJJI);
        FMX.LJIIL("show_follow_back_button", c188727au.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sv0(X.EnumC57365MfJ r8, com.ss.android.ugc.aweme.profile.model.User r9) {
        /*
            r7 = this;
            X.APb r0 = r7.iv0()
            r2 = 0
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.LJLL
            if (r0 == 0) goto L89
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L23
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L23
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L20
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L20
            goto L2c
        L20:
            r0 = move-exception
            r1 = r5
            goto L24
        L23:
            r0 = move-exception
        L24:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            r5 = r1
        L2c:
            java.lang.String r0 = "scene_type"
            boolean r0 = r5.has(r0)
            if (r0 != 0) goto L35
            return r2
        L35:
            X.MfG r4 = new X.MfG
            r4.<init>()
            X.APb r0 = r7.iv0()
            if (r0 == 0) goto L7f
            java.lang.String r0 = r0.LJLJI
        L42:
            r4.LJJIIZI(r0)
            r4.LJJLIIIIJ = r8
            r4.LJJJJIZL(r9)
            java.util.Iterator r3 = r5.keys()
            java.lang.String r0 = "json.keys()"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
        L53:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r5.optString(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "json.optString(key)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L76
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L76
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L76
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L76
            goto L53
        L76:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
            goto L53
        L7f:
            r0 = 0
            goto L42
        L81:
            r4.LIZ(r6)
            r4.LJIILIIL()
            r0 = 1
            return r0
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.sv0(X.MfJ, com.ss.android.ugc.aweme.profile.model.User):boolean");
    }

    public final void ov0(String str, User user, Aweme aweme) {
        String requestId;
        C57368MfM c57368MfM;
        C57364MfI c57364MfI;
        C26175APb iv0 = iv0();
        String str2 = "";
        if (iv0 != null && (c57368MfM = iv0.LJLJLJ) != null && (c57364MfI = c57368MfM.LJFF) != null) {
            c57364MfI.getEnterFrom();
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_CHAT;
            c57362MfG.LJJJJJ(c57364MfI);
            c57362MfG.LJJIIZ(aweme);
            c57362MfG.LJJJI("prop_page");
            c57362MfG.LJJJ(hv0());
            c57362MfG.LJJJJIZL(user);
            String reqId = c57364MfI.getReqId();
            if (reqId == null) {
                reqId = "";
            }
            c57362MfG.LJJJJ(reqId);
            c57362MfG.LJIILIIL();
        }
        EnumC57365MfJ enumC57365MfJ = EnumC57365MfJ.ENTER_CHAT;
        sv0(enumC57365MfJ, user);
        if (C8RV.LIZ(null, str, null)) {
            C57362MfG c57362MfG2 = new C57362MfG();
            c57362MfG2.LJJIIZI(str);
            c57362MfG2.LJJLI = EnumC57366MfK.ITEM;
            c57362MfG2.LJJJJI();
            c57362MfG2.LJJLIIIIJ = enumC57365MfJ;
            c57362MfG2.LJJIIZ(aweme);
            c57362MfG2.LJJJJIZL(user);
            c57362MfG2.LJJJI("prop_page");
            if (aweme != null && (requestId = aweme.getRequestId()) != null) {
                str2 = requestId;
            }
            c57362MfG2.LJJJJ(str2);
            c57362MfG2.LJJIZ();
        }
    }

    public static void lv0(int i, Aweme aweme, String str, FollowStatus followStatus) {
        if (str != null) {
            int i2 = 1;
            if (i != 1 || !C63081OpJ.LJLJL(aweme)) {
                return;
            }
            if (o.LJ(str, "feed")) {
                OJY LJIL = C73340SqO.LJIL();
                Context LIZIZ = EF7.LIZIZ();
                LJIL.getClass();
                NN1.LJJIIJZLJL(LIZIZ, aweme, followStatus);
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "follow", aweme.getAwemeRawAd());
                if (!followStatus.isCheating()) {
                    i2 = 0;
                }
                LIZLLL.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
                LIZLLL.LIZIZ(Integer.valueOf(followStatus.followStatus), "follow_status");
                LIZLLL.LJII();
                return;
            }
            if (!o.LJ(str, "homepage")) {
                return;
            }
            OJY LJIL2 = C73340SqO.LJIL();
            Context LIZIZ2 = EF7.LIZIZ();
            LJIL2.getClass();
            OJY.LJIIIZ(LIZIZ2, aweme, followStatus);
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("homepage_ad", "follow", aweme.getAwemeRawAd());
            if (!followStatus.isCheating()) {
                i2 = 0;
            }
            LIZLLL2.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
            LIZLLL2.LIZIZ(Integer.valueOf(followStatus.followStatus), "follow_status");
            LIZLLL2.LJII();
        }
    }

    public final void mv0(Context context, User user, String str, String str2, String str3) {
        IMUser iMUser;
        String str4;
        String str5;
        int parseInt;
        String str6;
        String str7;
        String str8;
        String str9;
        String remarkName;
        String LJIJ = C227768wm.LJIJ(user);
        String LJIL = C227768wm.LJIL(user);
        if (user != null) {
            iMUser = IMUser.fromUser(user);
        } else {
            iMUser = null;
        }
        C98593tv c98593tv = new C98593tv(context, iMUser);
        c98593tv.setEnterFromForMob("others_homepage");
        C26175APb iv0 = iv0();
        if (iv0 != null) {
            str4 = iv0.LJLJI;
        } else {
            str4 = null;
        }
        c98593tv.setPreviousPage(str4);
        c98593tv.setEnterMethodForMob(str2);
        if (user != null) {
            str5 = user.getAccurateRecType();
        } else {
            str5 = null;
        }
        c98593tv.setRecType(str5);
        c98593tv.setToUserType(LJIL);
        if (LJIJ.length() == 0) {
            parseInt = -1;
        } else {
            parseInt = CastIntegerProtector.parseInt(LJIJ);
        }
        c98593tv.setFollowStatus(parseInt);
        if (str != null) {
            c98593tv.setButtonType(str);
        }
        String str10 = "";
        Map<String, String> LLJLLIL = Z9N.LIZIZ.LLJLLIL("", this.LJLJJI);
        Map<String, String> extraMobParams = c98593tv.getExtraMobParams();
        if (extraMobParams != null) {
            extraMobParams.putAll(LLJLLIL);
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (user != null) {
            if (!o.LJ(str, "message") && !o.LJ(str2, "airplane_button") && C57107Mb9.LIZIZ(createIIMServicebyMonsterPlugin.getImSayHiService(), user.getUid(), 6)) {
                createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZIZ(user.getUid(), C113554cx.LJJLIIIIJ(new OSZ("enter_from", "others_homepage"), new OSZ("enter_method", "button")));
                if (C3U6.LIZ) {
                    if (TextUtils.isEmpty(user.getRemarkName())) {
                        remarkName = user.getNickname();
                    } else {
                        remarkName = user.getRemarkName();
                    }
                    InterfaceC57106Mb8 imSayHiService = createIIMServicebyMonsterPlugin.getImSayHiService();
                    String uid = user.getUid();
                    if (uid != null) {
                        str10 = uid;
                    }
                    OSZ[] oszArr = new OSZ[5];
                    oszArr[0] = new OSZ("enter_from", "others_homepage");
                    oszArr[1] = new OSZ("enter_method", "button");
                    oszArr[2] = new OSZ("message_type", "emoji");
                    oszArr[3] = new OSZ("message_from", "greeting_button");
                    if (LJIJ.length() == 0) {
                        LJIJ = "-1";
                    }
                    oszArr[4] = new OSZ("follow_status", LJIJ);
                    imSayHiService.LIZ(context, str10, remarkName, false, C113554cx.LJJLIIIIJ(oszArr), false, null);
                    createIIMServicebyMonsterPlugin.getImChatService().LJFF(c98593tv);
                    C2U8.LIZ(new C3U3(user.getUid()));
                    return;
                }
            }
            String uid2 = user.getUid();
            if (uid2 != null) {
                createIIMServicebyMonsterPlugin.getImSayHiService().LJIIJ(uid2);
            }
            str6 = user.getUid();
        } else {
            str6 = null;
        }
        C26175APb iv02 = iv0();
        if (iv02 != null) {
            str7 = iv02.LJLJI;
        } else {
            str7 = null;
        }
        EF7.LIZIZ();
        FMX.LJII("chat", 0L, str7, str6);
        if (user != null) {
            str8 = user.getUid();
        } else {
            str8 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            C26175APb iv03 = iv0();
            if (iv03 != null) {
                str9 = iv03.LJLJI;
            } else {
                str9 = null;
            }
            if (o.LJ(str9, "chat") && str8 != null && o.LJ(IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LIZ(str8), str3)) {
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI == null || MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(LJJIFFI)) {
                    return;
                }
                LJJIFFI.finish();
                return;
            }
        }
        createIIMServicebyMonsterPlugin.getImChatService().LJFF(c98593tv);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:(2:356|(47:358|359|360|(2:362|(13:364|365|366|347|(1:349)|(2:246|247)(1:346)|248|(1:342)(1:252)|(3:254|(1:256)(1:258)|257)|259|(16:286|(1:341)(1:292)|293|(1:340)|301|(1:339)|311|(1:313)(1:338)|314|(1:337)(1:318)|319|(1:336)(1:323)|324|(1:326)(1:335)|327|(3:330|(1:332)(1:334)|333))(1:262)|263|(7:(1:273)|274|(1:276)(1:285)|(1:284)|280|(1:282)|283)))|368|365|366|347|(0)|(0)(0)|248|(1:250)|342|(0)|259|(0)|286|(1:288)|341|293|(1:295)|340|301|(1:303)|339|311|(0)(0)|314|(1:316)|337|319|(1:321)|336|324|(0)(0)|327|(3:330|(0)(0)|333)|263|(1:265)|(2:271|273)|274|(0)(0)|(1:278)|284|280|(0)|283))|371|359|360|(0)|368|365|366|347|(0)|(0)(0)|248|(0)|342|(0)|259|(0)|286|(0)|341|293|(0)|340|301|(0)|339|311|(0)(0)|314|(0)|337|319|(0)|336|324|(0)(0)|327|(0)|263|(0)|(0)|274|(0)(0)|(0)|284|280|(0)|283) */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04b3, code lost:
    
        if (r16 == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0661, code lost:
    
        if (r16 != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x04d3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x04d8, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04af, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0501 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04c3 A[Catch: JSONException -> 0x04d3, TryCatch #1 {JSONException -> 0x04d3, blocks: (B:366:0x04b6, B:347:0x04bb, B:349:0x04c3, B:247:0x04cb, B:248:0x04cf), top: B:365:0x04b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x04a4 A[Catch: JSONException -> 0x04af, TryCatch #4 {JSONException -> 0x04af, blocks: (B:360:0x0498, B:362:0x04a4), top: B:359:0x0498 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rv0(com.ss.android.ugc.aweme.feed.model.Aweme r38, com.ss.android.ugc.aweme.profile.model.User r39, android.content.Context r40, boolean r41, java.lang.String r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 1704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.rv0(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.profile.model.User, android.content.Context, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
