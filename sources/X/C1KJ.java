package X;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchFailedEvent;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.RoomStickerFetchSuccessChannel;
import com.bytedance.android.live.effect.api.RoomStickerPanelFailEvent;
import com.bytedance.android.live.effect.api.RoomStickerSpecialFetchSuccessChannel;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1KJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KJ implements C0WR {
    public static final C1KJ LIZ = new C1KJ();
    public static final EffectManager LIZIZ;
    public static final ConcurrentHashMap<C07470Rb, String> LIZJ;

    static {
        EffectManager LJLJJLL = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        o.LJIIIIZZ(LJLJJLL, "getService(IHostCreative…class.java).effectManager");
        LIZIZ = LJLJJLL;
        LIZJ = new ConcurrentHashMap<>(256);
    }

    public static void LJIIIZ() {
        C0TX.LIZ.LIZJ("LiveEffectDataProvider");
        C0TX.LIZLLL("clear effect download status cache.");
        LIZJ.clear();
    }

    public static void LJIIIIZZ(Effect effect) {
        if (effect == null) {
            return;
        }
        LIZJ.put(new C07470Rb(effect.getResource_id()), effect.getUnzipPath());
    }

    public static boolean LJIIL(Effect effect) {
        boolean isEffectDownloaded;
        if (effect == null) {
            return false;
        }
        if (EffectParseOptSetting.enableOpt()) {
            C07470Rb c07470Rb = new C07470Rb(effect.getResource_id());
            ConcurrentHashMap<C07470Rb, String> concurrentHashMap = LIZJ;
            String str = concurrentHashMap.get(c07470Rb);
            if (str != null) {
                if (str.length() == 0) {
                    return false;
                }
                if (o.LJ(str, effect.getUnzipPath())) {
                    return true;
                }
            }
            if (DownloadableModelSupport.isInitialized()) {
                isEffectDownloaded = DownloadableModelSupport.getInstance().isEffectReady(LIZIZ, effect);
            } else {
                isEffectDownloaded = LIZIZ.isEffectDownloaded(effect);
            }
            if (isEffectDownloaded) {
                concurrentHashMap.put(c07470Rb, effect.getUnzipPath());
                return isEffectDownloaded;
            }
            concurrentHashMap.put(c07470Rb, "");
            return isEffectDownloaded;
        }
        if (DownloadableModelSupport.isInitialized()) {
            return DownloadableModelSupport.getInstance().isEffectReady(LIZIZ, effect);
        }
        return LIZIZ.isEffectDownloaded(effect);
    }

    @Override // X.C0WR
    public final boolean LIZ(LiveEffect liveEffect) {
        String str;
        if (C78880UxY.LJJL(liveEffect)) {
            return true;
        }
        if (liveEffect == null) {
            return false;
        }
        Effect effect = liveEffect.getEffect();
        if (effect != null) {
            str = effect.getPanel();
        } else {
            str = null;
        }
        if (o.LJ(str, "livebackground") && liveEffect.isNone()) {
            return true;
        }
        return LJIIL(liveEffect.getEffect());
    }

    @Override // X.C0WR
    public final void LIZIZ(final DataChannel dataChannel) {
        LJIIJ("livegame", new O6R(), new C78977Uz7(), new C0WO<LiveEffect>(dataChannel) { // from class: X.1KF
            public final WeakReference<DataChannel> LIZ;

            @Override // X.C0WO
            public final void onFail() {
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.pv0(LiveGameEffectFetchFailedEvent.class);
                }
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // X.C0WO
            public final void onSuccess(List<C1QC> effectPanelList) {
                o.LJIIIZ(effectPanelList, "effectPanelList");
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.rv0(LiveGameEffectFetchedChannel.class, effectPanelList);
                }
            }
        });
    }

    @Override // X.C0WR
    public final void LJ(final DataChannel dataChannel) {
        LJIIJ("livebackground", new V0N(), new C0WP<LiveEffect>() { // from class: X.1fy
            @Override // X.C0WP
            public final List<C1QC> LJIIZILJ(List<C1QC> effectPanelList) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                o.LJIIIZ(effectPanelList, "effectPanelList");
                Iterator<C1QC> it = effectPanelList.iterator();
                while (it.hasNext()) {
                    int i = 0;
                    for (Object obj : it.next().LJLILLLLZI) {
                        int i2 = i + 1;
                        List<String> list = null;
                        if (i >= 0) {
                            LiveEffect liveEffect = (LiveEffect) obj;
                            boolean LIZ2 = C1KJ.LIZ.LIZ(liveEffect);
                            liveEffect.isDownloaded = LIZ2;
                            try {
                                new com.google.gson.o();
                                m LJIIZILJ = com.google.gson.o.LIZ(liveEffect.extra).LJIIZILJ();
                                j LJJIJ = LJIIZILJ.LJJIJ("is_none");
                                if (LJJIJ != null) {
                                    z = LJJIJ.LJFF();
                                } else {
                                    z = false;
                                }
                                liveEffect.isNone = z;
                                if (liveEffect.sdkExtraModel == null) {
                                    liveEffect.sdkExtraModel = new LiveEffect.StickerSDKExtra();
                                }
                                LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
                                if (stickerSDKExtra == null || stickerSDKExtra.liveGoalExtra == null) {
                                    j LJJIJ2 = LJIIZILJ.LJJIJ("is_full_screen");
                                    if (LJJIJ2 != null) {
                                        z2 = LJJIJ2.LJFF();
                                    } else {
                                        z2 = false;
                                    }
                                    j LJJIJ3 = LJIIZILJ.LJJIJ("is_horizontal");
                                    if (LJJIJ3 != null) {
                                        z3 = LJJIJ3.LJFF();
                                    } else {
                                        z3 = false;
                                    }
                                    j LJJIJ4 = LJIIZILJ.LJJIJ("is_vertical");
                                    if (LJJIJ4 != null) {
                                        z4 = LJJIJ4.LJFF();
                                    } else {
                                        z4 = false;
                                    }
                                    LiveEffect.StickerSDKExtra stickerSDKExtra2 = liveEffect.sdkExtraModel;
                                    if (stickerSDKExtra2 != null) {
                                        stickerSDKExtra2.liveGoalExtra = new LiveEffect.LiveGoalExtra(z2, z3, z4);
                                    }
                                    if (liveEffect.isNone() || z2 || z3 || z4) {
                                        liveEffect.isLiveGoal = true;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            if (LIZ2) {
                                BQO LIZ3 = C15650jR.LIZ();
                                UrlModel urlModel = liveEffect.icon;
                                if (urlModel != null) {
                                    list = urlModel.urlList;
                                }
                                LIZ3.LIZ(list).LJIILL();
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                return effectPanelList;
            }
        }, new C0WO<LiveEffect>(dataChannel) { // from class: X.1KH
            public final WeakReference<DataChannel> LIZ;

            @Override // X.C0WO
            public final void onFail() {
                C0NB.LIZIZ("LiveGoalEffect", "download EffectList failed!!!!");
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // X.C0WO
            public final void onSuccess(List<C1QC> effectPanelList) {
                o.LJIIIZ(effectPanelList, "effectPanelList");
                C0NB.LIZIZ("LiveGoalEffect", "download EffectList successfully!!!!!");
                List<Object> list = ((C1QC) ListProtector.get(effectPanelList, 0)).LJLILLLLZI;
                ArrayList<LiveEffect> arrayList = new ArrayList();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    LiveEffect liveEffect = (LiveEffect) it.next();
                    String str = liveEffect.extra;
                    if (str != null && str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.length() > 0 && jSONObject.optBoolean("livegoal")) {
                            arrayList.add(liveEffect);
                        }
                    }
                }
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.rv0(LiveGoalEffectChannel.class, arrayList);
                }
                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                C31691Mf.LJIJI(arrayList);
                C08200Tw c08200Tw = new C08200Tw(arrayList);
                if (OUP.LJIIJ(arrayList)) {
                    C31671Md.LIZ();
                    return;
                }
                for (LiveEffect liveEffect2 : arrayList) {
                    if (!liveEffect2.isNone() && C29306Beo.LJIILLIIL(Boolean.valueOf(liveEffect2.isDownloaded))) {
                        liveEffect2.isDownloading = true;
                        ((BaseEffectViewModel) c08200Tw.LIZIZ).gv0(liveEffect2, C31691Mf.LJIIIZ);
                    }
                }
            }
        });
    }

    @Override // X.C0WR
    public final void LJFF(final DataChannel dataChannel) {
        LJIIJ("livesticker", new C0WM<RoomSticker>() { // from class: X.1bi
            @Override // X.C0WM
            public final List<C1QC> LJIIJJI(EffectChannelResponse effectChannelResponse) {
                List<String> urlPrefix;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (effectChannelResponse == null || (urlPrefix = effectChannelResponse.getUrlPrefix()) == null) {
                    return new ArrayList();
                }
                List<EffectCategoryResponse> categoryResponseList = effectChannelResponse.getCategoryResponseList();
                if (categoryResponseList != null) {
                    for (EffectCategoryResponse effectCategoryResponse : categoryResponseList) {
                        String key = effectCategoryResponse.getKey();
                        if (o.LJ(key, "image")) {
                            for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                                try {
                                    new com.google.gson.o();
                                    arrayList.add(LIZ(com.google.gson.o.LIZ(effect.getExtra()).LJIIZILJ(), urlPrefix, CastLongProtector.parseLong(effect.getEffectId()), effect.getName(), effect.getResourceId()));
                                } catch (Throwable unused) {
                                }
                            }
                        } else if (o.LJ(key, "text")) {
                            for (Effect effect2 : effectCategoryResponse.getTotalEffects()) {
                                try {
                                    new com.google.gson.o();
                                    RoomSticker LIZIZ2 = LIZIZ(com.google.gson.o.LIZ(effect2.getExtra()).LJIIZILJ(), urlPrefix, CastLongProtector.parseLong(effect2.getEffectId()), effect2.getName(), effect2.getResourceId());
                                    LIZIZ2.content = effect2.getHint();
                                    LIZIZ2.name = effect2.getName();
                                    arrayList2.add(LIZIZ2);
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new C1QC("livestickerimage", "livestickerimage", arrayList, null, 56));
                arrayList3.add(new C1QC("livestickertext", "livestickertext", arrayList2, null, 56));
                return arrayList3;
            }

            public static RoomSticker LIZ(m mVar, List list, long j, String str, String str2) {
                String str3;
                RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, null, null, 0, false, 2047, null);
                roomSticker.id = j;
                roomSticker.LIZ = str2;
                roomSticker.name = str;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    str3 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str4 = (String) it.next();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str4);
                    j LJJIJ = mVar.LJJIJ("image_uri");
                    if (LJJIJ != null) {
                        str3 = LJJIJ.LJJIFFI();
                    }
                    LIZ2.append(str3);
                    arrayList.add(X1D.LIZIZ(LIZ2));
                }
                roomSticker.screenWidth = C15380j0.LJIIL();
                roomSticker.screenHeight = C15380j0.LJIIJJI();
                j LJJIJ2 = mVar.LJJIJ("image_uri");
                if (LJJIJ2 != null) {
                    str3 = LJJIJ2.LJJIFFI();
                }
                roomSticker.image = new ImageModel(str3, arrayList);
                roomSticker.type = 5;
                roomSticker.LIZ = str2;
                return roomSticker;
            }

            public static RoomSticker LIZIZ(m mVar, List list, long j, String str, String str2) {
                int i;
                int i2;
                int i3;
                int i4;
                String str3;
                String str4;
                int i5;
                String LJJIFFI;
                String str5;
                String str6 = null;
                RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, null, null, 0, false, 2047, null);
                roomSticker.id = j;
                roomSticker.LIZ = str2;
                roomSticker.name = str;
                roomSticker.screenWidth = C15380j0.LJIIL();
                roomSticker.screenHeight = C15380j0.LJIIJJI();
                j LJJIJ = mVar.LJJIJ("top_left_h");
                int i6 = 0;
                if (LJJIJ != null) {
                    i = LJJIJ.LJIILJJIL();
                } else {
                    i = 0;
                }
                roomSticker.topLeftHeight = i;
                j LJJIJ2 = mVar.LJJIJ("top_left_w");
                if (LJJIJ2 != null) {
                    i2 = LJJIJ2.LJIILJJIL();
                } else {
                    i2 = 0;
                }
                roomSticker.topLeftWidth = i2;
                j LJJIJ3 = mVar.LJJIJ("bottom_right_h");
                if (LJJIJ3 != null) {
                    i3 = LJJIJ3.LJIILJJIL();
                } else {
                    i3 = 0;
                }
                roomSticker.bottomRightHeight = i3;
                j LJJIJ4 = mVar.LJJIJ("bottom_right_w");
                if (LJJIJ4 != null) {
                    i4 = LJJIJ4.LJIILJJIL();
                } else {
                    i4 = 0;
                }
                roomSticker.bottomRightWidth = i4;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    String str7 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str8 = (String) it.next();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str8);
                    j LJJIJ5 = mVar.LJJIJ("image_uri");
                    if (LJJIJ5 != null) {
                        str5 = LJJIJ5.LJJIFFI();
                    } else {
                        str5 = null;
                    }
                    LIZ2.append(str5);
                    arrayList.add(X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str8);
                    j LJJIJ6 = mVar.LJJIJ("nine_patch_image_uri");
                    if (LJJIJ6 != null) {
                        str7 = LJJIJ6.LJJIFFI();
                    }
                    LIZ3.append(str7);
                    arrayList2.add(X1D.LIZIZ(LIZ3));
                }
                j LJJIJ7 = mVar.LJJIJ("image_uri");
                if (LJJIJ7 != null) {
                    str3 = LJJIJ7.LJJIFFI();
                } else {
                    str3 = null;
                }
                roomSticker.image = new ImageModel(str3, arrayList);
                j LJJIJ8 = mVar.LJJIJ("nine_patch_image_uri");
                if (LJJIJ8 != null) {
                    str6 = LJJIJ8.LJJIFFI();
                }
                roomSticker.ninePatchImage = new ImageModel(str6, arrayList2);
                j LJJIJ9 = mVar.LJJIJ("text_size");
                if (LJJIJ9 != null) {
                    i6 = LJJIJ9.LJIILJJIL();
                }
                roomSticker.textSize = i6;
                j LJJIJ10 = mVar.LJJIJ("text_color");
                String str9 = "";
                if (LJJIJ10 == null || (str4 = LJJIJ10.LJJIFFI()) == null) {
                    str4 = "";
                }
                roomSticker.textColor = str4;
                j LJJIJ11 = mVar.LJJIJ("type");
                if (LJJIJ11 != null) {
                    i5 = LJJIJ11.LJIILJJIL();
                } else {
                    i5 = 4;
                }
                roomSticker.type = i5;
                j LJJIJ12 = mVar.LJJIJ("content_key");
                if (LJJIJ12 != null && (LJJIFFI = LJJIJ12.LJJIFFI()) != null) {
                    str9 = LJJIFFI;
                }
                roomSticker.contentKey = str9;
                roomSticker.LIZ = str2;
                return roomSticker;
            }
        }, new C63183Oqx(), new C0WO<RoomSticker>(dataChannel) { // from class: X.1KG
            public final WeakReference<DataChannel> LIZ;

            @Override // X.C0WO
            public final void onFail() {
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.pv0(RoomStickerPanelFailEvent.class);
                }
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // X.C0WO
            public final void onSuccess(List effectPanelList) {
                o.LJIIIZ(effectPanelList, "effectPanelList");
                DataChannel dataChannel2 = this.LIZ.get();
                if (dataChannel2 != null) {
                    dataChannel2.rv0(RoomStickerFetchSuccessChannel.class, effectPanelList);
                }
            }
        });
    }

    @Override // X.C0WR
    public final void LJI(final DataChannel dataChannel) {
        LIZIZ.fetchRewardEffects("livesticker", 20, 0, null, new IRewardEffectsListener(dataChannel) { // from class: X.1kC
            public final WeakReference<DataChannel> LIZ;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener
            public final void onFailed(ExceptionResult exceptionResult) {
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(QueryRewardEffectsResponse queryRewardEffectsResponse) {
                List<String> arrayList;
                List<com.ss.ugc.effectplatform.model.Effect> reward_effects;
                QueryRewardEffectsResponse queryRewardEffectsResponse2 = queryRewardEffectsResponse;
                WeakReference<DataChannel> weakReference = this.LIZ;
                ArrayList arrayList2 = new ArrayList();
                if (queryRewardEffectsResponse2 == null || (arrayList = queryRewardEffectsResponse2.getUrl_prefix()) == null) {
                    arrayList = new ArrayList<>();
                }
                if (queryRewardEffectsResponse2 != null && (reward_effects = queryRewardEffectsResponse2.getReward_effects()) != null) {
                    for (com.ss.ugc.effectplatform.model.Effect effect : reward_effects) {
                        try {
                            new com.google.gson.o();
                            arrayList2.add(C1KJ.LJII(com.google.gson.o.LIZ(effect.getExtra()).LJIIZILJ(), arrayList, CastLongProtector.parseLong(effect.getEffect_id()), effect.getName(), effect.getResource_id()));
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new C1QC("livestickerspecial", "livestickerspecial", arrayList2, null, 56));
                            DataChannel dataChannel2 = weakReference.get();
                            if (dataChannel2 != null) {
                                dataChannel2.rv0(RoomStickerSpecialFetchSuccessChannel.class, arrayList3);
                            } else {
                                dataChannel2 = null;
                            }
                            C3C5.m7constructorimpl(dataChannel2);
                        } catch (Throwable th) {
                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                        }
                    }
                }
            }
        });
    }

    @Override // X.C0WR
    public final void LIZJ(String resourceId, C0WQ c0wq) {
        o.LJIIIZ(resourceId, "resourceId");
        BgEffectViewModel bgEffectViewModel = (BgEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C1Q5(new C39011g1("livebackground"), new C44821pO())).get(BgEffectViewModel.class);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModel), null, null, new C54332Bh(bgEffectViewModel, c0wq, resourceId, null), 3);
    }

    @Override // X.C0WR
    public final void LIZLLL(Effect effect, final C0WN c0wn) {
        if (effect != null) {
            C0TX.LIZ.LIZJ("LiveEffectDataProvider");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("begin to download effect, effect_id: ");
            LIZ2.append(effect.getEffect_id());
            C0TX.LIZLLL(X1D.LIZIZ(LIZ2));
            LIZIZ.fetchEffect(effect, new IEffectDownloadProgressListener(c0wn) { // from class: X.1w0
                public final WeakReference<C0WN> LIZ;

                {
                    this.LIZ = new WeakReference<>(c0wn);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect2) {
                    C0WN c0wn2 = this.LIZ.get();
                    if (c0wn2 != null) {
                        c0wn2.onStart(effect2);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect2) {
                    String str;
                    Effect effect3 = effect2;
                    C0TX.LIZ.LIZJ("LiveEffectDataProvider");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("download effect success, effect_id: ");
                    if (effect3 != null) {
                        str = effect3.getEffect_id();
                    } else {
                        str = null;
                    }
                    LIZ3.append(str);
                    C0TX.LIZLLL(X1D.LIZIZ(LIZ3));
                    C1KJ.LJIIIIZZ(effect3);
                    C0WN c0wn2 = this.LIZ.get();
                    if (c0wn2 != null) {
                        c0wn2.onSuccess(effect3);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect2, ExceptionResult e) {
                    o.LJIIIZ(e, "e");
                    C0WN c0wn2 = this.LIZ.get();
                    if (c0wn2 != null) {
                        c0wn2.LJI(effect2);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("fetch effect ");
                    LIZ3.append(effect2);
                    LIZ3.append(" error: ");
                    LIZ3.append(e);
                    C0NB.LJ("LiveEffectDataProvider", X1D.LIZIZ(LIZ3));
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                public final void onProgress(Effect effect2, int i, long j) {
                    C0WN c0wn2 = this.LIZ.get();
                    if (c0wn2 != null) {
                        c0wn2.LJFF(i, effect2);
                    }
                }
            });
        }
    }

    public static void LJIIJ(String str, C0WM c0wm, C0WP c0wp, C0WO c0wo) {
        LIZIZ.fetchEffectListFromCache(str, new C41581kA(str, c0wm, c0wp, c0wo));
    }

    public final void LJIIJJI(List effectIds, boolean z, java.util.Map map, C43451nB c43451nB) {
        o.LJIIIZ(effectIds, "effectIds");
        LIZIZ.fetchEffectList(effectIds, z, map, c43451nB);
    }

    public static RoomSticker LJII(m mVar, List list, long j, String str, String str2) {
        String str3;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, null, null, 0, false, 2047, null);
        roomSticker.id = j;
        roomSticker.LIZ = str2;
        roomSticker.name = str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            str3 = null;
            if (!it.hasNext()) {
                break;
            }
            String str4 = (String) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str4);
            j LJJIJ = mVar.LJJIJ("image_uri");
            if (LJJIJ != null) {
                str3 = LJJIJ.LJJIFFI();
            }
            LIZ2.append(str3);
            arrayList.add(X1D.LIZIZ(LIZ2));
        }
        roomSticker.screenWidth = C15380j0.LJIIL();
        roomSticker.screenHeight = C15380j0.LJIIJJI();
        j LJJIJ2 = mVar.LJJIJ("image_uri");
        if (LJJIJ2 != null) {
            str3 = LJJIJ2.LJJIFFI();
        }
        roomSticker.image = new ImageModel(str3, arrayList);
        roomSticker.type = 6;
        roomSticker.LIZ = str2;
        return roomSticker;
    }
}
