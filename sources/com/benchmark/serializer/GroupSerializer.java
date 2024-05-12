package com.benchmark.serializer;

import X.C12380eA;
import com.benchmark.entity.Group;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class GroupSerializer implements r<Group> {
    @Override // com.google.gson.r
    public final j serialize(Group group, Type type, q qVar) {
        return C12380eA.LIZ(group, (TreeTypeAdapter.a) qVar);
    }
}
