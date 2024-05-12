package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.DvD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35419DvD {
    public final String LIZ;
    public final String LIZIZ;
    public final C35419DvD LIZJ;
    public final AbstractC35420DvE LIZLLL;
    public final C62822Ol8 LJ;

    public final boolean LIZ(SchemaBundle schemaBundle) {
        Matcher matcher;
        Pattern pattern = (Pattern) this.LJ.getValue();
        if (pattern != null && (matcher = pattern.matcher(schemaBundle.getUrl())) != null) {
            return matcher.find();
        }
        return false;
    }

    public C35419DvD(g gVar, int i) {
        j LJJIIZ = gVar.LJJIIZ(i);
        o.LJFF(LJJIIZ, "jsonArray.get(index)");
        m LJIIZILJ = LJJIIZ.LJIIZILJ();
        j LJJIJ = LJIIZILJ.LJJIJ("name");
        o.LJFF(LJJIJ, "rule.get(\"name\")");
        String LJJIFFI = LJJIJ.LJJIFFI();
        o.LJFF(LJJIFFI, "rule.get(\"name\").asString");
        this.LIZ = LJJIFFI;
        j LJJIJ2 = LJIIZILJ.LJJIJ("match");
        o.LJFF(LJJIJ2, "rule.get(\"match\")");
        String LJJIFFI2 = LJJIJ2.LJJIFFI();
        o.LJFF(LJJIFFI2, "rule.get(\"match\").asString");
        this.LIZIZ = LJJIFFI2;
        C35422DvG c35422DvG = AbstractC35420DvE.LIZIZ;
        g LJJIJIIJI = LJIIZILJ.LJJIJIIJI("actions");
        o.LJFF(LJJIJIIJI, "rule.getAsJsonArray(\"actions\")");
        c35422DvG.getClass();
        this.LIZLLL = C35422DvG.LIZ(LJJIJIIJI, 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("rule ");
        LIZ.append(LJJIFFI);
        LIZ.append(" parsed successfully");
        C37682Eqc.LIZIZ(null, "SparkSchemaModifierRule", X1D.LIZIZ(LIZ));
        this.LIZJ = i < gVar.size() + (-1) ? new C35419DvD(gVar, i + 1) : null;
        this.LJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 3));
    }
}
