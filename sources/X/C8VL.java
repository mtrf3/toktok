package X;

import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.dynamic.DynamicAssemConfigTypeAdapter;
import com.google.gson.e;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8VL, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8VL extends C8V2<DynamicAssem> {
    public java.util.Map<String, C8VL> LJIIIZ = new LinkedHashMap();

    static {
        e eVar = new e();
        eVar.LIZIZ(new DynamicAssemConfigTypeAdapter(), InterfaceC65350Pko.class);
        eVar.LIZ();
    }

    public final void LJI(String str, InterfaceC88472Yns<? super C8VL, C76800UCe> f) {
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(f, "f");
        java.util.Map<String, C8VL> map = this.LJIIIZ;
        C8VL c8vl = new C8VL();
        f.invoke(c8vl);
        map.put(str, c8vl);
    }
}
