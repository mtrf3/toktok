package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.Collection;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.DvO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35430DvO extends AbstractC35426DvK {
    public final Object LJFF;

    @Override // X.AbstractC35426DvK
    public final boolean LIZJ(SchemaBundle schemaBundle) {
        Object obj = this.LJFF;
        if (obj instanceof String) {
            String path = schemaBundle.getPath();
            if (path != null && s.LJJJLZIJ(path, (CharSequence) this.LJFF, false)) {
                return true;
            }
        } else if (obj instanceof g) {
            Iterable<j> iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (j it : iterable) {
                    String path2 = schemaBundle.getPath();
                    if (path2 != null) {
                        o.LJFF(it, "it");
                        String LJJIFFI = it.LJJIFFI();
                        o.LJFF(LJJIFFI, "it.asString");
                        if (s.LJJJLZIJ(path2, LJJIFFI, false)) {
                            return true;
                        }
                    }
                }
            }
        } else {
            throw new C35431DvP("unexpected path param");
        }
        return false;
    }

    public C35430DvO(g gVar, m mVar, int i) {
        super(gVar, mVar, i);
        Object LIZ;
        j it = mVar.LJJIJ("path");
        try {
            o.LJFF(it, "it");
            LIZ = it.LJIILLIIL();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ) || LIZ == null) {
            o.LJFF(it, "it");
            LIZ = it.LJJIFFI();
        }
        this.LJFF = LIZ;
    }
}
