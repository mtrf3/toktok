package com.benchmark.serializer;

import X.C12380eA;
import com.benchmark.entity.ABMockModel;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class ABMockSerializer implements r<ABMockModel> {
    @Override // com.google.gson.r
    public final j serialize(ABMockModel aBMockModel, Type type, q qVar) {
        return C12380eA.LIZ(aBMockModel, (TreeTypeAdapter.a) qVar);
    }
}
