package X;

import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YON extends C5KG {
    @Override // X.C5KG
    public final int LIZ(VEEditor editor, boolean z) {
        o.LJIIIZ(editor, "editor");
        if (z) {
            YOO yoo = editor.LJLIL;
            if (yoo == null) {
                P4Q.LIZJ("VEEditor", "MV IS NOT SUPPORT !!!");
                return -900;
            }
            return yoo.updateMVResources(null);
        }
        YOO yoo2 = editor.LJLIL;
        if (yoo2 == null) {
            P4Q.LIZJ("VEEditor", "MV IS NOT SUPPORT !!!");
            return -900;
        }
        return yoo2.initMV(null);
    }
}
