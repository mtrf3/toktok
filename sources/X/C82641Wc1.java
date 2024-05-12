package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS0S1102001_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wc1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82641Wc1 extends C82640Wc0 implements IAF {
    public final IAF LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82641Wc1(InterfaceC81640W2i interfaceC81640W2i, LifecycleOwner lifecycleOwner, EnumC45994I3i recordMode, WT9 wt9) {
        super(interfaceC81640W2i, lifecycleOwner, recordMode);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordMode, "recordMode");
        this.LJLJI = wt9;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        LIZIZ(new AqS0S1102001_14(this, i, i2, f, str, 1));
    }
}
