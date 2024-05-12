package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import X.C60903NvH;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class MultiEditVideoRecordDataDeserializer implements i<MultiEditVideoRecordData> {
    @Override // com.google.gson.i
    public final MultiEditVideoRecordData deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIZI(LJIIZILJ, "concat_video");
            C1DJ.LJJIJ("concat_video", "new_concat_video", LJIIZILJ);
            return (MultiEditVideoRecordData) C60903NvH.LJIIJJI().LJIIL().LIZJ(LJIIZILJ, MultiEditVideoRecordData.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
