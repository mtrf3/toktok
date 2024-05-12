package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class M2D {
    public TemplateData LIZ;
    public java.util.Map<Object, Object> LIZIZ;
    public InterfaceC88472Yns<? super String, C76800UCe> LJFF;
    public InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super Boolean, C76800UCe> LJI;
    public InterfaceC88472Yns<? super String, C76800UCe> LJII;
    public InterfaceC88471Ynr<? super LynxError, ? super String, C76800UCe> LJIIIIZZ;
    public InterfaceC88472Yns<? super String, C76800UCe> LJIIIZ;
    public InterfaceC88472Yns<? super java.util.Map<String, Object>, C76800UCe> LJIIJ;
    public InterfaceC88473Ynt<? super java.util.Map<String, Object>, ? super java.util.Map<String, Long>, ? super String, C76800UCe> LJIIJJI;
    public InterfaceC60814Ntq LJIIL;
    public AbstractC60811Ntn LJIILIIL;
    public final java.util.Map<String, Object> LIZJ = new LinkedHashMap();
    public final java.util.Map<String, Object> LIZLLL = new LinkedHashMap();
    public String LJ = "";
    public java.util.Map<String, C39947Fm3> LJIILJJIL = new LinkedHashMap();
    public final ConcurrentHashMap<Class<?>, M2E<?>> LJIILL = new ConcurrentHashMap<>();
    public String LJIILLIIL = "";

    public final SparkContext LIZ(java.util.Map extraQueryParams, boolean z) {
        o.LJIIIZ(extraQueryParams, "extraQueryParams");
        String str = this.LJ;
        TemplateData templateData = this.LIZ;
        java.util.Map<Object, Object> map = this.LIZIZ;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = this.LJFF;
        InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super Boolean, C76800UCe> interfaceC88473Ynt = this.LJI;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2 = this.LJII;
        InterfaceC88471Ynr<? super LynxError, ? super String, C76800UCe> interfaceC88471Ynr = this.LJIIIIZZ;
        C61002Nws LIZ = O9D.LIZ(templateData, str, map, this.LJIILJJIL, interfaceC88472Yns, interfaceC88472Yns2, this.LJIIIZ, this.LJIIJ, interfaceC88471Ynr, interfaceC88473Ynt, this.LJIIJJI);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(this.LJIILLIIL);
        sparkContext.LJJIJ(this.LIZJ);
        sparkContext.usePreload = z;
        sparkContext.LJJ(LIZ);
        InterfaceC60814Ntq interfaceC60814Ntq = this.LJIIL;
        if (interfaceC60814Ntq != null) {
            sparkContext.LJJIJIL(interfaceC60814Ntq);
        }
        AbstractC60811Ntn abstractC60811Ntn = this.LJIILIIL;
        if (abstractC60811Ntn != null) {
            sparkContext.LJJI(abstractC60811Ntn);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String str2 = (String) entry.getKey();
                Object value2 = entry.getValue();
                o.LJII(value2, "null cannot be cast to non-null type kotlin.String");
                sparkContext.LJJIIJ(str2, (String) value2);
            } else if (value instanceof Integer) {
                String str3 = (String) entry.getKey();
                Object value3 = entry.getValue();
                o.LJII(value3, "null cannot be cast to non-null type kotlin.Int");
                sparkContext.LJJIFFI(((Integer) value3).intValue(), str3);
            } else if (value instanceof Double) {
                String str4 = (String) entry.getKey();
                Object value4 = entry.getValue();
                o.LJII(value4, "null cannot be cast to non-null type kotlin.Double");
                sparkContext.LJJII(str4, ((Double) value4).doubleValue());
            } else if (value instanceof Boolean) {
                String str5 = (String) entry.getKey();
                Object value5 = entry.getValue();
                o.LJII(value5, "null cannot be cast to non-null type kotlin.Boolean");
                sparkContext.LJJIIJZLJL(str5, ((Boolean) value5).booleanValue());
            }
        }
        for (Map.Entry entry2 : extraQueryParams.entrySet()) {
            sparkContext.LJJIIJ((String) entry2.getKey(), (String) entry2.getValue());
        }
        for (Map.Entry<Class<?>, M2E<?>> entry3 : this.LJIILL.entrySet()) {
            Class<?> key = entry3.getKey();
            o.LJII(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            sparkContext.LJII(key, entry3.getValue().LIZIZ());
        }
        return sparkContext;
    }

    public final void LIZIZ(Object value, String str) {
        o.LJIIIZ(value, "value");
        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Double) || (value instanceof Boolean)) {
            this.LIZLLL.put(str, value);
        }
    }
}
