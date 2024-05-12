package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class EditPreviewInfoDeserializer implements i<EditPreviewInfo> {
    @Override // com.google.gson.i
    public final EditPreviewInfo deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIJZLJL(LJIIZILJ, "reverseVideoArray");
            C1DJ.LJJIIJZLJL(LJIIZILJ, "tempVideoArray");
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LIZIZ(new EditVideoSegmentDeserializer(), EditVideoSegment.class);
            return (EditPreviewInfo) eVar.LIZ().LIZJ(LJIIZILJ, EditPreviewInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
