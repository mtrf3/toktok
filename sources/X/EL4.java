package X;

import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class EL4 extends AbstractC65781Prl implements InterfaceC65784Pro<SharedPreferences> {
    public static final EL4 LJLIL = new EL4();

    public EL4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SharedPreferences invoke() {
        return F9J.LIZIZ(EF7.LIZIZ(), 0, "backup_count_sp");
    }
}
