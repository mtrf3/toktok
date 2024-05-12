package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.internal.o;

/* renamed from: X.8VU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VU {
    public final Assembler LIZ;
    public final LifecycleOwner LIZIZ;
    public final LifecycleOwner LIZJ;

    public C8VU(Assembler assembler, LifecycleOwner host, LifecycleOwner parent) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(parent, "parent");
        this.LIZ = assembler;
        this.LIZIZ = host;
        this.LIZJ = parent;
    }
}
