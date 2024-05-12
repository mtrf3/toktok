package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169196kV implements InterfaceC169226kY {
    public static final C169196kV LIZ = new C169196kV();

    @Override // X.InterfaceC169226kY
    public final String LIZ(String srcPath, CreativeInfo srcCreativeInfo, CreativeInfo dstCreativeInfo) {
        o.LJIIIZ(srcPath, "srcPath");
        o.LJIIIZ(srcCreativeInfo, "srcCreativeInfo");
        o.LJIIIZ(dstCreativeInfo, "dstCreativeInfo");
        String LIZIZ = C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(srcCreativeInfo);
        String LIZIZ2 = C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(dstCreativeInfo);
        if (ujb.o.LJJJLIIL(srcPath, LIZIZ, false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ2);
            LIZ2.append(s.LJJLL(LIZIZ, srcPath));
            return X1D.LIZIZ(LIZ2);
        }
        if (C78966Uyw.LJJIJIIJIL(srcPath)) {
            return C43073GvN.LIZLLL(C62850Ola.LJ(), dstCreativeInfo, EnumC43649HBd.EXTERNAL_RESTORE, String.valueOf(System.currentTimeMillis()), false, 8);
        }
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        EnumC43649HBd enumC43649HBd = EnumC43649HBd.EXTERNAL_RESTORE;
        String absolutePath = C60903NvH.LJ.getFilesDir().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getApplication().filesDir.absolutePath");
        return C43073GvN.LIZLLL(LJ, dstCreativeInfo, enumC43649HBd, s.LJJLL(C78966Uyw.LJIJJLI(absolutePath), srcPath), false, 8);
    }
}
