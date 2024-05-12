package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C1DJ;
import X.C60903NvH;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class BackgroundVideoDeserializer implements i<BackgroundVideo> {
    @Override // com.google.gson.i
    public final BackgroundVideo deserialize(j jVar, Type type, h hVar) {
        try {
            m LJIIZILJ = jVar.LJIIZILJ();
            C1DJ.LJJIIZI(LJIIZILJ, "videoPath");
            return (BackgroundVideo) C60903NvH.LJIIJJI().LJIIL().LIZJ(LJIIZILJ, BackgroundVideo.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
