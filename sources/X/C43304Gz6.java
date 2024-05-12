package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gz6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43304Gz6 extends AbstractC43305Gz7 {
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C43308GzA.LJLIL);

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Object LIZ;
        o.LJIIIZ(type, "type");
        try {
            ((C38919FPf) this.LJLJJL.getValue()).LIZ(new AqS173S0100000_7(c37356ElM, 385), new AqS189S0100000_7(c37356ElM, 80));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("upload error ");
            LIZ2.append(m10exceptionOrNullimpl);
            C31626Cb8.LIZ(c37356ElM, 0, X1D.LIZIZ(LIZ2), 4);
        }
    }
}
