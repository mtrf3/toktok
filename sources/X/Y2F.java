package X;

import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public final class Y2F implements Y3P {
    public final /* synthetic */ InterfaceC55235Lm3 LIZ;

    public Y2F(InterfaceC55235Lm3 interfaceC55235Lm3) {
        this.LIZ = interfaceC55235Lm3;
    }

    @Override // X.Y3P
    public final List<InterfaceC54035LIp> LIZ(List<? extends Class<? extends InterfaceC60152Xr>> list) {
        InterfaceC60152Xr t;
        ArrayList arrayList = null;
        if (C53146KtS.LIZ()) {
            List LJIJ = C62814Ol0.LJIJ(this.LIZ, ETParamsProvider.class);
            if (LJIJ != null) {
                arrayList = new ArrayList();
                Iterator it = ((ArrayList) LJIJ).iterator();
                while (it.hasNext()) {
                    ETParamsProvider eTParamsProvider = (ETParamsProvider) it.next();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<? extends Class<? extends InterfaceC60152Xr>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (eTParamsProvider.d2(it2.next()) && (t = eTParamsProvider.t()) != null) {
                            arrayList2.add(t);
                        }
                    }
                    ORS.LJJLIIIJILLIZJL(arrayList2, arrayList);
                }
            }
        } else {
            List LJIJ2 = C62814Ol0.LJIJ(this.LIZ, ETParamsProvider.class);
            if (LJIJ2 != null) {
                arrayList = new ArrayList();
                Iterator it3 = ((ArrayList) LJIJ2).iterator();
                while (it3.hasNext()) {
                    InterfaceC54035LIp param = ((EventParamsProtocol) it3.next()).getParam();
                    if (param != null) {
                        arrayList.add(param);
                    }
                }
            }
        }
        return arrayList;
    }
}
