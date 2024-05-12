package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ProviderEffect extends ProviderEffectTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderEffect() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* loaded from: classes16.dex */
    public static final class StickerBean extends ProviderEffectTemplate.StickerBeanTemplate implements Serializable {
        public final transient ProviderEffect.StickerBean kStickerBean;

        /* JADX WARN: Multi-variable type inference failed */
        public StickerBean() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getHeight() {
            String height;
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null && (height = kStickerBean.getHeight()) != null) {
                return height;
            }
            return super.getHeight();
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getSize() {
            String size;
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null && (size = kStickerBean.getSize()) != null) {
                return size;
            }
            return super.getSize();
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getUrl() {
            String url;
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null && (url = kStickerBean.getUrl()) != null) {
                return url;
            }
            return super.getUrl();
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public String getWidth() {
            String width;
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null && (width = kStickerBean.getWidth()) != null) {
                return width;
            }
            return super.getWidth();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate.StickerBeanTemplate
        public ProviderEffect.StickerBean getKStickerBean() {
            return this.kStickerBean;
        }

        public StickerBean(ProviderEffect.StickerBean stickerBean) {
            super(stickerBean);
            this.kStickerBean = stickerBean;
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null) {
                String height = kStickerBean.getHeight();
                if (height != null) {
                    super.setHeight(height);
                }
                String size = kStickerBean.getSize();
                if (size != null) {
                    super.setSize(size);
                }
                String url = kStickerBean.getUrl();
                if (url != null) {
                    super.setUrl(url);
                }
                String width = kStickerBean.getWidth();
                if (width != null) {
                    super.setWidth(width);
                }
            }
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setHeight(String str) {
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null) {
                kStickerBean.setHeight(str);
            }
            super.setHeight(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setSize(String str) {
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null) {
                kStickerBean.setSize(str);
            }
            super.setSize(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setUrl(String str) {
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null) {
                kStickerBean.setUrl(str);
            }
            super.setUrl(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ProviderEffect.StickerBean
        public void setWidth(String str) {
            ProviderEffect.StickerBean kStickerBean = getKStickerBean();
            if (kStickerBean != null) {
                kStickerBean.setWidth(str);
            }
            super.setWidth(str);
        }

        public /* synthetic */ StickerBean(ProviderEffect.StickerBean stickerBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stickerBean);
        }
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public ProviderEffect.AuthorBean getAuthor() {
        ProviderEffect.AuthorBean author;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (author = kProviderEffect.getAuthor()) != null) {
            return author;
        }
        return super.getAuthor();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public String getClickUrl() {
        return super.getClickUrl();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getClick_url() {
        String click_url;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (click_url = kProviderEffect.getClick_url()) != null) {
            return click_url;
        }
        return super.getClick_url();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public Long getDuration() {
        Long duration;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (duration = kProviderEffect.getDuration()) != null) {
            return duration;
        }
        return super.getDuration();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (extra = kProviderEffect.getExtra()) != null) {
            return extra;
        }
        return super.getExtra();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getHeight() {
        String height;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (height = kProviderEffect.getHeight()) != null) {
            return height;
        }
        return super.getHeight();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (id = kProviderEffect.getId()) != null) {
            return id;
        }
        return super.getId();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public Integer getLibrary_material_type() {
        Integer library_material_type;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (library_material_type = kProviderEffect.getLibrary_material_type()) != null) {
            return library_material_type;
        }
        return super.getLibrary_material_type();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getMaterial_description() {
        String material_description;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (material_description = kProviderEffect.getMaterial_description()) != null) {
            return material_description;
        }
        return super.getMaterial_description();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getMaterial_mp4_url() {
        String material_mp4_url;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (material_mp4_url = kProviderEffect.getMaterial_mp4_url()) != null) {
            return material_mp4_url;
        }
        return super.getMaterial_mp4_url();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getMedia_source() {
        String media_source;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (media_source = kProviderEffect.getMedia_source()) != null) {
            return media_source;
        }
        return super.getMedia_source();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getPath() {
        String path;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (path = kProviderEffect.getPath()) != null) {
            return path;
        }
        return super.getPath();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getPreview_webp() {
        String preview_webp;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (preview_webp = kProviderEffect.getPreview_webp()) != null) {
            return preview_webp;
        }
        return super.getPreview_webp();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public StickerBean getSticker() {
        return super.getSticker();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public StickerBean getThumbnailSticker() {
        return super.getThumbnailSticker();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public ProviderEffect.StickerBean getThumbnail_sticker() {
        ProviderEffect.StickerBean thumbnail_sticker;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (thumbnail_sticker = kProviderEffect.getThumbnail_sticker()) != null) {
            return thumbnail_sticker;
        }
        return super.getThumbnail_sticker();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getTitle() {
        String title;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (title = kProviderEffect.getTitle()) != null) {
            return title;
        }
        return super.getTitle();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getUser_name() {
        String user_name;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (user_name = kProviderEffect.getUser_name()) != null) {
            return user_name;
        }
        return super.getUser_name();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public ProviderEffect.Video getVideo() {
        ProviderEffect.Video video;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (video = kProviderEffect.getVideo()) != null) {
            return video;
        }
        return super.getVideo();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public String getWidth() {
        String width;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null && (width = kProviderEffect.getWidth()) != null) {
            return width;
        }
        return super.getWidth();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public com.ss.ugc.effectplatform.model.ProviderEffect getKProviderEffect() {
        return this.kProviderEffect;
    }

    public ProviderEffect(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect) {
        super(providerEffect);
        this.kProviderEffect = providerEffect;
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            ProviderEffect.AuthorBean author = kProviderEffect.getAuthor();
            if (author != null) {
                super.setAuthor(author);
            }
            String click_url = kProviderEffect.getClick_url();
            if (click_url != null) {
                super.setClick_url(click_url);
            }
            Long duration = kProviderEffect.getDuration();
            if (duration != null) {
                super.setDuration(Long.valueOf(duration.longValue()));
            }
            String extra = kProviderEffect.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            String height = kProviderEffect.getHeight();
            if (height != null) {
                super.setHeight(height);
            }
            String id = kProviderEffect.getId();
            if (id != null) {
                super.setId(id);
            }
            Integer library_material_type = kProviderEffect.getLibrary_material_type();
            if (library_material_type != null) {
                super.setLibrary_material_type(Integer.valueOf(library_material_type.intValue()));
            }
            String material_description = kProviderEffect.getMaterial_description();
            if (material_description != null) {
                super.setMaterial_description(material_description);
            }
            String material_mp4_url = kProviderEffect.getMaterial_mp4_url();
            if (material_mp4_url != null) {
                super.setMaterial_mp4_url(material_mp4_url);
            }
            String media_source = kProviderEffect.getMedia_source();
            if (media_source != null) {
                super.setMedia_source(media_source);
            }
            String path = kProviderEffect.getPath();
            if (path != null) {
                super.setPath(path);
            }
            String preview_webp = kProviderEffect.getPreview_webp();
            if (preview_webp != null) {
                super.setPreview_webp(preview_webp);
            }
            ProviderEffect.StickerBean sticker_info = kProviderEffect.getSticker_info();
            if (sticker_info != null) {
                setSticker_info(sticker_info);
            }
            ProviderEffect.StickerBean thumbnail_sticker = kProviderEffect.getThumbnail_sticker();
            if (thumbnail_sticker != null) {
                super.setThumbnail_sticker(thumbnail_sticker);
            }
            String title = kProviderEffect.getTitle();
            if (title != null) {
                super.setTitle(title);
            }
            String user_name = kProviderEffect.getUser_name();
            if (user_name != null) {
                super.setUser_name(user_name);
            }
            ProviderEffect.Video video = kProviderEffect.getVideo();
            if (video != null) {
                super.setVideo(video);
            }
            String width = kProviderEffect.getWidth();
            if (width != null) {
                super.setWidth(width);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setAuthor(ProviderEffect.AuthorBean authorBean) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setAuthor(authorBean);
        }
        super.setAuthor(authorBean);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public void setClickUrl(String str) {
        super.setClickUrl(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setClick_url(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setClick_url(str);
        }
        super.setClick_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setDuration(Long l) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setDuration(l);
        }
        super.setDuration(l);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setHeight(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setHeight(str);
        }
        super.setHeight(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setId(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setId(value);
        }
        super.setId(value);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setLibrary_material_type(Integer num) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setLibrary_material_type(num);
        }
        super.setLibrary_material_type(num);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setMaterial_description(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setMaterial_description(str);
        }
        super.setMaterial_description(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setMaterial_mp4_url(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setMaterial_mp4_url(str);
        }
        super.setMaterial_mp4_url(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setMedia_source(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setMedia_source(str);
        }
        super.setMedia_source(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setPath(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setPath(str);
        }
        super.setPath(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setPreview_webp(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setPreview_webp(str);
        }
        super.setPreview_webp(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public void setSticker(StickerBean stickerBean) {
        super.setSticker(stickerBean);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectTemplate
    public void setThumbnailSticker(StickerBean stickerBean) {
        super.setThumbnailSticker(stickerBean);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setThumbnail_sticker(ProviderEffect.StickerBean stickerBean) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setThumbnail_sticker(stickerBean);
        }
        super.setThumbnail_sticker(stickerBean);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setTitle(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setTitle(str);
        }
        super.setTitle(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setUser_name(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setUser_name(str);
        }
        super.setUser_name(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setVideo(ProviderEffect.Video video) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setVideo(video);
        }
        super.setVideo(video);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffect
    public void setWidth(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffect kProviderEffect = getKProviderEffect();
        if (kProviderEffect != null) {
            kProviderEffect.setWidth(str);
        }
        super.setWidth(str);
    }

    public /* synthetic */ ProviderEffect(com.ss.ugc.effectplatform.model.ProviderEffect providerEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffect);
    }
}
