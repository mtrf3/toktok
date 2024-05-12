package X;

import com.lynx.tasm.base.LLog;

/* renamed from: X.Nri, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60682Nri {
    public static int LJI;
    public final String LIZ;
    public final boolean LIZLLL;
    public final EnumC60683Nrj LJ;
    public final boolean LJFF;
    public final String[] LIZJ = null;
    public final boolean LIZIZ = false;

    public static String LIZJ() {
        String LLLZ = C16880lQ.LLLZ("%d", new Object[]{Integer.valueOf(LJI)});
        LJI++;
        return LLLZ;
    }

    public static boolean LIZIZ(C60682Nri c60682Nri) {
        if (c60682Nri == null) {
            return false;
        }
        if (!c60682Nri.LIZLLL && c60682Nri.LJ != EnumC60683Nrj.ENABLE) {
            return false;
        }
        return true;
    }

    public static C60682Nri LIZ(String str, boolean z) {
        return new C60682Nri(str, LIZJ(), z, false, EnumC60683Nrj.DEFAULT);
    }

    public C60682Nri(String str, String str2, boolean z, boolean z2, EnumC60683Nrj enumC60683Nrj) {
        this.LJ = EnumC60683Nrj.DEFAULT;
        this.LIZLLL = z;
        this.LIZ = str2;
        this.LJFF = z2;
        this.LJ = enumC60683Nrj;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("LynxGroup init with name ", str, ", id: ", str2, ", dynamicV8: ");
        LIZLLL.append(z2);
        LIZLLL.append(", canvas:");
        LIZLLL.append(z || enumC60683Nrj == EnumC60683Nrj.ENABLE);
        LLog.LIZLLL(2, "LynxGroup", X1D.LIZIZ(LIZLLL));
    }
}
