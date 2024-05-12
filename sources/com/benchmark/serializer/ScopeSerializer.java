package com.benchmark.serializer;

import X.C12380eA;
import com.benchmark.entity.Scope;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class ScopeSerializer implements r<Scope> {
    @Override // com.google.gson.r
    public final j serialize(Scope scope, Type type, q qVar) {
        return C12380eA.LIZ(scope, (TreeTypeAdapter.a) qVar);
    }
}
