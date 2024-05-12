package X;

import com.bytedance.pipo.checkout.api.network.model.response.Rules;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.a7C, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92218a7C implements InterfaceC91946a2o<String> {
    public final /* synthetic */ Rules LIZ;
    public final /* synthetic */ C92219a7D LIZIZ;

    public C92218a7C(Rules rules, C92219a7D c92219a7D) {
        this.LIZ = rules;
        this.LIZIZ = c92219a7D;
    }

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        Boolean valueOf;
        String LIZ;
        Collection<String> values;
        String value = str;
        o.LJIIIZ(value, "value");
        String value2 = this.LIZ.getValue();
        if (value2 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(new OJD(value2).matches(value));
        }
        if (o.LJ(valueOf, Boolean.TRUE)) {
            return C91945a2n.LIZIZ();
        }
        String errorKey = this.LIZ.getErrorKey();
        if (errorKey == null) {
            errorKey = "pipo_rule_common_invalid";
        }
        String errorKey2 = this.LIZ.getErrorKey();
        if (errorKey2 == null || errorKey2.length() == 0) {
            LIZ = C92054a4Y.LIZ("pipo_rule_common_invalid", new String[0]);
        } else {
            Rules rule = this.LIZ;
            String[] strArr = new String[1];
            String paramName = this.LIZIZ.LIZ.getParamName();
            String str2 = "";
            if (paramName == null) {
                paramName = "";
            }
            strArr[0] = paramName;
            o.LJIIIZ(rule, "rule");
            java.util.Map<String, String> errorKeyParams = rule.getErrorKeyParams();
            if (errorKeyParams != null && (values = errorKeyParams.values()) != null) {
                Object[] array = values.toArray(new String[0]);
                o.LJII(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                strArr = (String[]) array;
            }
            String errorKey3 = rule.getErrorKey();
            if (errorKey3 != null) {
                str2 = errorKey3;
            }
            LIZ = C92054a4Y.LIZ(str2, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return new C92223a7H(false, errorKey, LIZ);
    }
}
