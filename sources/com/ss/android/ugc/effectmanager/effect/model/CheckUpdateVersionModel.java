package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class CheckUpdateVersionModel extends CheckUpdateVersionModelTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckUpdateVersionModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public String getCursor() {
        String cursor;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel = getKUpdateModel();
        if (kUpdateModel != null && (cursor = kUpdateModel.getCursor()) != null) {
            return cursor;
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public String getSorting_position() {
        String sorting_position;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel = getKUpdateModel();
        if (kUpdateModel != null && (sorting_position = kUpdateModel.getSorting_position()) != null) {
            return sorting_position;
        }
        return super.getSorting_position();
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel = getKUpdateModel();
        if (kUpdateModel != null && (version = kUpdateModel.getVersion()) != null) {
            return version;
        }
        return super.getVersion();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate
    public com.ss.ugc.effectplatform.model.CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    public CheckUpdateVersionModel(com.ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel) {
        super(checkUpdateVersionModel);
        this.kUpdateModel = checkUpdateVersionModel;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel = getKUpdateModel();
        if (kUpdateModel != null) {
            String cursor = kUpdateModel.getCursor();
            if (cursor != null) {
                super.setCursor(cursor);
            }
            String sorting_position = kUpdateModel.getSorting_position();
            if (sorting_position != null) {
                super.setSorting_position(sorting_position);
            }
            String version = kUpdateModel.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public void setCursor(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel = getKUpdateModel();
        if (kUpdateModel != null) {
            kUpdateModel.setCursor(str);
        }
        super.setCursor(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public void setSorting_position(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel = getKUpdateModel();
        if (kUpdateModel != null) {
            kUpdateModel.setSorting_position(str);
        }
        super.setSorting_position(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public void setVersion(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel = getKUpdateModel();
        if (kUpdateModel != null) {
            kUpdateModel.setVersion(str);
        }
        super.setVersion(str);
    }

    public /* synthetic */ CheckUpdateVersionModel(com.ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
