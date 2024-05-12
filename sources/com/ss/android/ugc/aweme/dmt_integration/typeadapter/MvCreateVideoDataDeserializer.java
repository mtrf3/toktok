package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import X.C60903NvH;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class MvCreateVideoDataDeserializer implements i<MvCreateVideoData> {
    @Override // com.google.gson.i
    public final MvCreateVideoData deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIJZLJL(LJIIZILJ, "select_media_list");
            C1DJ.LJJIIZ("select_media_list", "new_select_media_list", LJIIZILJ);
            C1DJ.LJJIIJZLJL(LJIIZILJ, "select_src_media_list");
            C1DJ.LJJIIZ("select_src_media_list", "new_select_src_media_list", LJIIZILJ);
            C1DJ.LJJIIJZLJL(LJIIZILJ, "photo_to_save");
            C1DJ.LJJIIZ("photo_to_save", "new_photo_to_save", LJIIZILJ);
            C1DJ.LJJIIZI(LJIIZILJ, "mv_contact_video_path");
            C1DJ.LJJIJ("mv_contact_video_path", "new_mv_contact_video_path", LJIIZILJ);
            return (MvCreateVideoData) C60903NvH.LJIIJJI().LJIIL().LIZJ(LJIIZILJ, MvCreateVideoData.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
