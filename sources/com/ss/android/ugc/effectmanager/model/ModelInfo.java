package com.ss.android.ugc.effectmanager.model;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ModelInfo extends ModelInfoTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ModelInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public ExtendedUrlModel getFileUrl() {
        return super.getFileUrl();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel getFile_url() {
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel file_url;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null && (file_url = kModelInfo.getFile_url()) != null) {
            return file_url;
        }
        return super.getFile_url();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public String getMD5() {
        return super.getMD5();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public String getName() {
        String name;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null && (name = kModelInfo.getName()) != null) {
            return name;
        }
        return super.getName();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public String getName_sec() {
        String name_sec;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null && (name_sec = kModelInfo.getName_sec()) != null) {
            return name_sec;
        }
        return super.getName_sec();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public int getStatus() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            return kModelInfo.getStatus();
        }
        return super.getStatus();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public long getTotalSize() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            return kModelInfo.getTotalSize();
        }
        return super.getTotalSize();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public int getType() {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            return kModelInfo.getType();
        }
        return super.getType();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null && (version = kModelInfo.getVersion()) != null) {
            return version;
        }
        return super.getVersion();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public com.ss.ugc.effectplatform.model.algorithm.ModelInfo getKModelInfo() {
        return this.kModelInfo;
    }

    public ModelInfo(com.ss.ugc.effectplatform.model.algorithm.ModelInfo modelInfo) {
        super(modelInfo);
        this.kModelInfo = modelInfo;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel file_url = kModelInfo.getFile_url();
            if (file_url != null) {
                super.setFile_url(file_url);
            }
            String name = kModelInfo.getName();
            if (name != null) {
                super.setName(name);
            }
            String name_sec = kModelInfo.getName_sec();
            if (name_sec != null) {
                super.setName_sec(name_sec);
            }
            super.setStatus(kModelInfo.getStatus());
            super.setTotalSize(kModelInfo.getTotalSize());
            super.setType(kModelInfo.getType());
            String version = kModelInfo.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.model.ModelInfoTemplate
    public void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        super.setFileUrl(extendedUrlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setFile_url(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setFile_url(extendedUrlModel);
        }
        super.setFile_url(extendedUrlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setName(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setName(value);
        }
        super.setName(value);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setName_sec(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setName_sec(value);
        }
        super.setName_sec(value);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setStatus(int i) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setStatus(i);
        }
        super.setStatus(i);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setTotalSize(long j) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setTotalSize(j);
        }
        super.setTotalSize(j);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setType(int i) {
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setType(i);
        }
        super.setType(i);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ModelInfo
    public void setVersion(String value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setVersion(value);
        }
        super.setVersion(value);
    }

    public /* synthetic */ ModelInfo(com.ss.ugc.effectplatform.model.algorithm.ModelInfo modelInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modelInfo);
    }
}
