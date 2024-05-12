package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.QMi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66872QMi extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C66872QMi LJLIL = new C66872QMi();

    public C66872QMi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        C60903NvH.LJIIJJI().getRegionService();
        String LIZ = C44296Ha0.LIZ();
        o.LJIIIIZZ(LIZ, "getAPI().regionService.region");
        String upperCase = LIZ.toUpperCase();
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase()");
        if (C86798Y4s.LIZ.contains(upperCase)) {
            i = R.string.rtw;
        } else if (o.LJ("BR", upperCase) || o.LJ("JP", upperCase)) {
            i = R.string.rtv;
        } else {
            i = R.string.gfy;
        }
        return Integer.valueOf(i);
    }
}
