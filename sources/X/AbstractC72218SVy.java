package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SVy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC72218SVy implements VTX {
    public EnumC72217SVx LIZ = EnumC72217SVx.IDLE;

    public abstract void LIZIZ(EnumC72217SVx enumC72217SVx);

    @Override // X.VTY
    public final void LIZ(C80217Ve1 appBarLayout, int i) {
        o.LJIIIZ(appBarLayout, "appBarLayout");
        if (i == 0) {
            EnumC72217SVx enumC72217SVx = this.LIZ;
            EnumC72217SVx enumC72217SVx2 = EnumC72217SVx.EXPANDED;
            if (enumC72217SVx != enumC72217SVx2) {
                LIZIZ(enumC72217SVx2);
                this.LIZ = enumC72217SVx2;
                return;
            }
        }
        if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            EnumC72217SVx enumC72217SVx3 = this.LIZ;
            EnumC72217SVx enumC72217SVx4 = EnumC72217SVx.COLLAPSED;
            if (enumC72217SVx3 != enumC72217SVx4) {
                LIZIZ(enumC72217SVx4);
                this.LIZ = enumC72217SVx4;
                return;
            }
        }
        if (i == 0) {
            return;
        }
        EnumC72217SVx enumC72217SVx5 = this.LIZ;
        EnumC72217SVx enumC72217SVx6 = EnumC72217SVx.IDLE;
        if (enumC72217SVx5 == enumC72217SVx6) {
            return;
        }
        LIZIZ(enumC72217SVx6);
        this.LIZ = enumC72217SVx6;
    }
}
