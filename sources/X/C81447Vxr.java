package X;

import java.util.List;

/* renamed from: X.Vxr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81447Vxr extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C81447Vxr LJLIL = new C81447Vxr();

    public C81447Vxr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            String[] strArr = C81448Vxs.LIZ;
            LJIIIZ.getClass();
            String[] strArr2 = (String[]) FFL.LJIIZILJ(0, strArr, "studio_front_flash_color_array", true);
            if (strArr2 != null) {
                strArr = strArr2;
            }
            return ORY.LJJZZIII(strArr);
        } catch (Throwable unused) {
            return C61878OQg.INSTANCE;
        }
    }
}
