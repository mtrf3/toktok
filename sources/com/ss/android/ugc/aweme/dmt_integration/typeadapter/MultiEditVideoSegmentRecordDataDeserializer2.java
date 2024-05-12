package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.H78;
import X.X1D;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class MultiEditVideoSegmentRecordDataDeserializer2 implements i<MultiEditVideoSegmentRecordData> {
    @Override // com.google.gson.i
    public final MultiEditVideoSegmentRecordData deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            j LJJIJ = LJIIZILJ.LJJIJ("video_path");
            if (LJJIJ != null && !(LJJIJ instanceof p)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MultiEditVideoSegmentRecordDataDeserializer2 video_path : ");
                LIZ.append(LJJIJ.LJIIZILJ().LJJIJ("path"));
                H78.LIZ(X1D.LIZIZ(LIZ));
                LJIIZILJ.LJJJ("video_path");
                LJIIZILJ.LJJII("video_path", LJJIJ.LJIIZILJ().LJJIJ("path"));
            }
            j LJJIJ2 = LJIIZILJ.LJJIJ("new_video_path");
            if (LJJIJ2 != null && !(LJJIJ2 instanceof p)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("MultiEditVideoSegmentRecordDataDeserializer2 new_video_path : ");
                LIZ2.append(LJJIJ2.LJIIZILJ().LJJIJ("path"));
                H78.LIZ(X1D.LIZIZ(LIZ2));
                LJIIZILJ.LJJJ("video_path");
                LJIIZILJ.LJJII("video_path", LJJIJ2.LJIIZILJ().LJJIJ("path"));
            }
            j LJJIJ3 = LJIIZILJ.LJJIJ("draft_video_path");
            if (LJJIJ3 != null && !(LJJIJ3 instanceof p)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("MultiEditVideoSegmentRecordDataDeserializer2 draft_video_path : ");
                LIZ3.append(LJJIJ3.LJIIZILJ().LJJIJ("path"));
                H78.LIZ(X1D.LIZIZ(LIZ3));
                LJIIZILJ.LJJJ("draft_video_path");
                LJIIZILJ.LJJII("draft_video_path", LJJIJ3.LJIIZILJ().LJJIJ("path"));
            }
            j LJJIJ4 = LJIIZILJ.LJJIJ("new_draft_video_path");
            if (LJJIJ4 != null && !(LJJIJ4 instanceof p)) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("MultiEditVideoSegmentRecordDataDeserializer2 new_draft_video_path : ");
                LIZ4.append(LJJIJ4.LJIIZILJ().LJJIJ("path"));
                H78.LIZ(X1D.LIZIZ(LIZ4));
                LJIIZILJ.LJJJ("draft_video_path");
                LJIIZILJ.LJJII("draft_video_path", LJJIJ4.LJIIZILJ().LJJIJ("path"));
            }
            return (MultiEditVideoSegmentRecordData) new Gson().LIZJ(LJIIZILJ, MultiEditVideoSegmentRecordData.class);
        } catch (Exception e) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("MultiEditVideoSegmentRecordDataDeserializer2 error :");
            LIZ5.append(e);
            H78.LIZJ(X1D.LIZIZ(LIZ5));
            return null;
        }
    }
}
