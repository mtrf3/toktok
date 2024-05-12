package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.0aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10250aj {
    public final ParcelableSnapshotMutableState LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;
    public boolean LIZJ;
    public Object LIZLLL;

    public C10250aj(int i, int i2) {
        this.LIZ = C78966Uyw.LJJJIL(new C10130aX(i));
        this.LIZIZ = C78966Uyw.LJJJIL(Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i, int i2) {
        if (i >= 0.0f) {
            if (i != ((C10130aX) this.LIZ.getValue()).LIZ) {
                this.LIZ.setValue(new C10130aX(i));
            }
            if (i2 != ((Number) this.LIZIZ.getValue()).intValue()) {
                this.LIZIZ.setValue(Integer.valueOf(i2));
                return;
            }
            return;
        }
        String LIZ = C10120aW.LIZ("Index should be non-negative (", i, ')');
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }
}
