package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;

/* renamed from: X.166, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass166 {
    public final /* synthetic */ AnonymousClass164 LIZ;
    public final /* synthetic */ Object LIZIZ;

    public final void LIZ() {
        boolean z;
        this.LIZ.LIZIZ();
        C29321Dc remove = this.LIZ.LJII.remove(this.LIZIZ);
        if (remove != null) {
            AnonymousClass164 anonymousClass164 = this.LIZ;
            if (anonymousClass164.LJIIJ > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int indexOf = anonymousClass164.LIZ.LJIJJ().indexOf(remove);
                int size = this.LIZ.LIZ.LJIJJ().size();
                AnonymousClass164 anonymousClass1642 = this.LIZ;
                int i = anonymousClass1642.LJIIJ;
                if (indexOf >= size - i) {
                    anonymousClass1642.LJIIIZ++;
                    anonymousClass1642.LJIIJ = i - 1;
                    int size2 = anonymousClass1642.LIZ.LJIJJ().size();
                    AnonymousClass164 anonymousClass1643 = this.LIZ;
                    int i2 = (size2 - anonymousClass1643.LJIIJ) - anonymousClass1643.LJIIIZ;
                    C29321Dc c29321Dc = anonymousClass1643.LIZ;
                    c29321Dc.LJLL = true;
                    c29321Dc.LJJIJIL(indexOf, i2, 1);
                    c29321Dc.LJLL = false;
                    this.LIZ.LIZ(i2);
                    return;
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int LIZIZ() {
        C29321Dc c29321Dc = (C29321Dc) ((LinkedHashMap) this.LIZ.LJII).get(this.LIZIZ);
        if (c29321Dc != null) {
            return c29321Dc.LJIJI().size();
        }
        return 0;
    }

    public AnonymousClass166(AnonymousClass164 anonymousClass164, Object obj) {
        this.LIZ = anonymousClass164;
        this.LIZIZ = obj;
    }

    public final void LIZJ(int i, long j) {
        C29321Dc c29321Dc = (C29321Dc) ((LinkedHashMap) this.LIZ.LJII).get(this.LIZIZ);
        if (c29321Dc != null && c29321Dc.LJJIIZ()) {
            int size = c29321Dc.LJIJI().size();
            if (i >= 0 && i < size) {
                if (!c29321Dc.LJZI) {
                    C29321Dc c29321Dc2 = this.LIZ.LIZ;
                    c29321Dc2.LJLL = true;
                    C1DF.LJJIJIIJI(c29321Dc).LJIIJJI((C29321Dc) ListProtector.get(c29321Dc.LJIJI(), i), j);
                    c29321Dc2.LJLL = false;
                    return;
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Index (");
            LIZ.append(i);
            LIZ.append(") is out of bound of [0, ");
            LIZ.append(size);
            LIZ.append(')');
            throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZ));
        }
    }
}
