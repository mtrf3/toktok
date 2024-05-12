package com.bytedance.assem.arch.dynamic;

import X.C113554cx;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import X.OSZ;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class DynamicAssemConfigTypeAdapter implements r<InterfaceC65350Pko<? extends DynamicAssem>>, i<InterfaceC65350Pko<? extends DynamicAssem>> {
    public static final Map<String, InterfaceC65350Pko<? extends DynamicAssem>> LIZ = C113554cx.LJJLIIIIJ(new OSZ("com.bytedance.assem.arch.dynamic.DynamicAssem", C65352Pkq.LIZ(DynamicAssem.class)));

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Pko<? extends com.bytedance.assem.arch.dynamic.DynamicAssem>] */
    @Override // com.google.gson.i
    public final InterfaceC65350Pko<? extends DynamicAssem> deserialize(j jVar, Type type, h jsonSerializationContext) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(jsonSerializationContext, "jsonSerializationContext");
        ?? r0 = ((LinkedHashMap) LIZ).get(jVar.LJJIFFI());
        o.LJI(r0);
        return r0;
    }

    @Override // com.google.gson.r
    public final j serialize(InterfaceC65350Pko<? extends DynamicAssem> interfaceC65350Pko, Type type, q jsonSerializationContext) {
        InterfaceC65350Pko<? extends DynamicAssem> obj = interfaceC65350Pko;
        o.LJIIIZ(obj, "obj");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(jsonSerializationContext, "jsonSerializationContext");
        return new p(obj.LIZLLL());
    }
}
