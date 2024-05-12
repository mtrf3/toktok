package X;

import defpackage.i0;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ClB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32249ClB implements InterfaceC32251ClD {
    public final InterfaceC32251ClD LIZ;

    @Override // X.InterfaceC32251ClD
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC32251ClD
    public final void ensureNotReachHere(Throwable th, String str) {
        this.LIZ.ensureNotReachHere(th, str);
    }

    public C32249ClB(InterfaceC32251ClD base) {
        o.LJIIIZ(base, "base");
        this.LIZ = base;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject LIZJ(JSONObject jSONObject) {
        C3C4 c3c4;
        String str;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tag", "ttlive_sdk");
            InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
            String str2 = null;
            if (interfaceC32258ClK != null) {
                str = interfaceC32258ClK.LIZ();
            } else {
                str = null;
            }
            jSONObject2.put("ttlive_sdk_version", str);
            InterfaceC32258ClK interfaceC32258ClK2 = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
            if (interfaceC32258ClK2 != null) {
                str2 = interfaceC32258ClK2.LIZ();
            }
            jSONObject2.put("ttlive_gift_render_sdk_version", str2);
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
            C3C5.m7constructorimpl(jSONObject2);
            c3c4 = jSONObject2;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            c3c4 = LIZ;
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(c3c4);
        if (m10exceptionOrNullimpl != null) {
            C32444CoK.LIZJ(m10exceptionOrNullimpl);
        }
        JSONObject jSONObject3 = new JSONObject();
        boolean m12isFailureimpl = C3C5.m12isFailureimpl(c3c4);
        Object obj = c3c4;
        if (m12isFailureimpl) {
            obj = jSONObject3;
        }
        return (JSONObject) obj;
    }

    public static String LIZLLL(String str) {
        if (str != null && !ujb.o.LJJJLIIL(str, "ttlive_", false)) {
            return i0.LJFF("ttlive_", str);
        }
        return str;
    }

    @Override // X.InterfaceC32251ClD
    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LIZ.LIZ(LIZLLL(str), jSONObject, LIZJ(jSONObject2));
    }

    @Override // X.InterfaceC32251ClD
    public final void monitorStatus(String str, int i, JSONObject jSONObject) {
        this.LIZ.monitorStatus(LIZLLL(str), i, LIZJ(jSONObject));
    }

    @Override // X.InterfaceC32251ClD
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZ.monitorEvent(LIZLLL(str), jSONObject, jSONObject2, LIZJ(jSONObject3));
    }
}
