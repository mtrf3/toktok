package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.DvF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35421DvF extends AbstractC35420DvE {
    public final String LIZJ;

    @Override // X.AbstractC35420DvE
    public final void LIZ(SchemaBundle schemaBundle) {
        String path = this.LIZJ;
        o.LJFF(path, "path");
        schemaBundle.setPath(path);
    }

    public C35421DvF(g gVar, m mVar, int i) {
        super(gVar, i);
        j LJJIJ = mVar.LJJIJ("path");
        o.LJFF(LJJIJ, "jsonObject.get(\"path\")");
        this.LIZJ = LJJIJ.LJJIFFI();
    }
}
