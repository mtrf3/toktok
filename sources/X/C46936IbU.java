package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IbU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46936IbU {
    public static final WeakHashMap<Surface, SurfaceHolder> LIZ = new WeakHashMap<>();
    public static final WeakHashMap<Surface, Boolean> LIZIZ = new WeakHashMap<>();
    public static final WeakHashMap<Surface, InterfaceC46937IbV> LIZJ = new WeakHashMap<>();

    public static final SurfaceHolder LIZ(Surface surface) {
        o.LJIIIZ(surface, "surface");
        return LIZ.get(surface);
    }
}
