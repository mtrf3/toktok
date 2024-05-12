package com.ss.ugc.android.editor.components.base.impl;

import X.InterfaceC1278950f;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class PreviewServiceImpl implements IPreviewService {
    public InterfaceC1278950f previewPanel;

    @Override // com.ss.ugc.android.editor.components.base.api.IPreviewService
    public void onDestroy() {
        this.previewPanel = null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IPreviewService
    public InterfaceC1278950f getPreviewPanel() {
        return this.previewPanel;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IPreviewService
    public void init(InterfaceC1278950f interfaceC1278950f, NLEEditor nleEditor, SurfaceView surfaceView) {
        o.LJIIIZ(nleEditor, "nleEditor");
        this.previewPanel = interfaceC1278950f;
        if (surfaceView != null) {
            if (interfaceC1278950f != null) {
                interfaceC1278950f.mf0(surfaceView);
            } else {
                return;
            }
        } else if (interfaceC1278950f == null) {
            return;
        }
        interfaceC1278950f.OW(nleEditor);
    }
}
