package com.ss.android.ugc.aweme.shortvideo;

import X.C221108m2;
import X.C5H3;
import X.ET0;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftMusicAdapter {
    public static final DraftMusicAdapter INSTANCE = new DraftMusicAdapter();
    public static final C5H3 gson$delegate = C221108m2.LIZIZ(ET0.LJLIL);

    public final Gson getGson() {
        return (Gson) gson$delegate.getValue();
    }

    public final AVMusic transformNewAVMusic(String musicString) {
        o.LJIIIZ(musicString, "musicString");
        Object fromJson = GsonProtectorUtils.fromJson(getGson(), musicString, (Class<Object>) MusicModel.class);
        o.LJIIIIZZ(fromJson, "gson\n            .fromJs…, MusicModel::class.java)");
        MusicModel musicModel = (MusicModel) fromJson;
        if (musicModel.getName() == null && musicModel.getMusicType() == null) {
            Object fromJson2 = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), musicString, (Class<Object>) AVMusic.class);
            o.LJIIIIZZ(fromJson2, "{\n                GsonPr…class.java)\n            }");
            return (AVMusic) fromJson2;
        }
        AVMusic transformMusicModel = AVExternalServiceImpl.LIZ().aVTransformModelService().transformMusicModel(musicModel);
        o.LJI(transformMusicModel);
        return transformMusicModel;
    }
}
