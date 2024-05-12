package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import X.C60903NvH;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.mvtheme.MvSourceItemInfo;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class MvSourceItemInfoDeserializer implements i<MvSourceItemInfo> {
    @Override // com.google.gson.i
    public final MvSourceItemInfo deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIZI(LJIIZILJ, "photo_path");
            C1DJ.LJJIIZI(LJIIZILJ, "source");
            C1DJ.LJJIIZI(LJIIZILJ, "origin_file_path");
            return (MvSourceItemInfo) C60903NvH.LJIIJJI().LJIIL().LIZJ(LJIIZILJ, MvSourceItemInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
