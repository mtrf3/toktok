package X;

import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.helios.network.pipeline.OperationConfig;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Plz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65423Plz {
    public static OperationConfig LIZ(j jVar) {
        java.util.Set<Map.Entry<String, j>> entrySet;
        C66226Pyw commonProxy;
        InterfaceC65784Pro<String> interfaceC65784Pro;
        String invoke;
        C66226Pyw commonProxy2;
        InterfaceC65784Pro<String> interfaceC65784Pro2;
        String invoke2;
        java.util.Set<Map.Entry<String, j>> entrySet2;
        if (jVar == null) {
            return null;
        }
        OperationConfig operationConfig = new OperationConfig(null, null, null, 7, null);
        m LJIIZILJ = jVar.LJIIZILJ();
        j LJJIJ = LJIIZILJ.LJJIJ("add");
        if (LJJIJ != null && (entrySet2 = LJJIJ.LJIIZILJ().entrySet()) != null) {
            for (Map.Entry<String, j> entry : entrySet2) {
                j value = entry.getValue();
                o.LJIIIIZZ(value, "it.value");
                if (value instanceof p) {
                    j value2 = entry.getValue();
                    if (value2 != null) {
                        if (((p) value2).LJLIL instanceof String) {
                            j value3 = entry.getValue();
                            o.LJIIIIZZ(value3, "it.value");
                            String value4 = value3.LJJIFFI();
                            java.util.Map<String, String> map = operationConfig.add;
                            String key = entry.getKey();
                            o.LJIIIIZZ(key, "it.key");
                            o.LJIIIIZZ(value4, "value");
                            map.put(key, value4);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonPrimitive");
                    }
                }
            }
        }
        j LJJIJ2 = LJIIZILJ.LJJIJ("replace");
        if (LJJIJ2 != null && (entrySet = LJJIJ2.LJIIZILJ().entrySet()) != null) {
            for (Map.Entry<String, j> entry2 : entrySet) {
                j value5 = entry2.getValue();
                o.LJIIIIZZ(value5, "entry.value");
                m LJIIZILJ2 = value5.LJIIZILJ();
                j LJJIJ3 = LJIIZILJ2.LJJIJ("value");
                o.LJIIIIZZ(LJJIJ3, "replaceConfigJsonObject.get(\"value\")");
                String LJJIFFI = LJJIJ3.LJJIFFI();
                o.LJIIIIZZ(LJJIFFI, "replaceConfigJsonObject.get(\"value\").asString");
                j LJJIJ4 = LJIIZILJ2.LJJIJ("target");
                o.LJIIIIZZ(LJJIJ4, "replaceConfigJsonObject.get(\"target\")");
                String LJJIFFI2 = LJJIJ4.LJJIFFI();
                o.LJIIIIZZ(LJJIFFI2, "replaceConfigJsonObject.get(\"target\").asString");
                ReplaceConfig replaceConfig = new ReplaceConfig(LJJIFFI, LJJIFFI2);
                if (ujb.o.LJJJLIIL(replaceConfig.getValue(), "$", false)) {
                    String value6 = replaceConfig.getValue();
                    int length = replaceConfig.getValue().length();
                    if (value6 != null) {
                        String substring = value6.substring(1, length);
                        o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        int hashCode = substring.hashCode();
                        if (hashCode != 25209764) {
                            if (hashCode == 900440639 && substring.equals("install_id") && (commonProxy2 = NetworkComponent.INSTANCE.getCommonProxy()) != null && (interfaceC65784Pro2 = commonProxy2.LJLJLLL) != null && (invoke2 = interfaceC65784Pro2.invoke()) != null && !ujb.o.LJJJJJL(invoke2)) {
                                replaceConfig.setValue(invoke2);
                            }
                        } else if (substring.equals("device_id") && (commonProxy = NetworkComponent.INSTANCE.getCommonProxy()) != null && (interfaceC65784Pro = commonProxy.LJLIL) != null && (invoke = interfaceC65784Pro.invoke()) != null && !ujb.o.LJJJJJL(invoke)) {
                            replaceConfig.setValue(invoke);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                java.util.Map<String, ReplaceConfig> map2 = operationConfig.replace;
                String key2 = entry2.getKey();
                o.LJIIIIZZ(key2, "entry.key");
                map2.put(key2, replaceConfig);
            }
        }
        j LJJIJ5 = LJIIZILJ.LJJIJ("remove");
        if (LJJIJ5 != null) {
            Iterator<j> it = LJJIJ5.LJIILLIIL().iterator();
            while (it.hasNext()) {
                j it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                if (it2 instanceof p) {
                    p pVar = (p) it2;
                    if (pVar.LJLIL instanceof String) {
                        String value7 = pVar.LJJIFFI();
                        List<String> list = operationConfig.remove;
                        o.LJIIIIZZ(value7, "value");
                        list.add(value7);
                    }
                }
            }
        }
        return operationConfig;
    }
}
