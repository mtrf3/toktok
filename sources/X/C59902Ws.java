package X;

import android.view.MotionEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59902Ws {
    public final MotionEvent LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59902Ws)) {
            return false;
        }
        C59902Ws c59902Ws = (C59902Ws) obj;
        return o.LJ(this.LIZ, c59902Ws.LIZ) && o.LJ(this.LIZIZ, c59902Ws.LIZIZ);
    }

    public final int hashCode() {
        MotionEvent motionEvent = this.LIZ;
        return this.LIZIZ.hashCode() + ((motionEvent == null ? 0 : motionEvent.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchOpenDrawerEvent(event=");
        LIZ.append(this.LIZ);
        LIZ.append(", key=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C59902Ws(MotionEvent motionEvent, String str) {
        this.LIZ = motionEvent;
        this.LIZIZ = str;
    }
}
