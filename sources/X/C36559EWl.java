package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EWl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36559EWl implements InvocationHandler {
    public final /* synthetic */ JSONObject LIZ;
    public final /* synthetic */ C36550EWc LIZIZ;
    public final /* synthetic */ Class LIZJ;
    public final /* synthetic */ EWZ LIZLLL;

    public C36559EWl(JSONObject jSONObject, C36550EWc c36550EWc, Class cls, EWZ ewz) {
        this.LIZ = jSONObject;
        this.LIZIZ = c36550EWc;
        this.LIZJ = cls;
        this.LIZLLL = ewz;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        o.LJFF(method, "method");
        if (o.LJ(method.getName(), "toJSON")) {
            return C36556EWi.LIZIZ(this.LIZ, this.LIZIZ.LJLJJL.get(this.LIZJ), this.LIZIZ);
        }
        C36548EWa c36548EWa = this.LIZLLL.LJLIL.get(method);
        JSONObject jSONObject = this.LIZ;
        if (c36548EWa != null) {
            str = c36548EWa.LJLILLLLZI;
        } else {
            str = null;
        }
        return C36556EWi.LIZ(jSONObject.opt(str), c36548EWa, this.LIZIZ);
    }
}
