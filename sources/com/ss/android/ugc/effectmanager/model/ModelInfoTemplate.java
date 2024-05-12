package com.ss.android.ugc.effectmanager.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class ModelInfoTemplate extends com.ss.ugc.effectplatform.model.algorithm.ModelInfo {
    public ExtendedUrlModel fileUrl;
    public final transient com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ModelInfoTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ExtendedUrlModel getFileUrl() {
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel file_url;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo == null || (file_url = kModelInfo.getFile_url()) == null) {
            file_url = super.getFile_url();
        }
        return new ExtendedUrlModel(file_url);
    }

    public String getMD5() {
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel file_url = getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }

    public com.ss.ugc.effectplatform.model.algorithm.ModelInfo getKModelInfo() {
        return this.kModelInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ModelInfoTemplate(com.ss.ugc.effectplatform.model.algorithm.ModelInfo r12) {
        /*
            r11 = this;
            r1 = 0
            r5 = 0
            r7 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r8 = r7
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            r0.kModelInfo = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.model.ModelInfoTemplate.<init>(com.ss.ugc.effectplatform.model.algorithm.ModelInfo):void");
    }

    public void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        this.fileUrl = extendedUrlModel;
        com.ss.ugc.effectplatform.model.algorithm.ModelInfo kModelInfo = getKModelInfo();
        if (kModelInfo != null) {
            kModelInfo.setFile_url(extendedUrlModel);
        }
        super.setFile_url(extendedUrlModel);
    }

    public /* synthetic */ ModelInfoTemplate(com.ss.ugc.effectplatform.model.algorithm.ModelInfo modelInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : modelInfo);
    }
}
