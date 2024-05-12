package X;

import android.hardware.Camera;
import java.util.Comparator;

/* loaded from: classes16.dex */
public final class Y5H<T> implements Comparator {
    public final /* synthetic */ float LJLIL;

    public Y5H(float f) {
        this.LJLIL = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Camera.Size size = (Camera.Size) t;
        Camera.Size size2 = (Camera.Size) t2;
        return C66851QLn.LJFF(Float.valueOf(Math.abs((size.width / size.height) - this.LJLIL)), Float.valueOf(Math.abs((size2.width / size2.height) - this.LJLIL)));
    }
}
