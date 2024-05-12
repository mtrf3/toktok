package com.benchmark.serializer;

import X.C12380eA;
import com.benchmark.entity.Language;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class LanguageSerializer implements r<Language> {
    @Override // com.google.gson.r
    public final j serialize(Language language, Type type, q qVar) {
        return C12380eA.LIZ(language, (TreeTypeAdapter.a) qVar);
    }
}
