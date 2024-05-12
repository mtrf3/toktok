package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.DvH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35423DvH extends AbstractC35420DvE {
    public final String LIZJ;
    public final C62822Ol8 LIZLLL;
    public final String LJ;

    @Override // X.AbstractC35420DvE
    public final void LIZ(SchemaBundle schemaBundle) {
        String url = ((Pattern) this.LIZLLL.getValue()).matcher(schemaBundle.getUrl()).replaceAll(this.LJ);
        o.LJFF(url, "url");
        schemaBundle.setUrl(url);
    }

    public C35423DvH(g gVar, m mVar, int i) {
        super(gVar, i);
        j LJJIJ = mVar.LJJIJ("pattern");
        o.LJFF(LJJIJ, "jsonObject.get(\"pattern\")");
        this.LIZJ = LJJIJ.LJJIFFI();
        this.LIZLLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 2));
        j LJJIJ2 = mVar.LJJIJ("template");
        o.LJFF(LJJIJ2, "jsonObject.get(\"template\")");
        this.LJ = LJJIJ2.LJJIFFI();
    }
}
