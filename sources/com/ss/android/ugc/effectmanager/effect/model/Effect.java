package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class Effect extends EffectTemplate {
    public final transient com.ss.ugc.effectplatform.model.Effect kEffect;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Effect> CREATOR = new Parcelable.Creator<Effect>() { // from class: com.ss.android.ugc.effectmanager.effect.model.Effect$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Effect createFromParcel(Parcel parcel) {
            Object obj;
            o.LJIIJ(parcel, "parcel");
            com.ss.ugc.effectplatform.model.Effect effect = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.Effect.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.Effect)) {
                    obj = null;
                }
                effect = (com.ss.ugc.effectplatform.model.Effect) obj;
            } catch (Exception e) {
                EPLog.e("createFromParcel", "get creator failed!", e);
            }
            return new Effect(effect);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Effect[] newArray(int i) {
            return new Effect[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public Effect() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getAdRawData() {
        return super.getAdRawData();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getAd_raw_data() {
        String ad_raw_data;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (ad_raw_data = kEffect.getAd_raw_data()) != null) {
            return ad_raw_data;
        }
        return super.getAd_raw_data();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public List<String> getBindIds() {
        return super.getBindIds();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getBind_ids() {
        List<String> bind_ids;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (bind_ids = kEffect.getBind_ids()) != null) {
            return bind_ids;
        }
        return super.getBind_ids();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getChallenge() {
        List<String> challenge;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (challenge = kEffect.getChallenge()) != null) {
            return challenge;
        }
        return super.getChallenge();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getChildEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.Effect r3 = r4.getKEffect()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getChild_effects()
            if (r1 == 0) goto L4d
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L2d
        L3d:
            if (r3 == 0) goto L42
            r3.setChild_effects(r2)
        L42:
            super.setChild_effects(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getChild_effects()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.Effect.getChildEffects():java.util.List");
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<com.ss.ugc.effectplatform.model.Effect> getChild_effects() {
        List<com.ss.ugc.effectplatform.model.Effect> child_effects;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (child_effects = kEffect.getChild_effects()) != null) {
            return child_effects;
        }
        return super.getChild_effects();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getChildren() {
        List<String> children;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (children = kEffect.getChildren()) != null) {
            return children;
        }
        return super.getChildren();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getComposerParams() {
        return super.getComposerParams();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getComposerPath() {
        List<String> composerPath;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (composerPath = kEffect.getComposerPath()) != null) {
            return composerPath;
        }
        return super.getComposerPath();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getComposer_params() {
        String composer_params;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (composer_params = kEffect.getComposer_params()) != null) {
            return composer_params;
        }
        return super.getComposer_params();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDesignerEncryptedId() {
        return super.getDesignerEncryptedId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDesignerId() {
        return super.getDesignerId();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getDesigner_encrypted_id() {
        String designer_encrypted_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (designer_encrypted_id = kEffect.getDesigner_encrypted_id()) != null) {
            return designer_encrypted_id;
        }
        return super.getDesigner_encrypted_id();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getDesigner_id() {
        String designer_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (designer_id = kEffect.getDesigner_id()) != null) {
            return designer_id;
        }
        return super.getDesigner_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getDevicePlatform() {
        return super.getDevicePlatform();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getDevice_platform() {
        String device_platform;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (device_platform = kEffect.getDevice_platform()) != null) {
            return device_platform;
        }
        return super.getDevice_platform();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getDoc_id() {
        String doc_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (doc_id = kEffect.getDoc_id()) != null) {
            return doc_id;
        }
        return super.getDoc_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getEffectId() {
        return super.getEffectId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public int getEffectType() {
        return super.getEffectType();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getEffect_id() {
        String effect_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (effect_id = kEffect.getEffect_id()) != null) {
            return effect_id;
        }
        return super.getEffect_id();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getEffect_source_id() {
        String effect_source_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (effect_source_id = kEffect.getEffect_source_id()) != null) {
            return effect_source_id;
        }
        return super.getEffect_source_id();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int getEffect_type() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getEffect_type();
        }
        return super.getEffect_type();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (extra = kEffect.getExtra()) != null) {
            return extra;
        }
        return super.getExtra();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getFileUrl() {
        return super.getFileUrl();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public DiffEffect getFile_diff() {
        DiffEffect file_diff;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (file_diff = kEffect.getFile_diff()) != null) {
            return file_diff;
        }
        return super.getFile_diff();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getFile_url() {
        com.ss.ugc.effectplatform.model.UrlModel file_url;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (file_url = kEffect.getFile_url()) != null) {
            return file_url;
        }
        return super.getFile_url();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getGradeKey() {
        return super.getGradeKey();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getGrade_key() {
        String grade_key;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (grade_key = kEffect.getGrade_key()) != null) {
            return grade_key;
        }
        return super.getGrade_key();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getHint() {
        String hint;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (hint = kEffect.getHint()) != null) {
            return hint;
        }
        return super.getHint();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getHintFile() {
        return super.getHintFile();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public int getHintFileFormat() {
        return super.getHintFileFormat();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getHintIcon() {
        return super.getHintIcon();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getHint_file() {
        com.ss.ugc.effectplatform.model.UrlModel hint_file;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (hint_file = kEffect.getHint_file()) != null) {
            return hint_file;
        }
        return super.getHint_file();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int getHint_file_format() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getHint_file_format();
        }
        return super.getHint_file_format();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getHint_icon() {
        com.ss.ugc.effectplatform.model.UrlModel hint_icon;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (hint_icon = kEffect.getHint_icon()) != null) {
            return hint_icon;
        }
        return super.getHint_icon();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public UrlModel getIconUrl() {
        return super.getIconUrl();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getIcon_url() {
        com.ss.ugc.effectplatform.model.UrlModel icon_url;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (icon_url = kEffect.getIcon_url()) != null) {
            return icon_url;
        }
        return super.getIcon_url();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getId() {
        String id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (id = kEffect.getId()) != null) {
            return id;
        }
        return super.getId();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getIopId() {
        return super.getIopId();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getIop_id() {
        String iop_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (iop_id = kEffect.getIop_id()) != null) {
            return iop_id;
        }
        return super.getIop_id();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getModelNames() {
        return super.getModelNames();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getModel_names_sec() {
        String model_names_sec;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (model_names_sec = kEffect.getModel_names_sec()) != null) {
            return model_names_sec;
        }
        return super.getModel_names_sec();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getMusic() {
        List<String> music;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (music = kEffect.getMusic()) != null) {
            return music;
        }
        return super.getMusic();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (name = kEffect.getName()) != null) {
            return name;
        }
        return super.getName();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getOriginal_effect_id() {
        String original_effect_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (original_effect_id = kEffect.getOriginal_effect_id()) != null) {
            return original_effect_id;
        }
        return super.getOriginal_effect_id();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getPanel() {
        String panel;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (panel = kEffect.getPanel()) != null) {
            return panel;
        }
        return super.getPanel();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getParent() {
        String parent;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (parent = kEffect.getParent()) != null) {
            return parent;
        }
        return super.getParent();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getParentId() {
        return super.getParentId();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public long getPtime() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getPtime();
        }
        return super.getPtime();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public long getPublishTime() {
        return super.getPublishTime();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getRecId() {
        String recId;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (recId = kEffect.getRecId()) != null) {
            return recId;
        }
        return super.getRecId();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public long getRec_tag() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getRec_tag();
        }
        return super.getRec_tag();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getRequirements() {
        List<String> requirements;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (requirements = kEffect.getRequirements()) != null) {
            return requirements;
        }
        return super.getRequirements();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getResourceId() {
        return super.getResourceId();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getResource_id() {
        String resource_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (resource_id = kEffect.getResource_id()) != null) {
            return resource_id;
        }
        return super.getResource_id();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getSchema() {
        String schema;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (schema = kEffect.getSchema()) != null) {
            return schema;
        }
        return super.getSchema();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getSdkExtra() {
        return super.getSdkExtra();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getSdk_extra() {
        String sdk_extra;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (sdk_extra = kEffect.getSdk_extra()) != null) {
            return sdk_extra;
        }
        return super.getSdk_extra();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getSearchType() {
        String searchType;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (searchType = kEffect.getSearchType()) != null) {
            return searchType;
        }
        return super.getSearchType();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getServer_extra() {
        String server_extra;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (server_extra = kEffect.getServer_extra()) != null) {
            return server_extra;
        }
        return super.getServer_extra();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int getSource() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getSource();
        }
        return super.getSource();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (tags = kEffect.getTags()) != null) {
            return tags;
        }
        return super.getTags();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public String getTagsUpdatedAt() {
        return super.getTagsUpdatedAt();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (tags_updated_at = kEffect.getTags_updated_at()) != null) {
            return tags_updated_at;
        }
        return super.getTags_updated_at();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public TemplateEffectExtra getTemplate_effect_extra() {
        TemplateEffectExtra template_effect_extra;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (template_effect_extra = kEffect.getTemplate_effect_extra()) != null) {
            return template_effect_extra;
        }
        return super.getTemplate_effect_extra();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getTemplate_effect_id() {
        String template_effect_id;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (template_effect_id = kEffect.getTemplate_effect_id()) != null) {
            return template_effect_id;
        }
        return super.getTemplate_effect_id();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getTransResPath() {
        String transResPath;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (transResPath = kEffect.getTransResPath()) != null) {
            return transResPath;
        }
        return super.getTransResPath();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public com.ss.ugc.effectplatform.model.UrlModel getTrans_file_url() {
        com.ss.ugc.effectplatform.model.UrlModel trans_file_url;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (trans_file_url = kEffect.getTrans_file_url()) != null) {
            return trans_file_url;
        }
        return super.getTrans_file_url();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public List<String> getTypes() {
        List<String> types;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (types = kEffect.getTypes()) != null) {
            return types;
        }
        return super.getTypes();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getUnzipPath() {
        String unzipPath;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (unzipPath = kEffect.getUnzipPath()) != null) {
            return unzipPath;
        }
        return super.getUnzipPath();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public long getUse_number() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getUse_number();
        }
        return super.getUse_number();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String getZipPath() {
        String zipPath;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null && (zipPath = kEffect.getZipPath()) != null) {
            return zipPath;
        }
        return super.getZipPath();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public boolean isBusiness() {
        return super.isBusiness();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean isDownloaded() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.isDownloaded();
        }
        return super.isDownloaded();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public boolean isIsIop() {
        return super.isIsIop();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean is_busi() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.is_busi();
        }
        return super.is_busi();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean is_iop() {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.is_iop();
        }
        return super.is_iop();
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public com.ss.ugc.effectplatform.model.Effect getKEffect() {
        return this.kEffect;
    }

    public Effect(com.ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.kEffect = effect;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            String ad_raw_data = kEffect.getAd_raw_data();
            if (ad_raw_data != null) {
                super.setAd_raw_data(ad_raw_data);
            }
            List<String> bind_ids = kEffect.getBind_ids();
            if (bind_ids != null) {
                super.setBind_ids(bind_ids);
            }
            List<String> challenge = kEffect.getChallenge();
            if (challenge != null) {
                super.setChallenge(challenge);
            }
            List<com.ss.ugc.effectplatform.model.Effect> child_effects = kEffect.getChild_effects();
            if (child_effects != null) {
                super.setChild_effects(child_effects);
            }
            List<String> children = kEffect.getChildren();
            if (children != null) {
                super.setChildren(children);
            }
            List<String> composerPath = kEffect.getComposerPath();
            if (composerPath != null) {
                super.setComposerPath(composerPath);
            }
            String composer_params = kEffect.getComposer_params();
            if (composer_params != null) {
                super.setComposer_params(composer_params);
            }
            String designer_encrypted_id = kEffect.getDesigner_encrypted_id();
            if (designer_encrypted_id != null) {
                super.setDesigner_encrypted_id(designer_encrypted_id);
            }
            String designer_id = kEffect.getDesigner_id();
            if (designer_id != null) {
                super.setDesigner_id(designer_id);
            }
            String device_platform = kEffect.getDevice_platform();
            if (device_platform != null) {
                super.setDevice_platform(device_platform);
            }
            String doc_id = kEffect.getDoc_id();
            if (doc_id != null) {
                super.setDoc_id(doc_id);
            }
            String effect_id = kEffect.getEffect_id();
            if (effect_id != null) {
                super.setEffect_id(effect_id);
            }
            String effect_source_id = kEffect.getEffect_source_id();
            if (effect_source_id != null) {
                super.setEffect_source_id(effect_source_id);
            }
            super.setEffect_type(kEffect.getEffect_type());
            String extra = kEffect.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            DiffEffect file_diff = kEffect.getFile_diff();
            if (file_diff != null) {
                super.setFile_diff(file_diff);
            }
            com.ss.ugc.effectplatform.model.UrlModel file_url = kEffect.getFile_url();
            if (file_url != null) {
                super.setFile_url(file_url);
            }
            String grade_key = kEffect.getGrade_key();
            if (grade_key != null) {
                super.setGrade_key(grade_key);
            }
            String hint = kEffect.getHint();
            if (hint != null) {
                super.setHint(hint);
            }
            com.ss.ugc.effectplatform.model.UrlModel hint_file = kEffect.getHint_file();
            if (hint_file != null) {
                super.setHint_file(hint_file);
            }
            super.setHint_file_format(kEffect.getHint_file_format());
            com.ss.ugc.effectplatform.model.UrlModel hint_icon = kEffect.getHint_icon();
            if (hint_icon != null) {
                super.setHint_icon(hint_icon);
            }
            com.ss.ugc.effectplatform.model.UrlModel icon_url = kEffect.getIcon_url();
            if (icon_url != null) {
                super.setIcon_url(icon_url);
            }
            String id = kEffect.getId();
            if (id != null) {
                super.setId(id);
            }
            String iop_id = kEffect.getIop_id();
            if (iop_id != null) {
                super.setIop_id(iop_id);
            }
            super.setDownloaded(kEffect.isDownloaded());
            super.set_busi(kEffect.is_busi());
            super.set_iop(kEffect.is_iop());
            String model_names = kEffect.getModel_names();
            if (model_names != null) {
                setModel_names(model_names);
            }
            String model_names_sec = kEffect.getModel_names_sec();
            if (model_names_sec != null) {
                super.setModel_names_sec(model_names_sec);
            }
            List<String> music = kEffect.getMusic();
            if (music != null) {
                super.setMusic(music);
            }
            String name = kEffect.getName();
            if (name != null) {
                super.setName(name);
            }
            String original_effect_id = kEffect.getOriginal_effect_id();
            if (original_effect_id != null) {
                super.setOriginal_effect_id(original_effect_id);
            }
            String panel = kEffect.getPanel();
            if (panel != null) {
                super.setPanel(panel);
            }
            String parent = kEffect.getParent();
            if (parent != null) {
                super.setParent(parent);
            }
            super.setPtime(kEffect.getPtime());
            String recId = kEffect.getRecId();
            if (recId != null) {
                super.setRecId(recId);
            }
            super.setRec_tag(kEffect.getRec_tag());
            List<String> requirements = kEffect.getRequirements();
            if (requirements != null) {
                super.setRequirements(requirements);
            }
            List<String> requirements_sec = kEffect.getRequirements_sec();
            if (requirements_sec != null) {
                setRequirements_sec(requirements_sec);
            }
            String resource_id = kEffect.getResource_id();
            if (resource_id != null) {
                super.setResource_id(resource_id);
            }
            String schema = kEffect.getSchema();
            if (schema != null) {
                super.setSchema(schema);
            }
            String sdk_extra = kEffect.getSdk_extra();
            if (sdk_extra != null) {
                super.setSdk_extra(sdk_extra);
            }
            String searchType = kEffect.getSearchType();
            if (searchType != null) {
                super.setSearchType(searchType);
            }
            String server_extra = kEffect.getServer_extra();
            if (server_extra != null) {
                super.setServer_extra(server_extra);
            }
            super.setSource(kEffect.getSource());
            List<String> tags = kEffect.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kEffect.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
            TemplateEffectExtra template_effect_extra = kEffect.getTemplate_effect_extra();
            if (template_effect_extra != null) {
                super.setTemplate_effect_extra(template_effect_extra);
            }
            String template_effect_id = kEffect.getTemplate_effect_id();
            if (template_effect_id != null) {
                super.setTemplate_effect_id(template_effect_id);
            }
            String transResPath = kEffect.getTransResPath();
            if (transResPath != null) {
                super.setTransResPath(transResPath);
            }
            com.ss.ugc.effectplatform.model.UrlModel trans_file_url = kEffect.getTrans_file_url();
            if (trans_file_url != null) {
                super.setTrans_file_url(trans_file_url);
            }
            List<String> types = kEffect.getTypes();
            if (types != null) {
                super.setTypes(types);
            }
            List<String> types_sec = kEffect.getTypes_sec();
            if (types_sec != null) {
                setTypes_sec(types_sec);
            }
            String unzipPath = kEffect.getUnzipPath();
            if (unzipPath != null) {
                super.setUnzipPath(unzipPath);
            }
            super.setUse_number(kEffect.getUse_number());
            String zipPath = kEffect.getZipPath();
            if (zipPath != null) {
                super.setZipPath(zipPath);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setAdRawData(String value) {
        o.LJIIJ(value, "value");
        super.setAdRawData(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setAd_raw_data(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setAd_raw_data(value);
        }
        super.setAd_raw_data(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setBindIds(List<String> list) {
        super.setBindIds(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setBind_ids(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setBind_ids(list);
        }
        super.setBind_ids(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setBusiness(boolean z) {
        super.setBusiness(z);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setChallenge(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setChallenge(list);
        }
        super.setChallenge(list);
    }

    public final void setChildEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setChild_effects(value);
        }
        super.setChild_effects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setChild_effects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setChild_effects(value);
        }
        super.setChild_effects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setChildren(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setChildren(list);
        }
        super.setChildren(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setComposerParams(String value) {
        o.LJIIJ(value, "value");
        super.setComposerParams(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setComposerPath(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setComposerPath(list);
        }
        super.setComposerPath(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setComposer_params(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setComposer_params(value);
        }
        super.setComposer_params(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDesignerEncryptedId(String value) {
        o.LJIIJ(value, "value");
        super.setDesignerEncryptedId(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDesignerId(String value) {
        o.LJIIJ(value, "value");
        super.setDesignerId(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDesigner_encrypted_id(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setDesigner_encrypted_id(value);
        }
        super.setDesigner_encrypted_id(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDesigner_id(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setDesigner_id(value);
        }
        super.setDesigner_id(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setDevicePlatform(String value) {
        o.LJIIJ(value, "value");
        super.setDevicePlatform(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDevice_platform(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setDevice_platform(value);
        }
        super.setDevice_platform(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDoc_id(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setDoc_id(str);
        }
        super.setDoc_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setDownloaded(boolean z) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setDownloaded(z);
        }
        super.setDownloaded(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setEffectId(String value) {
        o.LJIIJ(value, "value");
        super.setEffectId(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setEffectType(int i) {
        super.setEffectType(i);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setEffect_id(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setEffect_id(value);
        }
        super.setEffect_id(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setEffect_source_id(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setEffect_source_id(str);
        }
        super.setEffect_source_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setEffect_type(int i) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setEffect_type(i);
        }
        super.setEffect_type(i);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setFileUrl(UrlModel value) {
        o.LJIIJ(value, "value");
        super.setFileUrl(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setFile_diff(DiffEffect diffEffect) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setFile_diff(diffEffect);
        }
        super.setFile_diff(diffEffect);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setFile_url(com.ss.ugc.effectplatform.model.UrlModel value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setFile_url(value);
        }
        super.setFile_url(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setGradeKey(String value) {
        o.LJIIJ(value, "value");
        super.setGradeKey(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setGrade_key(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setGrade_key(value);
        }
        super.setGrade_key(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setHint(value);
        }
        super.setHint(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintFile(UrlModel value) {
        o.LJIIJ(value, "value");
        super.setHintFile(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintFileFormat(int i) {
        super.setHintFileFormat(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setHintIcon(UrlModel value) {
        o.LJIIJ(value, "value");
        super.setHintIcon(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint_file(com.ss.ugc.effectplatform.model.UrlModel value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setHint_file(value);
        }
        super.setHint_file(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint_file_format(int i) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setHint_file_format(i);
        }
        super.setHint_file_format(i);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setHint_icon(com.ss.ugc.effectplatform.model.UrlModel value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setHint_icon(value);
        }
        super.setHint_icon(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIconUrl(UrlModel value) {
        o.LJIIJ(value, "value");
        super.setIconUrl(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setIcon_url(com.ss.ugc.effectplatform.model.UrlModel value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setIcon_url(value);
        }
        super.setIcon_url(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setId(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setId(value);
        }
        super.setId(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIopId(String value) {
        o.LJIIJ(value, "value");
        super.setIopId(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setIop_id(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setIop_id(value);
        }
        super.setIop_id(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setIsIop(boolean z) {
        super.setIsIop(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setModelNames(String str) {
        super.setModelNames(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setModel_names_sec(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setModel_names_sec(str);
        }
        super.setModel_names_sec(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setMusic(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setMusic(list);
        }
        super.setMusic(list);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setName(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setName(value);
        }
        super.setName(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setOriginal_effect_id(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setOriginal_effect_id(str);
        }
        super.setOriginal_effect_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setPanel(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setPanel(value);
        }
        super.setPanel(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setParent(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setParent(str);
        }
        super.setParent(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setParentId(String str) {
        super.setParentId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setPtime(long j) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setPtime(j);
        }
        super.setPtime(j);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setPublishTime(long j) {
        super.setPublishTime(j);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setRecId(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setRecId(str);
        }
        super.setRecId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setRec_tag(long j) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setRec_tag(j);
        }
        super.setRec_tag(j);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setRequirements(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setRequirements(value);
        }
        super.setRequirements(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setResourceId(String value) {
        o.LJIIJ(value, "value");
        super.setResourceId(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setResource_id(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setResource_id(value);
        }
        super.setResource_id(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setSchema(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setSchema(value);
        }
        super.setSchema(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setSdkExtra(String value) {
        o.LJIIJ(value, "value");
        super.setSdkExtra(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setSdk_extra(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setSdk_extra(value);
        }
        super.setSdk_extra(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setSearchType(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setSearchType(value);
        }
        super.setSearchType(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setServer_extra(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setServer_extra(str);
        }
        super.setServer_extra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setSource(int i) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setSource(i);
        }
        super.setSource(i);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTags(List<String> list) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setTags(list);
        }
        super.setTags(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate
    public void setTagsUpdatedAt(String value) {
        o.LJIIJ(value, "value");
        super.setTagsUpdatedAt(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTags_updated_at(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setTags_updated_at(value);
        }
        super.setTags_updated_at(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTemplate_effect_extra(TemplateEffectExtra templateEffectExtra) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setTemplate_effect_extra(templateEffectExtra);
        }
        super.setTemplate_effect_extra(templateEffectExtra);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTemplate_effect_id(String str) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setTemplate_effect_id(str);
        }
        super.setTemplate_effect_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTransResPath(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setTransResPath(value);
        }
        super.setTransResPath(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTrans_file_url(com.ss.ugc.effectplatform.model.UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setTrans_file_url(urlModel);
        }
        super.setTrans_file_url(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setTypes(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setTypes(value);
        }
        super.setTypes(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setUnzipPath(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setUnzipPath(value);
        }
        super.setUnzipPath(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setUse_number(long j) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setUse_number(j);
        }
        super.setUse_number(j);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void setZipPath(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setZipPath(value);
        }
        super.setZipPath(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void set_busi(boolean z) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.set_busi(z);
        }
        super.set_busi(z);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void set_iop(boolean z) {
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.set_iop(z);
        }
        super.set_iop(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIJ(dest, "dest");
        if (getKEffect() != null) {
            com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.writeToParcel(dest, i);
                return;
            }
            return;
        }
        super.writeToParcel(dest, i);
    }

    public /* synthetic */ Effect(com.ss.ugc.effectplatform.model.Effect effect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect);
    }
}
