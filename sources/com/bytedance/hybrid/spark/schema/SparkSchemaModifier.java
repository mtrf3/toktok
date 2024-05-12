package com.bytedance.hybrid.spark.schema;

import X.C0MT;
import X.C141335gf;
import X.C25620zW;
import X.C37682Eqc;
import X.C3C5;
import X.C61328O5c;
import X.E7K;
import X.InterfaceC35428DvM;
import X.X1D;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class SparkSchemaModifier {
    public static SparkSchemaModifier globalPostModifier;
    public static SparkSchemaModifier globalPreModifier;
    public final String identifier;
    public InterfaceC35428DvM paramRules;
    public InterfaceC35428DvM pathRules;
    public InterfaceC35428DvM regexRules;
    public boolean replaceByParamEnabled;
    public boolean replaceByPathEnabled;
    public boolean replaceByRegexEnabled;
    public final int version;
    public static final E7K Companion = new E7K();
    public static final CopyOnWriteArrayList<SparkSchemaModifier> normalModifiers = new CopyOnWriteArrayList<>();

    private final String handleSchema(String str, SparkContext sparkContext) {
        SchemaBundle schemaBundle = new SchemaBundle(str, sparkContext);
        handleSchemaBundle(schemaBundle, sparkContext);
        return schemaBundle.getUrl();
    }

    public final void handleSchemaBundle(SchemaBundle schemaBundle, SparkContext sparkContext) {
        Object LIZ;
        String LIZ2;
        String LIZ3;
        String LIZ4;
        StringBuilder sb = new StringBuilder();
        String url = schemaBundle.getUrl();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(this.identifier);
            LIZ5.append(" path rules start executing");
            C37682Eqc.LIZIZ(sparkContext, "SparkSchemaModifier", X1D.LIZIZ(LIZ5));
            InterfaceC35428DvM interfaceC35428DvM = this.pathRules;
            if (interfaceC35428DvM != null && (LIZ4 = interfaceC35428DvM.LIZ(schemaBundle)) != null) {
                sb.append(LIZ4);
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(this.identifier);
            LIZ6.append(" param rules start executing");
            C37682Eqc.LIZIZ(sparkContext, "SparkSchemaModifier", X1D.LIZIZ(LIZ6));
            InterfaceC35428DvM interfaceC35428DvM2 = this.paramRules;
            if (interfaceC35428DvM2 != null && (LIZ3 = interfaceC35428DvM2.LIZ(schemaBundle)) != null) {
                sb.append(LIZ3);
            }
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(this.identifier);
            LIZ7.append(" regex rules start executing");
            C37682Eqc.LIZIZ(sparkContext, "SparkSchemaModifier", X1D.LIZIZ(LIZ7));
            InterfaceC35428DvM interfaceC35428DvM3 = this.regexRules;
            if (interfaceC35428DvM3 != null && (LIZ2 = interfaceC35428DvM3.LIZ(schemaBundle)) != null) {
                sb.append(LIZ2);
                LIZ = sb;
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append(",failed because of ");
            LIZ8.append(m10exceptionOrNullimpl.getMessage());
            sb.append(X1D.LIZIZ(LIZ8));
            StringBuilder LIZ9 = X1D.LIZ();
            C37682Eqc.LIZ(sparkContext, "SparkSchemaModifier", C61328O5c.LIZLLL(LIZ9, this.identifier, " execution fails, ", m10exceptionOrNullimpl, LIZ9));
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String charSequence = s.LJJZZI(sb, ",").toString();
        if (!o.LJJJJJL(charSequence)) {
            E7K e7k = Companion;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", this.identifier);
            jSONObject.put("version", this.version);
            jSONObject.put("time_cost", currentTimeMillis2);
            jSONObject.put("origin_schema", url);
            jSONObject.put("schema", schemaBundle.getUrl());
            jSONObject.put("pipeline", charSequence);
            e7k.getClass();
            E7K.LJ("SparkSchemaModifierPipeline", jSONObject, sparkContext);
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("origin schema ", url, " hits ");
        LIZIZ.append(this.identifier);
        LIZIZ.append(" version ");
        LIZIZ.append(this.version);
        LIZIZ.append(", ");
        LIZIZ.append("pipeline: ");
        LIZIZ.append(charSequence);
        C0MT.LIZLLL(LIZIZ, ", finished in ", currentTimeMillis2, ", new schema: ");
        LIZIZ.append(schemaBundle.getUrl());
        C37682Eqc.LIZIZ(sparkContext, "SparkSchemaModifier", X1D.LIZIZ(LIZIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SparkSchemaModifier(com.google.gson.m r7, java.lang.String r8, int r9) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.schema.SparkSchemaModifier.<init>(com.google.gson.m, java.lang.String, int):void");
    }
}
