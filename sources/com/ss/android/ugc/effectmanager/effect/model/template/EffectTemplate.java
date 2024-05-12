package com.ss.android.ugc.effectmanager.effect.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.ugc.effectplatform.model.Effect;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectTemplate extends Effect implements Serializable, Parcelable {
    public static final CREATOR CREATOR = new CREATOR();
    public String adRawData;
    public List<String> bindIds;
    public List<? extends EffectTemplate> childEffects_Own;
    public String composerParams;
    public String designerEncryptedId;
    public String designerId;
    public String devicePlatform;
    public String effectId;
    public int effectType;
    public UrlModel fileUrl;
    public String gradeKey;
    public UrlModel hintFile;
    public int hintFileFormat;
    public UrlModel hintIcon;
    public UrlModel iconUrl;
    public String iopId;
    public boolean isBusiness;
    public boolean isIsIop;
    public final transient Effect kEffect;
    public String modelNames;
    public String parentId;
    public long publishTime;
    public String resourceId;
    public String sdkExtra;
    public String tagsUpdatedAt;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdRawData() {
        String ad_raw_data;
        Effect kEffect = getKEffect();
        if (kEffect != null && (ad_raw_data = kEffect.getAd_raw_data()) != null) {
            return ad_raw_data;
        }
        return super.getAd_raw_data();
    }

    public List<String> getBindIds() {
        List<String> bind_ids;
        Effect kEffect = getKEffect();
        if (kEffect != null && (bind_ids = kEffect.getBind_ids()) != null) {
            return bind_ids;
        }
        return super.getBind_ids();
    }

    public String getComposerParams() {
        String composer_params;
        Effect kEffect = getKEffect();
        if (kEffect != null && (composer_params = kEffect.getComposer_params()) != null) {
            return composer_params;
        }
        return super.getComposer_params();
    }

    public String getDesignerEncryptedId() {
        String designer_encrypted_id;
        Effect kEffect = getKEffect();
        if (kEffect != null && (designer_encrypted_id = kEffect.getDesigner_encrypted_id()) != null) {
            return designer_encrypted_id;
        }
        return super.getDesigner_encrypted_id();
    }

    public String getDesignerId() {
        String designer_id;
        Effect kEffect = getKEffect();
        if (kEffect != null && (designer_id = kEffect.getDesigner_id()) != null) {
            return designer_id;
        }
        return super.getDesigner_id();
    }

    public String getDevicePlatform() {
        String device_platform;
        Effect kEffect = getKEffect();
        if (kEffect != null && (device_platform = kEffect.getDevice_platform()) != null) {
            return device_platform;
        }
        return super.getDevice_platform();
    }

    public String getEffectId() {
        String effect_id;
        Effect kEffect = getKEffect();
        if (kEffect != null && (effect_id = kEffect.getEffect_id()) != null) {
            return effect_id;
        }
        return super.getEffect_id();
    }

    public int getEffectType() {
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getEffect_type();
        }
        return super.getEffect_type();
    }

    public UrlModel getFileUrl() {
        com.ss.ugc.effectplatform.model.UrlModel file_url;
        Effect kEffect = getKEffect();
        if (kEffect == null || (file_url = kEffect.getFile_url()) == null) {
            file_url = super.getFile_url();
        }
        if (file_url instanceof UrlModel) {
            return (UrlModel) file_url;
        }
        UrlModel urlModel = new UrlModel(file_url);
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setFile_url(urlModel);
        }
        super.setFile_url(urlModel);
        return urlModel;
    }

    public String getGradeKey() {
        String grade_key;
        Effect kEffect = getKEffect();
        if (kEffect != null && (grade_key = kEffect.getGrade_key()) != null) {
            return grade_key;
        }
        return super.getGrade_key();
    }

    public UrlModel getHintFile() {
        com.ss.ugc.effectplatform.model.UrlModel hint_file;
        Effect kEffect = getKEffect();
        if (kEffect == null || (hint_file = kEffect.getHint_file()) == null) {
            hint_file = super.getHint_file();
        }
        if (hint_file instanceof UrlModel) {
            return (UrlModel) hint_file;
        }
        UrlModel urlModel = new UrlModel(hint_file);
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_file(urlModel);
        }
        super.setHint_file(urlModel);
        return urlModel;
    }

    public int getHintFileFormat() {
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getHint_file_format();
        }
        return super.getHint_file_format();
    }

    public UrlModel getHintIcon() {
        com.ss.ugc.effectplatform.model.UrlModel hint_icon;
        Effect kEffect = getKEffect();
        if (kEffect == null || (hint_icon = kEffect.getHint_icon()) == null) {
            hint_icon = super.getHint_icon();
        }
        if (hint_icon instanceof UrlModel) {
            return (UrlModel) hint_icon;
        }
        UrlModel urlModel = new UrlModel(hint_icon);
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_icon(urlModel);
        }
        super.setHint_icon(urlModel);
        return urlModel;
    }

    public UrlModel getIconUrl() {
        com.ss.ugc.effectplatform.model.UrlModel icon_url;
        Effect kEffect = getKEffect();
        if (kEffect == null || (icon_url = kEffect.getIcon_url()) == null) {
            icon_url = super.getIcon_url();
        }
        if (icon_url instanceof UrlModel) {
            return (UrlModel) icon_url;
        }
        UrlModel urlModel = new UrlModel(icon_url);
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setIcon_url(urlModel);
        }
        super.setIcon_url(urlModel);
        return urlModel;
    }

    public String getIopId() {
        String iop_id;
        Effect kEffect = getKEffect();
        if (kEffect != null && (iop_id = kEffect.getIop_id()) != null) {
            return iop_id;
        }
        return super.getIop_id();
    }

    public String getModelNames() {
        String model_names;
        Effect kEffect = getKEffect();
        if (kEffect != null && (model_names = kEffect.getModel_names()) != null) {
            return model_names;
        }
        return getModel_names();
    }

    public String getParentId() {
        String parent;
        Effect kEffect = getKEffect();
        if (kEffect != null && (parent = kEffect.getParent()) != null) {
            return parent;
        }
        return super.getParent();
    }

    public long getPublishTime() {
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.getPtime();
        }
        return super.getPtime();
    }

    public String getResourceId() {
        String resource_id;
        Effect kEffect = getKEffect();
        if (kEffect != null && (resource_id = kEffect.getResource_id()) != null) {
            return resource_id;
        }
        return super.getResource_id();
    }

    public String getSdkExtra() {
        String sdk_extra;
        Effect kEffect = getKEffect();
        if (kEffect != null && (sdk_extra = kEffect.getSdk_extra()) != null) {
            return sdk_extra;
        }
        return super.getSdk_extra();
    }

    public String getTagsUpdatedAt() {
        String tags_updated_at;
        Effect kEffect = getKEffect();
        if (kEffect != null && (tags_updated_at = kEffect.getTags_updated_at()) != null) {
            return tags_updated_at;
        }
        return super.getTags_updated_at();
    }

    public boolean isBusiness() {
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.is_busi();
        }
        return super.is_busi();
    }

    public boolean isIsIop() {
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            return kEffect.is_iop();
        }
        return super.is_iop();
    }

    /* loaded from: classes7.dex */
    public static final class CREATOR implements Parcelable.Creator<EffectTemplate> {
        public CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EffectTemplate createFromParcel(Parcel parcel) {
            Object obj;
            o.LJIIJ(parcel, "parcel");
            Effect effect = null;
            try {
                Object obj2 = Effect.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof Effect)) {
                    obj = null;
                }
                effect = (Effect) obj;
            } catch (Exception unused) {
            }
            return new EffectTemplate(effect);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EffectTemplate[] newArray(int i) {
            return new EffectTemplate[i];
        }
    }

    public final List<EffectTemplate> getChildEffects_Own() {
        return this.childEffects_Own;
    }

    public Effect getKEffect() {
        return this.kEffect;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EffectTemplate(com.ss.ugc.effectplatform.model.Effect r69) {
        /*
            r68 = this;
            r5 = 0
            r3 = 0
            r15 = 0
            r39 = 0
            r65 = -1
            r66 = 33554431(0x1ffffff, float:9.403954E-38)
            r4 = r68
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r16 = r5
            r17 = r5
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r15
            r24 = r15
            r25 = r5
            r26 = r5
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r32 = r5
            r33 = r5
            r34 = r15
            r35 = r5
            r36 = r15
            r37 = r5
            r38 = r5
            r41 = r5
            r42 = r5
            r43 = r39
            r45 = r5
            r46 = r5
            r47 = r5
            r48 = r5
            r49 = r5
            r50 = r15
            r51 = r5
            r52 = r5
            r53 = r5
            r54 = r5
            r55 = r5
            r56 = r5
            r57 = r5
            r58 = r5
            r59 = r5
            r60 = r39
            r62 = r5
            r63 = r5
            r64 = r5
            r67 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r63, r64, r65, r66, r67)
            r0 = r69
            r4.kEffect = r0
            java.lang.String r2 = ""
            r4.effectId = r2
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = new com.ss.android.ugc.effectmanager.common.model.UrlModel
            r1 = 1
            r0.<init>(r3, r1, r3)
            r4.fileUrl = r0
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = new com.ss.android.ugc.effectmanager.common.model.UrlModel
            r0.<init>(r3, r1, r3)
            r4.iconUrl = r0
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = new com.ss.android.ugc.effectmanager.common.model.UrlModel
            r0.<init>(r3, r1, r3)
            r4.hintIcon = r0
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = new com.ss.android.ugc.effectmanager.common.model.UrlModel
            r0.<init>(r3, r1, r3)
            r4.hintFile = r0
            r4.tagsUpdatedAt = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.childEffects_Own = r0
            r4.designerId = r2
            r4.designerEncryptedId = r2
            r4.sdkExtra = r2
            r4.adRawData = r2
            r4.iopId = r2
            r4.resourceId = r2
            r4.gradeKey = r2
            r4.devicePlatform = r2
            r4.composerParams = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate.<init>(com.ss.ugc.effectplatform.model.Effect):void");
    }

    public void setAdRawData(String value) {
        o.LJIIJ(value, "value");
        this.adRawData = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setAd_raw_data(value);
                return;
            }
            return;
        }
        super.setAd_raw_data(value);
    }

    public void setBindIds(List<String> list) {
        this.bindIds = list;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setBind_ids(list);
                return;
            }
            return;
        }
        super.setBind_ids(list);
    }

    public void setBusiness(boolean z) {
        this.isBusiness = z;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.set_busi(z);
                return;
            }
            return;
        }
        super.set_busi(z);
    }

    public final void setChildEffects_Own(List<? extends EffectTemplate> list) {
        o.LJIIJ(list, "<set-?>");
        this.childEffects_Own = list;
    }

    public void setComposerParams(String value) {
        o.LJIIJ(value, "value");
        this.composerParams = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setComposer_params(value);
                return;
            }
            return;
        }
        super.setComposer_params(value);
    }

    public void setDesignerEncryptedId(String value) {
        o.LJIIJ(value, "value");
        this.designerEncryptedId = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setDesigner_encrypted_id(value);
                return;
            }
            return;
        }
        super.setDesigner_encrypted_id(value);
    }

    public void setDesignerId(String value) {
        o.LJIIJ(value, "value");
        this.designerId = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setDesigner_id(value);
                return;
            }
            return;
        }
        super.setDesigner_id(value);
    }

    public void setDevicePlatform(String value) {
        o.LJIIJ(value, "value");
        this.devicePlatform = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setDevice_platform(value);
                return;
            }
            return;
        }
        super.setDevice_platform(value);
    }

    public void setEffectId(String value) {
        o.LJIIJ(value, "value");
        this.effectId = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setEffect_id(value);
                return;
            }
            return;
        }
        super.setEffect_id(value);
    }

    public void setEffectType(int i) {
        this.effectType = i;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setEffect_type(i);
                return;
            }
            return;
        }
        super.setEffect_type(i);
    }

    public void setFileUrl(UrlModel value) {
        o.LJIIJ(value, "value");
        this.fileUrl = value;
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setFile_url(value);
        }
        super.setFile_url(value);
    }

    public void setGradeKey(String value) {
        o.LJIIJ(value, "value");
        this.gradeKey = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setGrade_key(value);
                return;
            }
            return;
        }
        super.setGrade_key(value);
    }

    public void setHintFile(UrlModel value) {
        o.LJIIJ(value, "value");
        this.hintFile = value;
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setHint_file(value);
        }
        super.setHint_file(value);
    }

    public void setHintFileFormat(int i) {
        this.hintFileFormat = i;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setHint_file_format(i);
                return;
            }
            return;
        }
        super.setHint_file_format(i);
    }

    public void setHintIcon(UrlModel value) {
        o.LJIIJ(value, "value");
        this.hintIcon = value;
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setHint_icon(value);
        }
        super.setHint_icon(value);
    }

    public void setIconUrl(UrlModel value) {
        o.LJIIJ(value, "value");
        this.iconUrl = value;
        Effect kEffect = getKEffect();
        if (kEffect != null) {
            kEffect.setIcon_url(value);
        }
        super.setIcon_url(value);
    }

    public void setIopId(String value) {
        o.LJIIJ(value, "value");
        this.iopId = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setIop_id(value);
                return;
            }
            return;
        }
        super.setIop_id(value);
    }

    public void setIsIop(boolean z) {
        this.isIsIop = z;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.set_iop(z);
                return;
            }
            return;
        }
        super.set_iop(z);
    }

    public void setModelNames(String str) {
        this.modelNames = str;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setModel_names(str);
                return;
            }
            return;
        }
        setModel_names(str);
    }

    public void setParentId(String str) {
        this.parentId = str;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setParent(str);
                return;
            }
            return;
        }
        super.setParent(str);
    }

    public void setPublishTime(long j) {
        this.publishTime = j;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setPtime(j);
                return;
            }
            return;
        }
        super.setPtime(j);
    }

    public void setResourceId(String value) {
        o.LJIIJ(value, "value");
        this.resourceId = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setResource_id(value);
                return;
            }
            return;
        }
        super.setResource_id(value);
    }

    public void setSdkExtra(String value) {
        o.LJIIJ(value, "value");
        this.sdkExtra = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setSdk_extra(value);
                return;
            }
            return;
        }
        super.setSdk_extra(value);
    }

    public void setTagsUpdatedAt(String value) {
        o.LJIIJ(value, "value");
        this.tagsUpdatedAt = value;
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.setTags_updated_at(value);
                return;
            }
            return;
        }
        super.setTags_updated_at(value);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        if (getKEffect() != null) {
            Effect kEffect = getKEffect();
            if (kEffect != null) {
                kEffect.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    public /* synthetic */ EffectTemplate(Effect effect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effect);
    }
}
