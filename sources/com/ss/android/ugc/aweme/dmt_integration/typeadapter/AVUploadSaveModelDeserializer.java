package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import X.C60903NvH;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class AVUploadSaveModelDeserializer implements i<AVUploadSaveModel> {
    @Override // com.google.gson.i
    public final AVUploadSaveModel deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIZI(LJIIZILJ, "local_final_path");
            return (AVUploadSaveModel) C60903NvH.LJIIJJI().LJIIL().LIZJ(LJIIZILJ, AVUploadSaveModel.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
