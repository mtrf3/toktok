package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class MultiEditVideoSegmentRecordDataDeserializer implements i<MultiEditVideoSegmentRecordData> {
    @Override // com.google.gson.i
    public final MultiEditVideoSegmentRecordData deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIZI(LJIIZILJ, "video_path");
            C1DJ.LJJIJ("video_path", "new_video_path", LJIIZILJ);
            C1DJ.LJJIIZI(LJIIZILJ, "draft_video_path");
            C1DJ.LJJIJ("draft_video_path", "new_draft_video_path", LJIIZILJ);
            return (MultiEditVideoSegmentRecordData) new Gson().LIZJ(LJIIZILJ, MultiEditVideoSegmentRecordData.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
