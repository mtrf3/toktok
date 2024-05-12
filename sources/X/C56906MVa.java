package X;

import Y.ARunnableS0S0104000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVa */
/* loaded from: classes10.dex */
public class C56906MVa extends MVV {
    public static final MW4 Companion = new MW4();
    public static final boolean isDebug = false;
    public final String andText;
    public final boolean isEnableNowAvatar;
    public boolean isRecordNotificationGuideInto;
    public Bundle mNotificationGuideBundle;
    public final int normalTextColor;
    public final int pressedTextColor;

    @Override // X.MVV
    public int getRootId() {
        return R.id.h5p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56906MVa(View itemView) {
        super(itemView);
        boolean LJI;
        o.LJIIIZ(itemView, "itemView");
        Boolean bool = (Boolean) M9M.LIZ().LIZ("ENABLE_NOW");
        if (bool != null) {
            LJI = bool.booleanValue();
        } else {
            LJI = C198507qg.LIZIZ.LJI();
        }
        this.isEnableNowAvatar = LJI;
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        this.normalTextColor = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
        Context context2 = this.mContext;
        o.LJIIIIZZ(context2, "context");
        this.pressedTextColor = AnonymousClass636.LJIIIIZZ(R.attr.gu, context2);
        String str = (String) M9M.LIZ().LIZ("AND_TEXT");
        this.andText = str == null ? C1DD.LIZLLL(R.string.ixc, "getApplicationContext().…fication_multi_users_and)") : str;
    }

    private final C57364MfI recommendParamsOfUser(User user) {
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null) {
            return null;
        }
        EnumC57366MfK enumC57366MfK = EnumC57366MfK.RELATION_LABEL;
        String recType = matchedFriendStruct.getRecType();
        C57364MfI.Companion.getClass();
        return new C57364MfI("notification_page", "notification_page", enumC57366MfK, recType, C200007t6.LIZ(user), user.getUid(), null, null, "", null, matchedFriendStruct.getRelationType(), matchedFriendStruct.getSocialInfo(), matchedFriendStruct, null, null, null, false, null, null, null, null, false, null, false, 16769024, null);
    }

