package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FPw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38936FPw {
    public static C38931FPr LIZ(FQ1 scopeProviderFactory, F3T contextProviderFactory) {
        o.LJIIJ(scopeProviderFactory, "scopeProviderFactory");
        o.LJIIJ(contextProviderFactory, "contextProviderFactory");
        String name = scopeProviderFactory.getName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FQ1 fq1 : scopeProviderFactory.LIZ().invoke(contextProviderFactory)) {
            linkedHashMap.put(fq1.getName(), LIZ(fq1, contextProviderFactory));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (InterfaceC38217EzF interfaceC38217EzF : scopeProviderFactory.LIZIZ().invoke(contextProviderFactory)) {
            linkedHashMap2.put(interfaceC38217EzF.getName(), interfaceC38217EzF);
        }
        return new C38931FPr(name, linkedHashMap, linkedHashMap2);
    }
}
