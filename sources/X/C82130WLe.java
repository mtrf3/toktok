package X;

/* renamed from: X.WLe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82130WLe {
    public static /* synthetic */ void LIZ(InterfaceC82129WLd interfaceC82129WLd, boolean z, boolean z2, boolean z3, String str, boolean z4, int i) {
        boolean z5;
        boolean z6 = z4;
        String str2 = str;
        boolean z7 = z2;
        boolean z8 = z3;
        if ((i & 2) != 0) {
            z7 = false;
        }
        if ((i & 4) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i & 8) != 0) {
            z8 = false;
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 32) != 0) {
            z6 = false;
        }
        interfaceC82129WLd.Vt0(z, z7, z5, z8, str2, z6);
    }
}
