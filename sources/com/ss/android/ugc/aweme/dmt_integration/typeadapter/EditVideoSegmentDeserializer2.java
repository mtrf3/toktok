package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.H78;
import X.X1D;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class EditVideoSegmentDeserializer2 implements i<EditVideoSegment> {
    @Override // com.google.gson.i
    public final EditVideoSegment deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("videoPath");
            if (LJJIJ != null && !(LJJIJ instanceof p)) {
                LJIIZILJ.LJJJ("videoPath");
                LJIIZILJ.LJJII("videoPath", LJJIJ.LJIIZILJ().LJJIJ("path"));
            }
            return (EditVideoSegment) new Gson().LIZJ(LJIIZILJ, EditVideoSegment.class);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditVideoSegmentDeserializer2 error :");
            LIZ.append(e);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            return null;
        }
    }
}
