package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C16880lQ;
import X.C225318sp;
import X.C33710DKw;
import X.C47261Igj;
import X.C52931Kpz;
import X.C53295Kvr;
import X.C53578L1a;
import X.C55837Lvl;
import X.C55845Lvt;
import X.C76800UCe;
import X.C7HV;
import X.DR0;
import X.FWS;
import X.LGE;
import X.M5K;
import X.M5X;
import X.M62;
import X.OSZ;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class DetailAction extends AbstractC54341LUj<C76800UCe> {
    public static final C55845Lvt Companion = new C55845Lvt();
    public String innerRouterUri = "aweme://detail";
    public boolean shouldInsertFeed;

    @Override // X.AbstractC54341LUj
    public ArrayList<Integer> getFlags() {
        if (this.shouldInsertFeed) {
            return C47261Igj.LJII(268435456, 67108864);
        }
        return super.getFlags();
    }

    public final String getInnerRouterUri() {
        return this.innerRouterUri;
    }

    private final void toFollowingPage(HashMap<String, Object> hashMap) {
        hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        hashMap.put("tab", Integer.valueOf(LGE.FOLLOW.getValue()));
        hashMap.put("extra_push_flag", 1);
    }

    private final void toFriendPage(HashMap<String, Object> hashMap) {
        if (C53295Kvr.LIZIZ()) {
            hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "Following");
            hashMap.put("extra_push_flag", 1);
        }
        if (FriendsTabTopExperiment.LIZIZ()) {
            hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            hashMap.put("tab", Integer.valueOf(LGE.FRIENDS.getValue()));
            hashMap.put("extra_push_flag", 2);
        } else if (!DR0.LIZ()) {
            toFollowingPage(hashMap);
        } else {
            hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_TAB");
            hashMap.put("extra_push_flag", 2);
        }
    }

    public final void setInnerRouterUri(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.innerRouterUri = str;
    }

    public final void setPushLandingParams(HashMap<String, Object> resultParamsMap, int i) {
        o.LJIIIZ(resultParamsMap, "resultParamsMap");
        int LIZ = C52931Kpz.LIZ();
        if (LIZ != 1 && LIZ != 2) {
            if (LIZ != 3 && LIZ != 4) {
                return;
            }
            if (i == 1) {
                toFollowingPage(resultParamsMap);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                toFriendPage(resultParamsMap);
                return;
            }
        }
        if (i != 1 && i != 2) {
            return;
        }
        toFollowingPage(resultParamsMap);
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        String str;
        boolean z;
        boolean z2;
        Object obj;
        int i;
        int parseInt;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        Uri parse = UriProtector.parse(outerUrl);
        HashMap<String, Object> hashMap = new HashMap<>();
        Object obj2 = deepLinkData.LJLJJL.get("from_token");
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = deepLinkData.LJLJJL.get("is_from_notification");
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        String queryParameter = UriProtector.getQueryParameter(parse, "share_comment_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = UriProtector.getQueryParameter(parse, "commentId");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            str = queryParameter;
        } else {
            str = queryParameter2;
        }
        String host = parse.getHost();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        Object obj4 = deepLinkData.LJLJJL.get("gd_label");
        if (o.LJ(host, "story") || C55837Lvl.LJI(parse, lastPathSegment)) {
            handleStory(parse, booleanValue, lastPathSegment, hashMap, deepLinkData);
        } else if (!TextUtils.isEmpty(str) && o.LJ(str, queryParameter2)) {
            hashMap.put("enter_from", "push");
            hashMap.put("refer", "push");
            hashMap.put("id", lastPathSegment);
            hashMap.put("cid", str);
            M62.LIZIZ.LIZIZ(parse, "detail", booleanValue);
            if (o.LJ(UriProtector.getQueryParameter(parse, "auto_like_comment"), "1")) {
                hashMap.put("auto_like_comment", Boolean.TRUE);
            }
            if (o.LJ(UriProtector.getQueryParameter(parse, "show_reply_panel"), "1")) {
                hashMap.put("show_reply_panel", Boolean.TRUE);
            }
            hashMap.put("is_from_push", Integer.valueOf(booleanValue ? 1 : 0));
            Object queryParameter3 = UriProtector.getQueryParameter(parse, "push_id");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            hashMap.put("push_id", queryParameter3);
            Object queryParameter4 = UriProtector.getQueryParameter(parse, "gd_label");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            hashMap.put("gd_label", queryParameter4);
            Object queryParameter5 = UriProtector.getQueryParameter(parse, "push_label");
            if (queryParameter5 == null) {
                queryParameter5 = "";
            }
            hashMap.put("push_label", queryParameter5);
        } else {
            String queryParameter6 = UriProtector.getQueryParameter(parse, "label");
            if (TextUtils.isEmpty(queryParameter6)) {
                queryParameter6 = "web";
            }
            boolean LJIIIZ = M5K.LJIIIZ(parse);
            boolean LJII = C55837Lvl.LJII(parse, booleanValue, lastPathSegment, M5K.LJI(), LJIIIZ);
            this.shouldInsertFeed = LJII;
            if (LJII) {
                C55837Lvl.LIZLLL(lastPathSegment, hashMap);
                this.innerRouterUri = "aweme://main";
                C55837Lvl.LIZ(parse, hashMap, booleanValue);
            } else {
                String queryParameter7 = UriProtector.getQueryParameter(parse, "from");
                String str3 = queryParameter6;
                if (queryParameter6 == null) {
                    queryParameter6 = "";
                }
                hashMap.put("refer", queryParameter6);
                hashMap.put("id", lastPathSegment);
                String queryParameter8 = UriProtector.getQueryParameter(parse, "is_friend");
                if (!TextUtils.isEmpty(queryParameter8) && TextUtils.equals("1", queryParameter8)) {
                    z = true;
                } else {
                    z = false;
                }
                IExternalService LIZ = AVExternalServiceImpl.LIZ();
                if (booleanValue && ((Boolean) C33710DKw.LIZIZ.getValue()).booleanValue() && PushService.createIPushApibyMonsterPlugin(false).isVideoPush(parse.toString()) && !LIZ.configService().shortVideoConfig().isRecording() && !LIZ.publishService().inPublishPage() && !LIZ.publishService().isPublishing()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && booleanValue && !o.LJ("tuwen", host) && (FWS.LIZ().LIZ || deepLinkData.LJLIL.isTaskRoot() || z2)) {
                    this.innerRouterUri = "aweme://main";
                    hashMap.put("extra_from_deeplink", Boolean.TRUE);
                    if (z2) {
                        this.innerRouterUri = "aweme://main";
                        this.shouldInsertFeed = true;
                        C55837Lvl.LIZLLL(lastPathSegment, hashMap);
                        hashMap.put("extra_push_flag", 0);
                    }
                    String queryParameter9 = UriProtector.getQueryParameter(parse, "follow_status");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        if (queryParameter9 == null) {
                            parseInt = -1;
                        } else {
                            try {
                                parseInt = CastIntegerProtector.parseInt(queryParameter9);
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                        setPushLandingParams(hashMap, parseInt);
                    }
                    hashMap.put("id", lastPathSegment);
                    hashMap.put("extra_story_is_friend", 0);
                } else {
                    this.innerRouterUri = "aweme://detail";
                    if (TextUtils.isEmpty(str2)) {
                        str2 = str3;
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        str2 = "mp_page";
                    }
                    if (queryParameter7 == null) {
                        queryParameter7 = "";
                    }
                    hashMap.put("from_micro_app", queryParameter7);
                    hashMap.put("from_adsapp_activity", Boolean.TRUE);
                    if (str2 == null) {
                        obj = "";
                    } else {
                        obj = str2;
                    }
                    hashMap.put("refer", obj);
                    hashMap.put("id", lastPathSegment);
                    Object queryParameter10 = UriProtector.getQueryParameter(parse, "from_uid");
                    if (queryParameter10 == null) {
                        queryParameter10 = "";
                    }
                    hashMap.put("from_uid", queryParameter10);
                    if (TextUtils.equals(str2, "follow_card_push_publish")) {
                        hashMap.put("from_recommend_card", 1);
                    }
                    if (o.LJ(UriProtector.getQueryParameter(parse, "pop_type"), "share_panel")) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                    hashMap.put("task_type", Integer.valueOf(i));
                    C55837Lvl.LIZ(parse, hashMap, booleanValue);
                    if (z && FWS.LIZ().LIZ) {
                        hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
                        hashMap.put("extra_story_is_friend", 1);
                    }
                    if (C55837Lvl.LJFF(parse, "jump_to_search_detail", "1") && LJIIIZ) {
                        M5K.LIZIZ(parse, hashMap);
                    }
                }
                if (o.LJ(UriProtector.getQueryParameter(parse, "show_donation"), "1")) {
                    hashMap.put("show_donation", Boolean.TRUE);
                }
                if (!TextUtils.isEmpty(str) && o.LJ(str, queryParameter)) {
                    hashMap.put("cid", str);
                }
                M62.LIZIZ.LIZIZ(parse, "detail", booleanValue);
                Object obj5 = originalQueryMap.get("show_countdown");
                if (obj5 == null) {
                    obj5 = "";
                }
                hashMap.put("show_countdown", obj5);
                Object obj6 = originalQueryMap.get("enter_from");
                if (obj6 == null) {
                    obj6 = "";
                }
                hashMap.put("enter_from", obj6);
                Object obj7 = originalQueryMap.get("cd_enter_method");
                if (obj7 == null) {
                    obj7 = "";
                }
                hashMap.put("cd_enter_method", obj7);
                Object queryParameter11 = UriProtector.getQueryParameter(parse, "upvote_id");
                if (queryParameter11 != null) {
                    hashMap.put("upvote_id", queryParameter11);
                }
                String queryParameter12 = UriProtector.getQueryParameter(parse, "gd_label");
                JSONObject jSONObject = new JSONObject();
                if ("click_push_acq_video".equals(queryParameter12)) {
                    jSONObject.put("follow_recommend_params", C225318sp.LJI(parse));
                }
                Object jSONObject2 = jSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "extraParam.toString()");
                hashMap.put("extra_params", jSONObject2);
                hashMap.put("is_from_push", Integer.valueOf(booleanValue ? 1 : 0));
                Object queryParameter13 = UriProtector.getQueryParameter(parse, "push_id");
                if (queryParameter13 == null) {
                    queryParameter13 = "";
                }
                hashMap.put("push_id", queryParameter13);
                Object queryParameter14 = UriProtector.getQueryParameter(parse, "gd_label");
                if (queryParameter14 == null) {
                    queryParameter14 = "";
                }
                hashMap.put("gd_label", queryParameter14);
                Object queryParameter15 = UriProtector.getQueryParameter(parse, "push_label");
                if (queryParameter15 == null) {
                    queryParameter15 = "";
                }
                hashMap.put("push_label", queryParameter15);
            }
        }
        if ((o.LJ(obj4, "click_maf_upvote") || o.LJ(obj4, "click_friend_upvote")) && lastPathSegment.length() > 0) {
            String queryParameter16 = UriProtector.getQueryParameter(parse, "upvote_author_id");
            if (queryParameter16 == null) {
                queryParameter16 = "";
            }
            if (queryParameter16.length() > 0) {
                C7HV.LIZIZ.LJ(lastPathSegment, queryParameter16);
            }
            hashMap.put("gd_lable", obj4);
            hashMap.put("upvote_aweme_id", lastPathSegment);
        }
        return new OSZ<>(this.innerRouterUri, hashMap);
    }

    public final void handleStory(Uri uri, boolean z, String awemeId, HashMap<String, Object> resultQueryMap, M5X deepLinkData) {
        boolean z2;
        Object queryParameter;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(resultQueryMap, "resultQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        if (C55837Lvl.LJFF(uri, "utm_campaign", "client_share") || C55837Lvl.LJFF(uri, "utm_campaign", "client_scan_code")) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object obj = "";
        if (z2) {
            resultQueryMap.put("share_expose_sharer", Boolean.TRUE);
            Object LIZJ = C55837Lvl.LIZJ(uri);
            if (LIZJ == null) {
                LIZJ = "";
            }
            resultQueryMap.put("userid", LIZJ);
        }
        Object queryParameter2 = UriProtector.getQueryParameter(uri, "enter_from");
        if (z2) {
            queryParameter = "STORY_ENTRANCE_DEFAULT";
        } else {
            queryParameter = UriProtector.getQueryParameter(uri, "video_from");
        }
        Object queryParameter3 = UriProtector.getQueryParameter(uri, "story_type");
        if (o.LJ(queryParameter3, "1") && z2) {
            resultQueryMap.put("is_from_story_client_share", Boolean.TRUE);
        }
        String queryParameter4 = UriProtector.getQueryParameter(uri, "refer");
        if (z2) {
            queryParameter4 = "web";
        } else if (((queryParameter4 == null || queryParameter4.length() == 0) && (queryParameter4 = UriProtector.getQueryParameter(uri, "label")) == null) || queryParameter4.length() == 0) {
            queryParameter4 = "notification_page";
        }
        resultQueryMap.put("id", awemeId);
        if (queryParameter == null) {
            queryParameter = "";
        }
        resultQueryMap.put("video_from", queryParameter);
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        resultQueryMap.put("refer", queryParameter4);
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        resultQueryMap.put("enter_from", queryParameter2);
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        resultQueryMap.put("story type", queryParameter3);
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() && !z2) {
            Object queryParameter5 = UriProtector.getQueryParameter(uri, "push_id");
            if (queryParameter5 != null) {
                resultQueryMap.put("id", queryParameter5);
            }
            resultQueryMap.put("video_from", "STORY_ENTRANCE_DEFAULT");
        }
        String queryParameter6 = UriProtector.getQueryParameter(uri, "commentId");
        if (!TextUtils.isEmpty(queryParameter6)) {
            if (queryParameter6 != null) {
                obj = queryParameter6;
            }
            resultQueryMap.put("cid", obj);
        }
        if (!M5K.LIZJ()) {
            SmartRouter.buildRoute(deepLinkData.LJLIL, "//main").open();
        }
    }
}
