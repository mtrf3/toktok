package X;

import java.util.HashMap;

/* renamed from: X.Nqw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60634Nqw {
    public final C60630Nqs LIZ = new C60630Nqs();

    public final void LIZ(Class cls, InterfaceC60639Nr1 interfaceC60639Nr1) {
        if (cls == null) {
            return;
        }
        this.LIZ.LIZ.add(cls);
        C60630Nqs c60630Nqs = this.LIZ;
        if (c60630Nqs.LIZIZ == null) {
            c60630Nqs.LIZIZ = new HashMap<>();
        }
        this.LIZ.LIZIZ.put(cls, interfaceC60639Nr1);
    }
}
