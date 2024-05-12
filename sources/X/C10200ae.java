package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.0ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10200ae {
    public final C25710zf<C10190ad> LIZ = new C25710zf<>(new C10190ad[16]);

    public final int LIZ() {
        C25710zf<C10190ad> c25710zf = this.LIZ;
        if (!c25710zf.LJIIJ()) {
            int i = 0;
            int i2 = c25710zf.LJLIL[0].LIZIZ;
            C25710zf<C10190ad> c25710zf2 = this.LIZ;
            int i3 = c25710zf2.LJLJI;
            if (i3 > 0) {
                C10190ad[] c10190adArr = c25710zf2.LJLIL;
                o.LJII(c10190adArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    int i4 = c10190adArr[i].LIZIZ;
                    if (i4 > i2) {
                        i2 = i4;
                    }
                    i++;
                } while (i < i3);
            }
            return i2;
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int LIZIZ() {
        C25710zf<C10190ad> c25710zf = this.LIZ;
        if (!c25710zf.LJIIJ()) {
            int i = c25710zf.LJLIL[0].LIZ;
            C25710zf<C10190ad> c25710zf2 = this.LIZ;
            int i2 = c25710zf2.LJLJI;
            if (i2 > 0) {
                C10190ad[] c10190adArr = c25710zf2.LJLIL;
                o.LJII(c10190adArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i3 = 0;
                do {
                    int i4 = c10190adArr[i3].LIZ;
                    if (i4 < i) {
                        i = i4;
                    }
                    i3++;
                } while (i3 < i2);
            }
            if (i >= 0) {
                return i;
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }
}
