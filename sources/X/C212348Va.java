package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.internal.o;

/* renamed from: X.8Va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212348Va {
    public final Assembler LIZ;
    public final LifecycleOwner LIZIZ;
    public final LifecycleOwner LIZJ;

    public C212348Va(Assembler assembler, LifecycleOwner host, LifecycleOwner parent) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(parent, "parent");
        this.LIZ = assembler;
        this.LIZIZ = host;
        this.LIZJ = parent;
    }
}
