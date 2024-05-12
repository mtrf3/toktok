package com.google.gson.internal.bind;

import X.InterfaceC65404Plg;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.e;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;

/* loaded from: classes12.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements u {
    public final e LJLIL;

    public JsonAdapterAnnotationTypeAdapterFactory(e eVar) {
        this.LJLIL = eVar;
    }

    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        InterfaceC65404Plg interfaceC65404Plg = (InterfaceC65404Plg) typeToken.getRawType().getAnnotation(InterfaceC65404Plg.class);
        if (interfaceC65404Plg == null) {
            return null;
        }
        return LIZ(this.LJLIL, gson, typeToken, interfaceC65404Plg);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.TypeAdapter LIZ(com.google.gson.internal.e r6, com.google.gson.Gson r7, com.google.gson.reflect.TypeToken r8, X.InterfaceC65404Plg r9) {
        /*
            java.lang.Class r0 = r9.value()
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.internal.n r0 = r6.LIZ(r0)
            java.lang.Object r3 = r0.LJI()
            boolean r0 = r3 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L23
            com.google.gson.TypeAdapter r3 = (com.google.gson.TypeAdapter) r3
        L16:
            if (r3 == 0) goto L22
        L18:
            boolean r0 = r9.nullSafe()
            if (r0 == 0) goto L22
            com.google.gson.TypeAdapter r3 = r3.nullSafe()
        L22:
            return r3
        L23:
            boolean r0 = r3 instanceof com.google.gson.u
            r6 = r7
            r7 = r8
            if (r0 == 0) goto L30
            com.google.gson.u r3 = (com.google.gson.u) r3
            com.google.gson.TypeAdapter r3 = r3.create(r6, r7)
            goto L16
        L30:
            boolean r1 = r3 instanceof com.google.gson.r
            if (r1 != 0) goto L38
            boolean r0 = r3 instanceof com.google.gson.i
            if (r0 == 0) goto L4e
        L38:
            r5 = 0
            if (r1 == 0) goto L4c
            r4 = r3
            com.google.gson.r r4 = (com.google.gson.r) r4
        L3e:
            boolean r0 = r3 instanceof com.google.gson.i
            if (r0 == 0) goto L45
            r5 = r3
            com.google.gson.i r5 = (com.google.gson.i) r5
        L45:
            com.google.gson.internal.bind.TreeTypeAdapter r3 = new com.google.gson.internal.bind.TreeTypeAdapter
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L18
        L4c:
            r4 = r5
            goto L3e
        L4e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r1.append(r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = " as a @JsonAdapter for "
            r1.append(r0)
            java.lang.String r0 = r7.toString()
            r1.append(r0)
            java.lang.String r0 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.LIZ(com.google.gson.internal.e, com.google.gson.Gson, com.google.gson.reflect.TypeToken, X.Plg):com.google.gson.TypeAdapter");
    }
}
