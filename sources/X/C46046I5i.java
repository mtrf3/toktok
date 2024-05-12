package X;

/* renamed from: X.I5i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46046I5i {
    public static /* synthetic */ void LIZ(InterfaceC46047I5j interfaceC46047I5j, boolean z, OSZ osz, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            osz = null;
        }
        interfaceC46047I5j.LIZIZ(osz, z);
    }

    public static /* synthetic */ void LIZIZ(InterfaceC46047I5j interfaceC46047I5j, float f, float f2, float f3, int i) {
        float f4 = f2;
        float f5 = f3;
        if ((i & 2) != 0) {
            f4 = 1.0f;
        }
        if ((i & 4) != 0) {
            f5 = 1.0f;
        }
        interfaceC46047I5j.LIZ(f, f4, f5, 0, 0);
    }
}
