package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson;

import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BooleanDefaultFalseAdapter implements r<Boolean>, i<Boolean> {
    @Override // com.google.gson.i
    public final Boolean deserialize(j jVar, Type type, h hVar) {
        if (o.LJ(jVar.LJJIFFI(), "") || o.LJ(jVar.LJJIFFI(), "null")) {
            return Boolean.FALSE;
        }
        if (jVar.LJIL().intValue() == 0 || jVar.LJIILJJIL() == 0) {
            return Boolean.FALSE;
        }
        if (jVar.LJIL().intValue() == 1 || jVar.LJIILJJIL() == 1) {
            return Boolean.TRUE;
        }
        try {
            return Boolean.valueOf(jVar.LJFF());
        } catch (UnsupportedOperationException e) {
            throw new s(e);
        }
    }

    @Override // com.google.gson.r
    public final j serialize(Boolean bool, Type type, q qVar) {
        return new p(bool);
    }
}
