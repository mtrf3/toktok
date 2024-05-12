package X;

import android.graphics.Point;

/* renamed from: X.Vuq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81260Vuq<T> {
    public final /* synthetic */ float LIZ;
    public final /* synthetic */ int[] LIZIZ;
    public final /* synthetic */ float LIZJ;

    public C81260Vuq(float f, float f2, int[] iArr) {
        this.LIZ = f;
        this.LIZIZ = iArr;
        this.LIZJ = f2;
    }

    public final Object LIZ() {
        int i = (int) this.LIZ;
        int[] iArr = this.LIZIZ;
        return new Point(i + iArr[0], ((int) this.LIZJ) + iArr[1]);
    }
}
