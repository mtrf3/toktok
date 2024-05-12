package com.ss.android.ugc.aweme.creative.model.json.adapter;

import X.C58020Mps;
import X.C65409Pll;
import X.EF7;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ThirdPartyModelDefaultTypeAdapter<T> implements i<T>, r<T> {
    @Override // com.google.gson.i
    public final T deserialize(j jVar, Type type, h hVar) {
        try {
            Object value = C65409Pll.LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-thirdPartyModelGson>(...)");
            return (T) ((Gson) value).LIZLLL(jVar.LJIIZILJ(), type);
        } catch (Exception e) {
            if (!o.LJ(EF7.LJIILIIL, "local_test")) {
                C58020Mps.LIZ.LIZ(e);
                return null;
            }
            throw e;
        }
    }

    @Override // com.google.gson.r
    public final j serialize(T t, Type type, q qVar) {
        try {
            Object value = C65409Pll.LIZIZ.getValue();
            o.LJIIIIZZ(value, "<get-thirdPartyModelGson>(...)");
            return ((Gson) value).LJIJJLI(t);
        } catch (Exception e) {
            if (!o.LJ(EF7.LJIILIIL, "local_test")) {
                C58020Mps.LIZ.LIZ(e);
                return null;
            }
            throw e;
        }
    }
}
