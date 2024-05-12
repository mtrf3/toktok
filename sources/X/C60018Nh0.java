package X;

import Y.IDBReceiverS8S0100000_8;
import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Nh0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60018Nh0 {
    public static final C60018Nh0 LJFF = new C60018Nh0();
    public Context LIZ;
    public IDBReceiverS8S0100000_8 LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C59998Ngg LJ;

    public final void LIZIZ() {
        String str;
        boolean z = !this.LIZLLL;
        Iterator it = Collections.unmodifiableCollection(C60023Nh5.LIZJ.LIZ).iterator();
        while (it.hasNext()) {
            AbstractC60015Ngx abstractC60015Ngx = ((C60014Ngw) it.next()).LJ;
            if (abstractC60015Ngx.LIZ.get() != null) {
                if (z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "setState", str);
            }
        }
    }

    public static void LIZ(C60018Nh0 c60018Nh0, boolean z) {
        if (c60018Nh0.LIZLLL != z) {
            c60018Nh0.LIZLLL = z;
            if (c60018Nh0.LIZJ) {
                c60018Nh0.LIZIZ();
                if (c60018Nh0.LJ != null) {
                    if (!c60018Nh0.LIZLLL) {
                        C60030NhC.LJI.getClass();
                        C60030NhC.LIZ();
                        return;
                    }
                    C60030NhC.LJI.getClass();
                    Handler handler = C60030NhC.LJIIIIZZ;
                    if (handler == null) {
                        return;
                    }
                    handler.removeCallbacks(C60030NhC.LJIIJ);
                    C60030NhC.LJIIIIZZ = null;
                }
            }
        }
    }
}
