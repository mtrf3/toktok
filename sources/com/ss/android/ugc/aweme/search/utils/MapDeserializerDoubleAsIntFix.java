package com.ss.android.ugc.aweme.search.utils;

import X.C35859E5n;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class MapDeserializerDoubleAsIntFix implements i<HashMap<String, Object>> {
    public static final Gson LIZ;
    public static final Type LIZIZ;

    static {
        e eVar = new e();
        Type type = new C35859E5n().getType();
        LIZIZ = type;
        eVar.LIZIZ(new MapDeserializerDoubleAsIntFix(), type);
        LIZ = eVar.LIZ();
    }

    public static Object LIZ(j jVar) {
        jVar.getClass();
        if (jVar instanceof g) {
            ArrayList arrayList = new ArrayList();
            Iterator<j> it = jVar.LJIILLIIL().iterator();
            while (it.hasNext()) {
                arrayList.add(LIZ(it.next()));
            }
            return arrayList;
        }
        if (jVar instanceof m) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, j> entry : jVar.LJIIZILJ().entrySet()) {
                hashMap.put(entry.getKey(), LIZ(entry.getValue()));
            }
            return hashMap;
        }
        if (jVar instanceof p) {
            p LJIJ = jVar.LJIJ();
            Object obj = LJIJ.LJLIL;
            if (obj instanceof Boolean) {
                return Boolean.valueOf(LJIJ.LJFF());
            }
            if (obj instanceof String) {
                return LJIJ.LJJIFFI();
            }
            if (obj instanceof Number) {
                Number LJIL = LJIJ.LJIL();
                if (Math.ceil(LJIL.doubleValue()) == LJIL.longValue()) {
                    return Long.valueOf(LJIL.longValue());
                }
                return Double.valueOf(LJIL.doubleValue());
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.Object>] */
    @Override // com.google.gson.i
    public final HashMap<String, Object> deserialize(j jVar, Type type, h hVar) {
        return LIZ(jVar);
    }
}
