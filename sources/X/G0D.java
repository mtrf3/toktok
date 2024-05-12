package X;

import android.content.Context;
import com.google.android.play.core.appupdate.e;
import com.google.android.play.core.appupdate.g;
import com.google.android.play.core.appupdate.i;
import com.google.android.play.core.appupdate.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0D implements InterfaceC153055zZ {
    public final /* synthetic */ int LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;

    public G0D() {
        this.LJLIL = 4;
        this.LJLILLLLZI = new LinkedHashSet();
        this.LJLJI = new LinkedHashSet();
        this.LJLJJI = new LinkedHashSet();
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Object a = ((InterfaceC153055zZ) this.LJLILLLLZI).a();
        e eVar = (e) ((InterfaceC153055zZ) this.LJLJI).a();
        Context context = (Context) ((i) ((InterfaceC153055zZ) this.LJLJJI)).LJLIL.LIZ;
        C40654FxS.LJI(context);
        return new g((p) a, eVar, context);
    }

    public final String toString() {
        switch (this.LJLIL) {
            case 0:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.LJLILLLLZI);
                sb.append('{');
                G0E g0e = ((G0E) this.LJLJI).LIZJ;
                String str = "";
                while (g0e != null) {
                    Object obj = g0e.LIZIZ;
                    sb.append(str);
                    String str2 = g0e.LIZ;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    g0e = g0e.LIZJ;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public G0D(InterfaceC40755Fz5 sceneHost) {
        this.LJLIL = 2;
        o.LJIIIZ(sceneHost, "sceneHost");
        this.LJLILLLLZI = sceneHost;
        this.LJLJI = new LinkedHashMap();
        this.LJLJJI = new ArrayList();
    }

    public final Object LIZ(Class cls) {
        Iterator it = ((List) this.LJLJJI).iterator();
        while (it.hasNext()) {
            Object service = ((InterfaceC40794Fzi) it.next()).getService(cls);
            if (service != null) {
                return service;
            }
        }
        return null;
    }

    public /* synthetic */ G0D(String str) {
        this.LJLIL = 0;
        G0E g0e = new G0E();
        this.LJLJI = g0e;
        this.LJLJJI = g0e;
        this.LJLILLLLZI = str;
    }

    public final void LIZIZ(Object obj, String str) {
        G0E g0e = new G0E();
        ((G0E) this.LJLJJI).LIZJ = g0e;
        this.LJLJJI = g0e;
        g0e.LIZIZ = obj;
        g0e.LIZ = str;
    }

    public /* synthetic */ G0D(int i, InterfaceC153055zZ interfaceC153055zZ, InterfaceC153055zZ interfaceC153055zZ2, i iVar) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC153055zZ;
        this.LJLJI = interfaceC153055zZ2;
        this.LJLJJI = iVar;
    }
}
