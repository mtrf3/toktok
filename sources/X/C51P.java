package X;

import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.o;

/* renamed from: X.51P */
/* loaded from: classes3.dex */
public final class C51P {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C52T c52t, boolean z, boolean z2) {
        if (c52t != null) {
            c52t.Ua0(C52V.PLAY, z, z2);
            c52t.Ua0(C52V.FULL_SCREEN, z, z2);
            c52t.Ua0(C52V.UNDO, z, z2);
            c52t.Ua0(C52V.REDO, z, z2);
        }
    }

    public static /* synthetic */ void LIZJ(EditorProContext editorProContext, C52T c52t, int i) {
        boolean z;
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = C79057V0z.LJIIJ(editorProContext);
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = C79057V0z.LJIIIZ(editorProContext);
        }
        LIZIZ(editorProContext, c52t, z, z2);
    }

    public static void LIZIZ(EditorProContext editorContext, C52T c52t, boolean z, boolean z2) {
        o.LJIIIZ(editorContext, "editorContext");
        if (c52t != null) {
            c52t.Ua0(C52V.REDO, z2, true);
            c52t.Ua0(C52V.UNDO, z, true);
        }
    }
}
