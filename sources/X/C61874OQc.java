package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.OQc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61874OQc implements Comparable<C61874OQc> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final int LJLIL;

    public final int hashCode() {
        return this.LJLIL;
    }

    public final String toString() {
        return String.valueOf(this.LJLIL & 4294967295L);
    }

    public /* synthetic */ C61874OQc(int i) {
        this.LJLIL = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C61874OQc c61874OQc) {
        return o.LJIIJJI(this.LJLIL ^ LiveLayoutPreloadThreadPriority.DEFAULT, c61874OQc.LJLIL ^ LiveLayoutPreloadThreadPriority.DEFAULT);
    }

    public final boolean equals(Object obj) {
        int i = this.LJLIL;
        if (!(obj instanceof C61874OQc) || i != ((C61874OQc) obj).LJLIL) {
            return false;
        }
        return true;
    }
}
