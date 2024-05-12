package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.850, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass850 {
    public final String LIZ;
    public final List<Object> LIZIZ;
    public final AnonymousClass853 LIZJ;
    public final Object LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass850)) {
            return false;
        }
        AnonymousClass850 anonymousClass850 = (AnonymousClass850) obj;
        return o.LJ(this.LIZ, anonymousClass850.LIZ) && o.LJ(this.LIZIZ, anonymousClass850.LIZIZ) && this.LIZJ == anonymousClass850.LIZJ && o.LJ(this.LIZLLL, anonymousClass850.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        AnonymousClass853 anonymousClass853 = this.LIZJ;
        int i = 0;
        if (anonymousClass853 == null) {
            hashCode = 0;
        } else {
            hashCode = anonymousClass853.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        Object obj = this.LIZLLL;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RichTextBlock(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", spans=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tag=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        return U26.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public AnonymousClass850(String text, List<Object> spans, AnonymousClass853 anonymousClass853, Object obj) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(spans, "spans");
        this.LIZ = text;
        this.LIZIZ = spans;
        this.LIZJ = anonymousClass853;
        this.LIZLLL = obj;
    }

    public /* synthetic */ AnonymousClass850(String str, List list, AnonymousClass853 anonymousClass853, int i) {
        this(str, (List<Object>) ((i & 2) != 0 ? new ArrayList() : list), (i & 4) != 0 ? null : anonymousClass853, (Object) null);
    }
}
