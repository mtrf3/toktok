package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gze, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43338Gze extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ H00 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43338Gze(H00 h00, int i, long j) {
        super(0);
        this.LJLIL = h00;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        H00 h00 = this.LJLIL;
        java.util.Map<String, Integer> map = h00.LJIILL;
        List<String> list = h00.LJ;
        if (list != null) {
            map.put(ListProtector.get(list, this.LJLILLLLZI), Integer.valueOf((int) this.LJLJI));
            Iterator it = ((LinkedHashMap) this.LJLIL.LJIILL).values().iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((Number) it.next()).intValue();
            }
            H00 h002 = this.LJLIL;
            C43337Gzd c43337Gzd = h002.LJII;
            if (c43337Gzd != null) {
                List<String> list2 = h002.LJ;
                if (list2 != null) {
                    int size = i / list2.size();
                    InterfaceC43351Gzr interfaceC43351Gzr = c43337Gzd.LIZ.LIZ;
                    if (interfaceC43351Gzr == null) {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                    interfaceC43351Gzr.LIZJ(new C41855Gbj(size / 100.0f), EnumC43531H6p.OUTER);
                    C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("BDUploader progress: ");
                    LIZ.append(size);
                    LJJ.LIZJ("upload", X1D.LIZIZ(LIZ));
                    H00 h003 = c43337Gzd.LIZ;
                    h003.getClass();
                    try {
                        C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
                        C41777GaT.LIZ();
                    } catch (C43466H4c e) {
                        h003.LJIIIIZZ(new C41767GaJ(C43339Gzf.LIZ(-88888888), e));
                    }
                    return C76800UCe.LIZ;
                }
                o.LJIJI("imagePaths");
                throw null;
            }
            o.LJIJI("callback");
            throw null;
        }
        o.LJIJI("imagePaths");
        throw null;
    }
}
