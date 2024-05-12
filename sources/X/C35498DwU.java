package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.DwU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35498DwU extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C35498DwU LJLIL = new C35498DwU();

    public C35498DwU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        String[] strArr;
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            strArr = C35499DwV.LIZIZ;
            String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("tt_friends_ec_list", String[].class, strArr);
            if (strArr2 == null) {
                C35499DwV.LIZ.getClass();
            } else {
                strArr = strArr2;
            }
        } catch (Exception unused) {
            C35499DwV.LIZ.getClass();
            strArr = C35499DwV.LIZIZ;
        }
        o.LJIIIIZZ(strArr, "try {\n            Settin…          VALUE\n        }");
        return strArr;
    }
}
