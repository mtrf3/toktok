package X;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.107, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass107 {
    public boolean LIZIZ;
    public Bundle LIZJ;
    public boolean LIZLLL;
    public C1CN LJ;
    public final SafeIterableMap<String, AnonymousClass106> LIZ = new SafeIterableMap<>();
    public boolean LJFF = true;

    public final AnonymousClass106 LIZIZ() {
        Iterator<Map.Entry<String, AnonymousClass106>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            Map.Entry<String, AnonymousClass106> components = it.next();
            o.LJIIIIZZ(components, "components");
            String key = components.getKey();
            AnonymousClass106 value = components.getValue();
            if (o.LJ(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return value;
            }
        }
        return null;
    }

    public final Bundle LIZ(String key) {
        o.LJIIIZ(key, "key");
        if (this.LIZLLL) {
            Bundle bundle = this.LIZJ;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(key);
            Bundle bundle3 = this.LIZJ;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.LIZJ;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.LIZJ = null;
            }
            return bundle2;
        }
        "You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString();
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void LIZLLL(Class<? extends AnonymousClass104> cls) {
        if (this.LJFF) {
            C1CN c1cn = this.LJ;
            if (c1cn == null) {
                c1cn = new C1CN(this);
            }
            this.LJ = c1cn;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                C1CN c1cn2 = this.LJ;
                if (c1cn2 != null) {
                    c1cn2.LIZ.add(cls.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Class ");
                LIZ.append(C16880lQ.LJLLJ(cls));
                LIZ.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ), e);
            }
        }
        "Can not perform this action after onSaveInstanceState".toString();
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final void LIZJ(String key, AnonymousClass106 provider) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(provider, "provider");
        if (this.LIZ.putIfAbsent(key, provider) == null) {
            return;
        }
        "SavedStateProvider with the given key is already registered".toString();
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
}
