package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0NI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NI {
    public static C0NJ LIZ(final String str, JSONObject jSONObject) {
        final int optInt = jSONObject.optInt("t");
        final int optInt2 = jSONObject.optInt("i");
        final boolean optBoolean = jSONObject.optBoolean("r");
        if (optInt != 20) {
            if (optInt != 21) {
                return new C0NJ(str, optInt2, optInt, optBoolean) { // from class: X.1Hp
                    @Override // X.C0NJ
                    public final Object LIZIZ() {
                        switch (this.LIZJ) {
                            case 0:
                                return Boolean.FALSE;
                            case 1:
                            case 6:
                                return "";
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                            case 8:
                                return 0;
                            default:
                                return -1;
                        }
                    }

                    @Override // X.C0NJ
                    public final Object LIZ(Q9H q9h, java.util.Map definitionMap) {
                        Object valueOf;
                        o.LJIIIZ(definitionMap, "definitionMap");
                        switch (this.LIZJ) {
                            case 0:
                                valueOf = Boolean.valueOf(Q9J.LIZ(q9h));
                                break;
                            case 1:
                                valueOf = q9h.LJII();
                                break;
                            case 2:
                                valueOf = Double.valueOf(Double.longBitsToDouble(q9h.LJIIIZ()));
                                break;
                            case 3:
                                valueOf = Float.valueOf(Float.intBitsToFloat(q9h.LJIIIIZZ()));
                                break;
                            case 4:
                            case 7:
                                valueOf = Integer.valueOf(q9h.LJIIJ());
                                break;
                            case 5:
                            case 8:
                                valueOf = Long.valueOf(q9h.LJIIJJI());
                                break;
                            case 6:
                                valueOf = Q9J.LIZIZ(q9h);
                                break;
                            default:
                                "".toString();
                                throw new IllegalStateException("");
                        }
                        o.LJIIIIZZ(valueOf, "when (type) {\n          …> error(\"\")\n            }");
                        return valueOf;
                    }
                };
            }
            JSONObject keyJson = jSONObject.optJSONObject("k");
            JSONObject valueJson = jSONObject.optJSONObject("v");
            o.LJIIIIZZ(keyJson, "keyJson");
            C0NJ LIZ = LIZ("", keyJson);
            o.LJIIIIZZ(valueJson, "valueJson");
            return new C30471Hn(str, optInt2, optBoolean, LIZ, LIZ("", valueJson));
        }
        final String fqName = jSONObject.optString("fq");
        o.LJIIIIZZ(fqName, "fqName");
        return new C0NJ(optInt2, str, fqName, optBoolean) { // from class: X.1Ho
            public final String LJFF;

            @Override // X.C0NJ
            public final Object LIZIZ() {
                return -1;
            }

            @Override // X.C0NJ
            public final Object LIZ(Q9H q9h, java.util.Map definitionMap) {
                o.LJIIIZ(definitionMap, "definitionMap");
                C0NL c0nl = (C0NL) ((HashMap) definitionMap).get(this.LJFF);
                if (c0nl != null) {
                    return c0nl.LIZ(q9h, definitionMap);
                }
                "".toString();
                throw new IllegalStateException("");
            }

            {
                this.LJFF = fqName;
            }
        };
    }
}
