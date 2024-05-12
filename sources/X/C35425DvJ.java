package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.DvJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35425DvJ extends AbstractC35426DvK {
    public final m LJFF;

    @Override // X.AbstractC35426DvK
    public final boolean LIZJ(SchemaBundle schemaBundle) {
        for (String key : this.LJFF.LJJIZ()) {
            j value = this.LJFF.LJJIJ(key);
            o.LJFF(value, "value");
            if (value instanceof l) {
                o.LJFF(key, "key");
                if (schemaBundle.getQueryParameter(key) != null) {
                    return false;
                }
            } else {
                o.LJFF(key, "key");
                if (!ujb.o.LJJJJIZL(schemaBundle.getQueryParameter(key), value.LJJIFFI(), true)) {
                    return false;
                }
            }
        }
        return true;
    }

    public C35425DvJ(g gVar, m mVar, int i) {
        super(gVar, mVar, i);
        this.LJFF = mVar.LJJIJIL("params");
    }
}
