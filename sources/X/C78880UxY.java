package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudienceBeautyAbGroupSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchExperimentSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNaviAvatarSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.OrderCenterEntry;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.PitayaConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS19S2100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UxY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78880UxY implements TAY, C9JN, InterfaceC39656FhM, CN3, KO5, JGU, InterfaceC47084Ids {
    public static final C78880UxY LJLIL = new C78880UxY();
    public static Gson LJLILLLLZI;

    public static final String LJJIJIIJI(int i) {
        return i != 0 ? i != 1 ? "" : "front" : "back";
    }

    @Override // X.KO5
    public boolean LIZ() {
        return false;
    }

    @Override // X.KO5
    public void LIZJ() {
    }

    @Override // X.KO5
    public void LJIIIIZZ(Object obj) {
    }

    @Override // X.InterfaceC47084Ids
    public /* synthetic */ void LJIIJ(long j, long j2) {
    }

    @Override // X.KO5
    public void LJIIL() {
    }

    @Override // X.InterfaceC39656FhM
    public boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return C78857UxB.LJJII(classLoader, file, file2, z);
    }

    @Override // X.JGU
    public void LJJJLZIJ() {
    }

    public boolean LJJLI(InterfaceC67012QRs interfaceC67012QRs, int i) {
        return interfaceC67012QRs != null;
    }

    @Override // X.JGU
    public void LJLLL(Aweme aweme) {
    }

    public static final int LJJIIZ() {
        if (!LiveBeautySwitchExperimentSetting.INSTANCE.hasNone() || InterfaceC30442Bx8.LLZZ.LIZJ().booleanValue()) {
            return -1;
        }
        return LJJIJIIJIL();
    }

    public static final int LJJIJIIJIL() {
        LiveBeautySwitchExperimentSetting liveBeautySwitchExperimentSetting = LiveBeautySwitchExperimentSetting.INSTANCE;
        if (liveBeautySwitchExperimentSetting.hasNone()) {
            return !liveBeautySwitchExperimentSetting.isUCAN() ? 1 : 0;
        }
        return 0;
    }

    public static Gson LJJIJLIJ() {
        if (LJLILLLLZI == null) {
            LJLILLLLZI = new Gson();
        }
        return LJLILLLLZI;
    }

    public static final C44541ow LJJLJLI() {
        C44541ow c44541ow = C44541ow.LJLJI;
        o.LJII(c44541ow, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        return c44541ow;
    }

    @Override // X.C9JN
    public OrderCenterEntry LJ() {
        return new OrderCenterEntry();
    }

    @Override // X.C9JN
    public int LJI() {
        int LIZ = C00F.LIZ(31744, 0, "ec_order_center_style", true);
        if (LIZ == 0) {
            IECommerceService.LIZ.getClass();
            return 0;
        }
        if (LIZ == 1 || LIZ == 2) {
            IECommerceService.LIZ.getClass();
            return 1;
        }
        if (LIZ == 3 || LIZ == 4) {
            IECommerceService.LIZ.getClass();
            return 2;
        }
        IECommerceService.LIZ.getClass();
        return 0;
    }

    @Override // X.C9JN
    public int LJIIJJI() {
        int LIZ = C00F.LIZ(31744, 0, "ec_order_center_style", true);
        if (LIZ == 1 || LIZ == 3) {
            IECommerceService.LIZ.getClass();
            return 0;
        }
        if (LIZ == 2 || LIZ == 4) {
            IECommerceService.LIZ.getClass();
            return 1;
        }
        return -1;
    }

    public static final java.util.Map LJJJI() {
        java.util.Map<String, PrivacySettingsRestrictionItem> account;
        SNL.LIZIZ().getClass();
        PrivacySettingsRestriction LIZLLL = C72039SPb.LIZLLL();
        java.util.Map map = null;
        if (LIZLLL != null && (account = LIZLLL.getAccount()) != null) {
            map = C113554cx.LJJLIL(account);
        }
        SNL.LIZIZ().getClass();
        PrivacySettingsRestrictionItem LJFF = C72041SPd.LJFF(0, "group_chat");
        if (LJFF != null && map != null) {
            map.put("group_chat", LJFF);
        }
        return map;
    }

    public static final void LJIILLIIL(java.util.Map map) {
        Long l;
        String str;
        String l2;
        Room LJJIL = C29306Beo.LJJIL(DataChannelGlobal.LJLJJI);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        String str2 = null;
        if (LIZIZ != null) {
            l = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId());
        } else {
            l = null;
        }
        OSZ[] oszArr = new OSZ[3];
        if (LJJIL != null) {
            str2 = LJJIL.getIdStr();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        oszArr[0] = new OSZ("room_id", str2);
        if (LJJIL == null || (str = Long.valueOf(LJJIL.getOwnerUserId()).toString()) == null) {
            str = "";
        }
        oszArr[1] = new OSZ("anchor_id", str);
        if (l != null && (l2 = l.toString()) != null) {
            str3 = l2;
        }
        oszArr[2] = new OSZ("guest_id", str3);
        map.putAll(C113554cx.LJJL(oszArr));
    }

    public static final void LJIIZILJ(java.util.Map map) {
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        C74824TYe c74824TYe = C74824TYe.LIZ;
        OSZ LJI = C74824TYe.LJI(LIZJ);
        map.putAll(C113554cx.LJJL(new OSZ("layout_setting", LJI.getFirst()), new OSZ("window_setting", LJI.getSecond())));
        C74824TYe.LIZJ(c74824TYe, map);
    }

    public static final C145995oB LJIJ(C145995oB c145995oB) {
        boolean LJFF = C78605Ut7.LJFF("android.permission.CAMERA");
        boolean LJFF2 = C78605Ut7.LJFF("android.permission.RECORD_AUDIO");
        boolean LIZLLL = C78605Ut7.LIZLLL();
        StringBuilder sb = new StringBuilder();
        if (LIZLLL) {
            sb.append("photo");
        }
        if (LJFF) {
            sb.append(",camera");
        }
        if (LJFF2) {
            sb.append(",microphone");
        }
        c145995oB.LIZLLL("permission_grant", sb.toString());
        return c145995oB;
    }

    public static final void LJIJI(C27943Axv c27943Axv) {
        o.LJIIIZ(c27943Axv, "<this>");
        String LIZ = C85990Xow.LIZ();
        Locale locale = Locale.ROOT;
        String lowerCase = LIZ.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c27943Axv.LIZLLL("priority_region", lowerCase);
        String str = C64707PaR.LIZJ;
        o.LJIIIIZZ(str, "getUserRegion()");
        String lowerCase2 = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c27943Axv.LIZLLL("store_region", lowerCase2);
    }

    public static final Aweme LJIL(C47322Ihi c47322Ihi) {
        Aweme aweme;
        o.LJIIIZ(c47322Ihi, "<this>");
        if ((c47322Ihi instanceof IFF) && (aweme = ((IFF) c47322Ihi).LJIIIIZZ) != null) {
            return aweme;
        }
        Object obj = c47322Ihi.LJI;
        if (obj != null && (obj instanceof Aweme)) {
            return (Aweme) obj;
        }
        return null;
    }

    public static final String LJJ(PushSettings pushSettings) {
        StringBuilder sb = new StringBuilder("{'comment':");
        sb.append(pushSettings.comment);
        sb.append(", 'duet':");
        sb.append(pushSettings.duet);
        sb.append(", 'stitch':");
        sb.append(pushSettings.stitch);
        sb.append(",'download_setting':");
        sb.append(pushSettings.downloadSetting);
        sb.append(", 'chat_set':");
        sb.append(pushSettings.chatSet);
        sb.append(", 'group_chat':");
        sb.append(pushSettings.groupChat);
        sb.append(", 'favorite_permission':");
        sb.append(pushSettings.whoCanSeeMyLikeList);
        sb.append(", 'comment_filter_status':");
        sb.append(pushSettings.commentFilterStatus);
        sb.append(", 'comment_offensive_filter':");
        sb.append(pushSettings.commentOffensiveFilter);
        sb.append(", 'commentFilterDislikeOffensive':");
        sb.append(pushSettings.commentFilterDislikeOffensive);
        sb.append(", 'commentFilterDislikeProfanity':");
        sb.append(pushSettings.commentFilterDislikeProfanity);
        sb.append(", 'commentFilterDislikeSpam':");
        sb.append(pushSettings.commentFilterDislikeSpam);
        sb.append(", 'isCommentFilterDislikeDisableAutomaticLevel':");
        sb.append(pushSettings.commentFilterDislikeDisableAutomaticLevel);
        sb.append(", 'author_review_all_comments':");
        sb.append(pushSettings.commentFilterAll);
        sb.append(", 'is_show_comment_settings':");
        sb.append(pushSettings.commentManagerVisible);
        sb.append(", 'sug_to_contacts':");
        sb.append(pushSettings.sugToContacts);
        sb.append(", 'sug_to_fb_friends':");
        sb.append(pushSettings.sugToFbFriends);
        sb.append(", 'sug_to_mutual_connections':");
        sb.append(pushSettings.sugToMutualConnections);
        sb.append(", 'sug_to_who_share_link':");
        sb.append(pushSettings.sugToWhoShareLink);
        sb.append(", 'sug_to_interested_users':");
        sb.append(pushSettings.sugToInterestedUsers);
        sb.append(", 'following_visibility':");
        return UPJ.LIZLLL(sb, pushSettings.followingVisibility, '}');
    }

    public static final boolean LJJI(C47663InD c47663InD) {
        o.LJIIIZ(c47663InD, "<this>");
        SmartSceneConfig LJJZZI = LJJZZI(c47663InD);
        if (LJJZZI != null) {
            return LJJZZI.getDisable();
        }
        java.util.Map map = (java.util.Map) c47663InD.LIZJ;
        if (map == null) {
            return false;
        }
        Object obj = map.get("disable");
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIFFI(C47663InD c47663InD) {
        SmartSceneConfig LJJZZI;
        boolean LIZ = J53.LIZ(c47663InD.LIZIZ);
        if (LIZ && (LJJZZI = LJJZZI(c47663InD)) != null && LJJZZI.getDisableMonitor()) {
            return false;
        }
        return LIZ;
    }

    public static final String LJJII(C47663InD c47663InD) {
        Object obj;
        SmartSceneConfig LJJZZI = LJJZZI(c47663InD);
        if (LJJZZI != null) {
            SmartSdkConfig sdkConfig = LJJZZI.getSdkConfig();
            if (sdkConfig != null && sdkConfig.getMlSdkConfig() != null) {
                return "mlsdk";
            }
            SmartSdkConfig sdkConfig2 = LJJZZI.getSdkConfig();
            if (sdkConfig2 != null && sdkConfig2.getPitayaConfig() != null) {
                return "pitaya";
            }
        }
        java.util.Map map = (java.util.Map) c47663InD.LIZJ;
        if (map != null && (obj = map.get("engineType")) != null) {
            return obj.toString();
        }
        return null;
    }

    public static final List LJJIII(Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!C39591gx.LIZIZ((LiveEffect) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List LJJIIJ(List list) {
        Integer num;
        Boolean bool;
        boolean z;
        AnchorLevelPermission anchorLevelPermission;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            LiveEffect liveEffect = (LiveEffect) next;
            if (C29306Beo.LJJI()) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                BHJ bhj = (BHJ) dataChannelGlobal.mv0(C29037BaT.class);
                if (bhj != null && bhj.LJLJI == 0 && (num = (Integer) dataChannelGlobal.mv0(C29062Bas.class)) != null && num.intValue() == 2 && liveEffect.reviewOriginalFrame) {
                }
                arrayList.add(next);
            } else {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null) {
                    RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                    if (roomAuthStatus != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.effects == 0 && room.cppVersion == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool) && liveEffect.reviewOriginalFrame) {
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final String LJJIIJZLJL(OSZ osz) {
        if (osz == null) {
            return null;
        }
        EffectCategoryResponse LJIIL = TMC.LJIIL((FilterBean) osz.getFirst(), ((WPD) osz.getSecond()).LJLILLLLZI.LJJJJIZL());
        if (LJIIL == null) {
            return null;
        }
        return LJIIL.getName();
    }

    public static final int LJJIJ(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int LJJIJIIJIL = LJJIJIIJIL();
        String str = ((LiveEffect) ListProtector.get(list, 0)).effectPanelKey;
        if (str != null) {
            java.util.Map<String, Integer> LIZJ = InterfaceC30442Bx8.LLZZJLIL.LIZJ();
            o.LJIIIIZZ(LIZJ, "BEAUTY_SELECTED_INDEX.value");
            for (Map.Entry<String, Integer> entry : LIZJ.entrySet()) {
                String key = entry.getKey();
                o.LJIIIIZZ(key, "it.key");
                if (ujb.o.LJJJLIIL(key, str, false)) {
                    Integer value = entry.getValue();
                    o.LJIIIIZZ(value, "it.value");
                    LJJIJIIJIL = value.intValue();
                }
            }
            if (LJJIJIIJIL >= list.size()) {
                LJJIJIIJIL = LJJIJIIJIL();
            }
        }
        Integer valueOf = Integer.valueOf(LJJIIZ());
        if (valueOf.intValue() >= 0) {
            return valueOf.intValue();
        }
        return LJJIJIIJIL;
    }

    public static final String LJJIJL(Throwable th) {
        int i;
        o.LJIIIZ(th, "<this>");
        String stackTraceString = android.util.Log.getStackTraceString(th);
        o.LJIIIIZZ(stackTraceString, "getStackTraceString(this)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error_code = ");
        if (th instanceof C38306F1q) {
            i = ((C38306F1q) th).getErrorCode();
        } else {
            i = -1;
        }
        LIZ.append(i);
        LIZ.append('\n');
        LIZ.append(th.getMessage());
        LIZ.append('\n');
        LIZ.append(stackTraceString);
        return X1D.LIZIZ(LIZ);
    }

    public static final String LJJIL(PushSettings pushSettings) {
        String str;
        BaseResponse.ServerTimeExtra serverTimeExtra = pushSettings.extra;
        if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
            return "";
        }
        return str;
    }

    public static final String LJJIZ(Throwable th) {
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str;
        o.LJIIIZ(th, "<this>");
        if (!(th instanceof C38333F2r)) {
            return "";
        }
        Object rawResponse = ((C38333F2r) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null || (serverTimeExtra = baseResponse.extra) == null || (str = serverTimeExtra.logid) == null) {
            return "";
        }
        return str;
    }

    public static final String LJJJ(NowsShootModel model) {
        o.LJIIIZ(model, "model");
        int i = model.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return "post";
                }
            } else {
                return "combine";
            }
        }
        return "photo";
    }

    public static final String LJJJJI(SuggestedReply suggestedReply) {
        o.LJIIIZ(suggestedReply, "<this>");
        if (((Boolean) SuggestedReplyExperiment.LJI.getValue()).booleanValue()) {
            if (SuggestedReplyExperiment.LIZIZ()) {
                return ujb.o.LJJJJLI(2, suggestedReply.getReplyEmoji());
            }
            return suggestedReply.getReplyEmoji();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(suggestedReply.getReplyEmoji());
        LIZ.append(' ');
        LIZ.append(suggestedReply.getReplyText());
        return X1D.LIZIZ(LIZ);
    }

    public static final HomeViewPagerAbility LJJJJIZL(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (HomeViewPagerAbility) C55096Ljo.LIZ(interfaceC55235Lm3, HomeViewPagerAbility.class, null);
    }

    public static final boolean LJJJJJL(LiveEffect liveEffect) {
        List<? extends LiveEffect> list;
        List<? extends LiveEffect> list2;
        if (!C77412UZs.LJIL(liveEffect) || liveEffect == null || (list = liveEffect.subStickers) == null || list.isEmpty()) {
            return false;
        }
        if (liveEffect != null && (list2 = liveEffect.subStickers) != null) {
            Iterator<? extends LiveEffect> it = list2.iterator();
            while (it.hasNext()) {
                if (!C1KJ.LIZ.LIZ(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LJJJJLI(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "<this>");
        Effect effect = liveEffect.getEffect();
        if (effect != null && effect.getEffectType() == 1 && !C79004UzY.LJJIFFI(liveEffect.subStickers)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJZI(Aweme aweme) {
        String str;
        java.util.Map<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = aweme.getSearchExtraParams()) != null) {
            str = searchExtraParams.get("inner_last_consumed");
        } else {
            str = null;
        }
        return o.LJ(str, "true");
    }

    public static final boolean LJJJLIIL(Aweme aweme) {
        if (C78996UzQ.LJJIJIL(aweme) && aweme.getAwemeRiskModel().isWarn() && TextUtils.isEmpty(aweme.getAwemeRiskModel().getUrl())) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJLL(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            if (MultiGuestNaviAvatarSwitcherSetting.INSTANCE.isEnable()) {
                List<String> list = liveEffect.types;
                if ((list != null && list.contains("TouchGes")) || liveEffect.notMultiGuestEffect || C79004UzY.LJJI(liveEffect)) {
                    return false;
                }
            } else {
                List<String> list2 = liveEffect.types;
                if ((list2 != null && list2.contains("TouchGes")) || LJJJZ(liveEffect) || liveEffect.notMultiGuestEffect || C79004UzY.LJJI(liveEffect)) {
                    return false;
                }
            }
        } else if (MultiGuestNaviAvatarSwitcherSetting.INSTANCE.isEnable()) {
            List<String> list3 = liveEffect.types;
            if ((list3 != null && list3.contains("TouchGes")) || C0TZ.LIZ(liveEffect.extra, "not_multiguest_effect", false) || C79004UzY.LJJI(liveEffect)) {
                return false;
            }
        } else {
            List<String> list4 = liveEffect.types;
            if ((list4 != null && list4.contains("TouchGes")) || LJJJZ(liveEffect) || C0TZ.LIZ(liveEffect.extra, "not_multiguest_effect", false) || C79004UzY.LJJI(liveEffect)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJJZ(LiveEffect liveEffect) {
        Boolean valueOf;
        if (liveEffect == null) {
            return false;
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
            if (stickerSDKExtra == null) {
                return false;
            }
            valueOf = Boolean.valueOf(stickerSDKExtra.isAvatar);
        } else {
            valueOf = Boolean.valueOf(C0TZ.LIZ(liveEffect.sdkExtra, "is_avatar", false));
        }
        if (valueOf == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    public static final boolean LJJL(LiveEffect liveEffect) {
        String name;
        String str;
        if (liveEffect == null || (name = liveEffect.getName()) == null || !name.equals(C15380j0.LJIILJJIL(R.string.ke3)) || liveEffect == null || (str = liveEffect.extra) == null || !str.equals("first_none_in_beauty")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIIJ(BaseStickerModel baseStickerModel) {
        o.LJIIIZ(baseStickerModel, "<this>");
        if (baseStickerModel.getStartTime() >= 0.0f && baseStickerModel.getEndTime() > 0.0f && baseStickerModel.getStartTime() < baseStickerModel.getEndTime()) {
            return true;
        }
        return false;
    }

    public static final void LJJLIIIJJIZ(Aweme aweme) {
        aweme.appendExtraParamUseInSearch("inner_last_consumed", "true");
    }

    public static final boolean LJJLIIIJLLLLLLLZ(Aweme aweme) {
        Video video;
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(aweme, "<this>");
        if (aweme.getAwemeType() == 150) {
            PublishPreviewInfo previewData = aweme.getPreviewData();
            if (previewData != null && previewData.getInPublishing() && (((photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() == 0) || (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) == null || photoModeImageInfo2.getImageList() == null)) {
                return true;
            }
            return false;
        }
        PublishPreviewInfo previewData2 = aweme.getPreviewData();
        if (previewData2 != null && previewData2.getInPublishing() && ((video = aweme.getVideo()) == null || video.getPlayAddr() == null)) {
            return true;
        }
        return false;
    }

    public static final String LJJLIIJ(C47663InD c47663InD) {
        Object obj;
        MlSdkConfig mlSdkConfig;
        SmartSceneConfig LJJZZI = LJJZZI(c47663InD);
        if (LJJZZI != null) {
            SmartSdkConfig sdkConfig = LJJZZI.getSdkConfig();
            if (sdkConfig == null || (mlSdkConfig = sdkConfig.getMlSdkConfig()) == null) {
                return null;
            }
            return mlSdkConfig.getPackageUrl();
        }
        java.util.Map map = (java.util.Map) c47663InD.LIZJ;
        if (map == null || (obj = map.get("packageUrl")) == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJLIL(java.lang.String r1) {
        /*
            java.lang.String r0 = "panel"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1560364328: goto L58;
                case -1231575857: goto L4c;
                case -181013528: goto L43;
                case 3497: goto L37;
                case 635173669: goto L2e;
                case 1271274793: goto L22;
                case 1544803905: goto L16;
                case 1866578827: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r1
        Ld:
            java.lang.String r0 = "infostickerv2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L16:
            java.lang.String r0 = "default"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1f
            goto Lc
        L1f:
            java.lang.String r1 = "effect_list"
            goto Lc
        L22:
            java.lang.String r0 = "editingeffect"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2b
            goto Lc
        L2b:
            java.lang.String r1 = "edit_effect_list"
            goto Lc
        L2e:
            java.lang.String r0 = "colorfilternew"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto Lc
        L37:
            java.lang.String r0 = "mv"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L40
            goto Lc
        L40:
            java.lang.String r1 = "mv_list"
            goto Lc
        L43:
            java.lang.String r0 = "emoji-android"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L4c:
            java.lang.String r0 = "infosticker"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L55:
            java.lang.String r1 = "info_effect_list"
            goto Lc
        L58:
            java.lang.String r0 = "colorfilterexperiment"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L61
            goto Lc
        L61:
            java.lang.String r1 = "color_filter_list"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78880UxY.LJJLIL(java.lang.String):java.lang.String");
    }

    public static final String LJJLL(C47663InD c47663InD) {
        Object obj;
        PitayaConfig pitayaConfig;
        SmartSceneConfig LJJZZI = LJJZZI(c47663InD);
        if (LJJZZI != null) {
            SmartSdkConfig sdkConfig = LJJZZI.getSdkConfig();
            if (sdkConfig == null || (pitayaConfig = sdkConfig.getPitayaConfig()) == null) {
                return null;
            }
            return pitayaConfig.getBusinessName();
        }
        java.util.Map map = (java.util.Map) c47663InD.LIZJ;
        if (map == null || (obj = map.get("pitayaBusinessName")) == null) {
            return null;
        }
        return obj.toString();
    }

    public static void LJJZ(InterfaceC88472Yns interfaceC88472Yns) {
        String jSONObject = ((C198517qh) interfaceC88472Yns.invoke(new C198517qh())).LJ().toString();
        o.LJIIIIZZ(jSONObject, "jsonBuilder.block().build().toString()");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("PRIVACY_SETTING_ALOG", jSONObject);
    }

    public static final SmartSceneConfig LJJZZI(C47663InD c47663InD) {
        o.LJIIIZ(c47663InD, "<this>");
        Object obj = c47663InD.LIZLLL;
        if (obj != null && (obj instanceof SmartSceneConfig)) {
            return (SmartSceneConfig) obj;
        }
        return null;
    }

    public static final String LJLI(Object obj) {
        String LJLLJ;
        o.LJIIIZ(obj, "obj");
        if (obj.getClass().isAnonymousClass()) {
            LJLLJ = obj.getClass().getName();
        } else {
            LJLLJ = C16880lQ.LJLLJ(obj.getClass());
        }
        StringBuilder LJFF = C72972SkS.LJFF(LJLLJ, '@');
        String LLLZ = C16880lQ.LLLZ("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        LJFF.append(LLLZ);
        return X1D.LIZIZ(LJFF);
    }

    public static final boolean LJLIIIL(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (!C77412UZs.LJIL(liveEffect) && !LJJJZ(liveEffect) && !C77412UZs.LJJI(liveEffect)) {
            return false;
        }
        return true;
    }

    public static final void LJLIIL(TextView textBold) {
        o.LJIIIZ(textBold, "$this$textBold");
        Typeface LIZ = C78882Uxa.LIZ(EnumC49617Jdd.MEDIUM.getFONT_NAME());
        if (LIZ != null) {
            textBold.setTypeface(LIZ);
        } else {
            textBold.setTypeface(textBold.getTypeface(), 1);
        }
    }

    public static String LJLILLLLZI(Object obj) {
        return GsonProtectorUtils.toJson(LJJIJLIJ(), obj);
    }

    public static final PortraitCardTemplate LJLJI(C79130V3u c79130V3u) {
        BaseUserComponent baseUserComponent;
        ImageComponent imageComponent;
        TextComponent textComponent;
        TextComponent textComponent2;
        ActionLinkComponent LIZ;
        PreviewHintComponent LIZ2;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        C79129V3t c79129V3t = c79130V3u.user_info;
        TextComponent textComponent3 = null;
        if (c79129V3t != null) {
            baseUserComponent = C79004UzY.LJJJJLI(c79129V3t);
        } else {
            baseUserComponent = null;
        }
        C79135V3z c79135V3z = c79130V3u.image;
        if (c79135V3z != null) {
            imageComponent = C79081V1x.LJJIZ(c79135V3z);
        } else {
            imageComponent = null;
        }
        RUF ruf = c79130V3u.title;
        if (ruf != null) {
            textComponent = C17N.LJJL(ruf);
        } else {
            textComponent = null;
        }
        RUF ruf2 = c79130V3u.sub_title;
        if (ruf2 != null) {
            textComponent2 = C17N.LJJL(ruf2);
        } else {
            textComponent2 = null;
        }
        RUF ruf3 = c79130V3u.hint_title;
        if (ruf3 != null) {
            textComponent3 = C17N.LJJL(ruf3);
        }
        C63714OzW c63714OzW = c79130V3u.link_info;
        if (c63714OzW != null) {
            LIZ = C62814Ol0.LJJIIZI(c63714OzW);
        } else {
            ActionLinkComponent.Companion.getClass();
            LIZ = C63715OzX.LIZ();
        }
        V4L v4l = c79130V3u.preview_hint;
        if (v4l != null) {
            LIZ2 = V2B.LJIIZILJ(v4l);
        } else {
            PreviewHintComponent.Companion.getClass();
            LIZ2 = C79087V2d.LIZ();
        }
        RU2 ru2 = c79130V3u.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = c79130V3u.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        return new PortraitCardTemplate(imageComponent, baseUserComponent, textComponent, textComponent2, textComponent3, LIZ, LIZ2, baseResponseComponent, baseRequestComponent);
    }

    @Override // X.TAY
    public void LIZIZ(C80674VlO c80674VlO) {
        if (c80674VlO != null) {
            c80674VlO.LIZ = "from_click";
        }
        c80674VlO.LIZ();
    }

    @Override // X.C9JN
    public void LJII(String str) {
        C71132Rvs.LIZ(str);
    }

    @Override // X.InterfaceC47084Ids
    public void LJIILJJIL(int i) {
        UC7.LIZLLL("mdl copy cache error ", i);
    }

    public static int LJIJJ(C78753UvV c78753UvV, boolean z) {
        int i;
        int i2;
        byte b;
        if (z) {
            i = c78753UvV.LIZJ;
            i2 = c78753UvV.LIZIZ;
        } else {
            i = c78753UvV.LIZIZ;
            i2 = c78753UvV.LIZJ;
        }
        byte[][] bArr = c78753UvV.LIZ;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                if (z) {
                    b = bArr[i4][i6];
                } else {
                    b = bArr[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 = AnonymousClass036.LIZIZ(i5, -5, 3, i3);
                    }
                    b2 = b;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 = AnonymousClass036.LIZIZ(i5, -5, 3, i3);
            }
        }
        return i3;
    }

    public static final HashMap LJIJJLI(ShortVideoContext shortVideoContext, OSZ... oszArr) {
        o.LJIIIZ(shortVideoContext, "<this>");
        OSZ[] oszArr2 = new OSZ[3];
        oszArr2[0] = new OSZ("enter_from", "video_shoot_page");
        oszArr2[1] = new OSZ("creation_id", shortVideoContext.LJI());
        String str = shortVideoContext.shootWay;
        if (str == null) {
            str = "";
        }
        oszArr2[2] = new OSZ("shoot_way", str);
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr2);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            LJJJLZIJ.put("draft_id", String.valueOf(i));
        }
        String newDraftId = shortVideoContext.newDraftId;
        o.LJIIIIZZ(newDraftId, "newDraftId");
        if (newDraftId.length() > 0) {
            LJJJLZIJ.put("new_draft_id", shortVideoContext.newDraftId);
        }
        for (OSZ osz : oszArr) {
            LJJJLZIJ.put(osz.getFirst(), osz.getSecond());
        }
        return LJJJLZIJ;
    }

    public static Object LJJIIZI(String str, Class cls) {
        return GsonProtectorUtils.fromJson(LJJIJLIJ(), str, cls);
    }

    public static final float LJJIJIL(LiveEffect liveEffect, InterfaceC31981Ni interfaceC31981Ni) {
        String str;
        int i;
        o.LJIIIZ(liveEffect, "<this>");
        if (interfaceC31981Ni == null) {
            interfaceC31981Ni = C12890ez.LIZ();
        }
        String resourceId = liveEffect.getResourceId();
        LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
        if (smallItemConfig == null || (str = smallItemConfig.tag) == null) {
            str = "";
        }
        Float LJFF = interfaceC31981Ni.LJFF(resourceId, str);
        if (LJFF == null) {
            LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
            if (smallItemConfig2 != null) {
                i = smallItemConfig2.LIZIZ;
            } else {
                i = 0;
            }
            LJFF = Float.valueOf(C12920f2.LIZLLL(liveEffect, i));
        }
        return LJFF.floatValue();
    }

    public static final String LJJJJ(C05490Jl c05490Jl, Context context) {
        o.LJIIIZ(c05490Jl, "<this>");
        long j = c05490Jl.LIZ;
        if (j == -1) {
            String string = context.getString(R.string.mjk);
            o.LJIIIIZZ(string, "context.getString(R.stri…ve_mute_duration_default)");
            return string;
        }
        if (j < 60) {
            Resources resources = context.getResources();
            int i = (int) c05490Jl.LIZ;
            String quantityString = resources.getQuantityString(R.plurals.nx, i, Integer.valueOf(i));
            o.LJIIIIZZ(quantityString, "context.resources.getQua…toInt(), seconds.toInt())");
            return quantityString;
        }
        int i2 = (int) (j / 60);
        String quantityString2 = context.getResources().getQuantityString(R.plurals.nw, i2, Integer.valueOf(i2));
        o.LJIIIIZZ(quantityString2, "{\n        val min = seco…Int(), min.toInt())\n    }");
        return quantityString2;
    }

    public static final boolean LJJJJL(LiveEffect liveEffect, LiveEffect liveEffect2) {
        String str;
        o.LJIIIZ(liveEffect, "<this>");
        List<? extends LiveEffect> list = liveEffect.subStickers;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<? extends LiveEffect> it = list.iterator();
        while (it.hasNext()) {
            String resourceId = it.next().getResourceId();
            if (liveEffect2 != null) {
                str = liveEffect2.getResourceId();
            } else {
                str = null;
            }
            if (o.LJ(resourceId, str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJJLL(String str, boolean z) {
        int value;
        if (z) {
            value = LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue();
        } else {
            value = LiveAudienceBeautyAbGroupSetting.INSTANCE.getValue();
        }
        try {
            new com.google.gson.o();
            m LJIIZILJ = com.google.gson.o.LIZ(str).LJIIZILJ();
            boolean LJJIJLIJ = LJIIZILJ.LJJIJLIJ("ab_group");
            if (!LJJIJLIJ) {
                return true;
            }
            try {
                if (value == LJIIZILJ.LJJIJ("ab_group").LJIILJJIL()) {
                    return true;
                }
            } catch (Throwable unused) {
                if (!LJJIJLIJ || 0 != 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused2) {
            return true;
        }
    }

    public static final boolean LJJJJZ(LiveEffect liveEffect, InterfaceC31981Ni interfaceC31981Ni) {
        InterfaceC31981Ni interfaceC31981Ni2;
        Boolean bool;
        o.LJIIIZ(liveEffect, "<this>");
        if (interfaceC31981Ni == null) {
            interfaceC31981Ni2 = C12890ez.LIZ();
        } else {
            interfaceC31981Ni2 = interfaceC31981Ni;
        }
        boolean z = true;
        if (LJJJJLI(liveEffect)) {
            List<? extends LiveEffect> list = liveEffect.subStickers;
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator<? extends LiveEffect> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        LiveEffect next = it.next();
                        if (!next.isNone() && !LJJJJZ(next, interfaceC31981Ni)) {
                            z = false;
                            break;
                        }
                    }
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            return C29306Beo.LJJIFFI(bool);
        }
        if (!liveEffect.isNone()) {
            if (liveEffect.composerConfigList.isEmpty()) {
                if (interfaceC31981Ni2.LJJIII(liveEffect.unzipPath, "") == -1) {
                    return true;
                }
            } else {
                List<LiveEffect.ComposerConfig> list2 = liveEffect.composerConfigList;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<LiveEffect.ComposerConfig> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (interfaceC31981Ni2.LJJIII(liveEffect.unzipPath, it2.next().tag) == -1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJJLIIIJILLIZJL(ActivityC45651qj activity, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (!activity.isFinishing() && !activity.isDestroyed() && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public static final void LJJLIIIJJI(C198517qh c198517qh, String str) {
        o.LJIIIZ(c198517qh, "<this>");
        c198517qh.LIZ.put("logId", str);
    }

    public static final void LJJLIIIJL(String str, java.util.Map map) {
        C145995oB c145995oB = new C145995oB();
        for (Map.Entry entry : map.entrySet()) {
            c145995oB.LIZLLL((String) entry.getKey(), (String) entry.getValue());
        }
        GXR.LIZ(str, c145995oB.LIZ);
    }

    public static final void LJJLIIIJLJLI(C198517qh c198517qh, String str) {
        o.LJIIIZ(c198517qh, "<this>");
        c198517qh.LIZ.put("msg", str);
    }

    public static final void LJL(BaseStickerModel baseStickerModel, float f) {
        o.LJIIIZ(baseStickerModel, "<this>");
        baseStickerModel.setStartTime(0.0f);
        baseStickerModel.setEndTime(f);
    }

    public static final Drawable LJLIL(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        o.LJIIIIZZ(mutate, "drawable.mutate()");
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    @Override // X.InterfaceC39656FhM
    public void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        C78857UxB.LJIILJJIL(classLoader, set, new C65314PkE());
    }

    @Override // X.C9JN
    public void LJIIIZ(String entryName, java.util.Map map) {
        o.LJIIIZ(entryName, "entryName");
        C76542zS.LIZJ("tiktokec_ecommerce_centre_entry_show", new AqS19S2100000_12(entryName, map, 3));
    }

    @Override // X.InterfaceC47084Ids
    public void LJIILIIL(boolean z, String str) {
        C1JX.LJIIIIZZ("mdl copy cache complete ", str);
    }

    public static final LiveEffect LJJJIL(LiveEffect liveEffect, InterfaceC31981Ni interfaceC31981Ni, String str) {
        LiveEffect liveEffect2;
        o.LJIIIZ(liveEffect, "<this>");
        if (!LJJJJLI(liveEffect)) {
            return null;
        }
        if (interfaceC31981Ni == null) {
            interfaceC31981Ni = C12890ez.LIZ();
        }
        List<LiveEffect> currentEffectList = interfaceC31981Ni.LIZ(str);
        List<? extends LiveEffect> list = liveEffect.subStickers;
        if (list != null) {
            for (LiveEffect liveEffect3 : list) {
                o.LJIIIIZZ(currentEffectList, "currentEffectList");
                Iterator<LiveEffect> it = currentEffectList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        liveEffect2 = it.next();
                        if (o.LJ(liveEffect2.getResourceId(), liveEffect3.getResourceId())) {
                            break;
                        }
                    } else {
                        liveEffect2 = null;
                        break;
                    }
                }
                LiveEffect liveEffect4 = liveEffect2;
                if (liveEffect4 != null) {
                    return liveEffect4;
                }
            }
        }
        return null;
    }

    public static final void LJJJJJ(TextView initFontByAttributeSet, AttributeSet attributeSet, boolean z) {
        int i;
        Typeface typeface;
        boolean z2;
        boolean z3;
        o.LJIIIZ(initFontByAttributeSet, "$this$initFontByAttributeSet");
        if (attributeSet != null) {
            if (z) {
                TypedArray obtainStyledAttributes = initFontByAttributeSet.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ww, R.attr.wx, R.attr.wy});
                o.LJIIIIZZ(obtainStyledAttributes, "textView.context.obtainS…R.styleable.AVFontConfig)");
                i = obtainStyledAttributes.getInt(0, LiveLayoutPreloadThreadPriority.DEFAULT);
                obtainStyledAttributes.recycle();
            } else {
                TypedArray obtainStyledAttributes2 = initFontByAttributeSet.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
                o.LJIIIIZZ(obtainStyledAttributes2, "textView.context.obtainS…styleable.ToolsStyleView)");
                i = obtainStyledAttributes2.getInt(7, LiveLayoutPreloadThreadPriority.DEFAULT);
                obtainStyledAttributes2.recycle();
            }
        } else {
            i = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        if (i != Integer.MIN_VALUE) {
            C78882Uxa c78882Uxa = C78882Uxa.LJ;
            c78882Uxa.getClass();
            InterfaceC173646rg interfaceC173646rg = (InterfaceC173646rg) C78882Uxa.LIZIZ.LIZ(c78882Uxa, C78882Uxa.LIZ[0]);
            if (interfaceC173646rg != null) {
                typeface = interfaceC173646rg.LIZ(i);
            }
            typeface = null;
        } else {
            C78882Uxa c78882Uxa2 = C78882Uxa.LJ;
            c78882Uxa2.getClass();
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) C78882Uxa.LIZJ.LIZ(c78882Uxa2, C78882Uxa.LIZ[1]);
            if (interfaceC65784Pro != null) {
                typeface = (Typeface) interfaceC65784Pro.invoke();
            }
            typeface = null;
        }
        if (attributeSet != null) {
            if (z) {
                TypedArray obtainStyledAttributes3 = initFontByAttributeSet.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ww, R.attr.wx, R.attr.wy});
                o.LJIIIIZZ(obtainStyledAttributes3, "textView.context.obtainS…R.styleable.AVFontConfig)");
                z2 = obtainStyledAttributes3.getBoolean(2, false);
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = initFontByAttributeSet.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ww, R.attr.wx, R.attr.wy});
                o.LJIIIIZZ(obtainStyledAttributes4, "textView.context.obtainS…R.styleable.AVFontConfig)");
                z3 = obtainStyledAttributes4.getBoolean(1, false);
                obtainStyledAttributes4.recycle();
            } else {
                TypedArray obtainStyledAttributes5 = initFontByAttributeSet.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
                o.LJIIIIZZ(obtainStyledAttributes5, "textView.context.obtainS…styleable.ToolsStyleView)");
                z2 = obtainStyledAttributes5.getBoolean(9, false);
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = initFontByAttributeSet.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
                o.LJIIIIZZ(obtainStyledAttributes6, "textView.context.obtainS…styleable.ToolsStyleView)");
                z3 = obtainStyledAttributes6.getBoolean(8, false);
                obtainStyledAttributes6.recycle();
            }
            if (typeface != null) {
                if (z2) {
                    initFontByAttributeSet.setIncludeFontPadding(true);
                }
            } else {
                if (z3) {
                    return;
                }
                initFontByAttributeSet.setIncludeFontPadding(true);
                return;
            }
        } else if (typeface == null) {
            return;
        }
        initFontByAttributeSet.setTypeface(typeface);
    }

    public static final C198517qh LJJLIIIJ(C198517qh c198517qh, String str, Object obj) {
        o.LJIIIZ(c198517qh, "<this>");
        if (obj == null) {
            return c198517qh;
        }
        if (obj instanceof Integer) {
            c198517qh.LIZ.put(str, obj);
        } else if (obj instanceof Float) {
            c198517qh.LIZ.put(str, obj);
        } else if (obj instanceof Double) {
            c198517qh.LIZ.put(str, obj);
        } else if (obj instanceof Boolean) {
            c198517qh.LIZ.put(str, obj);
        } else if (obj instanceof String) {
            c198517qh.LIZ.put(str, obj);
        } else if (obj instanceof Long) {
            c198517qh.LIZ.put(str, obj);
        } else {
            c198517qh.LIZ.put(str, obj.toString());
        }
        return c198517qh;
    }

    public static final GradientDrawable LJJLJ(Context context, AttributeSet attributeSet, boolean z) {
        boolean z2;
        float f;
        boolean z3;
        if (context == null) {
            return null;
        }
        int color = context.getResources().getColor(R.color.xx);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ToolsStyleView)");
            z2 = obtainStyledAttributes.getBoolean(1, false);
            f = obtainStyledAttributes.getDimension(16, 0.0f);
            z3 = obtainStyledAttributes.getBoolean(26, false);
            color = obtainStyledAttributes.getColor(0, color);
            z = obtainStyledAttributes.getBoolean(2, z);
            obtainStyledAttributes.recycle();
        } else {
            z2 = false;
            f = 0.0f;
            z3 = false;
        }
        if (!z) {
            return null;
        }
        TDY tdy = new TDY();
        tdy.LIZIZ(color);
        tdy.LJ(color, 0);
        if (z2) {
            tdy.LIZLLL(1);
        } else {
            tdy.LIZLLL(0);
            if (z3) {
                tdy.LJFF = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                tdy.LIZJ(f);
            }
        }
        return tdy.LIZ();
    }

    public static final void LJJZZIII(String str, List allEffectList, List collectionList) {
        List<String> children;
        String str2;
        String str3;
        o.LJIIIZ(allEffectList, "allEffectList");
        o.LJIIIZ(collectionList, "collectionList");
        if (collectionList.isEmpty() || allEffectList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator it = collectionList.iterator();
        while (it.hasNext()) {
            LiveEffect liveEffect = (LiveEffect) it.next();
            hashMap.put(String.valueOf(liveEffect.effectId), liveEffect);
        }
        Iterator it2 = allEffectList.iterator();
        while (it2.hasNext()) {
            LiveEffect liveEffect2 = (LiveEffect) it2.next();
            if (C77412UZs.LJIL(liveEffect2)) {
                ArrayList arrayList = new ArrayList();
                Effect effect = liveEffect2.getEffect();
                if (effect != null && (children = effect.getChildren()) != null) {
                    Iterator<String> it3 = children.iterator();
                    int i = 0;
                    while (it3.hasNext()) {
                        LiveEffect liveEffect3 = (LiveEffect) hashMap.get(it3.next());
                        if (liveEffect3 != null) {
                            liveEffect3.parentImpressionPos = liveEffect2.parentImpressionPos;
                            Effect effect2 = liveEffect2.getEffect();
                            String str4 = null;
                            if (effect2 != null) {
                                str2 = effect2.getResourceId();
                            } else {
                                str2 = null;
                            }
                            liveEffect3.parentResId = str2;
                            Effect effect3 = liveEffect2.getEffect();
                            if (effect3 != null) {
                                str3 = effect3.getEffectId();
                            } else {
                                str3 = null;
                            }
                            liveEffect3.parentEffectId = str3;
                            Effect effect4 = liveEffect2.getEffect();
                            if (effect4 != null) {
                                str4 = effect4.getName();
                            }
                            liveEffect3.parentResName = str4;
                            liveEffect3.impressionPos = Integer.valueOf(i);
                            liveEffect3.effectPanelKey = str;
                            i++;
                            arrayList.add(liveEffect3);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    liveEffect2.subStickers = arrayList;
                }
            }
        }
    }

    public static final boolean LJLJJI(LiveEffect liveEffect, InterfaceC31981Ni interfaceC31981Ni, String str) {
        InterfaceC31981Ni interfaceC31981Ni2;
        float LJJIJIL;
        if (liveEffect == null) {
            return false;
        }
        if (interfaceC31981Ni == null) {
            interfaceC31981Ni2 = C12890ez.LIZ();
        } else {
            interfaceC31981Ni2 = interfaceC31981Ni;
        }
        if (LJJJJLI(liveEffect)) {
            LiveEffect LJJJIL = LJJJIL(liveEffect, interfaceC31981Ni2, str);
            if (LJJJIL != null) {
                LJJIJIL = LJJIJIL(LJJJIL, interfaceC31981Ni);
            } else {
                LJJIJIL = 0.0f;
            }
        } else {
            LJJIJIL = LJJIJIL(liveEffect, interfaceC31981Ni2);
        }
        return !Float.valueOf(LJJIJIL).equals(Float.valueOf(0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // X.C9JN
    public void LJFF(Context context, String entryName, String str, java.util.Map map) {
        T t;
        o.LJIIIZ(entryName, "entryName");
        C76542zS.LIZJ("tiktokec_ecommerce_centre_entry_click", new AqS19S2100000_12(entryName, map, 2));
        C68322mC c68322mC = new C68322mC();
        ?? r13 = str;
        if (str == null) {
            try {
                SettingsManager.LIZLLL().getClass();
                String LJI = SettingsManager.LJI("order_center_schema", "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_tts_shop_center%2Fpages%2Fshop-center%2Ftemplate.js&hide_nav_bar=1&trans_status_bar=1&use_new_container=1&use_spark=1");
                o.LJIIIIZZ(LJI, "{\n            SettingsMa…gs::class.java)\n        }");
                r13 = LJI;
            } catch (Exception unused) {
                r13 = C52188Ke0.LIZ;
            }
        }
        c68322mC.element = r13;
        if (r13 == 0 || r13.length() == 0) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            String str2 = C52299Kfn.LIZ;
            Object LJIIIIZZ = LIZLLL.LJIIIIZZ("ecom_order_center_default_schema", String.class, str2);
            t = str2;
            if (LJIIIIZZ != null) {
                t = LJIIIIZZ;
            }
        } else {
            t = c68322mC.element;
        }
        c68322mC.element = t;
        if (e1.LIZ(31744, "ecom_order_center_first_screen_optimize_precise_setting", true, false)) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C64602gC(c68322mC, "personal_home_page", null), 3);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_click_time", System.currentTimeMillis());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C26867AgZ.LIZIZ(context, (String) c68322mC.element, C113554cx.LJJL(new OSZ("trackParams", jSONObject.toString()), new OSZ("previous_page", "personal_home_page"), new OSZ("entry", "advanced_interactions"), new OSZ("entry_name", entryName)), false).open();
    }
}
