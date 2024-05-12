package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJC implements InterfaceC82090WJq {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final List<WJB> LIZIZ = new ArrayList();
    public final java.util.Map<C6MP, WJB> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC82090WJq
    public final void LIZ() {
        Iterator<WJB> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    public WJC(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC82090WJq
    public final void LIZIZ(C6MP type) {
        o.LJIIIZ(type, "type");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        WJB wjb = (WJB) ((LinkedHashMap) this.LIZJ).get(type);
        if (wjb != null) {
            wjb.LJFF();
        }
    }

    @Override // X.InterfaceC82090WJq
    public final WI1 LIZJ(C6MP type) {
        o.LJIIIZ(type, "type");
        WJB wjb = (WJB) ((LinkedHashMap) this.LIZJ).get(type);
        if (wjb != null) {
            return wjb.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC82090WJq
    public final void LIZLLL(C82028WHg event) {
        o.LJIIIZ(event, "event");
        WJB wjb = (WJB) ((LinkedHashMap) this.LIZJ).get(event.LJLILLLLZI);
        if (wjb != null) {
            wjb.LIZIZ(event);
        }
    }

    @Override // X.InterfaceC82090WJq
    public final void LJ(List<? extends WJB> list) {
        o.LJIIIZ(list, "list");
        ((ArrayList) this.LIZIZ).addAll(list);
        for (WJB wjb : this.LIZIZ) {
            this.LIZJ.put(wjb.LIZJ().LJIIIIZZ(), wjb);
        }
    }

    @Override // X.InterfaceC82090WJq
    public final void LJFF(C6MP type) {
        o.LJIIIZ(type, "type");
        WJB wjb = (WJB) ((LinkedHashMap) this.LIZJ).get(type);
        if (wjb != null) {
            wjb.LIZ();
        }
    }

    @Override // X.InterfaceC82090WJq
    public final void LJI(C6MP type) {
        o.LJIIIZ(type, "type");
        ((LinkedHashMap) this.LIZJ).get(type);
    }

    @Override // X.InterfaceC82090WJq
    public final void LJII(C1537261o event) {
        o.LJIIIZ(event, "event");
        WJB wjb = (WJB) ((LinkedHashMap) this.LIZJ).get(event.LJLIL);
        if (wjb != null) {
            wjb.LJI(event);
        }
    }

    @Override // X.InterfaceC82090WJq
    public final WJB LJIIIIZZ(C6MP toolbarType) {
        o.LJIIIZ(toolbarType, "toolbarType");
        return (WJB) ((LinkedHashMap) this.LIZJ).get(toolbarType);
    }
}
