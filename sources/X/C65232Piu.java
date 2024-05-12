package X;

import com.bytedance.retrofit2.mime.TypedInput;
import org.json.JSONObject;

/* renamed from: X.Piu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C65232Piu implements InterfaceC65016PfQ {
    public static float LIZIZ(float f, float f2, float f3, float f4) {
        return f4 - ((f * f2) / f3);
    }

    @Override // X.InterfaceC65016PfQ
    public Object LIZ(Object obj) {
        return new Q9L(((TypedInput) obj).in());
    }

    public static JSONObject LIZJ(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        return jSONObject;
    }

    public static void LIZLLL(StringBuilder sb, long j, String str, String str2) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }
}
