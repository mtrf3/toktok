package X;

import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.E1u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35762E1u extends AbstractC35763E1v {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final C62822Ol8 LIZJ;

    @Override // X.AbstractC35763E1v
    public final java.util.Map<String, Object> LIZLLL() {
        return (java.util.Map) this.LIZJ.getValue();
    }

    @Override // X.AbstractC35763E1v
    public final String LIZJ() {
        return this.LIZ;
    }

    public C35762E1u(String name, JSONObject jSONObject) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = jSONObject;
        this.LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 91));
    }
}
