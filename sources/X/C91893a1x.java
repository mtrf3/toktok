package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.a1x, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91893a1x {
    public static Request LIZ(Request request, java.util.Map map) {
        PVP requestBody = request.getRequestBody();
        o.LJII(requestBody, "null cannot be cast to non-null type okhttp3.FormBody");
        C64550PVa c64550PVa = (C64550PVa) requestBody;
        C64629PYb c64629PYb = new C64629PYb();
        int size = c64550PVa.LIZ.size();
        for (int i = 0; i < size; i++) {
            c64629PYb.LIZIZ(c64550PVa.LJFF(i), (String) ListProtector.get(c64550PVa.LIZIZ, i));
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c64629PYb.LIZ((String) entry.getKey(), (String) entry.getValue());
        }
        C64550PVa c64550PVa2 = new C64550PVa(c64629PYb.LIZ, c64629PYb.LIZIZ);
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZIZ("POST", new PVR(c64550PVa2));
        return newBuilder.LIZ();
    }

    public static Request LIZIZ(Request request, java.util.Map map) {
        C64626PXy LJIIJJI = C64626PXy.LJIIJJI(request.getUrl());
        if (LJIIJJI != null) {
            java.util.Set<String> LJIILLIIL = LJIIJJI.LJIILLIIL();
            C64627PXz LJIIJ = LJIIJJI.LJIIJ();
            for (String str : LJIILLIIL) {
                Iterator<String> it = LJIIJJI.LJIIZILJ(str).iterator();
                while (it.hasNext()) {
                    LJIIJ.LIZIZ(str, it.next());
                }
            }
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                LJIIJ.LIZIZ((String) entry.getKey(), (String) entry.getValue());
            }
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(LJIIJ.LIZJ().LJIIIIZZ);
            return newBuilder.LIZ();
        }
        return request;
    }

    public static Request LIZJ(Request request, java.util.Map map) {
        C64908Pdg newBuilder = request.newBuilder();
        ArrayList arrayList = new ArrayList();
        if (request.getHeaders() != null) {
            o.LJIIIIZZ(request.getHeaders(), "request.headers");
            if (!r1.isEmpty()) {
                request.getHeaders();
                arrayList.addAll(request.getHeaders());
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
        }
        newBuilder.LIZJ = arrayList;
        return newBuilder.LIZ();
    }
}
