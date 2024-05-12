package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GOD extends AbstractC65781Prl implements InterfaceC65784Pro<C169216kX> {
    public static final GOD LJLIL = new GOD();

    public GOD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6kX] */
    @Override // X.InterfaceC65784Pro
    public final C169216kX invoke() {
        return new InterfaceC41420GNk() { // from class: X.6kX
            @Override // X.InterfaceC41420GNk
            public final OSZ LIZ(String srcFile, CreativeInfo srcCreativeInfo, CreativeInfo dstCreativeInfo) {
                C169206kW c169206kW = new InterfaceC169226kY() { // from class: X.6kW
                    @Override // X.InterfaceC169226kY
                    public final String LIZ(String srcPath, CreativeInfo srcCreativeInfo2, CreativeInfo dstCreativeInfo2) {
                        o.LJIIIZ(srcPath, "srcPath");
                        o.LJIIIZ(srcCreativeInfo2, "srcCreativeInfo");
                        o.LJIIIZ(dstCreativeInfo2, "dstCreativeInfo");
                        String LIZIZ = C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(srcCreativeInfo2);
                        String LIZIZ2 = C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(dstCreativeInfo2);
                        if (ujb.o.LJJJLIIL(srcPath, LIZIZ, false)) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(LIZIZ2);
                            LIZ2.append(s.LJJLL(LIZIZ, srcPath));
                            return X1D.LIZIZ(LIZ2);
                        }
                        return srcPath;
                    }
                };
                o.LJIIIZ(srcFile, "srcFile");
                o.LJIIIZ(srcCreativeInfo, "srcCreativeInfo");
                o.LJIIIZ(dstCreativeInfo, "dstCreativeInfo");
                return C78857UxB.LJJJJJL(srcFile, srcCreativeInfo, dstCreativeInfo, c169206kW);
            }
        };
    }
}
