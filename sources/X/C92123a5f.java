package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a5f, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public class C92123a5f extends C91720ZzA {
    @Override // X.C91720ZzA
    public final String toString() {
        String str = super.toString();
        o.LJIIIIZZ(str, "sb.toString()");
        return str;
    }

    @Override // X.C91720ZzA
    public final int hashCode() {
        return super.hashCode() * 31 * 31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92123a5f(AbstractC91695Zyl<? extends C92123a5f> activityNavigator) {
        super(activityNavigator);
        o.LJIIIZ(activityNavigator, "activityNavigator");
    }

    @Override // X.C91720ZzA
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C92123a5f) || !super.equals(obj) || !o.LJ(null, null)) {
            return false;
        }
        return true;
    }
}
