package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuB, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91411ZuB implements IEvent {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final Fragment LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91411ZuB)) {
            return false;
        }
        C91411ZuB c91411ZuB = (C91411ZuB) obj;
        return this.LJLIL == c91411ZuB.LJLIL && o.LJ(this.LJLILLLLZI, c91411ZuB.LJLILLLLZI) && o.LJ(this.LJLJI, c91411ZuB.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.LJLILLLLZI.hashCode()) * 31;
        Fragment fragment = this.LJLJI;
        return hashCode + (fragment == null ? 0 : fragment.hashCode());
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDspNodeVisibleEvent(visible=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentTab=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", frag=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91411ZuB(Fragment fragment, String str, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = fragment;
    }
}
