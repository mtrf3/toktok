package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS1S0301000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1RG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RG implements C0MG, C0MC {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C0MG LIZ;
    public final ParcelableSnapshotMutableState LIZIZ = C78966Uyw.LJJJIL(null);
    public final java.util.Set<Object> LIZJ = new LinkedHashSet();

    @Override // X.C0MG
    public final boolean LIZ(Object value) {
        o.LJIIIZ(value, "value");
        return this.LIZ.LIZ(value);
    }

    @Override // X.C0MG
    public final C0MF LIZLLL(String key, InterfaceC65784Pro<? extends Object> interfaceC65784Pro) {
        o.LJIIIZ(key, "key");
        return this.LIZ.LIZLLL(key, interfaceC65784Pro);
    }

    @Override // X.C0MG
    public final Object LJFF(String key) {
        o.LJIIIZ(key, "key");
        return this.LIZ.LJFF(key);
    }

    @Override // X.C0MG
    public final java.util.Map<String, List<Object>> LIZJ() {
        C0MC c0mc = (C0MC) this.LIZIZ.getValue();
        if (c0mc != null) {
            Iterator<Object> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                c0mc.LJ(it.next());
            }
        }
        return this.LIZ.LIZJ();
    }

    @Override // X.C0MC
    public final void LJ(Object key) {
        o.LJIIIZ(key, "key");
        C0MC c0mc = (C0MC) this.LIZIZ.getValue();
        if (c0mc != null) {
            c0mc.LJ(key);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C1RG(C0MG c0mg, java.util.Map<String, ? extends List<? extends Object>> map) {
        this.LIZ = new C1HX(map, new IDqS416S0100000(c0mg, 206));
    }

    @Override // X.C0MC
    public final void LIZIZ(Object key, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-697180401);
        C0MC c0mc = (C0MC) this.LIZIZ.getValue();
        if (c0mc != null) {
            c0mc.LIZIZ(key, content, LJIL, (i & 112) | 520);
            C24610xt.LIZIZ(key, new IDqS172S0200000(this, key, 47), LJIL);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new IDqS1S0301000(this, (C1RG) key, (Object) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 5);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
