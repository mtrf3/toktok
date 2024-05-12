package X;

import java.io.File;

/* renamed from: X.Phj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65159Phj implements InterfaceC65161Phl {
    public final String LIZ;
    public final File LIZIZ;

    @Override // X.InterfaceC65161Phl
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC65161Phl
    public final Object getValue() {
        return this.LIZIZ;
    }

    public C65159Phj(String str, File file) {
        this.LIZ = str;
        this.LIZIZ = file;
    }
}
