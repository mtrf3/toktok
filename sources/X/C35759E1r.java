package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.clienttrigger.ConditionalStateMachine;
import com.ss.android.ugc.aweme.plugin.clienttrigger.EventMatch;
import com.ss.android.ugc.aweme.plugin.clienttrigger.Node;
import com.ss.android.ugc.aweme.plugin.clienttrigger.NodeType;
import com.ss.android.ugc.aweme.plugin.clienttrigger.StateNodeProperties;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.E1r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35759E1r implements InterfaceC35766E1y {
    public final InterfaceC35760E1s LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final java.util.Map<Integer, List<Long>> LIZLLL;
    public final java.util.Map<Integer, ConditionalStateMachine> LJ;
    public final java.util.Map<Integer, Node> LJFF;
    public final java.util.Map<Integer, java.util.Map<Integer, Node>> LJI;
    public final java.util.Map<String, Integer> LJII;
    public final ExecutorService LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public final List<AbstractC35763E1v> LJIIJJI;
    public int LJIIL;
    public C35765E1x LJIILIIL;

    public final void LIZIZ(AbstractC35763E1v abstractC35763E1v) {
        Integer num = (Integer) ((LinkedHashMap) this.LJII).get(abstractC35763E1v.LIZJ());
        if (num == null || num.intValue() <= 0) {
            return;
        }
        if (this.LJIIIZ >= this.LIZIZ) {
            if (this.LJIILIIL != null) {
                this.LJIIL++;
                return;
            }
            synchronized (this) {
                if (this.LJIILIIL != null) {
                    return;
                }
                this.LJIIL++;
                PthreadTimer pthreadTimer = new PthreadTimer("PluginEventInterceptor");
                C35765E1x c35765E1x = new C35765E1x(this);
                this.LJIILIIL = c35765E1x;
                pthreadTimer.schedule(c35765E1x, this.LIZJ);
                return;
            }
        }
        if (!this.LJIIJ) {
            if (C2RH.LIZ().contains(abstractC35763E1v.LIZJ())) {
                ((ArrayList) this.LJIIJJI).add(abstractC35763E1v);
            }
        } else {
            if (this.LJ.isEmpty()) {
                return;
            }
            this.LJIIIZ++;
            this.LJIIIIZZ.submit(new ARunnableS25S0200000_6(abstractC35763E1v, this, 30));
        }
    }

    public final void LIZJ(AbstractC35763E1v abstractC35763E1v) {
        StateNodeProperties stateNodeProperties;
        List<EventMatch> list;
        Node node;
        NodeType nodeType;
        StateNodeProperties stateNodeProperties2;
        List<EventMatch> list2;
        for (Map.Entry entry : ((LinkedHashMap) this.LJFF).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Node node2 = (Node) entry.getValue();
            if (C243019gH.LIZ[node2.nodeType.type.ordinal()] == 1 && (stateNodeProperties = node2.nodeType.stateNodeProperties) != null && (list = stateNodeProperties.matches) != null) {
                for (EventMatch eventMatch : list) {
                    if (o.LJ(eventMatch.name, abstractC35763E1v.LIZJ()) && abstractC35763E1v.LIZ(eventMatch.matchProporties)) {
                        if (eventMatch.numMatchesLeft == null) {
                            eventMatch.numMatchesLeft = eventMatch.eventCount;
                        }
                        Integer num = eventMatch.numMatchesLeft;
                        if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                            eventMatch.numMatchesLeft = null;
                            int i = eventMatch.nextNodeId;
                            java.util.Map map = (java.util.Map) ((LinkedHashMap) this.LJI).get(Integer.valueOf(intValue));
                            if (map != null && (node = (Node) map.get(Integer.valueOf(i))) != null) {
                                Object obj = ((LinkedHashMap) this.LJ).get(Integer.valueOf(intValue));
                                if (obj != null) {
                                    ConditionalStateMachine conditionalStateMachine = (ConditionalStateMachine) obj;
                                    Node node3 = (Node) ((LinkedHashMap) this.LJFF).get(Integer.valueOf(intValue));
                                    if (node3 != null && (nodeType = node3.nodeType) != null && (stateNodeProperties2 = nodeType.stateNodeProperties) != null && (list2 = stateNodeProperties2.matches) != null) {
                                        for (EventMatch eventMatch2 : list2) {
                                            java.util.Map<String, Integer> map2 = this.LJII;
                                            String str = eventMatch2.name;
                                            Integer num2 = (Integer) ((LinkedHashMap) map2).get(str);
                                            map2.put(str, Integer.valueOf(num2 != null ? num2.intValue() - 1 : 0));
                                        }
                                    }
                                    conditionalStateMachine.currentNodeId = i;
                                    this.LJFF.put(Integer.valueOf(intValue), node);
                                    int i2 = C243019gH.LIZ[node.nodeType.type.ordinal()];
                                    if (i2 != 2) {
                                        if (i2 == 3) {
                                            conditionalStateMachine.shouldDisable = Boolean.TRUE;
                                            synchronized (this) {
                                                this.LIZLLL.remove(Integer.valueOf(intValue));
                                                this.LJ.remove(Integer.valueOf(intValue));
                                                this.LJFF.remove(Integer.valueOf(intValue));
                                                this.LJI.remove(Integer.valueOf(intValue));
                                            }
                                        }
                                        this.LIZ.onUpdateState(conditionalStateMachine);
                                    } else {
                                        List<Long> list3 = (List) ((LinkedHashMap) this.LIZLLL).get(Integer.valueOf(intValue));
                                        if (list3 == null) {
                                            list3 = C61878OQg.INSTANCE;
                                        }
                                        conditionalStateMachine.isComplete = Boolean.TRUE;
                                        synchronized (this) {
                                            this.LIZLLL.remove(Integer.valueOf(intValue));
                                            this.LJ.remove(Integer.valueOf(intValue));
                                            this.LJFF.remove(Integer.valueOf(intValue));
                                            this.LJI.remove(Integer.valueOf(intValue));
                                        }
                                        this.LIZ.onCompleted(conditionalStateMachine, list3);
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            Integer num3 = eventMatch.numMatchesLeft;
                            o.LJI(num3);
                            eventMatch.numMatchesLeft = Integer.valueOf(num3.intValue() - 1);
                            InterfaceC35760E1s interfaceC35760E1s = this.LIZ;
                            Object obj2 = ((LinkedHashMap) this.LJ).get(Integer.valueOf(intValue));
                            o.LJI(obj2);
                            interfaceC35760E1s.onUpdateState((ConditionalStateMachine) obj2);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC35766E1y
    public void onEvent(String str) {
        if (str == null) {
            return;
        }
        LIZIZ(new C35761E1t(str, null));
    }

    @Override // X.InterfaceC35766E1y
    public final void onEvent(String str, java.util.Map<String, String> map) {
        if (str == null) {
            return;
        }
        LIZIZ(new C35761E1t(str, map));
    }

    @Override // X.InterfaceC35766E1y
    public final void onEvent(String str, JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        LIZIZ(new C35762E1u(str, jSONObject));
    }

    public C35759E1r(PluginService listener, int i, long j) {
        o.LJIIIZ(listener, "listener");
        this.LIZ = listener;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = C16880lQ.LLLLZLLIL();
        this.LJIIJJI = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(List newStateMachines, boolean z, java.util.Map map) {
        List<EventMatch> list;
        int i;
        o.LJIIIZ(newStateMachines, "newStateMachines");
        Iterator it = newStateMachines.iterator();
        while (it.hasNext()) {
            ConditionalStateMachine conditionalStateMachine = (ConditionalStateMachine) it.next();
            if (((LinkedHashMap) this.LJ).get(Integer.valueOf(conditionalStateMachine.id)) == null) {
                Boolean bool = conditionalStateMachine.shouldDisable;
                Boolean bool2 = Boolean.TRUE;
                if (!o.LJ(bool, bool2) && !o.LJ(conditionalStateMachine.isComplete, bool2)) {
                    int i2 = conditionalStateMachine.currentNodeId;
                    List<Node> list2 = conditionalStateMachine.nodes;
                    int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list2, 10));
                    if (LJJIIZ < 16) {
                        LJJIIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                    for (Node node : list2) {
                        linkedHashMap.put(Integer.valueOf(node.id), node);
                    }
                    Iterator<Node> it2 = conditionalStateMachine.nodes.iterator();
                    while (it2.hasNext()) {
                        StateNodeProperties stateNodeProperties = it2.next().nodeType.stateNodeProperties;
                        if (stateNodeProperties != null && (list = stateNodeProperties.matches) != null) {
                            for (EventMatch eventMatch : list) {
                                java.util.Map<String, Integer> map2 = this.LJII;
                                String str = eventMatch.name;
                                Integer num = (Integer) ((LinkedHashMap) map2).get(str);
                                if (num != null) {
                                    i = num.intValue() + 1;
                                } else {
                                    i = 1;
                                }
                                map2.put(str, Integer.valueOf(i));
                            }
                        }
                    }
                    Object obj = linkedHashMap.get(Integer.valueOf(i2));
                    if (obj != null) {
                        this.LJ.put(Integer.valueOf(conditionalStateMachine.id), conditionalStateMachine);
                        this.LJFF.put(Integer.valueOf(conditionalStateMachine.id), obj);
                        this.LJI.put(Integer.valueOf(conditionalStateMachine.id), linkedHashMap);
                    }
                }
            }
        }
        synchronized (this) {
            ((LinkedHashMap) this.LIZLLL).clear();
            this.LIZLLL.putAll(map);
        }
        if (z) {
            this.LJIIIIZZ.submit(new ARunnableS42S0100000_6(this, 71));
            this.LJIIJ = true;
        }
    }
}
