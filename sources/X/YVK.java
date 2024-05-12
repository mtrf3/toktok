package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YVK<STATE, EVENT, SIDE_EFFECT> {
    public STATE LIZ;
    public final LinkedHashMap<YVG<STATE, STATE>, YVP<STATE, EVENT, SIDE_EFFECT>> LIZIZ;
    public final ArrayList<InterfaceC88472Yns<YVQ<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C76800UCe>> LIZJ;

    public YVK() {
        this(null);
    }

    public YVK(YVJ<STATE, EVENT, SIDE_EFFECT> yvj) {
        STATE state;
        Collection collection;
        java.util.Map map;
        if (yvj != null) {
            state = yvj.LIZ;
        } else {
            state = null;
        }
        this.LIZ = state;
        this.LIZIZ = new LinkedHashMap<>((yvj == null || (map = yvj.LIZIZ) == null) ? C113554cx.LJJJLIIL() : map);
        this.LIZJ = new ArrayList<>((yvj == null || (collection = yvj.LIZJ) == null) ? C61878OQg.INSTANCE : collection);
    }

    /* loaded from: classes16.dex */
    public final class a<S extends STATE> {
        public final YVP<STATE, EVENT, SIDE_EFFECT> LIZ = new YVP<>();

        public final <E extends EVENT> void LIZ(YVG<EVENT, ? extends E> yvg, InterfaceC88471Ynr<? super S, ? super E, ? extends YVN<? extends STATE, ? extends SIDE_EFFECT>> interfaceC88471Ynr) {
            this.LIZ.LIZ.put(yvg, new AqS197S0100000_15(interfaceC88471Ynr, 0));
        }

        public static YVN LIZIZ(Object obj, YVS state, YVR yvr) {
            o.LJIIIZ(obj, "<this>");
            o.LJIIIZ(state, "state");
            return new YVN(state, yvr);
        }
    }

    public final <S extends STATE> void LIZ(YVG<STATE, ? extends S> yvg, InterfaceC88472Yns<? super YVK<STATE, EVENT, SIDE_EFFECT>.a<S>, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        LinkedHashMap<YVG<STATE, STATE>, YVP<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.LIZIZ;
        a aVar = new a();
        init.invoke(aVar);
        linkedHashMap.put(yvg, aVar.LIZ);
    }
}
