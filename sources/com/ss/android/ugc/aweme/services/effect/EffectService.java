package com.ss.android.ugc.aweme.services.effect;

import X.C41802Gas;
import X.C43679HCh;
import X.C43941HMj;
import X.C43962HNe;
import X.C44172HVg;
import X.C84488XDw;
import X.FFL;
import X.InterfaceC43942HMk;
import X.InterfaceC84498XEg;
import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EffectService implements IEffectService {
    public static final Companion Companion = new Companion();
    public static EffectService sInstance;
    public final File MV_RES_CACHE_FILE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final EffectService getInstance() {
            if (EffectService.sInstance == null) {
                synchronized (EffectService.class) {
                    if (EffectService.sInstance == null) {
                        EffectService.sInstance = new EffectService();
                    }
                }
            }
            EffectService effectService = EffectService.sInstance;
            o.LJI(effectService);
            return effectService;
        }

        public Companion() {
        }
    }

    public /* synthetic */ EffectService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final EffectService getInstance() {
        return Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public ArrayList<String> getDraftEffectList() {
        return EffectPlatform.LJJJLIIL(false);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getLiveStickerPannel() {
        return "livestreaming";
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getCacheDir() {
        String absolutePath = EffectPlatform.LJLJJI.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getEffectCacheDir()");
        return absolutePath;
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public String getModelCacheDir() {
        String absolutePath = EffectPlatform.LJLJJL.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getEffectModelCacheDir()");
        return absolutePath;
    }

    public EffectService() {
        this.MV_RES_CACHE_FILE = new File(C44172HVg.LJJI.LJI().LIZ().LIZJ());
    }

    private final InterfaceC43942HMk getStickerFetch(InterfaceC84498XEg interfaceC84498XEg) {
        o.LJI(interfaceC84498XEg);
        return C43962HNe.LIZ(interfaceC84498XEg);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC84498XEg createFontEffectPlatform(Context context) {
        if (C43941HMj.LIZIZ()) {
            o.LJI(context);
            return C84488XDw.LIZ(context, null);
        }
        o.LJI(context);
        return C84488XDw.LIZ(context, new AqS173S0100000_7(this, 82));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC84498XEg createMvEffectPlatform(Context context) {
        return createMvEffectPlatform(context, null);
    }

    public final void setFontEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (e1.LIZ(31744, "creative_tools_open_font_cache", true, false)) {
            FFL.LJIIIZ().getClass();
            effectPlatformBuilder.effectMaxCacheSize = FFL.LJIILIIL(31744, 838860800L, "creative_tool_font_cache_threshold") * 1048576;
        }
    }

    public final void setMvEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (e1.LIZ(31744, "creative_tools_open_mv_cache", true, false)) {
            FFL.LJIIIZ().getClass();
            effectPlatformBuilder.effectMaxCacheSize = FFL.LJIILIIL(31744, 838860800L, "creative_tool_mv_cache_threshold") * 1048576;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC84498XEg createEffectPlatform(Context context, String str) {
        if (C43941HMj.LIZIZ() && str == null) {
            o.LJI(context);
            return C84488XDw.LIZ(context, null);
        }
        o.LJI(context);
        return C84488XDw.LIZ(context, C43941HMj.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public InterfaceC84498XEg createMvEffectPlatform(Context context, String str) {
        if (C43941HMj.LIZIZ() && str == null) {
            o.LJI(context);
            return C84488XDw.LIZ(context, null);
        }
        o.LJI(context);
        return C84488XDw.LIZ(context, new AqS60S1100000_7(str, this, 1));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(InterfaceC84498XEg interfaceC84498XEg, String effectId, String str, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effectId, "effectId");
        InterfaceC43942HMk stickerFetch = getStickerFetch(interfaceC84498XEg);
        o.LJI(iFetchEffectListener);
        stickerFetch.LIZ(effectId, str, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(InterfaceC84498XEg interfaceC84498XEg, String effectId, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        o.LJIIIZ(effectId, "effectId");
        InterfaceC43942HMk stickerFetch = getStickerFetch(interfaceC84498XEg);
        o.LJI(iFetchEffectListener);
        stickerFetch.LIZLLL(effectId, map, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(List<? extends EffectPointModel> models, FilterBean filter, float f, int i, boolean z, AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        EditPreviewInfo editPreviewInfo;
        o.LJIIIZ(models, "models");
        o.LJIIIZ(filter, "filter");
        String filterFolder = filter.getFilterFolder();
        if (awemeDraft != null) {
            editPreviewInfo = C41802Gas.LIZJ(awemeDraft);
        } else {
            editPreviewInfo = null;
        }
        C43679HCh.LIZ(models, filterFolder, f, i, z, editPreviewInfo, null, onVideoCoverCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(List<? extends EffectPointModel> models, String filterPath, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        o.LJIIIZ(models, "models");
        o.LJIIIZ(filterPath, "filterPath");
        C43679HCh.LIZ(models, filterPath, f, i, z, editPreviewInfo, null, onVideoCoverCallback);
    }
}
