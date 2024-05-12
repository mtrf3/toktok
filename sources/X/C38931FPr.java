package X;

import com.google.gson.internal.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FPr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38931FPr implements InterfaceC38932FPs {
    public static final /* synthetic */ int LJLJJL = 0;
    public InterfaceC88472Yns<? super InterfaceC38217EzF, C76800UCe> LJLIL;
    public final String LJLILLLLZI;
    public final java.util.Map<String, InterfaceC38932FPs> LJLJI;
    public final java.util.Map<String, InterfaceC38217EzF> LJLJJI;

    @Override // X.InterfaceC37788EsK
    public final void release() {
        Iterator<Map.Entry<String, InterfaceC38932FPs>> it = this.LJLJI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().release();
        }
        Iterator<Map.Entry<String, InterfaceC38217EzF>> it2 = this.LJLJJI.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().release();
        }
    }

    @Override // X.InterfaceC38932FPs
    public final java.util.Map<String, InterfaceC38932FPs> Mk() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC38932FPs
    public final java.util.Map<String, InterfaceC38217EzF> Nj() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC38932FPs
    public final String getName() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38932FPs
    public final void Gh(InterfaceC38932FPs otherScope) {
        o.LJIIJ(otherScope, "otherScope");
        for (Map.Entry<String, InterfaceC38217EzF> entry : otherScope.Nj().entrySet()) {
            if (this.LJLJJI.containsKey(entry.getKey())) {
                entry.getValue().release();
            } else {
                this.LJLJJI.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, InterfaceC38932FPs> entry2 : otherScope.Mk().entrySet()) {
            if (this.LJLJI.containsKey(entry2.getKey())) {
                InterfaceC38932FPs interfaceC38932FPs = this.LJLJI.get(entry2.getKey());
                if (interfaceC38932FPs != null) {
                    interfaceC38932FPs.Gh(entry2.getValue());
                }
            } else {
                this.LJLJI.put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    @Override // X.InterfaceC38932FPs
    public final void we(InterfaceC88471Ynr<? super List<? extends InterfaceC38932FPs>, ? super InterfaceC38217EzF, C76800UCe> interfaceC88471Ynr) {
        Iterator<Map.Entry<String, InterfaceC38932FPs>> it = this.LJLJI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().we(new AqS169S0200000_6(this, interfaceC88471Ynr, 0));
        }
        Iterator<Map.Entry<String, InterfaceC38217EzF>> it2 = this.LJLJJI.entrySet().iterator();
        while (it2.hasNext()) {
            interfaceC88471Ynr.invoke(C47261Igj.LJJIJ(this), it2.next().getValue());
        }
    }

    public C38931FPr(String str, java.util.Map map, java.util.Map map2) {
        this.LJLILLLLZI = str;
        this.LJLJI = map;
        this.LJLJJI = map2;
    }

    @Override // X.InterfaceC38932FPs
    public final void k7(List<String> scopeNames, Object params, InterfaceC38189Eyn callback, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        o.LJIIJ(scopeNames, "scopeNames");
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(reject, "reject");
        int size = scopeNames.size();
        if (size != 0) {
            if (size != 1) {
                String str = (String) ORZ.LJLLJ(scopeNames);
                InterfaceC38932FPs interfaceC38932FPs = this.LJLJI.get(str);
                if (interfaceC38932FPs == null) {
                    reject.invoke(new C38930FPq(str));
                    return;
                } else {
                    this.LJLIL = this.LJLIL;
                    interfaceC38932FPs.k7(scopeNames.subList(1, scopeNames.size()), params, callback, reject);
                    return;
                }
            }
            String str2 = (String) ORZ.LJLLJ(scopeNames);
            InterfaceC38217EzF interfaceC38217EzF = this.LJLJJI.get(str2);
            if (interfaceC38217EzF == null) {
                reject.invoke(new C38930FPq(str2));
                return;
            }
            if (interfaceC38217EzF instanceof InterfaceC38186Eyk) {
                InterfaceC88472Yns<? super InterfaceC38217EzF, C76800UCe> interfaceC88472Yns = this.LJLIL;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(interfaceC38217EzF);
                }
                ((InterfaceC38186Eyk) interfaceC38217EzF).handle((JSONObject) params, (InterfaceC37120EhY) callback);
                return;
            }
            if (!(interfaceC38217EzF instanceof InterfaceC38202Ez0)) {
                return;
            }
            InterfaceC88472Yns<? super InterfaceC38217EzF, C76800UCe> interfaceC88472Yns2 = this.LJLIL;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(interfaceC38217EzF);
            }
            InterfaceC38202Ez0 interfaceC38202Ez0 = (InterfaceC38202Ez0) interfaceC38217EzF;
            if (interfaceC38202Ez0 == null) {
                return;
            }
            b.LIZ(interfaceC38202Ez0, params, (InterfaceC38203Ez1) callback);
            return;
        }
        reject.invoke(new C38930FPq("[unknown]"));
    }
}
