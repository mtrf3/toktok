package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C31815CeB;
import X.C36781cQ;
import X.EF7;
import X.H7B;
import X.I2Q;
import X.I2R;
import X.I2S;
import X.I2T;
import X.I2Y;
import X.X1D;
import X.XBE;
import Y.ACallableS34S1100000_7;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessExtra;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCreativeTool;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import v5.n;

/* loaded from: classes8.dex */
public class LiveHostCreativeTool implements IHostCreativeTool {
    public final Map<I2R, I2Y> LJLIL = new HashMap();
    public EffectManager LJLILLLLZI;

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void BT() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.release();
            createIStickerViewServicebyMonsterPlugin.setPixelLoopStickerPresenterSupplier(null);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void hideStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.hideStickerView();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean isGalleryModuleInitialized() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            return createIStickerViewServicebyMonsterPlugin.isGalleryModuleInitialized();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final boolean isShowStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            return createIStickerViewServicebyMonsterPlugin.isShowStickerView();
        }
        return false;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void releaseGalleryModule() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.releaseGalleryModule();
        }
        ((HashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void scanPhotoList() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.scanPhotoList();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void selectFromGallery() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.selectFromGallery();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final EffectManager LJLJJLL() {
        if (this.LJLILLLLZI == null) {
            final n nVar = new n();
            IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
            effectService.buildEffectPlatform(EF7.LIZIZ(), new IAVEffectService.IAVEffectReadyCallback() { // from class: X.I2O
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                public final void finish(Object obj) {
                    n nVar2 = n.this;
                    InterfaceC84498XEg interfaceC84498XEg = (InterfaceC84498XEg) obj;
                    if (interfaceC84498XEg != null) {
                        nVar2.LJ(interfaceC84498XEg.LJLJJLL());
                    } else {
                        nVar2.LIZIZ(new RuntimeException("Decompress failed"));
                    }
                }
            }, effectService.getEffectPlatformDefaultRegionCallback());
            try {
                C10K<TResult> c10k = nVar.LIZ;
                c10k.LJIJI();
                if (c10k.LJIILJJIL()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("So decompress: LiveAppContext, get effect manager wrong,  task error: ");
                    LIZ.append(Log.getStackTraceString(c10k.LJIIJ()));
                    H7B.LIZJ(X1D.LIZIZ(LIZ));
                } else {
                    this.LJLILLLLZI = (EffectManager) c10k.LJIIJJI();
                }
            } catch (InterruptedException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("So decompress: LiveAppContext, get effect manager wrong, ");
                LIZ2.append(e.getMessage());
                LIZ2.append("at ");
                LIZ2.append(Log.getStackTraceString(e));
                H7B.LIZJ(X1D.LIZIZ(LIZ2));
                C16880lQ.LLLLIIL(e);
            }
        }
        return this.LJLILLLLZI;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final String eB(String str) {
        if (XBE.LJ()) {
            return XBE.LIZJ().LIZLLL().findResourceUri(str);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void lh(I2R i2r) {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        I2Y i2y = (I2Y) ((HashMap) this.LJLIL).remove(i2r);
        if (createIStickerViewServicebyMonsterPlugin != null && i2y != null) {
            createIStickerViewServicebyMonsterPlugin.removeScanPhotoListListener(i2y);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void Ab(ArrayList arrayList, C36781cQ c36781cQ) {
        AVExternalServiceImpl.LIZ().draftService().saveDraft(new IAVDraftService.SaveDraftByPathParam(arrayList, UUID.randomUUID().toString(), "live_highlight", new I2S(c36781cQ)));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void Ku0(Activity activity, I2R i2r) {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null && !((HashMap) this.LJLIL).containsKey(i2r)) {
            I2Q i2q = new I2Q(i2r);
            createIStickerViewServicebyMonsterPlugin.initGalleryModule(activity, i2q);
            ((HashMap) this.LJLIL).put(i2r, i2q);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void L50(String str, C31815CeB c31815CeB) {
        if (DownloadableModelSupport.isInitialized()) {
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, new String[]{str}, new I2T(c31815CeB));
        } else {
            new RuntimeException("DownloadableModelSupport not inited yet");
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final ResourceFinder rc(Context context, String str) {
        final n nVar = new n();
        AVExternalServiceImpl.LIZ().abilityService().effectService().provideResourceFinder(new IAVEffectService.IAVEffectReadyCallback() { // from class: X.I2P
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
            public final void finish(Object obj) {
                LiveHostCreativeTool liveHostCreativeTool = LiveHostCreativeTool.this;
                n nVar2 = nVar;
                IAVEffectService.ResourceFinder resourceFinder = (IAVEffectService.ResourceFinder) obj;
                liveHostCreativeTool.getClass();
                I2V i2v = new I2V(resourceFinder);
                if (resourceFinder != null) {
                    nVar2.LJ(i2v);
                } else {
                    nVar2.LIZIZ(new RuntimeException("Decompress failed"));
                }
            }
        });
        C10K<TResult> c10k = nVar.LIZ;
        try {
            c10k.LJIJI();
            if (c10k.LJIILJJIL()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("So decompress: LiveAppContext, get resource finder wrong,  task error: ");
                LIZ.append(Log.getStackTraceString(c10k.LJIIJ()));
                H7B.LIZJ(X1D.LIZIZ(LIZ));
            }
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        ResourceFinder resourceFinder = (ResourceFinder) c10k.LJIIJJI();
        if (resourceFinder == null) {
            return new AssetResourceFinder(context.getAssets(), str);
        }
        return resourceFinder;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void resizePhoto(String str, String str2) {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.resizePhoto(str, str2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCreativeTool
    public final void Xl0(final Context context, final String str, final String str2, String str3, String str4, String str5, String str6, String str7) {
        final CreativeInitialModel creativeInitialModel = new CreativeInitialModel();
        final HighLightVideoParametersModel highLightVideoParametersModel = creativeInitialModel.highLightVideoParametersModel;
        highLightVideoParametersModel.fragmentId = str3;
        highLightVideoParametersModel.roomId = str4;
        highLightVideoParametersModel.replayTitle = str5;
        highLightVideoParametersModel.fragmentType = str6;
        C10K.LIZJ(new ACallableS34S1100000_7(GsonHolder.LIZLLL().LIZ(), str7, 0)).LJ(new C10I() { // from class: X.HCa
            @Override // X.C10I
            public final Object then(C10K c10k) {
                LiveHostCreativeTool liveHostCreativeTool = LiveHostCreativeTool.this;
                HighLightVideoParametersModel highLightVideoParametersModel2 = highLightVideoParametersModel;
                CreativeInitialModel creativeInitialModel2 = creativeInitialModel;
                String str8 = str;
                String str9 = str2;
                Context context2 = context;
                liveHostCreativeTool.getClass();
                if (c10k.LJIILIIL()) {
                    LiveBusinessExtra liveBusinessExtra = (LiveBusinessExtra) c10k.LJIIJJI();
                    ArrayList arrayList = new ArrayList();
                    if (liveBusinessExtra != null) {
                        highLightVideoParametersModel2.isEcom = true;
                        C42890GsQ c42890GsQ = AnchorTransData.Companion;
                        CreateAnchorInfo anchorInfo = liveBusinessExtra.getAnchorInfo();
                        c42890GsQ.getClass();
                        arrayList.add(C42890GsQ.LIZ(anchorInfo));
                        creativeInitialModel2.highLightVideoParametersModel.stickerText = liveBusinessExtra.getVideoSuggestTitle();
                        creativeInitialModel2.highLightVideoParametersModel.stickerHint = liveBusinessExtra.getVideoSuggestToast();
                    }
                    EditConfig.Builder builder = new EditConfig.Builder();
                    builder.mediaInfo(new VideoMedia(str8));
                    builder.shootWay(str9);
                    builder.initialInputModel(creativeInitialModel2);
                    builder.anchors(arrayList);
                    AVExternalServiceImpl.LIZ().asyncService(context2, "upload", new IDLCallbackS16S0200000_7(context2, builder.build(), 1));
                    return null;
                }
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }
}
