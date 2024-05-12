package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PMb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64317PMb {
    public final Writer LIZ;
    public final List<EnumC64318PMc> LIZIZ = new ArrayList();

    public final String toString() {
        return "";
    }

    public final void LIZIZ() {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        EnumC64318PMc LIZLLL = LIZLLL();
        if (LIZLLL == EnumC64318PMc.EMPTY_ARRAY) {
            EnumC64318PMc enumC64318PMc = EnumC64318PMc.NONEMPTY_ARRAY;
            ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, enumC64318PMc);
        } else {
            if (LIZLLL == EnumC64318PMc.NONEMPTY_ARRAY) {
                this.LIZ.write(44);
                return;
            }
            if (LIZLLL == EnumC64318PMc.DANGLING_KEY) {
                this.LIZ.write(":");
                EnumC64318PMc enumC64318PMc2 = EnumC64318PMc.NONEMPTY_OBJECT;
                ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, enumC64318PMc2);
                return;
            }
            if (LIZLLL == EnumC64318PMc.NULL) {
            } else {
                throw new JSONException("Nesting problem");
            }
        }
    }

    public final EnumC64318PMc LIZLLL() {
        return (EnumC64318PMc) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
    }

    public C64317PMb(Writer writer) {
        this.LIZ = writer;
    }

    public final void LIZ(JSONArray jSONArray) {
        EnumC64318PMc enumC64318PMc = EnumC64318PMc.EMPTY_ARRAY;
        LIZIZ();
        ((ArrayList) this.LIZIZ).add(enumC64318PMc);
        this.LIZ.write("[");
        for (int i = 0; i < jSONArray.length(); i++) {
            LJFF(jSONArray.get(i));
        }
        LIZLLL();
        ListProtector.remove(this.LIZIZ, ((ArrayList) r1).size() - 1);
        this.LIZ.write("]");
    }

    public final void LIZJ(JSONObject jSONObject) {
        EnumC64318PMc enumC64318PMc = EnumC64318PMc.EMPTY_OBJECT;
        LIZIZ();
        ((ArrayList) this.LIZIZ).add(enumC64318PMc);
        this.LIZ.write("{");
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            EnumC64318PMc LIZLLL = LIZLLL();
            if (LIZLLL == EnumC64318PMc.NONEMPTY_OBJECT) {
                this.LIZ.write(44);
            } else if (LIZLLL != EnumC64318PMc.EMPTY_OBJECT) {
                throw new JSONException("Nesting problem");
            }
            EnumC64318PMc enumC64318PMc2 = EnumC64318PMc.DANGLING_KEY;
            ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, enumC64318PMc2);
            LJ(next);
            LJFF(obj);
        }
        LIZLLL();
        ListProtector.remove(this.LIZIZ, ((ArrayList) r1).size() - 1);
        this.LIZ.write("}");
    }

    public final void LJ(String str) {
        this.LIZ.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                this.LIZ.write("\\b");
                                break;
                            case '\t':
                                this.LIZ.write("\\t");
                                break;
                            case '\n':
                                this.LIZ.write("\\n");
                                break;
                            default:
                                if (charAt <= 31) {
                                    this.LIZ.write(C16880lQ.LLLZ("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    break;
                                } else {
                                    this.LIZ.write(charAt);
                                    break;
                                }
                        }
                    } else {
                        this.LIZ.write(92);
                        this.LIZ.write(charAt);
                    }
                } else {
                    this.LIZ.write("\\r");
                }
            } else {
                this.LIZ.write("\\f");
            }
        }
        this.LIZ.write("\"");
    }

    public final void LJFF(Object obj) {
        if (obj instanceof JSONArray) {
            LIZ((JSONArray) obj);
            return;
        }
        if (obj instanceof JSONObject) {
            LIZJ((JSONObject) obj);
            return;
        }
        LIZIZ();
        if (obj == null || obj == JSONObject.NULL) {
            this.LIZ.write("null");
            return;
        }
        if (obj instanceof Boolean) {
            this.LIZ.write(String.valueOf(obj));
        } else if (obj instanceof Number) {
            this.LIZ.write(JSONObject.numberToString((Number) obj));
        } else {
            LJ(obj.toString());
        }
    }
}
