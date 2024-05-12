package X;

import kotlin.jvm.internal.AqS0S1102001_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wbz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82639Wbz extends C82640Wc0 implements HJ0 {
    public final HJ0 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82639Wbz(InterfaceC81640W2i interfaceC81640W2i, C82634Wbu lifecycleOwner, EnumC45994I3i recordMode, C43853HIz c43853HIz) {
        super(interfaceC81640W2i, lifecycleOwner, recordMode);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(recordMode, "recordMode");
        this.LJLJI = c43853HIz;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        LIZIZ(new AqS0S1102001_14(this, i, i2, f, str, 0));
    }
}
