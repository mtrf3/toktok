package X;

import defpackage.i0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Exm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38126Exm {
    public final InterfaceC38133Ext LIZ;
    public boolean LIZIZ;

    public C38126Exm(InterfaceC38133Ext interfaceC38133Ext) {
        this.LIZ = interfaceC38133Ext;
    }

    public static void LIZ(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i0.LJFF("Param is not allowed to be List or JSONArray, rawString:\n ", str));
            if (!C1A7.LJLIL) {
            } else {
                throw illegalArgumentException;
            }
        }
    }

    public final <T> String LIZIZ(T t) {
        String obj;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            obj = t.toString();
        } else {
            obj = this.LIZ.LIZJ(t);
        }
        LIZ(obj);
        return obj;
    }
}
