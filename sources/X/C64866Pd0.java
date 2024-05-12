package X;

import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Pd0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64866Pd0 {
    public FYD LIZ;
    public PXI LIZJ;
    public final InterfaceC64878PdC LIZLLL;
    public final Handler LJ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final ARunnableS47S0100000_11 LJFF = new ARunnableS47S0100000_11(this, 84);

    public C64866Pd0(C64875Pd9 c64875Pd9, WeakHandler weakHandler) {
        this.LIZLLL = c64875Pd9;
        this.LJ = weakHandler;
    }
}
