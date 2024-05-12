package com.bytedance.ies.cutsame.cut_android;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;

/* loaded from: classes3.dex */
public interface NLEPrepareListener {
    void onError(int i, String str);

    void onPreSuccess(NLETemplateModel nLETemplateModel);

    void onProgress(float f, String str);

    void onSuccess(NLETemplateModel nLETemplateModel);
}
