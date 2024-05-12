package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Hl7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44985Hl7 {
    public static final boolean[] LIZ;
    public static final boolean[] LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    static {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44985Hl7.<clinit>():void");
    }

    public static OSZ LIZ(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new OSZ(Boolean.valueOf(jSONObject.optBoolean("is_fast_import", false)), Boolean.valueOf(jSONObject.optBoolean("depend_hwdecode", false)));
            } catch (JSONException unused) {
                H78.LIZLLL("expand_hw_decoder_list_by_bytebench", new Throwable("json parse fail"));
                Boolean bool = Boolean.FALSE;
                return new OSZ(bool, bool);
            }
        }
        Boolean bool2 = Boolean.FALSE;
        return new OSZ(bool2, bool2);
    }
}
