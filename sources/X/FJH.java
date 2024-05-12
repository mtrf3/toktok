package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FJH {
    public static void LIZ(m mVar, String str) {
        Collection arrayList;
        Collection arrayList2;
        java.util.Set<Map.Entry<String, j>> entrySet = mVar.entrySet();
        if (entrySet != null) {
            for (Map.Entry<String, j> entry : entrySet) {
                try {
                    j value = entry.getValue();
                    o.LJFF(value, "entry.value");
                    j valueObj = value.LJIIZILJ().LJJIJ("value");
                    j value2 = entry.getValue();
                    o.LJFF(value2, "entry.value");
                    j LJJIJ = value2.LJIIZILJ().LJJIJ("type");
                    o.LJFF(LJJIJ, "entry.value.asJsonObject…ract.Key.CONST_POOL_TYPE)");
                    String LJJIFFI = LJJIJ.LJJIFFI();
                    if (LJJIFFI != null) {
                        int hashCode = LJJIFFI.hashCode();
                        if (hashCode != -891985903) {
                            if (hashCode != 315522569) {
                                if (hashCode == 406856875 && LJJIFFI.equals("string_array")) {
                                    o.LJFF(valueObj, "valueObj");
                                    g LJIILLIIL = valueObj.LJIILLIIL();
                                    if (LJIILLIIL.size() > 32) {
                                        arrayList2 = new TreeSet();
                                    } else {
                                        arrayList2 = new ArrayList();
                                    }
                                    Iterator<j> it = LJIILLIIL.iterator();
                                    while (it.hasNext()) {
                                        j it2 = it.next();
                                        o.LJFF(it2, "it");
                                        String LJJIFFI2 = it2.LJJIFFI();
                                        o.LJFF(LJJIFFI2, "it.asString");
                                        arrayList2.add(LJJIFFI2);
                                    }
                                    String key = entry.getKey();
                                    o.LJFF(key, "entry.key");
                                    FJI.LIZJ(str, new FJJ(Collection.class, key, arrayList2));
                                }
                            } else if (LJJIFFI.equals("int_array")) {
                                o.LJFF(valueObj, "valueObj");
                                g LJIILLIIL2 = valueObj.LJIILLIIL();
                                if (LJIILLIIL2.size() > 32) {
                                    arrayList = new TreeSet();
                                } else {
                                    arrayList = new ArrayList();
                                }
                                Iterator<j> it3 = LJIILLIIL2.iterator();
                                while (it3.hasNext()) {
                                    j it4 = it3.next();
                                    o.LJFF(it4, "it");
                                    arrayList.add(Integer.valueOf(it4.LJIILJJIL()));
                                }
                                String key2 = entry.getKey();
                                o.LJFF(key2, "entry.key");
                                FJI.LIZJ(str, new FJJ(Collection.class, key2, arrayList));
                            }
                        } else if (LJJIFFI.equals("string")) {
                            String key3 = entry.getKey();
                            o.LJFF(key3, "entry.key");
                            o.LJFF(valueObj, "valueObj");
                            String LJJIFFI3 = valueObj.LJJIFFI();
                            o.LJFF(LJJIFFI3, "valueObj.asString");
                            FJI.LIZJ(str, new FJJ(String.class, key3, LJJIFFI3));
                        }
                    }
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        }
    }
}
