package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.View;
import com.android.billingclient.api.Purchase;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.google.gson.e;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;
import com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.now.NowPostAttributes;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.placediscovery.api.NearbyPoiCategoryResponse;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Ux1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78847Ux1 implements InterfaceC48038ItG, InterfaceC58352MvE {
    public static final C78847Ux1 LJLIL = new C78847Ux1();
    public static Runnable LJLILLLLZI;
    public static Runnable LJLJI;
    public static Runnable LJLJJI;
    public static int LJLJJL;
    public static int LJLJJLL;

    public static final int LJIJI(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static boolean LJJIZ(int i) {
        return i >= 40000 && i < 50000;
    }

    public static final boolean LJIIZILJ() {
        Boolean LIZJ = InterfaceC30442Bx8.LJJLIIIIJ.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_BC_TOGGLE_DIALOG_BEFORE.value");
        if (!LIZJ.booleanValue()) {
            Boolean LIZJ2 = InterfaceC30442Bx8.LJJLIIIJ.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_GAME_BC_TOGGLE_DIALOG_BEFORE.value");
            if (!LIZJ2.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC58352MvE
    public java.util.Map LIZ() {
        return new HashMap();
    }

    public static final C35431aF LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new C35431aF(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    public static InterfaceC63146OqM LJIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI == null) {
            C63275OsR.LIZIZ().LJII(0, "compile_statement", null);
            return null;
        }
        try {
            InterfaceC63146OqM LJIILLIIL = LJI.LJIILLIIL(str);
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("compile_statement");
            return LJIILLIIL;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy compileStatement:");
            LIZ.append(str);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "compile_statement", e);
            return null;
        }
    }

    public static boolean LJIL(String str) {
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        boolean z = false;
        if (LJI == null) {
            C63275OsR.LIZIZ().LJII(0, "execSQL", null);
            return false;
        }
        try {
            LJI.LJJIJIIJI(str);
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("execSQL");
            z = true;
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy execSQL:");
            LIZ.append(str);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "execSQL", e);
            return z;
        }
    }

    public static final float LJJIFFI(int i) {
        return TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static String LJJIIJ(Purchase purchase) {
        if (purchase == null) {
            return "";
        }
        purchase.LIZIZ();
        if (((ArrayList) purchase.LIZIZ()).size() == 0) {
            return "";
        }
        return (String) ListProtector.get(purchase.LIZIZ(), 0);
    }

    public static final TaskTraceMetric LJJIIJZLJL(Bundle bundle) {
        String string = bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
        if (string != null) {
            return C44206HWo.LIZ.get(string);
        }
        return null;
    }

    public static final int LJJIJIIJI(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        NowPostInfo nowPostInfo = aweme.nowPostInfo;
        if (nowPostInfo != null) {
            return LJJIJIIJIL(nowPostInfo);
        }
        return 1;
    }

    public static final int LJJIJIIJIL(NowPostInfo nowPostInfo) {
        NowPostAttributes attributes = nowPostInfo.getAttributes();
        if (attributes != null && attributes.getNowPostCameraType() == 0) {
            return 1;
        }
        return 0;
    }

    public static final int LJJIJIL(C7ML c7ml) {
        o.LJIIIZ(c7ml, "<this>");
        NowPostInfo nowPostInfo = c7ml.getAweme().nowPostInfo;
        if (nowPostInfo != null) {
            return LJJIJIIJIL(nowPostInfo);
        }
        return 1;
    }

    public static final void LJJIJL(Intent initTraceMetric) {
        o.LJIIJ(initTraceMetric, "$this$initTraceMetric");
        String LIZ = C44206HWo.LIZ(initTraceMetric);
        if (LIZ == null) {
            LIZ = UUID.randomUUID().toString();
            initTraceMetric.putExtra("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", LIZ);
            o.LJFF(LIZ, "UUID.randomUUID().toStri…YCLE_KEY, this)\n        }");
        }
        LruCache<String, TaskTraceMetric> lruCache = C44206HWo.LIZ;
        if (lruCache.get(LIZ) == null) {
            lruCache.put(LIZ, new TaskTraceMetric());
        }
    }

    public static final void LJJIJLIJ(Bundle initTraceMetric) {
        o.LJIIJ(initTraceMetric, "$this$initTraceMetric");
        String LIZIZ = C44206HWo.LIZIZ(initTraceMetric);
        if (LIZIZ == null) {
            LIZIZ = UUID.randomUUID().toString();
            initTraceMetric.putString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", LIZIZ);
            o.LJFF(LIZIZ, "UUID.randomUUID().toStri…YCLE_KEY, this)\n        }");
        }
        LruCache<String, TaskTraceMetric> lruCache = C44206HWo.LIZ;
        if (lruCache.get(LIZIZ) == null) {
            lruCache.put(LIZIZ, new TaskTraceMetric());
        }
    }

    public static final boolean LJJJ(DraftFileRestoreException draftFileRestoreException) {
        String str;
        o.LJIIIZ(draftFileRestoreException, "<this>");
        if (draftFileRestoreException.getThrowable() instanceof C249299qP) {
            return true;
        }
        Throwable throwable = draftFileRestoreException.getThrowable();
        if (throwable == null || (str = throwable.getMessage()) == null) {
            str = "";
        }
        if (s.LJJJLZIJ(str, "disk is full", true) || s.LJJJLZIJ(str, "No space left on device", true) || s.LJJJLZIJ(str, "database or disk is full", true)) {
            return true;
        }
        return false;
    }

    public static final String LJJJI(EnterRoomConfig enterRoomConfig) {
        o.LJIIIZ(enterRoomConfig, "<this>");
        if (o.LJ(enterRoomConfig.mRoomsData.hasCommerceGoods, Boolean.TRUE)) {
            return "1";
        }
        CommerceStruct commerceStruct = enterRoomConfig.mRoomsData.commerceStruct;
        if (commerceStruct != null && commerceStruct.commercePermission == 1) {
            return "2";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final boolean LJJJIL(EnterRoomConfig enterRoomConfig) {
        o.LJIIIZ(enterRoomConfig, "<this>");
        if (o.LJ(enterRoomConfig.mRoomsData.hasCommerceGoods, Boolean.TRUE)) {
            return true;
        }
        CommerceStruct commerceStruct = enterRoomConfig.mRoomsData.commerceStruct;
        if (commerceStruct != null && commerceStruct.commercePermission == 1) {
            return true;
        }
        return false;
    }

    public static final int LJJJJ(Aweme aweme) {
        NowPostInfo nowPostInfo;
        NowPostAttributes attributes;
        if (aweme == null || (nowPostInfo = aweme.nowPostInfo) == null || (attributes = nowPostInfo.getAttributes()) == null || attributes.getCreationType() != 1) {
            return 0;
        }
        return 1;
    }

    public static final byte[] LJJJJJL(byte[] bArr) {
        C1OV algo = C1OW.LJIIJ;
        o.LJIIJ(algo, "algo");
        AbstractC09110Xj invoke = algo.LIZ.invoke();
        invoke.LJFF(bArr, bArr.length);
        return invoke.LJ();
    }

    public static final void LJJLIIIJ(C78856UxA c78856UxA) {
        View findViewById;
        View findViewById2;
        if (c78856UxA != null) {
            View view = c78856UxA.LJFF;
            if (view != null) {
                View findViewById3 = view.findViewById(R.id.kyz);
                if (findViewById3 != null) {
                    findViewById3.setAlpha(0.9f);
                }
                if (c78856UxA == null) {
                    return;
                }
            }
            View view2 = c78856UxA.LJFF;
            if (view2 != null && (findViewById2 = view2.findViewById(R.id.kym)) != null) {
                C29306Beo.LJJLJLI(findViewById2);
            }
            View view3 = c78856UxA.LJFF;
            if (view3 != null && (findViewById = view3.findViewById(R.id.kz4)) != null) {
                C29306Beo.LJI(findViewById);
            }
        }
    }

    public static final void LJJLIIIJILLIZJL(C78856UxA c78856UxA) {
        View findViewById;
        if (c78856UxA != null) {
            View view = c78856UxA.LJFF;
            if (view != null) {
                View findViewById2 = view.findViewById(R.id.kyz);
                if (findViewById2 != null) {
                    findViewById2.setAlpha(0.5f);
                }
                if (c78856UxA == null) {
                    return;
                }
            }
            View view2 = c78856UxA.LJFF;
            if (view2 != null && (findViewById = view2.findViewById(R.id.kym)) != null) {
                C29306Beo.LJI(findViewById);
            }
        }
    }

    public static void LJJLIIIJJI(String str) {
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy ");
            LIZ.append(str);
            LIZ.append(" startTransaction failed, db = null");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            C63275OsR.LIZIZ().LJII(0, "startTransaction", null);
            return;
        }
        if (LJI.LJJJ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("IMDBProxy ", str, " startTransaction, already inTransaction, current tid=");
            LIZIZ.append(C16880lQ.LLLLIIIILLL());
            C63322OtC.LJ(X1D.LIZIZ(LIZIZ), new RuntimeException());
            return;
        }
        try {
            if (C63308Osy.LJI().LIZLLL().LJJIJLIJ) {
                LJI.LJIL();
            } else {
                LJI.LJII();
            }
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("startTransaction");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("IMDBProxy ");
            LIZ2.append(str);
            LIZ2.append(" startTransaction successfully");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IMDBProxy ");
            LIZ3.append(str);
            LIZ3.append(" startTransaction failed");
            C63322OtC.LJ(X1D.LIZIZ(LIZ3), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "startTransaction", e);
        }
    }

    public static final TopTabAbility LJJLIIIJJIZ(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (TopTabAbility) C55096Ljo.LIZ(interfaceC55235Lm3, TopTabAbility.class, null);
    }

    public static final TopTabAbility LJJLIIIJL(InterfaceC55235Lm3 interfaceC55235Lm3) {
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        return (TopTabAbility) C55096Ljo.LIZ(interfaceC55235Lm3, TopTabAbility.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        EJ6 ej6;
        String str;
        C64797Pbt it = (C64797Pbt) obj;
        o.LJIIIZ(it, "it");
        e LIZ = JsonParseUtils.LIZ();
        LIZ.LIZJ(new CollectionTypeAdapterFactory());
        LIZ.LIZJ(new MusicTypeAdapterFactory());
        LIZ.LIZJ(new UserTypeAdapterFactory());
        LIZ.LIZIZ(new BackgroundVideoDeserializer(), BackgroundVideo.class);
        LIZ.LIZJ(new BaseResponseObjectTypeAdapterFactory());
        if (C52535Kjb.LIZ()) {
            LIZ.LIZJ(new AwemeCollectionTypeAdapterFactory());
        }
        AbstractC36908Ee8 abstractC36908Ee8 = (AbstractC36908Ee8) GsonProtectorUtils.fromJson(LIZ.LIZ(), (String) it.LIZIZ, SettingCombineModel.class);
        List<EJ6> list = it.LIZ.LIZLLL;
        o.LJIIIIZZ(list, "it.headers()");
        Iterator<EJ6> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                ej6 = it2.next();
                if (o.LJ(ej6.LIZ, "x-tt-logid")) {
                    break;
                }
            } else {
                ej6 = null;
                break;
            }
        }
        EJ6 ej62 = ej6;
        if (ej62 != null && (str = ej62.LIZIZ) != null) {
            LinkedHashMap LIZ2 = C0JU.LIZ("x-tt-logid", str);
            String str2 = it.LIZ.LIZ;
            o.LJIIIIZZ(str2, "it.raw().url");
            LIZ2.put("url", str2);
            ISettingRequestExtraInfo LIZJ = SettingRequestExtraInfoImpl.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZIZ(LIZ2);
            }
        }
        abstractC36908Ee8.checkValid();
        return abstractC36908Ee8;
    }

    public static final boolean LIZJ(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static final int LIZLLL(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    public static final boolean LJ(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public static final int LJII(int i, int[] iArr) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final int LJIIIIZZ(int i, int[] iArr) {
        int i2 = i * 5;
        return LJIJI(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void LJIIJJI(InterfaceC143655kP interfaceC143655kP, AudioRecorderParam audioEffectParam) {
        o.LJIIIZ(interfaceC143655kP, "<this>");
        o.LJIIIZ(audioEffectParam, "audioEffectParam");
        C5MG WS = interfaceC143655kP.WS();
        if (WS != null) {
            C166696gT.LIZ().getClass();
            WS.LIZ(audioEffectParam, (C43523H6h) C169416kr.LJ.getValue());
        }
    }

    public static final void LJIIL(SlimRoom slimRoom, EnterRoomConfig enterRoomConfig) {
        StreamUrlExtra.SrConfig srConfig;
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        streamData.isWithPush = true;
        streamData.streamRoomId = slimRoom.getId();
        String buildPullUrl = slimRoom.buildPullUrl();
        String sdkParams = slimRoom.getSdkParams();
        String multiStreamData = slimRoom.getMultiStreamData();
        String multiStreamDefaultQualitySdkKey = slimRoom.getMultiStreamDefaultQualitySdkKey();
        int ordinal = slimRoom.getStreamType().ordinal();
        StreamUrlExtra streamUrlExtraSafely = slimRoom.getStreamUrlExtraSafely();
        Long l = null;
        if (streamUrlExtraSafely != null) {
            srConfig = streamUrlExtraSafely.srConfig;
        } else {
            srConfig = null;
        }
        StreamUrl streamUrl = slimRoom.getStreamUrl();
        if (streamUrl != null) {
            l = Long.valueOf(streamUrl.streamDelayMs);
        }
        LJIILJJIL(enterRoomConfig, buildPullUrl, sdkParams, multiStreamData, multiStreamDefaultQualitySdkKey, ordinal, srConfig, l, slimRoom.getOptions());
    }

    public static final void LJIILIIL(SlimRoom slimRoom, EnterRoomConfig enterRoomConfig) {
        Long l;
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        streamData.isWithPush = true;
        streamData.streamRoomId = slimRoom.getId();
        String buildExtraSreamPullUrl = slimRoom.buildExtraSreamPullUrl();
        String extraSdkParams = slimRoom.getExtraSdkParams();
        String extraStreamData = slimRoom.getExtraStreamData();
        String extraStreamDefaultQualitySdkKey = slimRoom.getExtraStreamDefaultQualitySdkKey();
        int ordinal = slimRoom.getStreamType().ordinal();
        StreamUrlExtra.SrConfig srConfig = slimRoom.getExtraStreamUrlExtra().srConfig;
        StreamUrl streamUrl = slimRoom.multiStreamUrl;
        if (streamUrl != null) {
            l = Long.valueOf(streamUrl.streamDelayMs);
        } else {
            l = null;
        }
        LJIILJJIL(enterRoomConfig, buildExtraSreamPullUrl, extraSdkParams, extraStreamData, extraStreamDefaultQualitySdkKey, ordinal, srConfig, l, slimRoom.getOptions());
    }

    public static final void LJIILL(Room room, EnterRoomConfig enterRoomConfig) {
        Long l;
        o.LJIIIZ(enterRoomConfig, "<this>");
        o.LJIIIZ(room, "room");
        String buildPullUrl = room.buildPullUrl();
        String sdkParams = room.getSdkParams();
        String multiStreamData = room.getMultiStreamData();
        String multiStreamDefaultQualitySdkKey = room.getMultiStreamDefaultQualitySdkKey();
        int ordinal = room.getStreamType().ordinal();
        StreamUrlExtra.SrConfig streamSrConfig = room.getStreamSrConfig();
        StreamUrl streamUrl = room.getStreamUrl();
        if (streamUrl != null) {
            l = Long.valueOf(streamUrl.streamDelayMs);
        } else {
            l = null;
        }
        LJIILJJIL(enterRoomConfig, buildPullUrl, sdkParams, multiStreamData, multiStreamDefaultQualitySdkKey, ordinal, streamSrConfig, l, GsonProtectorUtils.toJson(C09650Zl.LIZIZ, room.getOptions()));
    }

    public static final void LJIILLIIL(Room room, EnterRoomConfig enterRoomConfig) {
        Long l;
        o.LJIIIZ(enterRoomConfig, "<this>");
        o.LJIIIZ(room, "room");
        String buildExtraSreamPullUrl = room.buildExtraSreamPullUrl();
        String extraSdkParams = room.getExtraSdkParams();
        String extraStreamData = room.getExtraStreamData();
        String extraStreamDefaultQualitySdkKey = room.getExtraStreamDefaultQualitySdkKey();
        int ordinal = room.getStreamType().ordinal();
        StreamUrlExtra.SrConfig srConfig = room.getExtraStreamUrlExtra().srConfig;
        StreamUrl streamUrl = room.multiStreamUrl;
        if (streamUrl != null) {
            l = Long.valueOf(streamUrl.streamDelayMs);
        } else {
            l = null;
        }
        LJIILJJIL(enterRoomConfig, buildExtraSreamPullUrl, extraSdkParams, extraStreamData, extraStreamDefaultQualitySdkKey, ordinal, srConfig, l, GsonProtectorUtils.toJson(C09650Zl.LIZIZ, room.getOptions()));
    }

    public static void LJIJJLI(String str, boolean z) {
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy ");
            LIZ.append(str);
            LIZ.append(" endTransaction failed, db = null");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            C63275OsR.LIZIZ().LJII(0, "endTransaction", null);
            return;
        }
        if (LJI.LJJJ()) {
            if (z) {
                try {
                    LJI.LJJIJL();
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("IMDBProxy ");
                    LIZ2.append(str);
                    LIZ2.append(" endTransaction failed");
                    C63322OtC.LJ(X1D.LIZIZ(LIZ2), e);
                    C63337OtR.LJFF(e);
                    C63275OsR.LIZIZ().LJII(1, "endTransaction", e);
                    return;
                }
            }
            LJI.LJJIJLIJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IMDBProxy ");
            LIZ3.append(str);
            LIZ3.append(" endTransaction, successful:");
            LIZ3.append(z);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("endTransaction");
            return;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("IMDBProxy ", str, " endTransaction, no transaction, current tid=");
        LIZIZ.append(C16880lQ.LLLLIIIILLL());
        C63322OtC.LJ(X1D.LIZIZ(LIZIZ), new RuntimeException());
    }

    public static JSONObject LJJ(Throwable th, JSONObject jSONObject) {
        if (th == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("err", th.getMessage());
            jSONObject.put("err_type", C16880lQ.LJLLJ(th.getClass()));
            Throwable cause = th.getCause();
            if (cause != null) {
                while (true) {
                    Throwable cause2 = cause.getCause();
                    if (cause2 == null) {
                        break;
                    }
                    cause = cause2;
                }
                jSONObject.put("err_inner", cause.getMessage());
                jSONObject.put("err_type_inner", C16880lQ.LJLLJ(cause.getClass()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static String LJJI(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.getDefault());
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(".");
            LIZ.append(System.currentTimeMillis());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append(".");
                LIZ2.append(UUID.randomUUID().toString().hashCode());
                return X1D.LIZIZ(LIZ2);
            }
            return LIZIZ;
        } catch (Exception unused) {
            StringBuilder LIZJ = b1.LIZJ(str, ".");
            LIZJ.append(System.currentTimeMillis());
            return X1D.LIZIZ(LIZJ);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:1|(1:127)(1:5)|6|(1:8)|9|(37:123|124|12|(1:14)|15|(1:122)|17|(1:121)(1:21)|22|(1:120)(1:26)|27|(1:119)(1:31)|32|(1:118)(1:38)|39|(1:41)|42|43|44|(1:46)|47|48|(1:50)|51|(1:55)|56|(1:58)|59|(1:61)|62|(1:114)(1:66)|67|(5:69|(1:71)|72|(1:74)(5:106|(1:108)|109|(1:111)|112)|75)(1:113)|76|(1:105)|80|(12:82|(1:84)|85|(1:87)|88|(1:91)|92|(1:94)|95|(1:97)|98|(2:100|101)(1:103))(1:104))|11|12|(0)|15|(0)|17|(1:19)|121|22|(1:24)|120|27|(1:29)|119|32|(1:34)|118|39|(0)|42|43|44|(0)|47|48|(0)|51|(2:53|55)|56|(0)|59|(0)|62|(1:64)|114|67|(0)(0)|76|(1:78)|105|80|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0230, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJII(android.net.Uri r11, com.bytedance.android.livesdkapi.session.EnterRoomConfig r12) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78847Ux1.LJJII(android.net.Uri, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public static final InterfaceC07790Sh LJJIIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns block) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(block, "block");
        return interfaceC07790Sh.LLLIIIL(new C514120b(block));
    }

    public static final void LJJIJ(DraftRestoreResult draftRestoreResult, ActivityC45651qj context) {
        DraftFileRestoreResult draftFileRestoreResult;
        Integer toastStringRes;
        o.LJIIIZ(draftRestoreResult, "<this>");
        o.LJIIIZ(context, "context");
        if (!draftRestoreResult.getCheckResult().isSuc() || draftRestoreResult.getCodeException() != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                C24540xm.LIZ(R.string.him, LJIJJ, 5004);
                return;
            }
            return;
        }
        DraftFileRestoreResult draftFileRestoreResult2 = (DraftFileRestoreResult) ORZ.LJLLLL(draftRestoreResult.getRestoreFileResults().getBlockCreativeList());
        if (draftFileRestoreResult2 != null) {
            Integer toastStringRes2 = draftFileRestoreResult2.getToastStringRes();
            if (toastStringRes2 != null) {
                int intValue = toastStringRes2.intValue();
                Activity LJIJJ2 = C45804HyK.LJIJJ(context);
                if (LJIJJ2 != null) {
                    C24540xm.LIZ(intValue, LJIJJ2, 5004);
                    return;
                }
                return;
            }
            return;
        }
        Iterator<DraftFileRestoreResult> it = draftRestoreResult.getRestoreFileResults().getNotBlockCreativeList().iterator();
        while (true) {
            if (it.hasNext()) {
                draftFileRestoreResult = it.next();
                if (draftFileRestoreResult.getFileType() != 4) {
                    break;
                }
            } else {
                draftFileRestoreResult = null;
                break;
            }
        }
        DraftFileRestoreResult draftFileRestoreResult3 = draftFileRestoreResult;
        if (draftFileRestoreResult3 != null && (toastStringRes = draftFileRestoreResult3.getToastStringRes()) != null) {
            int intValue2 = toastStringRes.intValue();
            C5S1 c5s1 = new C5S1(C60903NvH.LJ);
            C26045AKb c26045AKb = c5s1.LIZIZ;
            if (c26045AKb != null) {
                c26045AKb.LIZLLL(3000L);
            }
            c5s1.LIZJ(intValue2);
            c5s1.LJ();
        }
    }

    public static long LJJIL(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI == null) {
            C63275OsR.LIZIZ().LJII(0, "insert", null);
            return -1L;
        }
        try {
            long LJJJI = LJI.LJJJI(str, contentValues);
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("insert");
            return LJJJI;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy insert, table:");
            LIZ.append(str);
            LIZ.append(", nullColumnHack:");
            LIZ.append((String) null);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "insert", e);
            return -1L;
        }
    }

    public static final void LJJJJI(EnterRoomConfig enterRoomConfig, java.util.Map map) {
        o.LJIIIZ(enterRoomConfig, "<this>");
        HashMap hashMap = (HashMap) map;
        hashMap.put("enter_from_merge", enterRoomConfig.mRoomsData.enterFromMerge);
        hashMap.put("enter_method", enterRoomConfig.mRoomsData.enterMethod);
        hashMap.put("gift_id", String.valueOf(enterRoomConfig.mRoomsData.anchorGiftId));
        hashMap.put("gift_panel", String.valueOf(enterRoomConfig.mRoomsData.openGiftPanel));
        hashMap.put("enter_url_source", enterRoomConfig.mLogData.enterGiftPanelSource);
        hashMap.put("enter_square_source", enterRoomConfig.mLogData.enterLiveSquareSource);
        hashMap.put("open_url_link", enterRoomConfig.mRoomsData.openUrlLink);
        Integer num = enterRoomConfig.mLogData.isFirstRecharge;
        if (num != null) {
            hashMap.put("is_first_recharge", String.valueOf(num.intValue()));
        }
        Integer num2 = enterRoomConfig.mLogData.rechargePackage;
        if (num2 != null) {
            hashMap.put("recharge_package", String.valueOf(num2.intValue()));
        }
        String str = enterRoomConfig.mLogData.rechargeType;
        if (str != null) {
            hashMap.put("recharge_type", str);
        }
        Integer num3 = enterRoomConfig.mLogData.balanceLiveLine;
        if (num3 != null) {
            hashMap.put("balance_live_line", String.valueOf(num3.intValue()));
        }
        Integer num4 = enterRoomConfig.mLogData.balanceLivePosition;
        if (num4 != null) {
            hashMap.put("balance_live_position", String.valueOf(num4.intValue()));
        }
        Integer num5 = enterRoomConfig.mLogData.isConsumeNewUser;
        if (num5 != null) {
            hashMap.put("is_consume_new_user", String.valueOf(num5.intValue()));
        }
    }

    public static final void LJJJJIZL(android.net.Uri uri, EnterRoomConfig enterRoomConfig) {
        Integer LJJIL;
        o.LJIIIZ(uri, "uri");
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String queryParameter = UriProtector.getQueryParameter(uri, "enter_from_merge");
        String str = "webview";
        if (queryParameter == null) {
            queryParameter = "webview";
        }
        roomsData.enterFromMerge = queryParameter;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        String queryParameter2 = UriProtector.getQueryParameter(uri, "enter_method");
        if (queryParameter2 != null) {
            str = queryParameter2;
        }
        roomsData2.enterMethod = str;
        enterRoomConfig.mLogData.enterLiveSquareSource = UriProtector.getQueryParameter(uri, "enter_square_source");
        String queryParameter3 = UriProtector.getQueryParameter(uri, "gift_id");
        Long l = null;
        if (queryParameter3 != null) {
            l = C38350F3i.LJJIZ(queryParameter3);
        }
        if (l != null) {
            long longValue = l.longValue();
            String queryParameter4 = UriProtector.getQueryParameter(uri, "is_selected");
            if (queryParameter4 == null || (LJJIL = C38350F3i.LJJIL(queryParameter4)) == null || LJJIL.intValue() == 0) {
                enterRoomConfig.mRoomsData.anchorGiftId = longValue;
            }
            enterRoomConfig.mRoomsData.openGiftPanel = true;
            enterRoomConfig.mLogData.enterGiftPanelSource = UriProtector.getQueryParameter(uri, "enter_url_source");
        }
        String queryParameter5 = UriProtector.getQueryParameter(uri, "open_url_link");
        if (!TextUtils.isEmpty(queryParameter5)) {
            enterRoomConfig.mRoomsData.openUrlLink = queryParameter5;
        }
        if (UriProtector.getQueryParameter(uri, "business_extra") != null) {
            JSONObject jSONObject = new JSONObject(UriProtector.getQueryParameter(uri, "business_extra"));
            Integer valueOf = Integer.valueOf(jSONObject.optInt("is_first_recharge", -1));
            if (valueOf.intValue() > -1) {
                enterRoomConfig.mLogData.isFirstRecharge = Integer.valueOf(valueOf.intValue());
            }
            Integer valueOf2 = Integer.valueOf(jSONObject.optInt("recharge_package", -1));
            if (valueOf2.intValue() > -1) {
                enterRoomConfig.mLogData.rechargePackage = Integer.valueOf(valueOf2.intValue());
            }
            String optString = jSONObject.optString("recharge_type");
            if ((!TextUtils.isEmpty(optString)) && optString != null) {
                enterRoomConfig.mLogData.rechargeType = optString;
            }
            Integer valueOf3 = Integer.valueOf(jSONObject.optInt("balance_live_line", -1));
            if (valueOf3.intValue() > -1) {
                enterRoomConfig.mLogData.balanceLiveLine = Integer.valueOf(valueOf3.intValue());
            }
            Integer valueOf4 = Integer.valueOf(jSONObject.optInt("balance_live_position", -1));
            if (valueOf4.intValue() > -1) {
                enterRoomConfig.mLogData.balanceLivePosition = Integer.valueOf(valueOf4.intValue());
            }
            Integer valueOf5 = Integer.valueOf(jSONObject.optInt("is_consume_new_user", -1));
            if (valueOf5.intValue() > -1) {
                enterRoomConfig.mLogData.isConsumeNewUser = Integer.valueOf(valueOf5.intValue());
            }
        }
    }

    public static final void LJJJJJ(DataChannel dataChannel, String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_toggle_first_popup");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(str, "action_type");
        LIZ.LJIJJ(C22890v7.LIZ(C30439Bx5.LIZ(dataChannel), C30439Bx5.LIZIZ(dataChannel)), "anchor_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    public static final void LJJJJL(VideoPublishEditModel model, C145995oB c145995oB) {
        ?? arrayList;
        o.LJIIIZ(c145995oB, "<this>");
        o.LJIIIZ(model, "model");
        if (!H7R.LJJJJL(model)) {
            arrayList = C137045Zk.LIZLLL(model);
        } else {
            List<SingleImageData> imageList = model.getImageAlbumData().getImageList();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(imageList, 10));
            Iterator<SingleImageData> it = imageList.iterator();
            while (it.hasNext()) {
                List<StickerItemModel> stickers = it.next().getStickerInfo().getStickers();
                ArrayList arrayList3 = new ArrayList();
                for (StickerItemModel stickerItemModel : stickers) {
                    if (stickerItemModel.type == 2) {
                        arrayList3.add(stickerItemModel);
                    }
                }
                arrayList2.add(arrayList3);
            }
            List LJJLI = C32I.LJJLI(arrayList2);
            arrayList = new ArrayList(C32I.LJJL(LJJLI, 10));
            Iterator it2 = ((ArrayList) LJJLI).iterator();
            while (it2.hasNext()) {
                arrayList.add(GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), ((StickerItemModel) it2.next()).extra, TextStickerData.class));
            }
        }
        if (arrayList.isEmpty() || arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (TextStickerData textStickerData : arrayList) {
            if (!textStickerData.getInlineTextStyles().isEmpty()) {
                List<InlineRichTextStyleData> inlineTextStyles = textStickerData.getInlineTextStyles();
                if (i == 0) {
                    if (!(inlineTextStyles instanceof Collection) || !inlineTextStyles.isEmpty()) {
                        Iterator<InlineRichTextStyleData> it3 = inlineTextStyles.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().inlineStyle instanceof TypefaceStyle) {
                                i = 1;
                                break;
                            }
                        }
                    }
                    i = 0;
                }
                if (i2 == 0) {
                    if (!(inlineTextStyles instanceof Collection) || !inlineTextStyles.isEmpty()) {
                        Iterator<InlineRichTextStyleData> it4 = inlineTextStyles.iterator();
                        while (it4.hasNext()) {
                            if (it4.next().inlineStyle instanceof ForegroundColorStyle) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                    i2 = 0;
                }
            }
            if (i4 == 0 && textStickerData.isAdjustTextRollbar()) {
                i4 = 1;
            }
            if (i3 == 0 && textStickerData.isUseColorDropper()) {
                i3 = 1;
            }
        }
        c145995oB.LIZ(i ^ 1, "is_text_font_select_all");
        c145995oB.LIZ(i2 ^ 1, "is_text_color_select_all");
        c145995oB.LIZ(i3, "is_use_text_color_dropper");
        c145995oB.LIZ(i4, "is_adjust_text_roll_bar");
    }

    public static InterfaceC63132Oq8 LJJJLZIJ(String str, String[] strArr) {
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        if (LJI == null) {
            C63275OsR.LIZIZ().LJII(0, "rawQuery", null);
            return null;
        }
        try {
            interfaceC63132Oq8 = LJI.LJJJJJ(str, strArr);
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("rawQuery");
            return interfaceC63132Oq8;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy rawQuery:");
            LIZ.append(str);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "rawQuery", e);
            return interfaceC63132Oq8;
        }
    }

    public static long LJJJZ(String str, ContentValues contentValues) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI == null) {
            C63275OsR.LIZIZ().LJII(0, "replace", null);
            return -1L;
        }
        try {
            long LJJJJ = LJI.LJJJJ(str, contentValues);
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("replace");
            return LJJJJ;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy replace, table:");
            LIZ.append(str);
            LIZ.append(", nullColumnHack:");
            LIZ.append((String) null);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "replace", e);
            return -1L;
        }
    }

    public static final int LJI(ArrayList arrayList, int i, int i2) {
        int LJJLI = LJJLI(arrayList, i, i2);
        if (LJJLI >= 0) {
            return LJJLI;
        }
        return -(LJJLI + 1);
    }

    public static final void LJIIIZ(int i, int i2, int[] iArr) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24780yA.LJFF(z);
        iArr[(i * 5) + 3] = i2;
    }

    public static final void LJIIJ(int i, int i2, int[] iArr) {
        boolean z;
        if (i2 >= 0 && i2 < 67108863) {
            z = true;
        } else {
            z = false;
        }
        C24780yA.LJFF(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static boolean LJIJJ(String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI == null) {
            C63275OsR.LIZIZ().LJII(0, "delete", null);
            return false;
        }
        try {
            int LJJJJL = LJI.LJJJJL(str, str2, strArr);
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("delete");
            if (LJJJJL <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy delete, table:");
            LIZ.append(str);
            LIZ.append(", whereClause:");
            LIZ.append(str2);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "delete", e);
            return false;
        }
    }

    public static Object LJJIII(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && jSONObject.has(str)) {
            if (obj == null) {
                return jSONObject.optString(str, null);
            }
            if (obj.getClass() == String.class) {
                return jSONObject.optString(str, (String) obj);
            }
            if (obj.getClass() == Integer.class) {
                return Integer.valueOf(jSONObject.optInt(str, ((Integer) obj).intValue()));
            }
            if (obj.getClass() == Float.class) {
                return Float.valueOf(CastFloatProtector.parseFloat(jSONObject.optString(str)));
            }
            if (obj.getClass() == Long.class) {
                return Long.valueOf(jSONObject.optLong(str, ((Long) obj).longValue()));
            }
            if (obj.getClass() == Double.class) {
                return Double.valueOf(jSONObject.optDouble(str, ((Double) obj).doubleValue()));
            }
            if (obj.getClass() == Boolean.class) {
                return Boolean.valueOf(jSONObject.optBoolean(str, false));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unknow type: ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZ();
        }
        return obj;
    }

    public static void LJJJJLI(int i, int i2, Aweme aweme) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_id", aweme.getAid());
            jSONObject.put("error_type", String.valueOf(i));
            jSONObject.put("ad_id", aweme.getAwemeRawAd().getAdId());
            jSONObject.put("status", String.valueOf(i2));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJIIJJI("aweme_adx_video_error_log", i2, jSONObject);
    }

    public static void LJJJJLL(String str, String str2, boolean z) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("url", str);
        c198517qh.LIZ.put("errorDesc", str2);
        if (z) {
            C09900aA.LJIIJJI("aweme_open_schema_rate", 0, c198517qh.LJ());
        } else {
            C09900aA.LJIIJJI("aweme_open_schema_rate", 1, c198517qh.LJ());
        }
    }

    public static final void LJJJLL(Aweme aweme, String str, boolean z) {
        boolean z2;
        EnumC244709j0 enumC244709j0;
        int currentPosition;
        List<AwemeHybridLabelModel> list;
        List<Aweme> stories;
        Aweme aweme2;
        User user;
        List<Aweme> stories2;
        Aweme aweme3;
        UserStory userStory;
        UserStory userStory2;
        o.LJIIIZ(aweme, "<this>");
        if (z && (userStory = aweme.getUserStory()) != null && !userStory.getFakeAwemeShell() && (userStory2 = aweme.getUserStory()) != null && !userStory2.getFakeSelfStoryCollection()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (aweme.getAid() == null) {
            aweme.setAid("");
        }
        Aweme aweme4 = null;
        if (aweme.getAuthor() == null) {
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 != null && (stories2 = userStory3.getStories()) != null && (aweme3 = (Aweme) ORZ.LJLLLL(stories2)) != null) {
                user = aweme3.getAuthor();
            } else {
                user = null;
            }
            aweme.setAuthor(user);
        }
        User author = aweme.getAuthor();
        if (author != null) {
            UserStory userStory4 = aweme.getUserStory();
            if (userStory4 != null && userStory4.getAllViewed()) {
                enumC244709j0 = EnumC244709j0.ALL_VIEWED;
            } else {
                enumC244709j0 = EnumC244709j0.HAS_UNREAD;
            }
            author.setStoryStatus(enumC244709j0.getStatus());
        }
        if (aweme.getHybridLabels() == null) {
            UserStory userStory5 = aweme.getUserStory();
            if (userStory5 != null && (stories = userStory5.getStories()) != null && (aweme2 = (Aweme) ORZ.LJLLLL(stories)) != null) {
                list = aweme2.getHybridLabels();
            } else {
                list = null;
            }
            aweme.setHybridLabels(list);
        }
        UserStory userStory6 = aweme.getUserStory();
        if (userStory6 != null) {
            LJJJJZI(userStory6.getStories(), str, aweme.getAuthor(), null, null, null);
            Integer currentIndex = UserStoryKt.currentIndex(userStory6);
            if (currentIndex != null) {
                currentPosition = currentIndex.intValue();
            } else {
                currentPosition = (int) userStory6.getCurrentPosition();
            }
            Integer valueOf = Integer.valueOf(currentPosition);
            if (userStory6.getStories().size() > 0 && (aweme4 = UserStoryKt.currentStory(userStory6)) == null) {
                aweme4 = (Aweme) ListProtector.get(userStory6.getStories(), 0);
            }
            userStory6.setCurrentInfo(new UserStoryCurrentInfo(valueOf, aweme4, 0, 4, null));
            if (z2) {
                userStory6.setOriginTotalCount(userStory6.getTotalCount());
            }
        }
        if (str != null) {
            aweme.setRequestId(str);
        }
        aweme.setStoryPacked(true);
    }

    public static final Bitmap LJJL(int i, int i2, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static final int LJJLI(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C24400xY) ListProtector.get(arrayList, i4)).LIZ;
            if (i5 < 0) {
                i5 += i2;
            }
            int LJIIJJI = o.LJIIJJI(i5, i);
            if (LJIIJJI < 0) {
                i3 = i4 + 1;
            } else if (LJIIJJI > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static void LJJLIIIIJ(SmartImageView smartImageView, Context context, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("res://");
        LIZ.append(context.getPackageName());
        LIZ.append("/");
        LIZ.append(i);
        smartImageView.setImageURI(UriProtector.parse(X1D.LIZIZ(LIZ)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJJJZ(Context context, NearbyPoiCategoryResponse nearbyPoiCategoryResponse, PoiCategory poiCategory, java.util.Map map) {
        ArrayList arrayList;
        INearbyFeedService LJJI = NearbyFeedServiceImpl.LJJI();
        String tabRegionName = nearbyPoiCategoryResponse.getTabRegionName();
        String tabRegion = nearbyPoiCategoryResponse.getTabRegion();
        LocationRegion currentRegion = nearbyPoiCategoryResponse.getCurrentRegion();
        List<PoiCategory> poiCategoryList = nearbyPoiCategoryResponse.getPoiCategoryList();
        String str = null;
        if (poiCategoryList != null) {
            arrayList = new ArrayList(C32I.LJJL(poiCategoryList, 10));
            for (PoiCategory poiCategory2 : poiCategoryList) {
                arrayList.add(new com.ss.android.ugc.aweme.placediscovery.param.PoiCategory(poiCategory2.tabName, poiCategory2.tabImg, poiCategory2.tabColor, poiCategory2.tabSchema, poiCategory2.tabCode));
            }
        } else {
            arrayList = null;
        }
        MapBounds tabRegionMapWindow = nearbyPoiCategoryResponse.getTabRegionMapWindow();
        String selectTabCode = nearbyPoiCategoryResponse.getSelectTabCode();
        EnumC54647LcZ enumC54647LcZ = EnumC54647LcZ.SCENE_NEARBY_TAB;
        if (poiCategory != null) {
            str = poiCategory.tabSchema;
        }
        LJJI.LIZIZ(context, new PoiDiscoveryLandingPageParams(tabRegionName, tabRegion, currentRegion, arrayList, tabRegionMapWindow, selectTabCode, null, 0 == true ? 1 : 0, str, enumC54647LcZ, 192, 0 == true ? 1 : 0), new M26("homepage_nearby", "click_category_carousel", "homepage_nearby", Long.valueOf(System.currentTimeMillis()), map));
    }

    public static int LJJLIIIJLJLI(String str, ContentValues contentValues, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C63275OsR.LIZIZ().LJIIIIZZ();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI == null) {
            C63275OsR.LIZIZ().LJII(0, "update", null);
            return -1;
        }
        try {
            int LJJJIL = LJI.LJJJIL(str, contentValues, str2, strArr);
            C63275OsR.LIZIZ().getClass();
            C63275OsR.LJIIIZ("update");
            return LJJJIL;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMDBProxy update, table:");
            LIZ.append(str);
            LIZ.append(", whereClause:");
            LIZ.append(str2);
            C63322OtC.LJ(X1D.LIZIZ(LIZ), e);
            C63337OtR.LJFF(e);
            C63275OsR.LIZIZ().LJII(1, "update", e);
            return -1;
        }
    }

    public static final List LJJJJZI(List list, String str, User user, MutualStruct mutualStruct, AwemeRelationRecommendModel awemeRelationRecommendModel, List list2) {
        o.LJIIIZ(list, "<this>");
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme R1 = C88P.LIZIZ.R1((Aweme) obj);
                o.LJI(R1);
                ListProtector.set(list, i, R1);
                arrayList.add(ListProtector.get(list, i));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (user != null) {
                aweme.setAuthor(user);
            }
            if (str != null) {
                aweme.setRequestId(str);
            }
            aweme.setUserStory(null);
            if (mutualStruct != null) {
                aweme.setMutualRelation(mutualStruct);
            }
            if (awemeRelationRecommendModel != null) {
                aweme.setRelationRecommendInfo(awemeRelationRecommendModel);
            }
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) it2.next();
                    if (awemeHybridLabelModel.getLabelType() == HybridLabelTagType.FRIEND.getValue() || awemeHybridLabelModel.getLabelType() == HybridLabelTagType.FOLLOWING.getValue()) {
                        aweme.setHybridLabels(C47261Igj.LJJIJ(awemeHybridLabelModel));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void LJIILJJIL(EnterRoomConfig enterRoomConfig, String str, String str2, String str3, String str4, int i, StreamUrlExtra.SrConfig srConfig, Long l, String str5) {
        o.LJIIIZ(enterRoomConfig, "<this>");
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        streamData.pullStreamUrl = str;
        streamData.pullSDKParam = str2;
        streamData.pullStreamData = str3;
        streamData.pullDefaultResolution = str4;
        streamData.streamType = i;
        streamData.options = str5;
        if (srConfig != null) {
            streamData.extraStreamSREnable = srConfig.enabled;
            streamData.extraStreamSRAntiAlias = srConfig.antiAlias;
            streamData.extraStreamSRStrength = srConfig.strength;
        }
        if (l != null) {
            streamData.captionStreamDelayMs = l.longValue();
        }
    }

    public static InterfaceC07790Sh LJJIIZI(InterfaceC07790Sh graphicsLayer, float f, float f2, float f3, float f4, float f5, InterfaceC11790dD interfaceC11790dD, boolean z, int i) {
        float f6;
        long j;
        long j2;
        long j3;
        boolean z2 = z;
        float f7 = f2;
        float f8 = f;
        float f9 = f3;
        float f10 = f4;
        float f11 = f5;
        InterfaceC11790dD shape = interfaceC11790dD;
        if ((i & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i & 2) != 0) {
            f7 = 1.0f;
        }
        if ((i & 4) != 0) {
            f9 = 1.0f;
        }
        if ((i & 128) != 0) {
            f10 = 0.0f;
        }
        if ((i & 256) != 0) {
            f11 = 0.0f;
        }
        if ((i & 512) != 0) {
            f6 = 8.0f;
        } else {
            f6 = 0.0f;
        }
        if ((i & 1024) != 0) {
            j = C12000dY.LIZIZ;
        } else {
            j = 0;
        }
        if ((i & 2048) != 0) {
            shape = C11710d5.LIZ;
        }
        if ((i & 4096) != 0) {
            z2 = false;
        }
        if ((i & 16384) != 0) {
            j2 = C12010dZ.LIZ;
        } else {
            j2 = 0;
        }
        if ((i & 32768) != 0) {
            j3 = C12010dZ.LIZ;
        } else {
            j3 = 0;
        }
        o.LJIIIZ(graphicsLayer, "$this$graphicsLayer");
        o.LJIIIZ(shape, "shape");
        return graphicsLayer.LLLIIIL(new C514220c(f8, f7, f9, 0.0f, 0.0f, 0.0f, 0.0f, f10, f11, f6, j, shape, z2, j2, j3));
    }
}
