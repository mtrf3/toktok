package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.H78;
import X.X1D;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class ImportVideoInfoDeserializer2 implements i<ImportVideoInfo> {
    @Override // com.google.gson.i
    public final ImportVideoInfo deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("e");
            if (LJJIJ != null && !(LJJIJ instanceof p)) {
                LJIIZILJ.LJJJ("e");
                LJIIZILJ.LJJII("e", LJJIJ.LJIIZILJ().LJJIJ("path"));
            }
            return (ImportVideoInfo) new Gson().LIZJ(LJIIZILJ, ImportVideoInfo.class);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImportVideoInfoDeserializer2 error :");
            LIZ.append(e);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            return null;
        }
    }
}
