package X;

import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P5O extends C5KG {
    @Override // X.C5KG
    public final int LIZ(VEEditor editor, boolean z) {
        o.LJIIIZ(editor, "editor");
        synchronized (editor) {
            TEMonitorInvoker.nativeReset(1);
            C63868P4u.LIZIZ(1);
            editor.LLIIL = System.currentTimeMillis();
            editor.LLIILII = System.currentTimeMillis();
            P4Q.LJFF("VEEditor", "init2...");
            throw null;
        }
    }
}
