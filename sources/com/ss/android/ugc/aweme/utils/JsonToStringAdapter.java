package com.ss.android.ugc.aweme.utils;

import X.C65385PlN;
import X.C65403Plf;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.p;
import com.google.gson.j;
import com.google.gson.o;

/* loaded from: classes12.dex */
public class JsonToStringAdapter extends TypeAdapter<String> {
    @Override // com.google.gson.TypeAdapter
    public final String read(C65385PlN c65385PlN) {
        j LIZ = p.LIZ(c65385PlN);
        if (LIZ != null) {
            return LIZ.toString();
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, String str) {
        TypeAdapters.LJJIIJ.write(c65403Plf, GsonProtectorUtils.parse(new o(), str));
    }
}
