package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C05090Hx;
import X.C44827HiZ;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;

/* loaded from: classes8.dex */
public class StickerDowngradeStrategy$$Imp implements StickerDowngradeStrategy {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC09250Xx mDefaultCreate = new C44827HiZ();

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy, X.InterfaceC44963Hkl
    public boolean enableUseDynamicEffectLabel() {
        try {
            return C05090Hx.LIZJ.LIZ(this.mRepoName, "studio_enable_use_dynamic_effect_label", false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy, X.InterfaceC44963Hkl
    public StickerPreviewResolutionConfig getResolutionConfig() {
        try {
            C05090Hx c05090Hx = C05090Hx.LIZJ;
            String LJ = c05090Hx.LJ(this.mRepoName, "studio_downgrade_sticker_preview_resolution");
            if (LJ != null) {
                return (StickerPreviewResolutionConfig) this.mGson.LJI(LJ, StickerPreviewResolutionConfig.class);
            }
            return (StickerPreviewResolutionConfig) c05090Hx.LIZIZ(StickerPreviewResolutionConfig.class, this.mDefaultCreate);
        } catch (Exception unused) {
            return (StickerPreviewResolutionConfig) C05090Hx.LIZJ.LIZIZ(StickerPreviewResolutionConfig.class, this.mDefaultCreate);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
