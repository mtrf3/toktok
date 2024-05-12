package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class ProviderEffectTemplate extends ProviderEffect {
    public String clickUrl;
    public final transient ProviderEffect kProviderEffect;
    public ProviderEffect.StickerBean thumbnailSticker;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffectTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ProviderEffect.StickerBean getSticker() {
        ProviderEffect.StickerBean sticker_info;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect == null || (sticker_info = kProviderEffect.getSticker_info()) == null) {
            sticker_info = getSticker_info();
        }
        return new ProviderEffect.StickerBean(sticker_info);
    }

    public ProviderEffect.StickerBean getThumbnailSticker() {
        ProviderEffect.StickerBean thumbnail_sticker;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect == null || (thumbnail_sticker = kProviderEffect.getThumbnail_sticker()) == null) {
            thumbnail_sticker = super.getThumbnail_sticker();
        }
        return new ProviderEffect.StickerBean(thumbnail_sticker);
    }

    public String getClickUrl() {
        String click_url;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (click_url = kProviderEffect.getClick_url()) != null) {
            return click_url;
        }
        return super.getClick_url();
    }

    /* loaded from: classes16.dex */
    public static class StickerBeanTemplate extends ProviderEffect.StickerBean {
        public final transient ProviderEffect.StickerBean kStickerBean;

        /* JADX WARN: Multi-variable type inference failed */
        public StickerBeanTemplate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ProviderEffect.StickerBean getKStickerBean() {
            return this.kStickerBean;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StickerBeanTemplate(ProviderEffect.StickerBean stickerBean) {
            super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
            this.kStickerBean = stickerBean;
        }

        public /* synthetic */ StickerBeanTemplate(ProviderEffect.StickerBean stickerBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stickerBean);
        }
    }

    public com.ss.ugc.effectplatform.model.ProviderEffect getKProviderEffect() {
        return this.kProviderEffect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffectTemplate(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect) {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262143, 0 == true ? 1 : 0);
        this.kProviderEffect = providerEffect;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setClick_url(str);
        }
        super.setClick_url(str);
    }

    public void setSticker(ProviderEffect.StickerBean stickerBean) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setSticker_info(stickerBean);
        }
        setSticker_info(stickerBean);
    }

    public void setThumbnailSticker(ProviderEffect.StickerBean stickerBean) {
        this.thumbnailSticker = stickerBean;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setThumbnail_sticker(stickerBean);
        }
        super.setThumbnail_sticker(stickerBean);
    }

    public /* synthetic */ ProviderEffectTemplate(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffect);
    }
}
