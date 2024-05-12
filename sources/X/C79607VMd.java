package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import java.util.LinkedList;
import ujb.o;

/* renamed from: X.VMd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79607VMd extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79607VMd(String str, String str2) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        LinkedList linkedList = new LinkedList();
        if (str != null) {
            linkedList.add(str);
        }
        if (str2 != null) {
            linkedList.add(str2);
        }
        String LJI = VMV.LJI(linkedList, VMV.LIZIZ);
        if (o.LJJJJJL(LJI) && str != null) {
            HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
            kotlin.jvm.internal.o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
            InterfaceC40069Fo1 hybridSettingManager = hybridMultiMonitor.getHybridSettingManager();
            kotlin.jvm.internal.o.LJFF(hybridSettingManager, "HybridMultiMonitor.getIn…ce().hybridSettingManager");
            LJI = C38916FPc.LIZ(str, hybridSettingManager.LIZIZ(), true);
        }
        if (o.LJJJJJL(LJI)) {
            LJI = "";
        }
        C67348Qbw.LIZ(this.LJLIL, LJI);
        return C76800UCe.LIZ;
    }
}
