package X;

import com.lynx.react.bridge.JavaOnlyArray;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Euh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37935Euh extends AbstractC37899Eu7 {
    public final C37904EuC LIZIZ;

    @Override // X.AbstractC37899Eu7
    public final void LJIIIIZZ() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37935Euh(C37904EuC context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LIZIZ = context;
    }

    @Override // X.AbstractC37899Eu7
    public final void LJIIIZ(Object obj, String name) {
        o.LJIIJ(name, "name");
        if (obj instanceof JavaOnlyArray) {
            this.LIZIZ.LIZJ.LJI(obj, name);
            JavaOnlyArray javaOnlyArray = (JavaOnlyArray) obj;
            VNS vns = this.LIZIZ.LJ;
            if (vns != null) {
                vns.sendGlobalEvent(name, javaOnlyArray);
            }
            this.LIZIZ.LIZJ.LJFF(obj, name);
            return;
        }
        if (obj != null && !(obj instanceof JSONObject)) {
            return;
        }
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        C38010Evu c38010Evu = C38010Evu.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", obj);
        jSONObject.put("containerID", this.LIZIZ.LJI);
        jSONObject.put("protocolVersion", "1.0");
        jSONObject.put("code", 1);
        c38010Evu.getClass();
        javaOnlyArray2.pushMap(C38010Evu.LIZIZ(jSONObject));
        this.LIZIZ.LIZJ.LJI(javaOnlyArray2, name);
        VNS vns2 = this.LIZIZ.LJ;
        if (vns2 != null) {
            vns2.sendGlobalEvent(name, javaOnlyArray2);
        }
        this.LIZIZ.LIZJ.LJFF(javaOnlyArray2, name);
    }
}
