package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import kotlin.jvm.internal.o;

/* renamed from: X.MlW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57750MlW<T, R> implements InterfaceC48038ItG {
    public static final C57750MlW<T, R> LJLIL = new C57750MlW<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        Bitmap it = (Bitmap) obj;
        o.LJIIIZ(it, "it");
        C23220ve c23220ve = new C23220ve(it, null);
        c23220ve.LIZ = new Rect(C7MY.LIZIZ(50), C7MY.LIZIZ(50), C47135Ieh.LIZ(50, it.getWidth()), C47135Ieh.LIZ(50, it.getHeight()));
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(c23220ve);
        LIZ.LJI(15.0f);
        LIZ.LJII(5.0f);
        LIZ.LJFF(0.088f, 0.36f, 0.0f, 0.5f, 0.12f);
        return LIZ.LIZJ();
    }
}
