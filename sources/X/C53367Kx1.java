package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Kx1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53367Kx1 extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C53367Kx1 LJLIL = new C53367Kx1();

    public C53367Kx1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String[]] */
    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = C53366Kx0.LJLJJL;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("inbox_entrance_experiment_list", String[].class, strArr);
        if (LJIIIIZZ == 0) {
            return strArr;
        }
        return LJIIIIZZ;
    }
}
