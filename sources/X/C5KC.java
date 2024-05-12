package X;

import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.5KC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KC extends C5KG {
    public final String[] LIZ;
    public final C5NI LIZIZ;

    public C5KC(String[] videoFilePaths, C5NI videoOutRes) {
        o.LJIIIZ(videoFilePaths, "videoFilePaths");
        o.LJIIIZ(videoOutRes, "videoOutRes");
        this.LIZ = videoFilePaths;
        this.LIZIZ = videoOutRes;
    }

    @Override // X.C5KG
    public final int LIZ(VEEditor editor, boolean z) {
        o.LJIIIZ(editor, "editor");
        return editor.LJLJI.initWithAlgorithm(this.LIZ, this.LIZIZ);
    }
}
