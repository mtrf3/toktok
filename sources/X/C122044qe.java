package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.4qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122044qe {
    public final LinkedList<AbstractC121974qX> LIZ = new LinkedList<>();
    public boolean LIZIZ;
    public final NLEEditor LIZJ;
    public final InterfaceC126684y8 LIZLLL;

    public final synchronized void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LIZ.clear();
    }

    public final synchronized void LIZIZ() {
        if (!this.LIZIZ) {
            return;
        }
        System.currentTimeMillis();
        this.LIZJ.LIZIZ();
        System.currentTimeMillis();
        Iterator<AbstractC121974qX> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(this.LIZLLL);
        }
        System.currentTimeMillis();
        this.LIZ.clear();
        this.LIZIZ = false;
    }

    public C122044qe(NLEEditor nLEEditor, InterfaceC126684y8 interfaceC126684y8) {
        this.LIZJ = nLEEditor;
        this.LIZLLL = interfaceC126684y8;
    }
}
