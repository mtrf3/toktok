package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ProviderEffectModel extends ProviderEffectModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffectModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public int getCursor() {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            return kProviderEffect.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (extra = kProviderEffect.getExtra()) != null) {
            return extra;
        }
        return super.getExtra();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getFeed_session_id() {
        String feed_session_id;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (feed_session_id = kProviderEffect.getFeed_session_id()) != null) {
            return feed_session_id;
        }
        return super.getFeed_session_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            return kProviderEffect.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getImpression_id() {
        String impression_id;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (impression_id = kProviderEffect.getImpression_id()) != null) {
            return impression_id;
        }
        return super.getImpression_id();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public Integer getLast_clip_cursor() {
        Integer last_clip_cursor;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (last_clip_cursor = kProviderEffect.getLast_clip_cursor()) != null) {
            return last_clip_cursor;
        }
        return super.getLast_clip_cursor();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public Integer getLast_gif_cursor() {
        Integer last_gif_cursor;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (last_gif_cursor = kProviderEffect.getLast_gif_cursor()) != null) {
            return last_gif_cursor;
        }
        return super.getLast_gif_cursor();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public List<com.ss.ugc.effectplatform.model.ProviderEffect> getLibrary_list() {
        List<com.ss.ugc.effectplatform.model.ProviderEffect> library_list;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (library_list = kProviderEffect.getLibrary_list()) != null) {
            return library_list;
        }
        return super.getLibrary_list();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getMedia_source() {
        String media_source;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (media_source = kProviderEffect.getMedia_source()) != null) {
            return media_source;
        }
        return super.getMedia_source();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public String getSearchTips() {
        return super.getSearchTips();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getSearch_tips() {
        String search_tips;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (search_tips = kProviderEffect.getSearch_tips()) != null) {
            return search_tips;
        }
        return super.getSearch_tips();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public List<ProviderEffect> getStickerList() {
        return super.getStickerList();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public List<com.ss.ugc.effectplatform.model.ProviderEffect> getSticker_list() {
        List<com.ss.ugc.effectplatform.model.ProviderEffect> sticker_list;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (sticker_list = kProviderEffect.getSticker_list()) != null) {
            return sticker_list;
        }
        return super.getSticker_list();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getSubtitle() {
        String subtitle;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (subtitle = kProviderEffect.getSubtitle()) != null) {
            return subtitle;
        }
        return super.getSubtitle();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public boolean hasMore() {
        return super.hasMore();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public com.ss.ugc.effectplatform.model.ProviderEffectModel getKProviderEffect() {
        return this.kProviderEffect;
    }

    public ProviderEffectModel(com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel) {
        super(providerEffectModel);
        this.kProviderEffect = providerEffectModel;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            super.setCursor(kProviderEffect.getCursor());
            String extra = kProviderEffect.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            String feed_session_id = kProviderEffect.getFeed_session_id();
            if (feed_session_id != null) {
                super.setFeed_session_id(feed_session_id);
            }
            super.setHas_more(kProviderEffect.getHas_more());
            String impression_id = kProviderEffect.getImpression_id();
            if (impression_id != null) {
                super.setImpression_id(impression_id);
            }
            Integer last_clip_cursor = kProviderEffect.getLast_clip_cursor();
            if (last_clip_cursor != null) {
                super.setLast_clip_cursor(Integer.valueOf(last_clip_cursor.intValue()));
            }
            Integer last_gif_cursor = kProviderEffect.getLast_gif_cursor();
            if (last_gif_cursor != null) {
                super.setLast_gif_cursor(Integer.valueOf(last_gif_cursor.intValue()));
            }
            List<com.ss.ugc.effectplatform.model.ProviderEffect> library_list = kProviderEffect.getLibrary_list();
            if (library_list != null) {
                super.setLibrary_list(library_list);
            }
            String media_source = kProviderEffect.getMedia_source();
            if (media_source != null) {
                super.setMedia_source(media_source);
            }
            String search_tips = kProviderEffect.getSearch_tips();
            if (search_tips != null) {
                super.setSearch_tips(search_tips);
            }
            List<com.ss.ugc.effectplatform.model.ProviderEffect> sticker_list = kProviderEffect.getSticker_list();
            if (sticker_list != null) {
                super.setSticker_list(sticker_list);
            }
            String subtitle = kProviderEffect.getSubtitle();
            if (subtitle != null) {
                super.setSubtitle(subtitle);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setCursor(int i) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setFeed_session_id(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setFeed_session_id(str);
        }
        super.setFeed_session_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setImpression_id(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setImpression_id(str);
        }
        super.setImpression_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setLast_clip_cursor(Integer num) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setLast_clip_cursor(num);
        }
        super.setLast_clip_cursor(num);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setLast_gif_cursor(Integer num) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setLast_gif_cursor(num);
        }
        super.setLast_gif_cursor(num);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setLibrary_list(List<? extends com.ss.ugc.effectplatform.model.ProviderEffect> list) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setLibrary_list(list);
        }
        super.setLibrary_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setMedia_source(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setMedia_source(str);
        }
        super.setMedia_source(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public void setSearchTips(String str) {
        super.setSearchTips(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setSearch_tips(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public void setStickerList(List<ProviderEffect> value) {
        o.LJIIJ(value, "value");
        super.setStickerList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setSticker_list(List<? extends com.ss.ugc.effectplatform.model.ProviderEffect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setSticker_list(value);
        }
        super.setSticker_list(value);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setSubtitle(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setSubtitle(str);
        }
        super.setSubtitle(str);
    }

    public /* synthetic */ ProviderEffectModel(com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffectModel);
    }
}
