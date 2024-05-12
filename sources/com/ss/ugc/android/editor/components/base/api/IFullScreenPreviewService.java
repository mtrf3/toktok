package com.ss.ugc.android.editor.components.base.api;

import X.C52Q;
import X.C76800UCe;
import X.InterfaceC134705Qk;
import X.InterfaceC65784Pro;
import X.InterfaceC88473Ynt;
import X.InterfaceC88477Ynx;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.news.common.service.manager.IService;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IFullScreenPreviewService extends IService {
    C52Q getDialogWithCustomControlBar(Activity activity, SurfaceView surfaceView, EditorProContext editorProContext, InterfaceC134705Qk interfaceC134705Qk, InterfaceC134705Qk interfaceC134705Qk2, InterfaceC88477Ynx<? super NLEModel, ? super FrameLayout, ? super Map<String, View>, ? super Long, ? super Float, ? super Float, ? super Float, C76800UCe> interfaceC88477Ynx, InterfaceC88473Ynt<? super Long, ? super Map<String, ? extends View>, ? super NLEModel, C76800UCe> interfaceC88473Ynt, InterfaceC65784Pro<Bitmap> interfaceC65784Pro, View view);

    C52Q getFullScreenPreviewDialog(Activity activity, SurfaceView surfaceView, EditorProContext editorProContext, View view);
}
