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
public final class IntegerDefaultZeroAdater implements r<Integer>, i<Integer> {
    @Override // com.google.gson.i
    public final Integer deserialize(j jVar, Type type, h hVar) {
        try {
            if (o.LJ(jVar.LJJIFFI(), "") || o.LJ(jVar.LJJIFFI(), "null")) {
                return 0;
            }
        } catch (Exception unused) {
        }
        try {
            return Integer.valueOf(jVar.LJIILJJIL());
        } catch (NumberFormatException e) {
            throw new s(e);
        }
    }

    @Override // com.google.gson.r
    public final j serialize(Integer num, Type type, q qVar) {
        return new p((Number) num);
    }
}
