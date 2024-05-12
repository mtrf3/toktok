package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class MvNetFileBeanDeserializer implements i<MvNetFileBean> {
    @Override // com.google.gson.i
    public final MvNetFileBean deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIZI(LJIIZILJ, "photo_path");
            C1DJ.LJJIIZI(LJIIZILJ, "filePath");
            return (MvNetFileBean) new Gson().LIZJ(LJIIZILJ, MvNetFileBean.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
