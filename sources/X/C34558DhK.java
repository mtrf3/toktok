package X;

import com.google.gson.j;

/* renamed from: X.DhK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34558DhK extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C34558DhK LJLIL = new C34558DhK();

    public C34558DhK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        try {
            FFL.LJIIIZ().getClass();
            j jVar = (j) FFL.LJIJ(true, "ttvideoengine_module_config", 31744, j.class, null);
            if (jVar != null) {
                String jVar2 = jVar.toString();
                if (jVar2 != null) {
                    return jVar2;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
