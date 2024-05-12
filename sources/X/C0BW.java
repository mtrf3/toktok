package X;

import X.AbstractC03300Ba;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: X.0BW, reason: invalid class name */
/* loaded from: classes.dex */
public class C0BW<T extends AbstractC03300Ba> {
    public final Class<T> LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public ArrayList<C0BX> LIZLLL;
    public Executor LJ;
    public Executor LJFF;
    public InterfaceC262611i LJI;
    public boolean LJII;
    public boolean LJIIJ;
    public java.util.Set<Integer> LJIIL;
    public C0BY LJIIIIZZ = C0BY.AUTOMATIC;
    public boolean LJIIIZ = true;
    public final C0BZ LJIIJJI = new C0BZ();

    public final void LIZJ() {
        this.LJIIIZ = false;
        this.LJIIJ = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010b, code lost:
    
        r4.set(r2);
        ((java.util.HashMap) r6.LJII).put(r3, com.bytedance.mt.protector.impl.collections.ListProtector.get(r10.LJI, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0216, code lost:
    
        r5.set(r2);
        ((java.util.HashMap) r6.LJIIJJI).put(r3, com.bytedance.mt.protector.impl.collections.ListProtector.get(r10.LJFF, r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T LIZIZ() {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0BW.LIZIZ():X.0Ba");
    }

    public final void LIZ(AbstractC23740wU... abstractC23740wUArr) {
        if (this.LJIIL == null) {
            this.LJIIL = new HashSet();
        }
        for (AbstractC23740wU abstractC23740wU : abstractC23740wUArr) {
            ((HashSet) this.LJIIL).add(Integer.valueOf(abstractC23740wU.LIZ));
            ((HashSet) this.LJIIL).add(Integer.valueOf(abstractC23740wU.LIZIZ));
        }
        this.LJIIJJI.LIZ(abstractC23740wUArr);
    }

    public C0BW(Context context, Class<T> cls, String str) {
        this.LIZJ = context;
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
