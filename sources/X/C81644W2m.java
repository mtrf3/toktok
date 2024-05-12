package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.W2m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81644W2m {
    public final EnumC45994I3i LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final WS3 LIZLLL;

    public C81644W2m() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81644W2m)) {
            return false;
        }
        C81644W2m c81644W2m = (C81644W2m) obj;
        return this.LIZ == c81644W2m.LIZ && o.LJ(this.LIZIZ, c81644W2m.LIZIZ) && o.LJ(this.LIZJ, c81644W2m.LIZJ) && o.LJ(this.LIZLLL, c81644W2m.LIZLLL);
    }

    public final int hashCode() {
        EnumC45994I3i enumC45994I3i = this.LIZ;
        int hashCode = (enumC45994I3i == null ? 0 : enumC45994I3i.hashCode()) * 31;
        View view = this.LIZIZ;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        WS3 ws3 = this.LIZLLL;
        return hashCode3 + (ws3 != null ? ws3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SwitcherState(currentMode=");
        LIZ.append(this.LIZ);
        LIZ.append(", shareASCameraView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shareSurfaceView=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nowFirstFrameModel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C81644W2m(EnumC45994I3i enumC45994I3i, View view, View view2, int i) {
        enumC45994I3i = (i & 1) != 0 ? null : enumC45994I3i;
        view = (i & 2) != 0 ? null : view;
        view2 = (i & 4) != 0 ? null : view2;
        this.LIZ = enumC45994I3i;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = null;
    }
}
