package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NeY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59866NeY extends AbstractC59640Nau implements InterfaceC58236MtM, InterfaceC60603NqR {
    public static final java.util.Map LJI;
    public final InterfaceC58235MtL LIZLLL;
    public final InterfaceC59875Neh LJ;
    public InterfaceC61046Nxa LJFF;

    @Override // X.AbstractC59640Nau, X.InterfaceC59877Nej
    public final void end() {
        this.LIZJ = false;
        LJJIJIL(null);
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJI = linkedHashMap;
        C59867NeZ c59867NeZ = C59871Ned.LIZ;
        linkedHashMap.put(c59867NeZ.LJLIL, c59867NeZ);
        C59867NeZ c59867NeZ2 = C59873Nef.LIZ;
        linkedHashMap.put(c59867NeZ2.LJLIL, c59867NeZ2);
    }

    @Override // X.InterfaceC60603NqR
    public final List<String> LIZIZ() {
        return this.LJ.LIZIZ();
    }

    @Override // X.InterfaceC60603NqR
    public final String LIZJ() {
        return this.LJ.LIZJ();
    }

    @Override // X.InterfaceC60603NqR
    public final boolean LJ() {
        return this.LJ.LJ();
    }

    @Override // X.InterfaceC60603NqR
    public final String LJFF() {
        return this.LJ.LJFF();
    }

    @Override // X.InterfaceC60603NqR
    public final boolean LJI() {
        return this.LJ.LJI();
    }

    @Override // X.InterfaceC58236MtM
    public final void LIZ(JSONObject jSONObject) {
        try {
            this.LIZLLL.LIZ(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final <T extends F1B> T LJJIJIIJI(Class<T> cls) {
        InterfaceC61046Nxa interfaceC61046Nxa = this.LJFF;
        if (interfaceC61046Nxa == null || !cls.isAssignableFrom(interfaceC61046Nxa.getClass())) {
            return null;
        }
        return (T) interfaceC61046Nxa;
    }

    public final void LJJIJIL(InterfaceC61046Nxa interfaceC61046Nxa) {
        InterfaceC61046Nxa interfaceC61046Nxa2 = this.LJFF;
        if (interfaceC61046Nxa2 != null) {
            interfaceC61046Nxa2.end();
        }
        if (interfaceC61046Nxa != null) {
            interfaceC61046Nxa.LJJ(LJJIJ(), this.LIZIZ);
        }
        this.LJFF = interfaceC61046Nxa;
    }

    public C59866NeY(C59750Ncg reportor, C59879Nel settings) {
        o.LJIIIZ(reportor, "reportor");
        o.LJIIIZ(settings, "settings");
        this.LIZLLL = reportor;
        this.LJ = settings;
    }

    @Override // X.InterfaceC58236MtM
    public final void LJIILIIL(Integer num, JSONObject jSONObject) {
        try {
            this.LIZLLL.LIZIZ(num, jSONObject, false);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC58236MtM
    public final void LIZLLL(Exception exc, String message, java.util.Map<String, String> map) {
        o.LJIIIZ(message, "message");
        try {
            this.LIZLLL.LIZLLL(exc, message, map);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJIJIIJIL(android.net.Uri uri, View view, java.util.Map<String, String> map) {
        C59869Neb c59869Neb = new C59869Neb();
        c59869Neb.LIZIZ(InterfaceC58236MtM.class, new C59868Nea(this));
        c59869Neb.LIZIZ(InterfaceC61046Nxa.class, new C59870Nec(this.LJFF));
        c59869Neb.LIZIZ(View.class, new C59868Nea(view));
        c59869Neb.LIZIZ(InterfaceC60603NqR.class, new C59868Nea(this));
        Iterator it = ((LinkedHashMap) LJI).entrySet().iterator();
        F1B f1b = null;
        while (it.hasNext() && (f1b = ((C59867NeZ) ((Map.Entry) it.next()).getValue()).LJLILLLLZI.invoke(uri, c59869Neb, map)) == null) {
        }
        F1B f1b2 = f1b;
        if (f1b2 != null && (f1b2 instanceof InterfaceC61046Nxa)) {
            LJJIJIL((InterfaceC61046Nxa) f1b2);
        }
    }
}
