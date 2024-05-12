package X;

import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P5N extends C5KG {
    @Override // X.C5KG
    public final int LIZ(VEEditor editor, boolean z) {
        o.LJIIIZ(editor, "editor");
        synchronized (editor) {
            TEMonitorInvoker.nativeReset(1);
            C63868P4u.LIZIZ(1);
            editor.LLIIL = System.currentTimeMillis();
            editor.LLIILII = System.currentTimeMillis();
            P4Q.LJFF("VEEditor", "init with model...");
            editor.LJJIL(1.0f, 1.0f, 0.0f, 0, 0);
            if (editor.LJLJJLL == null) {
                P4Q.LIZJ("VEEditor", "init mResManager is null");
            } else {
                editor.LLILZ = true;
                throw null;
            }
        }
        return -112;
    }
}
