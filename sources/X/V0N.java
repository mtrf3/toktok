package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.ShopEntranceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes14.dex */
public final class V0N implements InterfaceC48038ItG, C0K7, InterfaceC76768UAy, InterfaceC60688Nro, C0WM {
    public static String LJLIL = "";
    public static final V0N LJLILLLLZI = new V0N();
    public static final V0N LJLJI = new V0N();
    public static C39216FaG LJLJJI;

    public static List LJIIL(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 65536}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "4672254598711849098"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 65536);
    }

    public static long LJIIJ(C79035V0d c79035V0d) {
        return C79043V0l.LJIJ((int) C23520w8.LIZJ(r3), C23520w8.LIZIZ(C79043V0l.LJIILLIIL(0.5f, c79035V0d.LIZ, c79035V0d.LIZIZ)));
    }

    public static Object LJIILIIL(Class cls) {
        return C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(cls);
    }

    public static final String LJIILJJIL(Effect duration) {
        JSONObject jSONObject;
        o.LJIIIZ(duration, "$this$duration");
        String extra = duration.getExtra();
        if (extra != null) {
            try {
                jSONObject = new JSONObject(extra);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = null;
        }
        String str = "invalid_duration";
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "obj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                if (o.LJ(next, "default_duration")) {
                    str = JSONObjectProtectorUtils.getString(jSONObject, next);
                    o.LJIIIIZZ(str, "obj.getString(key)");
                }
            }
        }
        return str;
    }

    public static final String LJIILL(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "<this>");
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null) {
            return (String) ORZ.LJLLLL(urlList);
        }
        return null;
    }

    public static final List LJIIZILJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (it2.getEnable() && C78983UzD.LJJJJLI(it2) == EnumC123864ta.AUDIO && (!o.LJ(C77357UXp.LJIILIIL(it2), EnumC122254qz.ORIGIN.name())) && (!o.LJ(C77357UXp.LJIILIIL(it2), EnumC122254qz.TEXT_SPEAK.name())) && (!o.LJ(C77357UXp.LJIILIIL(it2), EnumC122254qz.REVERSE_AUDIO.name()))) {
                LIZ.add(next);
            }
        }
        return LIZ;
    }

    public static final String LJIJ(EnterRoomConfig enterRoomConfig) {
        String str = enterRoomConfig.mRoomsData.backRoomSource;
        if (str == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
            LIZ.append('-');
            LIZ.append(enterRoomConfig.mRoomsData.enterMethod);
            return X1D.LIZIZ(LIZ);
        }
        return str;
    }

    public static long LJIJI(NLEModel nLEModel) {
        if (nLEModel == null) {
            return 0L;
        }
        try {
            Field declaredField = NLEModel.class.getDeclaredField("swigCPtr");
            if (declaredField == null) {
                return 0L;
            }
            declaredField.setAccessible(true);
            return declaredField.getLong(nLEModel);
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
            return 0L;
        }
    }

    public static NLEModel LJIL(long j) {
        try {
            Constructor declaredConstructor = NLEModel.class.getDeclaredConstructor(Long.TYPE, Boolean.TYPE);
            declaredConstructor.setAccessible(true);
            return (NLEModel) declaredConstructor.newInstance(Long.valueOf(j), Boolean.TRUE);
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        } catch (InstantiationException e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C16880lQ.LLLLIIL(e3);
            return null;
        } catch (InvocationTargetException e4) {
            C16880lQ.LLLLIIL(e4);
            return null;
        }
    }

    public static final String LJJ(C31526CYw rankTypeAll) {
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        if (rankTypeAll.LIZ == EnumC31514CYk.GAME_RANK && !o.LJ(rankTypeAll.LIZIZ, rankTypeAll.LIZLLL)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sub_");
            LIZ.append(rankTypeAll.LIZLLL.rankName);
            return X1D.LIZIZ(LIZ);
        }
        return rankTypeAll.LIZIZ.rankName;
    }

    public static final boolean LJJI(Effect isExportableGreenScreen) {
        o.LJIIIZ(isExportableGreenScreen, "$this$isExportableGreenScreen");
        if (isExportableGreenScreen.getSource() == 101 || !s.LJJJLZIJ(isExportableGreenScreen.getSdk_extra(), "exportableGreenScreen", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIFFI(Effect isMobileEffect) {
        o.LJIIIZ(isMobileEffect, "$this$isMobileEffect");
        if (isMobileEffect.getSource() == 101) {
            return true;
        }
        return false;
    }

    public static boolean LJJII(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(Aweme aweme) {
        InteractPermission interactPermission;
        List<UpvoteStruct> upvotes;
        boolean z = false;
        if (aweme.getAid() == null || (interactPermission = aweme.getInteractPermission()) == null || interactPermission.getUpvote() != 0) {
            return false;
        }
        C7HV c7hv = C7HV.LIZIZ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        UpvoteList LJIIIZ = c7hv.LJIIIZ(aid);
        if (LJIIIZ == null || (upvotes = LJIIIZ.getUpvotes()) == null || upvotes.isEmpty()) {
            z = true;
        }
        return !z;
    }

    public static final boolean LJJIIJ(Effect isTemplateEffect) {
        o.LJIIIZ(isTemplateEffect, "$this$isTemplateEffect");
        if (isTemplateEffect.getSource() == 101 || !V3N.LJIJ(isTemplateEffect.getSdk_extra(), "canEdit", false)) {
            return false;
        }
        return true;
    }

    public static final V0P LJJIIZI(String aid) {
        boolean z;
        User user;
        User user2;
        o.LJIIIZ(aid, "aid");
        UpvoteList LJIIIZ = C7HV.LIZIZ.LJIIIZ(aid);
        if (LJIIIZ != null) {
            boolean z2 = false;
            boolean z3 = false;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (UpvoteStruct upvoteStruct : LJIIIZ.getUpvotes()) {
                String text = upvoteStruct.getText();
                if (text != null && text.length() != 0) {
                    z3 = true;
                }
                if (AV1.LJIJ(upvoteStruct.getUser())) {
                    z2 = true;
                } else {
                    User user3 = upvoteStruct.getUser();
                    if (user3 != null && user3.getFollowStatus() == 2) {
                        i = 1;
                    } else {
                        User user4 = upvoteStruct.getUser();
                        if (user4 != null && user4.getFollowStatus() == 1) {
                            i2 = 1;
                        } else {
                            User user5 = upvoteStruct.getUser();
                            if (user5 != null && user5.getFollowStatus() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (user2 = upvoteStruct.getUser()) != null && user2.getAccurateRecType() != null) {
                                i3 = 1;
                            } else {
                                User user6 = upvoteStruct.getUser();
                                if (user6 != null && user6.getFollowStatus() == 0 && ((user = upvoteStruct.getUser()) == null || user.getAccurateRecType() == null)) {
                                    i4 = 1;
                                }
                            }
                        }
                    }
                }
            }
            return new V0P(true ^ LJIIIZ.getUpvotes().isEmpty(), z2, z3, (int) LJIIIZ.getTotal(), i, i2, i3, i4);
        }
        return new V0P(false, false, false, 0, 0, 0, 0, 0);
    }

    public static final void LJJIJ(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
        C44432HcC.LJLIL = false;
    }

    public static final String LJJIJIIJI(User user) {
        String queryParameter;
        try {
            android.net.Uri parse = UriProtector.parse(LJJIJIIJIL(user));
            o.LJIIIIZZ(parse, "Uri.parse(this)");
            queryParameter = UriProtector.getQueryParameter(parse, "sellerId");
        } catch (Exception unused) {
        }
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static final String LJJIJIIJIL(User user) {
        String schema;
        o.LJIIIZ(user, "<this>");
        ShopEntranceInfo shopEntrance = user.getShopEntrance();
        if (shopEntrance == null || shopEntrance.getShopType() != ShopEntranceInfo.ShopTypeEnum.SHOP || (schema = shopEntrance.getSchema()) == null) {
            return "";
        }
        return schema;
    }

    public static final String LJJIJIL(User user) {
        String schema;
        o.LJIIIZ(user, "<this>");
        ShopEntranceInfo shopEntrance = user.getShopEntrance();
        if (shopEntrance == null || shopEntrance.getShopType() != ShopEntranceInfo.ShopTypeEnum.SHOWCASE || (schema = shopEntrance.getSchema()) == null) {
            return "";
        }
        return schema;
    }

    public static final String LJJIJL(Throwable th) {
        o.LJIIIZ(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        o.LJIIIIZZ(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    public static void LJJIL(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw th;
                }
            }
            throw th;
        }
        throw th;
    }

    public static final String LJJIZ(UrlModel urlModel) {
        if (urlModel != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UrlModel: ");
            LIZ.append(urlModel.getUrlList());
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    @Override // X.InterfaceC60688Nro
    public InterfaceC61488OBg LIZ(C60737Nsb hybridContext) {
        HybridSchemaParam LIZLLL;
        o.LJIIJ(hybridContext, "hybridContext");
        InterfaceC60710NsA interfaceC60710NsA = hybridContext.hybridParams;
        if (interfaceC60710NsA == null || (LIZLLL = interfaceC60710NsA.LIZLLL()) == null || !LIZLLL.getProxyEnabledRuntimeType()) {
            return null;
        }
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(hybridContext, null);
        if (!(LIZIZ instanceof C39902FlK)) {
            return null;
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC76768UAy
    public void LIZIZ(Object value) {
        o.LJIIIZ(value, "value");
    }

    @Override // X.C0WM
    public List LJIIJJI(EffectChannelResponse effectChannelResponse) {
        String str;
        List<EffectCategoryResponse> categoryResponseList;
        String tagsUpdateTime;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<Effect> collections;
        List<Effect> allCategoryEffects;
        C0TX.LIZ.LIZJ("Sticker");
        C0TX.LIZLLL("perform sticker's convert.");
        ArrayList arrayList3 = new ArrayList();
        if (effectChannelResponse != null) {
            str = effectChannelResponse.getPanel();
        } else {
            str = null;
        }
        if (o.LJ(str, C0TY.LIZJ)) {
            if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
                arrayList = new ArrayList(C32I.LJJL(allCategoryEffects, 10));
                Iterator<Effect> it = allCategoryEffects.iterator();
                while (it.hasNext()) {
                    LiveEffect LIZIZ = C0LT.LIZIZ(it.next());
                    String str2 = C0TY.LIZJ;
                    LIZIZ.effectPanelName = str2;
                    LIZIZ.effectPanelKey = str2;
                    arrayList.add(LIZIZ);
                }
            } else {
                arrayList = new ArrayList();
            }
            if (effectChannelResponse != null && (collections = effectChannelResponse.getCollections()) != null) {
                arrayList2 = new ArrayList(C32I.LJJL(collections, 10));
                Iterator<Effect> it2 = collections.iterator();
                while (it2.hasNext()) {
                    LiveEffect LIZIZ2 = C0LT.LIZIZ(it2.next());
                    String str3 = C0TY.LIZJ;
                    LIZIZ2.effectPanelName = str3;
                    LIZIZ2.effectPanelKey = str3;
                    arrayList2.add(LIZIZ2);
                }
            } else {
                arrayList2 = new ArrayList();
            }
            String STICKER_INTERACT = C0TY.LIZJ;
            C78880UxY.LJJZZIII(STICKER_INTERACT, arrayList, arrayList2);
            o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
            arrayList3.add(new C1QC(STICKER_INTERACT, STICKER_INTERACT, arrayList, arrayList2, "", ""));
        } else if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
            for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(totalEffects, 10));
                Iterator<Effect> it3 = totalEffects.iterator();
                while (it3.hasNext()) {
                    LiveEffect LIZIZ3 = C0LT.LIZIZ(it3.next());
                    LIZIZ3.effectPanelName = effectCategoryResponse.getName();
                    LIZIZ3.effectPanelKey = effectCategoryResponse.getKey();
                    C77412UZs.LJIIL(LIZIZ3, 1);
                    arrayList4.add(LIZIZ3);
                }
                List LLJI = ORZ.LLJI(C78880UxY.LJJIIJ(C78880UxY.LJJIII(C79004UzY.LJIIJ(arrayList4))));
                List<Effect> collectionEffect = effectCategoryResponse.getCollectionEffect();
                ArrayList arrayList5 = new ArrayList(C32I.LJJL(collectionEffect, 10));
                Iterator<Effect> it4 = collectionEffect.iterator();
                while (it4.hasNext()) {
                    LiveEffect LIZIZ4 = C0LT.LIZIZ(it4.next());
                    LIZIZ4.effectPanelName = effectCategoryResponse.getName();
                    LIZIZ4.effectPanelKey = effectCategoryResponse.getKey();
                    C77412UZs.LJIIL(LIZIZ4, 1);
                    arrayList5.add(LIZIZ4);
                }
                C78880UxY.LJJZZIII(effectCategoryResponse.getKey(), LLJI, arrayList5);
                if ((!LLJI.isEmpty()) && (tagsUpdateTime = effectCategoryResponse.getTagsUpdateTime()) != null) {
                    arrayList3.add(new C1QC(effectCategoryResponse.getName(), effectCategoryResponse.getKey(), LLJI, arrayList5, effectCategoryResponse.getId(), tagsUpdateTime));
                }
            }
        }
        return arrayList3;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0) {
            return C76800UCe.LIZ;
        }
        throw new RuntimeException("server error");
    }

    public static final void LJFF(Throwable th, Throwable exception) {
        o.LJIIIZ(th, "<this>");
        o.LJIIIZ(exception, "exception");
        if (th != exception) {
            C36637EZl.LIZ.LIZ(th, exception);
        }
    }

    public static final void LJI(C188727au c188727au, Aweme aweme) {
        String str;
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                num = Integer.valueOf(interactPermission.getUpvote());
            }
        } else {
            str = null;
        }
        LJII(c188727au, str, num);
    }

    public static final void LJIIIZ(JHM jhm, Aweme aweme) {
        InteractPermission interactPermission;
        String str;
        String str2;
        o.LJIIIZ(jhm, "<this>");
        if (aweme != null && aweme.getAid() != null && (interactPermission = aweme.getInteractPermission()) != null && interactPermission.getUpvote() == 0) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            V0P LJJIIZI = LJJIIZI(aid);
            String str3 = "1";
            if (LJJIIZI.LJLIL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C1799074g c1799074g = InterfaceC1798974f.LIZ;
            jhm.LJ("is_recommend", str, c1799074g);
            jhm.LIZJ(LJJIIZI.LJLILLLLZI, "recommend_cnt");
            if (LJJIIZI.LJLJI) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jhm.LJ("is_self", str2, c1799074g);
            if (!LJJIIZI.LJLJJI) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            jhm.LJ("with_recommendation", str3, c1799074g);
            jhm.LIZJ(LJJIIZI.LJLJJL, "is_muf_to_reposter");
            jhm.LIZJ(LJJIIZI.LJLJJLL, "is_follow_to_reposter");
            jhm.LIZJ(LJJIIZI.LJLJL, "is_maf_to_reposter");
            jhm.LIZJ(LJJIIZI.LJLJLJ, "is_unfollow_to_reposter");
        }
    }

    public static Sensor LJIJJ(SensorManager sensorManager, int i) {
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ISensorProvider getDefaultSensor, useBPEA:");
            LIZ.append(C47399Iix.LIZ);
            LIZ.append(" sProvider:");
            LIZ.append(LJLJJI);
            X1D.LIZIZ(LIZ);
        }
        if (LJLJJI != null && C47399Iix.LIZ) {
            return C39216FaG.LIZ(sensorManager, i);
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "-403452392219654109");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    public static final Image LJIJJLI(Context context, Icon icon) {
        if (AnonymousClass636.LJIILJJIL(context)) {
            if (icon != null) {
                return icon.getIconDark();
            }
        } else if (icon != null) {
            return icon.getIcon();
        }
        return null;
    }

    public static final InterfaceC07790Sh LJJIIJZLJL(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns onGloballyPositioned) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(onGloballyPositioned, "onGloballyPositioned");
        return interfaceC07790Sh.LLLIIIL(new C536428q(onGloballyPositioned));
    }

    public static final void LJJIIZ(BZI bzi, C31526CYw rankTypeAll) {
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        if (rankTypeAll.LIZ != EnumC31514CYk.GAME_RANK) {
            bzi.LJIJJ(rankTypeAll.LIZIZ.rankName, "rank_type");
            return;
        }
        if (o.LJ(rankTypeAll.LIZIZ, rankTypeAll.LIZLLL)) {
            bzi.LJIJJ(rankTypeAll.LIZIZ.rankName, "rank_type");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sub_");
        LIZ.append(rankTypeAll.LIZLLL.rankName);
        bzi.LJIJJ(X1D.LIZIZ(LIZ), "rank_type");
        bzi.LJIJJ(rankTypeAll.LIZIZ.rankName, "sub_rank_game_name");
    }

    public static Enum LJJJ(Class cls, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return Enum.valueOf(cls, str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.ENUM, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof String) {
                        return Enum.valueOf(cls, (String) obj);
                    }
                    return null;
                }
                throw th;
            }
        }
        return Enum.valueOf(cls, str);
    }

    @Override // X.InterfaceC76768UAy
    public void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        C0RO.LIZ(C15380j0.LIZLLL(), th, null);
    }

    public static final void LJ(C29S c29s, ViewGroup parent, boolean z) {
        o.LJIIIZ(parent, "parent");
        if (!z) {
            return;
        }
        C15Y c15y = new C15Y(c29s);
        C44432HcC.LJLIL = true;
        c15y.LIZ(R.layout.l8, parent, new C44433HcD(c29s, parent));
    }

    public static final void LJII(C188727au c188727au, String str, Integer num) {
        String str2;
        String str3;
        if (str == null || num == null || num.intValue() != 0) {
            return;
        }
        V0P LJJIIZI = LJJIIZI(str);
        String str4 = "1";
        if (LJJIIZI.LJLIL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_recommend", str2);
        c188727au.LIZLLL(LJJIIZI.LJLILLLLZI, "recommend_cnt");
        if (LJJIIZI.LJLJI) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_self", str3);
        if (!LJJIIZI.LJLJJI) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("with_recommendation", str4);
        c188727au.LIZLLL(LJJIIZI.LJLJJL, "is_muf_to_reposter");
        c188727au.LIZLLL(LJJIIZI.LJLJJLL, "is_follow_to_reposter");
        c188727au.LIZLLL(LJJIIZI.LJLJL, "is_maf_to_reposter");
        c188727au.LIZLLL(LJJIIZI.LJLJLJ, "is_unfollow_to_reposter");
    }

    public static final void LJIIIIZZ(JSONObject jSONObject, String str, Integer num) {
        Object obj;
        Object obj2;
        if (num == null || num.intValue() != 0) {
            return;
        }
        V0P LJJIIZI = LJJIIZI(str);
        String str2 = "1";
        if (LJJIIZI.LJLIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_recommend", obj);
        jSONObject.put("recommend_cnt", LJJIIZI.LJLILLLLZI);
        if (LJJIIZI.LJLJI) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_self", obj2);
        if (!LJJIIZI.LJLJJI) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("with_recommendation", str2);
        jSONObject.put("is_muf_to_reposter", LJJIIZI.LJLJJL);
        jSONObject.put("is_follow_to_reposter", LJJIIZI.LJLJJLL);
        jSONObject.put("is_maf_to_reposter", LJJIIZI.LJLJL);
        jSONObject.put("is_unfollow_to_reposter", LJJIIZI.LJLJLJ);
    }

    public static final void LIZLLL(Context context, ViewGroup parent, boolean z, boolean z2, C82622Wbi diContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(diContainer, "diContainer");
        if (!z) {
            return;
        }
        C15Y c15y = new C15Y(context);
        C44432HcC.LJLIL = true;
        c15y.LIZ(R.layout.l7, parent, new C44434HcE(context, z2, diContainer, parent));
    }

    public static void LJJIJLIJ(ActivityC45651qj activityC45651qj, V0O v0o, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, UrlModel urlModel, int i, String str) {
        Bundle bundle = new Bundle();
        if (((ArrayList) C41658GWo.LIZLLL().LIZ).size() > 0) {
            bundle.putString("challenge", ((AVChallenge) ListProtector.get(C41658GWo.LIZLLL().LIZ, 0)).cid);
        } else {
            String str2 = v0o.LIZJ;
            if (str2 != null) {
                bundle.putString("challenge", str2);
            }
        }
        if (!TextUtils.isEmpty(v0o.LIZ)) {
            bundle.putString("first_sticker_music_ids", v0o.LIZ);
        }
        if (!TextUtils.isEmpty(v0o.LIZIZ)) {
            bundle.putString("first_sticker_id", v0o.LIZIZ);
        }
        bundle.putBoolean("is_busi_sticker", v0o.LJIIIZ);
        if (v0o.LJIIJ) {
            bundle.putBoolean("hide_cancel_music_ui", true);
        }
        long j = v0o.LJIIL;
        if (j != 0) {
            bundle.putLong("max_video_duration", j);
        }
        if (v0o.LJIIL != 0) {
            bundle.putLong("shoot_video_length", v0o.LJIILIIL);
        }
        if (!TextUtils.isEmpty(v0o.LJIILL)) {
            bundle.putString("mission_music_id", v0o.LJIILL);
        }
        if (!TextUtils.isEmpty(v0o.LJI)) {
            bundle.putString("enter_from", v0o.LJI);
        }
        if (!TextUtils.isEmpty(v0o.LJIILJJIL)) {
            bundle.putString("mission_id", v0o.LJIILJJIL);
        }
        UrlModel urlModel2 = v0o.LJIL;
        if (urlModel2 != null) {
            bundle.putSerializable("effect_icon_url", urlModel2);
        }
        String str3 = v0o.LJIJJ;
        if (str3 != null) {
            bundle.putString("music_selected_from", str3);
        }
        String str4 = v0o.LJIJJLI;
        if (str4 != null) {
            bundle.putString("music_selected_method", str4);
        }
        C78934UyQ.LJLIL.getMusicService().LJJIIJ(activityC45651qj, new V1K(activityC45651qj.getString(R.string.clp), 0, v0o.LIZLLL, v0o.LJ, bundle, v0o.LJI, v0o.LJII, false, v0o.LJIIJJI, v0o.LJFF, v0o.LJIIIIZZ, v0o.LJIILLIIL, str, urlModel, i, v0o.LJIIZILJ, v0o.LJIJ, v0o.LJIJI, false), interfaceC88472Yns, interfaceC65784Pro);
    }
}
