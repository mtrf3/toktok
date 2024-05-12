package X;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VMP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C61659OHv LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VMP(View view, String str, C61659OHv c61659OHv) {
        super(0);
        this.LJLIL = view;
        this.LJLILLLLZI = str;
        this.LJLJI = c61659OHv;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C35894E6w c35894E6w;
        OFH ofh = OFH.LIZLLL;
        View view = this.LJLIL;
        String monitorId = this.LJLILLLLZI;
        C61659OHv error = this.LJLJI;
        ofh.getClass();
        o.LJIIJ(monitorId, "monitorId");
        o.LJIIJ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportContainerError [monitorId:");
        LIZ.append(monitorId);
        LIZ.append("][errorCode:");
        LIZ.append(error.LJLIL);
        LIZ.append("][errorMsg:");
        LIZ.append(error.LJLILLLLZI);
        LIZ.append(']');
        X1D.LIZIZ(LIZ);
        OFH.LIZ.getClass();
        COL LJ = OFI.LJ(monitorId);
        if (view != null) {
            c35894E6w = OFI.LJFF(view);
        } else {
            c35894E6w = new C35894E6w((java.util.Map<String, ? extends Object>) OFI.LIZIZ(monitorId));
        }
        if (LJ != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) OFH.LIZIZ;
            if (linkedHashMap.get(LJ.LIZ) != null) {
                Object obj = linkedHashMap.get(LJ.LIZ);
                if (obj != null) {
                    ((OFM) obj).handleContainerError(view, monitorId, c35894E6w, error);
                    return C76800UCe.LIZ;
                }
                o.LJIIZILJ();
                throw null;
            }
        }
        VM4 vm4 = new VM4("containerError");
        vm4.LIZIZ();
        vm4.LJIIL = new C79617VMn();
        VMG vmg = new VMG();
        vmg.LJLJJLL = error.LJLJI;
        Object obj2 = ((ConcurrentHashMap) OFI.LIZJ(monitorId)).get("url");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str != null) {
            vmg.LJLIL = str;
        }
        Object obj3 = ((ConcurrentHashMap) OFI.LIZJ(monitorId)).get("native_page");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str2 = (String) obj3;
        if (str2 != null) {
            vmg.LJLJJI = str2;
        }
        Object obj4 = ((ConcurrentHashMap) OFI.LIZJ(monitorId)).get("container_type");
        if (!(obj4 instanceof String)) {
            obj4 = null;
        }
        String str3 = (String) obj4;
        if (str3 != null) {
            vmg.LJLJI = str3;
        }
        vm4.LJ = vmg;
        vm4.LJIILIIL = error.L();
        vm4.LJI = c35894E6w;
        vm4.LIZJ();
        VMW.LIZJ.LIZ(new OSZ<>(vm4, null));
        return C76800UCe.LIZ;
    }
}
