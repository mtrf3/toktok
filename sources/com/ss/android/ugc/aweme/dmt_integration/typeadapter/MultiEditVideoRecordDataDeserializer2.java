package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.H78;
import X.X1D;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class MultiEditVideoRecordDataDeserializer2 implements i<MultiEditVideoRecordData> {
    @Override // com.google.gson.i
    public final MultiEditVideoRecordData deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("new_concat_video");
            if (LJJIJ != null && !(LJJIJ instanceof p)) {
                LJIIZILJ.LJJJ("concat_video");
                LJIIZILJ.LJJII("concat_video", LJJIJ.LJIIZILJ().LJJIJ("path"));
            }
            j LJJIJ2 = LJIIZILJ.LJJIJ("concat_video");
            if (LJJIJ2 != null && !(LJJIJ2 instanceof p)) {
                LJIIZILJ.LJJJ("concat_video");
                LJIIZILJ.LJJII("concat_video", LJJIJ2.LJIIZILJ().LJJIJ("path"));
            }
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LIZIZ(new MultiEditVideoSegmentRecordDataDeserializer2(), MultiEditVideoSegmentRecordData.class);
            return (MultiEditVideoRecordData) eVar.LIZ().LIZJ(LJIIZILJ, MultiEditVideoRecordData.class);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MultiEditVideoRecordDataDeserializer2 error :");
            LIZ.append(e);
            H78.LIZJ(X1D.LIZIZ(LIZ));
            return null;
        }
    }
}
