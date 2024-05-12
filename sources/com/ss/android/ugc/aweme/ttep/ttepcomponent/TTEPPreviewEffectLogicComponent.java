package com.ss.android.ugc.aweme.ttep.ttepcomponent;

import X.AbstractC29891Fh;
import X.ActivityC45651qj;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C82398WVm;
import X.C82622Wbi;
import X.C82811Wel;
import X.I0N;
import X.InterfaceC115514g7;
import X.InterfaceC135635Tz;
import X.InterfaceC74236TBo;
import X.InterfaceC74429TIz;
import X.InterfaceC82086WJm;
import X.InterfaceC82353WTt;
import X.TBT;
import X.UCI;
import X.WRP;
import X.WSR;
import X.WSS;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class TTEPPreviewEffectLogicComponent extends AbstractC29891Fh<WSS> implements WSS, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public final ActivityC45651qj activity;
    public final InterfaceC115514g7 cameraApi$delegate;
    public final C82622Wbi diContainer;
    public final InterfaceC115514g7 filterApiComponent$delegate;
    public final InterfaceC115514g7 gestureApiComponent$delegate;
    public boolean isFirst;
    public final InterfaceC115514g7 stickerApiComponent$delegate;

    static {
        TBT tbt = new TBT(TTEPPreviewEffectLogicComponent.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(TTEPPreviewEffectLogicComponent.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(TTEPPreviewEffectLogicComponent.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(TTEPPreviewEffectLogicComponent.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC29891Fh
    /* renamed from: getApiComponent, reason: avoid collision after fix types in other method */
    public WSS getApiComponent2() {
        return this;
    }

    private final WRP getFilterApiComponent() {
        return (WRP) this.filterApiComponent$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    private final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.gestureApiComponent$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    private final Effect getPreviewEffect() {
        return (Effect) this.activity.getIntent().getParcelableExtra("extra_ttep_preview_effect");
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.stickerApiComponent$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final void applyEffect() {
        if (!this.isFirst) {
            return;
        }
        this.isFirst = false;
        Effect previewEffect = getPreviewEffect();
        if (previewEffect != null) {
            C82398WVm.LJI(getStickerApiComponent(), previewEffect);
        }
    }

    public final InterfaceC82086WJm getCameraApi() {
        return (InterfaceC82086WJm) this.cameraApi$delegate.LIZ(this, $$delegatedProperties[3]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        getCameraApi().e8().LLLZI(new WSR(this));
        getFilterApiComponent().setFilterDisable(false, "build_in");
        InterfaceC74429TIz LJFF = getStickerApiComponent().LLLLL().LJJJJLL().LJFF();
        Effect previewEffect = getPreviewEffect();
        if (previewEffect != null) {
            LJFF.LIZIZ(new C82811Wel(previewEffect, this.activity));
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WSS getApiComponent() {
        getApiComponent2();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    public TTEPPreviewEffectLogicComponent(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.diContainer = diContainer;
        this.stickerApiComponent$delegate = UCI.LJI(getDiContainer(), I0N.class, null);
        this.filterApiComponent$delegate = UCI.LJI(getDiContainer(), WRP.class, null);
        this.gestureApiComponent$delegate = UCI.LJI(getDiContainer(), InterfaceC82353WTt.class, null);
        this.cameraApi$delegate = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.activity = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.isFirst = true;
    }
}
