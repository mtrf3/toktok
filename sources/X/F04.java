package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F04 extends C37944Euq implements InterfaceC37947Eut, F09 {
    public final F0A LJLIL;
    public final boolean LJLILLLLZI;
    public final ConcurrentHashMap<String, C37948Euu> LJLJI;
    public final AtomicBoolean LJLJJI;
    public Context LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final java.util.Map<String, Class<? extends InterfaceC37666EqM>> LJLJL;

    public F04() {
        this(false, 3);
    }

    @Override // X.C37944Euq
    public final C31897CfV LJFF() {
        if (this.LJLILLLLZI) {
            return (C31897CfV) this.LJLJJLL.getValue();
        }
        return null;
    }

    @Override // X.C37944Euq
    public final List<Class<? extends InterfaceC37666EqM>> LJII() {
        ArrayList arrayList = new ArrayList();
        java.util.Map<String, Class<? extends InterfaceC37666EqM>> map = this.LJLJL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            F0A f0a = this.LJLIL;
            if (f0a == null || f0a.LIZ((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    @Override // X.F09
    public final C37948Euu LIZ(String callbackId) {
        o.LJIIIZ(callbackId, "callbackId");
        return this.LJLJI.get(callbackId);
    }

    @Override // X.InterfaceC37947Eut
    public final void LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJLJJI.set(true);
        this.LJLJI.clear();
    }

    @Override // X.F09
    public final void LIZLLL(String callbackId) {
        o.LJIIIZ(callbackId, "callbackId");
        this.LJLJI.remove(callbackId);
    }

    public F04(F0A f0a, boolean z) {
        this.LJLIL = f0a;
        this.LJLILLLLZI = z;
        this.LJLJI = new ConcurrentHashMap<>();
        this.LJLJJI = new AtomicBoolean(false);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 105));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("adInfo", C39364Fce.class);
        linkedHashMap.put("showAutofillPopup", C58916NAi.class);
        this.LJLJL = linkedHashMap;
    }

    @Override // X.F09
    public final void LIZJ(String str, C37945Eur c37945Eur) {
        this.LJLJI.put(str, c37945Eur);
    }

    @Override // X.InterfaceC37947Eut
    public final void LJ(Context context, InterfaceC60761Nsz kitView) {
        o.LJIIIZ(kitView, "kitView");
        if (this.LJLILLLLZI) {
            synchronized (this) {
                this.LJLJJL = context;
            }
            C37942Euo c37942Euo = (C37942Euo) kitView.getHybridContext().LIZIZ(C37942Euo.class);
            if (c37942Euo != null) {
                List LJIJJLI = F01.LJIJJLI(kitView, context, this, this.LJLILLLLZI);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) LJIJJLI).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C38236EzY c38236EzY = (C38236EzY) next;
                    F0A f0a = this.LJLIL;
                    if (f0a == null || f0a.LIZIZ(c38236EzY)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c37942Euo.LJIILJJIL((C38236EzY) it2.next());
                }
                return;
            }
            return;
        }
        C37942Euo c37942Euo2 = (C37942Euo) kitView.getHybridContext().LIZIZ(C37942Euo.class);
        if (c37942Euo2 != null) {
            List LJIJJLI2 = F01.LJIJJLI(kitView, context, this, false);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = ((ArrayList) LJIJJLI2).iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                C38236EzY c38236EzY2 = (C38236EzY) next2;
                F0A f0a2 = this.LJLIL;
                if (f0a2 == null || f0a2.LIZIZ(c38236EzY2)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                c37942Euo2.LJIILJJIL((C38236EzY) it4.next());
            }
        }
    }

    public /* synthetic */ F04(boolean z, int i) {
        this((F0A) null, (i & 2) != 0 ? false : z);
    }
}
