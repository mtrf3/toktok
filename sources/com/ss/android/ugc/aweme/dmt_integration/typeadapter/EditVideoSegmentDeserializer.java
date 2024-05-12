package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C60903NvH;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class EditVideoSegmentDeserializer implements i<EditVideoSegment> {
    @Override // com.google.gson.i
    public final EditVideoSegment deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("videoPath");
            if (LJJIJ != null && !(LJJIJ instanceof p)) {
                LJIIZILJ.LJJJ("videoPath");
                LJIIZILJ.LJJII("videoPath", LJJIJ.LJIIZILJ().LJJIJ("path"));
            }
            return (EditVideoSegment) C60903NvH.LJIIJJI().LJIIL().LIZJ(LJIIZILJ, EditVideoSegment.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
