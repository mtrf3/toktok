package com.ss.ugc.android.editor.components.fullscreenpreview;

import X.C134685Qi;
import X.C52Q;
import X.C76800UCe;
import X.C79057V0z;
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
import com.ss.ugc.android.editor.components.base.api.IFullScreenPreviewService;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DefaultFullScreenPreviewService implements IFullScreenPreviewService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.android.editor.components.base.api.IFullScreenPreviewService
    public C52Q getFullScreenPreviewDialog(Activity activity, SurfaceView surfaceView, EditorProContext editorContext, View view) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(surfaceView, "surfaceView");
        o.LJIIIZ(editorContext, "editorContext");
        C134685Qi c134685Qi = new C134685Qi(editorContext.getNleSession(), editorContext);
        c134685Qi.LJ = activity;
        c134685Qi.LIZJ = surfaceView;
        if (view != 0) {
            surfaceView = view;
        }
        c134685Qi.LIZLLL = surfaceView;
        c134685Qi.LJFF = C79057V0z.LJJI(editorContext);
        return c134685Qi.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.android.editor.components.base.api.IFullScreenPreviewService
    public C52Q getDialogWithCustomControlBar(Activity activity, SurfaceView surfaceView, EditorProContext editorContext, InterfaceC134705Qk interfaceC134705Qk, InterfaceC134705Qk interfaceC134705Qk2, InterfaceC88477Ynx<? super NLEModel, ? super FrameLayout, ? super Map<String, View>, ? super Long, ? super Float, ? super Float, ? super Float, C76800UCe> interfaceC88477Ynx, InterfaceC88473Ynt<? super Long, ? super Map<String, ? extends View>, ? super NLEModel, C76800UCe> interfaceC88473Ynt, InterfaceC65784Pro<Bitmap> interfaceC65784Pro, View view) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(surfaceView, "surfaceView");
        o.LJIIIZ(editorContext, "editorContext");
        C134685Qi c134685Qi = new C134685Qi(editorContext.getNleSession(), editorContext);
        c134685Qi.LJ = activity;
        c134685Qi.LJII = interfaceC134705Qk2;
        c134685Qi.LJI = interfaceC134705Qk;
        c134685Qi.LJIIIIZZ = interfaceC88477Ynx;
        c134685Qi.LJIIIZ = interfaceC88473Ynt;
        c134685Qi.LJIIJ = interfaceC65784Pro;
        c134685Qi.LIZJ = surfaceView;
        if (view != 0) {
            surfaceView = view;
        }
        c134685Qi.LIZLLL = surfaceView;
        c134685Qi.LJFF = C79057V0z.LJJI(editorContext);
        return c134685Qi.LIZ();
    }
}