    public HashMap<String, String> buildOpenAwemeLogExtra(HashMap<String, String> hashMap) {
        String str;
        String str2;
        String str3;
        MWH Kg0;
        MWH Kg02;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        BaseNotice baseNotice = this.mMTBaseNotice;
        String str4 = null;
        if (baseNotice != null) {
            str = baseNotice.getAccountType();
        } else {
            str = null;
        }
        hashMap.put("account_type", str);
        String str5 = AX5.LIZ;
        if (str5 != null) {
            hashMap.put("inbox_position", str5);
        }
        BaseNotice baseNotice2 = this.mMTBaseNotice;
        if (baseNotice2 == null || (str2 = Integer.valueOf(baseNotice2.type).toString()) == null) {
            str2 = "";
        }
        hashMap.put("notice_message_type", str2);
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null && (Kg02 = interfaceC56771MPv.Kg0()) != null) {
            str3 = Kg02.LIZ;
        } else {
            str3 = null;
        }
        hashMap.put("sort_option_name", str3);
        InterfaceC56771MPv interfaceC56771MPv2 = this.vm;
        if (interfaceC56771MPv2 != null && (Kg0 = interfaceC56771MPv2.Kg0()) != null) {
            str4 = Kg0.LIZIZ;
        }
        hashMap.put("notification_tab_name", str4);
        return hashMap;
    }

    public final int getNextFollowStatus(User user) {
        o.LJIIIZ(user, "user");
        int followStatus = user.getFollowStatus();
        if ((followStatus != 0 && followStatus != 4) || user.getFollowStatus() == 4) {
            return 0;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return 1;
        }
        return 4;
    }

    public final boolean isNewFollowerNotice(BaseNotice baseNotice) {
        if (baseNotice != null && baseNotice.followNotice != null) {
            return true;
        }
        return false;
    }

    public void setNotificationGuideBundle(int i) {
        this.mNotificationGuideBundle = null;
    }

    public void onNameClicked(View v, User user, int i) {
        o.LJIIIZ(v, "v");
        markHasRead(null);
    }

    public final void resetTitleMaxLine(TextView title, boolean z, boolean z2) {
        o.LJIIIZ(title, "title");
        if (z || z2) {
            title.setMaxLines(1);
        } else {
            title.setMaxLines(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HashMap buildOpenAwemeLogExtra$default(C56906MVa c56906MVa, HashMap hashMap, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                hashMap = null;
            }
            return c56906MVa.buildOpenAwemeLogExtra(hashMap);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildOpenAwemeLogExtra");
    }

    public final void ctrlFollowTextVisibilityAndMob$awemenotice_release(C57446Mgc textView, String accountType, List<? extends User> list, boolean z) {
        User user;
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(accountType, "accountType");
        C56923MVr.LIZ.LIZJ(textView, accountType, list, z, null);
        if (list != null) {
            user = (User) ORZ.LJLLLL(list);
        } else {
            user = null;
        }
        this.bindedUser = user;
    }

    public final void setFollowLabel(AnonymousClass976 anonymousClass976, String accountType, List<? extends User> list, View view) {
        OSZ<User, EnumC35456Dvo> LJI;
        o.LJIIIZ(accountType, "accountType");
        if (anonymousClass976 != null && view != null) {
            V1B.LJLLLLLL(view);
            if (C76800UCe.LIZ != null && list != null && (LJI = MSH.LJI(list, true)) != null) {
                V1B.LJLZ(view);
                View findViewById = view.findViewById(R.id.h5g);
                o.LJIIIIZZ(findViewById, "container.findViewById(R…fication_name_append_add)");
                anonymousClass976.setPrefixView((TuxTextView) findViewById);
                User first = LJI.getFirst();
                anonymousClass976.LJJI(first.getFollowStatus(), first.getFollowerStatus());
                if (LJI.getSecond() == EnumC35456Dvo.SEPARATE_MATCHED_FRIEND) {
                    ((View) view.getParent()).post(new ARunnableS0S0104000_3(view, C7MY.LIZIZ(4), C7MY.LIZIZ(2), C7MY.LIZIZ(4), C7MY.LIZIZ(8), 0));
                    C56760MPk.LJIIL("show", accountType, "inbox_interaction_message", first, null);
                }
            }
        }
        listenToUserChange(list);
    }

    public final void setRelationLabel(C188627ak mutualRelationView, List<? extends User> list, View view, View view2) {
        User LIZIZ;
        o.LJIIIZ(mutualRelationView, "mutualRelationView");
        if (list == null || (LIZIZ = MSH.LIZIZ(list)) == null) {
            V1B.LJLLLLLL(mutualRelationView);
        } else {
            SFS.LJJIL(mutualRelationView, LIZIZ.getMatchedFriendStruct(), 0, null);
        }
    }

    private final C116724i4 appendUserName(C116724i4 c116724i4, User user, BaseNotice baseNotice, String str, String str2) {
        String LIZIZ = MVR.LIZIZ(user, true);
        if (!TextUtils.isEmpty(LIZIZ)) {
            C56932MWa obtainNameSpan$default = obtainNameSpan$default(this, user, 0, baseNotice, false, null, str, 24, null);
            c116724i4.getClass();
            int length = c116724i4.LIZ.length();
            C116734i5 c116734i5 = c116724i4.LIZIZ;
            C116714i3 c116714i3 = c116724i4.LIZ;
            c116734i5.getClass();
            C116734i5.LIZ(c116714i3, LIZIZ);
            if (obtainNameSpan$default != null) {
                c116724i4.LIZ.setSpan(obtainNameSpan$default, length, c116724i4.LIZ.length(), 33);
            }
        }
        return c116724i4;
    }

    public final void enterForward(Context context, String forwardId, String enterFrom, String cid, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(forwardId, "forwardId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(cid, "cid");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://aweme/detail/");
        LIZ.append(forwardId);
        SmartRoute buildRoute = SmartRouter.buildRoute(LJIJJ, X1D.LIZIZ(LIZ));
        buildRoute.withParam("profile_enterprise_type", i);
        buildRoute.withParam("cid", cid);
        buildRoute.withParam("refer", enterFrom);
        buildRoute.withParam("video_from", "from_launch_forward");
        o.LJIIIIZZ(buildRoute, "buildRoute(context.activ…CH_FORWARD,\n            )");
        C57258Mda.LJ(buildRoute, buildOpenAwemeLogExtra$default(this, null, 1, null));
        buildRoute.open();
    }

    public final void openStory(String aid, String str, String str2, Integer num, Bundle bundle) {
        o.LJIIIZ(aid, "aid");
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://story/detail");
        buildRoute.withParam("video_from", "STORY_ENTRANCE_DEFAULT");
        buildRoute.withParam("enter_from", "notification_page");
        o.LJIIIIZZ(buildRoute, "buildRoute(getApplicatio…erFrom.NOTIFICATION_PAGE)");
        HashMap hashMap = null;
        C57258Mda.LJ(buildRoute, buildOpenAwemeLogExtra$default(this, null, 1, null));
        buildRoute.withParam("id", aid);
        buildRoute.withParam("cid", str);
        if (str2 != null) {
            hashMap = C113554cx.LJJJLZIJ(new OSZ("story_extra_author_uid", str2));
        }
        buildRoute.withParam("feed_param_extra", hashMap);
        buildRoute.withParam(bundle);
        if (num != null) {
            buildRoute.withParam("story_comment_user_follow_status", num.intValue());
        }
        buildRoute.open();
    }

    public final void setClickableNameText(TextView textView, User user, BaseNotice baseNotice, String str, String str2) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(user, "user");
        textView.setText(createNameSpan$default(this, C47261Igj.LJJIJ(user), 0, 1, baseNotice, true, str, str2, null, 128, null));
        AnonymousClass895 anonymousClass895 = AnonymousClass895.LIZ;
        anonymousClass895.getClass();
        textView.setMovementMethod(anonymousClass895);
        AJ9.LJI(this.mContext, new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null, 9, null), textView);
    }

    public final void setTemplateClickableNameText(TextView textView, List<? extends User> list, Integer num, BaseNotice baseNotice, String str) {
        int i;
        o.LJIIIZ(textView, "textView");
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        textView.setText(createNameSpan(list, 100, i, baseNotice, false, null, null, str));
        AnonymousClass895 anonymousClass895 = AnonymousClass895.LIZ;
        anonymousClass895.getClass();
        textView.setMovementMethod(anonymousClass895);
        if (list != null && list.size() == 1) {
            AJ9.LJI(this.mContext, new UserVerify(null, ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), null, 9, null), textView);
        }
    }

    private final C56932MWa obtainNameSpan(User user, int i, BaseNotice baseNotice, boolean z, String str, String str2) {
        return new C56932MWa(user, i, this.normalTextColor, this.pressedTextColor, new C56921MVp(this, i, baseNotice, str, z, str2));
    }

    public static /* synthetic */ void resetTitleMaxLine$default(C56906MVa c56906MVa, TextView textView, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = true;
            }
            c56906MVa.resetTitleMaxLine(textView, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetTitleMaxLine");
    }

    public final void enterProfileWithRecommendParams(User user, String enterFrom, String str, EnumC57366MfK enumC57366MfK, boolean z, String str2) {
        String str3;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJJIIZI(enterFrom);
        c57362MfG.LJJJ(str);
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
        c57362MfG.LJJLI = enumC57366MfK;
        c57362MfG.LJJJJI();
        c57362MfG.LJIILIIL();
        C7ZV c7zv = new C7ZV();
        c7zv.LJJLIIIJJIZ = user.getUid();
        c7zv.LIZLLL = enterFrom;
        C78866UxK.LJIIZILJ(c7zv, user);
        c7zv.LJLLJ = str;
        c7zv.LJLLL = str2;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (str3 = matchedFriendStruct.getRecType()) == null) {
            str3 = "";
        }
        c7zv.LJIJI = str3;
        c7zv.LJLLLL = Boolean.valueOf(z);
        c7zv.LJIILIIL();
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        Context LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null) {
            LJIJJ = EF7.LIZIZ();
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(LJIJJ, "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.withParam("sec_user_id", user.getSecUid());
        o.LJIIIIZZ(buildRoute, "buildRoute(\n            …TRA_SEC_UID, user.secUid)");
        C57258Mda.LJ(buildRoute, buildOpenAwemeLogExtra$default(this, null, 1, null));
        if (C78857UxB.LJJJIL(str)) {
            buildRoute.withParam("position", str);
        }
        C57364MfI recommendParamsOfUser = recommendParamsOfUser(user);
        if (recommendParamsOfUser != null) {
            buildRoute.withParam("recommend_enter_profile_params", recommendParamsOfUser);
        }
        buildRoute.open();
    }

    public final void openAweme(String aid, String str, Integer num, List<String> list, int i, Bundle bundle) {
        Integer num2;
        String str2;
        o.LJIIIZ(aid, "aid");
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            MS5.LJI(new AqS156S0200000_9(this.mMTBaseNotice, LIZ, 28));
        }
        BaseNotice baseNotice = this.mMTBaseNotice;
        if (baseNotice != null) {
            num2 = Integer.valueOf(baseNotice.type);
        } else {
            num2 = null;
        }
        BaseNotice baseNotice2 = this.mMTBaseNotice;
        if (baseNotice2 != null) {
            str2 = baseNotice2.nid;
        } else {
            str2 = null;
        }
        YAL.LIZ(num2, aid, str2);
        if (MSAdaptionService.LJIIL().LIZIZ(this.mContext)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "//duo");
            buildRoute.withParam("duo_type", "duo_detail");
            buildRoute.withParam("id", aid);
            buildRoute.withParam("refer", "notification_page");
            buildRoute.withParam("cid", str);
            buildRoute.withParam(bundle);
            buildRoute.open();
        } else {
            SmartRoute buildRoute2 = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://aweme/detail/");
            buildRoute2.withParam("id", aid);
            buildRoute2.withParam("refer", "notification_page");
            buildRoute2.withParam("cid", str);
            o.LJIIIIZZ(buildRoute2, "buildRoute(getApplicatio…Constants.EXTRA_CID, cid)");
            C57258Mda.LJ(buildRoute2, buildOpenAwemeLogExtra$default(this, null, 1, null));
            NoticeVideoManager.LIZJ(buildRoute2, "aweme://aweme/detail/");
            buildRoute2.withParam(bundle);
            if (num != null) {
                buildRoute2.withParam("story_comment_user_follow_status", num.intValue());
            }
            if (list != null && !list.isEmpty()) {
                buildRoute2.withParam("like_ids", C75792yF.LIZJ(list));
                buildRoute2.withParam("like_count", i);
            }
            buildRoute2.open();
        }
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        MVR.LIZLLL(context);
    }

    public static /* synthetic */ void setFollowLabel$default(C56906MVa c56906MVa, AnonymousClass976 anonymousClass976, String str, List list, View view, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                view = null;
            }
            c56906MVa.setFollowLabel(anonymousClass976, str, list, view);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFollowLabel");
    }

    public final void setClickableText(TextView textView, SpannableStringBuilder builder, int i, int i2, User user, BaseNotice baseNotice, String str) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(builder, "builder");
        o.LJIIIZ(user, "user");
        builder.setSpan(obtainNameSpan$default(this, user, 0, baseNotice, false, null, str, 24, null), i, i2, 33);
        builder.setSpan(new ForegroundColorSpan(this.normalTextColor), i, i2, 33);
        AnonymousClass895 anonymousClass895 = AnonymousClass895.LIZ;
        anonymousClass895.getClass();
        textView.setMovementMethod(anonymousClass895);
    }

    private final C116714i3 createNameSpan(List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2, String str3) {
        C56932MWa obtainNameSpan$default;
        C116724i4 c116724i4 = new C116724i4();
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                appendUserName(c116724i4, (User) ListProtector.get(list, 0), baseNotice, str, str2);
            } else if (list.size() == 2 && 1 <= i2 && i2 < 4) {
                appendUserName(c116724i4, (User) ListProtector.get(list, 0), baseNotice, str, str2);
                c116724i4.LIZIZ(" ");
                c116724i4.LIZIZ(this.andText);
                c116724i4.LIZIZ(" ");
                appendUserName(c116724i4, (User) ListProtector.get(list, 1), baseNotice, str, str2);
            } else if (list.size() == 3 || (i2 == 3 && list.size() > 3)) {
                appendUserName(c116724i4, (User) ListProtector.get(list, 0), baseNotice, str, str2);
                c116724i4.LIZIZ(", ");
                appendUserName(c116724i4, (User) ListProtector.get(list, 1), baseNotice, str, str2);
                c116724i4.LIZIZ(" ");
                c116724i4.LIZIZ(this.andText);
                c116724i4.LIZIZ(" ");
                appendUserName(c116724i4, (User) ListProtector.get(list, 2), baseNotice, str, str2);
            } else if (list.size() > 1) {
                String string = this.mContext.getString(R.string.ixb, Integer.valueOf(Math.max(i2, list.size()) - 2));
                o.LJIIIIZZ(string, "context.getString(R.stri….max(total, it.size) - 2)");
                if (i != 1) {
                    if (i != 2) {
                        obtainNameSpan$default = obtainNameSpan(null, 100, baseNotice, z, str3, str);
                    } else {
                        obtainNameSpan$default = obtainNameSpan$default(this, null, 2, baseNotice, false, null, str, 24, null);
                    }
                } else {
                    obtainNameSpan$default = obtainNameSpan$default(this, null, 1, baseNotice, z, null, str, 16, null);
                }
                appendUserName(c116724i4, (User) ListProtector.get(list, 0), baseNotice, str, str2);
                c116724i4.LIZIZ(", ");
                appendUserName(c116724i4, (User) ListProtector.get(list, 1), baseNotice, str, str2);
                c116724i4.LIZIZ(" ");
                c116724i4.LIZIZ(this.andText);
                c116724i4.LIZIZ(" ");
                c116724i4.LIZJ(string, obtainNameSpan$default);
            }
        }
        return c116724i4.LIZ;
    }

    public static /* synthetic */ void openStory$default(C56906MVa c56906MVa, String str, String str2, String str3, Integer num, Bundle bundle, int i, Object obj) {
        String str4 = str3;
        Integer num2 = num;
        if (obj == null) {
            Bundle bundle2 = null;
            if ((i & 4) != 0) {
                str4 = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            if ((i & 16) == 0) {
                bundle2 = bundle;
            }
            c56906MVa.openStory(str, str2, str4, num2, bundle2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openStory");
    }

    public static /* synthetic */ void setClickableNameText$default(C56906MVa c56906MVa, TextView textView, User user, BaseNotice baseNotice, String str, String str2, int i, Object obj) {
        BaseNotice baseNotice2 = baseNotice;
        String str3 = str;
        if (obj == null) {
            String str4 = null;
            if ((i & 4) != 0) {
                baseNotice2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) == 0) {
                str4 = str2;
            }
            c56906MVa.setClickableNameText(textView, user, baseNotice2, str3, str4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickableNameText");
    }

    public final void setClickableNameText(TextView textView, List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        o.LJIIIZ(textView, "textView");
        textView.setText(createNameSpan$default(this, list, i, i2, baseNotice, z, str, str2, null, 128, null));
        AnonymousClass895 anonymousClass895 = AnonymousClass895.LIZ;
        anonymousClass895.getClass();
        textView.setMovementMethod(anonymousClass895);
        if (list != null && list.size() == 1 && 1 != 0) {
            AJ9.LJI(this.mContext, new UserVerify(null, ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), null, 9, null), textView);
        }
    }

    public static /* synthetic */ void enterProfileWithRecommendParams$default(C56906MVa c56906MVa, User user, String str, String str2, EnumC57366MfK enumC57366MfK, boolean z, String str3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = "notification_page";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 16) != 0) {
                z = false;
            }
            if ((i & 32) != 0) {
                str3 = null;
            }
            c56906MVa.enterProfileWithRecommendParams(user, str, str2, enumC57366MfK, z, str3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterProfileWithRecommendParams");
    }

    public static /* synthetic */ C56932MWa obtainNameSpan$default(C56906MVa c56906MVa, User user, int i, BaseNotice baseNotice, boolean z, String str, String str2, int i2, Object obj) {
        String str3 = str;
        BaseNotice baseNotice2 = baseNotice;
        boolean z2 = z;
        if (obj == null) {
            String str4 = null;
            if ((i2 & 4) != 0) {
                baseNotice2 = null;
            }
            if ((i2 & 8) != 0) {
                z2 = true;
            }
            if ((i2 & 16) != 0) {
                str3 = null;
            }
            if ((i2 & 32) == 0) {
                str4 = str2;
            }
            return c56906MVa.obtainNameSpan(user, i, baseNotice2, z2, str3, str4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: obtainNameSpan");
    }

    public static /* synthetic */ void openAweme$default(C56906MVa c56906MVa, String str, String str2, Integer num, List list, int i, Bundle bundle, int i2, Object obj) {
        int i3 = i;
        Integer num2 = num;
        List list2 = list;
        if (obj == null) {
            Bundle bundle2 = null;
            if ((i2 & 4) != 0) {
                num2 = null;
            }
            if ((i2 & 8) != 0) {
                list2 = null;
            }
            if ((i2 & 16) != 0) {
                i3 = 0;
            }
            if ((i2 & 32) == 0) {
                bundle2 = bundle;
            }
            c56906MVa.openAweme(str, str2, num2, list2, i3, bundle2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAweme");
    }

    public static /* synthetic */ void setClickableText$default(C56906MVa c56906MVa, TextView textView, SpannableStringBuilder spannableStringBuilder, int i, int i2, User user, BaseNotice baseNotice, String str, int i3, Object obj) {
        BaseNotice baseNotice2 = baseNotice;
        if (obj == null) {
            String str2 = null;
            if ((i3 & 32) != 0) {
                baseNotice2 = null;
            }
            if ((i3 & 64) == 0) {
                str2 = str;
            }
            c56906MVa.setClickableText(textView, spannableStringBuilder, i, i2, user, baseNotice2, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickableText");
    }

    public static /* synthetic */ C116714i3 createNameSpan$default(C56906MVa c56906MVa, List list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2, String str3, int i3, Object obj) {
        boolean z2 = z;
        BaseNotice baseNotice2 = baseNotice;
        if (obj == null) {
            String str4 = null;
            if ((i3 & 8) != 0) {
                baseNotice2 = null;
            }
            if ((i3 & 16) != 0) {
                z2 = true;
            }
            if ((i3 & 128) == 0) {
                str4 = str3;
            }
            return c56906MVa.createNameSpan(list, i, i2, baseNotice2, z2, str, str2, str4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createNameSpan");
    }

    public static /* synthetic */ void setClickableNameText$default(C56906MVa c56906MVa, TextView textView, List list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2, int i3, Object obj) {
        boolean z2 = z;
        BaseNotice baseNotice2 = baseNotice;
        String str3 = str;
        if (obj == null) {
            String str4 = null;
            if ((i3 & 16) != 0) {
                baseNotice2 = null;
            }
            if ((i3 & 32) != 0) {
                z2 = true;
            }
            if ((i3 & 64) != 0) {
                str3 = null;
            }
            if ((i3 & 128) == 0) {
                str4 = str2;
            }
            c56906MVa.setClickableNameText(textView, list, i, i2, baseNotice2, z2, str3, str4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickableNameText");
    }
}
