package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;

/* renamed from: X.4te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123904te {
    public static void LIZ(CanvasBackground canvasBackground, NLEStyCanvas nLEStyCanvas) {
        int type = canvasBackground.getType();
        if (type != 2) {
            if (type != 3) {
                nLEStyCanvas.LIZ(EnumC123894td.COLOR);
                NLEEditorJniJNI.NLEStyCanvas_setColor(nLEStyCanvas.LIZ, nLEStyCanvas, canvasBackground.getStartColor());
            } else {
                nLEStyCanvas.LIZ(EnumC123894td.IMAGE);
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.LJIIIZ(canvasBackground.getFilePath());
                NLEEditorJniJNI.NLEStyCanvas_setImage(nLEStyCanvas.LIZ, nLEStyCanvas, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
            }
        } else {
            nLEStyCanvas.LIZ(EnumC123894td.GRADIENT_COLOR);
            NLEEditorJniJNI.NLEStyCanvas_setStartColor(nLEStyCanvas.LIZ, nLEStyCanvas, canvasBackground.getStartColor());
            NLEEditorJniJNI.NLEStyCanvas_setEndColor(nLEStyCanvas.LIZ, nLEStyCanvas, canvasBackground.getEndColor());
        }
        NLEEditorJniJNI.NLEStyCanvas_setAntialiasing(nLEStyCanvas.LIZ, nLEStyCanvas, true);
    }
}
