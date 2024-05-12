package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.hybridkit.experiment.EnableGlobalpropsDesensitizationSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FpA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40140FpA extends C40145FpF {
    public final C40141FpB LIZLLL = new C40141FpB(this);

    @Override // X.C40145FpF, X.InterfaceC40155FpP
    public final InterfaceC40148FpI LJ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Map LJFF(InterfaceC60761Nsz interfaceC60761Nsz, java.util.Map map) {
        java.util.Map map2;
        Object obj;
        C40156FpQ c40156FpQ;
        java.util.Map<String, Object> map3;
        String str;
        if ((interfaceC60761Nsz instanceof WebKitView) && (interfaceC60761Nsz.getHybridContext() instanceof SparkContext)) {
            C60737Nsb hybridContext = interfaceC60761Nsz.getHybridContext();
            o.LJII(hybridContext, "null cannot be cast to non-null type com.bytedance.hybrid.spark.SparkContext");
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(hybridContext.url), "url");
            C40156FpQ c40156FpQ2 = (C40156FpQ) interfaceC60761Nsz.getHybridContext().LIZIZ(C40156FpQ.class);
            if (c40156FpQ2 != null && (str = c40156FpQ2.LIZIZ) != null) {
                queryParameter = str;
            }
            List<String> LIZ = EnableGlobalpropsDesensitizationSettings.LIZ(queryParameter);
            java.util.Map map4 = null;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!((ArrayList) LIZ).contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                map2 = C113554cx.LJJLIL(linkedHashMap);
            } else {
                map2 = null;
            }
            if (interfaceC60761Nsz.getHybridContext().LIZIZ(C40156FpQ.class) == null) {
                if (map != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (((ArrayList) LIZ).contains(entry2.getKey())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    map4 = C113554cx.LJJLIL(linkedHashMap2);
                }
                interfaceC60761Nsz.getHybridContext().LJII(C40156FpQ.class, new C40156FpQ(map4));
            } else {
                Iterator it = ((ArrayList) LIZ).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (map != null && (obj = map.get(next)) != null && (c40156FpQ = (C40156FpQ) interfaceC60761Nsz.getHybridContext().LIZIZ(C40156FpQ.class)) != null && (map3 = c40156FpQ.LIZ) != 0) {
                        map3.put(next, obj);
                    }
                }
            }
            return map2;
        }
        return map;
    }
}
