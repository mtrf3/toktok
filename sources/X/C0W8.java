package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* renamed from: X.0W8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0W8 {
    public final int LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C0W8() {
        this.LIZ = 50;
        this.LIZIZ = new EUK();
    }

    public /* synthetic */ C0W8(CharSequence charSequence) {
        this.LIZIZ = charSequence;
        this.LIZ = -1;
    }

    public final LinearGradient LIZ(int i, int i2, int i3, int i4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('-');
        LIZ.append(i2);
        LIZ.append('-');
        LIZ.append(0);
        LIZ.append('-');
        LIZ.append(0);
        LIZ.append('-');
        LIZ.append(i3);
        LIZ.append('-');
        LIZ.append(i4);
        String key = X1D.LIZIZ(LIZ);
        o.LJIIIZ(key, "key");
        LinearGradient linearGradient = (LinearGradient) ((LruCache) this.LIZIZ).get(key);
        if (linearGradient == null) {
            float f = 0;
            linearGradient = new LinearGradient(f, f, i3, i4, i, i2, Shader.TileMode.REPEAT);
        }
        ((LruCache) this.LIZIZ).put(key, linearGradient);
        return linearGradient;
    }
}
