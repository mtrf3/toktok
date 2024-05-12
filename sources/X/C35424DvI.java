package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.DvI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35424DvI extends AbstractC35420DvE {
    public final m LIZJ;

    @Override // X.AbstractC35420DvE
    public final void LIZ(SchemaBundle schemaBundle) {
        Object LIZ;
        for (String key : this.LIZJ.LJJIZ()) {
            j value = this.LIZJ.LJJIJ(key);
            o.LJFF(value, "value");
            if (value instanceof l) {
                o.LJFF(key, "key");
                if (schemaBundle.getQueryParameter(key) != null) {
                    schemaBundle.deleteQuery(key);
                }
            } else {
                try {
                    LIZ = value.LJJIFFI();
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                String str = (String) LIZ;
                if (str != null) {
                    o.LJFF(key, "key");
                    schemaBundle.appendQueryParameter(key, str);
                }
            }
        }
    }

    public C35424DvI(g gVar, m mVar, int i) {
        super(gVar, i);
        j LJJIJ = mVar.LJJIJ("params");
        o.LJFF(LJJIJ, "jsonObject.get(\"params\")");
        this.LIZJ = LJJIJ.LJIIZILJ();
    }
}
