package X;

import android.os.Build;
import java.util.Iterator;

/* renamed from: X.0fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13340fi {
    public final Object LIZ;

    public /* synthetic */ C13340fi(AbstractC68731QyF abstractC68731QyF) {
        this.LIZ = abstractC68731QyF;
    }

    public C13340fi() {
        Object j7i;
        if (Build.VERSION.SDK_INT >= 28) {
            j7i = new C79004UzY();
        } else {
            j7i = new J7I();
        }
        this.LIZ = j7i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(R0Y r0y) {
        AbstractC68731QyF abstractC68731QyF = (AbstractC68731QyF) this.LIZ;
        abstractC68731QyF.LIZ = r0y;
        Iterator<InterfaceC68733QyH> it = abstractC68731QyF.LIZJ.iterator();
        while (it.hasNext()) {
            InterfaceC68733QyH next = it.next();
            next.LIZ();
        }
        ((AbstractC68731QyF) this.LIZ).LIZJ.clear();
        ((AbstractC68731QyF) this.LIZ).LIZIZ = null;
    }
}
