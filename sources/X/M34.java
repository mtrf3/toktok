package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.placediscovery2.ui.assem.DiscoveryMapAssem;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M34 extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends C56167M2p<?>>, C76800UCe> {
    public final /* synthetic */ DiscoveryMapAssem LJLIL;
    public final /* synthetic */ List<C191707fi> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M34(DiscoveryMapAssem discoveryMapAssem, List<C191707fi> list) {
        super(1);
        this.LJLIL = discoveryMapAssem;
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends C56167M2p<?>> triggerMsgList) {
        Collection<C191707fi> data;
        C191707fi c191707fi;
        M36<C191707fi> m36;
        o.LJIIIZ(triggerMsgList, "triggerMsgList");
        DiscoveryMapAssem discoveryMapAssem = this.LJLIL;
        List<C191707fi> markerList = this.LJLILLLLZI;
        C8DU c8du = discoveryMapAssem.LJLILLLLZI;
        if (c8du != null) {
            c8du.LJJJJIZL();
        }
        M36<C191707fi> m362 = discoveryMapAssem.LJLJI;
        if (m362 != null) {
            m362.clearData();
            M36<C191707fi> m363 = discoveryMapAssem.LJLJI;
            if (m363 != null) {
                m363.LJII(markerList);
                M36<C191707fi> m364 = discoveryMapAssem.LJLJI;
                if (m364 != null) {
                    m364.LJIIIIZZ();
                    DiscoveryLandingMapVM v3 = discoveryMapAssem.v3();
                    v3.getClass();
                    o.LJIIIZ(markerList, "markerList");
                    M35 m35 = v3.LL;
                    m35.getClass();
                    synchronized (m35.LIZJ) {
                        if (!markerList.isEmpty()) {
                            List<C191707fi> list = m35.LIZLLL;
                            if (list != null) {
                                boolean LJ = o.LJ(markerList, list);
                                m35.LJ = LJ;
                                if (LJ) {
                                    for (Map.Entry entry : ((LinkedHashMap) m35.LIZ).entrySet()) {
                                        M36<C191707fi> m365 = m35.LJFF;
                                        if (m365 != null && (data = m365.getData()) != null) {
                                            Iterator<C191707fi> it = data.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    c191707fi = it.next();
                                                    if (o.LJ(c191707fi.LIZ, entry.getKey())) {
                                                        break;
                                                    }
                                                } else {
                                                    c191707fi = null;
                                                    break;
                                                }
                                            }
                                            C191707fi c191707fi2 = c191707fi;
                                            if (c191707fi2 != null && (m36 = m35.LJFF) != null) {
                                                m36.LIZJ(c191707fi2, C191707fi.LIZLLL(c191707fi2, (Bitmap) entry.getValue(), false, 125));
                                            }
                                        }
                                    }
                                    ((LinkedHashMap) m35.LIZ).clear();
                                    M36<C191707fi> m366 = m35.LJFF;
                                    if (m366 != null) {
                                        m366.LJIIIIZZ();
                                    }
                                }
                            } else {
                                o.LJIJI("currentMarkerList");
                                throw null;
                            }
                        }
                    }
                    return C76800UCe.LIZ;
                }
                o.LJIJI("clusterOperator");
                throw null;
            }
            o.LJIJI("clusterOperator");
            throw null;
        }
        o.LJIJI("clusterOperator");
        throw null;
    }
}
