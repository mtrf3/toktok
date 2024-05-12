package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.0oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18690oL {
    public static final C1HY LJFF = C79043V0l.LJIIZILJ(C23W.LJLIL, C23V.LJLIL);
    public final ParcelableSnapshotMutableState LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;
    public C10390ax LIZJ;
    public long LIZLLL;
    public final ParcelableSnapshotMutableState LJ;

    public C18690oL() {
        this(C0UT.Vertical, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float LIZ() {
        return ((Number) this.LIZ.getValue()).floatValue();
    }

    public C18690oL(C0UT initialOrientation, float f) {
        o.LJIIIZ(initialOrientation, "initialOrientation");
        this.LIZ = C78966Uyw.LJJJIL(Float.valueOf(f));
        this.LIZIZ = C78966Uyw.LJJJIL(Float.valueOf(0.0f));
        this.LIZJ = C10390ax.LJ;
        this.LIZLLL = C08350Ul.LIZIZ;
        this.LJ = C78966Uyw.LJJJI(initialOrientation, C36041bE.LIZ);
    }

    public final void LIZIZ(C0UT orientation, C10390ax c10390ax, int i, int i2) {
        boolean z;
        float f;
        float f2;
        o.LJIIIZ(orientation, "orientation");
        float f3 = i2 - i;
        this.LIZIZ.setValue(Float.valueOf(f3));
        float f4 = c10390ax.LIZ;
        C10390ax c10390ax2 = this.LIZJ;
        if (f4 == c10390ax2.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (!z || c10390ax.LIZIZ != c10390ax2.LIZIZ) {
            if (orientation == C0UT.Vertical) {
                f4 = c10390ax.LIZIZ;
                f = c10390ax.LIZLLL;
            } else {
                f = c10390ax.LIZJ;
            }
            float LIZ = LIZ();
            float f5 = i;
            float f6 = LIZ + f5;
            if (f <= f6) {
                if (f4 < LIZ) {
                    if (f - f4 <= f5) {
                        if (f - f4 <= f5) {
                            f2 = f4 - LIZ;
                            this.LIZ.setValue(Float.valueOf(LIZ() + f2));
                            this.LIZJ = c10390ax;
                        }
                    }
                }
                f2 = 0.0f;
                this.LIZ.setValue(Float.valueOf(LIZ() + f2));
                this.LIZJ = c10390ax;
            }
            f2 = f - f6;
            this.LIZ.setValue(Float.valueOf(LIZ() + f2));
            this.LIZJ = c10390ax;
        }
        this.LIZ.setValue(Float.valueOf(C78842Uww.LJIIJJI(LIZ(), 0.0f, f3)));
    }
}
