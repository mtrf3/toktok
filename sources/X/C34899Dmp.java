package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Dmp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34899Dmp extends AbstractC35426DvK {
    public final String LJFF;
    public final C62822Ol8 LJI;

    @Override // X.AbstractC35426DvK
    public final boolean LIZJ(SchemaBundle schemaBundle) {
        Matcher matcher;
        String url = schemaBundle.getUrl();
        Pattern pattern = (Pattern) this.LJI.getValue();
        if (pattern != null && (matcher = pattern.matcher(url)) != null) {
            return matcher.find();
        }
        return false;
    }

    public C34899Dmp(g gVar, m mVar, int i) {
        super(gVar, mVar, i);
        j LJJIJ = mVar.LJJIJ("regex");
        o.LJFF(LJJIJ, "jsonObject.get(\"regex\")");
        this.LJFF = LJJIJ.LJJIFFI();
        this.LJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 4));
    }
}
