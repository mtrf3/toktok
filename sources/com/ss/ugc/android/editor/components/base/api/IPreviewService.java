package com.ss.ugc.android.editor.components.base.api;

import X.InterfaceC1278950f;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes3.dex */
public interface IPreviewService extends IService {
    InterfaceC1278950f getPreviewPanel();

    void init(InterfaceC1278950f interfaceC1278950f, NLEEditor nLEEditor, SurfaceView surfaceView);

    void onDestroy();
}
