package X;

import kotlin.jvm.internal.o;

/* renamed from: X.INn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46519INn {
    public final EnumC46517INl LIZ;
    public final EnumC46518INm LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SensitiveApiContext(allowOpenCamera = ");
        LIZ.append(this.LIZ);
        LIZ.append(", allowOpenMic = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C46519INn(EnumC46517INl allowOpenCamera, EnumC46518INm allowOpenMic) {
        o.LJIIIZ(allowOpenCamera, "allowOpenCamera");
        o.LJIIIZ(allowOpenMic, "allowOpenMic");
        this.LIZ = allowOpenCamera;
        this.LIZIZ = allowOpenMic;
    }
}
