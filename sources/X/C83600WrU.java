package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WrU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83600WrU extends F9E {
    public final boolean LJLIL;
    public final InterfaceC65784Pro<Boolean> LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C83600WrU(boolean z, boolean z2, InterfaceC65784Pro forbidOpenCameraInBackground) {
        o.LJIIIZ(forbidOpenCameraInBackground, "forbidOpenCameraInBackground");
        this.LJLIL = z;
        this.LJLILLLLZI = forbidOpenCameraInBackground;
        this.LJLJI = z2;
    }
}
