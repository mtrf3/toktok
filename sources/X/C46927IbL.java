package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IbL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46927IbL extends AbstractC46948Ibg {
    public InterfaceC46926IbK LJ;

    public C46927IbL(InterfaceC46949Ibh interfaceC46949Ibh) {
        super(interfaceC46949Ibh);
    }

    @Override // X.InterfaceC46926IbK
    public final IYO LIZIZ(List<? extends IYN> list, java.util.Map<String, Object> map) {
        IYO iyo = new IYO();
        iyo.LJLJJL = "Intelligent";
        if (list == null || list.isEmpty()) {
            iyo.LJLILLLLZI = new C46892Iam(0, "bitrate list is empty...");
            return iyo;
        }
        List<? extends IYN> LIZJ = LIZJ(list);
        if (((ArrayList) LIZJ).isEmpty()) {
            iyo.LJLILLLLZI = new C46892Iam(5, "Intersection bitrate list is empty.");
            return iyo;
        }
        int intValue = ((Integer) map.get("internet_speed")).intValue();
        InterfaceC46926IbK interfaceC46926IbK = this.LJ;
        C46875IaV c46875IaV = new C46875IaV();
        ((HashMap) c46875IaV.LIZ).put("internet_speed", Integer.valueOf(intValue));
        IYO LIZIZ = interfaceC46926IbK.LIZIZ(LIZJ, c46875IaV.LIZ);
        LIZIZ.getClass();
        return LIZIZ;
    }
}
