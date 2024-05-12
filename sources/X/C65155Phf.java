package X;

import java.io.File;
import java.util.HashSet;

/* renamed from: X.Phf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65155Phf {
    public final java.util.Set<InterfaceC65161Phl> LIZ = new HashSet();

    public final void LIZIZ(File file, String str) {
        ((HashSet) this.LIZ).add(new C65159Phj(str, file));
    }

    public final void LIZ(String str, byte[] bArr, String str2) {
        ((HashSet) this.LIZ).add(new C65154Phe(str, bArr, str2));
    }
}
