package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ODi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61542ODi extends OE9 {
    public final List<OE9> LIZ;

    public C61542ODi(OE9... oe9Arr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LIZ = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(oe9Arr));
    }

    @Override // X.OE9
    public final void LIZIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            OE9 oe9 = (OE9) it.next();
            if (oe9 != null) {
                oe9.LIZIZ(c61546ODm, abstractC61551ODr);
            }
        }
    }

    @Override // X.OE9
    public final void LIZLLL(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            OE9 oe9 = (OE9) it.next();
            if (oe9 != null) {
                oe9.LIZLLL(c61546ODm, abstractC61551ODr);
            }
        }
    }

    @Override // X.OE9
    public final void LJFF(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            OE9 oe9 = (OE9) it.next();
            if (oe9 != null) {
                oe9.LJFF(c61546ODm, abstractC61551ODr);
            }
        }
    }

    @Override // X.OE9
    public final void LIZ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            OE9 oe9 = (OE9) it.next();
            if (oe9 != null) {
                oe9.LIZ(c61546ODm, abstractC61551ODr, th);
            }
        }
    }

    @Override // X.OE9
    public final void LIZJ(C61546ODm c61546ODm, AbstractC61551ODr abstractC61551ODr, Throwable th) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            OE9 oe9 = (OE9) it.next();
            if (oe9 != null) {
                oe9.LIZJ(c61546ODm, abstractC61551ODr, th);
            }
        }
    }

    @Override // X.OE9
    public final void LJ(C61546ODm c61546ODm, C61547ODn c61547ODn, Throwable th) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            OE9 oe9 = (OE9) it.next();
            if (oe9 != null) {
                oe9.LJ(c61546ODm, c61547ODn, th);
            }
        }
    }
}
