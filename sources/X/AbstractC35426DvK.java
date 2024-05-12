package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.DvK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC35426DvK implements InterfaceC35428DvM {
    public static final /* synthetic */ int LJ = 0;
    public final C35419DvD LIZ;
    public final boolean LIZIZ;
    public final EnumC35438DvW LIZJ;
    public final AbstractC35426DvK LIZLLL;

    public abstract boolean LIZJ(SchemaBundle schemaBundle);

    @Override // X.InterfaceC35428DvM
    public final String LIZ(SchemaBundle schemaBundle) {
        SchemaBundle urlBundle;
        o.LJIIJ(schemaBundle, "schemaBundle");
        int ordinal = this.LIZJ.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                urlBundle = schemaBundle;
            } else {
                throw new C162476Zf();
            }
        } else {
            urlBundle = schemaBundle.getUrlBundle();
        }
        String str = null;
        if (urlBundle == null) {
            C37682Eqc.LIZIZ(schemaBundle.getSparkContext(), "SparkSchemaRuleManager", "cannot find corresponding target");
            AbstractC35426DvK LIZIZ = LIZIZ(false);
            if (LIZIZ == null) {
                return null;
            }
            return LIZIZ.LIZ(schemaBundle);
        }
        if (!LIZJ(urlBundle)) {
            C37682Eqc.LIZIZ(schemaBundle.getSparkContext(), "SparkSchemaRuleManager", "schema not matches");
            AbstractC35426DvK LIZIZ2 = LIZIZ(false);
            if (LIZIZ2 == null) {
                return null;
            }
            return LIZIZ2.LIZ(schemaBundle);
        }
        C35419DvD c35419DvD = this.LIZ;
        if (c35419DvD != null) {
            C37682Eqc.LIZIZ(schemaBundle.getSparkContext(), "SparkSchemaRuleManager", "start to handle schema");
            StringBuilder sb = new StringBuilder();
            while (true) {
                String str2 = "";
                if (c35419DvD != null) {
                    if (c35419DvD.LIZ(urlBundle)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("rule ");
                        C37682Eqc.LIZIZ(schemaBundle.getSparkContext(), "SparkSchemaRuleManager", JBR.LJFF(LIZ, c35419DvD.LIZ, " matches", LIZ));
                        sb.append(c35419DvD.LIZ);
                        sb.append(",");
                        AbstractC35420DvE abstractC35420DvE = c35419DvD.LIZLLL;
                        if (abstractC35420DvE != null) {
                            while (abstractC35420DvE != null) {
                                abstractC35420DvE.LIZ(urlBundle);
                                urlBundle.commit();
                                abstractC35420DvE = abstractC35420DvE.LIZ;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(sb.toString());
                            AbstractC35426DvK LIZIZ3 = LIZIZ(true);
                            if (LIZIZ3 != null) {
                                str = LIZIZ3.LIZ(urlBundle);
                            }
                            if (str != null) {
                                str2 = str;
                            }
                            sb2.append(str2);
                            return sb2.toString();
                        }
                    }
                    c35419DvD = c35419DvD.LIZJ;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb.toString());
                    AbstractC35426DvK LIZIZ4 = LIZIZ(true);
                    if (LIZIZ4 != null) {
                        str = LIZIZ4.LIZ(schemaBundle);
                    }
                    if (str != null) {
                        str2 = str;
                    }
                    sb3.append(str2);
                    return sb3.toString();
                }
            }
        } else {
            AbstractC35426DvK LIZIZ5 = LIZIZ(true);
            if (LIZIZ5 == null) {
                return null;
            }
            return LIZIZ5.LIZ(schemaBundle);
        }
    }

    public final AbstractC35426DvK LIZIZ(boolean z) {
        if (z && this.LIZIZ) {
            return null;
        }
        return this.LIZLLL;
    }

    public AbstractC35426DvK(g gVar, m mVar, int i) {
        Object LIZ;
        Object LIZ2;
        boolean z;
        Object LIZ3;
        String str;
        EnumC35438DvW enumC35438DvW;
        Object LIZ4;
        try {
            g LJJIJIIJI = mVar.LJJIJIIJI("rules");
            o.LJFF(LJJIJIIJI, "config.getAsJsonArray(RULES)");
            LIZ = new C35419DvD(LJJIJIIJI, 0);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        AbstractC35426DvK abstractC35426DvK = null;
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("cannot parse rule in ");
            LIZ5.append(getClass().getName());
            C37682Eqc.LIZ(null, "SparkSchemaRuleManager", X1D.LIZIZ(LIZ5));
        }
        this.LIZ = (C35419DvD) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        try {
            j LJJIJ = mVar.LJJIJ("isBreak");
            o.LJFF(LJJIJ, "config.get(IS_BREAK)");
            LIZ2 = Boolean.valueOf(LJJIJ.LJFF());
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        Boolean bool = (Boolean) (C3C5.m12isFailureimpl(LIZ2) ? null : LIZ2);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.LIZIZ = z;
        try {
            j LJJIJ2 = mVar.LJJIJ("modifyTarget");
            o.LJFF(LJJIJ2, "config.get(MODIFY_TARGET)");
            LIZ3 = LJJIJ2.LJJIFFI();
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        String str2 = (String) (C3C5.m12isFailureimpl(LIZ3) ? null : LIZ3);
        if (str2 != null) {
            Locale locale = Locale.ROOT;
            o.LJFF(locale, "Locale.ROOT");
            str = str2.toLowerCase(locale);
            o.LJFF(str, "(this as java.lang.String).toLowerCase(locale)");
        } else {
            str = "url";
        }
        if (str.hashCode() != -907987551 || !str.equals("schema")) {
            enumC35438DvW = EnumC35438DvW.URL;
        } else {
            enumC35438DvW = EnumC35438DvW.SCHEMA;
        }
        this.LIZJ = enumC35438DvW;
        if (i < gVar.size() - 1) {
            int i2 = i + 1;
            try {
                j LJJIIZ = gVar.LJJIIZ(i2);
                o.LJFF(LJJIIZ, "jsonArray.get(index + 1)");
                LIZ4 = LJJIIZ.LJIIZILJ();
                C3C5.m7constructorimpl(LIZ4);
            } catch (Throwable th4) {
                LIZ4 = C141335gf.LIZ(th4);
                C3C5.m7constructorimpl(LIZ4);
            }
            m mVar2 = (m) (C3C5.m12isFailureimpl(LIZ4) ? null : LIZ4);
            if (mVar2 != null) {
                if (this instanceof C35430DvO) {
                    abstractC35426DvK = new C35430DvO(gVar, mVar2, i2);
                } else if (this instanceof C35425DvJ) {
                    abstractC35426DvK = new C35425DvJ(gVar, mVar2, i2);
                } else if (this instanceof C34899Dmp) {
                    abstractC35426DvK = new C34899Dmp(gVar, mVar2, i2);
                } else {
                    throw new IllegalArgumentException("rule is illegal");
                }
            }
        }
        this.LIZLLL = abstractC35426DvK;
    }
}
