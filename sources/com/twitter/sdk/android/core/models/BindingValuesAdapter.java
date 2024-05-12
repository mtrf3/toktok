package com.twitter.sdk.android.core.models;

import X.C65345Pkj;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public class BindingValuesAdapter implements r<C65345Pkj>, i<C65345Pkj> {
    @Override // com.google.gson.i
    public final C65345Pkj deserialize(j jVar, Type type, h hVar) {
        Object obj;
        if (!(jVar instanceof m)) {
            return new C65345Pkj();
        }
        Set<Map.Entry<String, j>> entrySet = jVar.LJIIZILJ().entrySet();
        HashMap hashMap = new HashMap(32);
        for (Map.Entry<String, j> entry : entrySet) {
            String key = entry.getKey();
            m LJIIZILJ = entry.getValue().LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("type");
            if (LJJIJ != null && (LJJIJ instanceof p)) {
                String LJJIFFI = LJJIJ.LJJIFFI();
                LJJIFFI.getClass();
                switch (LJJIFFI.hashCode()) {
                    case -1838656495:
                        if (LJJIFFI.equals("STRING")) {
                            obj = ((TreeTypeAdapter.a) hVar).LIZ(LJIIZILJ.LJJIJ("string_value"), String.class);
                            break;
                        }
                        break;
                    case 2614219:
                        if (LJJIFFI.equals("USER")) {
                            obj = ((TreeTypeAdapter.a) hVar).LIZ(LJIIZILJ.LJJIJ("user_value"), UserValue.class);
                            break;
                        }
                        break;
                    case 69775675:
                        if (LJJIFFI.equals("IMAGE")) {
                            obj = ((TreeTypeAdapter.a) hVar).LIZ(LJIIZILJ.LJJIJ("image_value"), ImageValue.class);
                            break;
                        }
                        break;
                    case 782694408:
                        if (LJJIFFI.equals("BOOLEAN")) {
                            obj = ((TreeTypeAdapter.a) hVar).LIZ(LJIIZILJ.LJJIJ("boolean_value"), Boolean.class);
                            break;
                        }
                        break;
                }
            }
            obj = null;
            hashMap.put(key, obj);
        }
        return new C65345Pkj(hashMap);
    }

    @Override // com.google.gson.r
    public final /* bridge */ /* synthetic */ j serialize(C65345Pkj c65345Pkj, Type type, q qVar) {
        return null;
    }
}
