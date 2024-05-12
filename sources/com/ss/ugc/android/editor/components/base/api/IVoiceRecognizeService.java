package com.ss.ugc.android.editor.components.base.api;

import X.XSE;
import X.XSF;
import X.XSG;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes16.dex */
public interface IVoiceRecognizeService extends IService {
    void audioToText(NLEModel nLEModel, XSE xse);

    void init(XSF xsf);

    void textToAudioReading(String str, String str2);

    void textToAudioSaving(String str, String str2, XSG xsg);
}
