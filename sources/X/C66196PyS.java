package X;

import X.C0M9;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.PyS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66196PyS implements InterfaceC66066PwM {
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI(CardStruct.IStatusCode.DEFAULT, "-1", "false", "null", "", "[]", "{}");
    public InterfaceC65994PvC LIZ;

    @Override // X.InterfaceC66066PwM
    public final String LIZ() {
        return "BinderEvent";
    }

    public static final boolean LIZJ(Map.Entry<String, String> entry) {
        String value;
        String key = entry.getKey();
        if (key == null || key.length() == 0 || (value = entry.getValue()) == null || value.length() == 0) {
            return false;
        }
        List<String> list = LIZIZ;
        o.LJI(entry.getValue());
        return !list.contains(r0);
    }

    @Override // X.InterfaceC66066PwM
    public final void LIZIZ(InterfaceC66068PwO interfaceC66068PwO) {
        if (interfaceC66068PwO instanceof C66201PyX) {
            C66201PyX c66201PyX = (C66201PyX) interfaceC66068PwO;
            if (c66201PyX.LJLLL) {
                C66202PyY c66202PyY = new C66202PyY(c66201PyX.LJLIL, c66201PyX.LJLILLLLZI, c66201PyX.LJLJI, c66201PyX.LJLJJI, c66201PyX.LJLJJL, String.valueOf(c66201PyX.LJLJL), String.valueOf(System.currentTimeMillis()), c66201PyX.LJLL, c66201PyX.LJLLI, c66201PyX.LJLJLLL, c66201PyX.LJLJLJ, c66201PyX.LJLJJLL, C1E4.LJJIJIIJIL(c66201PyX.LJLLILLLL), c66201PyX.LJLLJ);
                C1HQ c1hq = new C1HQ();
                c1hq.put("EventType", c66202PyY.LJLIL);
                c1hq.put("EventSubType", c66202PyY.LJLILLLLZI);
                c1hq.put("EventName", c66202PyY.LJLJI);
                c1hq.put("EventCurrentPage", c66202PyY.LJLJJI);
                c1hq.put("EventPageStack", c66202PyY.LJLJJL);
                c1hq.put("EventStartedTime", c66202PyY.LJLJJLL);
                c1hq.put("EventReportTime", c66202PyY.LJLJL);
                c1hq.put("Target", c66202PyY.LJLJLJ);
                c1hq.put("EventUserRegion", c66202PyY.LJLL);
                c1hq.put("SDKVersion", c66202PyY.LJLLLL);
                c1hq.put("ThreadName", c66202PyY.LJLLILLLL);
                c1hq.put("monitorScene", c66202PyY.LJLLJ);
                c1hq.put("permissionType", c66202PyY.LJLLL);
                c1hq.put("SharingData", c66202PyY.LJLJLLL);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = ((C0M9.b) c1hq.entrySet()).iterator();
                while (true) {
                    C0M8 c0m8 = (C0M8) it;
                    if (!c0m8.hasNext()) {
                        break;
                    }
                    c0m8.next();
                    if (!LIZJ(c0m8)) {
                        linkedHashMap.put(c0m8.getKey(), c0m8.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    c1hq.remove(((Map.Entry) it2.next()).getKey());
                }
                C1HQ c1hq2 = new C1HQ();
                c1hq2.put("EventType", c66202PyY.LJLIL);
                c1hq2.put("EventSubType", c66202PyY.LJLILLLLZI);
                c1hq2.put("EventName", c66202PyY.LJLJI);
                c1hq2.put("Target", c66202PyY.LJLJLJ);
                c1hq2.put("EventUserRegion", c66202PyY.LJLL);
                c1hq2.put("monitorScene", c66202PyY.LJLLJ);
                c1hq2.put("permissionType", c66202PyY.LJLLL);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it3 = ((C0M9.b) c1hq2.entrySet()).iterator();
                while (true) {
                    C0M8 c0m82 = (C0M8) it3;
                    if (!c0m82.hasNext()) {
                        break;
                    }
                    c0m82.next();
                    if (!LIZJ(c0m82)) {
                        linkedHashMap2.put(c0m82.getKey(), c0m82.getValue());
                    }
                }
                Iterator it4 = linkedHashMap2.entrySet().iterator();
                while (it4.hasNext()) {
                    c1hq2.remove(((Map.Entry) it4.next()).getKey());
                }
                InterfaceC65994PvC interfaceC65994PvC = this.LIZ;
                if (interfaceC65994PvC != null) {
                    interfaceC65994PvC.LIZIZ(c66202PyY.LJLLI, "PnS-" + c66202PyY.LJLLL, c66202PyY.LJLLILLLL, c1hq, c1hq2);
                }
                c1hq2.toString();
            }
        }
    }
}
